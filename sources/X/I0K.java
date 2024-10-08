package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class I0K {
    public static final I0K A00 = new Object();

    public final void A00(AnonymousClass0iw r7, UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        Long l;
        Long l2;
        Long l3;
        User A11;
        1Xj A0U = DbV.A0U(userSession, str);
        String str6 = null;
        if (str3 == null) {
            if (A0U == null || (A11 = C51966G9m.A11(A0U)) == null) {
                str3 = null;
            } else {
                str3 = A11.getId();
            }
        }
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "barcelona_post_tap");
        CharSequence charSequence = (CharSequence) DbV.A18(str, "_").get(0);
        if (charSequence.length() == 0) {
            charSequence = "0";
        }
        G9t.A1J(A0e, (String) charSequence);
        C51969G9p.A19(A0e, r7);
        C51965G9l.A1K(A0e, DbY.A0a());
        C51965G9l.A1H(A0e, C51972G9s.A0j(str3));
        if (str2 != null) {
            l = DbV.A0q(C51965G9l.A0u(str2));
        } else {
            l = null;
        }
        A0e.A9F("repost_media_id", l);
        C51976G9y.A0V(A0e, new 0bb());
        if (str4 != null) {
            l2 = C51971G9r.A0n(0, C51965G9l.A0u(str4));
        } else {
            l2 = null;
        }
        A0e.A9F("barcelona_source_reply_id", l2);
        if (str5 != null) {
            l3 = C51971G9r.A0n(0, C51965G9l.A0u(str5));
        } else {
            l3 = null;
        }
        A0e.A9F("barcelona_source_quote_post_id", l3);
        if (A0U != null) {
            str6 = DbT.A0x(A0U);
        }
        C51969G9p.A1D(A0e, str6);
    }
}
