package X;

import com.instagram.common.session.UserSession;
import java.util.Set;

public final class KKB extends C314286hx {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new MJ0(this, 31));

    public final Set A03() {
        return 00k.A0k(00k.A0X(C51968G9o.A0o(this.A01).C1t("recent_nametag_emojis")));
    }

    public final void A06(Set set) {
        0xa A0o = C51968G9o.A0o(this.A01);
        0xY AR4 = A0o.AR4();
        AR4.ED3("recent_nametag_emojis");
        AR4.apply();
        JTU.A1E(A0o, "recent_nametag_emojis", set);
    }

    public KKB(UserSession userSession) {
        this.A00 = userSession;
    }
}
