package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;

/* renamed from: X.3RB  reason: invalid class name */
public final class AnonymousClass3RB {
    public static final AnonymousClass3RB A02 = new AnonymousClass3RB();
    public boolean A00 = false;
    public final 0Gb A01;

    public final boolean A07(BroadcastReceiver broadcastReceiver, Context context, IntentFilter intentFilter, Handler handler, Boolean bool) {
        try {
            0DH.A02(broadcastReceiver, context, intentFilter, handler, (String) null, bool.booleanValue());
            return true;
        } catch (IllegalArgumentException | SecurityException e) {
            0KC.A0G("RtiGracefulSystemMethodHelper", "Failed to registerReceiver", e);
            return false;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                return false;
            }
            throw e2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[Catch:{ RuntimeException -> 0x0051, NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009c A[Catch:{ RuntimeException -> 0x0051, NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3RC A01(android.content.Context r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            java.lang.String r5 = "RtiGracefulSystemMethodHelper"
            X.3RC r4 = new X.3RC
            r4.<init>(r8)
            android.content.pm.PackageManager r0 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r8, r9)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            r4.A01 = r0     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x00bb
            android.content.pm.ApplicationInfo r0 = r0.applicationInfo     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x00bb
            android.content.pm.PackageInfo r1 = r4.A01     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r1 == 0) goto L_0x0082
            android.content.pm.ApplicationInfo r0 = r1.applicationInfo     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x0082
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r3 = r1.packageName     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            java.lang.Object r2 = X.AnonymousClass3RD.A00     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            X.3RX r2 = (X.AnonymousClass3RX) r2     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            java.lang.String r0 = r2.A05     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            boolean r0 = r0.equals(r3)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            r1 = 1
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = r2.A04     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            boolean r0 = r0.equals(r3)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 != 0) goto L_0x008b
            java.lang.String r1 = "com.facebook.rti.fbns.intent.RECEIVE"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            r0.<init>(r1)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            android.content.Intent r2 = r0.setPackage(r3)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            android.content.pm.PackageManager r1 = r7.getPackageManager()     // Catch:{ RuntimeException -> 0x0051 }
            r0 = 0
            java.util.List r0 = r1.queryBroadcastReceivers(r2, r0)     // Catch:{ RuntimeException -> 0x0051 }
            if (r0 == 0) goto L_0x0060
            goto L_0x0085
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "Failed to queryBroadcastReceivers"
            X.0KC.A0G(r5, r0, r1)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            boolean r0 = r0 instanceof android.os.DeadObjectException     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 != 0) goto L_0x0060
            throw r1     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
        L_0x0060:
            r1 = 0
            goto L_0x008f
        L_0x0062:
            boolean r0 = r6.A00     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x007f
            android.content.pm.PackageManager r3 = r7.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r3 == 0) goto L_0x0082
            java.lang.String r2 = r4.A00     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            int r1 = r3.getApplicationEnabledSetting(r2)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            r0 = 2
            if (r1 == r0) goto L_0x007c
            int r1 = r3.getApplicationEnabledSetting(r2)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            r0 = 4
            if (r1 != r0) goto L_0x0082
        L_0x007c:
            java.lang.Integer r0 = X.AnonymousClass05K.A0j     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            goto L_0x0099
        L_0x007f:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            goto L_0x0099
        L_0x0082:
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            goto L_0x0099
        L_0x0085:
            boolean r0 = r0.isEmpty()     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            r1 = r0 ^ 1
        L_0x008b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
        L_0x008f:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            boolean r0 = r0.equals(r1)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
        L_0x0099:
            r4.A02 = r0     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            goto L_0x00a7
        L_0x009c:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            boolean r0 = r0.equals(r1)     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            if (r0 == 0) goto L_0x0082
            java.lang.Integer r0 = X.AnonymousClass05K.A0N     // Catch:{ NameNotFoundException -> 0x00b7, RuntimeException -> 0x00a8 }
            goto L_0x0099
        L_0x00a7:
            return r4
        L_0x00a8:
            r1 = move-exception
            java.lang.String r0 = "Failed to getPackageInfo"
            X.0KC.A0G(r5, r0, r1)
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x00bb
            throw r1
        L_0x00b7:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4.A02 = r0
        L_0x00bb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RB.A01(android.content.Context, java.lang.String, int):X.3RC");
    }

