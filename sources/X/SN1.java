package X;

import java.util.Map;

public final class SN1 {
    public static final Map A00 = Pxe.A0N(1);
    public static final Map A01 = Pxe.A0N(1);
    public static final Map A02 = Pxe.A0N(1);
    public static final Map A03 = Pxe.A0N(1);
    public static final Map A04 = Pxe.A0N(1);

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static com.facebook.graphservice.interfaces.TreeSerializer A00() {
        /*
            java.lang.Class<com.facebook.graphservice.asset.GraphServiceAsset> r1 = com.facebook.graphservice.asset.GraphServiceAsset.class
            monitor-enter(r1)
            java.lang.String r0 = com.facebook.graphservice.asset.GraphServiceAsset.sDefaultConfigName     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0010
            com.facebook.graphservice.nativeconfigloader.GraphServiceNativeConfigLoader.loadNativeConfigs()     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = com.facebook.graphservice.asset.GraphServiceAsset.getDefaultConfigNameNative()     // Catch:{ all -> 0x0060 }
            com.facebook.graphservice.asset.GraphServiceAsset.sDefaultConfigName = r0     // Catch:{ all -> 0x0060 }
        L_0x0010:
            monitor-exit(r1)
            java.lang.Class<X.SN1> r6 = X.SN1.class
            monitor-enter(r6)
            com.facebook.graphservice.asset.GraphServiceAsset r0 = com.facebook.graphservice.asset.GraphServiceAsset.getInstance(r0)     // Catch:{ all -> 0x005d }
            com.facebook.graphservice.asset.GraphServiceAsset$GraphQLServiceConfig r0 = r0.mConfig     // Catch:{ all -> 0x005d }
            java.lang.String r5 = r0.rootBuildConfigName     // Catch:{ all -> 0x005d }
            java.util.Map r4 = A01     // Catch:{ all -> 0x005d }
            boolean r0 = r4.containsKey(r5)     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x0052
            monitor-enter(r6)     // Catch:{ all -> 0x005d }
            com.facebook.graphservice.asset.GraphServiceAsset r3 = com.facebook.graphservice.asset.GraphServiceAsset.getInstance(r5)     // Catch:{ all -> 0x0047 }
            com.facebook.graphservice.asset.GraphServiceAsset$GraphQLServiceConfig r0 = r3.mConfig     // Catch:{ all -> 0x0047 }
            java.lang.String r2 = r0.rootBuildConfigName     // Catch:{ all -> 0x0047 }
            java.util.Map r1 = A00     // Catch:{ all -> 0x0047 }
            boolean r0 = r1.containsKey(r2)     // Catch:{ all -> 0x0047 }
            if (r0 != 0) goto L_0x003d
            com.facebook.graphservice.factory.GraphQLServiceFactory r0 = new com.facebook.graphservice.factory.GraphQLServiceFactory     // Catch:{ all -> 0x0047 }
            r0.<init>(r3)     // Catch:{ all -> 0x0047 }
            r1.put(r2, r0)     // Catch:{ all -> 0x0047 }
        L_0x003d:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0047 }
            com.facebook.graphservice.factory.GraphQLServiceFactory r0 = (com.facebook.graphservice.factory.GraphQLServiceFactory) r0     // Catch:{ all -> 0x0047 }
            r0.getClass()     // Catch:{ all -> 0x0047 }
            goto L_0x004a
        L_0x0047:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x004a:
            monitor-exit(r6)     // Catch:{ all -> 0x005d }
            com.facebook.graphservice.serialization.TreeSerializerJNI r0 = r0.newTreeSerializer()     // Catch:{ all -> 0x005d }
            r4.put(r5, r0)     // Catch:{ all -> 0x005d }
        L_0x0052:
            java.lang.Object r0 = r4.get(r5)     // Catch:{ all -> 0x005d }
            com.facebook.graphservice.interfaces.TreeSerializer r0 = (com.facebook.graphservice.interfaces.TreeSerializer) r0     // Catch:{ all -> 0x005d }
            r0.getClass()     // Catch:{ all -> 0x005d }
            monitor-exit(r6)
            return r0
        L_0x005d:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SN1.A00():com.facebook.graphservice.interfaces.TreeSerializer");
    }
}
