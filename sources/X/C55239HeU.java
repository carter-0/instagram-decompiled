package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HeU  reason: case insensitive filesystem */
public abstract class C55239HeU {
    public static void A00(C267324bN r8, C52058GDe gDe, UserSession userSession, 1Xl r11, AnonymousClass4DU r12, Boolean bool) {
        long j;
        Long A10;
        0qQ.A0B(r11, 0);
        0wc A01 = AnonymousClass0kN.A01(r12, userSession);
        C254523sc A03 = C254513sb.A03(userSession, r11, r12, "instagram_ad_overlay_hide_button");
        1Xj BPf = r11.BPf();
        0Aj A0e = AnonymousClass7TE.A0e(A01, "instagram_ad_overlay_hide_button");
        0jB A012 = A03.A01();
        if (A0e.isSampled()) {
            A0e.A9F("is_dark_mode", Long.valueOf(G9t.A0k(AnonymousClass1GD.A03() ? 1 : 0)));
            String str = null;
            A0e.AAJ("radio_type", C51966G9m.A1C(C271774jZ.A6o, A012));
            A0e.A7p("production_build", true);
            A0e.AAJ("source_of_action", r12.getModuleName());
            C51965G9l.A1O(A0e, C51966G9m.A1C(C271774jZ.A9i, A012));
            C51973G9u.A10(A0e);
            A0e.A9F("client_position", C51966G9m.A13(C271774jZ.A3r, A012));
            C51971G9r.A17(A0e, gDe.A09());
            C51965G9l.A1R(A0e, C51966G9m.A1C(C271774jZ.A1C, A012));
            String A07 = C231122qu.A07(userSession, BPf);
            if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51970G9q.A17(A0e, j);
            0qQ.A0B(BPf, 0);
            A0e.AAJ("delivery_flags", C243413Yr.A00(BPf.A0e));
            A0e.A7p("is_acp_delivered", false);
            A0e.AAJ("a_pk", C51968G9o.A15(BPf.A2A(userSession)));
            C51974G9v.A0p(A0e, BPf, "m_pk", C294185m0.A09(BPf));
            A0e.A9F("m_ts", Long.valueOf(BPf.A1A()));
            C51965G9l.A1L(A0e, C294185m0.A07(userSession, BPf, r12));
            A0e.A9F("media_loading_progress", C51966G9m.A13(C271774jZ.A5P, A012));
            AnonymousClass3OA A072 = r8.A07();
            if (A072 != null) {
                str = A072.A0f;
            }
            A0e.AAJ("host_media_pk", str);
            if (bool != null) {
                A0e.A7p("is_swipe_to_dismiss", Boolean.valueOf(bool.booleanValue()));
            }
            A0e.Cgf();
        }
    }
}
