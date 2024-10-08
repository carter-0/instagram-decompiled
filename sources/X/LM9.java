package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

public final class LM9 {
    public final 0wc A00;

    public static final 1Ln A00(LiveUserPaySupportTier liveUserPaySupportTier, M0V m0v, LM9 lm9, String str, String str2, String str3, String str4, List list, long j) {
        Long l;
        Long l2;
        String str5;
        String pk;
        User user;
        1Ln A0U = C51965G9l.A0U(AnonymousClass7TE.A0e(lm9.A00, C273654mx.A00(2833)), 230);
        A0U.A0Q("a_pk", DbV.A0q(str2));
        A0U.A0m(str);
        A0U.A0R(AnonymousClass000.A00(360), str4);
        String str6 = null;
        if (m0v == null || (user = m0v.A08) == null) {
            l = null;
        } else {
            l = C51972G9s.A0h(user);
        }
        A0U.A0Q("ca_pk", l);
        if (m0v == null || (pk = m0v.getPk()) == null) {
            l2 = null;
        } else {
            l2 = AnonymousClass7TE.A10(pk);
        }
        A0U.A0Q("comment_id", l2);
        if (m0v == null || (str5 = m0v.A0D) == null) {
            str5 = "";
        }
        A0U.A0R("comment_text", str5);
        if (m0v != null) {
            str6 = C62584KiH.A0A.A01;
        }
        A0U.A0R("comment_type", str6);
        A0U.A0Q(TraceFieldType.BroadcastId, AnonymousClass7TE.A10(str3));
        A0U.A0P("live_position", Double.valueOf((double) j));
        A0U.A0S("friend_chat_ids", list);
        if (liveUserPaySupportTier != null) {
            A0U.A0R("support_tier", liveUserPaySupportTier.toString());
        }
        return A0U;
    }

    public LM9(AnonymousClass0iw r2, UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }
}
