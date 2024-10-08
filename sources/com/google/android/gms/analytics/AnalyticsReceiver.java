package com.google.android.gms.analytics;

import X.C11322SMw;
import android.content.BroadcastReceiver;

public final class AnalyticsReceiver extends BroadcastReceiver {
    public C11322SMw A00;

    /* JADX WARNING: type inference failed for: r0v35, types: [X.SMw, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void onReceive(android.content.Context r14, android.content.Intent r15) {
        /*
            r13 = this;
            r0 = 1202468908(0x47ac382c, float:88176.34)
            int r7 = X.C66580MXl.A03(r13, r14, r15, r0)
            X.SMw r0 = r13.A00
            if (r0 != 0) goto L_0x0012
            X.SMw r0 = new X.SMw
            r0.<init>()
            r13.A00 = r0
        L_0x0012:
            X.SQt r0 = X.C11381SQt.A01(r14)
            X.QvX r6 = r0.A0C
            X.C11381SQt.A02(r6)
            if (r15 != 0) goto L_0x002a
            java.lang.String r1 = "AnalyticsReceiver called with null intent"
            r0 = 5
            X.ST5.A0B(r6, r1, r0)
        L_0x0023:
            r0 = 917897665(0x36b601c1, float:5.424227E-6)
            X.AnonymousClass0fD.A0E(r0, r7, r15)
            return
        L_0x002a:
            java.lang.String r1 = r15.getAction()
            java.lang.String r0 = "Local AnalyticsReceiver got"
            r6.A0E(r0, r1)
            java.lang.String r4 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0023
            boolean r3 = X.SH4.A00(r14)
            android.content.Intent r2 = X.Pxe.A0G(r4)
            java.lang.String r1 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r14, r1)
            r2.setComponent(r0)
            r2.setAction(r4)
            java.lang.Object r12 = X.C11322SMw.A01
            monitor-enter(r12)
            r14.startService(r2)     // Catch:{ all -> 0x0112 }
            if (r3 == 0) goto L_0x010f
            X.SNk r0 = X.C11322SMw.A00     // Catch:{ SecurityException -> 0x0109 }
            if (r0 != 0) goto L_0x006b
            X.SNk r2 = new X.SNk     // Catch:{ SecurityException -> 0x0109 }
            r2.<init>(r14)     // Catch:{ SecurityException -> 0x0109 }
            X.C11322SMw.A00 = r2     // Catch:{ SecurityException -> 0x0109 }
            r1 = 0
            android.os.PowerManager$WakeLock r0 = r2.A05     // Catch:{ SecurityException -> 0x0109 }
            X.C60270fk.A02(r0)     // Catch:{ SecurityException -> 0x0109 }
            r2.A03 = r1     // Catch:{ SecurityException -> 0x0109 }
        L_0x006b:
            X.SNk r8 = X.C11322SMw.A00     // Catch:{ SecurityException -> 0x0109 }
            r2 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A02     // Catch:{ SecurityException -> 0x0109 }
            r0.incrementAndGet()     // Catch:{ SecurityException -> 0x0109 }
            r10 = 0
            boolean r0 = r8.A03     // Catch:{ SecurityException -> 0x0109 }
            if (r0 == 0) goto L_0x007c
            android.text.TextUtils.isEmpty(r10)     // Catch:{ SecurityException -> 0x0109 }
        L_0x007c:
            java.lang.Object r9 = r8.A06     // Catch:{ SecurityException -> 0x0109 }
            monitor-enter(r9)     // Catch:{ SecurityException -> 0x0109 }
            java.util.Map r5 = r8.A08     // Catch:{ all -> 0x0106 }
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0106 }
            r4 = 0
            if (r0 == 0) goto L_0x008c
            int r0 = r8.A00     // Catch:{ all -> 0x0106 }
            if (r0 <= 0) goto L_0x0099
        L_0x008c:
            android.os.PowerManager$WakeLock r0 = r8.A05     // Catch:{ all -> 0x0106 }
            boolean r0 = r0.isHeld()     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x0099
            r5.clear()     // Catch:{ all -> 0x0106 }
            r8.A00 = r4     // Catch:{ all -> 0x0106 }
        L_0x0099:
            boolean r1 = r8.A03     // Catch:{ all -> 0x0106 }
            r0 = 1
            if (r1 == 0) goto L_0x00eb
            java.lang.Object r1 = r5.get(r10)     // Catch:{ all -> 0x0106 }
            java.lang.Integer[] r1 = (java.lang.Integer[]) r1     // Catch:{ all -> 0x0106 }
            if (r1 != 0) goto L_0x00df
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0106 }
            java.lang.Integer[] r0 = new java.lang.Integer[]{r0}     // Catch:{ all -> 0x0106 }
            r5.put(r10, r0)     // Catch:{ all -> 0x0106 }
        L_0x00b1:
            android.os.PowerManager$WakeLock r1 = r8.A05     // Catch:{ all -> 0x0106 }
            int r0 = android.os.Process.myPid()     // Catch:{ all -> 0x0106 }
            long r4 = (long) r0     // Catch:{ all -> 0x0106 }
            int r0 = java.lang.System.identityHashCode(r1)     // Catch:{ all -> 0x0106 }
            long r0 = (long) r0     // Catch:{ all -> 0x0106 }
            r11 = 32
            long r4 = r4 << r11
            long r4 = r4 | r0
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0106 }
            boolean r1 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x0106 }
            r0 = 1
            if (r0 != r1) goto L_0x00ce
            java.lang.String r10 = ""
        L_0x00ce:
            java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0106 }
            java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0106 }
            X.C11331SNk.A00(r8)     // Catch:{ all -> 0x0106 }
            int r0 = r8.A00     // Catch:{ all -> 0x0106 }
            int r0 = r0 + 1
            r8.A00 = r0     // Catch:{ all -> 0x0106 }
        L_0x00dd:
            monitor-exit(r9)     // Catch:{ all -> 0x0106 }
            goto L_0x00f4
        L_0x00df:
            int r0 = X.JTO.A0A(r1, r4)     // Catch:{ all -> 0x0106 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0106 }
            r1[r4] = r0     // Catch:{ all -> 0x0106 }
        L_0x00eb:
            boolean r0 = r8.A03     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x00dd
            int r0 = r8.A00     // Catch:{ all -> 0x0106 }
            if (r0 != 0) goto L_0x00dd
            goto L_0x00b1
        L_0x00f4:
            android.os.PowerManager$WakeLock r0 = r8.A05     // Catch:{ SecurityException -> 0x0109 }
            X.C60270fk.A00(r0)     // Catch:{ SecurityException -> 0x0109 }
            java.util.concurrent.ScheduledExecutorService r4 = X.C11331SNk.A0A     // Catch:{ SecurityException -> 0x0109 }
            X.TDQ r1 = new X.TDQ     // Catch:{ SecurityException -> 0x0109 }
            r1.<init>(r8)     // Catch:{ SecurityException -> 0x0109 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ SecurityException -> 0x0109 }
            r4.schedule(r1, r2, r0)     // Catch:{ SecurityException -> 0x0109 }
            goto L_0x010f
        L_0x0106:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ SecurityException -> 0x0109 }
        L_0x0109:
            java.lang.String r1 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions."
            r0 = 5
            X.ST5.A0B(r6, r1, r0)     // Catch:{ all -> 0x0112 }
        L_0x010f:
            monitor-exit(r12)     // Catch:{ all -> 0x0112 }
            goto L_0x0023
        L_0x0112:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0112 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.AnalyticsReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
