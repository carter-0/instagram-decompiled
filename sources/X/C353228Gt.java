package X;

import android.view.View;

/* renamed from: X.8Gt  reason: invalid class name and case insensitive filesystem */
public final class C353228Gt extends C232922uf {
    public final /* synthetic */ C352888Fl A00;

    public C353228Gt(C352888Fl r1) {
        this.A00 = r1;
    }

    public final void DmE(2cs r5) {
        int round = Math.round(((float) r5.A09.A00) * 255.0f);
        View[] viewArr = {this.A00.A0R};
        if (round > 0) {
            C294975nL.A04((C295005nO) null, viewArr, false);
        } else {
            C294975nL.A05(viewArr, false);
        }
    }
}
