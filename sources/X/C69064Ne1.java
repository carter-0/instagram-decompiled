package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Ne1  reason: case insensitive filesystem */
public final class C69064Ne1 extends C252733pa {
    public final UserSession A00;
    public final C249513ju A01;
    public final AnonymousClass0r6 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C69064Ne1(UserSession userSession) {
        super("Direct", AnonymousClass43D.A00(1695661322));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        1HR A1G = JTO.A1G(0);
        this.A01 = A1G;
        this.A02 = 0u9.A04(A1G);
    }

    public final void A01(String str, String str2) {
        0qQ.A0B(str, 0);
        C262224Cq r0 = this.A01;
        AnonymousClass7TE.A1Z(new MFe((Object) this, str2, str, (AnonymousClass4D7) null, 15), r0);
    }

    public final void A02(String str, boolean z, String str2) {
        0qQ.A0B(str, 0);
        C262224Cq r0 = this.A01;
        AnonymousClass7TE.A1Z(new C66150MEd(this, str2, str, (AnonymousClass4D7) null, 2, z), r0);
    }

    public final AnonymousClass0r6 A00(N49 n49, N49 n492, N49 n493, String str) {
        String str2;
        1NY A0N;
        String A002;
        1OC A0S;
        if (n492 != null) {
            UserSession userSession = this.A00;
            str2 = n492.A00;
            A0N = DbU.A0N(userSession);
            A0N.A0A("direct_v2/join_thread_via_story_join_chat/");
            A002 = "story_id";
        } else if (str != null) {
            1NY A0N2 = DbU.A0N(this.A00);
            A0N2.A0A("direct_v2/join_thread_via_note_chat/");
            A0N2.A9m("note_id", str);
            A0S = DbT.A0S(A0N2, NH0.class, OQN.class);
            return A0S.A03(1695661322);
        } else if (n49 != null) {
            UserSession userSession2 = this.A00;
            String str3 = n49.A00;
            String str4 = n49.A01;
            A0N = DbU.A0N(userSession2);
            A0N.A0A("direct_v2/join_thread_via_group_link/");
            A0N.A9m("group_link_hash", str3);
            A0N.A0R(NH0.class, OQN.class);
            if (str4 != null) {
                A0N.A9m("group_link_source", str4);
            }
            A0S = A0N.A0M();
            return A0S.A03(1695661322);
        } else if (n493 == null) {
            return null;
        } else {
            UserSession userSession3 = this.A00;
            String str5 = n493.A01;
            str2 = n493.A00;
            A0N = DbU.A0N(userSession3);
            C66583MXo.A1F(A0N, "direct_v2/join_pinned_subscriber_social_channel/", str5);
            A002 = AnonymousClass000.A00(1341);
        }
        A0N.A9m(A002, str2);
        A0N.A0R(NH0.class, OQN.class);
        A0S = A0N.A0M();
        return A0S.A03(1695661322);
    }
}
