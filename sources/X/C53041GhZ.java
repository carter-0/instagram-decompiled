package X;

import com.instagram.api.schemas.Achievement;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.GhZ  reason: case insensitive filesystem */
public final class C53041GhZ extends 2YL implements JO1 {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C56005HrB A03;
    public final 0V2 A04;
    public final 0V2 A05;
    public final C61770pa A06;
    public final C61770pa A07;

    public C53041GhZ(AnonymousClass0iw r6, UserSession userSession, C56005HrB hrB) {
        AnonymousClass7TF.A1B(userSession, 1, r6);
        this.A02 = userSession;
        this.A01 = r6;
        this.A03 = hrB;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        this.A05 = A012;
        this.A07 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 0, 0);
        this.A04 = A013;
        this.A06 = new 0V1((C262204Co) null, A013);
    }

    public final void A00(C53428GoK goK) {
        0qQ.A0B(goK, 0);
        if (!this.A00) {
            List A002 = IN9.A00(goK.A00);
            UserSession userSession = this.A02;
            AnonymousClass0iw r3 = this.A01;
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "instagram_clips_bottom_sheet_impression");
            if (A0e.isSampled()) {
                DbW.A16(A0e, r3);
                C51969G9p.A16(A0e, 0);
                C51967G9n.A17(A0e);
                A0e.AAJ("bottom_sheet_type", "clips_achievement_combined_list");
                A0e.AAe("achievements", A002);
                A0e.Cgf();
            }
            this.A00 = true;
        }
    }

    public final void Ct8(Achievement achievement) {
        C52236GKd gKd;
        boolean A1V = AnonymousClass7TF.A1V(achievement.A05);
        IN9.A00(AnonymousClass7TE.A1I(achievement));
        UserSession userSession = this.A02;
        AnonymousClass0iw r1 = this.A01;
        AnonymousClass5OC r4 = AnonymousClass5OC.BOTTOM_SHEET;
        if (Boolean.valueOf(A1V) == null) {
            gKd = C52236GKd.A0S;
        } else if (A1V) {
            gKd = C52236GKd.A0V;
        } else {
            gKd = C52236GKd.A0W;
        }
        0Aj A0O = C51972G9s.A0O(r1, userSession);
        if (A0O.isSampled()) {
            DbW.A16(A0O, r1);
            C51974G9v.A0l(A0O, 0, 0);
            C51967G9n.A17(A0O);
            C51965G9l.A19(gKd, A0O);
            C51965G9l.A1C(r4, A0O);
            A0O.Cgf();
        }
        AnonymousClass7TE.A1Z(new C58104ImQ(achievement, this, (AnonymousClass4D7) null, 1), C318116oQ.A00(this));
    }
}
