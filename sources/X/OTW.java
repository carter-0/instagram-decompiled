package X;

import com.instagram.common.session.UserSession;

public final class OTW {
    public final UserSession A00;
    public final OKF A01;
    public final 2Dm A02;
    public final C70808OMd A03;

    public static final void A00(C254703su r4, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        if (r4 == null) {
            C66584MXp.A16(str2, str4, str3);
        } else if (r4.A0g() == null) {
            0KC.A0C("ArmadilloExpressMessageFetcherV2", 002.A13("Message id is null! To help debug T189852491, message otid is ", str4, ", thread jid is ", str5, ", possible error is ", str3));
        }
    }

    public OTW(UserSession userSession, C70808OMd oMd) {
        this.A00 = userSession;
        this.A03 = oMd;
        this.A01 = (OKF) userSession.A01(OKF.class, new C73661Pha(userSession, 43));
        this.A02 = 2L2.A00(userSession);
    }
}
