package X;

import com.instagram.user.model.User;
import instagram.features.feed.fragment.ContextualFeedFragment;

public final class GUI implements 27S {
    public final /* synthetic */ ContextualFeedFragment A00;

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        0qQ.A0B(obj, 0);
        return true;
    }

    public GUI(ContextualFeedFragment contextualFeedFragment) {
        this.A00 = contextualFeedFragment;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-31685250);
        C2370736f r5 = (C2370736f) obj;
        int A0D = AnonymousClass7TG.A0D(r5, 522192614);
        if (r5.A03) {
            User user = r5.A00;
            if (user.A1s() && r5.A02) {
                GAR gar = this.A00.A0B;
                if (gar == null) {
                    0qQ.A0F("contextualFeedController");
                    throw AnonymousClass00P.createAndThrow();
                }
                gar.A0M(user);
            }
        }
        AnonymousClass0fD.A0A(-1671936097, A0D);
        AnonymousClass0fD.A0A(1654541274, A03);
    }
}
