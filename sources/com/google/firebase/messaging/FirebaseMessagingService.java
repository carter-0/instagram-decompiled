package com.google.firebase.messaging;

import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass3FH;
import X.C7197Pyl;
import com.instagram.notifications.push.fcm.IgFirebaseMessagingService;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends C7197Pyl {
    public static final Queue A00 = new ArrayDeque(10);

    public void A03() {
    }

    public void A04(RemoteMessage remoteMessage) {
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object, com.google.firebase.messaging.RemoteMessage] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:192|193|194|195) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:194:0x04b2 */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0252 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0292 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ac A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02e6 A[SYNTHETIC, Splitter:B:130:0x02e6] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x031f A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x032b A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0366 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0375 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0396 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03aa A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03f4 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0429 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x046a A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04a9 A[SYNTHETIC, Splitter:B:192:0x04a9] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x04d5 A[SYNTHETIC, Splitter:B:198:0x04d5] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04f4 A[Catch:{ MalformedURLException -> 0x0190, all -> 0x05bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x050d A[SYNTHETIC, Splitter:B:212:0x050d] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.content.Intent r21) {
        /*
            r20 = this;
            r7 = r21
            java.lang.String r1 = r7.getAction()
            java.lang.String r0 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r0 = r0.equals(r1)
            java.lang.String r3 = "FirebaseMessaging"
            r2 = r20
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002e
            boolean r0 = X.C7200Pyr.A01(r7)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "_nd"
            X.C7200Pyr.A00(r7, r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "token"
            java.lang.String r0 = r7.getStringExtra(r0)
            r2.A05(r0)
            return
        L_0x0041:
            java.lang.String r0 = r7.getAction()
            java.lang.String.valueOf(r0)
            return
        L_0x0049:
            java.lang.String r9 = "google.message_id"
            java.lang.String r8 = r7.getStringExtra(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L_0x0580
            r0 = 0
            X.9GD r5 = new X.9GD
            r5.<init>()
            r5.A0C(r0)
        L_0x005e:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r6 = 3
            if (r0 != 0) goto L_0x0088
            java.util.Queue r4 = A00
            boolean r0 = r4.contains(r8)
            if (r0 == 0) goto L_0x007a
            boolean r0 = android.util.Log.isLoggable(r3, r6)
            if (r0 == 0) goto L_0x0076
            java.lang.String.valueOf(r8)
        L_0x0076:
            r1 = 1
            goto L_0x059c
        L_0x007a:
            int r1 = r4.size()
            r0 = 10
            if (r1 < r0) goto L_0x0085
            r4.remove()
        L_0x0085:
            r4.add(r8)
        L_0x0088:
            java.lang.String r0 = "message_type"
            java.lang.String r1 = r7.getStringExtra(r0)
            java.lang.String r4 = "gcm"
            if (r1 != 0) goto L_0x0094
            r1 = r4
        L_0x0094:
            int r0 = r1.hashCode()
            switch(r0) {
                case -2062414158: goto L_0x00a5;
                case 102161: goto L_0x00b5;
                case 814694033: goto L_0x00f9;
                case 814800675: goto L_0x0121;
                default: goto L_0x009b;
            }
        L_0x009b:
            java.lang.String r0 = "Received message with unknown type: "
            java.lang.String r0 = X.Pxh.A0l(r0, r1)
            android.util.Log.w(r3, r0)
            goto L_0x0076
        L_0x00a5:
            r0 = 749(0x2ed, float:1.05E-42)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
            r2.A03()
            goto L_0x0076
        L_0x00b5:
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x009b
            boolean r0 = X.C7200Pyr.A01(r7)
            if (r0 == 0) goto L_0x00c6
            java.lang.String r0 = "_nr"
            X.C7200Pyr.A00(r7, r0)
        L_0x00c6:
            android.os.Bundle r1 = r7.getExtras()
            if (r1 != 0) goto L_0x00d0
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
        L_0x00d0:
            java.lang.String r0 = "androidx.contentpager.content.wakelockid"
            r1.remove(r0)
            java.lang.String r0 = "gcm.n.e"
            java.lang.String r0 = X.C7199Pyq.A02(r1, r0)
            java.lang.String r9 = "1"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r0 = X.C7199Pyq.A02(r1, r0)
            if (r0 == 0) goto L_0x0574
        L_0x00eb:
            java.util.concurrent.ExecutorService r19 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r0 = r2.getPackageName()
            X.Pyq r8 = new X.Pyq
            r8.<init>(r2, r0)
            goto L_0x012f
        L_0x00f9:
            r0 = 3955(0xf73, float:5.542E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r7.getStringExtra(r9)
            if (r0 != 0) goto L_0x0114
            r0 = 1595(0x63b, float:2.235E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.getStringExtra(r0)
        L_0x0114:
            java.lang.String r0 = "error"
            java.lang.String r1 = r7.getStringExtra(r0)
            X.RJx r0 = new X.RJx
            r0.<init>(r1)
            goto L_0x0076
        L_0x0121:
            java.lang.String r0 = "send_event"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009b
            r7.getStringExtra(r9)
            goto L_0x0076
        L_0x012f:
            java.lang.String r0 = "gcm.n.noui"
            java.lang.String r0 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x0561
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x05bb }
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0     // Catch:{ all -> 0x05bb }
            boolean r0 = r0.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x05bb }
            r4 = 0
            if (r0 != 0) goto L_0x0178
            int r12 = android.os.Process.myPid()     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch:{ all -> 0x05bb }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x05bb }
            java.util.List r0 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0178
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x05bb }
        L_0x0160:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0178
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x05bb }
            android.app.ActivityManager$RunningAppProcessInfo r10 = (android.app.ActivityManager.RunningAppProcessInfo) r10     // Catch:{ all -> 0x05bb }
            int r0 = r10.pid     // Catch:{ all -> 0x05bb }
            if (r0 != r12) goto L_0x0160
            int r10 = r10.importance     // Catch:{ all -> 0x05bb }
            r0 = 100
            if (r10 != r0) goto L_0x0178
            goto L_0x0566
        L_0x0178:
            java.lang.String r0 = "gcm.n.image"
            java.lang.String r11 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch:{ all -> 0x05bb }
            r10 = 0
            if (r0 != 0) goto L_0x0199
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0190 }
            r0.<init>(r11)     // Catch:{ MalformedURLException -> 0x0190 }
            X.T8r r7 = new X.T8r     // Catch:{ MalformedURLException -> 0x0190 }
            r7.<init>(r0)     // Catch:{ MalformedURLException -> 0x0190 }
            goto L_0x019b
        L_0x0190:
            java.lang.String r0 = "Not downloading image, bad URL: "
            java.lang.String r0 = X.Pxh.A0m(r0, r11)     // Catch:{ all -> 0x05bb }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
        L_0x0199:
            r7 = r10
            goto L_0x01b6
        L_0x019b:
            X.TNE r12 = new X.TNE     // Catch:{ all -> 0x05bb }
            r12.<init>(r7)     // Catch:{ all -> 0x05bb }
            java.lang.String r10 = "Executor must not be null"
            r0 = r19
            X.AnonymousClass3Qk.A03(r0, r10)     // Catch:{ all -> 0x05bb }
            X.9GD r11 = new X.9GD     // Catch:{ all -> 0x05bb }
            r11.<init>()     // Catch:{ all -> 0x05bb }
            X.THC r10 = new X.THC     // Catch:{ all -> 0x05bb }
            r10.<init>(r11, r12)     // Catch:{ all -> 0x05bb }
            r0.execute(r10)     // Catch:{ all -> 0x05bb }
            r7.A00 = r11     // Catch:{ all -> 0x05bb }
        L_0x01b6:
            android.content.Context r12 = r8.A01     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "gcm.n.android_channel_id"
            java.lang.String r13 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            r18 = 0
            r11 = 0
            android.content.pm.PackageManager r10 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x01cd }
            java.lang.String r0 = r8.A02     // Catch:{ NameNotFoundException -> 0x01cd }
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x01cd }
            int r11 = r0.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x01cd }
        L_0x01cd:
            r0 = 26
            if (r11 >= r0) goto L_0x01d4
            r13 = r18
            goto L_0x023d
        L_0x01d4:
            java.lang.Class<android.app.NotificationManager> r0 = android.app.NotificationManager.class
            java.lang.Object r11 = r12.getSystemService(r0)     // Catch:{ all -> 0x05bb }
            android.app.NotificationManager r11 = (android.app.NotificationManager) r11     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x01ff
            android.app.NotificationChannel r0 = r11.getNotificationChannel(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x023d
            int r0 = X.Pxf.A09(r13)     // Catch:{ all -> 0x05bb }
            int r0 = r0 + 122
            java.lang.StringBuilder r10 = X.Pxe.A14(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "Notification Channel requested ("
            r10.append(r0)     // Catch:{ all -> 0x05bb }
            r10.append(r13)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            X.Pxg.A1Q(r0, r3, r10)     // Catch:{ all -> 0x05bb }
        L_0x01ff:
            android.os.Bundle r10 = X.C7199Pyq.A00(r8)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r13 = r10.getString(r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x0253
            android.app.NotificationChannel r0 = r11.getNotificationChannel(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x023d
            java.lang.String r0 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
        L_0x0217:
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r13 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r0 = r11.getNotificationChannel(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x023d
            android.content.res.Resources r15 = r12.getResources()     // Catch:{ all -> 0x05bb }
            java.lang.String r14 = r8.A02     // Catch:{ all -> 0x05bb }
            java.lang.String r10 = "fcm_fallback_notification_channel_label"
            java.lang.String r0 = "string"
            int r0 = r15.getIdentifier(r10, r0, r14)     // Catch:{ all -> 0x05bb }
            java.lang.String r10 = r12.getString(r0)     // Catch:{ all -> 0x05bb }
            android.app.NotificationChannel r0 = new android.app.NotificationChannel     // Catch:{ all -> 0x05bb }
            r0.<init>(r13, r10, r6)     // Catch:{ all -> 0x05bb }
            r11.createNotificationChannel(r0)     // Catch:{ all -> 0x05bb }
        L_0x023d:
            X.9T8 r11 = new X.9T8     // Catch:{ all -> 0x05bb }
            r11.<init>((android.content.Context) r12, (java.lang.String) r13)     // Catch:{ all -> 0x05bb }
            r10 = 1
            r11.A0E(r10)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "gcm.n.title"
            java.lang.String r13 = X.C7199Pyq.A01(r1, r8, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0283
            goto L_0x0256
        L_0x0253:
            java.lang.String r0 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            goto L_0x0217
        L_0x0256:
            android.content.pm.PackageManager r13 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.String r0 = r8.A02     // Catch:{ NameNotFoundException -> 0x0269 }
            android.content.pm.ApplicationInfo r13 = r13.getApplicationInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x0269 }
            android.content.pm.PackageManager r0 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0269 }
            java.lang.CharSequence r13 = r13.loadLabel(r0)     // Catch:{ NameNotFoundException -> 0x0269 }
            goto L_0x0283
        L_0x0269:
            r0 = move-exception
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x05bb }
            int r0 = X.Pxf.A09(r14)     // Catch:{ all -> 0x05bb }
            int r0 = r0 + 35
            java.lang.StringBuilder r13 = X.Pxe.A14(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r0 = X.Pxg.A0s(r0, r14, r13)     // Catch:{ all -> 0x05bb }
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r13 = ""
        L_0x0283:
            r11.A0C(r13)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "gcm.n.body"
            java.lang.String r13 = X.C7199Pyq.A01(r1, r8, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x02a0
            r11.A0B(r13)     // Catch:{ all -> 0x05bb }
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle     // Catch:{ all -> 0x05bb }
            r0.<init>()     // Catch:{ all -> 0x05bb }
            r0.A07(r13)     // Catch:{ all -> 0x05bb }
            r11.A0A(r0)     // Catch:{ all -> 0x05bb }
        L_0x02a0:
            java.lang.String r0 = "gcm.n.icon"
            java.lang.String r15 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x02da
            android.content.res.Resources r14 = r12.getResources()     // Catch:{ all -> 0x05bb }
            java.lang.String r13 = r8.A02     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "drawable"
            int r0 = r14.getIdentifier(r15, r0, r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x0310
            java.lang.String r0 = "mipmap"
            int r0 = r14.getIdentifier(r15, r0, r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x0310
            int r0 = X.Pxf.A09(r15)     // Catch:{ all -> 0x05bb }
            int r0 = r0 + 61
            java.lang.StringBuilder r13 = X.Pxe.A14(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "Icon resource "
            r13.append(r0)     // Catch:{ all -> 0x05bb }
            r13.append(r15)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = " not found. Notification will use default icon."
            X.Pxg.A1Q(r0, r3, r13)     // Catch:{ all -> 0x05bb }
        L_0x02da:
            android.os.Bundle r13 = X.C7199Pyq.A00(r8)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_icon"
            int r0 = r13.getInt(r0, r4)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x0310
            android.content.pm.PackageManager r13 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x02f5 }
            java.lang.String r0 = r8.A02     // Catch:{ NameNotFoundException -> 0x02f5 }
            android.content.pm.ApplicationInfo r0 = r13.getApplicationInfo(r0, r4)     // Catch:{ NameNotFoundException -> 0x02f5 }
            int r0 = r0.icon     // Catch:{ NameNotFoundException -> 0x02f5 }
            if (r0 == 0) goto L_0x030d
            goto L_0x0310
        L_0x02f5:
            r0 = move-exception
            java.lang.String r14 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x05bb }
            int r0 = X.Pxf.A09(r14)     // Catch:{ all -> 0x05bb }
            int r0 = r0 + 35
            java.lang.StringBuilder r13 = X.Pxe.A14(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r0 = X.Pxg.A0s(r0, r14, r13)     // Catch:{ all -> 0x05bb }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
        L_0x030d:
            r0 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x0310:
            r11.A04(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r14 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0325
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r14 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
        L_0x0325:
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x0369
            java.lang.String r0 = "default"
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x035f
            android.content.res.Resources r13 = r12.getResources()     // Catch:{ all -> 0x05bb }
            java.lang.String r15 = r8.A02     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "raw"
            int r0 = r13.getIdentifier(r14, r0, r15)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x035f
            int r0 = X.Pxf.A09(r15)     // Catch:{ all -> 0x05bb }
            int r0 = r0 + 24
            java.lang.StringBuilder r13 = X.Pxh.A0q(r14, r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "android.resource://"
            r13.append(r0)     // Catch:{ all -> 0x05bb }
            r13.append(r15)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "/raw/"
            java.lang.String r0 = X.Pxg.A0s(r0, r14, r13)     // Catch:{ all -> 0x05bb }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x05bb }
            goto L_0x0364
        L_0x035f:
            r0 = 2
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r0)     // Catch:{ all -> 0x05bb }
        L_0x0364:
            if (r0 == 0) goto L_0x0369
            r11.A08(r0)     // Catch:{ all -> 0x05bb }
        L_0x0369:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r13 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x03aa
            android.content.Intent r14 = X.Pxe.A0G(r13)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x05bb }
            r14.setPackage(r0)     // Catch:{ all -> 0x05bb }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r14.setFlags(r0)     // Catch:{ all -> 0x05bb }
        L_0x0383:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r14.addFlags(r0)     // Catch:{ all -> 0x05bb }
            android.os.Bundle r13 = X.Pxe.A0J(r1)     // Catch:{ all -> 0x05bb }
            java.util.Iterator r16 = X.Pxf.A0t(r13)     // Catch:{ all -> 0x05bb }
        L_0x0390:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x03e7
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x05bb }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ all -> 0x05bb }
            if (r15 == 0) goto L_0x0390
            java.lang.String r0 = "google.c."
            boolean r0 = r15.startsWith(r0)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0390
            r16.remove()     // Catch:{ all -> 0x05bb }
            goto L_0x0390
        L_0x03aa:
            java.lang.String r0 = "gcm.n.link_android"
            java.lang.String r13 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x03bc
            java.lang.String r0 = "gcm.n.link"
            java.lang.String r13 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
        L_0x03bc:
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x03d5
            android.net.Uri r13 = android.net.Uri.parse(r13)     // Catch:{ all -> 0x05bb }
            if (r13 == 0) goto L_0x03d5
            android.content.Intent r14 = X.Pxe.A0E()     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x05bb }
            r14.setPackage(r0)     // Catch:{ all -> 0x05bb }
            r14.setData(r13)     // Catch:{ all -> 0x05bb }
            goto L_0x0383
        L_0x03d5:
            android.content.pm.PackageManager r13 = r12.getPackageManager()     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x05bb }
            android.content.Intent r14 = r13.getLaunchIntentForPackage(r0)     // Catch:{ all -> 0x05bb }
            if (r14 != 0) goto L_0x0383
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
            goto L_0x040e
        L_0x03e7:
            r14.putExtras(r13)     // Catch:{ all -> 0x05bb }
            java.util.Iterator r15 = X.Pxf.A0t(r13)     // Catch:{ all -> 0x05bb }
        L_0x03ee:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0411
            java.lang.Object r13 = r15.next()     // Catch:{ all -> 0x05bb }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "gcm.n."
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x040a
            java.lang.String r0 = "gcm.notification."
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x03ee
        L_0x040a:
            r14.removeExtra(r13)     // Catch:{ all -> 0x05bb }
            goto L_0x03ee
        L_0x040e:
            r0 = r18
            goto L_0x045c
        L_0x0411:
            java.util.concurrent.atomic.AtomicInteger r16 = X.C7199Pyq.A03     // Catch:{ all -> 0x05bb }
            int r0 = r16.incrementAndGet()     // Catch:{ all -> 0x05bb }
            r13 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r12, r0, r14, r13)     // Catch:{ all -> 0x05bb }
            java.lang.String r14 = "google.c.a.e"
            java.lang.String r14 = r1.getString(r14)     // Catch:{ all -> 0x05bb }
            boolean r14 = r9.equals(r14)     // Catch:{ all -> 0x05bb }
            if (r14 == 0) goto L_0x045c
            java.lang.String r14 = "com.google.firebase.messaging.NOTIFICATION_OPEN"
            android.content.Intent r14 = X.Pxe.A0G(r14)     // Catch:{ all -> 0x05bb }
            X.C7199Pyq.A03(r14, r1)     // Catch:{ all -> 0x05bb }
            java.lang.String r15 = "pending_intent"
            r14.putExtra(r15, r0)     // Catch:{ all -> 0x05bb }
            int r17 = r16.incrementAndGet()     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r16 = X.Pxe.A0G(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            android.content.ComponentName r15 = new android.content.ComponentName     // Catch:{ all -> 0x05bb }
            r15.<init>(r12, r0)     // Catch:{ all -> 0x05bb }
            r0 = r16
            android.content.Intent r15 = r0.setComponent(r15)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "wrapped_intent"
            android.content.Intent r14 = r15.putExtra(r0, r14)     // Catch:{ all -> 0x05bb }
            r0 = r17
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r12, r0, r14, r13)     // Catch:{ all -> 0x05bb }
        L_0x045c:
            r11.A0C = r0     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "google.c.a.e"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x049d
            java.lang.String r0 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            android.content.Intent r14 = X.Pxe.A0G(r0)     // Catch:{ all -> 0x05bb }
            X.C7199Pyq.A03(r14, r1)     // Catch:{ all -> 0x05bb }
            java.util.concurrent.atomic.AtomicInteger r0 = X.C7199Pyq.A03     // Catch:{ all -> 0x05bb }
            int r13 = r0.incrementAndGet()     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r15 = X.Pxe.A0G(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r9 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ all -> 0x05bb }
            r0.<init>(r12, r9)     // Catch:{ all -> 0x05bb }
            android.content.Intent r9 = r15.setComponent(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "wrapped_intent"
            android.content.Intent r9 = r9.putExtra(r0, r14)     // Catch:{ all -> 0x05bb }
            r0 = 1073741824(0x40000000, float:2.0)
            android.app.PendingIntent r9 = android.app.PendingIntent.getBroadcast(r12, r13, r9, r0)     // Catch:{ all -> 0x05bb }
            if (r9 == 0) goto L_0x049d
            android.app.Notification r0 = r11.A0A     // Catch:{ all -> 0x05bb }
            r0.deleteIntent = r9     // Catch:{ all -> 0x05bb }
        L_0x049d:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r13 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x05bb }
            if (r0 != 0) goto L_0x04c9
            int r0 = android.graphics.Color.parseColor(r13)     // Catch:{ IllegalArgumentException -> 0x04b2 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x04b2 }
            goto L_0x04d9
        L_0x04b2:
            int r0 = X.Pxf.A09(r13)     // Catch:{ all -> 0x05bb }
            int r0 = r0 + 54
            java.lang.StringBuilder r9 = X.Pxe.A14(r0)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "Color "
            r9.append(r0)     // Catch:{ all -> 0x05bb }
            r9.append(r13)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = " not valid. Notification will use default color."
            X.Pxg.A1Q(r0, r3, r9)     // Catch:{ all -> 0x05bb }
        L_0x04c9:
            android.os.Bundle r8 = X.C7199Pyq.A00(r8)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r8.getInt(r0, r4)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x04e8
            java.lang.Integer r0 = X.DbV.A0n(r12, r0)     // Catch:{ NotFoundException -> 0x04dc }
        L_0x04d9:
            if (r0 == 0) goto L_0x04e8
            goto L_0x04e2
        L_0x04dc:
            java.lang.String r0 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
            goto L_0x04e8
        L_0x04e2:
            int r0 = r0.intValue()     // Catch:{ all -> 0x05bb }
            r11.A01 = r0     // Catch:{ all -> 0x05bb }
        L_0x04e8:
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r1 = X.C7199Pyq.A02(r1, r0)     // Catch:{ all -> 0x05bb }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x05bb }
            if (r0 == 0) goto L_0x0504
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x05bb }
            r8 = 37
            java.lang.StringBuilder r9 = X.Pxe.A14(r8)     // Catch:{ all -> 0x05bb }
            java.lang.String r8 = "FCM-Notification:"
            java.lang.String r1 = X.Pxg.A0u(r8, r9, r0)     // Catch:{ all -> 0x05bb }
        L_0x0504:
            X.Rsq r9 = new X.Rsq     // Catch:{ all -> 0x05bb }
            r9.<init>(r11, r1)     // Catch:{ all -> 0x05bb }
            X.9T8 r8 = r9.A00     // Catch:{ all -> 0x05bb }
            if (r7 == 0) goto L_0x054c
            X.9GD r12 = r7.A00     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            X.AnonymousClass3Qk.A02(r12)     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            r0 = 5
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            java.lang.Object r0 = X.C3736896n.A01(r12, r11, r0)     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            r8.A07(r0)     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            androidx.core.app.NotificationCompat$BigPictureStyle r1 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            r1.<init>()     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            if (r0 != 0) goto L_0x0528
            r0 = 0
            goto L_0x052c
        L_0x0528:
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A02(r0)     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
        L_0x052c:
            r1.A01 = r0     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            r0 = r18
            r1.A00 = r0     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            r1.A02 = r10     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            r8.A0A(r1)     // Catch:{ ExecutionException -> 0x054c, InterruptedException -> 0x0538, TimeoutException -> 0x0544 }
            goto L_0x054c
        L_0x0538:
            java.lang.String r0 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
            r7.close()     // Catch:{ all -> 0x05bb }
            X.Pxe.A1F()     // Catch:{ all -> 0x05bb }
            goto L_0x054c
        L_0x0544:
            java.lang.String r0 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x05bb }
            r7.close()     // Catch:{ all -> 0x05bb }
        L_0x054c:
            android.util.Log.isLoggable(r3, r6)     // Catch:{ all -> 0x05bb }
            java.lang.String r0 = "notification"
            java.lang.Object r2 = r2.getSystemService(r0)     // Catch:{ all -> 0x05bb }
            android.app.NotificationManager r2 = (android.app.NotificationManager) r2     // Catch:{ all -> 0x05bb }
            java.lang.String r1 = r9.A01     // Catch:{ all -> 0x05bb }
            android.app.Notification r0 = r8.A03()     // Catch:{ all -> 0x05bb }
            r2.notify(r1, r4, r0)     // Catch:{ all -> 0x05bb }
        L_0x0561:
            r19.shutdown()
            goto L_0x0076
        L_0x0566:
            r19.shutdown()
            boolean r0 = X.C7200Pyr.A01(r7)
            if (r0 == 0) goto L_0x0574
            java.lang.String r0 = "_nf"
            X.C7200Pyr.A00(r7, r0)
        L_0x0574:
            com.google.firebase.messaging.RemoteMessage r0 = new com.google.firebase.messaging.RemoteMessage
            r0.<init>()
            r0.A00 = r1
            r2.A04(r0)
            goto L_0x0076
        L_0x0580:
            android.os.Bundle r6 = X.DbV.A0C(r9, r8)
            X.PyO r5 = X.PyO.A01(r2)
            monitor-enter(r5)
            int r4 = r5.A00     // Catch:{ all -> 0x05c0 }
            int r0 = r4 + 1
            r5.A00 = r0     // Catch:{ all -> 0x05c0 }
            monitor-exit(r5)
            r1 = 2
            X.R29 r0 = new X.R29
            r0.<init>(r6, r4, r1)
            X.9GD r5 = X.PyO.A00(r5, r0)
            goto L_0x005e
        L_0x059c:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x05a2 }
            X.C3736896n.A01(r5, r0, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x05a2 }
            return
        L_0x05a2:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.Pxf.A09(r2)
            int r0 = r0 + 20
            java.lang.StringBuilder r1 = X.Pxe.A14(r0)
            java.lang.String r0 = "Message ack failed: "
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)
            android.util.Log.w(r3, r0)
            return
        L_0x05bb:
            r0 = move-exception
            r19.shutdown()
            throw r0
        L_0x05c0:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A01(android.content.Intent):void");
    }

    public void A05(String str) {
        if (this instanceof IgFirebaseMessagingService) {
            0qQ.A0B(str, 0);
            AnonymousClass3FH.A02(AnonymousClass05K.A0Y);
        }
    }
}
