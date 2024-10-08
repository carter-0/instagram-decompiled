package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUU implements AnonymousClass7Q7 {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        HDB hdb = this.A00.A0N;
        if (hdb != null) {
            return hdb.AJe(str);
        }
        DbS.A13();
        throw AnonymousClass00P.createAndThrow();
    }

    public GUU(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final void FK4() {
        HDB hdb = this.A00.A0N;
        if (hdb == null) {
            DbS.A13();
            throw AnonymousClass00P.createAndThrow();
        } else {
            hdb.AV9();
        }
    }
}
