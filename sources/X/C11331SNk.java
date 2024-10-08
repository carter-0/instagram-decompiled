package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.PowerManager;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.SNk  reason: case insensitive filesystem */
public final class C11331SNk {
    public static ScheduledExecutorService A0A;
    public int A00;
    public WorkSource A01;
    public AtomicInteger A02 = new AtomicInteger(0);
    public boolean A03 = true;
    public final Context A04;
    public final PowerManager.WakeLock A05;
    public final Object A06 = this;
    public final String A07;
    public final Map A08 = AnonymousClass7TE.A1E();
    public final Set A09 = Collections.synchronizedSet(AnonymousClass7TE.A1F());

    /* JADX WARNING: type inference failed for: r0v16, types: [X.Tay, java.lang.Object] */
    public C11331SNk(Context context) {
        Object[] objArr;
        String packageName = context.getPackageName();
        WorkSource workSource = null;
        AnonymousClass3Qk.A06("Analytics WakeLock", "WakeLock: wakeLockName must not be empty");
        Context applicationContext = context.getApplicationContext();
        this.A04 = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            this.A07 = Pxh.A0l("*gcore*:", "Analytics WakeLock");
        } else {
            this.A07 = "Analytics WakeLock";
        }
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "Analytics WakeLock");
        0BX.A02(newWakeLock, "Analytics WakeLock");
        this.A05 = newWakeLock;
        if (SN5.A00(context)) {
            packageName = (packageName == null || Pxi.A1Z(packageName)) ? context.getPackageName() : packageName;
            if (!(context.getPackageManager() == null || packageName == null)) {
                try {
                    ApplicationInfo applicationInfo = C241663Qd.A00(context).A00.getPackageManager().getApplicationInfo(packageName, 0);
                    if (applicationInfo == null) {
                        Pxh.A1L("Could not get applicationInfo from package: ", packageName, "WorkSourceUtil");
                    } else {
                        int i = applicationInfo.uid;
                        workSource = new WorkSource();
                        Method method = SN5.A02;
                        if (method != null) {
                            try {
                                objArr = new Object[]{Integer.valueOf(i), packageName};
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        } else {
                            method = SN5.A01;
                            objArr = method != null ? new Object[]{Integer.valueOf(i)} : objArr;
                        }
                        method.invoke(workSource, objArr);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Pxh.A1L("Could not find package: ", packageName, "WorkSourceUtil");
                }
            }
            this.A01 = workSource;
            if (workSource != null && SN5.A00(applicationContext)) {
                WorkSource workSource2 = this.A01;
                if (workSource2 != null) {
                    workSource2.add(workSource);
                } else {
                    this.A01 = workSource;
                }
                try {
                    newWakeLock.setWorkSource(this.A01);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e2) {
                    Log.wtf("WakeLock", e2.toString());
                }
            }
        }
        if (A0A == null) {
            synchronized (C9987Rkg.class) {
                if (C9987Rkg.A00 == null) {
                    C9987Rkg.A00 = new Object();
                }
            }
            A0A = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
        }
    }

    public static final void A00(C11331SNk sNk) {
        Method method;
        WorkSource workSource = sNk.A01;
        Boolean bool = SN5.A00;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (workSource != null && (method = SN5.A03) != null) {
            try {
                Object invoke = method.invoke(workSource, new Object[0]);
                AnonymousClass3Qk.A02(invoke);
                int A092 = Pxe.A09(invoke);
                if (A092 != 0) {
                    for (int i = 0; i < A092; i++) {
                        Method method2 = SN5.A04;
                        if (method2 != null) {
                            try {
                                String str = (String) method2.invoke(workSource, new Object[]{Integer.valueOf(i)});
                                if (str != null && !Pxi.A1Z(str)) {
                                    A1C.add(str);
                                }
                            } catch (Exception e) {
                                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static final void A01(C11331SNk sNk) {
        PowerManager.WakeLock wakeLock = sNk.A05;
        if (wakeLock.isHeld()) {
            try {
                C60270fk.A01(wakeLock);
            } catch (RuntimeException e) {
                if (e.getClass().equals(RuntimeException.class)) {
                    Log.e("WakeLock", String.valueOf(sNk.A07).concat(" was already released!"), e);
                } else {
                    throw e;
                }
            }
            wakeLock.isHeld();
        }
    }
}
