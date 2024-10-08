package X;

import android.graphics.Outline;
import android.os.Build;

public final class GSW {
    public float A00;
    public long A01;
    public long A02;
    public C3018060d A03;
    public C3018060d A04;
    public boolean A05;
    public boolean A06 = true;
    public boolean A07;
    public AnonymousClass6GT A08;
    public C289315dO A09;
    public C3018060d A0A;
    public boolean A0B;
    public final Outline A0C;

    public static final void A00(GSW gsw) {
        C3018060d r2;
        if (gsw.A05) {
            gsw.A02 = 0;
            gsw.A00 = 0.0f;
            gsw.A04 = null;
            gsw.A05 = false;
            gsw.A07 = false;
            C289315dO r5 = gsw.A09;
            if (r5 != null && gsw.A0B) {
                long j = gsw.A01;
                if (C288025bF.A02(j) > 0.0f && C288025bF.A00(j) > 0.0f) {
                    gsw.A06 = true;
                    if (r5 instanceof C289305dN) {
                        AnonymousClass5VN r4 = ((C289305dN) r5).A00;
                        float f = r4.A01;
                        float f2 = r4.A03;
                        gsw.A02 = C289325dP.A00(f, f2);
                        float f3 = r4.A02;
                        float f4 = r4.A00;
                        gsw.A01 = C288015bE.A00(f3 - f, f4 - f2);
                        gsw.A0C.setRect(Math.round(f), Math.round(f2), Math.round(f3), Math.round(f4));
                        return;
                    }
                    if (r5 instanceof C3018460h) {
                        AnonymousClass6GT r6 = ((C3018460h) r5).A00;
                        long j2 = r6.A06;
                        long j3 = AnonymousClass6GS.A00;
                        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                        float f5 = r6.A01;
                        float f6 = r6.A03;
                        gsw.A02 = C289325dP.A00(f5, f6);
                        float f7 = r6.A02;
                        float f8 = r6.A00;
                        gsw.A01 = C288015bE.A00(f7 - f5, f8 - f6);
                        if (AnonymousClass6GU.A01(r6)) {
                            gsw.A0C.setRoundRect(Math.round(f5), Math.round(f6), Math.round(f7), Math.round(f8), intBitsToFloat);
                            gsw.A00 = intBitsToFloat;
                            return;
                        }
                        r2 = gsw.A03;
                        if (r2 == null) {
                            r2 = C3026864w.A00();
                            gsw.A03 = r2;
                        }
                        ((C3018160e) r2).A03.reset();
                        r2.AAA(r6, AnonymousClass05K.A00);
                    } else if (r5 instanceof C289335dQ) {
                        r2 = ((C289335dQ) r5).A00;
                    } else {
                        return;
                    }
                    if (Build.VERSION.SDK_INT > 28 || ((C3018160e) r2).A03.isConvex()) {
                        Outline outline = gsw.A0C;
                        if (r2 instanceof C3018160e) {
                            outline.setConvexPath(((C3018160e) r2).A03);
                            gsw.A07 = !outline.canClip();
                        } else {
                            throw new UnsupportedOperationException(C273654mx.A00(518));
                        }
                    } else {
                        gsw.A06 = false;
                        gsw.A0C.setEmpty();
                        gsw.A07 = true;
                    }
                    gsw.A04 = r2;
                    return;
                }
            }
            gsw.A0C.setEmpty();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (X.C51971G9r.A01(r4) == r6) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass5QA r19) {
        /*
            r18 = this;
            r2 = r18
            A00(r2)
            X.60d r1 = r2.A04
            r11 = r19
            if (r1 == 0) goto L_0x0010
            r0 = 1
            r11.AHw(r1, r0)
            return
        L_0x0010:
            float r6 = r2.A00
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            X.60d r3 = r2.A0A
            X.6GT r7 = r2.A08
            if (r3 == 0) goto L_0x0064
            long r0 = r2.A02
            long r4 = r2.A01
            if (r7 == 0) goto L_0x0064
            boolean r8 = X.AnonymousClass6GU.A01(r7)
            if (r8 == 0) goto L_0x0064
            float r8 = r7.A01
            float r10 = X.C289295dM.A01(r0)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0064
            float r9 = r7.A03
            float r8 = X.C289295dM.A02(r0)
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = r7.A02
            float r0 = X.C288025bF.A02(r4)
            float r10 = r10 + r0
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            float r1 = r7.A00
            float r0 = X.C288025bF.A00(r4)
            float r8 = r8 + r0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
            long r4 = r7.A06
            long r0 = X.AnonymousClass6GS.A00
            float r0 = X.C51971G9r.A01(r4)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0064
        L_0x005f:
            r0 = 1
            r11.AHw(r3, r0)
            return
        L_0x0064:
            long r0 = r2.A02
            float r12 = X.C289295dM.A01(r0)
            float r13 = X.C289295dM.A02(r0)
            long r0 = r2.A01
            float r4 = X.C288025bF.A02(r0)
            float r14 = r12 + r4
            float r0 = X.C288025bF.A00(r0)
            float r15 = r13 + r0
            long r16 = X.AnonymousClass6GR.A00(r6, r6)
            X.6GT r1 = X.AnonymousClass6GU.A00(r12, r13, r14, r15, r16)
            if (r3 != 0) goto L_0x0094
            X.60e r3 = X.C3026864w.A00()
        L_0x008a:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r3.AAA(r1, r0)
            r2.A08 = r1
            r2.A0A = r3
            goto L_0x005f
        L_0x0094:
            r0 = r3
            X.60e r0 = (X.C3018160e) r0
            android.graphics.Path r0 = r0.A03
            r0.reset()
            goto L_0x008a
        L_0x009d:
            long r0 = r2.A02
            float r13 = X.C289295dM.A01(r0)
            float r14 = X.C289295dM.A02(r0)
            long r1 = r2.A01
            float r0 = X.C288025bF.A02(r1)
            float r15 = r13 + r0
            float r0 = X.C288025bF.A00(r1)
            float r16 = r14 + r0
            r12 = 1
            r11.AHx(r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GSW.A02(X.5QA):void");
    }

    public final boolean A03(long j) {
        C289315dO r2;
        if (!this.A0B || (r2 = this.A09) == null) {
            return true;
        }
        return C52418GRv.A01(r2, C289295dM.A01(j), C289295dM.A02(j));
    }

    public final boolean A04(C289315dO r5, float f, float f2, long j, boolean z) {
        boolean z2;
        this.A0C.setAlpha(f);
        boolean z3 = !0qQ.A0K(this.A09, r5);
        if (z3) {
            this.A09 = r5;
            this.A05 = true;
        }
        this.A01 = j;
        if (r5 == null || (!z && f2 <= 0.0f)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.A0B != z2) {
            this.A0B = z2;
            this.A05 = true;
        }
        return z3;
    }

    public GSW() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.A0C = outline;
        this.A02 = 0;
        this.A01 = 0;
    }

    public final Outline A01() {
        A00(this);
        if (!this.A0B || !this.A06) {
            return null;
        }
        return this.A0C;
    }
}
