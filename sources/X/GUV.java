package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUV implements C230922qa {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final void Ds7(C300555xO r3) {
        String str;
        0qQ.A0B(r3, 0);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        C230882qT r1 = contextualFeedFragment.A0K;
        if (r1 == null) {
            str = "quickPromotionTooltipsController";
        } else {
            C231002qi r0 = contextualFeedFragment.A0J;
            if (r0 == null) {
                str = "quickPromotionDelegate";
            } else {
                r1.A01(r0, r3);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public GUV(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void DVk(C300555xO r2) {
        C230882qT r0 = this.A00.A0K;
        if (r0 == null) {
            0qQ.A0F("quickPromotionTooltipsController");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r0.A02 = r2;
        }
    }
}
