package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7ar  reason: invalid class name and case insensitive filesystem */
public abstract class C334217ar {
    public static final void A01(C53383GnF gnF, 1Fa r9, UserSession userSession, C334157al r11, 1Xj r12, String str, String str2, int i, boolean z) {
        String str3;
        String str4;
        long j;
        String str5;
        if (r11 == C334157al.TAIL_LOADING) {
            str3 = String.valueOf(r12.A0d.A07);
            r9.A0G("max_id", str3);
        } else {
            str3 = "";
        }
        if (r11 == C334157al.HEAD_LOADING) {
            str3 = String.valueOf(r12.A0d.A08);
            r9.A0G("min_id", str3);
        }
        String str6 = gnF.A04;
        boolean z2 = false;
        if (str6 != null && str6.length() > 0) {
            r9.A9m("target_comment_id", str6);
        }
        Integer num = (Integer) gnF.A02;
        if (num != AnonymousClass05K.A0u) {
            r9.A9m("sort_order", C333837aE.A00(num));
        }
        C333797aA r2 = (C333797aA) gnF.A01;
        if (r2 != C333797aA.NOT_SET) {
            0qQ.A0B(r2, 0);
            r9.A9m("comment_filter_param", r2.A00);
        }
        if (r11 == C334157al.INITIAL_LOADING && gnF.A07) {
            r9.A9m("permalink_enabled", "true");
        }
        if (gnF.A08) {
            r9.A9m("can_support_carousel_mentions", "true");
        }
        if (gnF.A05) {
            r9.A9m("can_support_nested_replies", "true");
        }
        r9.A9m("can_support_threading", "true");
        r9.A9m("analytics_module", str);
        r9.A9m("inventory_source", r12.A0C.BIl());
        r9.A9m(AnonymousClass000.A00(603), String.valueOf(i));
        r9.A9m(AnonymousClass000.A00(669), "false");
        r9.A9m("carousel_index", String.valueOf(0));
        if (gnF.A06) {
            r9.A9m("include_preview_comments", "false");
        }
        List list = r12.A0d.A0B.A00;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    User user = ((C247733gp) it.next()).A08;
                    if (user != null) {
                        str4 = user.getId();
                    } else {
                        str4 = null;
                    }
                    if (2R8.A05(userSession, str4)) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z || z2) {
            r9.A03();
            r9.A00 = 1500;
            j = 86400000;
        } else {
            r9.A07(AnonymousClass05K.A0N);
            j = 3000;
        }
        r9.A01 = j;
        StringBuilder sb = new StringBuilder();
        sb.append("comments_");
        sb.append(str2);
        sb.append('_');
        sb.append(r12.getId());
        sb.append('_');
        sb.append(str3);
        sb.append('_');
        sb.append(str6);
        sb.append('_');
        if (num != null) {
            str5 = C333837aE.A01(num);
        } else {
            str5 = "null";
        }
        sb.append(str5);
        sb.append('_');
        sb.append(r2);
        r9.A0A = sb.toString();
    }

    public static final String A00(C46255DSk dSk, UserSession userSession) {
        if (dSk == null || !182.A06(0Tu.A05, userSession, 36321078133400641L)) {
            return null;
        }
        return 00k.A0P(",", "", "", dSk.Ba5(), (0sP) null);
    }
}
