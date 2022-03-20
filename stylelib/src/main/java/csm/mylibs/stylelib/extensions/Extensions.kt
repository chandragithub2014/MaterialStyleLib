package csm.mylibs.stylelib.extensions

import android.app.Activity
import androidx.annotation.StringRes
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import csm.mylibs.stylelib.R

fun Fragment.showSimpleAlertDialogWithThreeButtons(
    title: String,
    message: String,
    @StringRes neutralActionButtonTitle: Int,
    @StringRes negativeActionButtonTitle: Int,
    @StringRes positiveActionButtonTitle: Int,
    neutralAction: () -> Unit,
    negativeAction: () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
): AlertDialog {
    return MaterialAlertDialogBuilder(requireContext())
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }
        .setNeutralButton(neutralActionButtonTitle) { dialog, _ ->
            neutralAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()
}

fun Fragment.showSubmissionAlertDialog(
    title: String,
    message: String,
    @StringRes neutralActionButtonTitle: Int,
    @StringRes positiveActionButtonTitle: Int,
    neutralAction: () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
) {
    MaterialAlertDialogBuilder(requireContext())
        .setTitle(title)
        .setMessage(message)
        .setNeutralButton(neutralActionButtonTitle) { dialog, _ ->
            neutralAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()
}

fun Activity.showSubmissionAlertDialog(
    title: String,
    message: String,
    @StringRes neutralActionButtonTitle: Int,
    @StringRes positiveActionButtonTitle: Int,
    neutralAction: () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
) {
    MaterialAlertDialogBuilder(this)
        .setTitle(title)
        .setMessage(message)
        .setNeutralButton(neutralActionButtonTitle) { dialog, _ ->
            neutralAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()
}

fun Activity.showSimpleAlertDialogWithThreeButtons(
    title: String,
    message: String,
    @StringRes neutralActionButtonTitle: Int,
    @StringRes negativeActionButtonTitle: Int,
    @StringRes positiveActionButtonTitle: Int,
    neutralAction: () -> Unit,
    negativeAction: () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
): AlertDialog {
    return MaterialAlertDialogBuilder(this)
        .setTitle(title)
        .setMessage(message)
        .setNeutralButton(neutralActionButtonTitle) { dialog, _ ->
            neutralAction.invoke()
            dialog.dismiss()
        }
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()
}

fun Fragment.showSimpleAlertDialog(
    title: String,
    message: String,
    @StringRes negativeActionButtonTitle: Int,
    @StringRes positiveActionButtonTitle: Int,
    negativeAction: () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
): AlertDialog {
    return MaterialAlertDialogBuilder(requireContext())
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()

}

fun Activity.showSimpleAlertDialog(
    title: String,
    message: String,
    @StringRes negativeActionButtonTitle: Int,
    @StringRes positiveActionButtonTitle: Int,
    negativeAction: () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
): AlertDialog {
    return MaterialAlertDialogBuilder(this)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()

}

fun Fragment.showContainedAlertDialogWithTwoButtons(title: String,
                                           message: String,
                                           @StringRes negativeActionButtonTitle: Int,
                                           @StringRes positiveActionButtonTitle: Int,
                                           negativeAction: () -> Unit,
                                           positiveAction: () -> Unit,
                                           dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(requireContext(),R.style.StyleLibAlertDialogContainedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
fun Activity.showContainedAlertDialogWithTwoButtons(title: String,
                                                    message: String,
                                                    @StringRes negativeActionButtonTitle: Int,
                                                    @StringRes positiveActionButtonTitle: Int,
                                                    negativeAction: () -> Unit,
                                                    positiveAction: () -> Unit,
                                                    dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(this,R.style.StyleLibAlertDialogContainedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
//Outlined Alert Dialog
fun Fragment.showOutlinedAlertDialogWithTwoButtons(title: String,
                                                    message: String,
                                                    @StringRes negativeActionButtonTitle: Int,
                                                    @StringRes positiveActionButtonTitle: Int,
                                                    negativeAction: () -> Unit,
                                                    positiveAction: () -> Unit,
                                                    dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(requireContext(),R.style.StyleLibAlertDialogOutlinedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
fun Activity.showOutlinedAlertDialogWithTwoButtons(title: String,
                                                    message: String,
                                                    @StringRes negativeActionButtonTitle: Int,
                                                    @StringRes positiveActionButtonTitle: Int,
                                                    negativeAction: () -> Unit,
                                                    positiveAction: () -> Unit,
                                                    dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(this,R.style.StyleLibAlertDialogOutlinedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
//Single Button Styled Alert Dialog
fun Fragment.showOutlinedAlertDialogWithSingleButton(title: String,
                                                   message: String,
                                                   @StringRes positiveActionButtonTitle: Int,
                                                   positiveAction: () -> Unit,
                                                   dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(requireContext(),R.style.StyleLibAlertDialogSingleOutlinedButton)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
fun Activity.showOutlinedAlertDialogWithSingleButton(title: String,
                                                   message: String,
                                                     @StringRes positiveActionButtonTitle: Int,
                                                     positiveAction: () -> Unit,
                                                     dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(this,R.style.StyleLibAlertDialogSingleOutlinedButton)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}

//Single ContainedAlert Dialog
fun Fragment.showContainedAlertDialogWithSingleButton(title: String,
                                                     message: String,
                                                     @StringRes positiveActionButtonTitle: Int,
                                                     positiveAction: () -> Unit,
                                                     dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(requireContext(),R.style.StyleLibAlertDialogSingleContainedButton)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
fun Activity.showContainedAlertDialogWithSingleButton(title: String,
                                                     message: String,
                                                     @StringRes positiveActionButtonTitle: Int,
                                                     positiveAction: () -> Unit,
                                                     dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(this,R.style.StyleLibAlertDialogSingleContainedButton)
        .setTitle(title)
        .setMessage(message)
        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}

//AlertMixType1

fun Fragment.showPositiveButtonOutlinedAlertDialog(title: String,
                                                   message: String,
                                                   @StringRes negativeActionButtonTitle: Int,
                                                   @StringRes positiveActionButtonTitle: Int,
                                                   negativeAction: () -> Unit,
                                                   positiveAction: () -> Unit,
                                                   dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(requireContext(),R.style.StyleLibAlertDialogPositiveOutlinedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
fun Activity.showPositiveButtonOutlinedAlertDialog(title: String,
                                                   message: String,
                                                   @StringRes negativeActionButtonTitle: Int,
                                                   @StringRes positiveActionButtonTitle: Int,
                                                   negativeAction: () -> Unit,
                                                   positiveAction: () -> Unit,
                                                   dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(this,R.style.StyleLibAlertDialogPositiveOutlinedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}

//AlertMixType2
fun Fragment.showPositiveButtonContainedAlertDialog(title: String,
                                                   message: String,
                                                   @StringRes negativeActionButtonTitle: Int,
                                                   @StringRes positiveActionButtonTitle: Int,
                                                   negativeAction: () -> Unit,
                                                   positiveAction: () -> Unit,
                                                   dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(requireContext(),R.style.StyleLibAlertDialogPositiveContainedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}
fun Activity.showPositiveButtonContainedAlertDialog(title: String,
                                                   message: String,
                                                   @StringRes negativeActionButtonTitle: Int,
                                                   @StringRes positiveActionButtonTitle: Int,
                                                   negativeAction: () -> Unit,
                                                   positiveAction: () -> Unit,
                                                   dismissAction: () -> Unit): AlertDialog {

    return MaterialAlertDialogBuilder(this,R.style.StyleLibAlertDialogPositiveContainedTwoButton)
        .setTitle(title)
        .setMessage(message)
        .setNegativeButton(negativeActionButtonTitle) { dialog, _ ->
            negativeAction.invoke()
            dialog.dismiss()
        }

        .setPositiveButton(positiveActionButtonTitle) { dialog, _ ->
            positiveAction.invoke()
            dialog.dismiss()
        }
        .setOnDismissListener { dismissAction.invoke() }
        .setCancelable(false)
        .show()


}