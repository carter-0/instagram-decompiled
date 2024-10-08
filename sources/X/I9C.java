package X;

import android.content.DialogInterface;

public final class I9C implements DialogInterface.OnDismissListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C232722uK A01;

    public I9C(1Xj r1, C232722uK r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C232722uK r4 = this.A01;
        C232722uK.A07(r4, "fragment_resumed", false, false);
        C232722uK.A08(r4, new C58185Inp(1, this.A00, r4), new C59341JFt(r4, 16));
    }
}
