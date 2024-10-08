package X;

import com.instagram.common.session.UserSession;

public final class FC1 {
    public static final C47062Dpx A00(C46475Dfd dfd, UserSession userSession, C54704HPj hPj) {
        String name;
        2D6 A00 = 2D5.A00(userSession);
        0bb r3 = new 0bb();
        boolean A002 = dfd.A00();
        r3.A03(AnonymousClass000.A00(1083), Boolean.valueOf(A002));
        Enum enumR = dfd;
        if (!A002) {
            if (hPj instanceof KYY) {
                name = null;
                r3.A06(AnonymousClass000.A00(1456), name);
                Dbc.A0h(r3, userSession, A00, C363378jd.A08.A04(C47743EFd.A00, userSession));
                return r3;
            } else if (hPj instanceof KYX) {
                enumR = ((KYX) hPj).A00();
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
        name = enumR.name();
        r3.A06(AnonymousClass000.A00(1456), name);
        Dbc.A0h(r3, userSession, A00, C363378jd.A08.A04(C47743EFd.A00, userSession));
        return r3;
    }

    public static final void A01(C46475Dfd dfd, AnonymousClass0iw r11, UserSession userSession, 1Xj r13, C54704HPj hPj, Integer num) {
        String str;
        int intValue = num.intValue();
        if (intValue == 1) {
            str = "crosspost_to_facebook";
        } else if (intValue == 0) {
            str = "recommend_on_facebook";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        String A2n = r13.A2n();
        String A0r = DbX.A0r(r13.A2A(userSession));
        String A0x = DbT.A0x(r13);
        C22031Xty.A05(A00(dfd, userSession, hPj), r11, userSession, (Long) null, (Long) null, "direct_share_sheet", str, A2n, A0r, A0x, (String) null, (String) null, (String) null, (String) null);
    }
}
