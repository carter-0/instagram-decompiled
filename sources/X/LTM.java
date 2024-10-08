package X;

import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class LTM {
    public static void A01(AnonymousClass0iw r4, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "ig_cg_add_standalone_fundraiser_pre_live");
        A0e.AAJ("source_name", "PRE_LIVE");
        if (str != null) {
            A0e.A9F("fundraiser_id", DbV.A0q(str));
        }
        A0e.Cgf();
    }

    public static void A00(AnonymousClass0iw r2, UserSession userSession, Exception exc, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "ig_cg_fundraiser_exception");
        if (A0e.isSampled()) {
            String A0l = JTS.A0l(exc);
            if (str != null) {
                A0e.A9F("sticker_id", DbV.A0q(str));
            }
            A0e.AAJ("exception_name", exc.getClass().getName());
            A0e.AAJ("exception_message", exc.getMessage());
            A0e.AAJ("exception_stack", A0l);
            A0e.Cgf();
        }
    }

    public static void A02(AnonymousClass0iw r1, UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), AnonymousClass000.A00(637));
        A0e.AAJ("source_name", str);
        A0e.A8M(XSG.IG_STICKER_FOR_CHARITY, "fundraiser_type");
        A0e.Cgf();
    }

    public static void A03(AnonymousClass0iw r6, UserSession userSession, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nonprofit_id", str2);
        A07(r6, userSession, "fundraiser_creation_nudge_dialog_add_fundraiser", str, (String) null, A1E);
    }

    public static void A04(AnonymousClass0iw r6, UserSession userSession, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nonprofit_id", str2);
        A07(r6, userSession, "fundraiser_creation_nudge_dialog_cancel", str, (String) null, A1E);
    }

    public static void A05(AnonymousClass0iw r7, UserSession userSession, String str, String str2) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nonprofit_id", str2);
        A06(r7, userSession, "fundraiser_creation_nudge_dialog", str, (String) null, (String) null, A1E);
    }

    public static void A06(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), "ig_cg_generic_impression");
        A0e.AAJ("feature", str);
        A0e.AAJ("source_name", str2);
        if (str3 != null) {
            A0e.A9F(C273654mx.A00(963), DbV.A0q(str3));
        }
        if (str4 != null) {
            A0e.A9F("fundraiser_id", DbV.A0q(str4));
        }
        if (map != null) {
            A0e.A9H("attributes", map);
        }
        A0e.Cgf();
    }

    public static void A07(AnonymousClass0iw r1, UserSession userSession, String str, String str2, String str3, Map map) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r1, userSession), AnonymousClass000.A00(1432));
        A0e.AAJ("feature", str);
        A0e.AAJ("source_name", str2);
        if (str3 != null) {
            A0e.A9F("fundraiser_id", DbV.A0q(str3));
        }
        if (map != null) {
            A0e.A9H("attributes", map);
        }
        A0e.Cgf();
    }

    public static void A08(AnonymousClass0iw r7, UserSession userSession, String str, List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("nonprofit_id", TextUtils.join(",", list));
        A06(r7, userSession, "fundraiser_creation_nudge", str, (String) null, (String) null, A1E);
    }
}
