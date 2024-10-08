package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;
import java.util.Set;

/* renamed from: X.3H6  reason: invalid class name */
public final class AnonymousClass3H6 {
    public static final int A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        int i = 0;
        for (User A02 : AnonymousClass0BO.A00(userSession).BO1(0eE.A00(userSession).A00())) {
            if (A02.A02() > 0) {
                i++;
            }
        }
        return i;
    }

    public static final boolean A01(String str) {
        if (!AnonymousClass3EM.A05(18301950867738886L, true)) {
            return false;
        }
        if (System.currentTimeMillis() < 0xn.A01(1An.A1U.toString()).getLong(AnonymousClass3H8.A00(str), 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d8, code lost:
        r3 = X.1Al.A01(r9).A03(X.1An.A1U);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(com.instagram.common.session.UserSession r9, boolean r10) {
        /*
            r8 = this;
            r4 = 0
            X.0qQ.A0B(r9, r4)
            java.lang.String r0 = r9.A06
            boolean r0 = A01(r0)
            r7 = 0
            if (r0 != 0) goto L_0x002b
            X.2Ly r3 = X.2Lv.A00(r9)
            r1 = 18301950866428154(0x410587001710fa, double:1.893714879563987E-307)
            r0 = 1
            boolean r2 = X.AnonymousClass3EM.A05(r1, r0)
            com.facebook.common.callercontext.CallerContext r1 = X.AnonymousClass3H5.A00
            java.lang.String r5 = "fx_company_identity_switcher_linking_cache"
            boolean r0 = r3.A00(r1, r5)
            boolean r0 = X.AnonymousClass3EM.A09(r9, r0)
            if (r2 == 0) goto L_0x002c
            if (r0 == 0) goto L_0x002c
        L_0x002b:
            return r4
        L_0x002c:
            java.lang.String r6 = "FACEBOOK"
            X.1wM r4 = r3.A00
            X.1wg r3 = r4.A07
            java.lang.String r2 = r1.A02
            X.0qQ.A07(r2)
            java.lang.String r1 = "caller_class"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r0}
            java.util.HashMap r1 = X.0Yt.A02(r0)
            java.lang.String r0 = "cache_access_without_acl_check"
            r2 = 0
            r3.A04(r0, r5, r2, r1)
            fxcache.model.FxCalAccountLinkageInfo r0 = r4.A01
            java.util.List r0 = r0.A02
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0059:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0072
            java.lang.Object r1 = r3.next()
            r0 = r1
            fxcache.model.FxCalAccount r0 = (fxcache.model.FxCalAccount) r0
            java.lang.String r0 = r0.A04
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x0059
            r5.add(r1)
            goto L_0x0059
        L_0x0072:
            r0 = 10
            int r0 = X.0Yv.A1E(r5, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r5.iterator()
        L_0x0081:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r1.next()
            fxcache.model.FxCalAccount r0 = (fxcache.model.FxCalAccount) r0
            java.lang.String r0 = r0.A07
            r3.add(r0)
            goto L_0x0081
        L_0x0093:
            java.util.List r0 = X.00k.A0X(r3)
            java.util.Set r5 = X.00k.A0k(r0)
            fxcache.model.FxCalAccountLinkageInfoForSwitcher r0 = r4.A02
            java.util.List r0 = r0.A02
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x00a8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = r3.next()
            r0 = r1
            fxcache.model.FxCalAccountWithSwitcherInfo r0 = (fxcache.model.FxCalAccountWithSwitcherInfo) r0
            java.lang.String r0 = r0.A07
            boolean r0 = X.00k.A0u(r5, r0)
            if (r0 == 0) goto L_0x00a8
            r4.add(r1)
            goto L_0x00a8
        L_0x00c1:
            r5 = 0
            java.util.Iterator r1 = r4.iterator()
        L_0x00c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r0 = r1.next()
            fxcache.model.FxCalAccountWithSwitcherInfo r0 = (fxcache.model.FxCalAccountWithSwitcherInfo) r0
            int r0 = r0.A00
            int r5 = r5 + r0
            goto L_0x00c6
        L_0x00d6:
            if (r10 == 0) goto L_0x0107
            java.lang.String r4 = "switcher_aggregate_seen_badge_count"
            X.1Am r1 = X.1Al.A01(r9)
            X.1An r0 = X.1An.A1U
            X.0xa r3 = r1.A03(r0)
            java.lang.String r2 = r3.getString(r4, r2)
            if (r2 == 0) goto L_0x0107
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.Class<X.4Ej> r0 = X.C262474Ej.class
            java.lang.Object r0 = r1.A08(r2, r0)
            X.4Ej r0 = (X.C262474Ej) r0
            if (r0 == 0) goto L_0x0107
            int r0 = r0.A00
            if (r0 == r5) goto L_0x0108
            X.0xY r0 = r3.AR4()
            r0.ED3(r4)
            r0.apply()
        L_0x0107:
            return r5
        L_0x0108:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3H6.A02(com.instagram.common.session.UserSession, boolean):int");
    }

    public final void A03(UserSession userSession, Integer num) {
        2aN.A00(userSession).A00().A00.AHZ();
        int A00 = AnonymousClass3H7.A00(userSession);
        int A002 = A00(userSession);
        int A02 = A02(userSession, AnonymousClass3EM.A05(18301950865379573L, true));
        int i = 0;
        if (A02 > 0) {
            i = 1;
        }
        int i2 = A00 + A02;
        2aX r7 = new 2aX(2aD.A0b, (List) null, i2, i2);
        if (i2 > 0) {
            2aT A003 = 2aN.A00(userSession).A00();
            AnonymousClass2g1 r6 = AnonymousClass2g1.BOTTOM_NAVIGATION_BAR;
            C226252fx r5 = C226252fx.DOT;
            A003.A04(r5, r6, r7, num, A002, i, A00, A02);
            2aV A01 = 2aN.A00(userSession).A01();
            0qQ.A0B(r6, 0);
            A01.A02(new C239993Jd(r5, r6, (C71062aE) null, (Set) null), r7);
        }
    }
}
