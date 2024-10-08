package X;

import com.instagram.common.session.UserSession;

public final class OUZ {
    public static final OUZ A00 = new Object();

    public final int A00(UserSession userSession) {
        C69338Njd njd;
        int A04 = DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36605611126953238L);
        if (A04 != 0) {
            if (A04 == 1) {
                njd = C69338Njd.DAILY;
            } else if (A04 == 2) {
                njd = C69338Njd.TWICE_A_WEEK;
            } else if (A04 == 3) {
                njd = C69338Njd.THRICE_A_WEEK;
            }
            return njd.A00;
        }
        njd = C69338Njd.A04;
        return njd.A00;
    }
}
