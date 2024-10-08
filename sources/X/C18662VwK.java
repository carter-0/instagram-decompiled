package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.VwK  reason: case insensitive filesystem */
public final class C18662VwK {
    public static final AnonymousClass0iw A01 = new 0xG("waterfall_ads_manager");
    public final 0wc A00;

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_cancel");
        DbS.A1H(A0e, str);
        A0e.Cgf();
    }

    public final void A02(String str, String str2) {
        0qQ.A0B(str2, 1);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_enter_error");
        DbS.A1H(A0e, str);
        C13989Tnp.A1F(A0e, this, "error_message", str2);
        A0e.Cgf();
    }

    public final void A03(String str, String str2) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_enter");
        C13989Tnp.A1F(A0e, this, "step", str);
        if (str2 != null) {
            C51965G9l.A1I(A0e, str2);
        }
        A0e.Cgf();
    }

    public final void A04(String str, String str2, String str3) {
        0qQ.A0B(str3, 2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_fetch_data");
        DbS.A1J(A0e, str2);
        DbS.A1H(A0e, str);
        C51965G9l.A1I(A0e, str3);
        A0e.Cgf();
    }

    public final void A07(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 0);
        A0B(str, str2, str3, (String) null, str4);
    }

    public final void A08(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_action");
        DbS.A1J(A0e, str2);
        C13989Tnp.A1F(A0e, this, "step", str);
        if (str3 != null) {
            A0e.A9F("m_pk", AnonymousClass7TE.A10(str3));
        }
        if (str4 != null) {
            DbS.A1N(A0e, str4);
        }
        A0e.Cgf();
    }

    public final void A09(String str, String str2, String str3, String str4) {
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_fetch_data_error");
        DbS.A1N(A0e, str2);
        C13989Tnp.A1F(A0e, this, "step", str);
        A0e.AAJ("component", str3);
        A0e.AAJ("error_message", str4);
        A0e.AAJ("error_identifier", (String) null);
        A0e.Cgf();
    }

    public final String A00() {
        String A05 = 1Q9.A01("ads_manager").A05();
        0qQ.A07(A05);
        return A05;
    }

    public final void A05(String str, String str2, String str3) {
        1Q9.A01("ads_manager").A08();
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_tap_entry_point");
        C13989Tnp.A1F(A0e, this, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        DbS.A1H(A0e, str2);
        C51965G9l.A1I(A0e, str3);
        A0e.Cgf();
    }

    public final void A0B(String str, String str2, String str3, String str4, String str5) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_action_error");
        DbS.A1H(A0e, str);
        C13989Tnp.A1F(A0e, this, "action", str2);
        if (str3 != null) {
            A0e.A9F("m_pk", AnonymousClass7TE.A10(str3));
        }
        if (str5 != null) {
            A0e.AAJ("error_message", str5);
        }
        if (str4 != null) {
            DbS.A1N(A0e, str4);
        }
        A0e.Cgf();
    }

    public C18662VwK(UserSession userSession) {
        this.A00 = AnonymousClass0kN.A01(A01, userSession);
    }

    public final void A06(String str, String str2, String str3) {
        AnonymousClass7TG.A1O(str2, str3);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_view_component");
        A0e.AAJ("component", str2);
        DbS.A1N(A0e, str3);
        C13989Tnp.A1F(A0e, this, "step", str);
        A0e.Cgf();
    }

    public final void A0A(String str, String str2, String str3, String str4) {
        AnonymousClass7TG.A1N(str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "ads_manager_tap_component");
        A0e.AAJ("component", str2);
        C13989Tnp.A1F(A0e, this, "step", str);
        if (str3 != null) {
            C51965G9l.A1I(A0e, str3);
        }
        if (str4 != null) {
            0bb r1 = new 0bb();
            r1.A06("suggested_post_reason", str4);
            A0e.AAK(r1, "configurations");
        }
        A0e.Cgf();
    }
}
