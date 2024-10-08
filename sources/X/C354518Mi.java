package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.8Mi  reason: invalid class name and case insensitive filesystem */
public final class C354518Mi extends C314286hx {
    public final UserSession A00;

    public final Set A03() {
        return 00k.A0k(00k.A0X(1Au.A00(this.A00).A01.C1t("recent_emoji_and_stickers")));
    }

    public final void A06(Set set) {
        0xa r2 = 1Au.A00(this.A00).A01;
        0xY AR4 = r2.AR4();
        AR4.ED3("recent_emoji_and_stickers");
        AR4.apply();
        0xY AR42 = r2.AR4();
        AR42.E5h("recent_emoji_and_stickers", set);
        AR42.apply();
    }

    public C354518Mi(UserSession userSession) {
        this.A00 = userSession;
    }
}
