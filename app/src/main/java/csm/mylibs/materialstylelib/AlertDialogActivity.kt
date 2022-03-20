package csm.mylibs.materialstylelib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import csm.mylibs.stylelib.extensions.showSimpleAlertDialog
import csm.mylibs.stylelib.extensions.showSimpleAlertDialogWithThreeButtons
import csm.mylibs.stylelib.extensions.showSubmissionAlertDialog
import kotlinx.android.synthetic.main.activity_alert_dialog.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        simpleAlertDialog1.setOnClickListener {
           showSimpleAlertDialogWithThreeButtons("Alert","Displaying Simple AlertDialog with Three Buttons",
           neutralActionButtonTitle = R.string.neutral_btn,
               positiveActionButtonTitle = R.string.positive_btn,
               negativeActionButtonTitle = R.string.negative_btn,
           positiveAction = {printToast("Positive Click")},
           negativeAction = {printToast("NegativeClick")},
           neutralAction = {}
           ) {}
        }

        formDialog.setOnClickListener {
            showSubmissionAlertDialog("Alert","Displaying Simple AlertDialog with Two Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons",
            neutralActionButtonTitle = R.string.neutral_btn,
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = {printToast("Positive Click")},
                neutralAction = {printToast("NegativeClick")}

                ){}
        }

        simple_alert_dialog.setOnClickListener {
            showSimpleAlertDialog("Alert","Displaying Simple AlertDialog with Two Buttons ",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = {printToast("Positive Click")},
                negativeActionButtonTitle = R.string.negative_btn,
                negativeAction = {printToast("NegativeClick")}
            ){}
        }
    }

    private fun printToast(message:String){
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }
}