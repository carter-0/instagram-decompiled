package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.List;

/* renamed from: X.Lv7  reason: case insensitive filesystem */
public final class C65538Lv7 implements MU6 {
    public final UserSession A00;

    public final String getName() {
        return "ArmadilloExpressRemovePIIStep";
    }

    public C65538Lv7(UserSession userSession) {
        this.A00 = userSession;
    }

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r10) {
        IGFOAMessagingSendToSentLogger A002;
        C241503Pl A0m = JTQ.A0m(r10);
        UserSession userSession = this.A00;
        if (!182.A06(0Tu.A05, userSession, 36318892002187968L)) {
            A0m.resumeWith(C62012KVl.A00);
        } else {
            0qQ.A07(C282375Cv.A00(lp8.A0C));
            AnonymousClass3Q2 r3 = lp8.A0D;
            String str = r3.A3p;
            if (str != null) {
                C282375Cv.A03(str, (List) null, 15, 1163, 0);
            }
            Integer num = r3.A2G;
            if (!(num == null || (A002 = AnonymousClass7G0.A00(userSession, num.intValue())) == null)) {
                A002.onLogPIIRemovalStart();
            }
            String str2 = r3.A3V;
            if (str2 != null) {
                Uri A09 = JTQ.A09(str2);
                Uri A092 = JTQ.A09(AnonymousClass457.A09(lp8.A0B, ".mp4", System.nanoTime(), true));
                0qQ.A0A(A09);
                0qQ.A0A(A092);
                C71122OdG.A01(A09, A092, userSession, lp8, A0m);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return A0m.A00();
    }
}
