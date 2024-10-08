package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUN implements C230722q8 {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final void DqZ() {
    }

    public GUN(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void Dqa() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        if (!contextualFeedFragment.A0V && !contextualFeedFragment.A0W) {
            GAQ gaq = contextualFeedFragment.A0G;
            if (gaq == null) {
                0qQ.A0F("feedMediaLoadingTracker");
                throw AnonymousClass00P.createAndThrow();
            } else {
                gaq.A08((1Xj) null, false);
            }
        }
    }
}
