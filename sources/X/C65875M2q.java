package X;

import android.view.View;

/* renamed from: X.M2q  reason: case insensitive filesystem */
public final /* synthetic */ class C65875M2q implements Runnable {
    public final /* synthetic */ C59937Jc1 A00;

    public C65875M2q(C59937Jc1 jc1) {
        this.A00 = jc1;
    }

    public final void run() {
        C59937Jc1 jc1 = this.A00;
        C66295MMe mMe = new C66295MMe(jc1, 42);
        jc1.A01 = false;
        C340297l2 r4 = jc1.A06;
        r4.A0H.A00().setVisibility(4);
        View view = r4.A0F;
        0qQ.A07(view);
        float f = jc1.A03;
        int i = (int) f;
        0nA.A0g(view, i, i);
        AnonymousClass8LZ.A01(view, jc1.A02, 0);
        view.setX((((float) jc1.A05) - f) / 2.0f);
        view.setY((((float) jc1.A04) - f) / 2.0f);
        11Z.A04(new C66020M8f(r4, jc1, mMe), 170);
    }
}
