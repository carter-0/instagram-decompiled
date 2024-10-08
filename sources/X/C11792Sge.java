package X;

import android.graphics.Paint;

/* renamed from: X.Sge  reason: case insensitive filesystem */
public final class C11792Sge implements C13518Tbn {
    public boolean A00 = true;
    public final C11388SRb A01;
    public final C11388SRb A02;
    public final C11388SRb A03;
    public final C11388SRb A04;
    public final C13518Tbn A05;
    public final C11388SRb A06;

    public final void Dwx() {
        this.A00 = true;
        this.A05.Dwx();
    }

    public final void A00(Paint paint) {
        if (this.A00) {
            this.A00 = false;
            double A012 = ((double) C11388SRb.A01(this.A02)) * 0.017453292519943295d;
            float A013 = C11388SRb.A01(this.A03);
            int A014 = C51973G9u.A01(AnonymousClass7TE.A0M(this.A01.A06()), Math.round(C11388SRb.A01(this.A06)));
            paint.setShadowLayer(C11388SRb.A01(this.A04), ((float) Math.sin(A012)) * A013, ((float) Math.cos(A012 + 3.141592653589793d)) * A013, A014);
        }
    }

    public final void A01(SIR sir) {
        C7496QGn qGn;
        C11388SRb sRb = this.A06;
        if (sir == null) {
            qGn = null;
        } else {
            qGn = new C7496QGn(this, sir);
        }
        sRb.A0A(qGn);
    }

    public C11792Sge(C13518Tbn tbn, C11796Sgi sgi, C10723Rx1 rx1) {
        this.A05 = tbn;
        C11388SRb sRb = new C11388SRb(rx1.A00.A00);
        this.A01 = sRb;
        sRb.A09(this);
        sgi.A0C(sRb);
        QGR A002 = C11802Sgo.A00(rx1.A03);
        this.A06 = A002;
        A002.A09(this);
        sgi.A0C(A002);
        QGR A003 = C11802Sgo.A00(rx1.A01);
        this.A02 = A003;
        A003.A09(this);
        sgi.A0C(A003);
        QGR A004 = C11802Sgo.A00(rx1.A02);
        this.A03 = A004;
        A004.A09(this);
        sgi.A0C(A004);
        QGR A005 = C11802Sgo.A00(rx1.A04);
        this.A04 = A005;
        A005.A09(this);
        sgi.A0C(A005);
    }
}
