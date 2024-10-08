package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.3Rl  reason: invalid class name and case insensitive filesystem */
public abstract class C241853Rl {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r8) {
        /*
            java.lang.String r0 = r8.getPackageName()
            java.lang.String r5 = com.facebook.rti.push.service.FbnsServiceDelegate.A00(r0)
            android.content.ComponentName r1 = new android.content.ComponentName
            r1.<init>(r8, r5)
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            int r0 = r0.getComponentEnabledSetting(r1)     // Catch:{ Exception -> 0x00b3 }
            r4 = 1
            if (r0 == r4) goto L_0x001a
            if (r0 != 0) goto L_0x00b3
        L_0x001a:
            java.lang.String r7 = r8.getPackageName()
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r8.getSystemService(r0)     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x002f
            boolean r0 = r2.isInstance(r1)     // Catch:{ Exception -> 0x002f }
            if (r0 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r1 = 0
        L_0x0030:
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1
            r0 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r0 = r1.getRunningServices(r0)     // Catch:{ NullPointerException -> 0x009b }
            if (r0 == 0) goto L_0x00a3
            java.util.Iterator r6 = r0.iterator()
        L_0x003f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r3 = r6.next()
            android.app.ActivityManager$RunningServiceInfo r3 = (android.app.ActivityManager.RunningServiceInfo) r3
            android.content.ComponentName r0 = r3.service
            java.lang.String r2 = r0.getClassName()
            android.content.ComponentName r0 = r3.service
            java.lang.String r1 = r0.getPackageName()
            boolean r0 = r5.equals(r2)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r7.equals(r1)
            if (r0 == 0) goto L_0x003f
            boolean r0 = r3.started
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "Orca.STOP"
            android.content.Intent r6 = new android.content.Intent
            r6.<init>(r0)
            java.lang.String r1 = r8.getPackageName()
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r1, r5)
            r6.setComponent(r0)
            r0 = 0
            X.3Rv r3 = new X.3Rv
            r3.<init>(r8, r0)
            android.content.ComponentName r0 = r6.getComponent()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r2 = r3.A00
            X.3RB r1 = r3.A01
            boolean r0 = X.C241843Rk.A01(r2, r1, r0)
            if (r0 == 0) goto L_0x00a3
            r3.A02(r6)
            r1.A05(r2, r6)
            goto L_0x00a3
        L_0x009b:
            r2 = move-exception
            java.lang.String r1 = "RtiGracefulSystemMethodHelper"
            java.lang.String r0 = "Failed to getRunningServices"
            X.0KC.A0G(r1, r0, r2)
        L_0x00a3:
            android.content.ComponentName r2 = new android.content.ComponentName
            r2.<init>(r8, r5)
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            r0 = 2
            r1.setComponentEnabledSetting(r2, r0, r4)
            r2.getShortClassName()
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241853Rl.A00(android.content.Context):void");
    }

    public static void A01(Context context, C241823Ri r8, String str, String str2, String str3, String str4) {
        if (context.getPackageName().equals(str3)) {
            ComponentName componentName = new ComponentName(context, str);
            context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            componentName.getShortClassName();
        }
        ComponentName componentName2 = new ComponentName(str3, str);
        Intent intent = new Intent(str4);
        intent.setComponent(componentName2);
        intent.putExtra("caller", str2);
        if (r8 != null) {
            String str5 = r8.A03;
            if (str5 != null) {
                intent.putExtra("caller", str5);
            }
            long j = r8.A00;
            if (j != 0) {
                intent.putExtra("EXPIRED_SESSION", j);
            }
            Boolean bool = r8.A01;
            if (bool != null) {
                intent.putExtra("EXPLICIT_DELIVERY_ACK", bool);
            }
            Integer num = r8.A02;
            if (num != null) {
                intent.putExtra(Pxd.A00(142), num);
            }
        }
        C241903Rv r3 = new C241903Rv(context, (Boolean) null);
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            Context context2 = r3.A00;
            AnonymousClass3RB r1 = r3.A01;
            if (C241843Rk.A01(context2, r1, packageName)) {
                r3.A02(intent);
                r1.A05(context2, intent);
            }
        }
    }
}
