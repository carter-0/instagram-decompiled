package com.google.android.gms.common;

import X.0SM;
import X.0hq;
import X.AnonymousClass3Qk;
import X.AnonymousClass9T8;
import X.C298485tV;
import X.C8435QuX;
import X.Pxd;
import X.SS0;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.util.DeviceProperties;
import com.instagram.android.R;

public final class GoogleApiAvailability extends GoogleApiAvailabilityLight {
    public static final GoogleApiAvailability A00 = new Object();
    public static final Object A01 = new Object();

    public static final AlertDialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, C298485tV r7, int i) {
        AlertDialog.Builder builder;
        int i2;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(SS0.A01(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i == 1) {
            i2 = 2131956448;
        } else if (i != 2) {
            i2 = 2131956445;
            if (i != 3) {
                i2 = 17039370;
            }
        } else {
            i2 = 2131956455;
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, r7);
        }
        String A02 = SS0.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        Log.w(Pxd.A00(148), String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i)}), new IllegalArgumentException());
        return builder.create();
    }

    public final void A06(PendingIntent pendingIntent, Context context, int i) {
        String A02;
        String format;
        int i2;
        String format2 = String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null});
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String A002 = Pxd.A00(148);
        Log.w(A002, format2, illegalArgumentException);
        if (i == 18) {
            new C8435QuX(context, this).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                A02 = SS0.A03(context, "common_google_play_services_resolution_required_title");
            } else {
                A02 = SS0.A02(context, i);
            }
            if (A02 == null) {
                A02 = context.getResources().getString(2131956452);
            }
            if (i == 6 || i == 19) {
                String A003 = SS0.A00(context);
                Resources resources = context.getResources();
                String A03 = SS0.A03(context, "common_google_play_services_resolution_required_text");
                if (A03 == null) {
                    A03 = resources.getString(2131956453);
                }
                format = String.format(resources.getConfiguration().locale, A03, new Object[]{A003});
            } else {
                format = SS0.A01(context, i);
            }
            Resources resources2 = context.getResources();
            Object systemService = context.getSystemService("notification");
            AnonymousClass3Qk.A02(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            AnonymousClass9T8 r6 = new AnonymousClass9T8(context, (String) null);
            r6.A0g = true;
            r6.A0E(true);
            r6.A0C(A02);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A07(format);
            r6.A0A(notificationCompat$BigTextStyle);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = DeviceProperties.A00;
            if (bool == null) {
                boolean z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                DeviceProperties.A00 = bool;
            }
            if (bool.booleanValue()) {
                r6.A04(context.getApplicationInfo().icon);
                r6.A05 = 2;
                if (DeviceProperties.A00(context)) {
                    r6.A06(pendingIntent, resources2.getString(2131956461), R.drawable.common_full_open_on_phone);
                } else {
                    r6.A0C = pendingIntent;
                }
            } else {
                r6.A04(17301642);
                r6.A0D(resources2.getString(2131956452));
                r6.A0A.when = System.currentTimeMillis();
                r6.A0C = pendingIntent;
                r6.A0B(format);
            }
            synchronized (A01) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(2131956451);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
            } else {
                if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                }
                r6.A0U = "com.google.android.gms.availability";
                Notification A032 = r6.A03();
                if (i != 1 || i == 2 || i == 3) {
                    GooglePlayServicesUtil.A02.set(false);
                    i2 = 10436;
                } else {
                    i2 = 39789;
                }
                notificationManager.notify(i2, A032);
            }
            notificationManager.createNotificationChannel(notificationChannel);
            r6.A0U = "com.google.android.gms.availability";
            Notification A0322 = r6.A03();
            if (i != 1) {
            }
            GooglePlayServicesUtil.A02.set(false);
            i2 = 10436;
            notificationManager.notify(i2, A0322);
        } else if (i == 6) {
            Log.w(A002, "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.app.DialogFragment, X.Q5K] */
    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof FragmentActivity) {
                0hq supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                0SM r1 = new 0SM();
                AnonymousClass3Qk.A03(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                r1.A00 = dialog;
                r1.A01 = onCancelListener;
                r1.A0B(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        ? dialogFragment = new DialogFragment();
        AnonymousClass3Qk.A03(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        dialogFragment.A00 = dialog;
        dialogFragment.A01 = onCancelListener;
        dialogFragment.show(fragmentManager, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.Q67 A05(android.content.Context r5, X.C9147RQy r6) {
        /*
            r4 = this;
            java.lang.String r0 = "android.intent.action.PACKAGE_ADDED"
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = "package"
            r1.addDataScheme(r0)
            X.Q67 r2 = new X.Q67
            r2.<init>(r6)
            boolean r0 = X.C48309EcS.A00()
            if (r0 == 0) goto L_0x0022
            r0 = 2
            r5.registerReceiver(r2, r1, r0)
        L_0x001b:
            r2.A00 = r5
            java.lang.String r3 = "com.google.android.gms"
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtil.A00
            goto L_0x0026
        L_0x0022:
            r5.registerReceiver(r2, r1)
            goto L_0x001b
        L_0x0026:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ Exception -> 0x0035 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0035 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0035 }
            goto L_0x003d
        L_0x0033:
            if (r0 != 0) goto L_0x0057
        L_0x0035:
            r6.A00()
            r2.A00()
            r0 = 0
            return r0
        L_0x003d:
            java.util.Iterator r1 = r0.iterator()
        L_0x0041:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0041
        L_0x0057:
            return r2
        L_0x0058:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r3, r0)     // Catch:{  }
            boolean r0 = r0.enabled     // Catch:{  }
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.A05(android.content.Context, X.RQy):X.Q67");
    }
}
