package X;

import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Jh3  reason: case insensitive filesystem */
public final class C60184Jh3 extends 2YL {
    public final C249513ju A00;
    public final AnonymousClass0r6 A01;
    public final AnonymousClass0t1 A02;
    public final C310306am A03;
    public final UpcomingEvent A04;
    public final C64104LMy A05;

    public C60184Jh3(AnonymousClass0t1 r4, C310306am r5, UpcomingEvent upcomingEvent, C64104LMy lMy) {
        0qQ.A0B(r4, 1);
        this.A02 = r4;
        this.A04 = upcomingEvent;
        this.A05 = lMy;
        this.A03 = r5;
        1HR A0w = G9w.A0w();
        this.A00 = A0w;
        this.A01 = 0u9.A04(A0w);
        0Aj A0e = AnonymousClass7TE.A0e((0wc) lMy.A05.getValue(), "upcoming_event_reshare_upsell_impression");
        DbS.A1J(A0e, "impression");
        A0e.AAJ("prior_module", lMy.A03);
        C64104LMy.A00(A0e, lMy, DbZ.A0d(lMy.A04));
    }
}
