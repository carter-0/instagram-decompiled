package X;

public final class GTU implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "MediaCommentListInsightsHost";
    public final boolean A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public GTU(String str, boolean z, boolean z2, boolean z3) {
        String A002;
        0qQ.A0B(str, 3);
        this.A03 = z;
        this.A02 = z2;
        this.A00 = z3;
        if (z3) {
            A002 = "self_comments_v2";
        } else {
            A002 = AnonymousClass000.A00(1210);
        }
        if (str.length() != 0 && !00p.A0k(str, A002, false)) {
            A002 = 002.A0T(A002, str, '_');
        }
        this.A01 = A002;
    }

    public final String getModuleName() {
        return this.A01;
    }

    public final boolean isOrganicEligible() {
        return this.A02;
    }

    public final boolean isSponsoredEligible() {
        return this.A03;
    }
}
