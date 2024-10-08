package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Messenger;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.analytics2.logger.legacy.uploader.HighPriUploadRetryReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3n5  reason: invalid class name and case insensitive filesystem */
public final class C251423n5 {
    public static C251423n5 A02;
    public static final long A03 = TimeUnit.SECONDS.toMillis(90);
    public PowerManager A00;
    public AlarmManager A01;

    private synchronized AlarmManager A00(Context context) {
        AlarmManager alarmManager;
        alarmManager = this.A01;
        if (alarmManager == null) {
            alarmManager = (AlarmManager) context.getSystemService("alarm");
            this.A01 = alarmManager;
        }
        return alarmManager;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.3n5, java.lang.Object] */
    public static C251423n5 A01() {
        C251423n5 r0;
        synchronized (C251423n5.class) {
            C251423n5 r02 = A02;
            r0 = r02;
            if (r02 == null) {
                ? obj = new Object();
                A02 = obj;
                r0 = obj;
            }
        }
        return r0;
    }

    public final void A02(Context context, Bundle bundle, 1uw r24, C251433n6 r25, String str, int i) {
        PowerManager powerManager;
        C251433n6 r10 = r25;
        if (r25 == null || (r10.A01 >= 0 && r10.A00 >= 0)) {
            Context context2 = context;
            ComponentName componentName = 1v1.A00(context2).A00;
            synchronized (C251423n5.class) {
                powerManager = this.A00;
                if (powerManager == null) {
                    powerManager = (PowerManager) context2.getApplicationContext().getSystemService("power");
                    this.A00 = powerManager;
                }
            }
            int i2 = i;
            String A0u = 002.A0u("JobSchedulerHack-", componentName.getShortClassName(), "-client-", String.valueOf(i2));
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, A0u);
            0BX.A02(newWakeLock, A0u);
            C60270fk.A02(newWakeLock);
            Q7k q7k = new Q7k(new C10182Rny(newWakeLock));
            Messenger messenger = new Messenger(q7k);
            C251443n7.A01().add(q7k);
            1uw r9 = r24;
            String str2 = str;
            Intent putExtras = new Intent().setComponent(componentName).setAction(str2).putExtras(new C251443n7(context2, bundle, messenger, r9, r10, str2, i2).A02());
            long j = A03;
            newWakeLock.acquire(j);
            0BX.A01(newWakeLock, j);
            try {
                0b6.A00().A07().A05(context2, putExtras);
            } catch (IllegalStateException unused) {
                A03(context2, r9, str2, i2, 0, true);
            }
        } else {
            throw new IllegalStateException("fallback delay ms must be >= 0");
        }
    }

    public final void A03(Context context, 1uw r14, String str, int i, long j, boolean z) {
        ComponentName componentName;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        Context context2 = context;
        1uw r8 = r14;
        C251443n7 r4 = new C251443n7(context2, (Bundle) null, (Messenger) null, r8, new C251433n6(timeUnit.toMillis(15), timeUnit.toMillis(30), str), str, i);
        Intent intent = new Intent();
        if (z) {
            componentName = new ComponentName(context, HighPriUploadRetryReceiver.class);
        } else {
            componentName = 1v1.A00(context).A00;
        }
        Intent putExtras = intent.setComponent(componentName).setAction("com.facebook.analytics2.logger.UPLOAD_NOW").putExtras(r4.A02());
        int i2 = 134217728;
        if (Build.VERSION.SDK_INT >= 30) {
            i2 = 201326592;
        }
        try {
            PendingIntent service = PendingIntent.getService(context, 1, putExtras, i2);
            try {
                if (AnonymousClass0Am.A00(A00(context), context)) {
                    A00(context).setExactAndAllowWhileIdle(2, SystemClock.elapsedRealtime() + j, service);
                } else {
                    A00(context).set(2, SystemClock.elapsedRealtime() + j, service);
                }
            } catch (NullPointerException e) {
                0KC.A0H("JobSchedulerHack", "Unexpected NPE when scheduling alarm. This is most likely an OS bug.", e);
            }
        } catch (SecurityException e2) {
            0KC.A0P("JobSchedulerHack", "Exception while calling PendingIntent.getService: %s", new Object[]{e2.getMessage()});
        }
    }

    public final void A04(Context context, boolean z) {
        ComponentName componentName;
        Intent intent = new Intent();
        if (z) {
            componentName = new ComponentName(context, HighPriUploadRetryReceiver.class);
        } else {
            componentName = 1v1.A00(context).A00;
        }
        Intent action = intent.setComponent(componentName).setAction("com.facebook.analytics2.logger.UPLOAD_NOW");
        int i = 536870912;
        if (Build.VERSION.SDK_INT >= 30) {
            i = 603979776;
        }
        PendingIntent service = PendingIntent.getService(context, 1, action, i);
        if (service != null) {
            A00(context).cancel(service);
        }
    }
}
