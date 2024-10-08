package com.instagram.urlhandlers.crossapptagging;

import X.00l;
import X.0Tu;
import X.0qQ;
import X.182;
import X.AnonymousClass000;
import X.AnonymousClass0iw;
import android.os.Bundle;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.urlhandler.UserSessionUrlHandlerActivity;

public final class XATUrlHandlerActivity extends UserSessionUrlHandlerActivity implements AnonymousClass0iw {
    public final void A0j(Bundle bundle) {
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(580);
    }

    private final String A01(String str, String str2) {
        String formatStrLocaleSafe;
        String A04 = 182.A04(0Tu.A05, this.A00, 36879368047755530L);
        if (00l.A0W(A04)) {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/%s/posts/%s", str, str2);
        } else {
            formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("https://www.facebook.com/%s/posts/%s?mibextid=%s", str, str2, A04);
        }
        0qQ.A0A(formatStrLocaleSafe);
        return formatStrLocaleSafe;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [android.content.Context, com.instagram.urlhandlers.crossapptagging.XATUrlHandlerActivity, android.app.Activity, com.instagram.urlhandler.UserSessionUrlHandlerActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (X.00l.A0W(r5) != false) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r9 != false) goto L_0x00a5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0n(android.os.Bundle r11, android.os.Bundle r12, com.instagram.common.session.UserSession r13) {
        /*
            r10 = this;
            android.content.Intent r1 = r10.getIntent()
            if (r1 == 0) goto L_0x018b
            r0 = 13
            java.lang.String r0 = X.Pxd.A00(r0)
            android.os.Bundle r0 = r1.getBundleExtra(r0)
            if (r0 == 0) goto L_0x018b
            java.lang.String r3 = X.DbS.A0m(r0)
            if (r3 == 0) goto L_0x018b
            int r0 = r3.length()
            if (r0 == 0) goto L_0x018b
            java.lang.String r4 = "XATUrlHandlerActivity"
            X.0wW r2 = r10.A00
            X.0Tu r7 = X.0Tu.A05
            r0 = 36316418094141801(0x81059700041169, double:3.029987264988789E-306)
            boolean r0 = X.DbY.A1Y(r7, r2, r0)
            if (r0 == 0) goto L_0x018e
            android.net.Uri r1 = X.DbT.A09(r3)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r0 = "user_id"
            java.lang.String r6 = r1.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r3 = ""
            if (r6 != 0) goto L_0x003e
            r6 = r3
        L_0x003e:
            java.lang.String r0 = "post_id"
            java.lang.String r5 = r1.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x0181 }
            if (r5 != 0) goto L_0x0047
            r5 = r3
        L_0x0047:
            r0 = 1345(0x541, float:1.885E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r2 = r1.getQueryParameter(r0)     // Catch:{ SecurityException -> 0x0181 }
            if (r2 != 0) goto L_0x0054
            r2 = r3
        L_0x0054:
            int r0 = r2.length()     // Catch:{ SecurityException -> 0x0181 }
            r9 = 1
            r1 = 0
            if (r0 <= 0) goto L_0x0070
            boolean r0 = X.C51966G9m.A1X(r2)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 == 0) goto L_0x0070
            byte[] r1 = android.util.Base64.decode(r2, r1)     // Catch:{ SecurityException -> 0x0181 }
            X.0qQ.A07(r1)     // Catch:{ SecurityException -> 0x0181 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r3 = new java.lang.String     // Catch:{ SecurityException -> 0x0181 }
            r3.<init>(r1, r0)     // Catch:{ SecurityException -> 0x0181 }
        L_0x0070:
            int r0 = r6.length()     // Catch:{ SecurityException -> 0x0181 }
            if (r0 == 0) goto L_0x0089
            boolean r0 = X.00l.A0W(r6)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x0089
            int r0 = r5.length()     // Catch:{ SecurityException -> 0x0181 }
            if (r0 == 0) goto L_0x0089
            boolean r0 = X.00l.A0W(r5)     // Catch:{ SecurityException -> 0x0181 }
            r1 = 1
            if (r0 == 0) goto L_0x008a
        L_0x0089:
            r1 = 0
        L_0x008a:
            int r0 = r3.length()     // Catch:{ SecurityException -> 0x0181 }
            if (r0 == 0) goto L_0x0097
            boolean r0 = X.00l.A0W(r3)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            if (r1 != 0) goto L_0x00a3
            if (r9 != 0) goto L_0x00a5
            java.lang.String r0 = "Invalid or missing params for post notification"
            X.0wb.A03(r4, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x018b
        L_0x00a3:
            if (r9 == 0) goto L_0x00b6
        L_0x00a5:
            android.net.Uri r0 = X.0cp.A03(r3)     // Catch:{ SecurityException -> 0x0181 }
            boolean r0 = X.C11324SMy.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x00b6
            java.lang.String r0 = "Invalid fbPostUrl from post notification"
            X.0wb.A03(r4, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x018b
        L_0x00b6:
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r2 = "com.facebook.wakizashi"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r2)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x00ce
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ SecurityException -> 0x0181 }
            java.lang.String r0 = "com.facebook.katana"
            android.content.Intent r0 = r1.getLaunchIntentForPackage(r0)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 == 0) goto L_0x010e
        L_0x00ce:
            X.0wW r8 = r10.A00     // Catch:{ SecurityException -> 0x0181 }
            r0 = 36316418094272874(0x8105970006116a, double:3.02998726507168E-306)
            boolean r0 = X.DbY.A1Y(r7, r8, r0)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 == 0) goto L_0x010e
            if (r9 == 0) goto L_0x00f2
            android.net.Uri r1 = X.DbT.A09(r3)     // Catch:{ SecurityException -> 0x0181 }
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ SecurityException -> 0x0181 }
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r2)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x00ed
            java.lang.String r2 = "com.facebook.katana"
        L_0x00ed:
            android.content.Intent r0 = X.C51976G9y.A03(r1, r2)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x010a
        L_0x00f2:
            java.lang.String r0 = r10.A01(r6, r5)     // Catch:{ SecurityException -> 0x0181 }
            android.net.Uri r1 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x0181 }
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ SecurityException -> 0x0181 }
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r2)     // Catch:{ SecurityException -> 0x0181 }
            if (r0 != 0) goto L_0x0106
            java.lang.String r2 = "com.facebook.katana"
        L_0x0106:
            android.content.Intent r0 = X.C51976G9y.A03(r1, r2)     // Catch:{ SecurityException -> 0x0181 }
        L_0x010a:
            X.0kR.A0A(r10, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x018b
        L_0x010e:
            X.0wW r2 = r10.A00     // Catch:{ SecurityException -> 0x0181 }
            r0 = 36597893070916662(0x82059700050c36, double:3.207993173709968E-306)
            java.lang.Long r0 = X.AnonymousClass7TF.A0Y(r7, r2, r0)     // Catch:{ SecurityException -> 0x0181 }
            r1 = -1
            if (r0 == 0) goto L_0x0177
            long r7 = r0.longValue()     // Catch:{ SecurityException -> 0x0181 }
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x018b
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x015e
            if (r9 == 0) goto L_0x0142
            X.0wW r2 = r10.A00     // Catch:{ SecurityException -> 0x0181 }
            r0 = 2
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
            X.0qQ.A0C(r2, r0)     // Catch:{ SecurityException -> 0x0181 }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ SecurityException -> 0x0181 }
            X.2EG r1 = X.2EG.A1S     // Catch:{ SecurityException -> 0x0181 }
            r0 = 580(0x244, float:8.13E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x015a
        L_0x0142:
            java.lang.String r3 = r10.A01(r6, r5)     // Catch:{ SecurityException -> 0x0181 }
            X.0wW r2 = r10.A00     // Catch:{ SecurityException -> 0x0181 }
            r0 = 2
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
            X.0qQ.A0C(r2, r0)     // Catch:{ SecurityException -> 0x0181 }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ SecurityException -> 0x0181 }
            X.2EG r1 = X.2EG.A1S     // Catch:{ SecurityException -> 0x0181 }
            r0 = 580(0x244, float:8.13E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
        L_0x015a:
            X.FH7.A08(r10, r2, r1, r3, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x018b
        L_0x015e:
            r1 = 1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0177
            if (r9 == 0) goto L_0x016b
            android.net.Uri r0 = X.DbT.A09(r3)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x0173
        L_0x016b:
            java.lang.String r0 = r10.A01(r6, r5)     // Catch:{ SecurityException -> 0x0181 }
            android.net.Uri r0 = X.DbT.A09(r0)     // Catch:{ SecurityException -> 0x0181 }
        L_0x0173:
            X.0kR.A0F(r10, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x018b
        L_0x0177:
            r0 = 967(0x3c7, float:1.355E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ SecurityException -> 0x0181 }
            X.0wb.A03(r4, r0)     // Catch:{ SecurityException -> 0x0181 }
            goto L_0x018b
        L_0x0181:
            r0 = move-exception
            X.0wb.A07(r4, r0)     // Catch:{ all -> 0x0186 }
            goto L_0x018b
        L_0x0186:
            r0 = move-exception
            r10.finish()
            throw r0
        L_0x018b:
            r10.finish()
        L_0x018e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandlers.crossapptagging.XATUrlHandlerActivity.A0n(android.os.Bundle, android.os.Bundle, com.instagram.common.session.UserSession):void");
    }
}
