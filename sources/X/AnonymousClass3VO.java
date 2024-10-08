package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3VO  reason: invalid class name */
public abstract class AnonymousClass3VO {
    public static final String A02(String str) {
        0qQ.A0B(str, 0);
        int A04 = 00l.A04(str, '_', 0);
        if (A04 == -1) {
            return str;
        }
        String substring = str.substring(0, A04);
        0qQ.A07(substring);
        return substring;
    }

    public static final String A03(String str) {
        int A04 = 00l.A04(str, '_', 0);
        if (A04 == -1) {
            return null;
        }
        String substring = str.substring(A04 + 1);
        0qQ.A07(substring);
        return substring;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r0.isEmpty() != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(com.instagram.common.session.UserSession r4, X.1Xj r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r0 = 1
            X.0qQ.A0B(r4, r0)
            X.1Xy r0 = r5.A0C
            java.lang.Integer r3 = r0.CEg()
            boolean r0 = r5.CcK()
            r2 = 1
            if (r0 == 0) goto L_0x0041
            X.1Xy r0 = r5.A0C
            X.3xj r0 = r0.AsQ()
            r1 = 0
            if (r0 == 0) goto L_0x0028
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.Bw9()
            if (r0 == 0) goto L_0x0028
            java.lang.String r1 = r0.Anf()
        L_0x0028:
            java.lang.String r0 = "ig_reels_non_9x16_video"
            if (r1 == 0) goto L_0x0041
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0041
            X.1Xy r0 = r5.A0C
            java.util.List r0 = r0.BxO()
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            boolean r0 = r5.A5D()
            if (r0 != 0) goto L_0x0065
            boolean r0 = r5.A5G()
            if (r0 != 0) goto L_0x0065
            if (r3 == 0) goto L_0x0065
            int r0 = r3.intValue()
            if (r0 > 0) goto L_0x005c
            int r0 = r5.A0v()
            if (r0 <= 0) goto L_0x0065
        L_0x005c:
            boolean r0 = X.C243353Yk.A00(r4, r5)
            if (r0 != 0) goto L_0x0065
            if (r1 != 0) goto L_0x0065
            return r2
        L_0x0065:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VO.A05(com.instagram.common.session.UserSession, X.1Xj):boolean");
    }

    public static final boolean A06(UserSession userSession, 1Xj r2, 1sy r3, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        if (1sx.A0O(r2, r3) || new C2364033p(userSession, str).A00(r2) != AnonymousClass05K.A0Y) {
            return false;
        }
        return true;
    }

    public static final boolean A07(UserSession userSession, 1Xj r7, 1sy r8, String str) {
        List A05;
        List A01;
        0qQ.A0B(userSession, 1);
        0qQ.A0B(str, 3);
        if (r8 != 1sy.A0O) {
            AnonymousClass3DI r3 = AnonymousClass3DI.A00;
            if (!AnonymousClass3DI.A02(str) || !r3.A05(userSession) || !182.A06(0Tu.A05, userSession, 36327752512780972L) || (A01 = C243483Yy.A01(SocialContextType.LIKED_BY, userSession, r7, false)) == null || !(!A01.isEmpty())) {
                boolean A06 = r3.A06(userSession, str);
                C243483Yy r0 = C243483Yy.A00;
                if (A06) {
                    A05 = r0.A07(r7);
                } else {
                    A05 = r0.A05(userSession, r7);
                }
                if (A05 == null || !(!A05.isEmpty()) || A05(userSession, r7)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static final boolean A08(1Xj r3) {
        if (r3 != null) {
            return 0qQ.A0K(r3.A0C.BIl(), 1UQ.A0H.toString()) || 0qQ.A0K(r3.A0C.BIl(), "recommended_end_of_feed_recs");
        }
        return false;
    }

    public static final boolean A09(1Xj r3) {
        if (r3 != null) {
            return 0qQ.A0K(r3.A0C.BIl(), 1UQ.A0a.toString()) || 0qQ.A0K(r3.A0C.BIl(), "recommended_in_feed_recs");
        }
        return false;
    }

    public static final String A01(1Xj r0) {
        C257813y0 BMD;
        C279774zI BMA;
        String BCo;
        C250513lZ injected = r0.A0C.getInjected();
        if (injected == null || (BMD = injected.BMD()) == null || (BMA = BMD.BMA()) == null || (BCo = BMA.BCo()) == null) {
            return "";
        }
        return BCo;
    }

    public static final ArrayList A04(1Xj r4) {
        C252883pr r1;
        ArrayList arrayList = new ArrayList();
        C247733gp A1T = r4.A1T();
        if (A1T != null) {
            r1 = A1T.A06;
        } else {
            r1 = null;
        }
        if (r1 == C252883pr.Success) {
            C247733gp A1T2 = r4.A1T();
            if (A1T2 != null) {
                User user = A1T2.A08;
                if (user != null && !user.A2Q()) {
                    arrayList.add(user);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        for (C247733gp r0 : r4.A0d.A05.A00) {
            User user2 = r0.A08;
            if (user2 != null && !user2.A2Q()) {
                arrayList.add(user2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1 == 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0A(X.1Xj r1) {
        /*
            X.1Xy r0 = r1.A0C
            X.3lZ r0 = r0.getInjected()
            if (r0 == 0) goto L_0x0021
            X.3y0 r0 = r0.BMD()
            if (r0 == 0) goto L_0x0021
            X.4zI r0 = r0.BMA()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.BCo()
            if (r0 == 0) goto L_0x0021
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VO.A0A(X.1Xj):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.A5e() != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(com.instagram.common.session.UserSession r4, X.1Xj r5) {
        /*
            boolean r0 = r5.A5n()
            r2 = 0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r5.A5e()
            r1 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r1 = 1
        L_0x000f:
            java.util.List r0 = r5.A3P()
            java.lang.Object r0 = X.00k.A0O(r0, r2)
            com.instagram.model.androidlink.AndroidLink r0 = (com.instagram.model.androidlink.AndroidLink) r0
            boolean r3 = X.1sx.A0S(r0)
            if (r1 != 0) goto L_0x003e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325072452989528(0x810d7600003258, double:3.035460316372397E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x003e
            if (r3 == 0) goto L_0x0038
            r0 = 36606547429823938(0x820d76000215c2, double:3.213466225131236E-306)
        L_0x0033:
            long r0 = X.182.A01(r2, r4, r0)
            return r0
        L_0x0038:
            r0 = 36606547429758401(0x820d76000115c1, double:3.21346622508979E-306)
            goto L_0x0033
        L_0x003e:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VO.A00(com.instagram.common.session.UserSession, X.1Xj):long");
    }
}
