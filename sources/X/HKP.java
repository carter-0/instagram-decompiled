package X;

import com.instagram.common.session.UserSession;

public final class HKP extends C57034IMa {
    public final UserSession A00;
    public final C270654h5 A01;
    public final GF2 A02;
    public final String A03;
    public final String A04;

    public final 1OC BCc(UserSession userSession, boolean z) {
        return A00(this, (String) null);
    }

    public static final 1OC A00(HKP hkp, String str) {
        String str2;
        UserSession userSession = hkp.A00;
        GF2 gf2 = hkp.A01;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        return I5M.A01(userSession, "clips/connected/", str, str2, hkp.A02(), hkp.A03);
    }

    public final String Beh() {
        return this.A04;
    }

    public HKP(UserSession userSession, C270654h5 r4, GF2 gf2, String str) {
        super(r4, gf2);
        this.A00 = userSession;
        this.A02 = gf2;
        this.A01 = r4;
        this.A03 = str;
        this.A04 = 002.A0R("clips/connected/", userSession.A06);
    }

    public final 1OC C42(UserSession userSession, String str) {
        return A00(this, str);
    }
}
