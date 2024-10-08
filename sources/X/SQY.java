package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.LinkedList;
import java.util.List;

public abstract class SQY {
    public static List A00;
    public static Boolean A01;

    public static void A01(Intent intent, String str) {
        if (str != null) {
            try {
                Uri A03 = 0cp.A03(str);
                String scheme = A03.getScheme();
                String authority = A03.getAuthority();
                if (scheme != null && authority != null) {
                    Bundle A0a = AnonymousClass7TE.A0a();
                    A0a.putString("Referer", 002.A0g(scheme, "://", authority));
                    intent.putExtra("com.android.browser.headers", A0a);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 == false) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(android.content.Context r3) {
        /*
            java.lang.Boolean r0 = A01
            if (r0 == 0) goto L_0x0009
            boolean r1 = r0.booleanValue()
            return r1
        L_0x0009:
            boolean r0 = r3 instanceof android.app.Activity
            if (r0 == 0) goto L_0x001f
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = 0
            android.content.pm.PackageManager r1 = r3.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.ComponentName r0 = r3.getComponentName()     // Catch:{ NameNotFoundException -> 0x0053 }
            android.content.pm.ActivityInfo r0 = r1.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0053 }
            java.lang.String r1 = r0.processName     // Catch:{ NameNotFoundException -> 0x0053 }
            goto L_0x0047
        L_0x001f:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            int r3 = android.os.Process.myPid()
            java.util.List r0 = r0.getRunningAppProcesses()
            if (r0 == 0) goto L_0x005c
            java.util.Iterator r2 = r0.iterator()
        L_0x0035:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r1 = r2.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r0 = r1.pid
            if (r0 != r3) goto L_0x0035
            java.lang.String r1 = r1.processName
        L_0x0047:
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = ":browser"
            boolean r0 = r1.endsWith(r0)
            r1 = 1
            if (r0 != 0) goto L_0x005d
            goto L_0x005c
        L_0x0053:
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = "BrowserContextHelper"
            java.lang.String r0 = "Y U can't find the activity info!"
            X.SQO.A02(r1, r0, r2)
        L_0x005c:
            r1 = 0
        L_0x005d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            A01 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQY.A02(android.content.Context):boolean");
    }

    static {
        LinkedList A1A = Pxe.A1A();
        A00 = A1A;
        A1A.add(new Object());
        A1A.add(new Object());
        A1A.add(new Object());
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.A4h, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r7 != null) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C39667A4h A00(android.content.Context r7, java.lang.String r8, boolean r9) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r5 = 0
            if (r0 == 0) goto L_0x0011
            r1 = r5
        L_0x0008:
            X.A4h r3 = new X.A4h
            r3.<init>()
            if (r1 == 0) goto L_0x009a
            r4 = 0
            goto L_0x0028
        L_0x0011:
            android.content.Intent r1 = X.0b8.A00(r8)     // Catch:{ URISyntaxException -> 0x0026 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.addFlags(r0)
            java.lang.String r0 = "android.intent.category.BROWSABLE"
            r1.addCategory(r0)
            r1.setComponent(r5)
            r1.setSelector(r5)
            goto L_0x0008
        L_0x0026:
            r1 = r5
            goto L_0x0008
        L_0x0028:
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ Exception -> 0x0033 }
            android.content.pm.ResolveInfo r0 = r0.resolveActivity(r1, r4)     // Catch:{ Exception -> 0x0033 }
            if (r0 == 0) goto L_0x003f
            goto L_0x0078
        L_0x0033:
            r0 = move-exception
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x0084 }
            java.lang.Object[] r2 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "BrowserContextHelper"
            X.SQO.A02(r0, r6, r2)     // Catch:{ Exception -> 0x0084 }
        L_0x003f:
            java.lang.String r6 = r1.getPackage()     // Catch:{ Exception -> 0x0084 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x0084 }
            if (r0 != 0) goto L_0x0076
            java.util.List r0 = A00     // Catch:{ Exception -> 0x0084 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0084 }
        L_0x004f:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0084 }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x0084 }
            X.Tgh r0 = (X.C13769Tgh) r0     // Catch:{ Exception -> 0x0084 }
            android.os.Bundle r1 = r0.ALa(r5, r6, r9)     // Catch:{ Exception -> 0x0084 }
            boolean r0 = r0.FIC(r7, r1)     // Catch:{ Exception -> 0x0084 }
            if (r0 == 0) goto L_0x004f
            r2 = 1
            r3.A01 = r2     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "package_names"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)     // Catch:{ Exception -> 0x0084 }
            java.util.ArrayList r0 = X.QL3.A00     // Catch:{ Exception -> 0x0084 }
            if (r1 != r0) goto L_0x009a
            r3.A00 = r2     // Catch:{ Exception -> 0x0084 }
            return r3
        L_0x0076:
            if (r7 == 0) goto L_0x009a
        L_0x0078:
            java.lang.String r0 = X.RQ7.A00     // Catch:{ ActivityNotFoundException -> 0x009a }
            A01(r1, r0)     // Catch:{ ActivityNotFoundException -> 0x009a }
            X.AnonymousClass0b5.A01(r7, r1)     // Catch:{ ActivityNotFoundException -> 0x009a }
            r0 = 1
            r3.A01 = r0     // Catch:{ Exception -> 0x0084 }
            return r3
        L_0x0084:
            r0 = move-exception
            java.lang.String r2 = "url passed in: "
            java.lang.String r1 = "\n"
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = X.002.A0u(r2, r8, r1, r0)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "BrowserContextHelper"
            X.SQO.A02(r0, r2, r1)
            return r3
        L_0x009a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQY.A00(android.content.Context, java.lang.String, boolean):X.A4h");
    }
}
