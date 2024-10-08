package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.firebase.iid.zzm;

/* renamed from: X.96U  reason: invalid class name */
public final class AnonymousClass96U {
    public static int A06;
    public static PendingIntent A07;
    public Messenger A00;
    public zzm A01;
    public Messenger A02;
    public final Context A03;
    public final 01r A04 = new 01r(0);
    public final AnonymousClass96P A05;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static final android.os.Bundle A00(android.os.Bundle r10, X.AnonymousClass96U r11) {
        /*
            java.lang.Class<X.96U> r6 = X.AnonymousClass96U.class
            monitor-enter(r6)
            int r1 = A06     // Catch:{ all -> 0x0118 }
            int r0 = r1 + 1
            A06 = r0     // Catch:{ all -> 0x0118 }
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0118 }
            monitor-exit(r6)
            X.8nD r8 = new X.8nD
            r8.<init>()
            X.01r r4 = r11.A04
            monitor-enter(r4)
            r4.put(r5, r8)     // Catch:{ all -> 0x0115 }
            monitor-exit(r4)     // Catch:{ all -> 0x0115 }
            X.96P r9 = r11.A05
            int r0 = r9.A03()
            if (r0 == 0) goto L_0x010d
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r0 = 270(0x10e, float:3.78E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r7.setPackage(r0)
            int r0 = r9.A03()
            r3 = 2
            if (r0 != r3) goto L_0x0043
            java.lang.String r0 = "com.google.iid.TOKEN_REQUEST"
        L_0x0039:
            r7.setAction(r0)
            r7.putExtras(r10)
            android.content.Context r2 = r11.A03
            monitor-enter(r6)
            goto L_0x0046
        L_0x0043:
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            goto L_0x0039
        L_0x0046:
            android.app.PendingIntent r1 = A07     // Catch:{ all -> 0x0118 }
            if (r1 != 0) goto L_0x005b
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x0118 }
            r1.<init>()     // Catch:{ all -> 0x0118 }
            java.lang.String r0 = "com.google.example.invalidpackage"
            r1.setPackage(r0)     // Catch:{ all -> 0x0118 }
            r0 = 0
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r0, r1, r0)     // Catch:{ all -> 0x0118 }
            A07 = r1     // Catch:{ all -> 0x0118 }
        L_0x005b:
            java.lang.String r0 = "app"
            r7.putExtra(r0, r1)     // Catch:{ all -> 0x0118 }
            monitor-exit(r6)
            java.lang.String r6 = "kid"
            java.lang.String r0 = java.lang.String.valueOf(r5)
            int r0 = r0.length()
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "|ID|"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "|"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r7.putExtra(r6, r0)
            java.lang.String r6 = "FirebaseInstanceId"
            r10 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r10)
            if (r0 == 0) goto L_0x009a
            android.os.Bundle r0 = r7.getExtras()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String.valueOf(r0)
        L_0x009a:
            java.lang.String r1 = "google.messenger"
            android.os.Messenger r0 = r11.A02
            r7.putExtra(r1, r0)
            android.os.Messenger r0 = r11.A00
            if (r0 != 0) goto L_0x00a9
            com.google.firebase.iid.zzm r0 = r11.A01
            if (r0 == 0) goto L_0x00c8
        L_0x00a9:
            android.os.Message r1 = android.os.Message.obtain()
            r1.obj = r7
            android.os.Messenger r0 = r11.A00     // Catch:{ RemoteException -> 0x00c5 }
            if (r0 != 0) goto L_0x00c1
            com.google.firebase.iid.zzm r0 = r11.A01     // Catch:{ RemoteException -> 0x00c5 }
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x00c5 }
            if (r0 != 0) goto L_0x00c1
            java.lang.String r1 = "send"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ RemoteException -> 0x00c5 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x00c5 }
            throw r0     // Catch:{ RemoteException -> 0x00c5 }
        L_0x00c1:
            r0.send(r1)     // Catch:{ RemoteException -> 0x00c5 }
            goto L_0x00d5
        L_0x00c5:
            android.util.Log.isLoggable(r6, r10)
        L_0x00c8:
            int r0 = r9.A03()
            if (r0 != r3) goto L_0x00d2
            r2.sendBroadcast(r7)
            goto L_0x00d5
        L_0x00d2:
            r2.startService(r7)
        L_0x00d5:
            X.9GD r3 = r8.A00     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00ea }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00ea }
            java.lang.Object r0 = X.C3736896n.A01(r3, r0, r1)     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00ea }
            android.os.Bundle r0 = (android.os.Bundle) r0     // Catch:{ InterruptedException | TimeoutException -> 0x00ec, ExecutionException -> 0x00ea }
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x00e7 }
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            return r0
        L_0x00e7:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00e7 }
            throw r1
        L_0x00ea:
            r0 = move-exception
            goto L_0x00fd
        L_0x00ec:
            java.lang.String r0 = "No response"
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x0103 }
            r0 = 1034(0x40a, float:1.449E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0103 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0103 }
            r1.<init>(r0)     // Catch:{ all -> 0x0103 }
            goto L_0x0102
        L_0x00fd:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0103 }
            r1.<init>(r0)     // Catch:{ all -> 0x0103 }
        L_0x0102:
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r1 = move-exception
            monitor-enter(r4)
            r4.remove(r5)     // Catch:{ all -> 0x010a }
        L_0x0108:
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            goto L_0x010c
        L_0x010a:
            r1 = move-exception
            goto L_0x0108
        L_0x010c:
            throw r1
        L_0x010d:
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r0)
            throw r1
        L_0x0115:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0115 }
            throw r1
        L_0x0118:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96U.A00(android.os.Bundle, X.96U):android.os.Bundle");
    }

    public static final void A01(Bundle bundle, AnonymousClass96U r4, String str) {
        String str2;
        01r r42 = r4.A04;
        synchronized (r42) {
            C365498nD r0 = (C365498nD) r42.remove(str);
            if (r0 == null) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    str2 = "Missing callback for ".concat(valueOf);
                } else {
                    str2 = new String("Missing callback for ");
                }
                Log.w("FirebaseInstanceId", str2);
            } else {
                r0.A01(bundle);
            }
        }
    }

    public AnonymousClass96U(Context context, AnonymousClass96P r4) {
        this.A03 = context;
        this.A05 = r4;
        this.A02 = new Messenger(new AnonymousClass96V(Looper.getMainLooper(), this));
    }
}
