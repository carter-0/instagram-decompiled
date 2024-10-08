package X;

import com.instagram.model.reels.Reel;

/* renamed from: X.6KG  reason: invalid class name */
public final class AnonymousClass6KG implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ReelInsightsHostSafe";
    public final AnonymousClass4DU A00;
    public final Reel A01;
    public final AnonymousClass3BQ A02;

    public final String getModuleName() {
        return 002.A0R(AnonymousClass3PQ.A04(this.A01), this.A02.A00);
    }

    public final boolean isOrganicEligible() {
        return this.A00.isOrganicEligible();
    }

    public final boolean isSponsoredEligible() {
        return this.A00.isSponsoredEligible();
    }

    public AnonymousClass6KG(AnonymousClass4DU r1, Reel reel, AnonymousClass3BQ r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = reel;
    }
}
