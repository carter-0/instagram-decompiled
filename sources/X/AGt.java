package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class AGt {
    public AnonymousClass1O8 A00;
    public C39700A5q A01;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Handler A05;
    public final UserSession A06;
    public final AnonymousClass4D6 A07;
    public final 0mK A08;
    public final 0mM A09;
    public final A4X A0A;
    public final Runnable A0B;
    public final Map A0C = AnonymousClass7TE.A1E();
    public final boolean A0D;

    public static void A01(AGt aGt) {
        UserSession userSession;
        Integer num;
        1OC A012;
        C41824B2f ahL;
        String str;
        aGt.A04 = false;
        List list = aGt.A02;
        if (list != null) {
            boolean z = aGt.A0D;
            if (!z && !list.isEmpty()) {
                Object obj = aGt.A02.get(0);
                Map map = aGt.A0C;
                if (map.containsKey(obj)) {
                    aGt.A01 = (C39700A5q) map.get(obj);
                    A00(aGt);
                    return;
                }
            }
            AnonymousClass1O8 r0 = new AnonymousClass1O8();
            aGt.A00 = r0;
            AnonymousClass1O9 r5 = r0.A00;
            if (!z) {
                if (!aGt.A02.isEmpty()) {
                    str = AnonymousClass7TE.A19(aGt.A02, 0);
                } else {
                    str = "";
                }
                userSession = aGt.A06;
                num = AnonymousClass05K.A01;
                A012 = ABU.A00(r5, userSession, str);
                ahL = new C40703AhN(aGt, str);
            } else {
                userSession = aGt.A06;
                num = AnonymousClass05K.A01;
                A012 = ABU.A01(r5, userSession, aGt.A02);
                ahL = new C40701AhL(aGt);
            }
            A012.A00 = new C385439iw(r5, userSession, ahL, num);
            aGt.A07.schedule(A012);
        }
    }

    public AGt(UserSession userSession, AnonymousClass4D6 r7, A4X a4x, int i, boolean z) {
        Handler handler = new Handler();
        this.A07 = r7;
        this.A06 = userSession;
        this.A0D = z;
        this.A0A = a4x;
        this.A05 = handler;
        C64889Ljp ljp = new C64889Ljp(this, 9);
        this.A08 = ljp;
        this.A09 = new 0mM(handler, ljp, (long) i);
        this.A0B = new C40917AlP(this);
    }

    public static void A00(AGt aGt) {
        if (aGt.A03) {
            C39700A5q a5q = aGt.A01;
            if (a5q == null) {
                a5q = new C39700A5q(false, (String) null);
                aGt.A01 = a5q;
            }
            boolean z = a5q.A01;
            A4X a4x = aGt.A0A;
            if (z) {
                C357128Wq.A03(a4x.A00, a5q.A00);
                return;
            }
            C357128Wq r1 = a4x.A00;
            r1.A0A.E3I();
            r1.A03 = null;
        }
    }
}
