package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.IgZ  reason: case insensitive filesystem */
public final class C57794IgZ implements Runnable {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C57794IgZ(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void run() {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        C238143As r0 = (C238143As) contextualFeedFragment.getScrollingViewProxy();
        if (r0 != null) {
            r0.EaP(true);
        }
        if (!contextualFeedFragment.isLoading()) {
            ContextualFeedFragment.A03(contextualFeedFragment, true, true);
        }
    }
}
