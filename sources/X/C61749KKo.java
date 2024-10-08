package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.KKo  reason: case insensitive filesystem */
public final class C61749KKo extends C314276hw {
    public final UserSession A00;

    public C61749KKo(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final int A01() {
        return 18;
    }

    public final boolean A07() {
        return true;
    }

    public final Set A03() {
        return 00k.A0j(00k.A0X(1Al.A01(this.A00).A03(1An.A36).C1t("reaction_sticker_recent_emojis")));
    }

    public final void A06(Set set) {
        0xY AR4 = 1Al.A01(this.A00).A03(1An.A36).AR4();
        AR4.E5h("reaction_sticker_recent_emojis", set);
        AR4.apply();
    }
}
