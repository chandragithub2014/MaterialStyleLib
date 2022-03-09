package csm.mylibs.materialstylelib

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class StyleInfoAdapter(private var styleInfoList:MutableList<StyleInfo>,private var styleClickListener: StyleClickListener) : RecyclerView.Adapter<StyleInfoAdapter.StyleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StyleViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.info_card_item, parent, false)

        return StyleViewHolder(view)
    }

    override fun onBindViewHolder(holder: StyleViewHolder, position: Int) {
        holder.infoItem.text = styleInfoList[position].styleType
        holder.container.tag = holder.infoItem.text.toString()
        holder.container.setOnClickListener {
            styleClickListener.onItemClick(holder.container.tag as String)
        }

    }

    override fun getItemCount(): Int  = styleInfoList.size


class StyleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    val infoItem :TextView = itemView.findViewById(R.id.style_item)
    val container: CardView = itemView.findViewById(R.id.style_item_container)
}
}