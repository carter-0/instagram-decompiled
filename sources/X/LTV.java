package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;
import java.util.List;

public abstract class LTV {
    public static final void A06(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str) {
        Class<ModalActivity> cls = ModalActivity.class;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("source_name", str);
        if (num != null) {
            A1E.put("promoted_section", "CLIMATE");
        }
        C46649DiU A04 = C46649DiU.A04("com.instagram.giving.story_sticker_creation.screen", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0l = false;
        A0N.A0k = false;
        A0N.A0i = true;
        Dbb.A0i(fragmentActivity, C49891FBs.A00(A0N, A04), userSession, cls, "bloks");
    }

    public static final void A07(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        0qQ.A0B(userSession, 0);
        String str7 = str;
        boolean A1Y = DbW.A1Y(str7);
        C46649DiU A04 = C46649DiU.A04("com.instagram.social_impact.fundraiser.nonprofit_creation_details_for_feed.component.view", A00(num, str7, str2, str3, str4, str5, str6, list));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0l = false;
        A0N.A0k = false;
        A0N.A0i = A1Y;
        Dbb.A0i(fragmentActivity, C49891FBs.A00(A0N, A04), userSession, ModalActivity.class, "bloks");
    }

    public static final void A09(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4) {
        UserSession userSession2 = userSession;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        A0A(fragmentActivity, userSession2, str5, str6, str7, str8, true);
        A03(DbT.A05(fragmentActivity), userSession2, str5, str6, str7, str8);
    }

    public static final void A0A(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, boolean z) {
        AnonymousClass7TG.A1O(fragmentActivity, str);
        C46649DiU A04 = C46649DiU.A04("com.instagram.social_impact.fundraiser.personal.component.view", A01(str, str2, str3, str4, z));
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0l = false;
        A0N.A0k = false;
        A0N.A0P = AnonymousClass05K.A01;
        A04.A0D(fragmentActivity, A0N);
    }

    public static final void A0B(FragmentActivity fragmentActivity, UserSession userSession, String str, boolean z) {
        String str2;
        0qQ.A0B(userSession, 0);
        Class<ModalActivity> cls = ModalActivity.class;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("source_name", str);
        if (z) {
            str2 = "True";
        } else {
            str2 = "False";
        }
        A1E.put("has_raise_money_options", str2);
        C46649DiU A04 = C46649DiU.A04("com.instagram.social_impact.fundraiser.nonprofit_creation_for_feed.component.view", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0l = false;
        A0N.A0k = false;
        A0N.A0i = true;
        A0N.A0R = "instagram_fundraiser";
        Dbb.A0i(fragmentActivity, C49891FBs.A00(A0N, A04), userSession, cls, "bloks");
    }

    public static final void A02(Context context, UserSession userSession, String str, String str2, String str3) {
        0qQ.A0B(str, 2);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("fundraiser_id", str);
        A1E.put("source_name", "FEED_POST");
        if (str2 != null) {
            A1E.put("source_owner_igid", str2);
        }
        if (str3 != null) {
            A1E.put("source_media_igid", str3);
        }
        C46649DiU.A04(C273654mx.A00(257), A1E).A0E(context, DbS.A0N(userSession));
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("source_name", "PRE_LIVE");
        C46649DiU A04 = C46649DiU.A04("com.instagram.giving.live_creation.screen", A1E);
        IgBloksScreenConfig A0N = DbS.A0N(userSession);
        A0N.A0l = false;
        A0N.A0k = false;
        A0N.A0i = true;
        A0N.A0R = "instagram_fundraiser";
        Dbb.A0i(fragmentActivity, C49891FBs.A00(A0N, A04), userSession, ModalActivity.class, "bloks");
    }

    public static final void A08(FragmentActivity fragmentActivity, UserSession userSession, Integer num, String str, String str2, String str3, String str4, List list) {
        String A00 = AnonymousClass000.A00(1026);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("charity_id", str);
        A1E.put("source_name", A00);
        if (str2 != null) {
            A1E.put(AnonymousClass000.A00(1463), str2);
        }
        if (num != null) {
            A1E.put(AnonymousClass000.A00(1458), num.toString());
        }
        if (str3 != null) {
            A1E.put(AnonymousClass000.A00(1457), str3);
        }
        if (list != null) {
            A1E.put(AnonymousClass000.A00(1461), list.toString());
        }
        A1E.put(AnonymousClass000.A00(1529), "True");
        if (str4 != null) {
            A1E.put(Pxd.A00(14), str4);
        }
        C55175HdR.A00(DbT.A05(fragmentActivity), userSession, AnonymousClass000.A00(2879), A1E, 60);
    }

    public static final HashMap A00(Integer num, String str, String str2, String str3, String str4, String str5, String str6, List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("charity_id", str);
        A1E.put("source_name", str2);
        if (str3 != null) {
            A1E.put(AnonymousClass000.A00(1463), str3);
        }
        if (num != null) {
            A1E.put(AnonymousClass000.A00(1458), num.toString());
        }
        if (str4 != null) {
            A1E.put(AnonymousClass000.A00(1457), str4);
        }
        if (list != null) {
            A1E.put(AnonymousClass000.A00(1461), list.toString());
        }
        if (str5 != null) {
            A1E.put("initial_description", str5);
        }
        A1E.put(AnonymousClass000.A00(1529), "True");
        if (str6 != null) {
            A1E.put(Pxd.A00(14), str6);
        }
        return A1E;
    }

    public static final HashMap A01(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("fundraiser_id", str);
        A1E.put("source_name", str2);
        if (z) {
            str5 = "True";
        } else {
            str5 = "False";
        }
        A1E.put(AnonymousClass000.A00(1521), str5);
        A1E.put("source_owner_igid", str3);
        A1E.put("source_media_igid", str4);
        return A1E;
    }

    public static final void A03(Context context, UserSession userSession, String str, String str2, String str3, String str4) {
        C359638dF.A01(context, new C359618dD(userSession), "com.instagram.social_impact.fundraiser.personal.component.view", (String) null, A01(str, str2, str3, str4, DbW.A1Y(str)));
    }

    public static final void A04(Context context, UserSession userSession, String str, String str2, String str3, String str4) {
        Context context2 = context;
        C359638dF.A04(context2, new C359618dD(userSession), "com.instagram.social_impact.fundraiser.personal.component.view", A01(str, str2, str3, str4, DbW.A1Y(str)), 60);
    }
}
