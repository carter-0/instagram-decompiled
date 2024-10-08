package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Set;

public final class MZ9 implements AnonymousClass0lh {
    public AnonymousClass66d A00;
    public final SessionedNotificationCenter A01;
    public final MZB A02;
    public final List A03 = AnonymousClass7TE.A1C();
    public final Set A04 = DbS.A0y();
    public final AccountSession A05;

    public MZ9(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        AccountSession A022 = C300345wy.A02(userSession, true);
        this.A05 = A022;
        SessionedNotificationCenter sessionedNotificationCenter = A022.getSessionedNotificationCenter();
        0qQ.A07(sessionedNotificationCenter);
        this.A01 = sessionedNotificationCenter;
        this.A02 = MZC.A00(userSession);
        C71737Opx opx = new C71737Opx(this, 2);
        this.A00 = opx;
        this.A01.addObserver(opx, "MEMOnScreenDisplayNotification", 1, (AnonymousClass2Lq) null);
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        MZH mzh = new MZH(002.A0R("[app]", str), 4);
        this.A03.add(mzh);
        for (C70678OFz pYa : this.A04) {
            11Z.A02(new C73196PYa(pYa, mzh));
        }
    }

    public final void onSessionWillEnd() {
        SessionedNotificationCenter sessionedNotificationCenter = this.A01;
        AnonymousClass66d r0 = this.A00;
        if (r0 == null) {
            0qQ.A0F("osdDebugInfoCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        sessionedNotificationCenter.removeEveryObserver(r0);
        this.A03.clear();
        this.A04.clear();
    }
}
