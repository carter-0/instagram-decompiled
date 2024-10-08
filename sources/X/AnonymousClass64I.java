package X;

import android.os.Looper;
import com.google.android.gms.common.internal.BaseGmsClient;

/* renamed from: X.64I  reason: invalid class name */
public final class AnonymousClass64I extends AnonymousClass64C {
    public final /* synthetic */ BaseGmsClient A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass64I(Looper looper, BaseGmsClient baseGmsClient) {
        super(looper);
        this.A00 = baseGmsClient;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: android.app.PendingIntent} */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008b  */
    public final void handleMessage(android.os.Message r14) {
        /*
            r13 = this;
            com.google.android.gms.common.internal.BaseGmsClient r2 = r13.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0A
            int r1 = r0.get()
            int r0 = r14.arg1
            if (r1 == r0) goto L_0x001f
            int r2 = r14.what
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0017
            if (r2 == r1) goto L_0x0017
            r0 = 7
            if (r2 != r0) goto L_0x0086
        L_0x0017:
            java.lang.Object r4 = r14.obj
            X.5yW r4 = (X.C301115yW) r4
        L_0x001b:
            monitor-enter(r4)
            r0 = 0
            goto L_0x01a9
        L_0x001f:
            int r1 = r14.what
            r6 = 4
            r3 = 1
            r4 = 5
            if (r1 == r3) goto L_0x002d
            r0 = 7
            if (r1 == r0) goto L_0x002d
            if (r1 == r6) goto L_0x002d
            if (r1 != r4) goto L_0x0033
        L_0x002d:
            boolean r0 = r2.CQT()
            if (r0 == 0) goto L_0x0017
        L_0x0033:
            int r1 = r14.what
            r7 = 8
            r10 = 3
            r5 = 0
            if (r1 != r6) goto L_0x0063
            int r1 = r14.arg2
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r1)
            r2.A06 = r0
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0087
            java.lang.String r1 = r2.A05()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0087
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0087
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0087 }
            boolean r0 = r2.A0B
            if (r0 != 0) goto L_0x0087
            com.google.android.gms.common.internal.BaseGmsClient.A00(r5, r2, r10)
            return
        L_0x0063:
            if (r1 == r4) goto L_0x0087
            if (r1 != r10) goto L_0x0091
            java.lang.Object r1 = r14.obj
            boolean r0 = r1 instanceof android.app.PendingIntent
            if (r0 == 0) goto L_0x0070
            r5 = r1
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
        L_0x0070:
            int r0 = r14.arg2
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r0, r5)
        L_0x0077:
            X.64Q r0 = r2.A07
            r0.De8(r1)
            int r0 = r1.A01
            r2.A01 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A05 = r0
        L_0x0086:
            return
        L_0x0087:
            com.google.android.gms.common.ConnectionResult r1 = r2.A06
            if (r1 != 0) goto L_0x0077
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r7)
            goto L_0x0077
        L_0x0091:
            r0 = 6
            if (r1 != r0) goto L_0x00b2
            com.google.android.gms.common.internal.BaseGmsClient.A00(r5, r2, r4)
            X.64F r0 = r2.A0H
            if (r0 == 0) goto L_0x00a4
            int r1 = r14.arg2
            X.64E r0 = (X.AnonymousClass64E) r0
            X.63z r0 = r0.A00
            r0.D5q(r1)
        L_0x00a4:
            int r0 = r14.arg2
            r2.A00 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r2.A03 = r0
            com.google.android.gms.common.internal.BaseGmsClient.A01(r5, r2, r4, r3)
            return
        L_0x00b2:
            r11 = 2
            if (r1 != r11) goto L_0x00bb
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0017
        L_0x00bb:
            int r1 = r14.what
            if (r1 == r11) goto L_0x00d9
            if (r1 == r3) goto L_0x00d9
            r0 = 7
            if (r1 == r0) goto L_0x00d9
            r0 = 473(0x1d9, float:6.63E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.String r2 = X.002.A0O(r0, r1)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r0 = "GmsClient"
            android.util.Log.wtf(r0, r2, r1)
            return
        L_0x00d9:
            java.lang.Object r4 = r14.obj
            X.5yW r4 = (X.C301115yW) r4
            monitor-enter(r4)
            java.lang.Object r8 = r4.A00     // Catch:{ all -> 0x01c1 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x01c1 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r6 = "GmsClient"
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x01c1 }
            java.lang.String r1 = "Callback proxy "
            java.lang.String r0 = " being reused. This is not safe."
            java.lang.String r0 = X.002.A0g(r1, r2, r0)     // Catch:{ all -> 0x01c1 }
            android.util.Log.w(r6, r0)     // Catch:{ all -> 0x01c1 }
        L_0x00f5:
            monitor-exit(r4)     // Catch:{ all -> 0x01c1 }
            if (r8 == 0) goto L_0x01a3
            r6 = r4
            X.5yV r6 = (X.C301105yV) r6     // Catch:{ RuntimeException -> 0x01bc }
            int r2 = r6.A00     // Catch:{ RuntimeException -> 0x01bc }
            r0 = 0
            if (r2 != 0) goto L_0x0123
            boolean r0 = r6 instanceof X.C301095yU     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 == 0) goto L_0x0111
            X.5yU r6 = (X.C301095yU) r6     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.internal.BaseGmsClient r0 = r6.A00     // Catch:{ RuntimeException -> 0x01bc }
            X.64Q r1 = r0.A07     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.ConnectionResult r0 = com.google.android.gms.common.ConnectionResult.A04     // Catch:{ RuntimeException -> 0x01bc }
            r1.De8(r0)     // Catch:{ RuntimeException -> 0x01bc }
            goto L_0x01a3
        L_0x0111:
            r0 = r6
            X.5oP r0 = (X.C295535oP) r0     // Catch:{ RuntimeException -> 0x01bc }
            java.lang.String r12 = "GmsClient"
            android.os.IBinder r1 = r0.A00     // Catch:{ RemoteException -> 0x0120 }
            X.AnonymousClass3Qk.A02(r1)     // Catch:{ RemoteException -> 0x0120 }
            java.lang.String r9 = r1.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0120 }
            goto L_0x013a
        L_0x0120:
            java.lang.String r0 = "service probably died"
            goto L_0x014e
        L_0x0123:
            com.google.android.gms.common.internal.BaseGmsClient r1 = r6.A02     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.internal.BaseGmsClient.A00(r5, r1, r3)     // Catch:{ RuntimeException -> 0x01bc }
            android.os.Bundle r1 = r6.A01     // Catch:{ RuntimeException -> 0x01bc }
            if (r1 == 0) goto L_0x0134
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r0 = r1.getParcelable(r0)     // Catch:{ RuntimeException -> 0x01bc }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ RuntimeException -> 0x01bc }
        L_0x0134:
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult     // Catch:{ RuntimeException -> 0x01bc }
            r1.<init>(r2, r0)     // Catch:{ RuntimeException -> 0x01bc }
            goto L_0x015b
        L_0x013a:
            com.google.android.gms.common.internal.BaseGmsClient r8 = r0.A01     // Catch:{ RuntimeException -> 0x01bc }
            java.lang.String r2 = r8.A05()     // Catch:{ RuntimeException -> 0x01bc }
            boolean r0 = r2.equals(r9)     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 != 0) goto L_0x0183
            java.lang.String r1 = "service descriptor mismatch: "
            java.lang.String r0 = " vs. "
            java.lang.String r0 = X.002.A0u(r1, r2, r0, r9)     // Catch:{ RuntimeException -> 0x01bc }
        L_0x014e:
            android.util.Log.w(r12, r0)     // Catch:{ RuntimeException -> 0x01bc }
        L_0x0151:
            com.google.android.gms.common.internal.BaseGmsClient r0 = r6.A02     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.internal.BaseGmsClient.A00(r5, r0, r3)     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult     // Catch:{ RuntimeException -> 0x01bc }
            r1.<init>(r7, r5)     // Catch:{ RuntimeException -> 0x01bc }
        L_0x015b:
            boolean r0 = r6 instanceof X.C301095yU     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 == 0) goto L_0x0173
            X.5yU r6 = (X.C301095yU) r6     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.internal.BaseGmsClient r2 = r6.A00     // Catch:{ RuntimeException -> 0x01bc }
            X.64Q r0 = r2.A07     // Catch:{ RuntimeException -> 0x01bc }
            r0.De8(r1)     // Catch:{ RuntimeException -> 0x01bc }
        L_0x0168:
            int r0 = r1.A01     // Catch:{ RuntimeException -> 0x01bc }
            r2.A01 = r0     // Catch:{ RuntimeException -> 0x01bc }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ RuntimeException -> 0x01bc }
            r2.A05 = r0     // Catch:{ RuntimeException -> 0x01bc }
            goto L_0x01a3
        L_0x0173:
            X.5oP r6 = (X.C295535oP) r6     // Catch:{ RuntimeException -> 0x01bc }
            com.google.android.gms.common.internal.BaseGmsClient r2 = r6.A01     // Catch:{ RuntimeException -> 0x01bc }
            X.64H r0 = r2.A0I     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 == 0) goto L_0x0168
            X.64G r0 = (X.AnonymousClass64G) r0     // Catch:{ RuntimeException -> 0x01bc }
            X.641 r0 = r0.A00     // Catch:{ RuntimeException -> 0x01bc }
            r0.D5m(r1)     // Catch:{ RuntimeException -> 0x01bc }
            goto L_0x0168
        L_0x0183:
            android.os.IInterface r2 = r8.A04(r1)     // Catch:{ RuntimeException -> 0x01bc }
            if (r2 == 0) goto L_0x0151
            r1 = 4
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.A01(r2, r8, r11, r1)     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 != 0) goto L_0x0196
            boolean r0 = com.google.android.gms.common.internal.BaseGmsClient.A01(r2, r8, r10, r1)     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 == 0) goto L_0x0151
        L_0x0196:
            r8.A06 = r5     // Catch:{ RuntimeException -> 0x01bc }
            X.64F r0 = r8.A0H     // Catch:{ RuntimeException -> 0x01bc }
            if (r0 == 0) goto L_0x01a3
            X.64E r0 = (X.AnonymousClass64E) r0     // Catch:{ RuntimeException -> 0x01bc }
            X.63z r0 = r0.A00     // Catch:{ RuntimeException -> 0x01bc }
            r0.D5e(r5)     // Catch:{ RuntimeException -> 0x01bc }
        L_0x01a3:
            monitor-enter(r4)
            r4.A01 = r3     // Catch:{ all -> 0x01be }
            monitor-exit(r4)     // Catch:{ all -> 0x01be }
            goto L_0x001b
        L_0x01a9:
            r4.A00 = r0     // Catch:{ all -> 0x01b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            com.google.android.gms.common.internal.BaseGmsClient r0 = r4.A02
            java.util.ArrayList r1 = r0.A0M
            monitor-enter(r1)
            r1.remove(r4)     // Catch:{ all -> 0x01b6 }
            monitor-exit(r1)     // Catch:{ all -> 0x01b6 }
            return
        L_0x01b6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b6 }
            throw r0
        L_0x01b9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01b9 }
            throw r0
        L_0x01bc:
            r0 = move-exception
            throw r0
        L_0x01be:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01be }
            throw r0
        L_0x01c1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01c1 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass64I.handleMessage(android.os.Message):void");
    }
}
