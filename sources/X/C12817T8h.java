package X;

import android.content.Context;
import android.net.Uri;
import android.util.Log;

/* renamed from: X.T8h  reason: case insensitive filesystem */
public final class C12817T8h implements C13792Th7 {
    public Context A00;
    public SVM A01;
    public C10506RtL A02;
    public boolean A03 = false;
    public Uri A04;

    public static void A00(C12817T8h t8h) {
        Context context = t8h.A00;
        if (context.getPackageManager().checkPermission("android.permission.INTERNET", context.getPackageName()) != 0) {
            Log.e("BrowserAuthHandler", "Missing INTERNET permission");
        }
        t8h.A00.startActivity(Pxe.A0F(t8h.A04));
        t8h.A03 = true;
    }

    public final boolean CP1() {
        return this.A03;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0120 A[EDGE_INSN: B:49:0x0120->B:41:0x0120 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean EwS(android.app.Activity r16, com.spotify.sdk.android.auth.AuthorizationRequest r17) {
        /*
            r15 = this;
            java.lang.String r5 = "BrowserAuthHandler"
            r0 = r16
            r15.A00 = r0
            r6 = r17
            android.net.Uri r0 = r6.A00()
            r15.A04 = r0
            android.content.Context r1 = r15.A00
            java.lang.String r8 = r6.A02
            android.content.pm.PackageManager r4 = r1.getPackageManager()
            android.net.Uri r2 = r6.A00()
            java.lang.String r9 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r9, r2)
            java.lang.String r3 = "android.intent.category.BROWSABLE"
            android.content.Intent r2 = r0.addCategory(r3)
            r11 = 0
            android.content.pm.ResolveInfo r0 = r4.resolveActivity(r2, r11)
            r7 = 0
            if (r0 == 0) goto L_0x0069
            android.content.pm.ActivityInfo r0 = r0.activityInfo
            java.lang.String r10 = r0.packageName
        L_0x0033:
            java.util.List r0 = r4.queryIntentActivities(r2, r11)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r0.iterator()
        L_0x003f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r12 = r14.next()
            android.content.pm.ResolveInfo r12 = (android.content.pm.ResolveInfo) r12
            android.content.Intent r13 = X.DbS.A09()
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            r13.setAction(r0)
            android.content.pm.ActivityInfo r0 = r12.activityInfo
            java.lang.String r0 = r0.packageName
            r13.setPackage(r0)
            android.content.pm.ResolveInfo r0 = r4.resolveService(r13, r11)
            if (r0 == 0) goto L_0x003f
            android.content.pm.ActivityInfo r0 = r12.activityInfo
            java.lang.String r0 = r0.packageName
            r2.add(r0)
            goto L_0x003f
        L_0x0069:
            r10 = r7
            goto L_0x0033
        L_0x006b:
            int r0 = r2.size()
            r4 = 1
            if (r0 == r4) goto L_0x0123
            int r0 = r2.size()
            if (r0 <= r4) goto L_0x0085
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0123
            boolean r0 = r2.contains(r10)
            if (r0 == 0) goto L_0x0123
            r7 = r10
        L_0x0085:
            java.lang.String r0 = "http"
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = "https"
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L_0x0120
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0120
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            if (r2 == 0) goto L_0x0120
            android.content.Intent r1 = X.DbS.A09()
            r1.setAction(r9)
            java.lang.String r0 = "android.intent.category.DEFAULT"
            r1.addCategory(r0)
            r1.addCategory(r3)
            android.net.Uri r0 = android.net.Uri.parse(r8)
            r1.setData(r0)
            r0 = 64
            java.util.List r0 = r2.queryIntentActivities(r1, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00c1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0120
            java.lang.Object r2 = r3.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            java.lang.Class<com.spotify.sdk.android.auth.browser.RedirectUriReceiverActivity> r0 = com.spotify.sdk.android.auth.browser.RedirectUriReceiverActivity.class
            java.lang.String r1 = r0.getName()
            android.content.pm.ActivityInfo r0 = r2.activityInfo
            java.lang.String r0 = r0.name
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c1
        L_0x00dd:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r3 = r0 ^ 1
            android.content.Context r0 = r15.A00
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "android.permission.INTERNET"
            int r0 = r2.checkPermission(r0, r1)
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = "Missing INTERNET permission"
            android.util.Log.e(r5, r0)
        L_0x00fa:
            if (r3 == 0) goto L_0x012b
            X.QAW r3 = new X.QAW
            r3.<init>(r6, r15)
            r15.A01 = r3
            android.content.Context r2 = r15.A00
            android.content.Context r0 = r2.getApplicationContext()
            r3.A00 = r0
            java.lang.String r0 = "android.support.customtabs.action.CustomTabsService"
            android.content.Intent r1 = X.Pxe.A0G(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x011a
            r1.setPackage(r7)
        L_0x011a:
            r0 = 33
            r2.bindService(r1, r3, r0)
            return r4
        L_0x0120:
            java.lang.String r7 = ""
            goto L_0x00dd
        L_0x0123:
            java.lang.Object r7 = r2.get(r11)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x0085
        L_0x012b:
            A00(r15)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12817T8h.EwS(android.app.Activity, com.spotify.sdk.android.auth.AuthorizationRequest):boolean");
    }

    public final void stop() {
        SVM svm = this.A01;
        if (svm != null) {
            this.A00.unbindService(svm);
            this.A02 = null;
            this.A01 = null;
        }
        this.A00 = null;
        this.A03 = false;
    }
}
