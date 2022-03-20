package csm.mylibs.materialstylelib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import csm.mylibs.stylelib.extensions.*
import kotlinx.android.synthetic.main.activity_alert_dialog.*

class AlertDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert_dialog)
        simpleAlertDialog1.setOnClickListener {
            showSimpleAlertDialogWithThreeButtons("Alert",
                "Displaying Simple AlertDialog with Three Buttons",
                neutralActionButtonTitle = R.string.neutral_btn,
                positiveActionButtonTitle = R.string.positive_btn,
                negativeActionButtonTitle = R.string.negative_btn,
                positiveAction = { printToast("Positive Click") },
                negativeAction = { printToast("NegativeClick") },
                neutralAction = {}
            ) {}
        }

        formDialog.setOnClickListener {
            showSubmissionAlertDialog("Alert",
                "Displaying Simple AlertDialog with Two Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons Displaying Simple AlertDialog with Three Buttons",
                neutralActionButtonTitle = R.string.neutral_btn,
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") },
                neutralAction = { printToast("NegativeClick") }

            ) {}
        }

        simple_alert_dialog.setOnClickListener {
            showSimpleAlertDialog("Alert", "Displaying Simple AlertDialog with Two Buttons ",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") },
                negativeActionButtonTitle = R.string.negative_btn,
                negativeAction = { printToast("NegativeClick") }
            ) {}
        }
        container_two_button_alert_dialog.setOnClickListener {
            showContainedAlertDialogWithTwoButtons("Alert",
                "Displaying AlertDialog with Two Contained Buttons",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") },
                negativeActionButtonTitle = R.string.negative_btn,
                negativeAction = { printToast("NegativeClick") }
            ) {}
        }
        outlined_two_btn_alert.setOnClickListener {
            showOutlinedAlertDialogWithTwoButtons("Alert",
                "Displaying AlertDialog with Two Contained Buttons",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") },
                negativeActionButtonTitle = R.string.negative_btn,
                negativeAction = { printToast("NegativeClick") }
            ) {}
        }
        single_btn_outlined_alert.setOnClickListener {
            showOutlinedAlertDialogWithSingleButton("Alert",
                "Displaying AlertDialog with Single Outlined Button",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") }) {}
        }
        contained_single_alert.setOnClickListener {
            showContainedAlertDialogWithSingleButton("Alert",
                "Displaying AlertDialog with Single Contained Button",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") }) {}
        }
        alert_dialog_mix1.setOnClickListener {
            showPositiveButtonOutlinedAlertDialog("Alert",
                "Displaying PositiveButton Outlined AlertDialog",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") },
                negativeActionButtonTitle = R.string.negative_btn,
                negativeAction = { printToast("NegativeClick") }
            ) {}


        }
        alert_mix_type_2.setOnClickListener {
            showPositiveButtonContainedAlertDialog("Alert",
                "Displaying PositiveButton Contained AlertDialog",
                positiveActionButtonTitle = R.string.positive_btn,
                positiveAction = { printToast("Positive Click") },
                negativeActionButtonTitle = R.string.negative_btn,
                negativeAction = { printToast("NegativeClick") }
            ) {}
        }
    }

    private fun printToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}