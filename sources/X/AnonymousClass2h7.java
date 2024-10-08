package X;

import android.view.View;

/* renamed from: X.2h7  reason: invalid class name */
public final class AnonymousClass2h7 implements C252203oj {
    public static final C71392co A02 = C71392co.A03(8.0d, 40.0d);
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(AnonymousClass2h8.A00);
    public final View A01;

    public final void DmB(2cs r1) {
    }

    public final void DmD(2cs r1) {
    }

    public final void DmE(2cs r5) {
        0qQ.A0B(r5, 0);
        float f = (float) r5.A09.A00;
        View view = this.A01;
        view.setScaleX(f);
        view.setScaleY(f);
    }

    public final void A00() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        2cs r3 = (2cs) value;
        r3.A08(1.0d, true);
        r3.A06(1.25d);
    }

    public final void A01() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        2cs r0 = (2cs) value;
        r0.A0B(this);
        r0.A01();
    }

    public final void A02() {
        Object value = this.A00.getValue();
        0qQ.A07(value);
        2cs r0 = (2cs) value;
        r0.A0A(this);
        r0.A01();
    }

    public final void DmC(2cs r7) {
        AnonymousClass0eM r5 = this.A00;
        Object value = r5.getValue();
        0qQ.A07(value);
        if (((2cs) value).A01 == 1.25d) {
            Object value2 = r5.getValue();
            0qQ.A07(value2);
            2cs r2 = (2cs) value2;
            r2.A08(1.25d, true);
            r2.A06(1.0d);
        }
    }

    public AnonymousClass2h7(View view) {
        this.A01 = view;
    }
}
