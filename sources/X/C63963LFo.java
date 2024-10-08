package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LFo  reason: case insensitive filesystem */
public final class C63963LFo {
    public final 0wc A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final void A00(C62671KkX kkX) {
        0qQ.A0B(kkX, 0);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_action_private_list");
        if (A0e.isSampled()) {
            C60781JrC.A00(A0e, "create_list");
            DbS.A1F(kkX, A0e);
            A0e.A9F("private_list_id", (Long) null);
            A0e.AAJ("private_list_name", (String) null);
            A0e.Cgf();
        }
    }

    public final void A01(C62671KkX kkX) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_action_private_list");
        if (A0e.isSampled()) {
            C60781JrC.A00(A0e, "view_lists");
            DbS.A1F(kkX, A0e);
            A0e.A9F("private_list_id", (Long) null);
            A0e.AAJ("private_list_name", (String) null);
            A0e.Cgf();
        }
    }

    public C63963LFo(AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = AnonymousClass0kN.A01(r2, userSession);
    }

    public final void A02(C62671KkX kkX, String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "instagram_action_private_list");
        if (A0e.isSampled()) {
            C60781JrC.A00(A0e, "edit_list");
            DbS.A1F(kkX, A0e);
            JTU.A0z(A0e, str, str2);
        }
    }
}
