package X;

import java.util.concurrent.TimeUnit;

public abstract class SBX {
    public static final long A00 = JTR.A0N(TimeUnit.DAYS);

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5 != null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1OC A00(X.Q1l r6, com.instagram.common.session.UserSession r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
        /*
            X.0Tu r2 = X.0Tu.A05
            r0 = 36313235523700558(0x8102b20009074e, double:3.027974594626564E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x0026
            X.11c r0 = X.AnonymousClass11c.A00()
            X.3jc r0 = r0.A01()
            android.content.res.Resources r0 = r0.A00
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.uiMode
            r1 = r0 & 48
            r0 = 32
            if (r1 != r0) goto L_0x0026
            java.lang.String r4 = "DARK"
            goto L_0x0028
        L_0x0026:
            java.lang.String r4 = "LIGHT"
        L_0x0028:
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()     // Catch:{ NullPointerException -> 0x002d }
            goto L_0x0046
        L_0x002d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "LanguageUtil has not been initialized yet | URL: GraphQLQuery (showreel_native_interactive_animation), Exception: "
            java.lang.String r1 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.String r0 = "Locale"
            X.0wb.A03(r0, r1)
        L_0x003d:
            java.util.Locale r0 = X.AnonymousClass1Q2.A03()
            java.lang.String r5 = X.DbT.A10(r0)
            goto L_0x004c
        L_0x0046:
            java.lang.String r5 = r0.toString()
            if (r5 == 0) goto L_0x003d
        L_0x004c:
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            X.15p r0 = X.AnonymousClass15o.A00
            X.17W r2 = r0.A0A(r3)
            r2.A0c()
            java.lang.String r0 = "2"
            r2.A0R(r0, r8)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = "0"
            r2.A0R(r0, r1)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "1"
            r2.A0R(r0, r1)
            if (r9 == 0) goto L_0x0074
            java.lang.String r0 = "3"
            r2.A0R(r0, r9)
        L_0x0074:
            java.lang.String r0 = "4"
            r2.A0q(r0)
            r2.A0c()
            java.lang.String r0 = "locale"
            r2.A0R(r0, r5)
            java.lang.String r0 = "color_theme"
            r2.A0R(r0, r4)
            r2.A0Z()
            r2.A0Z()
            r2.close()
            java.lang.String r4 = r3.toString()
            java.lang.Class<X.Txa> r3 = X.C14514Txa.class
            java.lang.String r2 = "ShowreelNativeInteractiveAnimationQuery"
            r1 = 1
            X.RAo r0 = new X.RAo
            r0.<init>(r3, r2, r4, r1)
            X.3Fb r2 = new X.3Fb
            r2.<init>(r7)
            r2.A09(r0)
            java.lang.String r0 = "showreel_native_policy"
            r2.A08 = r0
            java.lang.String r1 = "sn_res_v2"
            int r0 = r6.hashCode()
            java.lang.String r0 = X.002.A0O(r1, r0)
            r2.A05 = r0
            if (r11 == 0) goto L_0x00cc
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
        L_0x00bb:
            r2.A03 = r0
            long r0 = A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1OC r0 = r2.A07(r0)
            return r0
        L_0x00cc:
            if (r10 == 0) goto L_0x00d1
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x00bb
        L_0x00d1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            goto L_0x00bb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SBX.A00(X.Q1l, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, boolean, boolean):X.1OC");
    }
}
