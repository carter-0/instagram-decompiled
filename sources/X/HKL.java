package X;

import com.instagram.common.session.UserSession;

public final class HKL extends C57034IMa {
    public final String A00;
    public final String A01;

    public final 1OC BCc(UserSession userSession, boolean z) {
        return I5M.A01(userSession, "clips/star_search_only/", (String) null, C57034IMa.A01(this, userSession), A02(), this.A00);
    }

    public final 1OC C42(UserSession userSession, String str) {
        return I5M.A01(userSession, "clips/star_search_only/", str, C57034IMa.A01(this, userSession), A02(), this.A00);
    }

    public final String Beh() {
        return this.A01;
    }

    public HKL(UserSession userSession, C270654h5 r4, GF2 gf2, String str) {
        super(r4, gf2);
        this.A00 = str;
        this.A01 = 002.A0R("clips/star_search_only/", userSession.A06);
    }
}
