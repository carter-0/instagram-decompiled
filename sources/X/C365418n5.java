package X;

import android.graphics.RectF;

/* renamed from: X.8n5  reason: invalid class name and case insensitive filesystem */
public final class C365418n5 implements C344747sM, C345107sw, C346257us {
    public int A00;
    public int A01;
    public int A02;
    public RectF A03;
    public C345897uG A04;
    public C346267ut A05;
    public boolean A06;
    public boolean A07;
    public final C365438n7 A08 = new C365428n6(this);
    public final C365408n3 A09;
    public final C345127sy A0A;
    public final C365448n8 A0B;
    public final C345057sr A0C;
    public final boolean A0D;
    public final float[] A0E = new float[16];

    public final void CMa(C344567s4 r1) {
    }

    public final C345067ss A00() {
        int i;
        boolean z;
        boolean z2;
        C345057sr r4;
        boolean z3 = false;
        if (this.A02 % 180 != 0) {
            z3 = true;
        }
        C365408n3 r2 = this.A09;
        int BHc = r2.BHc();
        int BHR = r2.BHR();
        int i2 = this.A01;
        if (i2 <= 0 || (i = this.A00) <= 0) {
            i2 = BHc;
            i = BHR;
            if (z3) {
                i2 = BHR;
                i = BHc;
            }
        }
        if (this.A0D) {
            float[] fArr = this.A0E;
            r2.C9S(fArr);
            r4 = this.A0C;
            r4.A0A(fArr);
            int i3 = BHR;
            if (!z3) {
                i3 = BHc;
                BHc = BHR;
            }
            r4.A09(i3, BHc, i2, i, 0, false, false);
        } else {
            if (z3) {
                z = this.A07;
                z2 = this.A06;
            } else {
                z = this.A06;
                z2 = this.A07;
            }
            r4 = this.A0C;
            r4.A09(BHc, BHR, i2, i, this.A02, z, z2);
        }
        C345067ss A082 = r4.A08();
        this.A0A.A05 = A082;
        RectF rectF = this.A03;
        if (rectF == null) {
            return A082;
        }
        float f = (float) A082.A01;
        int round = Math.round(rectF.left * f);
        int round2 = Math.round(((float) A082.A00) * rectF.top);
        int round3 = Math.round(f * rectF.width());
        int round4 = Math.round(((float) A082.A00) * this.A03.height());
        C365448n8 r22 = this.A0B;
        r22.A00(1.0f, 1.0f, 0.0f, round, round2, round3, round4);
        return r22.CFP();
    }

    public final void ACn(C345897uG r3) {
        this.A04 = r3;
        this.A09.CMV(this.A08);
    }

    public final C345137sz B82() {
        long ANS;
        C345127sy r3 = this.A0A;
        r3.A06 = false;
        C365408n3 r2 = this.A09;
        r3.A04 = r2.B81().A00();
        if (r2.CKh()) {
            ANS = r2.B81().A00;
        } else {
            ANS = r2.AoM().ANS();
        }
        r3.A03 = ANS;
        r3.A00 = r2.Ap3();
        A00();
        if (this.A03 != null) {
            return this.A0B;
        }
        return r3;
    }

    public final int BHN() {
        return this.A09.Ap3();
    }

    public final C345067ss FKc(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.A01 = i3;
        this.A00 = i4;
        C345067ss A002 = A00();
        A002.getClass();
        return A002;
    }

    public final void detach() {
        this.A09.destroy();
        this.A04 = null;
    }

    public final void release() {
        this.A09.release();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.7sz, java.lang.Object, X.7sy] */
    @Deprecated
    public C365418n5(C365408n3 r3, boolean z) {
        this.A09 = r3;
        ? obj = new Object();
        this.A0A = obj;
        C365448n8 r0 = new C365448n8();
        this.A0B = r0;
        r0.A00 = obj;
        this.A0C = new C345047sq();
        this.A0D = z;
    }

    public final void EeQ(C346267ut r1) {
        this.A05 = r1;
    }
}
