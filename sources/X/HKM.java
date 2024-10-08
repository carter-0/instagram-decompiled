package X;

import com.instagram.common.session.UserSession;

public final class HKM extends C57034IMa {
    public final String A00;
    public final String A01;
    public final String A02;

    public final 1OC BCc(UserSession userSession, boolean z) {
        return I5M.A00(userSession, (Integer) null, C51971G9r.A0m(), "clips/connected/", (String) null, C57034IMa.A01(this, userSession), A02(), this.A00, this.A01, (String) null);
    }

    public final 1OC C42(UserSession userSession, String str) {
        return I5M.A01(userSession, "clips/connected/", str, C57034IMa.A01(this, userSession), A02(), this.A00);
    }

    public final String Beh() {
        return this.A02;
    }

    public HKM(UserSession userSession, C270654h5 r4, GF2 gf2, String str, String str2) {
        super(r4, gf2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = 002.A0R("clips/connected/", userSession.A06);
    }
}
