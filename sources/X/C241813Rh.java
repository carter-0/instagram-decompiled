package X;

import com.facebook.push.fbns.ipc.FbnsAIDLRequest;
import java.util.concurrent.Callable;

/* renamed from: X.3Rh  reason: invalid class name and case insensitive filesystem */
public final class C241813Rh implements Callable {
    public final /* synthetic */ FbnsAIDLRequest A00;
    public final /* synthetic */ C241783Re A01;

    public C241813Rh(FbnsAIDLRequest fbnsAIDLRequest, C241783Re r2) {
        this.A01 = r2;
        this.A00 = fbnsAIDLRequest;
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r20 = this;
            r4 = r20
            X.3Re r5 = r4.A01     // Catch:{ all -> 0x01a2 }
            monitor-enter(r5)     // Catch:{ all -> 0x01a2 }
            int r0 = r5.A00     // Catch:{ all -> 0x019f }
            r18 = 1
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x019f }
            r2 = 200(0xc8, double:9.9E-322)
            r7 = 1
        L_0x0010:
            java.lang.Integer r1 = r5.A02     // Catch:{ all -> 0x019d }
            java.lang.Integer r8 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x019d }
            r0 = 0
            if (r1 != r8) goto L_0x0018
            r0 = 1
        L_0x0018:
            if (r0 != 0) goto L_0x0127
            r0 = 5
            if (r7 <= r0) goto L_0x001f
            goto L_0x0110
        L_0x001f:
            java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x019f }
            r6.getId()     // Catch:{ all -> 0x019f }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x019f }
            java.lang.Integer r1 = r5.A02     // Catch:{ all -> 0x019d }
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x019d }
            r0 = 0
            if (r1 != r11) goto L_0x0031
            r0 = 1
        L_0x0031:
            if (r0 != 0) goto L_0x0106
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x019f }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x019f }
            if (r0 != r6) goto L_0x0046
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "This operation can't be run on UI thread"
            X.0KC.A0C(r1, r0)     // Catch:{ all -> 0x019f }
            goto L_0x0127
        L_0x0046:
            r6.getId()     // Catch:{ all -> 0x019f }
            android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x019f }
            android.content.Context r9 = r5.A03     // Catch:{ all -> 0x019f }
            java.lang.Object r6 = X.AnonymousClass3RD.A00     // Catch:{ all -> 0x019f }
            X.3RX r6 = (X.AnonymousClass3RX) r6     // Catch:{ all -> 0x019f }
            java.lang.String r1 = r6.A05     // Catch:{ all -> 0x019f }
            java.lang.String r0 = r6.A04     // Catch:{ all -> 0x019f }
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ all -> 0x019f }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x019f }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x019f }
        L_0x0062:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x009a
            java.lang.Object r10 = r1.next()     // Catch:{ all -> 0x019f }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x019f }
            X.3RB r0 = X.AnonymousClass3RB.A02     // Catch:{ all -> 0x019f }
            boolean r0 = X.C241843Rk.A01(r9, r0, r10)     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0062
        L_0x0076:
            java.lang.String r0 = com.facebook.rti.push.service.FbnsServiceDelegate.A00(r10)     // Catch:{ all -> 0x019f }
            android.content.ComponentName r1 = new android.content.ComponentName     // Catch:{ all -> 0x019f }
            r1.<init>(r10, r0)     // Catch:{ all -> 0x019f }
            java.lang.Class<com.facebook.push.fbns.ipc.IFbnsAIDLService> r0 = com.facebook.push.fbns.ipc.IFbnsAIDLService.class
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x019f }
            android.content.Intent r12 = new android.content.Intent     // Catch:{ all -> 0x019f }
            r12.<init>(r0)     // Catch:{ all -> 0x019f }
            r12.setComponent(r1)     // Catch:{ all -> 0x019f }
            r10 = 0
            r9.getClass()     // Catch:{ all -> 0x019f }
            X.3Rv r0 = new X.3Rv     // Catch:{ all -> 0x019f }
            r0.<init>(r9, r10)     // Catch:{ all -> 0x019f }
            r0.A02(r12)     // Catch:{ all -> 0x019f }
            goto L_0x009f
        L_0x009a:
            java.lang.String r10 = r9.getPackageName()     // Catch:{ all -> 0x019f }
            goto L_0x0076
        L_0x009f:
            X.3Rv r1 = new X.3Rv     // Catch:{ SecurityException -> 0x00fa }
            r1.<init>(r9, r10)     // Catch:{ SecurityException -> 0x00fa }
            android.content.Context r0 = r1.A00     // Catch:{ SecurityException -> 0x00fa }
            r19 = r0
            r1.A02(r12)     // Catch:{ SecurityException -> 0x00fa }
            java.lang.String r17 = "fbns_aidl_auth_domain"
            android.content.ServiceConnection r10 = r5.A04     // Catch:{ SecurityException -> 0x00fa }
            java.lang.String r16 = "FbnsSecureIntentHelper"
            X.0b6 r14 = X.0b6.A00()     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            java.util.Set r0 = r6.A07     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            X.0Pj r0 = X.0cQ.A02(r0)     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            monitor-enter(r14)     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            X.0QY r15 = X.0b6.A01(r14, r0)     // Catch:{ all -> 0x00d9 }
            java.util.Set r13 = r14.A0I     // Catch:{ all -> 0x00d9 }
            java.util.List r1 = r14.A0H     // Catch:{ all -> 0x00d9 }
            X.0bs r6 = new X.0bs     // Catch:{ all -> 0x00d9 }
            r0 = r17
            r6.<init>(r15, r0, r1, r13)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r14)     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            r1 = r19
            r0 = r18
            boolean r0 = r6.A04(r1, r12, r10, r0)     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            if (r0 == 0) goto L_0x00e5
            r5.A02 = r11     // Catch:{ SecurityException -> 0x00fa }
            goto L_0x00ef
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
            throw r0     // Catch:{ SecurityException -> 0x00f1, RuntimeException -> 0x00dc }
        L_0x00dc:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()     // Catch:{ SecurityException -> 0x00fa }
            boolean r0 = r0 instanceof android.os.DeadObjectException     // Catch:{ SecurityException -> 0x00fa }
            if (r0 == 0) goto L_0x00f9
        L_0x00e5:
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "open failed: bindService failure, do unbind to let service shutdown"
            X.0KC.A0C(r1, r0)     // Catch:{ SecurityException -> 0x00fa }
            r9.unbindService(r10)     // Catch:{ SecurityException -> 0x00fa }
        L_0x00ef:
            r0 = 0
            goto L_0x0103
        L_0x00f1:
            r6 = move-exception
            java.lang.String r1 = "Failed to bind to service"
            r0 = r16
            X.0KC.A0G(r0, r1, r6)     // Catch:{ SecurityException -> 0x00fa }
        L_0x00f9:
            throw r6     // Catch:{ SecurityException -> 0x00fa }
        L_0x00fa:
            r6 = move-exception
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "open failed: bindService throw SecurityException"
            X.0KC.A0F(r1, r0, r6)     // Catch:{ all -> 0x019d }
            r0 = 1
        L_0x0103:
            if (r0 == 0) goto L_0x0106
            goto L_0x0127
        L_0x0106:
            r5.wait(r2)     // Catch:{ all -> 0x019f }
            r0 = 2
            long r2 = r2 * r0
            int r7 = r7 + 1
            goto L_0x0010
        L_0x0110:
            java.lang.String r3 = "FbnsAIDLClientManager"
            java.lang.String r2 = "Max Try reached for binding to FbnsAIDLService, threadId %d"
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x019f }
            long r0 = r0.getId()     // Catch:{ all -> 0x019f }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x019f }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ all -> 0x019f }
            X.0KC.A0O(r3, r2, r0)     // Catch:{ all -> 0x019f }
        L_0x0127:
            monitor-exit(r5)     // Catch:{ all -> 0x01a2 }
            com.facebook.push.fbns.ipc.FbnsAIDLRequest r7 = r4.A00     // Catch:{ all -> 0x01a2 }
            android.os.Bundle r6 = android.os.Bundle.EMPTY     // Catch:{ all -> 0x01a2 }
            com.facebook.push.fbns.ipc.FbnsAIDLResult r3 = new com.facebook.push.fbns.ipc.FbnsAIDLResult     // Catch:{ all -> 0x01a2 }
            r3.<init>((android.os.Bundle) r6)     // Catch:{ all -> 0x01a2 }
            monitor-enter(r5)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            java.lang.Integer r1 = r5.A02     // Catch:{ all -> 0x017e }
            r0 = 0
            if (r1 != r8) goto L_0x0138
            r0 = 1
        L_0x0138:
            if (r0 == 0) goto L_0x0180
            com.facebook.push.fbns.ipc.IFbnsAIDLService r2 = r5.A01     // Catch:{ all -> 0x0188 }
            if (r2 == 0) goto L_0x0176
            monitor-exit(r5)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            int r0 = r7.A00     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            java.util.Map r1 = X.C241803Rg.A02     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            X.3Rg r0 = (X.C241803Rg) r0     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            if (r0 != 0) goto L_0x0151
            X.3Rg r0 = X.C241803Rg.NOT_EXIST     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
        L_0x0151:
            boolean r0 = r0.A01     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            if (r0 == 0) goto L_0x0166
            android.os.Bundle r0 = r7.A00     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            if (r0 != 0) goto L_0x015e
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            X.0qQ.A08(r6)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
        L_0x015e:
            r0.toString()     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            com.facebook.push.fbns.ipc.FbnsAIDLResult r3 = r2.E5l(r7)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            goto L_0x0199
        L_0x0166:
            android.os.Bundle r0 = r7.A00     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            if (r0 != 0) goto L_0x016f
            android.os.Bundle r0 = android.os.Bundle.EMPTY     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            X.0qQ.A08(r6)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
        L_0x016f:
            r0.toString()     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            r2.FJO(r7)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            goto L_0x0199
        L_0x0176:
            java.lang.String r0 = "AIDLService is null"
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ all -> 0x0188 }
            r1.<init>(r0)     // Catch:{ all -> 0x0188 }
            goto L_0x0187
        L_0x017e:
            r1 = move-exception
            goto L_0x0187
        L_0x0180:
            java.lang.String r0 = "AIDLService is not bound"
            android.os.RemoteException r1 = new android.os.RemoteException     // Catch:{ all -> 0x0188 }
            r1.<init>(r0)     // Catch:{ all -> 0x0188 }
        L_0x0187:
            throw r1     // Catch:{ all -> 0x0188 }
        L_0x0188:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
            throw r0     // Catch:{ DeadObjectException -> 0x018b, RemoteException -> 0x0191 }
        L_0x018b:
            r2 = move-exception
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "Fbns AIDL request got DeadObjectException"
            goto L_0x0196
        L_0x0191:
            r2 = move-exception
            java.lang.String r1 = "FbnsAIDLClientManager"
            java.lang.String r0 = "Fbns AIDL request got RemoteException"
        L_0x0196:
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x01a2 }
        L_0x0199:
            X.C241783Re.A00(r5)
            return r3
        L_0x019d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01a2 }
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            r1 = move-exception
            X.3Re r0 = r4.A01
            X.C241783Re.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C241813Rh.call():java.lang.Object");
    }
}
