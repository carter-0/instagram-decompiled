package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class HKO extends C57034IMa {
    public final Integer A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C270694h9 A05;
    public final String A06;

    public final 1OC BCc(UserSession userSession, boolean z) {
        String A012 = C57034IMa.A01(this, userSession);
        String A022 = A02();
        String str = this.A04;
        String str2 = this.A03;
        return I5M.A00(userSession, this.A00, this.A01, "clips/media_notes/", (String) null, A012, A022, str, this.A02, str2);
    }

    public final 1OC C42(UserSession userSession, String str) {
        String str2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        AnonymousClass93Q r3 = AnonymousClass93Q.A00;
        String str3 = this.A04;
        C270694h9 r6 = this.A05;
        GF2 gf2 = this.A01;
        if (gf2 != null) {
            str2 = gf2.A01();
        } else {
            str2 = null;
        }
        return r3.A07((Context) null, (AnonymousClass9JG) null, r6, userSession2, (C290515fR) null, (C54575HJk) null, (Integer) null, (String) null, str, str2, A02(), str3, (String) null, (String) null, (String) null, (String) null, (C62320sa) null, -1.0d, false, false, false, false, false);
    }

    public final String Beh() {
        return this.A06;
    }

    public HKO(C270694h9 r3, UserSession userSession, C270654h5 r5, GF2 gf2, Integer num, Long l, String str, String str2, String str3) {
        super(r5, gf2);
        this.A05 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A00 = num;
        this.A01 = l;
        this.A06 = 002.A0R("clips/media_notes/", userSession.A06);
    }
}
