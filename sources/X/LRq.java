package X;

import com.instagram.common.session.UserSession;

public abstract class LRq {
    public static final void A03(UserSession userSession, String str, String str2, String str3) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "avatars_core_experience_instant_avatars_entry_point_submit");
        if (A0e.isSampled()) {
            0bb r2 = new 0bb();
            r2.A06("raw_referrer_surface", str);
            r2.A06("use_case", str2);
            r2.A03(AnonymousClass000.A00(295), false);
            JTR.A1I(A0e, r2, str3);
            A0e.Cgf();
        }
    }

    public static final void A00(UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "avatars_core_experience_avatar_editor_entry_point_impression");
        if (A0e.isSampled()) {
            0bb r1 = new 0bb();
            r1.A06("raw_referrer_surface", str);
            A0e.AAK(r1, "event_data");
            A0e.Cgf();
        }
    }

    public static final void A01(UserSession userSession, String str) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "avatars_core_experience_instant_avatars_entry_point_impression");
        if (A0e.isSampled()) {
            0bb r1 = new 0bb();
            r1.A06("raw_referrer_surface", str);
            A0e.AAK(r1, "event_data");
            A0e.Cgf();
        }
    }

    public static final void A02(UserSession userSession, String str, String str2) {
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0Q(userSession), "avatars_core_experience_avatar_editor_entry_point_submit");
        if (A0e.isSampled()) {
            String A00 = AnonymousClass000.A00(2938);
            0bb r1 = new 0bb();
            r1.A06("raw_referrer_mechanism", A00);
            if (str2 != null) {
                r1.A06("raw_referrer_surface", str);
                JTR.A1I(A0e, r1, str2);
            } else {
                r1.A06("raw_referrer_surface", str);
                A0e.AAK(r1, "event_data");
            }
            A0e.Cgf();
        }
    }
}
