package X;

import com.facebook.odin.model.Example;
import com.instagram.common.session.UserSession;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.94q  reason: invalid class name and case insensitive filesystem */
public final class C3732594q implements AnonymousClass94T {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(C3732694r.A00);
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public final void cleanup() {
    }

    public final void CN8() {
        Object obj;
        C60400gq r3 = ((C293475kn) this.A01.getValue()).A00;
        if (r3 == null || !r3.Agw(36325772532987106L)) {
            0KC.A02(C3732594q.class, "personalization disabled");
            return;
        }
        AD6 ad6 = (AD6) this.A02.getValue();
        C258903zp r8 = ad6.A01;
        C293475kn r2 = ad6.A03;
        AnonymousClass40G EJD = r8.EJD(r2.CCP());
        if (!EJD.A02 || ad6.A00.now() >= ((Number) EJD.A00).longValue() + (r2.Bsd() * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS)) {
            try {
                AnonymousClass40G A002 = ad6.A02.A00(AAG.A00(r2));
                boolean z = A002.A02;
                if (z) {
                    List list = (List) A002.A00;
                    if (list.size() > 0) {
                        obj = list.get(0);
                    } else {
                        obj = Example.A03;
                    }
                    Example example = (Example) obj;
                    r8.Eya(example, r2.CCP(), ad6.A00.now());
                    AD6.A00(ad6, A002.A01, example.A02, z);
                    return;
                }
                String str = A002.A01;
                0KC.A02(AD6.class, str);
                AD6.A00(ad6, str, new HashMap(), z);
            } catch (Exception e) {
                0KC.A02(AD6.class, e.getMessage());
                AD6.A00(ad6, e.getMessage(), new HashMap(), false);
            }
        }
    }

    public C3732594q(UserSession userSession) {
        this.A01 = AnonymousClass0eN.A01(new AnonymousClass9LU(userSession, 13));
        this.A02 = AnonymousClass0eN.A01(new C377419Lt(40, userSession, this));
    }
}
