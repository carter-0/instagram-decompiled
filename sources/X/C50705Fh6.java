package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Fh6  reason: case insensitive filesystem */
public final class C50705Fh6 implements AnonymousClass5IX {
    public final UserSession A00;

    public final boolean E1z(AnonymousClass5IY r5) {
        UserSession userSession = this.A00;
        if (!AnonymousClass7TE.A0q(userSession).getBoolean("has_used_shopping_bag", false) || AnonymousClass7TE.A0q(userSession).getBoolean("has_tapped_on_shopping_bag_menu_option", false)) {
            return false;
        }
        return true;
    }

    public C50705Fh6(UserSession userSession) {
        this.A00 = userSession;
    }
}
