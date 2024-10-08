package X;

/* renamed from: X.Fc0  reason: case insensitive filesystem */
public final class C50453Fc0 implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "ReelNetegoController$onInFeedTraySeen$feedUnitInsightsHost$1";
    public final /* synthetic */ C230212pD A00;
    public final /* synthetic */ AnonymousClass5GH A01;

    public C50453Fc0(C230212pD r1, AnonymousClass5GH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final String getModuleName() {
        C275464qK r2 = this.A01.A00;
        if (r2.A01 == 1UQ.A0Q) {
            return "feed_timeline_highlights_blending";
        }
        Boolean bool = r2.A00.A03;
        if (bool == null || !bool.booleanValue()) {
            return "feed_timeline_stories_blending";
        }
        return "feed_timeline_stories_netego";
    }

    public final boolean isOrganicEligible() {
        return this.A00.A06.isOrganicEligible();
    }

    public final boolean isSponsoredEligible() {
        return this.A00.A06.isSponsoredEligible();
    }
}
