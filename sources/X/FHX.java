package X;

import android.content.DialogInterface;
import android.net.Uri;
import android.widget.CompoundButton;

public final class FHX implements DialogInterface.OnCancelListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public FHX(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.A00) {
            case 0:
                1yR.A0A.A05(new C51638FxW((Uri) this.A02, (C18608Vv1) this.A01, "cancel"));
                return;
            case 1:
                DbZ.A1V((C307896Rx) this.A01, this.A02);
                return;
            case 2:
            case 3:
                ((2bv) this.A02).DbJ((AnonymousClass4UC) this.A01);
                return;
            case 4:
                FGP.A05(((ESY) this.A01).A01, (CompoundButton) this.A02, false);
                return;
            default:
                return;
        }
    }
}
