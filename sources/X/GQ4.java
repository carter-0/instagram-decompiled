package X;

import android.view.View;

public final class GQ4 implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C315476jx A01;
    public final /* synthetic */ GKU A02;
    public final /* synthetic */ C59596JPq A03;
    public final /* synthetic */ boolean A04;

    public GQ4(View view, C315476jx r2, GKU gku, C59596JPq jPq, boolean z) {
        this.A03 = jPq;
        this.A02 = gku;
        this.A01 = r2;
        this.A00 = view;
        this.A04 = z;
    }

    public final void run() {
        C59596JPq jPq = this.A03;
        if (jPq.CRo()) {
            GKU gku = this.A02;
            AnonymousClass5Gt r4 = new AnonymousClass5Gt(gku.A01, this.A01);
            View view = this.A00;
            r4.A04(view, 0, (-view.getHeight()) / 2, true);
            r4.A02();
            r4.A04 = new C389339pH(5, jPq, gku);
            r4.A0B = this.A04;
            r4.A0A = false;
            AnonymousClass5Gv A002 = r4.A00();
            gku.A00 = A002;
            A002.A07(gku.A02);
        }
    }
}
