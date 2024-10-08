package X;

import com.instagram.common.session.UserSession;

public final class LOW {
    public static final Integer A05 = AnonymousClass05K.A0N;
    public X6K A00;
    public X6K A01;
    public C324596za A02;
    public final UserSession A03;
    public final C324356z9 A04;

    public LOW(UserSession userSession, C324356z9 r3) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = r3;
    }

    public final void A00(C46215DQt dQt, String str) {
        boolean A1Z = AnonymousClass7TG.A1Z(str, dQt);
        C324356z9 r3 = this.A04;
        if (r3 != null) {
            UserSession userSession = this.A03;
            String A06 = 0mp.A06(AnonymousClass000.A00(397), new Object[]{str, userSession.A06});
            1Xj A0U = DbV.A0U(userSession, A06);
            if (A0U != null) {
                C45891D9u.A01(dQt, A0U);
                C45891D9u.A00(dQt);
                return;
            }
            this.A02 = new C54379HAu(A1Z ? 1 : 0, dQt, this);
            1OC A042 = C3724090s.A04(userSession, A06);
            C324596za r0 = this.A02;
            if (r0 != null) {
                r3.A03(A042, r0);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        throw AnonymousClass7TE.A0z("mFeedNetworkSource could not be null when requesting single feed media");
    }

    public final void A01(C46215DQt dQt, String str, String str2, String str3, String str4) {
        Integer num;
        AnonymousClass7TG.A1N(str, str2);
        0qQ.A0B(dQt, 4);
        C64533Lda lda = new C64533Lda(dQt, 3);
        this.A01 = lda;
        UserSession userSession = this.A03;
        Integer num2 = A05;
        if (str.equals("ALL")) {
            num = AnonymousClass05K.A00;
        } else if (str.equals("CAROUSEL_V2")) {
            num = AnonymousClass05K.A01;
        } else if (str.equals("IMAGE")) {
            num = AnonymousClass05K.A0C;
        } else if (str.equals("SHOPPING")) {
            num = AnonymousClass05K.A0N;
        } else if (str.equals("VIDEO")) {
            num = AnonymousClass05K.A0Y;
        } else {
            throw AnonymousClass7TE.A0w(str);
        }
        Integer A002 = C63986LHe.A00(str2);
        0qQ.A0B(num2, 3);
        DbW.A1N(num, 4, A002);
        C18718Vyo.A00(new C18485Vsg(lda, userSession, num, A002, str4, str3));
    }
}
