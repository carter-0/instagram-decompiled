package com.facebook.advancedcryptotransport;

import X.0KC;
import X.1Uk;
import X.1W3;
import X.C300165we;
import android.content.Context;
import java.util.Map;

public class PlatformStorageProvider {
    public static volatile 1Uk sSharedPrefs;

    public static synchronized void initialize(Context context) {
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs == null) {
                sSharedPrefs = C300165we.A00(context);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.lang.Double} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: java.lang.Integer} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public static synchronized java.lang.Object platformStorageGetValue(java.lang.String r7) {
        /*
            java.lang.Class<com.facebook.advancedcryptotransport.PlatformStorageProvider> r6 = com.facebook.advancedcryptotransport.PlatformStorageProvider.class
            monitor-enter(r6)
            X.1Uk r0 = sSharedPrefs     // Catch:{ all -> 0x0076 }
            r1 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0065
            X.1Uk r0 = sSharedPrefs     // Catch:{ all -> 0x0076 }
            boolean r0 = r0.contains(r7)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0065
            X.1Uk r0 = sSharedPrefs     // Catch:{ RuntimeException -> 0x001c }
            int r0 = r0.getInt(r7, r1)     // Catch:{ RuntimeException -> 0x001c }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ RuntimeException -> 0x001c }
            goto L_0x0063
        L_0x001c:
            X.1Uk r0 = sSharedPrefs     // Catch:{ RuntimeException -> 0x0027 }
            boolean r0 = r0.getBoolean(r7, r1)     // Catch:{ RuntimeException -> 0x0027 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ RuntimeException -> 0x0027 }
            goto L_0x0063
        L_0x0027:
            X.1Uk r5 = sSharedPrefs     // Catch:{ RuntimeException -> 0x0050 }
            r2 = 0
            X.1Uo r5 = (X.1Uo) r5     // Catch:{ RuntimeException -> 0x0050 }
            X.1Uo.A03(r5)     // Catch:{ RuntimeException -> 0x0050 }
            java.lang.Object r1 = r5.A03     // Catch:{ RuntimeException -> 0x0050 }
            monitor-enter(r1)     // Catch:{ RuntimeException -> 0x0050 }
            java.util.Map r0 = r5.A05     // Catch:{ ClassCastException -> 0x0047 }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ ClassCastException -> 0x0047 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ ClassCastException -> 0x0047 }
            if (r0 == 0) goto L_0x0041
            double r2 = r0.doubleValue()     // Catch:{ ClassCastException -> 0x0047 }
        L_0x0041:
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            java.lang.Double r4 = java.lang.Double.valueOf(r2)     // Catch:{ RuntimeException -> 0x0050 }
            goto L_0x0063
        L_0x0047:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.1Uo.A00(r5, r0, r7)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ RuntimeException -> 0x0050 }
        L_0x0050:
            X.1Uk r2 = sSharedPrefs     // Catch:{ RuntimeException -> 0x005d }
            r0 = 0
            long r0 = r2.getLong(r7, r0)     // Catch:{ RuntimeException -> 0x005d }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ RuntimeException -> 0x005d }
            goto L_0x0063
        L_0x005d:
            X.1Uk r0 = sSharedPrefs     // Catch:{ RuntimeException -> 0x0063 }
            java.lang.String r4 = r0.getString(r7, r4)     // Catch:{ RuntimeException -> 0x0063 }
        L_0x0063:
            monitor-exit(r6)
            return r4
        L_0x0065:
            X.1Uk r0 = sSharedPrefs     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0074
            java.lang.String r2 = "PlatformStorageProvider"
            java.lang.String r1 = "sSharedPrefs not ready when platformStorageGetValue is called. key=%s"
            java.lang.Object[] r0 = new java.lang.Object[]{r7}     // Catch:{ all -> 0x0076 }
            X.0KC.A0Q(r2, r1, r0)     // Catch:{ all -> 0x0076 }
        L_0x0074:
            monitor-exit(r6)
            return r4
        L_0x0076:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.advancedcryptotransport.PlatformStorageProvider.platformStorageGetValue(java.lang.String):java.lang.Object");
    }

    public static synchronized void platformStorageRemoveValue(String str) {
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs != null && sSharedPrefs.contains(str)) {
                1W3 AR0 = sSharedPrefs.AR0();
                AR0.A06(str);
                AR0.A03();
            } else if (sSharedPrefs == null) {
                0KC.A0Q("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageRemoveValue is called. key=%s", new Object[]{str});
            }
        }
    }

    public static synchronized void platformStorageSaveValue(String str, Object obj) {
        1W3 AR0;
        synchronized (PlatformStorageProvider.class) {
            if (sSharedPrefs == null) {
                0KC.A0Q("PlatformStorageProvider", "sSharedPrefs not ready when platformStorageSaveValue is called, key=%s", new Object[]{str});
            } else {
                if (obj instanceof Integer) {
                    AR0 = sSharedPrefs.AR0();
                    AR0.A07(str, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    AR0 = sSharedPrefs.AR0();
                    AR0.A0A(str, ((Boolean) obj).booleanValue());
                } else if (obj instanceof Double) {
                    AR0 = sSharedPrefs.AR0();
                    1W3.A01(AR0);
                    Map map = AR0.A00;
                    str.getClass();
                    map.put(str, (Double) obj);
                } else if (obj instanceof Long) {
                    AR0 = sSharedPrefs.AR0();
                    AR0.A08(str, ((Long) obj).longValue());
                } else if (obj instanceof String) {
                    AR0 = sSharedPrefs.AR0();
                    AR0.A09(str, (String) obj);
                }
                AR0.A03();
            }
        }
    }
}
