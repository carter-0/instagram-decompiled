package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUL implements AnonymousClass57T {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final void D21(1Xj r8, AnonymousClass3W1 r9) {
        ContextualFeedFragment contextualFeedFragment = this.A00;
        User A2A = r8.A2A(ContextualFeedFragment.A00(contextualFeedFragment));
        if (A2A != null && A2A.A0G() == FollowStatus.A06) {
            1OC A002 = C54964HZu.A00(ContextualFeedFragment.A00(contextualFeedFragment), A2A.getId());
            A002.A00 = new H4H(1, A2A, contextualFeedFragment, r9, false);
            contextualFeedFragment.schedule(A002);
        }
    }

    public GUL(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }
}
