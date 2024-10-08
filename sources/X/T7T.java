package X;

import com.facebook.papaya.mldw.Manager;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class T7T implements 0lm {
    public static final C10873RzZ A01 = new Object();
    public final UserSession A00;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized com.facebook.papaya.mldw.Host A00() {
        /*
            r11 = this;
            monitor-enter(r11)
            r4 = 10
            java.util.Map r0 = com.facebook.papaya.mldw.Manager.sHosts     // Catch:{ Exception -> 0x008c }
            java.lang.Class<com.facebook.papaya.mldw.Manager> r10 = com.facebook.papaya.mldw.Manager.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x008c }
            java.util.Map r7 = com.facebook.papaya.mldw.Manager.sHosts     // Catch:{ all -> 0x0082 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0082 }
            com.facebook.papaya.mldw.Host r0 = (com.facebook.papaya.mldw.Host) r0     // Catch:{ all -> 0x0082 }
            monitor-exit(r10)     // Catch:{ Exception -> 0x008c }
            if (r0 != 0) goto L_0x00a0
            com.instagram.common.session.UserSession r9 = r11.A00     // Catch:{ Exception -> 0x008c }
            r0 = 0
            X.0qQ.A0B(r9, r0)     // Catch:{ Exception -> 0x008c }
            X.1BJ r1 = X.AnonymousClass1F2.A00()     // Catch:{ Exception -> 0x008c }
            r0 = 861573803(0x335a92ab, float:5.0890474E-8)
            r8 = 0
            java.io.File r2 = r1.AXT(r8, r0)     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "mldw_store_"
            java.lang.String r0 = r9.A06     // Catch:{ Exception -> 0x008c }
            java.io.File r0 = X.Pxf.A0U(r1, r0, r2)     // Catch:{ Exception -> 0x008c }
            X.Pxg.A1L(r0)     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ Exception -> 0x008c }
            java.lang.String r0 = "/falco.db"
            java.lang.String r5 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x008c }
            com.instagram.service.tigon.IGAuthedTigonService r2 = com.instagram.service.tigon.IGAuthedTigonService.getInstance(r9)     // Catch:{ Exception -> 0x008c }
            X.0qQ.A07(r2)     // Catch:{ Exception -> 0x008c }
            X.RWD r0 = com.facebook.papaya.mldw.network_transport.Transport.Companion     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = ""
            java.lang.String r0 = "https://i.instagram.com/api/v1/mldw/mldw_get_feature_group"
            com.facebook.jni.HybridData r0 = com.facebook.papaya.mldw.network_transport.Transport.initHybrid(r2, r1, r0)     // Catch:{ Exception -> 0x008c }
            if (r0 == 0) goto L_0x0085
            com.facebook.papaya.mldw.network_transport.Transport r3 = new com.facebook.papaya.mldw.network_transport.Transport     // Catch:{ Exception -> 0x008c }
            r3.<init>(r0)     // Catch:{ Exception -> 0x008c }
            X.QY5 r2 = new X.QY5     // Catch:{ Exception -> 0x008c }
            r2.<init>(r9)     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = "ig_mldw_falco_log_sink"
            X.RFG r0 = X.RFG.VERBOSE     // Catch:{ Exception -> 0x008c }
            int r0 = r0.A00     // Catch:{ Exception -> 0x008c }
            com.facebook.papaya.mldw.Manager.nativeAddLogSink(r1, r0, r2)     // Catch:{ Exception -> 0x008c }
            java.util.concurrent.ScheduledExecutorService r1 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor()     // Catch:{ Exception -> 0x008c }
            monitor-enter(r10)     // Catch:{ Exception -> 0x008c }
            boolean r0 = r7.containsKey(r6)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0077
            com.facebook.papaya.mldw.Host r0 = com.facebook.papaya.mldw.Manager.nativeRegisterHost(r4, r1, r5, r3, r8)     // Catch:{ all -> 0x0082 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0082 }
        L_0x0077:
            java.lang.Object r0 = r7.get(r6)     // Catch:{ all -> 0x0082 }
            com.facebook.papaya.mldw.Host r0 = (com.facebook.papaya.mldw.Host) r0     // Catch:{ all -> 0x0082 }
            r0.getClass()     // Catch:{ all -> 0x0082 }
            monitor-exit(r10)     // Catch:{ Exception -> 0x008c }
            goto L_0x0094
        L_0x0082:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ Exception -> 0x008c }
            goto L_0x008b
        L_0x0085:
            java.lang.String r0 = "initHybrid shouldn't be null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)     // Catch:{ Exception -> 0x008c }
        L_0x008b:
            throw r0     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            r2 = move-exception
            java.lang.String r1 = "IgMldwStoreManager"
            java.lang.String r0 = "Failed to register MLDW host for FA"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x00a5 }
        L_0x0094:
            java.lang.Class<com.facebook.papaya.mldw.Manager> r1 = com.facebook.papaya.mldw.Manager.class
            monitor-enter(r1)     // Catch:{ all -> 0x00a5 }
            java.util.Map r0 = com.facebook.papaya.mldw.Manager.sHosts     // Catch:{ all -> 0x00a2 }
            java.lang.Object r0 = X.C51968G9o.A10(r0, r4)     // Catch:{ all -> 0x00a2 }
            com.facebook.papaya.mldw.Host r0 = (com.facebook.papaya.mldw.Host) r0     // Catch:{ all -> 0x00a2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
        L_0x00a0:
            monitor-exit(r11)
            return r0
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T7T.A00():com.facebook.papaya.mldw.Host");
    }

    public final synchronized void onUserSessionWillEnd(boolean z) {
        Map map = Manager.sHosts;
        synchronized (Manager.class) {
            Map map2 = Manager.sHosts;
            if (map.containsKey(10)) {
                map2.remove(10);
                Manager.nativeUnregisterHost(10);
            }
        }
        Manager.nativeRemoveLogSink("ig_mldw_falco_log_sink");
    }

    public T7T(UserSession userSession) {
        this.A00 = userSession;
    }
}
