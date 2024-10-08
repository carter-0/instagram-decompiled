package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.6bl  reason: invalid class name and case insensitive filesystem */
public final class C310876bl extends C230372pW {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C309986aF A02;
    public final C310666bQ A03;
    public final AnonymousClass2yG A04;

    public C310876bl(1Bk r2, C309986aF r3, C310666bQ r4, AnonymousClass2yG r5) {
        super(r2, new C310886bm());
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A01 = r4.A02;
        this.A00 = r4.A01;
    }

    private final void A00(C255773uh r6, AnonymousClass6YY r7, String str) {
        AnonymousClass2yG r4 = this.A04;
        C230472pg r3 = C230472pg.NETEGO;
        C233162v9 r2 = C233162v9.SEEN_STATE;
        C230432pc r1 = C230432pc.STORIES;
        String str2 = r6.A0j;
        0qQ.A07(str2);
        r4.EGR(r3, r2, r1, str2);
        AnonymousClass4DU r32 = this.A01;
        C310666bQ r42 = this.A03;
        AnonymousClass3BQ r22 = r42.A03;
        Reel reel = r7.A00.A0H;
        AnonymousClass6KG A002 = AnonymousClass6KF.A00(r32, reel, r22);
        C254523sc r23 = new C254523sc((C270594gz) null, A002, str);
        r23.A02();
        r23.A09(r7.A02.A0I);
        r23.A6t = r42.A06.getSessionId();
        AnonymousClass3PI.A08(r23, r6, r7, r42);
        AnonymousClass3PI.A06(r23, reel);
        C309986aF r0 = this.A02;
        String id = reel.getId();
        0qQ.A07(id);
        AnonymousClass6UP r43 = (AnonymousClass6UP) r0.A05.get(id);
        if (r43 != null) {
            r23.A42 = Long.valueOf((long) r43.A05);
            r23.A06(r43.A00);
            r23.A43 = Long.valueOf((long) r43.A06);
            r23.A0A(r43.A02);
            r23.A47 = Long.valueOf((long) r43.A0P);
            r23.A0O(r43.A08);
            r23.A3z = Long.valueOf((long) r43.A03);
        }
        C233822wX.A0I(this.A00, r23, A002, AnonymousClass05K.A01);
    }

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        AnonymousClass6YY r3 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        A00(r2, r3, "instagram_netego_impression");
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C255773uh r2 = (C255773uh) obj;
        AnonymousClass6YY r3 = (AnonymousClass6YY) obj2;
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        A00(r2, r3, "instagram_netego_sub_impression");
    }
}
