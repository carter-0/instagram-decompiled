package X;

import androidx.compose.foundation.gestures.ScrollingLogic;
import androidx.compose.foundation.gestures.UpdatableAnimationState;

/* renamed from: X.6IZ  reason: invalid class name */
public final class AnonymousClass6IZ extends C267794cD implements AnonymousClass5VF, C305446Ia, C268824e3 {
    public long A00 = 0;
    public JS2 A01;
    public AnonymousClass6Gj A02;
    public C268064ch A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public AnonymousClass5VN A07;
    public final C305456Ib A08 = new C305456Ib();
    public final ScrollingLogic A09;

    public static final void A03(AnonymousClass6IZ r8) {
        AnonymousClass6IZ r5 = r8;
        JS2 js2 = r8.A01;
        if (js2 == null) {
            js2 = (JS2) C288795cU.A00(C52630Ga4.A01, r8);
        }
        if (!r8.A04) {
            UpdatableAnimationState updatableAnimationState = new UpdatableAnimationState(js2.Bq4());
            C262224Cq A052 = r8.A05();
            1Eo.A03(AnonymousClass05K.A0N, 19B.A00, new MHG((AnonymousClass4D7) null, (Object) r5, (Object) js2, (Object) updatableAnimationState, 2), A052);
            return;
        }
        throw new IllegalStateException("launchAnimation called when previous animation was running");
    }

    public final /* synthetic */ void DXL(C268064ch r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        if (r5 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005b, code lost:
        if (r5 != null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006b, code lost:
        r3 = X.C289155d7.A01(r12.A00);
        r1 = r12.A02.ordinal();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if (r1 == 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007b, code lost:
        if (r1 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007d, code lost:
        r2 = r5.A01;
        r1 = r5.A02 - r2;
        r0 = X.C288025bF.A02(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        return r11.AF7(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        r2 = r5.A03;
        r1 = r5.A00 - r2;
        r0 = X.C288025bF.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        throw new java.lang.RuntimeException();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final float A00(X.JS2 r11, X.AnonymousClass6IZ r12) {
        /*
            long r4 = r12.A00
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x000a
            r0 = 1
        L_0x000a:
            r10 = 0
            if (r0 != 0) goto L_0x005d
            X.6Ib r0 = r12.A08
            X.5Pl r1 = r0.A00
            int r0 = r1.A00
            r5 = 0
            if (r0 <= 0) goto L_0x0053
            int r9 = r0 + -1
            java.lang.Object[] r6 = r1.A02
        L_0x001a:
            r0 = r6[r9]
            X.6Ic r0 = (X.AnonymousClass6Ic) r0
            X.0sa r0 = r0.A00
            java.lang.Object r4 = r0.invoke()
            X.5VN r4 = (X.AnonymousClass5VN) r4
            if (r4 == 0) goto L_0x004d
            long r7 = r4.A01()
            long r0 = r12.A00
            long r2 = X.C289155d7.A01(r0)
            X.6Gj r0 = r12.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x0062
            r0 = 1
            if (r1 != r0) goto L_0x009b
            float r1 = X.C288025bF.A02(r7)
            float r0 = X.C288025bF.A02(r2)
        L_0x0046:
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 > 0) goto L_0x005e
            r5 = r4
        L_0x004d:
            int r9 = r9 + -1
            if (r9 >= 0) goto L_0x001a
        L_0x0051:
            if (r5 != 0) goto L_0x006b
        L_0x0053:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x005d
            X.5VN r5 = A02(r12)
            if (r5 != 0) goto L_0x006b
        L_0x005d:
            return r10
        L_0x005e:
            if (r5 != 0) goto L_0x0051
            r5 = r4
            goto L_0x0051
        L_0x0062:
            float r1 = X.C288025bF.A00(r7)
            float r0 = X.C288025bF.A00(r2)
            goto L_0x0046
        L_0x006b:
            long r0 = r12.A00
            long r3 = X.C289155d7.A01(r0)
            X.6Gj r0 = r12.A02
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x008b
            r0 = 1
            if (r1 != r0) goto L_0x0095
            float r2 = r5.A01
            float r1 = r5.A02
            float r1 = r1 - r2
            float r0 = X.C288025bF.A02(r3)
        L_0x0086:
            float r0 = r11.AF7(r2, r1, r0)
            return r0
        L_0x008b:
            float r2 = r5.A03
            float r1 = r5.A00
            float r1 = r1 - r2
            float r0 = X.C288025bF.A00(r3)
            goto L_0x0086
        L_0x0095:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009b:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6IZ.A00(X.JS2, X.6IZ):float");
    }

    public static final AnonymousClass5VN A02(AnonymousClass6IZ r4) {
        if (!r4.A08) {
            return null;
        }
        C268054cg A032 = AnonymousClass5WH.A03(r4);
        C268064ch r1 = r4.A03;
        if (r1 == null || !r1.COx()) {
            return null;
        }
        return A032.CgV(r1, false);
    }

    public final boolean A0G() {
        return false;
    }

    public final void Dd8(long j) {
        int A002;
        int A003;
        AnonymousClass5VN A022;
        long j2 = this.A00;
        this.A00 = j;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            A002 = C289005cr.A00(j);
            A003 = C289005cr.A00(j2);
        } else if (ordinal == 1) {
            A002 = (int) (j >> 32);
            A003 = (int) (j2 >> 32);
        } else {
            throw new RuntimeException();
        }
        if (0qQ.A00(A002, A003) < 0 && (A022 = A02(this)) != null) {
            AnonymousClass5VN r3 = this.A07;
            if (r3 == null) {
                r3 = A022;
            }
            if (!this.A04 && !this.A06 && A04(this, r3, j2) && !A04(this, A022, j)) {
                this.A06 = true;
                A03(this);
            }
            this.A07 = A022;
        }
    }

    public AnonymousClass6IZ(JS2 js2, AnonymousClass6Gj r4, ScrollingLogic scrollingLogic, boolean z) {
        this.A02 = r4;
        this.A09 = scrollingLogic;
        this.A05 = z;
        this.A01 = js2;
    }

    public static final long A01(AnonymousClass6IZ r7, AnonymousClass5VN r8, long j) {
        long A012 = C289155d7.A01(j);
        int ordinal = r7.A02.ordinal();
        if (ordinal == 0) {
            JS2 js2 = r7.A01;
            if (js2 == null) {
                js2 = (JS2) C288795cU.A00(C52630Ga4.A01, r7);
            }
            float f = r8.A03;
            return C289325dP.A00(0.0f, js2.AF7(f, r8.A00 - f, C288025bF.A00(A012)));
        } else if (ordinal == 1) {
            JS2 js22 = r7.A01;
            if (js22 == null) {
                js22 = (JS2) C288795cU.A00(C52630Ga4.A01, r7);
            }
            float f2 = r8.A01;
            return C289325dP.A00(js22.AF7(f2, r8.A02 - f2, C288025bF.A02(A012)), 0.0f);
        } else {
            throw new RuntimeException();
        }
    }

    public static final boolean A04(AnonymousClass6IZ r0, AnonymousClass5VN r1, long j) {
        long A012 = A01(r0, r1, j);
        if (Math.abs(C289295dM.A01(A012)) > 0.5f || Math.abs(C289295dM.A02(A012)) > 0.5f) {
            return false;
        }
        return true;
    }
}
