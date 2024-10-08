package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.I5c  reason: case insensitive filesystem */
public final class C56624I5c {
    public static final C56624I5c A00 = new Object();

    public static final void A01(Fragment fragment, UserSession userSession, 1Xj r13, AnonymousClass4DU r14, Integer num, String str, String str2, String str3) {
        Fragment fragment2 = fragment;
        UserSession userSession2 = userSession;
        1Xj r6 = r13;
        AnonymousClass4DU r7 = r14;
        C51974G9v.A1O(fragment, userSession, r14, r13);
        Integer num2 = num;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (182.A06(0Tu.A05, userSession, 36319025139030836L)) {
            C360678ey A05 = C359988do.A05(userSession, "com.instagram.why_am_i_seeing_this.bottom_sheet.action", A00(userSession2, r6, r7, num2, str4, str5, str6));
            A05.A00(new E85(5, fragment2, r14, userSession));
            ((AnonymousClass4D6) fragment2).schedule(A05);
            return;
        }
        Context context = fragment2.getContext();
        HashMap A002 = A00(userSession2, r6, r7, num2, str4, str5, str6);
        C359638dF.A00(context, new C359618dD(userSession2), "com.instagram.why_am_i_seeing_this.bottom_sheet.action", 002.A0R("waist_preload_prefix_", r13.getId()), A002, 0).A9V(new FVW(fragment2, userSession2, r7));
    }

    public final void A02(Context context, UserSession userSession, 1Xj r13, AnonymousClass4DU r14, Integer num, String str, String str2, String str3) {
        UserSession userSession2 = userSession;
        if (!182.A06(0Tu.A05, userSession, 36319025139030836L)) {
            HashMap A002 = A00(userSession2, r13, r14, num, str, str2, str3);
            Context context2 = context;
            C359638dF.A03(context2, new C359618dD(userSession), "com.instagram.why_am_i_seeing_this.bottom_sheet.action", 002.A0R("waist_preload_prefix_", r13.getId()), A002, 60);
        }
    }

    public static final HashMap A00(UserSession userSession, 1Xj r4, AnonymousClass4DU r5, Integer num, String str, String str2, String str3) {
        String str4;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("media_id", r4.A30());
        User A2A = r4.A2A(userSession);
        if (A2A != null) {
            A1E.put("author_id", A2A.getId());
            A1E.put("inventory_source", C51965G9l.A0t(r4));
            A1E.put("waist_data", r4.A0C.CG5());
            A1E.put("ranking_info_token", DbT.A0x(r4));
            A1E.put("container_module", r5.getModuleName());
            A1E.put("client_position", str);
            A1E.put(AnonymousClass000.A00(1742), str2);
            A1E.put("ranking_session_id", str3);
            A1E.put("recommendation_data", r4.A0C.BkE());
            switch (num.intValue()) {
                case 0:
                    str4 = "on_impression";
                    break;
                case 1:
                    str4 = "three_dot_menu";
                    break;
                default:
                    str4 = "media_topic_header";
                    break;
            }
            A1E.put("event_source", str4);
            A1E.put("interest", r4.A2g());
            return A1E;
        }
        throw AnonymousClass7TE.A0y();
    }
}
