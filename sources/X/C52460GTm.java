package X;

import com.instagram.common.session.UserSession;
import instagram.features.feed.fragment.ContextualFeedFragment;

/* renamed from: X.GTm  reason: case insensitive filesystem */
public final class C52460GTm extends C322186vO {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final boolean A00(1Xj r5) {
        0qQ.A0B(r5, 0);
        ContextualFeedFragment contextualFeedFragment = this.A00;
        GAR gar = contextualFeedFragment.A0B;
        if (gar != null) {
            if (gar.A0d()) {
                return r5.A5x();
            }
            if (!super.Esp(r5) || r5.A1u() != 1sw.A05) {
                return false;
            }
            GAR gar2 = contextualFeedFragment.A0B;
            if (gar2 != null) {
                if (!gar2.A0h(r5)) {
                    return false;
                }
                return true;
            }
        }
        0qQ.A0F("contextualFeedController");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52460GTm(UserSession userSession, ContextualFeedFragment contextualFeedFragment) {
        super(userSession);
        this.A00 = contextualFeedFragment;
    }
}
