package X;

import android.graphics.Matrix;

/* renamed from: X.Lbs  reason: case insensitive filesystem */
public final class C64437Lbs implements C317406nD {
    public final Matrix A00;
    public final LFF A01;
    public final /* synthetic */ C59741JVz A02;

    private final void A00(2cs r6, float f) {
        if (f == 0.0f) {
            C71392co r1 = r6.A05;
            C71392co r0 = this.A02.A0D;
            if (r1 != r0) {
                r6.A09(r0);
                return;
            }
            return;
        }
        r6.A09(this.A02.A0C);
        double d = r6.A09.A00 + ((double) f);
        if (d != r6.A01) {
            r6.A06(d);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.JVz, android.widget.ImageView] */
    public final void Cuk(2cp r7) {
        0qQ.A0B(r7, 0);
        ? r1 = this.A02;
        Matrix matrix = r1.A08;
        matrix.set(this.A00);
        LFF lff = r1.A0F;
        LFF lff2 = this.A01;
        0qQ.A0B(lff2, 0);
        lff.A02 = lff2.A02;
        lff.A03 = lff2.A03;
        lff.A04 = lff2.A04;
        lff.A00 = lff2.A00;
        lff.A01 = lff2.A01;
        lff.A00 = JTO.A03(r1.A09);
        lff.A01 = JTO.A03(r1.A0A);
        lff.A02 = JTO.A03(r1.A0B);
        lff.A00(matrix);
        r1.setImageMatrix(matrix);
        if (r7.A00) {
            r1.A0L(true);
            r1.A0E.A04.remove(this);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.LFF, java.lang.Object] */
    public C64437Lbs(Matrix matrix, C59741JVz jVz, LFF lff, float f, float f2) {
        this.A02 = jVz;
        this.A00 = new Matrix(matrix);
        ? obj = new Object();
        this.A01 = obj;
        obj.A02 = lff.A02;
        obj.A03 = lff.A03;
        obj.A04 = lff.A04;
        obj.A00 = lff.A00;
        obj.A01 = lff.A01;
        jVz.A0E.A04.add(this);
        A01(jVz.A09, f, obj.A00);
        A01(jVz.A0A, f2, obj.A01);
        2cs r2 = jVz.A0B;
        r2.A02();
        if (obj.A02 != 1.0f) {
            r2.A07(0.0d);
            r2.A06((double) obj.A02);
        }
    }

    public final void Cxs(2cp r5) {
        C59741JVz jVz = this.A02;
        Matrix matrix = jVz.A08;
        LFF lff = jVz.A0F;
        jVz.A0J(matrix, lff);
        A00(jVz.A09, lff.A00);
        A00(jVz.A0A, lff.A01);
    }

    private final void A01(2cs r4, float f, float f2) {
        int i;
        C71392co r0;
        if (Math.abs(f) > 100.0f) {
            i = Float.valueOf(f);
        } else {
            i = 0;
        }
        r4.A07(JTO.A00(i));
        int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
        C59741JVz jVz = this.A02;
        if (i2 == 0) {
            r0 = jVz.A0D;
        } else {
            r0 = jVz.A0C;
        }
        r4.A09(r0);
        r4.A08(0.0d, false);
        r4.A06((double) f2);
    }
}
