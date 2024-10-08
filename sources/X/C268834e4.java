package X;

import androidx.compose.ui.graphics.layer.GraphicsLayer;

/* renamed from: X.4e4  reason: invalid class name and case insensitive filesystem */
public final class C268834e4 extends C268054cg {
    public static final AnonymousClass5S9 A02;
    public AnonymousClass6GP A00;
    public final AnonymousClass5SH A01;

    static {
        AnonymousClass5S8 r2 = new AnonymousClass5S8();
        r2.ESE(AnonymousClass5RW.A06);
        r2.A01.setStrokeWidth(1.0f);
        r2.EnM(1);
        A02 = r2;
    }

    public final int CmV(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CmW(r2.A0W.A04, r2.A0U.A0J.A0K(), i);
    }

    public final int CmY(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CmZ(r2.A0W.A04, r2.A0U.A0J.A0K(), i);
    }

    public final int CoO(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CoP(r2.A0W.A04, r2.A0U.A0J.A0K(), i);
    }

    public final int CoR(int i) {
        GRF A002 = AnonymousClass5R6.A00(this.A0H);
        AnonymousClass5R6 r2 = A002.A01;
        return ((AnonymousClass5RD) A002.A00.getValue()).CoS(r2.A0W.A04, r2.A0U.A0J.A0K(), i);
    }

    public C268834e4(AnonymousClass5R6 r2) {
        super(r2);
        C52938GfC gfC;
        AnonymousClass5SH r0 = new AnonymousClass5SH();
        this.A01 = r0;
        r0.A07(this);
        if (r2.A08 != null) {
            gfC = new C52938GfC(this);
        } else {
            gfC = null;
        }
        this.A00 = gfC;
    }

    public final void A0I(GraphicsLayer graphicsLayer, float f, long j) {
        super.A0I(graphicsLayer, f, j);
        if (!this.A03) {
            A0f();
            this.A0H.A0U.A0J.A0N();
        }
    }

    public final void A0J(0sP r2, float f, long j) {
        super.A0J(r2, f, j);
        if (!this.A03) {
            A0f();
            this.A0H.A0U.A0J.A0N();
        }
    }

    public final C267974cY Cnz(long j) {
        A0F(j);
        AnonymousClass5R6 r5 = this.A0H;
        C285045Pl A0A = r5.A0A();
        int i = A0A.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A0A.A02;
            do {
                ((AnonymousClass5R6) objArr[i2]).A0U.A0J.A09 = AnonymousClass05K.A0C;
                i2++;
            } while (i2 < i);
        }
        A0l(r5.A07.Cnx(this, r5.A0U.A0J.A0K(), j));
        A0e();
        return this;
    }
}
