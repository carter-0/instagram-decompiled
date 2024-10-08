package X;

import android.view.View;

/* renamed from: X.GBb  reason: case insensitive filesystem */
public final class C52004GBb implements B2R {
    public int A00;
    public int A01 = View.MeasureSpec.makeMeasureSpec(this.A00, SN3.MAX_SIGNED_POWER_OF_TWO);
    public int A02;
    public int A03;
    public final 2V1 A04;
    public final GBQ A05;

    public final void E3w(C295015nP r5) {
        0qQ.A0B(r5, 0);
        A00();
        r5.A06(this.A04, (C337997hF) null, this.A03, this.A01);
    }

    public final void E4C(AnonymousClass2T3 r5, C295015nP r6) {
        0qQ.A0B(r6, 0);
        A00();
        r6.A07(this.A04, (AnonymousClass2T3) null, this.A03, this.A01);
    }

    private final void A00() {
        GBQ gbq = this.A05;
        int i = gbq.A01;
        if (i != this.A02) {
            this.A02 = i;
            this.A03 = C51967G9n.A01(i);
        }
        int i2 = gbq.A00;
        if (i2 != this.A00) {
            this.A00 = i2;
            this.A01 = C51967G9n.A01(i2);
        }
    }

    public final C295015nP AL1(C338347ho r7) {
        return new C295015nP((AnonymousClass2TL) null, this.A04.A02.A01, (C338607iE) null, r7, false);
    }

    public C52004GBb(2V1 r4, GBQ gbq) {
        this.A04 = r4;
        this.A05 = gbq;
        int i = gbq.A01;
        this.A02 = i;
        this.A00 = gbq.A00;
        int i2 = AnonymousClass3XX.A00;
        this.A03 = View.MeasureSpec.makeMeasureSpec(i, SN3.MAX_SIGNED_POWER_OF_TWO);
    }
}
