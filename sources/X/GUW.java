package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUW implements AnonymousClass36F {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final boolean AJb(1Xj r2) {
        0qQ.A0B(r2, 0);
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.A0E(r2);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DQv(1Xj r4) {
        0qQ.A0B(r4, 0);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        HDB hdb = contextualFeedFragment.A0N;
        if (hdb != null) {
            hdb.Cs9(r4);
            HDB hdb2 = contextualFeedFragment.A0N;
            if (hdb2 != null) {
                hdb2.AV9();
                return;
            }
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public GUW(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }
}
