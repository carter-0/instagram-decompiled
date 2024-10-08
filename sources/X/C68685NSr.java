package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.NSr  reason: case insensitive filesystem */
public final class C68685NSr extends C314286hx {
    public final UserSession A00;

    public final Set A03() {
        return 00k.A0k(00k.A0X(AnonymousClass7TE.A0q(this.A00).C1t("recent_direct_emoji_reactions")));
    }

    public final void A06(Set set) {
        0xa A0q = AnonymousClass7TE.A0q(this.A00);
        0xY AR4 = A0q.AR4();
        AR4.ED3("recent_direct_emoji_reactions");
        AR4.apply();
        JTU.A1E(A0q, "recent_direct_emoji_reactions", set);
    }

    public C68685NSr(UserSession userSession) {
        this.A00 = userSession;
    }
}
