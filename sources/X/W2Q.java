package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class W2Q {
    public long A00 = -1;
    public C20994X8r A01;
    public Float A02;
    public Float A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;
    public Map A0A = new ConcurrentHashMap();
    public boolean A0B;
    public boolean A0C;

    public final void A0A(int i) {
        UUO uuo = (UUO) this;
        W36 w36 = uuo.A01;
        0qQ.A0C(w36, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamABRObserverImpl");
        UUM uum = (UUM) w36;
        synchronized (uum) {
            uum.A00 = i;
        }
        UUN uun = (UUN) uuo.A02;
        if (uun != null) {
            synchronized (uun) {
                uun.A00 = i;
            }
        }
        C69677Npz npz = uuo.A06;
        0qQ.A0C(npz, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
        ((UUT) npz).A00 = i;
        LGZ lgz = uuo.A03;
        0qQ.A0C(lgz, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamLatencyManagerImpl");
        ((UUQ) lgz).A00 = i;
        C20994X8r x8r = uuo.A01;
        if (x8r != null) {
            x8r.EUD(i);
        }
        uuo.A00 = i;
    }

    public abstract void A0B(C61081JwJ jwJ, V4C v4c);

    public static void A07(0bb r2) {
        HO4 A002;
        String str = C62918KoW.A03;
        if (str != null && (A002 = UUO.A00(str)) != null) {
            r2.A01(A002, "device_build_type");
        }
    }

    public static void A08(0bb r2) {
        HO5 A012;
        String str = C62918KoW.A01;
        if (str != null && (A012 = UUO.A01(str)) != null) {
            r2.A01(A012, "device_type");
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A09() {
        /*
            r12 = this;
            X.7vQ r4 = X.C346587vQ.A0C
            boolean r0 = r4.A0B()
            if (r0 == 0) goto L_0x037f
            boolean r0 = r12.A0C
            if (r0 == 0) goto L_0x0010
            r0 = 0
            r12.A0C(r0)
        L_0x0010:
            r11 = r4
            monitor-enter(r11)
            java.lang.Long r0 = X.C51968G9o.A0u()     // Catch:{ all -> 0x037b }
            X.C346587vQ.A05 = r0     // Catch:{ all -> 0x037b }
            r2 = 0
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x037b }
            X.C346587vQ.A03 = r10     // Catch:{ all -> 0x037b }
            monitor-exit(r11)
            r11 = r12
            monitor-enter(r11)
            java.lang.Long r0 = r4.A04()     // Catch:{ all -> 0x037b }
            r5 = 0
            if (r0 != 0) goto L_0x005a
            java.lang.String r2 = "sessionStartTime"
        L_0x002b:
            java.lang.String r1 = "Session telemetry event: "
            java.lang.String r0 = " is null"
            java.lang.String r3 = X.002.A0g(r1, r2, r0)     // Catch:{ all -> 0x037b }
            X.8j2 r1 = X.C363058j1.A02     // Catch:{ all -> 0x037b }
            java.lang.String r0 = "sup:SUPMediaStreamFalcoLoggerImpl"
            r1.A04(r0, r3, r5)     // Catch:{ all -> 0x037b }
            java.lang.String r0 = "TELEMETRY_SESSION_VALIDATION_ERROR"
            X.UUb r2 = new X.UUb     // Catch:{ all -> 0x037b }
            r2.<init>(r0)     // Catch:{ all -> 0x037b }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x037b }
            r1.<init>(r3)     // Catch:{ all -> 0x037b }
            X.JwJ r0 = new X.JwJ     // Catch:{ all -> 0x037b }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x037b }
        L_0x004b:
            r12.A0B(r0, r2)     // Catch:{ all -> 0x037b }
        L_0x004e:
            r12.A06 = r5     // Catch:{ all -> 0x037b }
            r12.A05 = r5     // Catch:{ all -> 0x037b }
            r2 = r12
            X.UUO r2 = (X.UUO) r2     // Catch:{ all -> 0x037b }
            X.V4W r1 = r2.A05     // Catch:{ all -> 0x037b }
            monitor-enter(r1)     // Catch:{ all -> 0x037b }
            goto L_0x0330
        L_0x005a:
            java.lang.Long r0 = r4.A03()     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0063
            java.lang.String r2 = "sessionEndTime"
            goto L_0x002b
        L_0x0063:
            java.lang.String r0 = r4.A08()     // Catch:{ all -> 0x037b }
            if (r0 != 0) goto L_0x0070
            boolean r0 = r12.A0B     // Catch:{ all -> 0x037b }
            if (r0 == 0) goto L_0x0070
            java.lang.String r2 = "broadcastId"
            goto L_0x002b
        L_0x0070:
            java.lang.Boolean r0 = r4.A00()     // Catch:{ all -> 0x037b }
            if (r0 == 0) goto L_0x004e
            r3 = r12
            X.UUO r3 = (X.UUO) r3     // Catch:{ Exception -> 0x0318 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x0318 }
            r8 = 6
            if (r0 == r8) goto L_0x0163
            X.X8r r7 = r3.A01     // Catch:{ Exception -> 0x0318 }
            if (r7 == 0) goto L_0x0163
            java.lang.String r1 = X.C62918KoW.A01     // Catch:{ Exception -> 0x0318 }
            r6 = 3
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = "device_type"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x008c:
            java.lang.String r1 = X.C62918KoW.A03     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0095
            java.lang.String r0 = "device_build_type"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0095:
            java.lang.String r1 = X.C62918KoW.A02     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x009e
            java.lang.String r0 = "soc_version"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x009e:
            java.lang.String r1 = X.C62918KoW.A00     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x00a7
            java.lang.String r0 = "build_flavor"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x00a7:
            java.lang.String r0 = r4.A06()     // Catch:{ Exception -> 0x0318 }
            r7.CmH(r6, r2, r0)     // Catch:{ Exception -> 0x0318 }
            r1 = 7
            java.lang.String r0 = X.UUO.A03(r3)     // Catch:{ Exception -> 0x0318 }
            r7.CmH(r6, r1, r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r4.A04()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00c4
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0318 }
            if (r0 != 0) goto L_0x00c5
        L_0x00c4:
            r0 = r1
        L_0x00c5:
            r2 = 2
            r7.CmH(r6, r2, r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r4.A03()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x00d6
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x00d6
            r1 = r0
        L_0x00d6:
            r7.CmH(r6, r6, r1)     // Catch:{ Exception -> 0x0318 }
            r1 = 4
            java.lang.Long r0 = r3.A06     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r9 = "0"
            if (r0 != 0) goto L_0x00e5
            r0 = r9
        L_0x00e5:
            r7.CmH(r6, r1, r0)     // Catch:{ Exception -> 0x0318 }
            r1 = 5
            java.lang.Long r0 = r3.A05     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x00f2
            r9 = r0
        L_0x00f2:
            r7.CmH(r6, r1, r9)     // Catch:{ Exception -> 0x0318 }
            X.V4W r9 = r3.A05     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r9.A02()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x010a
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "battery_level_start_pct"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x010a:
            java.lang.Long r0 = r9.A01()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x011d
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "battery_level_end_pct"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x011d:
            X.UUR r9 = (X.UUR) r9     // Catch:{ Exception -> 0x0318 }
            X.V1V r0 = r9.A04()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x012e
            java.lang.String r1 = r0.name()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "thermal_throttling_start_state_type"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x012e:
            X.V1V r0 = r9.A03()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x013d
            java.lang.String r1 = r0.name()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "thermal_throttling_end_state_type"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x013d:
            java.lang.String r0 = r4.A08()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x0146
            r7.CmH(r6, r8, r0)     // Catch:{ Exception -> 0x0318 }
        L_0x0146:
            monitor-enter(r4)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = X.C346587vQ.A0B     // Catch:{ all -> 0x0315 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0151
            java.lang.String r0 = "mwa_app_version"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0151:
            java.lang.Integer r0 = r4.A02()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x0160
            java.lang.String r1 = X.C16806V6n.A00(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "streaming_protocol"
            r7.CmI(r6, r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0160:
            r7.markerEnd(r6, r2)     // Catch:{ Exception -> 0x0318 }
        L_0x0163:
            int r1 = r3.A00     // Catch:{ Exception -> 0x0318 }
            r0 = 3
            if (r1 == r0) goto L_0x0236
            r0 = 4
            if (r1 != r0) goto L_0x004e
            X.0Ae r1 = r3.A08     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "smart_glasses_app_call_session_end"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)     // Catch:{ Exception -> 0x0318 }
            boolean r0 = r2.isSampled()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x004e
            X.UGY r6 = new X.UGY     // Catch:{ Exception -> 0x0318 }
            r6.<init>()     // Catch:{ Exception -> 0x0318 }
            A08(r6)     // Catch:{ Exception -> 0x0318 }
            A07(r6)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = X.C62918KoW.A02     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x018d
            java.lang.String r0 = "soc_version"
            r6.A06(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x018d:
            java.lang.String r1 = X.C62918KoW.A00     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0196
            java.lang.String r0 = "build_flavor"
            r6.A06(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0196:
            java.lang.String r0 = "__device"
            r2.AAK(r6, r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = r4.A06()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "app_call_session_id"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
            boolean r0 = r3.A0B     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x022b
            java.lang.String r1 = "call"
        L_0x01aa:
            java.lang.String r0 = "end_call_stage"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r1 = r4.A04()     // Catch:{ Exception -> 0x0318 }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "call_session_start_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r1 = r4.A03()     // Catch:{ Exception -> 0x0318 }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "call_session_end_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r3.A06     // Catch:{ Exception -> 0x0318 }
            r6 = 0
            if (r0 == 0) goto L_0x0228
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0318 }
        L_0x01d1:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "pre_call_total_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r3.A05     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x01e2
            long r6 = r0.longValue()     // Catch:{ Exception -> 0x0318 }
        L_0x01e2:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "call_total_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            X.V4W r3 = r3.A05     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r1 = r3.A02()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x01f8
            java.lang.String r0 = "battery_level_start_pct"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x01f8:
            java.lang.Long r1 = r3.A01()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0203
            java.lang.String r0 = "battery_level_end_pct"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0203:
            X.UUR r3 = (X.UUR) r3     // Catch:{ Exception -> 0x0318 }
            X.V1V r1 = r3.A04()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0210
            java.lang.String r0 = "thermal_throttling_start_state_type"
            r2.A8M(r1, r0)     // Catch:{ Exception -> 0x0318 }
        L_0x0210:
            X.V1V r1 = r3.A03()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x021b
            java.lang.String r0 = "thermal_throttling_end_state_type"
            r2.A8M(r1, r0)     // Catch:{ Exception -> 0x0318 }
        L_0x021b:
            java.lang.String r1 = r4.A08()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0226
            java.lang.String r0 = "call_id"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0226:
            monitor-enter(r4)     // Catch:{ Exception -> 0x0318 }
            goto L_0x022f
        L_0x0228:
            r0 = 0
            goto L_0x01d1
        L_0x022b:
            java.lang.String r1 = "ringing"
            goto L_0x01aa
        L_0x022f:
            java.lang.String r1 = X.C346587vQ.A0B     // Catch:{ all -> 0x0315 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x030d
            goto L_0x0308
        L_0x0236:
            X.0Ae r1 = r3.A08     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "smart_glasses_app_livestream_session_end"
            X.0Aj r2 = X.C51969G9p.A0d(r1, r0)     // Catch:{ Exception -> 0x0318 }
            boolean r0 = r2.isSampled()     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x004e
            X.UGa r6 = new X.UGa     // Catch:{ Exception -> 0x0318 }
            r6.<init>()     // Catch:{ Exception -> 0x0318 }
            A08(r6)     // Catch:{ Exception -> 0x0318 }
            A07(r6)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = X.C62918KoW.A02     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0258
            java.lang.String r0 = "soc_version"
            r6.A06(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0258:
            java.lang.String r1 = X.C62918KoW.A00     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0261
            java.lang.String r0 = "build_flavor"
            r6.A06(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0261:
            java.lang.String r0 = "__device"
            r2.AAK(r6, r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r1 = r4.A06()     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "app_stream_session_id"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
            boolean r0 = r3.A0B     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x02f6
            java.lang.String r1 = "live"
        L_0x0275:
            java.lang.String r0 = "end_livestream_stage"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r1 = r4.A04()     // Catch:{ Exception -> 0x0318 }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "stream_session_start_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r1 = r4.A03()     // Catch:{ Exception -> 0x0318 }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "stream_session_end_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r3.A06     // Catch:{ Exception -> 0x0318 }
            r6 = 0
            if (r0 == 0) goto L_0x02f3
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0318 }
        L_0x029c:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "pre_live_total_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r0 = r3.A05     // Catch:{ Exception -> 0x0318 }
            if (r0 == 0) goto L_0x02ad
            long r6 = r0.longValue()     // Catch:{ Exception -> 0x0318 }
        L_0x02ad:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x0318 }
            java.lang.String r0 = "live_total_time_ms"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
            X.V4W r3 = r3.A05     // Catch:{ Exception -> 0x0318 }
            java.lang.Long r1 = r3.A02()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x02c3
            java.lang.String r0 = "battery_level_start_pct"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x02c3:
            java.lang.Long r1 = r3.A01()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x02ce
            java.lang.String r0 = "battery_level_end_pct"
            r2.A9F(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x02ce:
            X.UUR r3 = (X.UUR) r3     // Catch:{ Exception -> 0x0318 }
            X.V1V r1 = r3.A04()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x02db
            java.lang.String r0 = "thermal_throttling_start_state_type"
            r2.A8M(r1, r0)     // Catch:{ Exception -> 0x0318 }
        L_0x02db:
            X.V1V r1 = r3.A03()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x02e6
            java.lang.String r0 = "thermal_throttling_end_state_type"
            r2.A8M(r1, r0)     // Catch:{ Exception -> 0x0318 }
        L_0x02e6:
            java.lang.String r1 = r4.A08()     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x02f1
            java.lang.String r0 = "broadcast_id"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x02f1:
            monitor-enter(r4)     // Catch:{ Exception -> 0x0318 }
            goto L_0x02fa
        L_0x02f3:
            r0 = 0
            goto L_0x029c
        L_0x02f6:
            java.lang.String r1 = "in_preview"
            goto L_0x0275
        L_0x02fa:
            java.lang.String r1 = X.C346587vQ.A0B     // Catch:{ all -> 0x0315 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x0318 }
            if (r1 == 0) goto L_0x0304
            java.lang.String r0 = "mwa_app_version"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x0304:
            A06(r2, r4)     // Catch:{ Exception -> 0x0318 }
            goto L_0x0310
        L_0x0308:
            java.lang.String r0 = "mwa_app_version"
            r2.AAJ(r0, r1)     // Catch:{ Exception -> 0x0318 }
        L_0x030d:
            A06(r2, r4)     // Catch:{ Exception -> 0x0318 }
        L_0x0310:
            r2.Cgf()     // Catch:{ Exception -> 0x0318 }
            goto L_0x004e
        L_0x0315:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x0318 }
            throw r0     // Catch:{ Exception -> 0x0318 }
        L_0x0318:
            r3 = move-exception
            X.8j2 r2 = X.C363058j1.A02     // Catch:{ all -> 0x037b }
            java.lang.String r1 = "sup:SUPMediaStreamFalcoLoggerImpl"
            java.lang.String r0 = "Error logging session event"
            r2.A05(r1, r0, r3)     // Catch:{ all -> 0x037b }
            java.lang.String r0 = "TELEMETRY_SESSION_LOGGING_ERROR"
            X.UUb r2 = new X.UUb     // Catch:{ all -> 0x037b }
            r2.<init>(r0)     // Catch:{ all -> 0x037b }
            X.JwJ r0 = new X.JwJ     // Catch:{ all -> 0x037b }
            r0.<init>((java.lang.Throwable) r3)     // Catch:{ all -> 0x037b }
            goto L_0x004b
        L_0x0330:
            r1.A03 = r5     // Catch:{ all -> 0x0378 }
            r1.A01 = r5     // Catch:{ all -> 0x0378 }
            monitor-enter(r1)     // Catch:{ all -> 0x0378 }
            r1.A02 = r5     // Catch:{ all -> 0x0375 }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0375 }
            if (r0 != 0) goto L_0x033d
            r1.A03 = r5     // Catch:{ all -> 0x0375 }
        L_0x033d:
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            monitor-enter(r1)     // Catch:{ all -> 0x0378 }
            r1.A00 = r5     // Catch:{ all -> 0x0375 }
            java.lang.Integer r0 = r1.A01     // Catch:{ all -> 0x0375 }
            if (r0 != 0) goto L_0x0347
            r1.A01 = r5     // Catch:{ all -> 0x0375 }
        L_0x0347:
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            monitor-exit(r1)     // Catch:{ all -> 0x037b }
            monitor-enter(r4)     // Catch:{ all -> 0x037b }
            X.C346587vQ.A08 = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A0A = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A07 = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A09 = r5     // Catch:{ all -> 0x0372 }
            r0 = 1
            X.C346587vQ.A00 = r0     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A03 = r10     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A01 = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A02 = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A0B = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A06 = r5     // Catch:{ all -> 0x0372 }
            X.C346587vQ.A05 = r5     // Catch:{ all -> 0x0372 }
            monitor-exit(r4)     // Catch:{ all -> 0x037b }
            X.W36 r0 = r2.A01     // Catch:{ all -> 0x037b }
            r0.A0A()     // Catch:{ all -> 0x037b }
            X.W36 r0 = r2.A02     // Catch:{ all -> 0x037b }
            r0.A0A()     // Catch:{ all -> 0x037b }
            java.util.Map r0 = r12.A0A     // Catch:{ all -> 0x037b }
            r0.clear()     // Catch:{ all -> 0x037b }
            goto L_0x037e
        L_0x0372:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x037b }
            goto L_0x037a
        L_0x0375:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0378 }
            throw r0     // Catch:{ all -> 0x0378 }
        L_0x0378:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x037b }
        L_0x037a:
            throw r0     // Catch:{ all -> 0x037b }
        L_0x037b:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x037e:
            monitor-exit(r11)
        L_0x037f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2Q.A09():void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
    public final void A0C(boolean r24) {
        /*
            r23 = this;
            r7 = r23
            boolean r0 = r7.A0C
            r18 = r24
            if (r0 != 0) goto L_0x0015
            if (r24 == 0) goto L_0x0010
            java.lang.Long r0 = X.C51968G9o.A0u()
            r7.A07 = r0
        L_0x0010:
            r0 = r18
            r7.A0C = r0
            return
        L_0x0015:
            if (r24 != 0) goto L_0x0010
            r17 = r7
            monitor-enter(r17)
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06ce }
            java.lang.Long r1 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x06ce }
            r7.A04 = r1     // Catch:{ all -> 0x06ce }
            java.lang.Long r0 = r7.A07     // Catch:{ all -> 0x06ce }
            r6 = 0
            if (r0 == 0) goto L_0x002c
            if (r1 == 0) goto L_0x0059
            goto L_0x008b
        L_0x002c:
            X.8j2 r2 = X.C363058j1.A02     // Catch:{ all -> 0x06ce }
            java.lang.String r1 = "sup:SUPMediaStreamFalcoLoggerImpl"
            java.lang.String r0 = "Aggregate session data: startTimestamp is null"
            r2.A04(r1, r0, r6)     // Catch:{ all -> 0x06ce }
            java.lang.String r0 = "TELEMETRY_START_TIMESTAMP_IS_NULL"
            X.UUb r2 = new X.UUb     // Catch:{ all -> 0x06ce }
            r2.<init>(r0)     // Catch:{ all -> 0x06ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ce }
            r1.<init>()     // Catch:{ all -> 0x06ce }
            java.lang.String r0 = "endTimestamp is "
            r1.append(r0)     // Catch:{ all -> 0x06ce }
            java.lang.Long r0 = r7.A04     // Catch:{ all -> 0x06ce }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ all -> 0x06ce }
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ all -> 0x06ce }
            r1.<init>(r0)     // Catch:{ all -> 0x06ce }
            X.JwJ r0 = new X.JwJ     // Catch:{ all -> 0x06ce }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x06ce }
            r7.A0B(r0, r2)     // Catch:{ all -> 0x06ce }
        L_0x0059:
            java.lang.Long r0 = r7.A04     // Catch:{ all -> 0x06ce }
            if (r0 != 0) goto L_0x00b0
            X.8j2 r2 = X.C363058j1.A02     // Catch:{ all -> 0x06ce }
            java.lang.String r1 = "sup:SUPMediaStreamFalcoLoggerImpl"
            java.lang.String r0 = "Aggregate session data: endTimestamp is null"
            r2.A04(r1, r0, r6)     // Catch:{ all -> 0x06ce }
            java.lang.String r0 = "TELEMETRY_END_TIMESTAMP_IS_NULL"
            X.UUb r2 = new X.UUb     // Catch:{ all -> 0x06ce }
            r2.<init>(r0)     // Catch:{ all -> 0x06ce }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06ce }
            r1.<init>()     // Catch:{ all -> 0x06ce }
            java.lang.String r0 = "startTimestamp is "
            r1.append(r0)     // Catch:{ all -> 0x06ce }
            java.lang.Long r0 = r7.A07     // Catch:{ all -> 0x06ce }
            java.lang.String r0 = X.AnonymousClass7TF.A0i(r0, r1)     // Catch:{ all -> 0x06ce }
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ all -> 0x06ce }
            r1.<init>(r0)     // Catch:{ all -> 0x06ce }
            X.JwJ r0 = new X.JwJ     // Catch:{ all -> 0x06ce }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x06ce }
            r7.A0B(r0, r2)     // Catch:{ all -> 0x06ce }
            goto L_0x00b0
        L_0x008b:
            long r10 = r0.longValue()     // Catch:{ all -> 0x06ce }
            boolean r0 = r7.A0B     // Catch:{ all -> 0x06ce }
            r8 = 0
            if (r0 == 0) goto L_0x00f5
            long r0 = r7.A00     // Catch:{ all -> 0x06ce }
            r3 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x00b2
            X.8j2 r2 = X.C363058j1.A02     // Catch:{ all -> 0x06ce }
            java.lang.String r1 = "sup:SUPMediaStreamFalcoLoggerImpl"
            java.lang.String r0 = "Live timestamp is invalid"
            r2.A04(r1, r0, r6)     // Catch:{ all -> 0x06ce }
            java.lang.String r1 = "TELEMETRY_LIVE_TIMESTAMP_INVALID"
            X.UUb r0 = new X.UUb     // Catch:{ all -> 0x06ce }
            r0.<init>(r1)     // Catch:{ all -> 0x06ce }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x06ce }
        L_0x00b0:
            monitor-enter(r7)     // Catch:{ all -> 0x06ce }
            goto L_0x0106
        L_0x00b2:
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ca
            X.8j2 r2 = X.C363058j1.A02     // Catch:{ all -> 0x06ce }
            java.lang.String r1 = "sup:SUPMediaStreamFalcoLoggerImpl"
            java.lang.String r0 = "Live timestamp is after end timestamp"
            r2.A04(r1, r0, r6)     // Catch:{ all -> 0x06ce }
            java.lang.String r1 = "TELEMETRY_LIVE_TIMESTAMP_AFTER_END_TIMESTAMP"
            X.UUb r0 = new X.UUb     // Catch:{ all -> 0x06ce }
            r0.<init>(r1)     // Catch:{ all -> 0x06ce }
            r7.A0B(r6, r0)     // Catch:{ all -> 0x06ce }
            goto L_0x00b0
        L_0x00ca:
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d0
            long r12 = r12 - r10
            goto L_0x00e2
        L_0x00d0:
            long r2 = r0 - r10
            long r12 = r12 - r0
            java.lang.Long r0 = r7.A06     // Catch:{ all -> 0x06ce }
            if (r0 == 0) goto L_0x00f2
            long r0 = r0.longValue()     // Catch:{ all -> 0x06ce }
        L_0x00db:
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06ce }
            r7.A06 = r0     // Catch:{ all -> 0x06ce }
        L_0x00e2:
            java.lang.Long r0 = r7.A05     // Catch:{ all -> 0x06ce }
            if (r0 == 0) goto L_0x00ea
            long r8 = r0.longValue()     // Catch:{ all -> 0x06ce }
        L_0x00ea:
            long r8 = r8 + r12
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x06ce }
            r7.A05 = r0     // Catch:{ all -> 0x06ce }
            goto L_0x00b0
        L_0x00f2:
            r0 = 0
            goto L_0x00db
        L_0x00f5:
            long r12 = r12 - r10
            java.lang.Long r0 = r7.A06     // Catch:{ all -> 0x06ce }
            if (r0 == 0) goto L_0x00fe
            long r8 = r0.longValue()     // Catch:{ all -> 0x06ce }
        L_0x00fe:
            long r8 = r8 + r12
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x06ce }
            r7.A06 = r0     // Catch:{ all -> 0x06ce }
            goto L_0x00b0
        L_0x0106:
            r5 = r7
            X.UUO r5 = (X.UUO) r5     // Catch:{ all -> 0x06cb }
            X.LGZ r0 = r5.A03     // Catch:{ all -> 0x06cb }
            r22 = r0
            int r2 = r5.A00     // Catch:{ all -> 0x06cb }
            r20 = 4
            java.lang.String r19 = "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamLatencyManagerImpl"
            r8 = r0
            r0 = r19
            X.0qQ.A0C(r8, r0)     // Catch:{ all -> 0x06cb }
            X.UUQ r8 = (X.UUQ) r8     // Catch:{ all -> 0x06cb }
            r0 = r20
            if (r2 != r0) goto L_0x0122
            java.util.List r1 = r8.A01     // Catch:{ all -> 0x06cb }
            goto L_0x0124
        L_0x0122:
            java.util.List r1 = r8.A02     // Catch:{ all -> 0x06cb }
        L_0x0124:
            if (r1 != 0) goto L_0x0128
            X.0sn r1 = X.0sn.A00     // Catch:{ all -> 0x06cb }
        L_0x0128:
            java.lang.String r0 = X.C62918KoW.A01     // Catch:{ all -> 0x06cb }
            if (r0 == 0) goto L_0x06bb
            X.HO5 r0 = X.UUO.A01(r0)     // Catch:{ all -> 0x06cb }
            if (r0 == 0) goto L_0x06bb
            java.lang.String r0 = X.C62918KoW.A03     // Catch:{ all -> 0x06cb }
            if (r0 == 0) goto L_0x06b7
            X.HO4 r0 = X.UUO.A00(r0)     // Catch:{ all -> 0x06cb }
            if (r0 == 0) goto L_0x06b7
            java.lang.String r0 = X.C62918KoW.A02     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x0171
            java.lang.String r0 = "socVersion"
        L_0x0142:
            java.lang.String r2 = "Sup session end: "
            java.lang.String r1 = " is null"
            java.lang.String r3 = X.002.A0g(r2, r0, r1)     // Catch:{ all -> 0x06cb }
            X.8j2 r1 = X.C363058j1.A02     // Catch:{ all -> 0x06cb }
            java.lang.String r0 = "sup:SUPMediaStreamFalcoLoggerImpl"
            r1.A04(r0, r3, r6)     // Catch:{ all -> 0x06cb }
            java.lang.String r0 = "TELEMETRY_SUP_SESSION_END_VALIDATION_ERROR"
            X.UUb r2 = new X.UUb     // Catch:{ all -> 0x06cb }
            r2.<init>(r0)     // Catch:{ all -> 0x06cb }
            java.lang.Exception r1 = new java.lang.Exception     // Catch:{ all -> 0x06cb }
            r1.<init>(r3)     // Catch:{ all -> 0x06cb }
            X.JwJ r0 = new X.JwJ     // Catch:{ all -> 0x06cb }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ all -> 0x06cb }
            r5.A0B(r0, r2)     // Catch:{ all -> 0x06cb }
        L_0x0165:
            X.W36 r0 = r5.A01     // Catch:{ all -> 0x06cb }
            r0.A0A()     // Catch:{ all -> 0x06cb }
            X.W36 r0 = r5.A02     // Catch:{ all -> 0x06cb }
            r0.A0A()     // Catch:{ all -> 0x06cb }
            goto L_0x06c3
        L_0x0171:
            java.lang.String r0 = X.C62918KoW.A00     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x0178
            java.lang.String r0 = "buildFlavor"
            goto L_0x0142
        L_0x0178:
            java.lang.Long r0 = r5.A07     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x017f
            java.lang.String r0 = "startTimestamp"
            goto L_0x0142
        L_0x017f:
            java.lang.Long r0 = r5.A04     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x0186
            java.lang.String r0 = "endTimestamp"
            goto L_0x0142
        L_0x0186:
            java.lang.String r0 = r5.A08     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x018d
            java.lang.String r0 = "glassesSessionId"
            goto L_0x0142
        L_0x018d:
            X.7vQ r4 = X.C346587vQ.A0C     // Catch:{ all -> 0x06cb }
            java.lang.String r0 = r4.A05()     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x0198
            java.lang.String r0 = "appColdStartSessionId"
            goto L_0x0142
        L_0x0198:
            java.lang.String r0 = r4.A07()     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x01a1
            java.lang.String r0 = "warmStartSessionId"
            goto L_0x0142
        L_0x01a1:
            X.V4W r0 = r5.A05     // Catch:{ all -> 0x06cb }
            r21 = r0
            java.lang.Long r0 = r21.A02()     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x01ae
            java.lang.String r0 = "initialBatteryLevel"
            goto L_0x0142
        L_0x01ae:
            java.lang.Long r0 = r21.A01()     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x01b7
            java.lang.String r0 = "currentBatteryLevel"
            goto L_0x0142
        L_0x01b7:
            r16 = r21
            r0 = r16
            X.UUR r0 = (X.UUR) r0     // Catch:{ all -> 0x06cb }
            r16 = r0
            X.V1V r0 = r16.A04()     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x01c9
            java.lang.String r0 = "initialThermalThrottlingState"
            goto L_0x0142
        L_0x01c9:
            X.V1V r0 = r16.A03()     // Catch:{ all -> 0x06cb }
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = "currentThermalThrottlingState"
            goto L_0x0142
        L_0x01d3:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x06cb }
            if (r0 == 0) goto L_0x01dd
            java.lang.String r0 = "latencyRecords"
            goto L_0x0142
        L_0x01dd:
            int r0 = r5.A00     // Catch:{ Exception -> 0x069c }
            r10 = 6
            if (r0 == r10) goto L_0x03b6
            java.lang.Long r0 = r5.A07     // Catch:{ Exception -> 0x069c }
            r2 = 0
            if (r0 == 0) goto L_0x0240
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x069c }
        L_0x01ec:
            java.lang.Long r9 = r5.A04     // Catch:{ Exception -> 0x069c }
            if (r9 == 0) goto L_0x01f4
            long r2 = r9.longValue()     // Catch:{ Exception -> 0x069c }
        L_0x01f4:
            X.X8r r9 = r5.A01     // Catch:{ Exception -> 0x069c }
            if (r9 == 0) goto L_0x03b6
            java.lang.String r12 = X.C62918KoW.A01     // Catch:{ Exception -> 0x069c }
            if (r12 == 0) goto L_0x0201
            java.lang.String r11 = "device_type"
            r9.CmI(r10, r11, r12)     // Catch:{ Exception -> 0x069c }
        L_0x0201:
            java.lang.String r12 = X.C62918KoW.A03     // Catch:{ Exception -> 0x069c }
            if (r12 == 0) goto L_0x020a
            java.lang.String r11 = "device_build_type"
            r9.CmI(r10, r11, r12)     // Catch:{ Exception -> 0x069c }
        L_0x020a:
            java.lang.String r12 = X.C62918KoW.A02     // Catch:{ Exception -> 0x069c }
            if (r12 == 0) goto L_0x0213
            java.lang.String r11 = "soc_version"
            r9.CmI(r10, r11, r12)     // Catch:{ Exception -> 0x069c }
        L_0x0213:
            java.lang.String r12 = X.C62918KoW.A00     // Catch:{ Exception -> 0x069c }
            if (r12 == 0) goto L_0x021c
            java.lang.String r11 = "build_flavor"
            r9.CmI(r10, r11, r12)     // Catch:{ Exception -> 0x069c }
        L_0x021c:
            r12 = 7
            java.lang.String r11 = X.UUO.A03(r5)     // Catch:{ Exception -> 0x069c }
            r9.CmH(r10, r12, r11)     // Catch:{ Exception -> 0x069c }
            r12 = 8
            java.lang.String r11 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x069c }
            r9.CmH(r10, r12, r11)     // Catch:{ Exception -> 0x069c }
            r12 = 9
            java.lang.String r11 = java.lang.String.valueOf(r2)     // Catch:{ Exception -> 0x069c }
            r9.CmH(r10, r12, r11)     // Catch:{ Exception -> 0x069c }
            X.W36 r11 = r5.A02     // Catch:{ Exception -> 0x069c }
            r14 = r11
            r15 = 0
            X.UUN r14 = (X.UUN) r14     // Catch:{ Exception -> 0x069c }
            if (r14 == 0) goto L_0x0269
            monitor-enter(r11)     // Catch:{ Exception -> 0x069c }
            goto L_0x0243
        L_0x0240:
            r0 = 0
            goto L_0x01ec
        L_0x0243:
            org.json.JSONArray r12 = r14.A02     // Catch:{ all -> 0x066c }
            int r12 = r12.length()     // Catch:{ all -> 0x066c }
            if (r12 <= 0) goto L_0x0266
            org.json.JSONArray r13 = r14.A02     // Catch:{ all -> 0x066c }
            r12 = 0
            org.json.JSONObject r13 = r13.getJSONObject(r12)     // Catch:{ all -> 0x066c }
            java.lang.String r12 = "start_time_ms"
            r13.put(r12, r0)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r12 = r14.A02     // Catch:{ all -> 0x066c }
            X.C13991Tnr.A1V(r12, r2)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r12 = r14.A02     // Catch:{ all -> 0x066c }
            java.lang.String r15 = r12.toString()     // Catch:{ all -> 0x066c }
            X.0qQ.A0A(r15)     // Catch:{ all -> 0x066c }
            goto L_0x0268
        L_0x0266:
            java.lang.String r15 = ""
        L_0x0268:
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
        L_0x0269:
            java.lang.String r12 = ""
            if (r15 != 0) goto L_0x026e
            r15 = r12
        L_0x026e:
            java.lang.String r13 = "glass_phone_video"
            r9.CmI(r10, r13, r15)     // Catch:{ Exception -> 0x069c }
            if (r14 == 0) goto L_0x029d
            monitor-enter(r11)     // Catch:{ Exception -> 0x069c }
            org.json.JSONArray r13 = r14.A01     // Catch:{ all -> 0x066c }
            int r13 = r13.length()     // Catch:{ all -> 0x066c }
            if (r13 <= 0) goto L_0x0299
            org.json.JSONArray r15 = r14.A01     // Catch:{ all -> 0x066c }
            r13 = 0
            org.json.JSONObject r15 = r15.getJSONObject(r13)     // Catch:{ all -> 0x066c }
            java.lang.String r13 = "start_time_ms"
            r15.put(r13, r0)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r13 = r14.A01     // Catch:{ all -> 0x066c }
            X.C13991Tnr.A1V(r13, r2)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r13 = r14.A01     // Catch:{ all -> 0x066c }
            java.lang.String r15 = r13.toString()     // Catch:{ all -> 0x066c }
            X.0qQ.A0A(r15)     // Catch:{ all -> 0x066c }
            goto L_0x029a
        L_0x0299:
            r15 = r12
        L_0x029a:
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
            if (r15 != 0) goto L_0x029e
        L_0x029d:
            r15 = r12
        L_0x029e:
            java.lang.String r13 = "glass_phone_audio"
            r9.CmI(r10, r13, r15)     // Catch:{ Exception -> 0x069c }
            if (r14 == 0) goto L_0x02cd
            monitor-enter(r11)     // Catch:{ Exception -> 0x069c }
            org.json.JSONArray r13 = r14.A04     // Catch:{ all -> 0x066c }
            int r13 = r13.length()     // Catch:{ all -> 0x066c }
            if (r13 <= 0) goto L_0x02c9
            org.json.JSONArray r15 = r14.A04     // Catch:{ all -> 0x066c }
            r13 = 0
            org.json.JSONObject r15 = r15.getJSONObject(r13)     // Catch:{ all -> 0x066c }
            java.lang.String r13 = "start_time_ms"
            r15.put(r13, r0)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r13 = r14.A04     // Catch:{ all -> 0x066c }
            X.C13991Tnr.A1V(r13, r2)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r13 = r14.A04     // Catch:{ all -> 0x066c }
            java.lang.String r15 = r13.toString()     // Catch:{ all -> 0x066c }
            X.0qQ.A0A(r15)     // Catch:{ all -> 0x066c }
            goto L_0x02ca
        L_0x02c9:
            r15 = r12
        L_0x02ca:
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
            if (r15 != 0) goto L_0x02ce
        L_0x02cd:
            r15 = r12
        L_0x02ce:
            java.lang.String r13 = "phone_server_video"
            r9.CmI(r10, r13, r15)     // Catch:{ Exception -> 0x069c }
            if (r14 == 0) goto L_0x02fd
            monitor-enter(r11)     // Catch:{ Exception -> 0x069c }
            org.json.JSONArray r13 = r14.A03     // Catch:{ all -> 0x066c }
            int r13 = r13.length()     // Catch:{ all -> 0x066c }
            if (r13 <= 0) goto L_0x02f9
            org.json.JSONArray r15 = r14.A03     // Catch:{ all -> 0x066c }
            r13 = 0
            org.json.JSONObject r15 = r15.getJSONObject(r13)     // Catch:{ all -> 0x066c }
            java.lang.String r13 = "start_time_ms"
            r15.put(r13, r0)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r0 = r14.A03     // Catch:{ all -> 0x066c }
            X.C13991Tnr.A1V(r0, r2)     // Catch:{ all -> 0x066c }
            org.json.JSONArray r0 = r14.A03     // Catch:{ all -> 0x066c }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x066c }
            X.0qQ.A0A(r1)     // Catch:{ all -> 0x066c }
            goto L_0x02fa
        L_0x02f9:
            r1 = r12
        L_0x02fa:
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x02fe
        L_0x02fd:
            r1 = r12
        L_0x02fe:
            java.lang.String r0 = "phone_server_audio"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            X.LGZ r0 = r5.A04     // Catch:{ Exception -> 0x069c }
            X.UUP r0 = (X.UUP) r0     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x0315
            org.json.JSONArray r0 = r0.A00     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x0313
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0316
        L_0x0313:
            r1 = r12
            goto L_0x0316
        L_0x0315:
            r1 = r12
        L_0x0316:
            java.lang.String r0 = "latency"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r5.A08     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0320
            r1 = r12
        L_0x0320:
            java.lang.String r0 = "smart_glasses_stream_session_id"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            r1 = 0
            java.lang.String r0 = r4.A06()     // Catch:{ Exception -> 0x069c }
            r9.CmH(r10, r1, r0)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r4.A07()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0334
            r1 = r12
        L_0x0334:
            java.lang.String r0 = "app_warm_start_session_id"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r4.A05()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0340
            r1 = r12
        L_0x0340:
            java.lang.String r0 = "app_cold_start_session_id"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.Long r0 = r21.A02()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x0351
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0352
        L_0x0351:
            r1 = r12
        L_0x0352:
            java.lang.String r0 = "battery_level_start_pct"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.Long r0 = r21.A01()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x0363
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0364
        L_0x0363:
            r1 = r12
        L_0x0364:
            java.lang.String r0 = "battery_level_end_pct"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            X.V1V r0 = r16.A04()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x0375
            java.lang.String r1 = r0.name()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0376
        L_0x0375:
            r1 = r12
        L_0x0376:
            java.lang.String r0 = "thermal_throttling_start_state_type"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            X.V1V r0 = r16.A03()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x0387
            java.lang.String r1 = r0.name()     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x0388
        L_0x0387:
            r1 = r12
        L_0x0388:
            java.lang.String r0 = "thermal_throttling_end_state_type"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
            X.Npz r11 = r5.A07     // Catch:{ Exception -> 0x069c }
            X.UUS r11 = (X.UUS) r11     // Catch:{ Exception -> 0x069c }
            if (r11 == 0) goto L_0x039e
            monitor-enter(r11)     // Catch:{ Exception -> 0x069c }
            r11.A02()     // Catch:{ all -> 0x066c }
            org.json.JSONArray r0 = r11.A00     // Catch:{ all -> 0x066c }
            java.lang.String r12 = X.DbT.A10(r0)     // Catch:{ all -> 0x066c }
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
        L_0x039e:
            java.lang.String r0 = "uplink_attribution"
            r9.CmI(r10, r0, r12)     // Catch:{ Exception -> 0x069c }
            java.lang.Integer r0 = r4.A02()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x03b2
            java.lang.String r1 = X.C16806V6n.A00(r0)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "streaming_protocol"
            r9.CmI(r10, r0, r1)     // Catch:{ Exception -> 0x069c }
        L_0x03b2:
            r0 = 2
            r9.markerEnd(r10, r0)     // Catch:{ Exception -> 0x069c }
        L_0x03b6:
            int r1 = r5.A00     // Catch:{ Exception -> 0x069c }
            r0 = 3
            if (r1 == r0) goto L_0x0515
            r0 = r20
            if (r1 != r0) goto L_0x067e
            X.0Ae r1 = r5.A08     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "smart_glasses_call_session_end"
            X.0Aj r9 = X.C51969G9p.A0d(r1, r0)     // Catch:{ Exception -> 0x069c }
            boolean r0 = r9.isSampled()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x067e
            java.lang.Long r13 = r5.A07     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r13)     // Catch:{ Exception -> 0x069c }
            long r2 = r13.longValue()     // Catch:{ Exception -> 0x069c }
            java.lang.Long r12 = r5.A04     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r12)     // Catch:{ Exception -> 0x069c }
            long r0 = r12.longValue()     // Catch:{ Exception -> 0x069c }
            X.UGc r14 = new X.UGc     // Catch:{ Exception -> 0x069c }
            r14.<init>()     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = X.C62918KoW.A01     // Catch:{ Exception -> 0x069c }
            r11 = 0
            if (r10 == 0) goto L_0x0442
            X.HO5 r15 = X.UUO.A01(r10)     // Catch:{ Exception -> 0x069c }
        L_0x03ed:
            X.0qQ.A0A(r15)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "device_type"
            r14.A01(r15, r10)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = X.C62918KoW.A03     // Catch:{ Exception -> 0x069c }
            if (r10 == 0) goto L_0x03fd
            X.HO4 r11 = X.UUO.A00(r10)     // Catch:{ Exception -> 0x069c }
        L_0x03fd:
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "device_build_type"
            r14.A01(r11, r10)     // Catch:{ Exception -> 0x069c }
            java.lang.String r11 = X.C62918KoW.A02     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "soc_version"
            r14.A06(r10, r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r11 = X.C62918KoW.A00     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "build_flavor"
            r14.A06(r10, r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "__device"
            r9.AAK(r14, r10)     // Catch:{ Exception -> 0x069c }
            boolean r10 = r5.A0B     // Catch:{ Exception -> 0x069c }
            if (r10 == 0) goto L_0x043f
            java.lang.String r11 = "call"
        L_0x0424:
            java.lang.String r10 = "end_call_stage"
            r9.AAJ(r10, r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "stream_session_start_time_ms"
            r9.A9F(r10, r13)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "stream_session_end_time_ms"
            r9.A9F(r10, r12)     // Catch:{ Exception -> 0x069c }
            X.W36 r12 = r5.A01     // Catch:{ Exception -> 0x069c }
            r14 = r12
            java.lang.String r13 = "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamABRObserverImpl"
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            X.UUM r14 = (X.UUM) r14     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            goto L_0x0444
        L_0x043f:
            java.lang.String r11 = "ringing"
            goto L_0x0424
        L_0x0442:
            r15 = r6
            goto L_0x03ed
        L_0x0444:
            X.0eM r10 = r14.A0A     // Catch:{ all -> 0x0699 }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x0699 }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x0699 }
            X.UGe r10 = (X.C14941UGe) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x0455
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x0699 }
        L_0x0455:
            java.lang.Object r10 = X.00k.A0L(r11)     // Catch:{ all -> 0x0699 }
            X.UGe r10 = (X.C14941UGe) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x0460
            X.C13990Tnq.A14(r10, r0)     // Catch:{ all -> 0x0699 }
        L_0x0460:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "glass_phone_video"
            r9.AAe(r10, r11)     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            X.0eM r10 = r14.A09     // Catch:{ all -> 0x0699 }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x0699 }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x0699 }
            X.UGd r10 = (X.C14940UGd) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x047b
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x0699 }
        L_0x047b:
            java.lang.Object r10 = X.00k.A0L(r11)     // Catch:{ all -> 0x0699 }
            X.UGd r10 = (X.C14940UGd) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x0486
            X.C13990Tnq.A14(r10, r0)     // Catch:{ all -> 0x0699 }
        L_0x0486:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "glass_phone_audio"
            r9.AAe(r10, r11)     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            X.0eM r10 = r14.A0E     // Catch:{ all -> 0x0699 }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x0699 }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x0699 }
            X.UGh r10 = (X.C14944UGh) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x04a1
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x0699 }
        L_0x04a1:
            java.lang.Object r10 = X.00k.A0L(r11)     // Catch:{ all -> 0x0699 }
            X.UGh r10 = (X.C14944UGh) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x04ac
            X.C13990Tnq.A14(r10, r0)     // Catch:{ all -> 0x0699 }
        L_0x04ac:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "phone_server_video"
            r9.AAe(r10, r11)     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            X.0eM r10 = r14.A0D     // Catch:{ all -> 0x0699 }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x0699 }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x0699 }
            X.UGg r10 = (X.C14943UGg) r10     // Catch:{ all -> 0x0699 }
            if (r10 == 0) goto L_0x04c7
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x0699 }
        L_0x04c7:
            java.lang.Object r2 = X.00k.A0L(r11)     // Catch:{ all -> 0x0699 }
            X.UGg r2 = (X.C14943UGg) r2     // Catch:{ all -> 0x0699 }
            if (r2 == 0) goto L_0x04d2
            X.C13990Tnq.A14(r2, r0)     // Catch:{ all -> 0x0699 }
        L_0x04d2:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "phone_server_audio"
            r9.AAe(r0, r11)     // Catch:{ Exception -> 0x069c }
            r1 = r22
            r0 = r19
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x069c }
            java.util.List r1 = r8.A01     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x04e5
            X.0sn r1 = X.0sn.A00     // Catch:{ Exception -> 0x069c }
        L_0x04e5:
            java.lang.String r0 = "latency"
            r9.AAe(r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r5.A08     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "smart_glasses_stream_session_id"
            r9.AAJ(r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r4.A06()     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "app_call_session_id"
            r9.AAJ(r0, r1)     // Catch:{ Exception -> 0x069c }
            r1 = r16
            r0 = r21
            X.UUT r2 = A05(r9, r5, r1, r0, r4)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r2)     // Catch:{ Exception -> 0x069c }
            r2.A02()     // Catch:{ all -> 0x0511 }
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x0511 }
            java.util.List r1 = X.00k.A0a(r0)     // Catch:{ all -> 0x0511 }
            goto L_0x0672
        L_0x0511:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ Exception -> 0x069c }
            goto L_0x069b
        L_0x0515:
            X.0Ae r1 = r5.A08     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "smart_glasses_livestream_session_end"
            X.0Aj r9 = X.C51969G9p.A0d(r1, r0)     // Catch:{ Exception -> 0x069c }
            boolean r0 = r9.isSampled()     // Catch:{ Exception -> 0x069c }
            if (r0 == 0) goto L_0x067e
            java.lang.Long r13 = r5.A07     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r13)     // Catch:{ Exception -> 0x069c }
            long r2 = r13.longValue()     // Catch:{ Exception -> 0x069c }
            java.lang.Long r12 = r5.A04     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r12)     // Catch:{ Exception -> 0x069c }
            long r0 = r12.longValue()     // Catch:{ Exception -> 0x069c }
            X.UGj r14 = new X.UGj     // Catch:{ Exception -> 0x069c }
            r14.<init>()     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = X.C62918KoW.A01     // Catch:{ Exception -> 0x069c }
            r11 = 0
            if (r10 == 0) goto L_0x0598
            X.HO5 r15 = X.UUO.A01(r10)     // Catch:{ Exception -> 0x069c }
        L_0x0543:
            X.0qQ.A0A(r15)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "device_type"
            r14.A01(r15, r10)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = X.C62918KoW.A03     // Catch:{ Exception -> 0x069c }
            if (r10 == 0) goto L_0x0553
            X.HO4 r11 = X.UUO.A00(r10)     // Catch:{ Exception -> 0x069c }
        L_0x0553:
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "device_build_type"
            r14.A01(r11, r10)     // Catch:{ Exception -> 0x069c }
            java.lang.String r11 = X.C62918KoW.A02     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "soc_version"
            r14.A06(r10, r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r11 = X.C62918KoW.A00     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "build_flavor"
            r14.A06(r10, r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "__device"
            r9.AAK(r14, r10)     // Catch:{ Exception -> 0x069c }
            boolean r10 = r5.A0B     // Catch:{ Exception -> 0x069c }
            if (r10 == 0) goto L_0x0595
            java.lang.String r11 = "live"
        L_0x057a:
            java.lang.String r10 = "end_livestream_stage"
            r9.AAJ(r10, r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "stream_session_start_time_ms"
            r9.A9F(r10, r13)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "stream_session_end_time_ms"
            r9.A9F(r10, r12)     // Catch:{ Exception -> 0x069c }
            X.W36 r12 = r5.A01     // Catch:{ Exception -> 0x069c }
            r14 = r12
            java.lang.String r13 = "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPMediaStreamABRObserverImpl"
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            X.UUM r14 = (X.UUM) r14     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            goto L_0x059a
        L_0x0595:
            java.lang.String r11 = "in_preview"
            goto L_0x057a
        L_0x0598:
            r15 = r6
            goto L_0x0543
        L_0x059a:
            X.0eM r10 = r14.A0C     // Catch:{ all -> 0x066f }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x066f }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x066f }
            X.UGl r10 = (X.C14948UGl) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x05ab
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x066f }
        L_0x05ab:
            java.lang.Object r10 = X.00k.A0L(r11)     // Catch:{ all -> 0x066f }
            X.UGl r10 = (X.C14948UGl) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x05b6
            X.C13990Tnq.A14(r10, r0)     // Catch:{ all -> 0x066f }
        L_0x05b6:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "glass_phone_video"
            r9.AAe(r10, r11)     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            X.0eM r10 = r14.A0B     // Catch:{ all -> 0x066f }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x066f }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x066f }
            X.UGk r10 = (X.C14947UGk) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x05d1
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x066f }
        L_0x05d1:
            java.lang.Object r10 = X.00k.A0L(r11)     // Catch:{ all -> 0x066f }
            X.UGk r10 = (X.C14947UGk) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x05dc
            X.C13990Tnq.A14(r10, r0)     // Catch:{ all -> 0x066f }
        L_0x05dc:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "glass_phone_audio"
            r9.AAe(r10, r11)     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            X.0eM r10 = r14.A0G     // Catch:{ all -> 0x066f }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x066f }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x066f }
            X.UGo r10 = (X.C14951UGo) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x05f7
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x066f }
        L_0x05f7:
            java.lang.Object r10 = X.00k.A0L(r11)     // Catch:{ all -> 0x066f }
            X.UGo r10 = (X.C14951UGo) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x0602
            X.C13990Tnq.A14(r10, r0)     // Catch:{ all -> 0x066f }
        L_0x0602:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r10 = "phone_server_video"
            r9.AAe(r10, r11)     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0C(r12, r13)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r12)     // Catch:{ Exception -> 0x069c }
            X.0eM r10 = r14.A0F     // Catch:{ all -> 0x066f }
            java.util.List r11 = X.JTO.A15(r10)     // Catch:{ all -> 0x066f }
            java.lang.Object r10 = X.00k.A0J(r11)     // Catch:{ all -> 0x066f }
            X.UGn r10 = (X.C14950UGn) r10     // Catch:{ all -> 0x066f }
            if (r10 == 0) goto L_0x061d
            X.C13990Tnq.A15(r10, r2)     // Catch:{ all -> 0x066f }
        L_0x061d:
            java.lang.Object r2 = X.00k.A0L(r11)     // Catch:{ all -> 0x066f }
            X.UGn r2 = (X.C14950UGn) r2     // Catch:{ all -> 0x066f }
            if (r2 == 0) goto L_0x0628
            X.C13990Tnq.A14(r2, r0)     // Catch:{ all -> 0x066f }
        L_0x0628:
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "phone_server_audio"
            r9.AAe(r0, r11)     // Catch:{ Exception -> 0x069c }
            r1 = r22
            r0 = r19
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x069c }
            java.util.List r1 = r8.A02     // Catch:{ Exception -> 0x069c }
            if (r1 != 0) goto L_0x063b
            X.0sn r1 = X.0sn.A00     // Catch:{ Exception -> 0x069c }
        L_0x063b:
            java.lang.String r0 = "latency"
            r9.AAe(r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r5.A08     // Catch:{ Exception -> 0x069c }
            X.0qQ.A0A(r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "smart_glasses_stream_session_id"
            r9.AAJ(r0, r1)     // Catch:{ Exception -> 0x069c }
            java.lang.String r1 = r4.A06()     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "app_stream_session_id"
            r9.AAJ(r0, r1)     // Catch:{ Exception -> 0x069c }
            r1 = r16
            r0 = r21
            X.UUT r11 = A05(r9, r5, r1, r0, r4)     // Catch:{ Exception -> 0x069c }
            monitor-enter(r11)     // Catch:{ Exception -> 0x069c }
            r11.A02()     // Catch:{ all -> 0x066c }
            java.util.List r0 = r11.A02     // Catch:{ all -> 0x066c }
            java.util.List r1 = X.00k.A0a(r0)     // Catch:{ all -> 0x066c }
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "uplink_attribution"
            r9.AAe(r0, r1)     // Catch:{ Exception -> 0x069c }
            goto L_0x067b
        L_0x066c:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ Exception -> 0x069c }
            goto L_0x069b
        L_0x066f:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
            goto L_0x069b
        L_0x0672:
            monitor-exit(r2)     // Catch:{ Exception -> 0x069c }
            java.lang.String r0 = "uplink_attribution"
            r9.AAe(r0, r1)     // Catch:{ Exception -> 0x069c }
            A06(r9, r4)     // Catch:{ Exception -> 0x069c }
        L_0x067b:
            r9.Cgf()     // Catch:{ Exception -> 0x069c }
        L_0x067e:
            X.W36 r0 = r5.A01     // Catch:{ Exception -> 0x069c }
            r0.A0A()     // Catch:{ Exception -> 0x069c }
            X.W36 r0 = r5.A02     // Catch:{ Exception -> 0x069c }
            r0.A0A()     // Catch:{ Exception -> 0x069c }
            r22.A00()     // Catch:{ Exception -> 0x069c }
            X.LGZ r0 = r5.A04     // Catch:{ Exception -> 0x069c }
            r0.A00()     // Catch:{ Exception -> 0x069c }
            monitor-enter(r4)     // Catch:{ Exception -> 0x069c }
            X.C346587vQ.A09 = r6     // Catch:{ all -> 0x0696 }
            monitor-exit(r4)     // Catch:{ Exception -> 0x069c }
            goto L_0x0165
        L_0x0696:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x069c }
            goto L_0x069b
        L_0x0699:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ Exception -> 0x069c }
        L_0x069b:
            throw r0     // Catch:{ Exception -> 0x069c }
        L_0x069c:
            r3 = move-exception
            X.8j2 r2 = X.C363058j1.A02     // Catch:{ all -> 0x06cb }
            java.lang.String r1 = "sup:SUPMediaStreamFalcoLoggerImpl"
            java.lang.String r0 = "Error logging sup session end event"
            r2.A05(r1, r0, r3)     // Catch:{ all -> 0x06cb }
            java.lang.String r0 = "TELEMETRY_SUP_SESSION_END_LOGGING_ERROR"
            X.UUb r1 = new X.UUb     // Catch:{ all -> 0x06cb }
            r1.<init>(r0)     // Catch:{ all -> 0x06cb }
            X.JwJ r0 = new X.JwJ     // Catch:{ all -> 0x06cb }
            r0.<init>((java.lang.Throwable) r3)     // Catch:{ all -> 0x06cb }
            r7.A0B(r0, r1)     // Catch:{ all -> 0x06cb }
            goto L_0x0165
        L_0x06b7:
            java.lang.String r0 = "deviceBuildType"
            goto L_0x0142
        L_0x06bb:
            r0 = 2996(0xbb4, float:4.198E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x06cb }
            goto L_0x0142
        L_0x06c3:
            monitor-exit(r7)     // Catch:{ all -> 0x06ce }
            r7.A07 = r6     // Catch:{ all -> 0x06ce }
            r7.A04 = r6     // Catch:{ all -> 0x06ce }
            monitor-exit(r17)
            goto L_0x0010
        L_0x06cb:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x06ce }
            throw r0     // Catch:{ all -> 0x06ce }
        L_0x06ce:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W2Q.A0C(boolean):void");
    }

    public static UUT A05(0Aj r2, UUO uuo, UUR uur, V4W v4w, C346587vQ r6) {
        String A072 = r6.A07();
        0qQ.A0A(A072);
        r2.AAJ("app_warm_start_session_id", A072);
        String A052 = r6.A05();
        0qQ.A0A(A052);
        r2.AAJ("app_cold_start_session_id", A052);
        Long A022 = v4w.A02();
        0qQ.A0A(A022);
        r2.A9F("battery_level_start_pct", A022);
        Long A012 = v4w.A01();
        0qQ.A0A(A012);
        r2.A9F("battery_level_end_pct", A012);
        V1V A042 = uur.A04();
        0qQ.A0A(A042);
        r2.A8M(A042, "thermal_throttling_start_state_type");
        V1V A032 = uur.A03();
        0qQ.A0A(A032);
        r2.A8M(A032, "thermal_throttling_end_state_type");
        C69677Npz npz = uuo.A06;
        0qQ.A0C(npz, "null cannot be cast to non-null type com.facebook.wearable.mediastream.analytics.logging.impl.SUPNetworkStateManagerImpl");
        return (UUT) npz;
    }

    public static void A06(0Aj r2, C346587vQ r3) {
        String str;
        Integer A022 = r3.A02();
        if (A022 != null) {
            int intValue = A022.intValue();
            if (intValue == 0) {
                str = "TCP";
            } else if (intValue == 1) {
                str = "BLE";
            } else if (intValue == 2 || intValue == 4) {
                str = "BTC";
            } else if (intValue == 3) {
                str = "LINK_SWITCH";
            } else {
                throw new RuntimeException();
            }
            r2.AAJ("streaming_protocol", str);
        }
    }
}
