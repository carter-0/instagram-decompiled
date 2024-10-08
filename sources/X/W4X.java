package X;

import android.content.DialogInterface;

public final class W4X implements DialogInterface.OnCancelListener {
    public final /* synthetic */ C45417Cvx A00;
    public final /* synthetic */ AnonymousClass3GD A01;

    public W4X(C45417Cvx cvx, AnonymousClass3GD r2) {
        this.A01 = r2;
        this.A00 = cvx;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        AnonymousClass3GD r1 = this.A01;
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        VC5.A00(r1.A0B, this.A00, r1.A0D, false);
    }
}
