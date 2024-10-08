package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

public final class QC6 extends 0SM {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    public final Dialog A0F(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        this.A07 = false;
        Dialog dialog2 = this.A02;
        if (dialog2 != null) {
            return dialog2;
        }
        Context context = getContext();
        AnonymousClass3Qk.A02(context);
        AlertDialog create = new AlertDialog.Builder(context).create();
        this.A02 = create;
        return create;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
