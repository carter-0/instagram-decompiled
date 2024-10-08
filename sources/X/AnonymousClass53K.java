package X;

import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Set;
import kotlin.Deprecated;

/* renamed from: X.53K  reason: invalid class name */
public abstract class AnonymousClass53K {
    public static final HashSet A01(AnonymousClass2Ep r7, Set set, boolean z) {
        C242243Te r0;
        0qQ.A0B(set, 0);
        0qQ.A0B(r7, 1);
        HashSet hashSet = new HashSet();
        for (Object next : set) {
            if (0qQ.A0K(next, C69932Ea.A00)) {
                C376579In Bgc = r7.Bgc();
                if (Bgc != null) {
                    if (Bgc.A00 == null) {
                    }
                }
            } else {
                boolean A0K = 0qQ.A0K(next, AnonymousClass2EX.A00);
                2EN C3d = r7.C3d();
                0qQ.A07(C3d);
                boolean A0K2 = 0qQ.A0K(next, A00(C3d, r7.C66()));
                if (A0K) {
                    if (A0K2) {
                        if (r7.C6a() == 29 && (((r0 = ((AnonymousClass3U9) r7).A01.A0s) == null || !r0.A0I) && z)) {
                        }
                    }
                } else if (!A0K2) {
                }
            }
            hashSet.add(next);
        }
        return hashSet;
    }

    public static final boolean A02(UserSession userSession, AnonymousClass2Ep r5, int i) {
        C242243Te r1;
        0qQ.A0B(r5, 2);
        if ((i == -1 || i == 0) && r5.B6d() == 3 && 182.A06(0Tu.A05, userSession, 36317934218188449L) && (r1 = ((AnonymousClass3U9) r5).A01.A0s) != null) {
            return r1.A0L;
        }
        return false;
    }

    @Deprecated(message = "Please refactor your code to get DirectInboxMode directly instead of calling this\n        method. This only exists to support legacy implementations that will be removed.")
    public static final 2EM A00(2EN r1, int i) {
        if (r1 == 2EN.A04) {
            return AnonymousClass496.A00;
        }
        if (i != -1) {
            if (i == 0) {
                return AnonymousClass2EU.A00;
            }
            if (i == 1) {
                return AnonymousClass2EL.A00;
            }
            if (i == 3) {
                return AnonymousClass2EX.A00;
            }
            if (i == 4) {
                return C69932Ea.A00;
            }
            if (i == 1000) {
                return AnonymousClass2EY.A00;
            }
        }
        return AnonymousClass43A.A00;
    }
}
