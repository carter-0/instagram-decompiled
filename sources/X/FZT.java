package X;

import com.instagram.common.session.UserSession;

public final class FZT implements C250603lj {
    public final UserSession A00;
    public final AnonymousClass4DU A01;

    public final void ATF(AnonymousClass30Y r9, C252093oY r10) {
        EZb eZb;
        AnonymousClass7TF.A1H(r9, r10);
        if (r10.CEk(r9).intValue() == 0) {
            Object obj = r9.A03;
            0qQ.A06(obj);
            C49508Ewn ewn = (C49508Ewn) obj;
            UserSession userSession = this.A00;
            AnonymousClass4DU r6 = this.A01;
            String str = ewn.A00;
            String str2 = ewn.A01;
            boolean equals = str.equals(str2);
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "ig_creator_connections_events");
            DbS.A1I(A0e, "impression");
            A0e.A8M(C271174i4.A00(userSession), "project");
            if (equals) {
                eZb = EZb.SELF_PROFILE;
            } else {
                eZb = EZb.PROFILE;
            }
            A0e.A8M(eZb, "screen");
            A0e.AAJ("target", "badge");
            A0e.Cgf();
            0Aj A0e2 = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "instagram_open_to_collab_surface_profile_badge_impression");
            if (A0e2.isSampled()) {
                A0e2.A9F(C273654mx.A00(116), 00y.A0n(10, str));
                A0e2.A9F(C273654mx.A00(410), 00y.A0n(10, str2));
                A0e2.Cgf();
            }
        }
    }

    public FZT(UserSession userSession, AnonymousClass4DU r2) {
        this.A00 = userSession;
        this.A01 = r2;
    }
}
