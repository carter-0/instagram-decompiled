package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Jiy  reason: case insensitive filesystem */
public final class C60300Jiy extends 2YL {
    public final UserSession A00;
    public final W0T A01;
    public final C313666go A02;
    public final M0X A03;
    public final M0W A04;
    public final C313816h4 A05;
    public final LES A06;
    public final C59720JVe A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B = DbS.A10(false);
    public final 05G A0C;
    public final 05G A0D = DbS.A10(false);
    public final 05G A0E;
    public final AnonymousClass0Ud A0F;
    public final boolean A0G;
    public final boolean A0H;

    public C60300Jiy(UserSession userSession, W0T w0t, C313666go r12, M0X m0x, M0W m0w, C313816h4 r15, LES les, C59720JVe jVe, boolean z, boolean z2) {
        LES les2 = les;
        C59720JVe jVe2 = jVe;
        C51974G9v.A1M(les2, r15, jVe2);
        C51969G9p.A1N(w0t, 5, r12);
        this.A00 = userSession;
        this.A06 = les2;
        this.A05 = r15;
        this.A07 = jVe2;
        this.A01 = w0t;
        this.A03 = m0x;
        this.A04 = m0w;
        this.A0G = z;
        this.A0H = z2;
        this.A02 = r12;
        02z A10 = DbS.A10(false);
        this.A09 = A10;
        02z A102 = DbS.A10(false);
        this.A0E = A102;
        02z A103 = C51970G9q.A10(true);
        this.A0A = A103;
        02z A104 = DbS.A10(false);
        this.A0C = A104;
        02z A012 = 106.A01((Object) null);
        this.A08 = A012;
        this.A0F = 10b.A03(A012);
        AnonymousClass0Ud r3 = les2.A0i;
        AnonymousClass0Ud r8 = w0t.A02;
        AnonymousClass11O.A03(C318116oQ.A00(this), new MC1(1, this, JTS.A1b(new AnonymousClass0Ud[]{r3, A10, A102, A103, A104, r8})));
        DbY.A19(this, MHB.A01(this, (AnonymousClass4D7) null, 33), les2.A0r);
        DbY.A19(this, MHB.A01(this, (AnonymousClass4D7) null, 34), r8);
    }

    public static final void A00(C60300Jiy jiy) {
        05G r1 = jiy.A0B;
        if (DbX.A1b(r1)) {
            JTU.A1P(r1);
            MGU.A02(jiy, C318116oQ.A00(jiy), 11);
        }
    }

    public static final void A01(C60300Jiy jiy, boolean z) {
        M0X m0x = jiy.A03;
        if (m0x != null) {
            m0x.A0F(002.A1C("toggleVideoMute: ", " canMuteAgain: ", DbX.A1b(jiy.A0E), z));
        }
        AnonymousClass7TE.A1Z(new MGB(jiy, (AnonymousClass4D7) null, 13, z), C318116oQ.A00(jiy));
    }
}
