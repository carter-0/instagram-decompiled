package X;

import com.instagram.common.session.UserSession;

public abstract class VC5 {
    public static final void A00(UserSession userSession, C45417Cvx cvx, AnonymousClass4DU r7, boolean z) {
        DbY.A1S(userSession, r7);
        C254523sc r1 = new C254523sc(r7, 002.A0R("instagram_ad_", "survey_primer_response"));
        r1.A78 = cvx.A01;
        Boolean valueOf = Boolean.valueOf(z);
        r1.A1q = valueOf;
        r1.A7J = cvx.A03;
        C51972G9s.A1A(r1);
        if (!C271764jY.A00(userSession, r1, r7, AnonymousClass05K.A00)) {
            0xI A00 = 0xI.A00(r7, 002.A0R("instagram_ad_", "survey_primer_response"));
            A00.A0C("survey_id", cvx.A01);
            A00.A09("responses", valueOf);
            A00.A0C("tracking_token", cvx.A03);
            DbU.A1R(A00, userSession);
        }
    }
}
