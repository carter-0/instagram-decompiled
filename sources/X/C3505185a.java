package X;

import android.view.View;

/* renamed from: X.85a  reason: invalid class name and case insensitive filesystem */
public final class C3505185a extends C232922uf {
    public View A00;
    public final 2cs A01;

    public final void DmE(2cs r16) {
        2cs r2 = r16;
        0qQ.A0B(r2, 0);
        View view = this.A00;
        if (view != null) {
            C71412ct r4 = r2.A09;
            float A04 = (float) AnonymousClass37Q.A04(r4.A00, 0.0d, 1.0d, 1.0d, 0.9800000190734863d);
            view.setScaleX(A04);
            view.setScaleY(A04);
            view.setAlpha((float) AnonymousClass37Q.A04(r4.A00, 0.0d, 1.0d, 1.0d, 0.699999988079071d));
        }
    }

    public C3505185a() {
        2cs A02 = C61340me.A00().A02();
        A02.A09(C71392co.A03(5.0d, 10.0d));
        A02.A0A(this);
        this.A01 = A02;
    }
}
