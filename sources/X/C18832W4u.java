package X;

import android.app.Dialog;
import android.content.DialogInterface;

/* renamed from: X.W4u  reason: case insensitive filesystem */
public final class C18832W4u implements DialogInterface.OnClickListener {
    public final /* synthetic */ C45417Cvx A00;
    public final /* synthetic */ AnonymousClass3GD A01;

    public C18832W4u(C45417Cvx cvx, AnonymousClass3GD r2) {
        this.A01 = r2;
        this.A00 = cvx;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass3GD r4 = this.A01;
        int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        VC5.A00(r4.A0B, this.A00, r4.A0D, true);
        Dialog dialog = r4.A01;
        if (dialog != null) {
            AnonymousClass0fN.A00(dialog);
        }
        Dialog dialog2 = r4.A02;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }
}
