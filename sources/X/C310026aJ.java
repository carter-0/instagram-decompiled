package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6aJ  reason: invalid class name and case insensitive filesystem */
public final class C310026aJ implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ReelInsightsHost";
    public Reel A00;
    public final AnonymousClass4DU A01;
    public final AnonymousClass3BQ A02;

    public final String getModuleName() {
        return 002.A0R(AnonymousClass3PQ.A04(this.A00), this.A02.A00);
    }

    public final boolean isOrganicEligible() {
        return this.A01.isOrganicEligible();
    }

    public final boolean isSponsoredEligible() {
        return this.A01.isSponsoredEligible();
    }

    public C310026aJ(AnonymousClass4DU r1, AnonymousClass3BQ r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
