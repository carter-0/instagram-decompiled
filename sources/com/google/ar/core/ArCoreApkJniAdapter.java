package com.google.ar.core;

import X.AnonymousClass7TE;
import X.C13213TQe;
import X.C8628QyR;
import X.C8629QyS;
import X.C8630QyT;
import X.C8631QyU;
import X.C8632QyV;
import X.C8920RFn;
import java.util.HashMap;
import java.util.Map;

public final class ArCoreApkJniAdapter {
    public static final Map a;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:158:0x01c7=Splitter:B:158:0x01c7, B:152:0x01ba=Splitter:B:152:0x01ba} */
    public static int checkAvailability(android.content.Context r10) {
        /*
            X.SQn r2 = X.SQn.A06     // Catch:{ all -> 0x01e0 }
            X.SQn.A01(r10, r2)     // Catch:{ TQc -> 0x01d3 }
            int r0 = X.SQn.A00(r10)     // Catch:{ TQc -> 0x01d3 }
            if (r0 == 0) goto L_0x0100
            int r1 = X.SQn.A00(r10)     // Catch:{ TQc -> 0x01d3 }
            int r0 = r2.A00     // Catch:{ TQc -> 0x01d3 }
            if (r1 >= r0) goto L_0x0100
            monitor-enter(r2)     // Catch:{ all -> 0x01e0 }
            X.RDH r1 = r2.A01     // Catch:{ all -> 0x00fd }
            if (r1 == 0) goto L_0x0024
            boolean r0 = r1 instanceof X.C8623QyH     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1 instanceof X.C8622QyG     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x0024
            boolean r0 = r1 instanceof X.C8621QyF     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x004d
        L_0x0024:
            boolean r0 = r2.A03     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x004d
            r6 = 1
            r2.A03 = r6     // Catch:{ all -> 0x00fd }
            X.S0g r5 = new X.S0g     // Catch:{ all -> 0x00fd }
            r5.<init>(r2)     // Catch:{ all -> 0x00fd }
            X.SQn.A01(r10, r2)     // Catch:{ all -> 0x00fd }
            int r0 = X.SQn.A00(r10)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00d7
            int r1 = X.SQn.A00(r10)     // Catch:{ all -> 0x00fd }
            int r0 = r2.A00     // Catch:{ all -> 0x00fd }
            if (r1 >= r0) goto L_0x00d7
            int r1 = X.SQn.A00(r10)     // Catch:{ all -> 0x00fd }
            r0 = -1
            if (r1 == r0) goto L_0x0054
            X.RDH r0 = X.RDH.A01     // Catch:{ all -> 0x00fd }
            r5.A00(r0)     // Catch:{ all -> 0x00fd }
        L_0x004d:
            X.RDH r0 = r2.A01     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00de
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x01dd
        L_0x0054:
            X.SQn.A01(r10, r2)     // Catch:{ all -> 0x00fd }
            boolean r0 = r2.A04     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x0061
            X.RDH r0 = X.RDH.A03     // Catch:{ all -> 0x00fd }
            r5.A00(r0)     // Catch:{ all -> 0x00fd }
            goto L_0x004d
        L_0x0061:
            r9 = r2
            monitor-enter(r9)     // Catch:{ all -> 0x00fd }
            X.SFR r4 = r2.A02     // Catch:{ all -> 0x00f7 }
            if (r4 != 0) goto L_0x009d
            r8 = 0
            X.SFR r4 = new X.SFR     // Catch:{ all -> 0x00f7 }
            r4.<init>(r8)     // Catch:{ all -> 0x00f7 }
            android.content.Context r7 = r10.getApplicationContext()     // Catch:{ all -> 0x00f7 }
            monitor-enter(r4)     // Catch:{ all -> 0x00f7 }
            r4.A00 = r7     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "com.google.android.play.core.install.BIND_INSTALL_SERVICE"
            android.content.Intent r1 = X.Pxe.A0G(r0)     // Catch:{ all -> 0x00f4 }
            java.lang.String r0 = "com.android.vending"
            android.content.Intent r0 = r1.setPackage(r0)     // Catch:{ all -> 0x00f4 }
            android.content.ServiceConnection r3 = r4.A02     // Catch:{ all -> 0x00f4 }
            boolean r0 = r7.bindService(r0, r3, r6)     // Catch:{ all -> 0x00f4 }
            if (r0 == 0) goto L_0x008c
            r0 = 2
            r4.A04 = r0     // Catch:{ all -> 0x00f4 }
            goto L_0x009a
        L_0x008c:
            r4.A04 = r6     // Catch:{ all -> 0x00f4 }
            r4.A00 = r8     // Catch:{ all -> 0x00f4 }
            java.lang.String r1 = "ARCore-InstallService"
            java.lang.String r0 = "bindService returned false."
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x00f4 }
            r7.unbindService(r3)     // Catch:{ all -> 0x00f4 }
        L_0x009a:
            monitor-exit(r4)     // Catch:{ all -> 0x00f7 }
            r2.A02 = r4     // Catch:{ all -> 0x00f7 }
        L_0x009d:
            monitor-exit(r9)     // Catch:{ all -> 0x00fd }
            monitor-enter(r4)     // Catch:{ all -> 0x00fd }
            X.TJ5 r3 = new X.TJ5     // Catch:{ RKN -> 0x00c8 }
            r3.<init>(r10, r5, r4)     // Catch:{ RKN -> 0x00c8 }
            monitor-enter(r4)     // Catch:{ RKN -> 0x00c8 }
            int r0 = r4.A04     // Catch:{ all -> 0x00c5 }
            int r1 = r0 + -1
            if (r0 == 0) goto L_0x00bd
            if (r1 == 0) goto L_0x00bf
            if (r1 == r6) goto L_0x00b6
            r0 = 2
            if (r1 != r0) goto L_0x00bb
            r3.run()     // Catch:{ all -> 0x00c5 }
            goto L_0x00bb
        L_0x00b6:
            java.util.Queue r0 = r4.A03     // Catch:{ all -> 0x00c5 }
            r0.offer(r3)     // Catch:{ all -> 0x00c5 }
        L_0x00bb:
            monitor-exit(r4)     // Catch:{ RKN -> 0x00c8 }
            goto L_0x00d4
        L_0x00bd:
            r0 = 0
            goto L_0x00c4
        L_0x00bf:
            X.RKN r0 = new X.RKN     // Catch:{ all -> 0x00c5 }
            r0.<init>()     // Catch:{ all -> 0x00c5 }
        L_0x00c4:
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ RKN -> 0x00c8 }
            throw r0     // Catch:{ RKN -> 0x00c8 }
        L_0x00c8:
            java.lang.String r1 = "ARCore-InstallService"
            java.lang.String r0 = "Play Store install service could not be bound."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00fa }
            X.RDH r0 = X.RDH.A05     // Catch:{ all -> 0x00fa }
            r5.A00(r0)     // Catch:{ all -> 0x00fa }
        L_0x00d4:
            monitor-exit(r4)     // Catch:{ all -> 0x00fd }
            goto L_0x004d
        L_0x00d7:
            X.RDH r0 = X.RDH.A02     // Catch:{ all -> 0x00fd }
            r5.A00(r0)     // Catch:{ all -> 0x00fd }
            goto L_0x004d
        L_0x00de:
            boolean r0 = r2.A03     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00e7
            X.RDH r0 = X.RDH.A04     // Catch:{ all -> 0x00fd }
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x01dd
        L_0x00e7:
            java.lang.String r1 = "ARCore-ArCoreApk"
            java.lang.String r0 = "request not running but result is null?"
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x00fd }
            X.RDH r0 = X.RDH.A05     // Catch:{ all -> 0x00fd }
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            goto L_0x01dd
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00f7 }
            throw r0     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00fd }
            goto L_0x00fc
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fd }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x01e0 }
        L_0x0100:
            monitor-enter(r2)     // Catch:{ TQc -> 0x01d3 }
            X.SFR r5 = r2.A02     // Catch:{ all -> 0x01d0 }
            if (r5 == 0) goto L_0x0127
            monitor-enter(r5)     // Catch:{ all -> 0x01d0 }
            int r0 = r5.A04     // Catch:{ all -> 0x0124 }
            int r1 = r0 + -1
            r4 = 0
            if (r0 == 0) goto L_0x0123
            r3 = 1
            if (r1 == r3) goto L_0x0114
            r0 = 2
            if (r1 == r0) goto L_0x0114
            goto L_0x011f
        L_0x0114:
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x0124 }
            android.content.ServiceConnection r0 = r5.A02     // Catch:{ all -> 0x0124 }
            r1.unbindService(r0)     // Catch:{ all -> 0x0124 }
            r5.A00 = r4     // Catch:{ all -> 0x0124 }
            r5.A04 = r3     // Catch:{ all -> 0x0124 }
        L_0x011f:
            monitor-exit(r5)     // Catch:{ all -> 0x01d0 }
            r2.A02 = r4     // Catch:{ all -> 0x01d0 }
            goto L_0x0127
        L_0x0123:
            throw r4     // Catch:{ all -> 0x0124 }
        L_0x0124:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x01d0 }
            throw r0     // Catch:{ all -> 0x01d0 }
        L_0x0127:
            monitor-exit(r2)     // Catch:{ TQc -> 0x01d3 }
            java.lang.String r4 = ""
            r2 = 0
            android.content.ContentResolver r5 = r10.getContentResolver()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            android.net.Uri$Builder r1 = X.Pxe.A0I()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.String r0 = "content"
            android.net.Uri$Builder r1 = r1.scheme(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.String r0 = "com.google.ar.core.services.arcorecontentprovider"
            android.net.Uri$Builder r0 = r1.authority(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            android.net.Uri$Builder r0 = r0.path(r4)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            android.net.Uri r3 = r0.build()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.String r1 = "getSetupIntent"
            java.lang.String r0 = r10.getPackageName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            android.os.Bundle r3 = r5.call(r3, r1, r0, r2)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            if (r3 == 0) goto L_0x01c7
            java.lang.String r0 = "intent"
            android.os.Parcelable r0 = r3.getParcelable(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            if (r0 == 0) goto L_0x0160
            X.RDH r0 = X.RDH.A01     // Catch:{ QyT -> 0x01cd, QyV | RuntimeException -> 0x01ca }
            goto L_0x01dd
        L_0x0160:
            java.lang.String r0 = "exceptionType"
            java.lang.String r1 = r3.getString(r0, r4)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            boolean r0 = r1.isEmpty()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            if (r0 != 0) goto L_0x01c7
            java.lang.Class<X.QyT> r0 = X.C8630QyT.class
            java.lang.String r0 = r0.getName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            boolean r0 = r1.equals(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            if (r0 != 0) goto L_0x01bb
            java.lang.Class<X.QyV> r0 = X.C8632QyV.class
            java.lang.String r0 = r0.getName()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            boolean r0 = r1.equals(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            if (r0 != 0) goto L_0x01c1
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            java.lang.Class r1 = r1.asSubclass(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.String r0 = "exceptionText"
            java.lang.String r3 = r3.getString(r0, r2)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            r2 = 0
            if (r3 == 0) goto L_0x01ac
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            goto L_0x01ba
        L_0x01ac:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
        L_0x01ba:
            throw r0     // Catch:{ QyT -> 0x01cd, QyV | RuntimeException -> 0x01ca }
        L_0x01bb:
            X.QyT r0 = new X.QyT     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            r0.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            goto L_0x01c6
        L_0x01c1:
            X.QyV r0 = new X.QyV     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
            r0.<init>()     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
        L_0x01c6:
            throw r0     // Catch:{ ReflectiveOperationException | RuntimeException -> 0x01c7, QyV | RuntimeException -> 0x01ca }
        L_0x01c7:
            X.RDH r0 = X.RDH.A02     // Catch:{ QyT -> 0x01cd, QyV | RuntimeException -> 0x01ca }
            goto L_0x01dd
        L_0x01ca:
            X.RDH r0 = X.RDH.A05     // Catch:{ TQc -> 0x01d3 }
            goto L_0x01dd
        L_0x01cd:
            X.RDH r0 = X.RDH.A06     // Catch:{ TQc -> 0x01d3 }
            goto L_0x01dd
        L_0x01d0:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ TQc -> 0x01d3 }
            throw r0     // Catch:{ TQc -> 0x01d3 }
        L_0x01d3:
            r2 = move-exception
            java.lang.String r1 = "ARCore-ArCoreApk"
            java.lang.String r0 = "Error while checking app details and ARCore status"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x01e0 }
            X.RDH r0 = X.RDH.A05     // Catch:{ all -> 0x01e0 }
        L_0x01dd:
            int r0 = r0.A00     // Catch:{ all -> 0x01e0 }
            return r0
        L_0x01e0:
            r3 = move-exception
            java.lang.String r1 = "ARCore-ArCoreApkJniAdapter"
            java.lang.String r0 = "Exception details:"
            android.util.Log.e(r1, r0, r3)
            java.util.Map r2 = a
            java.lang.Class r1 = r3.getClass()
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01f7
            r2.get(r1)
        L_0x01f7:
            X.RDH r0 = X.RDH.A05
            int r0 = r0.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.ArCoreApkJniAdapter.checkAvailability(android.content.Context):int");
    }

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        a = A1E;
        A1E.put(IllegalArgumentException.class, Integer.valueOf(C8920RFn.A09.A00));
        A1E.put(C13213TQe.class, Integer.valueOf(C8920RFn.A0A.A00));
        A1E.put(C8629QyS.class, Integer.valueOf(C8920RFn.A04.A00));
        A1E.put(C8630QyT.class, Integer.valueOf(C8920RFn.A05.A00));
        A1E.put(C8628QyR.class, Integer.valueOf(C8920RFn.A06.A00));
        A1E.put(C8631QyU.class, Integer.valueOf(C8920RFn.A07.A00));
        A1E.put(C8632QyV.class, Integer.valueOf(C8920RFn.A08.A00));
    }
}
