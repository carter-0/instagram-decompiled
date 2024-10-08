package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.F2x  reason: case insensitive filesystem */
public final class C49712F2x {
    public final ArrayList A00(Context context, UserSession userSession) {
        ArrayList A0q = AnonymousClass7TF.A0q(userSession, 0);
        Iterator it = A01(context, userSession).iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("USER_ID", map.get("company_switcher_row_userid"));
            A1E.put("PROFILE_PICTURE_URL", map.get("company_switcher_row_profile_pic"));
            A1E.put("ACCOUNT_TYPE", "INSTAGRAM");
            A1E.put("USERNAME", map.get("company_switcher_row_username"));
            A1E.put("APP_ACCOUNT_STATUS", map.get("company_switcher_row_user_type"));
            A1E.put("BADGE_TEXT", map.get("company_switcher_row_user_badge_text"));
            A1E.put("BADGE_COUNT", map.get("company_switcher_row_user_badge_count"));
            A0q.add(A1E);
        }
        if (C324546zV.A00(userSession).A00() == null && C324536zU.A01(userSession)) {
            for (C61037Jvb jvb : C44808ClK.A00(userSession).A00) {
                Iterator it2 = A0q.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (0qQ.A0K(((Map) it2.next()).get("USERNAME"), jvb.A02)) {
                            break;
                        }
                    } else {
                        HashMap A1E2 = AnonymousClass7TE.A1E();
                        A1E2.put("USER_ID", jvb.A00);
                        A1E2.put("ACCOUNT_TYPE", "INSTAGRAM");
                        A1E2.put("USERNAME", jvb.A02);
                        A1E2.put("PROFILE_PICTURE_URL", jvb.A01);
                        A1E2.put("APP_ACCOUNT_STATUS", AnonymousClass000.A00(974));
                        A0q.add(A1E2);
                        break;
                    }
                }
            }
        }
        return A0q;
    }

    /* JADX WARNING: type inference failed for: r6v11, types: [java.lang.Object, X.0Js] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00e2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(android.content.Context r16, com.instagram.common.session.UserSession r17) {
        /*
            r15 = this;
            r0 = 0
            r4 = r17
            X.0qQ.A0B(r4, r0)
            X.0BQ r0 = X.AnonymousClass0BO.A00(r4)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.LinkedHashSet r7 = X.DbS.A0y()
            java.util.List r6 = r0.BO0()
            java.lang.String r5 = r4.A06
            X.0tB r0 = (X.0tB) r0
            X.07d r0 = r0.A02
            java.util.Map r0 = r0.A03
            java.util.Set r3 = r0.keySet()
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330054615056812(0x8111fe000041ac, double:3.038611055725304E-306)
            boolean r14 = X.182.A06(r2, r4, r0)
            java.util.Iterator r13 = r6.iterator()
        L_0x0031:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00f5
            com.instagram.user.model.User r2 = X.DbT.A0k(r13)
            java.util.Map r0 = r2.A05
            com.google.common.collect.ImmutableMap r0 = com.google.common.collect.ImmutableMap.copyOf(r0)
            X.0qQ.A07(r0)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r0)
            if (r14 == 0) goto L_0x0060
            X.08y r11 = X.09i.A0A
            java.lang.String r10 = r2.getId()
            X.0t6 r6 = new X.0t6
            r6.<init>()
            r0 = 6
            X.PPn r1 = new X.PPn
            r1.<init>(r9, r0)
            r0 = 0
            r11.A0A(r6, r0, r1, r10)
        L_0x0060:
            int r6 = r2.A02()
            if (r14 == 0) goto L_0x007f
            r6 = 0
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r9)
        L_0x006b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007f
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r1)
            java.lang.Object r0 = r0.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r6 = r6 + r0
            goto L_0x006b
        L_0x007f:
            if (r6 <= 0) goto L_0x00f2
            X.2aE r0 = X.FFg.A01(r9)
            r1 = r16
            java.lang.String r0 = X.FFg.A02(r1, r0, r9, r6)
            if (r0 == 0) goto L_0x00f2
            java.lang.String r9 = r0.toString()
        L_0x0091:
            java.lang.String r12 = r2.getId()
            java.lang.String r11 = r2.getUsername()
            boolean r1 = r3.contains(r12)
            boolean r0 = X.0qQ.A0K(r12, r5)
            if (r0 == 0) goto L_0x00ea
            if (r1 == 0) goto L_0x00e7
            r0 = 4317(0x10dd, float:6.05E-42)
        L_0x00a7:
            java.lang.String r10 = X.AnonymousClass000.A00(r0)
        L_0x00ab:
            r7.add(r11)
            java.lang.String r6 = X.DbU.A0p(r2)
            int r0 = r2.A02()
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "company_switcher_row_userid"
            r1.put(r0, r12)
            java.lang.String r0 = "company_switcher_row_user_type"
            r1.put(r0, r10)
            java.lang.String r0 = "company_switcher_row_username"
            r1.put(r0, r11)
            if (r6 == 0) goto L_0x00d4
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r6)
        L_0x00d4:
            if (r9 == 0) goto L_0x00db
            java.lang.String r0 = "company_switcher_row_user_badge_text"
            r1.put(r0, r9)
        L_0x00db:
            if (r2 == 0) goto L_0x00e2
            java.lang.String r0 = "company_switcher_row_user_badge_count"
            r1.put(r0, r2)
        L_0x00e2:
            r8.add(r1)
            goto L_0x0031
        L_0x00e7:
            java.lang.String r10 = "CURRENT"
            goto L_0x00ab
        L_0x00ea:
            if (r1 == 0) goto L_0x00ef
            r0 = 454(0x1c6, float:6.36E-43)
            goto L_0x00a7
        L_0x00ef:
            java.lang.String r10 = "LOGGED_IN"
            goto L_0x00ab
        L_0x00f2:
            java.lang.String r9 = ""
            goto L_0x0091
        L_0x00f5:
            r0 = 18310682533966431(0x410d780008325f, double:1.8971660931332427E-307)
            r3 = 1
            boolean r0 = X.AnonymousClass3EM.A05(r0, r3)
            if (r0 != 0) goto L_0x01b9
            X.3EO r0 = X.AnonymousClass3EO.A00(r4)
            java.util.HashMap r0 = r0.A01
            java.util.Collection r0 = r0.values()
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0113:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0160
            java.lang.Object r1 = r10.next()
            X.ExJ r1 = (X.C49537ExJ) r1
            X.9GU r0 = r1.A00
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r9 = r0.getUsername()
            boolean r0 = r7.contains(r9)
            if (r0 != 0) goto L_0x0113
            r7.add(r9)
            X.9GU r0 = r1.A00
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r6 = r0.getId()
            X.9GU r0 = r1.A00
            com.instagram.user.model.User r0 = r0.A01
            java.lang.String r5 = X.DbU.A0p(r0)
            java.lang.String r2 = "DEFERRED_CHILD"
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "company_switcher_row_userid"
            r1.put(r0, r6)
            java.lang.String r0 = "company_switcher_row_user_type"
            r1.put(r0, r2)
            java.lang.String r0 = "company_switcher_row_username"
            r1.put(r0, r9)
            if (r5 == 0) goto L_0x015c
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r5)
        L_0x015c:
            r8.add(r1)
            goto L_0x0113
        L_0x0160:
            X.3EO r0 = X.AnonymousClass3EO.A00(r4)
            java.util.HashMap r0 = r0.A02
            java.util.Collection r0 = r0.values()
            com.google.common.collect.ImmutableList r0 = X.DbU.A0K(r0)
            java.util.Iterator r10 = r0.iterator()
        L_0x0172:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x01b9
            java.lang.Object r1 = r10.next()
            X.Exs r1 = (X.C49557Exs) r1
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r9 = r0.getUsername()
            boolean r0 = r7.contains(r9)
            if (r0 != 0) goto L_0x0172
            r7.add(r9)
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r6 = r0.getId()
            com.instagram.user.model.User r0 = r1.A00
            java.lang.String r5 = X.DbU.A0p(r0)
            java.lang.String r2 = "DEFERRED_RECOVERED"
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "company_switcher_row_userid"
            r1.put(r0, r6)
            java.lang.String r0 = "company_switcher_row_user_type"
            r1.put(r0, r2)
            java.lang.String r0 = "company_switcher_row_username"
            r1.put(r0, r9)
            if (r5 == 0) goto L_0x01b5
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r5)
        L_0x01b5:
            r8.add(r1)
            goto L_0x0172
        L_0x01b9:
            X.6qt r2 = X.C319606qt.A01(r4)
            X.0qQ.A07(r2)
            java.util.ArrayList r0 = r2.A06(r4)
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x0229
            r0 = 18310682533835358(0x410d780006325e, double:1.8971660930814358E-307)
            boolean r0 = X.AnonymousClass3EM.A05(r0, r3)
            if (r0 == 0) goto L_0x0229
            java.util.ArrayList r0 = r2.A05()
            java.util.Iterator r10 = r0.iterator()
        L_0x01dd:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r1 = r10.next()
            X.6qx r1 = (X.C319646qx) r1
            java.lang.String r9 = r1.A07
            boolean r0 = X.00k.A0u(r7, r9)
            if (r0 != 0) goto L_0x01dd
            if (r9 == 0) goto L_0x01dd
            r7.add(r9)
            java.lang.String r6 = r1.A06
            if (r6 == 0) goto L_0x0224
            com.instagram.common.typedurl.ImageUrl r0 = r1.A02
            if (r0 == 0) goto L_0x0222
            java.lang.String r5 = r0.getUrl()
        L_0x0202:
            java.lang.String r2 = "LOGGED_OUT"
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "company_switcher_row_userid"
            r1.put(r0, r6)
            java.lang.String r0 = "company_switcher_row_user_type"
            r1.put(r0, r2)
            java.lang.String r0 = "company_switcher_row_username"
            r1.put(r0, r9)
            if (r5 == 0) goto L_0x021e
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r5)
        L_0x021e:
            r8.add(r1)
            goto L_0x01dd
        L_0x0222:
            r5 = 0
            goto L_0x0202
        L_0x0224:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0229:
            X.2Ly r0 = X.2Lv.A00(r4)
            com.facebook.common.callercontext.CallerContext r2 = X.FRS.A00
            java.lang.String r1 = "INSTAGRAM"
            X.1wM r0 = r0.A00
            java.util.List r2 = r0.A02(r2, r1)
            int r1 = r2.size()
            r0 = 0
            if (r1 <= r3) goto L_0x023f
            r0 = 1
        L_0x023f:
            boolean r0 = X.AnonymousClass3EM.A08(r4, r0)
            if (r0 == 0) goto L_0x028c
            java.util.Iterator r6 = r2.iterator()
        L_0x0249:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r1 = r6.next()
            fxcache.model.FxCalAccountWithSwitcherInfo r1 = (fxcache.model.FxCalAccountWithSwitcherInfo) r1
            java.lang.String r5 = r1.A0B
            if (r5 == 0) goto L_0x0249
            int r0 = r5.length()
            if (r0 == 0) goto L_0x0249
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L_0x0249
            r7.add(r5)
            java.lang.String r4 = r1.A08
            java.lang.String r3 = ""
            java.lang.String r2 = "MANI"
            java.util.LinkedHashMap r1 = X.AnonymousClass7TE.A1H()
            java.lang.String r0 = "company_switcher_row_userid"
            r1.put(r0, r3)
            java.lang.String r0 = "company_switcher_row_user_type"
            r1.put(r0, r2)
            java.lang.String r0 = "company_switcher_row_username"
            r1.put(r0, r5)
            if (r4 == 0) goto L_0x0288
            java.lang.String r0 = "company_switcher_row_profile_pic"
            r1.put(r0, r4)
        L_0x0288:
            r8.add(r1)
            goto L_0x0249
        L_0x028c:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49712F2x.A01(android.content.Context, com.instagram.common.session.UserSession):java.util.ArrayList");
    }
}
