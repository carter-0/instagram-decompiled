package X;

import com.instagram.common.session.UserSession;

public abstract class F7A {
    public static final void A01(AnonymousClass0iw r4, UserSession userSession, String str, String str2) {
        AnonymousClass7TF.A1C(str2, 1, r4);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "nme_label_rendering_ig");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", "impression_start");
            DbS.A1M(A0e, str);
            A0e.A7p("is_label_visible", true);
            A0e.A9F("entity_owner_id", Long.valueOf(DbZ.A07(str2)));
            A0e.Cgf();
        }
    }

    public static final void A00(AnonymousClass0iw r3, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1U(str2, userSession, r3);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "ig_nme_benefits");
        if (A0e.isSampled()) {
            A0e.AAJ("event_type", "click");
            A0e.AAJ("benefit_type", "LABEL");
            A0e.AAJ("subject_type", "viewer");
            A0e.AAJ("object_type", "profile");
            A0e.A9F("pbs_owner_id", Long.valueOf(DbZ.A07(str2)));
            DbS.A1M(A0e, str);
            A0e.A9H("extra", DbY.A0p("viewer_id", userSession.A06, AnonymousClass7TE.A1L("profile_id", str2)));
            A0e.Cgf();
        }
    }
}
