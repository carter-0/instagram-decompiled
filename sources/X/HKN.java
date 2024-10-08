package X;

import com.instagram.common.session.UserSession;

public final class HKN extends C57034IMa {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final 1OC BCc(UserSession userSession, boolean z) {
        String A012 = C57034IMa.A01(this, userSession);
        String A022 = A02();
        String str = this.A03;
        String str2 = this.A02;
        return I5M.A00(userSession, (Integer) null, this.A00, "clips/media_notes/", (String) null, A012, A022, str, this.A01, str2);
    }

    public final 1OC C42(UserSession userSession, String str) {
        String A012 = C57034IMa.A01(this, userSession);
        String A022 = A02();
        String str2 = this.A03;
        String str3 = this.A02;
        return I5M.A00(userSession, (Integer) null, this.A00, "clips/media_notes/", str, A012, A022, str2, this.A01, str3);
    }

    public final String Beh() {
        return this.A04;
    }

    public HKN(UserSession userSession, C270654h5 r4, GF2 gf2, Long l, String str, String str2, String str3) {
        super(r4, gf2);
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A00 = l;
        this.A04 = 002.A0R("clips/media_notes/", userSession.A06);
    }
}
