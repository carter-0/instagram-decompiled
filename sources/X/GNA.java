package X;

import com.instagram.common.session.UserSession;

public final class GNA extends C230622pv {
    public 07T A00;
    public 07T A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass93U A04;
    public final AnonymousClass07V A05;
    public final AnonymousClass07V A06;

    public GNA(AnonymousClass07V r10, AnonymousClass07V r11, UserSession userSession, AnonymousClass4DU r13, AnonymousClass93U r14) {
        super(0, 0.5f);
        this.A06 = r10;
        this.A05 = r11;
        this.A03 = r13;
        this.A02 = userSession;
        this.A04 = r14;
        032 A002 = AnonymousClass0Zq.A00(new AnonymousClass9K3((Object) r10, (AnonymousClass4D7) null, 15, 42));
        AnonymousClass4CZ r0 = AnonymousClass12W.A00;
        AnonymousClass134 A0P = AnonymousClass12y.A00.A0P();
        AnonymousClass11O.A03(C71772f0.A00(r10), new C61860pz(new C58100ImM(this, (AnonymousClass4D7) null, 2), 11M.A01(A0P, A002)));
        AnonymousClass11O.A03(C71772f0.A00(r10), new C61860pz(new C58100ImM(this, (AnonymousClass4D7) null, 3), 11M.A01(A0P, AnonymousClass0Zq.A00(new AnonymousClass9K3((Object) r11, (AnonymousClass4D7) null, 15, 42)))));
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj, long j, Object obj2) {
        String str;
        C52058GDe gDe = (C52058GDe) obj2;
        0qQ.A0B(gDe, 1);
        07T r2 = this.A01;
        07T r1 = 07T.ON_PAUSE;
        if (r2 != r1 && r2 != 07T.ON_STOP) {
            str = "IN_VIEWER_DISMISS";
        } else if (this.A00 == r1 || r2 == 07T.ON_STOP) {
            str = "USER_LEFT_APP";
        } else {
            str = "USER_LEFT_REEL_VIEWER";
        }
        AnonymousClass4DU r5 = this.A03;
        UserSession userSession = this.A02;
        AnonymousClass93U r4 = this.A04;
        int A09 = gDe.A09();
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "instagram_clips_ghost_screen_time_spent");
        DbW.A16(A0e, r5);
        C51969G9p.A16(A0e, A09);
        C51970G9q.A1E(A0e, r4);
        A0e.A9F("timespent", Long.valueOf(j));
        C51973G9u.A10(A0e);
        A0e.AAJ("ghost_screen_outcome", str);
        DbX.A1L(A0e);
    }
}
