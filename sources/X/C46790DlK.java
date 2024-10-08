package X;

import com.instagram.common.session.UserSession;
import com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi;
import com.instagram.pendingmedia.store.PendingMediaStore;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.DlK  reason: case insensitive filesystem */
public final class C46790DlK extends 2YL {
    public final C46401DeO A00;
    public final AnonymousClass12V A01;
    public final 1Ng A02;
    public final UserSession A03;
    public final F3X A04;
    public final FanClubPromoAndWelcomeVideoApi A05;
    public final PendingMediaStore A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final 05G A0B;
    public final AnonymousClass0Ud A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C46790DlK(C46401DeO deO, AnonymousClass12V r15, 1Ng r16, UserSession userSession, F3X f3x, FanClubPromoAndWelcomeVideoApi fanClubPromoAndWelcomeVideoApi, PendingMediaStore pendingMediaStore, boolean z, boolean z2) {
        UserSession userSession2 = userSession;
        PendingMediaStore pendingMediaStore2 = pendingMediaStore;
        DbW.A1N(userSession2, 1, pendingMediaStore2);
        1Ng r2 = r16;
        0qQ.A0B(r2, 7);
        F3X f3x2 = f3x;
        AnonymousClass7TF.A1G(f3x2, 8, r15);
        this.A03 = userSession2;
        this.A00 = deO;
        this.A0D = z;
        this.A0E = z2;
        this.A06 = pendingMediaStore2;
        this.A05 = fanClubPromoAndWelcomeVideoApi;
        this.A02 = r2;
        this.A04 = f3x2;
        this.A01 = r15;
        1HR r0 = new 1HR(Integer.MAX_VALUE);
        this.A07 = r0;
        this.A08 = 0u9.A04(r0);
        02z A10 = DbS.A10(0);
        this.A0A = A10;
        02z A102 = DbS.A10(new C53394GnR());
        this.A0B = A102;
        MC9 mc9 = new MC9(10q.A02(new C59731JVp(10, (AnonymousClass4D7) null), AnonymousClass11E.A01(new MC0(5, this, new AnonymousClass64X(r2).A00(AnonymousClass2Ny.class)))), 49);
        05F A022 = 10b.A02(new C61077JwF((1Xj) null, (String) null, (DefaultConstructorMarker) null, 7, 13, false), C318116oQ.A00(this), mc9, AnonymousClass10A.A00);
        this.A0C = A022;
        this.A09 = AnonymousClass10H.A00(new C51649FyB(this, 1), A102, A022, A10);
        1Eo.A05(((AnonymousClass12U) this.A01).A04, new MG8(this, (AnonymousClass4D7) null, 4), C318116oQ.A00(this));
    }

    public static final 1Xj A01(C53394GnR gnR, C61077JwF jwF) {
        long j;
        if (jwF.A02) {
            return null;
        }
        long j2 = gnR.A00;
        1Xj r6 = (1Xj) gnR.A01;
        long j3 = 0;
        if (r6 != null) {
            j = r6.A1A();
        } else {
            j = 0;
        }
        long max = Math.max(j2, j);
        1Xj r1 = (1Xj) jwF.A00;
        if (r1 != null) {
            j3 = r1.A1A();
        }
        if (max > j3) {
            return r6;
        }
        return r1;
    }

    public static C46401DeO A00(AnonymousClass0eM r0) {
        return ((C46790DlK) r0.getValue()).A00;
    }
}
