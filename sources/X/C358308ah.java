package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;

/* renamed from: X.8ah  reason: invalid class name and case insensitive filesystem */
public final class C358308ah implements View.OnClickListener {
    public final /* synthetic */ C358248ab A00;

    public C358308ah(C358248ab r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-786174274);
        C358248ab r0 = this.A00;
        DialogInterface.OnClickListener onClickListener = r0.A01;
        if (onClickListener != null) {
            Dialog dialog = r0.A0P;
            onClickListener.onClick(dialog, -3);
            dialog.dismiss();
        }
        AnonymousClass0fD.A0C(452151057, A05);
    }
}
