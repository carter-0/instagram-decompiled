package X;

import android.location.Location;

public final class WYt implements C267874cM {
    public final /* synthetic */ C70826OMy A00;
    public final /* synthetic */ C15286UZq A01;
    public final /* synthetic */ String A02;

    public final void DCn(Exception exc) {
    }

    public WYt(C70826OMy oMy, C15286UZq uZq, String str) {
        this.A01 = uZq;
        this.A00 = oMy;
        this.A02 = str;
    }

    public final void onLocationChanged(Location location) {
        this.A01.A06().A02().A05(this.A00.A00().A02, this.A02);
    }
}
