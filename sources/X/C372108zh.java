package X;

/* renamed from: X.8zh  reason: invalid class name and case insensitive filesystem */
public abstract class C372108zh {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x00a1=Splitter:B:57:0x00a1, B:46:0x0089=Splitter:B:46:0x0089} */
    public static final X.C372098zg A00() {
        /*
            X.8zg r0 = X.C372098zg.A0F
            if (r0 != 0) goto L_0x00c2
            java.lang.Class<X.8zg> r13 = X.C372098zg.class
            monitor-enter(r13)
            X.8zg r0 = X.C372098zg.A0F     // Catch:{ all -> 0x00be }
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = "ig_mq_asset_prefs"
            X.0tX r6 = X.0xn.A01(r0)     // Catch:{ all -> 0x00be }
            java.lang.String r5 = "prefs_asset_snapshot_key"
            r4 = 0
            java.lang.String r1 = r6.getString(r5, r4)     // Catch:{ all -> 0x00be }
            if (r1 == 0) goto L_0x00b6
            int r0 = r1.length()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00b6
            X.16F r0 = X.16P.A00(r1)     // Catch:{ IOException -> 0x0093, all -> 0x0091 }
            X.8zg r8 = X.C393709ws.parseFromJson(r0)     // Catch:{ IOException -> 0x0093, all -> 0x0091 }
            r4 = r8
            if (r8 == 0) goto L_0x0089
            java.util.List r0 = r8.A07     // Catch:{ IOException -> 0x0093 }
            X.0qQ.A06(r0)     // Catch:{ IOException -> 0x0093 }
            boolean r0 = r0.isEmpty()     // Catch:{ IOException -> 0x0093 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0089
            java.util.List r0 = r8.A07     // Catch:{ IOException -> 0x0093 }
            long r1 = r8.A00     // Catch:{ IOException -> 0x0093 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x0093 }
            java.lang.String r9 = r8.A06     // Catch:{ all -> 0x0086 }
            monitor-exit(r8)     // Catch:{ IOException -> 0x0093 }
            monitor-enter(r8)     // Catch:{ IOException -> 0x0093 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0086 }
            r10.<init>()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x007a
            java.util.Iterator r12 = r0.iterator()     // Catch:{ all -> 0x0086 }
        L_0x004c:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x007a
            java.lang.Object r7 = r12.next()     // Catch:{ all -> 0x0086 }
            com.instagram.camera.effect.models.CameraAREffect r7 = (com.instagram.camera.effect.models.CameraAREffect) r7     // Catch:{ all -> 0x0086 }
            java.lang.String r11 = r7.A0K     // Catch:{ all -> 0x0086 }
            if (r11 == 0) goto L_0x004c
            java.lang.Integer r3 = r7.A09     // Catch:{ all -> 0x0086 }
            java.lang.Integer r0 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x0086 }
            if (r3 == r0) goto L_0x004c
            java.lang.String r3 = com.instagram.camera.effect.models.CameraAREffect.A00(r3)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "FOCUSV2"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x004c
            com.google.common.collect.ImmutableSet r0 = X.C372098zg.A0E     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x0086 }
            if (r0 != 0) goto L_0x004c
            r10.add(r7)     // Catch:{ all -> 0x0086 }
            goto L_0x004c
        L_0x007a:
            java.util.List r0 = java.util.Collections.unmodifiableList(r10)     // Catch:{ all -> 0x0086 }
            r8.A07 = r0     // Catch:{ all -> 0x0086 }
            r8.A00 = r1     // Catch:{ all -> 0x0086 }
            r8.A06 = r9     // Catch:{ all -> 0x0086 }
            monitor-exit(r8)     // Catch:{ IOException -> 0x0093 }
            goto L_0x00bb
        L_0x0086:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ IOException -> 0x0093 }
            throw r0     // Catch:{ IOException -> 0x0093 }
        L_0x0089:
            X.0xY r0 = r6.AR4()     // Catch:{ all -> 0x00be }
            r0.ED3(r5)     // Catch:{ all -> 0x00be }
            goto L_0x00b3
        L_0x0091:
            r1 = move-exception
            goto L_0x00a1
        L_0x0093:
            r2 = move-exception
            java.lang.String r1 = "EffectAssetSnapshot"
            java.lang.String r0 = "IOException on reading cached copy of AssetSnapshot"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x009e }
            if (r4 != 0) goto L_0x00b6
            goto L_0x00ac
        L_0x009e:
            r1 = move-exception
            if (r4 != 0) goto L_0x00ab
        L_0x00a1:
            X.0xY r0 = r6.AR4()     // Catch:{ all -> 0x00be }
            r0.ED3(r5)     // Catch:{ all -> 0x00be }
            r0.apply()     // Catch:{ all -> 0x00be }
        L_0x00ab:
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00ac:
            X.0xY r0 = r6.AR4()     // Catch:{ all -> 0x00be }
            r0.ED3(r5)     // Catch:{ all -> 0x00be }
        L_0x00b3:
            r0.apply()     // Catch:{ all -> 0x00be }
        L_0x00b6:
            X.8zg r8 = new X.8zg     // Catch:{ all -> 0x00be }
            r8.<init>()     // Catch:{ all -> 0x00be }
        L_0x00bb:
            X.C372098zg.A0F = r8     // Catch:{ all -> 0x00be }
            goto L_0x00c1
        L_0x00be:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00c1:
            monitor-exit(r13)
        L_0x00c2:
            X.8zg r0 = X.C372098zg.A0F
            if (r0 == 0) goto L_0x00c7
            return r0
        L_0x00c7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C372108zh.A00():X.8zg");
    }
}
