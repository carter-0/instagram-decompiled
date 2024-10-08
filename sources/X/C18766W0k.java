package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.W0k  reason: case insensitive filesystem */
public abstract class C18766W0k {
    public static 0xF A00(Hashtag hashtag) {
        0jB r0 = new 0jB();
        if (hashtag != null) {
            A03(r0, hashtag);
        }
        return r0.A00();
    }

    public static void A02(0xI r2, C16672Uz8 uz8, int i) {
        r2.A07(C298085sr.A00, uz8.toString());
        r2.A0B("tab_index", Long.valueOf((long) i));
    }

    public static void A03(0jB r2, Hashtag hashtag) {
        r2.A04(C298085sr.A02, hashtag.getId());
        r2.A04(C298085sr.A03, hashtag.getName());
        r2.A04(C298085sr.A01, C281965Ag.A02(hashtag));
    }

    public static void A01(0xI r3, UserSession userSession) {
        0xE A00;
        AnonymousClass3LV r1;
        2cc A002 = C71342cb.A00(userSession);
        String str = A002.A05;
        int i = 0;
        if (!(str == null || (r1 = (AnonymousClass3LV) A002.A0M.get(str)) == null)) {
            i = r1.A00;
        }
        r3.A08(Integer.valueOf(i), AnonymousClass000.A00(709));
        2cc A003 = C71342cb.A00(userSession);
        String str2 = A003.A05;
        if (str2 == null) {
            A00 = null;
        } else {
            A00 = 2cc.A00(A003, str2);
        }
        r3.A06(A00, "nav_stack");
    }
}
