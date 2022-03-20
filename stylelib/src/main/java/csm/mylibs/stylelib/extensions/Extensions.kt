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
    neutralAction:  () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
){
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
    neutralAction:  () -> Unit,
    positiveAction: () -> Unit,
    dismissAction: () -> Unit
){
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

fun Fragment.showSimpleAlertDialog(title: String,
                                   message: String,
                                   @StringRes negativeActionButtonTitle: Int,
                                   @StringRes positiveActionButtonTitle: Int,
                                   negativeAction: () -> Unit,
                                   positiveAction: () -> Unit,
                                   dismissAction: () -> Unit): AlertDialog {
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
fun Activity.showSimpleAlertDialog(title: String,
                                   message: String,
                                   @StringRes negativeActionButtonTitle: Int,
                                   @StringRes positiveActionButtonTitle: Int,
                                   negativeAction: () -> Unit,
                                   positiveAction: () -> Unit,
                                   dismissAction: () -> Unit): AlertDialog {
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