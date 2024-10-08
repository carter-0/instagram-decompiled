package X;

/* renamed from: X.GhT  reason: case insensitive filesystem */
public final class C53037GhT extends 2YL {
    public final 05G A00;
    public final 05G A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;
    public final AnonymousClass0Ud A04;
    public final AnonymousClass0Ud A05;
    public final long A06;
    public final AnonymousClass0Ud A07;

    public static final float A00(AnonymousClass5VN r6, C53037GhT ghT, long j) {
        float f;
        float A002;
        float A022 = r6.A00 + C289295dM.A02(j);
        05G r5 = ghT.A02;
        float A003 = C288025bF.A00(((C288025bF) r5.getValue()).A00);
        05G r2 = ghT.A01;
        if (A022 > A003 + C289295dM.A02(((C289295dM) r2.getValue()).A00)) {
            f = C288025bF.A00(((C288025bF) r5.getValue()).A00);
            A002 = C289295dM.A02(((C289295dM) r2.getValue()).A00);
        } else {
            float f2 = r6.A03;
            long j2 = ghT.A06;
            if (A022 >= C288025bF.A00(j2) + f2) {
                return A022;
            }
            f = f2;
            A002 = C288025bF.A00(j2);
        }
        return f + A002;
    }

    public static final float A01(AnonymousClass5VN r5, C53037GhT ghT, long j) {
        float A012 = r5.A01 + C289295dM.A01(j);
        05G r2 = ghT.A01;
        if (A012 < C289295dM.A01(((C289295dM) r2.getValue()).A00)) {
            return C289295dM.A01(((C289295dM) r2.getValue()).A00);
        }
        float f = r5.A02;
        long j2 = ghT.A06;
        if (A012 > f - C288025bF.A02(j2)) {
            return f - C288025bF.A02(j2);
        }
        return A012;
    }

    public static final float A02(AnonymousClass5VN r6, C53037GhT ghT, long j) {
        float f;
        float A022;
        float A012 = r6.A02 + C289295dM.A01(j);
        AnonymousClass0Ud r5 = ghT.A05;
        float A023 = C288025bF.A02(((C288025bF) r5.getValue()).A00);
        05G r2 = ghT.A01;
        if (A012 > A023 + C289295dM.A01(((C289295dM) r2.getValue()).A00)) {
            f = C288025bF.A02(((C288025bF) r5.getValue()).A00);
            A022 = C289295dM.A01(((C289295dM) r2.getValue()).A00);
        } else {
            float f2 = r6.A01;
            long j2 = ghT.A06;
            if (A012 >= C288025bF.A02(j2) + f2) {
                return A012;
            }
            f = f2;
            A022 = C288025bF.A02(j2);
        }
        return f + A022;
    }

    public static final float A03(AnonymousClass5VN r5, C53037GhT ghT, long j) {
        float A022 = r5.A03 + C289295dM.A02(j);
        05G r2 = ghT.A01;
        if (A022 < C289295dM.A02(((C289295dM) r2.getValue()).A00)) {
            return C289295dM.A02(((C289295dM) r2.getValue()).A00);
        }
        float f = r5.A00;
        long j2 = ghT.A06;
        if (A022 > f - C288025bF.A00(j2)) {
            return f - C288025bF.A00(j2);
        }
        return A022;
    }

    public C53037GhT(long j) {
        this.A06 = j;
        02z A10 = DbS.A10(new C288025bF(j));
        this.A02 = A10;
        this.A05 = A10;
        02z A102 = DbS.A10(new AnonymousClass5VN(0.0f, 0.0f, C288025bF.A02(j), C288025bF.A00(j)));
        this.A00 = A102;
        AnonymousClass7TE.A1Z(new MG7(this, (AnonymousClass4D7) null, 44), C318116oQ.A00(this));
        this.A03 = A102;
        C61820pm A032 = AnonymousClass10H.A03(new C58110ImZ((AnonymousClass4D7) null), A102, A10);
        this.A07 = 10b.A02(new AnonymousClass5VN(0.0f, 0.0f, 1.0f, 1.0f), C318116oQ.A00(this), A032, AnonymousClass10A.A01);
        02z A103 = DbS.A10(C51965G9l.A0M(0));
        this.A01 = A103;
        this.A04 = A103;
    }
}
