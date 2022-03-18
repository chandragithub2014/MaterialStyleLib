package csm.mylibs.materialstylelib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.home_layout.*

class MainActivity : AppCompatActivity() , StyleClickListener{
    val styleTypes : List<StyleInfo> = listOf(StyleInfo("TextStyle"),StyleInfo("ButtonStyles"),StyleInfo("EditTextStyles"),StyleInfo("CardLayoutStyle"),
        StyleInfo("AlertDialogs")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_layout)
        populateAdapter()
    }
    private fun populateAdapter(){
        val styleInfoAdapter = StyleInfoAdapter(styleTypes.toMutableList(),this)
        style_lib_info_list.layoutManager = LinearLayoutManager(this)
        style_lib_info_list.adapter = styleInfoAdapter

    }

    override fun onItemClick(clickedItem: String) {
      when(clickedItem){
          "TextStyle" -> {
              startActivity(Intent(this,TextStyleActivity::class.java))
          }
          "ButtonStyles"->{
              startActivity(Intent(this,ButtonStyleActivity::class.java))
          }
          "EditTextStyles" ->{
              startActivity(Intent(this,TextFieldActivity::class.java))
          }
          "AlertDialogs" ->{
              startActivity(Intent(this,AlertDialogActivity::class.java))
          }
      }
    }
}