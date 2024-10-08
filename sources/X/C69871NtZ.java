package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.NtZ  reason: case insensitive filesystem */
public abstract class C69871NtZ {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, int i) {
        String str7;
        Long l;
        0qQ.A0B(userSession, 0);
        long A06 = JTS.A06(00y.A0n(10, userSession.A06));
        1Ln A0E = 1Ln.A0E(C66580MXl.A0N(new AnonymousClass0kM(userSession), "creator_broadcast_chat"));
        if (DbT.A1Y(A0E)) {
            C66584MXp.A10(A0E, str3, str4, A06);
            A0E.A0p(str5);
            A0E.A0q(str6);
            if (i == 1) {
                str7 = "broadcast";
            } else if (i != 2) {
                str7 = "instagram";
            } else {
                str7 = "subscriber_broadcast";
            }
            A0E.A0o(str7);
            A0E.A0s(str);
            if (str2 != null) {
                l = 00y.A0n(10, str2);
            } else {
                l = null;
            }
            JTQ.A1C(A0E, l, hashMap);
        }
    }
}
