package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3Bd  reason: invalid class name and case insensitive filesystem */
public final class C238253Bd implements C61110lV, AnonymousClass0lh {
    public long A00;
    public String A01;
    public final UserSession A02;

    public C238253Bd(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        14i.A04(15Y.A02, this, false, false);
    }

    public static final boolean A00(String str) {
        if (str.length() != 0) {
            int A002 = C61970qY.A00();
            0qV A04 = C61970qY.A04();
            String[] strArr = (String[]) new 11S(",").A03(str).toArray(new String[0]);
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                String str2 = strArr[i];
                if (!0qQ.A0K(str2, 0qT.A00(A04.A00))) {
                    String A003 = 0qU.A00(A04.A01);
                    if (!0qQ.A0K(str2, A003) && !0qQ.A0K(str2, 002.A0O(A003, A002))) {
                        i++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        if (r7 > X.182.A01(r5, r6, 36599095661563290L)) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long A01() {
        /*
            r12 = this;
            com.instagram.common.session.UserSession r6 = r12.A02
            X.0Tu r5 = X.0Tu.A05
            r3 = 37162045618782426(0x8406af003c00da, double:3.564765516640251E-306)
            double r7 = X.182.A00(r5, r6, r3)
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00de
            r1 = 0
            double r3 = X.182.A00(r5, r6, r3)
            float r0 = (float) r3
            float r7 = java.lang.Math.abs(r0)
            r3 = 37162045618716889(0x8406af003b00d9, double:3.564765516598805E-306)
            double r3 = X.182.A00(r5, r6, r3)
            float r0 = (float) r3
            float r0 = java.lang.Math.abs(r0)
            X.2SP r10 = X.2SP.A01
            float r9 = r10.A02()
            float r0 = r0 - r7
            float r9 = r9 * r0
            float r9 = r9 + r7
            r3 = 36599095665233324(0x8206af003a0dac, double:3.208753699198284E-306)
            long r7 = X.182.A01(r5, r6, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            if (r0 == 0) goto L_0x0048
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0058
        L_0x0048:
            r0 = 100
            int r0 = r10.A05(r0)
            long r7 = (long) r0
            long r3 = X.182.A01(r5, r6, r3)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            r9 = 0
        L_0x0058:
            X.0wX r3 = X.C61170le.A00
            X.18g r0 = X.C638918c.A01(r3)
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x00b8
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r3 = r0.A01
            java.lang.String r0 = "last_hot_start_feed_latency"
        L_0x006c:
            long r3 = r3.getLong(r0, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00de
            float r0 = (float) r3
            float r0 = r0 * r9
            long r7 = (long) r0
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
            if (r11 == 0) goto L_0x00b7
            r3 = 36599095661497753(0x8206af00010d99, double:3.208753696835894E-306)
            long r9 = X.182.A01(r5, r6, r3)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            r3 = 36599095661563290(0x8206af00020d9a, double:3.20875369687734E-306)
            long r9 = X.182.A01(r5, r6, r3)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a1
        L_0x0097:
            long r3 = X.182.A01(r5, r6, r3)
            java.lang.Long r11 = java.lang.Long.valueOf(r3)
            if (r11 == 0) goto L_0x00b7
        L_0x00a1:
            long r7 = r11.longValue()
            r3 = 36612543204170077(0x8212ea0002195d, double:3.2172579769707796E-306)
            long r3 = X.182.A01(r5, r6, r3)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b7
            long r7 = r7 + r3
            java.lang.Long r11 = java.lang.Long.valueOf(r7)
        L_0x00b7:
            return r11
        L_0x00b8:
            X.18g r0 = X.C638918c.A01(r3)
            boolean r0 = r0.A0W()
            if (r0 == 0) goto L_0x00cb
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r3 = r0.A01
            java.lang.String r0 = "last_warm_start_feed_latency"
            goto L_0x006c
        L_0x00cb:
            X.18g r0 = X.C638918c.A01(r3)
            boolean r0 = r0.A0U()
            if (r0 == 0) goto L_0x00de
            X.1Av r0 = X.1Au.A00(r6)
            X.0xa r3 = r0.A01
            java.lang.String r0 = "last_cold_start_feed_latency"
            goto L_0x006c
        L_0x00de:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238253Bd.A01():java.lang.Long");
    }

    public final String A02() {
        UserSession userSession = this.A02;
        0Tu r5 = 0Tu.A05;
        String A04 = 182.A04(r5, userSession, 36880570638664012L);
        if ((182.A01(r5, userSession, 36599095663988131L) <= 0 || this.A00 >= System.currentTimeMillis()) && !A00(182.A04(r5, userSession, 36880570641023314L))) {
            return A04;
        }
        return "rug_pull";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.182.A06(r8, r9, 36317801073350192L) != false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03() {
        /*
            r14 = this;
            com.instagram.common.session.UserSession r9 = r14.A02
            X.0Tu r8 = X.0Tu.A05
            r0 = 36317620684920174(0x8106af0003156e, double:3.030747788239476E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            r13 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001d
            r0 = 36317801073350192(0x8106d900001630, double:3.0308618666089855E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            r12 = 0
            if (r0 == 0) goto L_0x001e
        L_0x001d:
            r12 = 1
        L_0x001e:
            r0 = 36880570641023314(0x8306af002c0152, double:3.386759607296627E-306)
            java.lang.String r0 = X.182.A04(r8, r9, r0)
            boolean r0 = A00(r0)
            if (r0 != 0) goto L_0x008c
            java.lang.String r0 = r14.A01
            if (r0 == 0) goto L_0x0038
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0038
            return r2
        L_0x0038:
            r4 = 36599095663988131(0x8206af00270da3, double:3.208753698410819E-306)
            long r6 = X.182.A01(r8, r9, r4)
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x008b
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r14.A00
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0070
            long r6 = X.14i.A00
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x007a
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r6 = r0.now()
            long r0 = X.14i.A00
        L_0x005f:
            long r6 = r6 - r0
            X.14i.A00 = r2
            long r1 = X.182.A01(r8, r9, r4)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0070
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r10 + r2
            r14.A00 = r0
        L_0x0070:
            if (r12 == 0) goto L_0x008c
            long r1 = r14.A00
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x008c
            r13 = 1
            return r13
        L_0x007a:
            long r6 = java.lang.System.currentTimeMillis()
            X.1Av r0 = X.1Au.A00(r9)
            X.0xa r1 = r0.A01
            java.lang.String r0 = "last_feed_update_time"
            long r0 = r1.getLong(r0, r2)
            goto L_0x005f
        L_0x008b:
            return r12
        L_0x008c:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238253Bd.A03():boolean");
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(-910630563);
        this.A00 = 0;
        AnonymousClass0fD.A0A(554030236, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(2053927486, AnonymousClass0fD.A03(2020817101));
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
        if (JVU.A01(this.A02, AnonymousClass05K.A0u)) {
            14i.A07(this);
        }
    }
}
