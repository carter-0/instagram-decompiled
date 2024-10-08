package X;

import android.content.DialogInterface;

/* renamed from: X.W5f  reason: case insensitive filesystem */
public final class C18836W5f implements DialogInterface.OnShowListener {
    public final /* synthetic */ C17744VdD A00;

    public C18836W5f(C17744VdD vdD) {
        this.A00 = vdD;
    }

    public final void onShow(DialogInterface dialogInterface) {
        C17744VdD vdD = this.A00;
        WGU A002 = WGU.A00(vdD.A08);
        C16678UzE uzE = C16678UzE.BOOST_UNAVAILABLE_DIALOG;
        String str = vdD.A0G;
        A002.A02 = vdD.A0H;
        A002.A01 = str;
        A002.A0H(uzE, "boost_unavailable_dialog");
    }
}
