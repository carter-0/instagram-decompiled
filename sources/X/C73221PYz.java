package X;

import android.view.View;

/* renamed from: X.PYz  reason: case insensitive filesystem */
public final /* synthetic */ class C73221PYz implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C71870OsD A01;

    public /* synthetic */ C73221PYz(View view, C71870OsD osD) {
        this.A01 = osD;
        this.A00 = view;
    }

    public final void run() {
        C71870OsD osD = this.A01;
        this.A00.setVisibility(8);
        osD.A0H = false;
    }
}