    public final void A02(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        try {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        } catch (SecurityException e) {
            0KC.A0G("RtiGracefulSystemMethodHelper", "Failed to setAndAllowWhileIdle", e);
            if (this.A01 != null) {
                this.A01.Ew3("RtiGracefulSystemMethodHelper", e);
            }
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof DeadObjectException) {
                0Gb r1 = this.A01;
                if (r1 != null) {
                    r1.Ew2("RtiGracefulSystemMethodHelper", "setAndAllowWhileIdle DeadObjectException", e2);
                    return;
                }
                return;
            }
            throw e2;
        }
    }

    public final void A04(Context context, AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        try {
            if (A00(alarmManager, context)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
                } else if (Build.VERSION.SDK_INT >= 19) {
                    alarmManager.setExact(i, j, pendingIntent);
                } else {
                    alarmManager.set(i, j, pendingIntent);
                }
            } else if (Build.VERSION.SDK_INT >= 23) {
                alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
            } else {
                alarmManager.set(i, j, pendingIntent);
            }
        } catch (SecurityException e) {
            0KC.A0G("RtiGracefulSystemMethodHelper", "Failed to set alarm", e);
            0Gb r0 = this.A01;
            if (r0 != null) {
                r0.Ew3("RtiGracefulSystemMethodHelper", e);
            }
        } catch (NullPointerException e2) {
            0Gb r1 = this.A01;
            if (r1 != null) {
                r1.Ew2("RtiGracefulSystemMethodHelper", "set alarm NullPointerException", e2);
            }
        } catch (IllegalStateException e3) {
            0Gb r12 = this.A01;
            if (r12 != null) {
                r12.Ew2("RtiGracefulSystemMethodHelper", "set alarm IllegalStateException", e3);
            }
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof DeadObjectException) {
                0Gb r13 = this.A01;
                if (r13 != null) {
                    r13.Ew2("RtiGracefulSystemMethodHelper", "set alarm DeadObjectException", e4);
                    return;
                }
                return;
            }
            throw e4;
        }
    }

    @Deprecated
    public final void A05(Context context, Intent intent) {
        try {
            context.startService(intent);
        } catch (SecurityException e) {
            0KC.A0G("RtiGracefulSystemMethodHelper", "Failed to startService", e);
        } catch (IllegalStateException unused) {
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
    }

    public final boolean A06(BroadcastReceiver broadcastReceiver, Context context) {
        try {
            context.unregisterReceiver(broadcastReceiver);
            return true;
        } catch (SecurityException e) {
            0KC.A0G("RtiGracefulSystemMethodHelper", "Failed to unregisterReceiver", e);
            return false;
        } catch (IllegalArgumentException e2) {
            0KC.A0I("RtiGracefulSystemMethodHelper", "failed to unregisterReceiver", e2);
            return false;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof DeadObjectException) {
                return false;
            }
            throw e3;
        }
    }

    @Deprecated
    public final boolean A08(Context context, Intent intent) {
        try {
            context.sendBroadcast(intent);
            return true;
        } catch (SecurityException e) {
            0KC.A0G("RtiGracefulSystemMethodHelper", "Failed to sendBroadcast", e);
        } catch (RuntimeException e2) {
            if (!(e2.getCause() instanceof DeadObjectException)) {
                throw e2;
            }
        }
        return false;
    }

    public static final boolean A00(AlarmManager alarmManager, Context context) {
        return AnonymousClass0Am.A00(alarmManager, context);
    }

    public final void A03(AlarmManager alarmManager, PendingIntent pendingIntent) {
        try {
            alarmManager.cancel(pendingIntent);
        } catch (SecurityException unused) {
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof DeadObjectException)) {
                throw e;
            }
        }
    }
}
