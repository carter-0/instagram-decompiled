package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Looper;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppFlag;
import java.util.concurrent.TimeUnit;

public final class SP0 {
    public static SP0 A05;
    public static final long A06;
    public static final long A07;
    public final ComponentName A00;
    public final SharedPreferences A01;
    public final PackageManager A02;
    public final AnonymousClass1SF A03;
    public final Context A04;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A07 = timeUnit.toMillis(7);
        A06 = JTR.A0N(timeUnit);
    }

    public static synchronized SP0 A00(Context context) {
        SP0 sp0;
        synchronized (SP0.class) {
            sp0 = A05;
            if (sp0 == null) {
                Context applicationContext = context.getApplicationContext();
                sp0 = new SP0(applicationContext, new AnonymousClass1SF(applicationContext, applicationContext.getPackageManager()));
                A05 = sp0;
            }
        }
        return sp0;
    }

    public final boolean A03() {
        AnonymousClass1SF r2 = this.A03;
        boolean z = true;
        if (!r2.A00().A05 || !r2.A01(1)) {
            z = false;
        }
        boolean z2 = false;
        if (!z) {
            return false;
        }
        synchronized (this) {
            if (this.A02.getComponentEnabledSetting(this.A00) == 1) {
                z2 = true;
            }
        }
        return z2;
    }

    public SP0(Context context, AnonymousClass1SF r4) {
        this.A04 = context;
        this.A03 = r4;
        this.A01 = Pxe.A0H(context, "oxygen_preloads_sdk");
        this.A02 = context.getPackageManager();
        this.A00 = new ComponentName(context, IsManagedAppFlag.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r9 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r0.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L_0x0066
            X.1SF r8 = r9.A03
            X.1TT r0 = r8.A00()
            boolean r1 = r0.A05
            r0 = 1
            if (r1 == 0) goto L_0x0065
            boolean r0 = r8.A01(r0)
            if (r0 == 0) goto L_0x0065
            monitor-enter(r9)
            android.content.pm.PackageManager r1 = r9.A02     // Catch:{ all -> 0x005f }
            android.content.ComponentName r0 = r9.A00     // Catch:{ all -> 0x005f }
            int r0 = r1.getComponentEnabledSetting(r0)     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x005d
            android.content.SharedPreferences r7 = r9.A01     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "/is_managed_app_cache/is_managed_app_last_check"
            r0 = 0
            long r4 = r7.getLong(r6, r0)     // Catch:{ all -> 0x005f }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005f }
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0049
            android.content.SharedPreferences$Editor r0 = r7.edit()     // Catch:{ all -> 0x005f }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r6, r2)     // Catch:{ all -> 0x005f }
            r0.apply()     // Catch:{ all -> 0x005f }
        L_0x0047:
            monitor-exit(r9)     // Catch:{ all -> 0x005f }
            goto L_0x005c
        L_0x0049:
            r0 = 9
            boolean r0 = r8.A01(r0)     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0054
            long r0 = A07     // Catch:{ all -> 0x005f }
            goto L_0x0056
        L_0x0054:
            long r0 = A06     // Catch:{ all -> 0x005f }
        L_0x0056:
            long r4 = r4 + r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0047
            goto L_0x005d
        L_0x005c:
            return
        L_0x005d:
            monitor-exit(r9)     // Catch:{ all -> 0x005f }
            goto L_0x0062
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005f }
            throw r0
        L_0x0062:
            r9.A02()
        L_0x0065:
            return
        L_0x0066:
            java.lang.String r0 = "Cannot block UI thread when waiting for service call."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SP0.A01():void");
    }

    public final void A02() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            AnonymousClass1SF r1 = this.A03;
            if (r1.A00().A05 && r1.A01(1)) {
                boolean z = C11205SFf.A00(this.A04).A07;
                synchronized (this) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int i = 2;
                    if (z) {
                        i = 1;
                    }
                    PackageManager packageManager = this.A02;
                    ComponentName componentName = this.A00;
                    packageManager.setComponentEnabledSetting(componentName, i, 1);
                    this.A01.edit().putLong("/is_managed_app_cache/is_managed_app_last_check", currentTimeMillis).apply();
                    packageManager.getComponentEnabledSetting(componentName);
                }
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0z("Cannot block UI thread when waiting for service call.");
    }
}
