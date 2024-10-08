package com.google.firebase.iid;

import X.AnonymousClass0fD;
import X.C11440SVb;
import X.C7196Pyk;
import X.S2V;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;

public final class FirebaseInstanceIdReceiver extends C7196Pyk {
    public static C11440SVb A00;

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x019d, code lost:
        if (r1 == 402) goto L_0x019f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            r0 = 0
            r11.setComponent(r0)
            X.Pxe.A1L(r10, r11)
            java.lang.String r0 = "from"
            java.lang.String r1 = r11.getStringExtra(r0)
            java.lang.String r0 = "google.com/iid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009d
            java.lang.String r0 = "CMD"
            java.lang.String r2 = r11.getStringExtra(r0)
            if (r2 == 0) goto L_0x01a9
            r1 = 3
            java.lang.String r0 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x0034
            android.os.Bundle r0 = r11.getExtras()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String.valueOf(r2)
            java.lang.String.valueOf(r0)
        L_0x0034:
            java.lang.String r0 = "RST"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "RST_FULL"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0090
            java.lang.String r0 = "SYNC"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x01a9
            X.95g r0 = X.C3734195g.A00()
            com.google.firebase.iid.FirebaseInstanceId r6 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            X.96R r5 = com.google.firebase.iid.FirebaseInstanceId.A08
            java.lang.String r0 = ""
            monitor-enter(r5)
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008d }
            java.lang.String r0 = "|T|"
            java.lang.String r4 = r1.concat(r0)     // Catch:{ all -> 0x008d }
            android.content.SharedPreferences r0 = r5.A01     // Catch:{ all -> 0x008d }
            android.content.SharedPreferences$Editor r3 = r0.edit()     // Catch:{ all -> 0x008d }
            java.util.Map r0 = r0.getAll()     // Catch:{ all -> 0x008d }
            java.util.Iterator r2 = X.DbV.A16(r0)     // Catch:{ all -> 0x008d }
        L_0x0072:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0088
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x008d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x008d }
            boolean r0 = r1.startsWith(r4)     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0072
            r3.remove(r1)     // Catch:{ all -> 0x008d }
            goto L_0x0072
        L_0x0088:
            r3.commit()     // Catch:{ all -> 0x008d }
            goto L_0x01a5
        L_0x008d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0090:
            X.95g r0 = X.C3734195g.A00()
            com.google.firebase.iid.FirebaseInstanceId r0 = com.google.firebase.iid.FirebaseInstanceId.getInstance(r0)
            r0.A06()
            goto L_0x01a9
        L_0x009d:
            java.lang.String r2 = "gcm.rawData64"
            java.lang.String r1 = r11.getStringExtra(r2)
            if (r1 == 0) goto L_0x00b3
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)
            java.lang.String r0 = "rawData"
            r11.putExtra(r0, r1)
            r11.removeExtra(r2)
        L_0x00b3:
            r3 = 1
            android.content.pm.ApplicationInfo r0 = r10.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 26
            boolean r2 = X.JTQ.A1P(r1, r0)
            int r1 = r11.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 != 0) goto L_0x00ca
            r3 = 0
        L_0x00ca:
            if (r2 == 0) goto L_0x00d4
            if (r3 != 0) goto L_0x00d4
            int r1 = A02(r9, r10, r11)
            goto L_0x01aa
        L_0x00d4:
            X.PyW r4 = X.PyW.A00()
            java.lang.String r3 = "FirebaseInstanceId"
            r5 = 3
            android.util.Log.isLoggable(r3, r5)
            java.util.Queue r0 = r4.A03
            r0.offer(r11)
            java.lang.String r0 = "com.google.firebase.MESSAGING_EVENT"
            android.content.Intent r2 = X.Pxe.A0G(r0)
            X.Pxe.A1L(r10, r2)
            monitor-enter(r4)
            java.lang.String r7 = r4.A02     // Catch:{ all -> 0x01b4 }
            if (r7 != 0) goto L_0x014c
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ all -> 0x01b4 }
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch:{ all -> 0x01b4 }
            r7 = 0
            if (r0 == 0) goto L_0x012a
            android.content.pm.ServiceInfo r6 = r0.serviceInfo     // Catch:{ all -> 0x01b4 }
            if (r6 == 0) goto L_0x012a
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x01b4 }
            java.lang.String r8 = r6.packageName     // Catch:{ all -> 0x01b4 }
            boolean r0 = r0.equals(r8)     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x012d
            java.lang.String r1 = r6.name     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x012d
            java.lang.String r0 = "."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x0127
            java.lang.String r0 = r10.getPackageName()     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = r6.name     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = X.Pxh.A0l(r1, r0)     // Catch:{ all -> 0x01b4 }
        L_0x0127:
            r4.A02 = r1     // Catch:{ all -> 0x01b4 }
            goto L_0x014b
        L_0x012a:
            java.lang.String r0 = "Failed to resolve target intent service, skipping classname enforcement"
            goto L_0x0147
        L_0x012d:
            java.lang.String r6 = r6.name     // Catch:{ all -> 0x01b4 }
            int r0 = X.Pxf.A09(r8)     // Catch:{ all -> 0x01b4 }
            int r0 = r0 + 94
            java.lang.StringBuilder r1 = X.Pxh.A0q(r6, r0)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r1.append(r0)     // Catch:{ all -> 0x01b4 }
            r1.append(r8)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.Pxg.A0s(r0, r6, r1)     // Catch:{ all -> 0x01b4 }
        L_0x0147:
            android.util.Log.e(r3, r0)     // Catch:{ all -> 0x01b4 }
            goto L_0x014c
        L_0x014b:
            r7 = r1
        L_0x014c:
            monitor-exit(r4)
            if (r7 == 0) goto L_0x015f
            boolean r0 = android.util.Log.isLoggable(r3, r5)
            if (r0 == 0) goto L_0x0158
            java.lang.String.valueOf(r7)
        L_0x0158:
            java.lang.String r0 = r10.getPackageName()
            r2.setClassName(r0, r7)
        L_0x015f:
            boolean r0 = r4.A01(r10)     // Catch:{ SecurityException -> 0x0191, IllegalStateException -> 0x0178 }
            if (r0 == 0) goto L_0x016a
            android.content.ComponentName r0 = X.C7196Pyk.A00(r10, r2)     // Catch:{ SecurityException -> 0x0191, IllegalStateException -> 0x0178 }
            goto L_0x016e
        L_0x016a:
            android.content.ComponentName r0 = r10.startService(r2)     // Catch:{ SecurityException -> 0x0191, IllegalStateException -> 0x0178 }
        L_0x016e:
            if (r0 != 0) goto L_0x019a
            java.lang.String r0 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r3, r0)     // Catch:{ SecurityException -> 0x0191, IllegalStateException -> 0x0178 }
            r1 = 404(0x194, float:5.66E-43)
            goto L_0x019b
        L_0x0178:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.Pxf.A09(r2)
            int r0 = r0 + 45
            java.lang.StringBuilder r1 = X.Pxe.A14(r0)
            java.lang.String r0 = "Failed to start service while in background: "
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)
            android.util.Log.e(r3, r0)
            goto L_0x019f
        L_0x0191:
            r1 = move-exception
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r3, r0, r1)
            r1 = 401(0x191, float:5.62E-43)
            goto L_0x019b
        L_0x019a:
            r1 = -1
        L_0x019b:
            r0 = 402(0x192, float:5.63E-43)
            if (r1 != r0) goto L_0x01aa
        L_0x019f:
            A02(r9, r10, r11)
            r1 = 403(0x193, float:5.65E-43)
            goto L_0x01aa
        L_0x01a5:
            monitor-exit(r5)
            com.google.firebase.iid.FirebaseInstanceId.A03(r6)
        L_0x01a9:
            r1 = -1
        L_0x01aa:
            boolean r0 = r9.isOrderedBroadcast()
            if (r0 == 0) goto L_0x01b3
            r9.setResultCode(r1)
        L_0x01b3:
            return
        L_0x01b4:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.A03(android.content.Context, android.content.Intent):void");
    }

    public static int A02(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        C11440SVb sVb;
        Log.isLoggable("FirebaseInstanceId", 3);
        if (broadcastReceiver.isOrderedBroadcast()) {
            broadcastReceiver.setResultCode(-1);
        }
        synchronized (FirebaseInstanceIdReceiver.class) {
            sVb = A00;
            if (sVb == null) {
                sVb = new C11440SVb(context);
                A00 = sVb;
            }
        }
        BroadcastReceiver.PendingResult goAsync = broadcastReceiver.goAsync();
        synchronized (sVb) {
            Log.isLoggable("EnhancedIntentService", 3);
            sVb.A04.add(new S2V(goAsync, intent, sVb.A05));
            C11440SVb.A00(sVb);
        }
        return -1;
    }

    public final void onReceive(Context context, Intent intent) {
        int i;
        Intent intent2;
        int A01 = AnonymousClass0fD.A01(-952371940);
        if (intent == null) {
            i = 7726294;
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (!(parcelableExtra instanceof Intent) || (intent2 = (Intent) parcelableExtra) == null) {
                A03(context, intent);
                i = -1700168424;
            } else {
                A03(context, intent2);
                i = 928610916;
            }
        }
        AnonymousClass0fD.A0E(i, A01, intent);
    }
}
