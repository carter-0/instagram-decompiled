package X;

public abstract class HRE {
    public static final boolean A00(C285305Qs r7, long j) {
        if (!((C267794cD) r7).A03.A08) {
            return false;
        }
        C268834e4 r2 = AnonymousClass5WH.A02(r7).A0W.A06;
        if (!r2.COx()) {
            return false;
        }
        long j2 = r2.A03;
        int A04 = C51965G9l.A04(j2);
        int A00 = C289005cr.A00(j2);
        long CgY = r2.CgY(0);
        float A01 = C289295dM.A01(CgY);
        float A02 = C289295dM.A02(CgY);
        float f = ((float) A04) + A01;
        float f2 = ((float) A00) + A02;
        float A012 = C289295dM.A01(j);
        if (A01 > A012 || A012 > f) {
            return false;
        }
        float A022 = C289295dM.A02(j);
        if (A02 > A022 || A022 > f2) {
            return false;
        }
        return true;
    }
}
