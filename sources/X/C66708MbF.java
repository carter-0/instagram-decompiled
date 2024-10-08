package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.MbF  reason: case insensitive filesystem */
public abstract class C66708MbF {
    public static final AnonymousClass48T A00(UserSession userSession, AnonymousClass2Ep r7) {
        0qQ.A0B(r7, 1);
        String str = userSession.A06;
        AnonymousClass48T r5 = new AnonymousClass48T(str, AnonymousClass0eN.A01(new C73903Ple(r7, 42)));
        AnonymousClass3SZ r3 = null;
        AnonymousClass3SZ r2 = null;
        for (Map.Entry entry : r7.CCo().entrySet()) {
            Object key = entry.getKey();
            AnonymousClass3SZ r1 = (AnonymousClass3SZ) entry.getValue();
            if (0qQ.A0K(str, key)) {
                r3 = r1;
            } else {
                r2 = r1;
            }
        }
        r5.A00 = r3;
        r5.A01 = r2;
        return r5;
    }
}
