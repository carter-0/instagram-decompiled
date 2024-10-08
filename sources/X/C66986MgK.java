package X;

import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.MgK  reason: case insensitive filesystem */
public final class C66986MgK {
    public final /* synthetic */ ContextualFeedFragment A00;

    public C66986MgK(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final String A00() {
        String str;
        ContextualFeedFragment contextualFeedFragment = this.A00;
        if (contextualFeedFragment.mView == null) {
            return null;
        }
        C238133Ar scrollingViewProxy = contextualFeedFragment.getScrollingViewProxy();
        C227762js r4 = contextualFeedFragment.A06;
        if (r4 == null) {
            str = "_helper";
        } else {
            int B6L = scrollingViewProxy.B6L();
            if (scrollingViewProxy.AnH() > 0 && ((float) scrollingViewProxy.AnC(0).getBottom()) <= r4.A00 - r4.A01) {
                B6L++;
            }
            if (B6L < 0) {
                return null;
            }
            HDB hdb = contextualFeedFragment.A0N;
            str = "adapter";
            if (hdb != null) {
                if (B6L >= hdb.getItemCount()) {
                    return null;
                }
                HDB hdb2 = contextualFeedFragment.A0N;
                if (hdb2 != null) {
                    Object item = hdb2.getItem(B6L);
                    if (item instanceof 1Xj) {
                        return ((1Xj) item).getId();
                    }
                    return null;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
