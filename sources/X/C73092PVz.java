package X;

import android.view.View;

/* renamed from: X.PVz  reason: case insensitive filesystem */
public final /* synthetic */ class C73092PVz implements Runnable {
    public final /* synthetic */ C71870OsD A00;

    public /* synthetic */ C73092PVz(C71870OsD osD) {
        this.A00 = osD;
    }

    public final void run() {
        View view;
        C71870OsD osD = this.A00;
        if (osD.A0S.A05 != null && osD.A0E != null && (view = osD.A08) != null) {
            view.animate().withStartAction(new PW0(view)).alpha(0.4f).withEndAction(new PW1(osD));
        }
    }
}
