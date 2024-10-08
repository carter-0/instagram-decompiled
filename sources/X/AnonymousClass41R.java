package X;

/* renamed from: X.41R  reason: invalid class name */
public abstract class AnonymousClass41R {
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r5.length() == 0) goto L_0x00cc;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.AnonymousClass21R r19, java.util.concurrent.ConcurrentHashMap r20) {
        /*
            java.lang.String r17 = "ExceptionToken"
            java.lang.String r16 = "DebugException"
            java.lang.String r8 = "path"
            r0 = 0
            r1 = r20
            X.0qQ.A0B(r1, r0)
            boolean r0 = r1.isEmpty()
            java.lang.String r14 = ""
            if (r0 != 0) goto L_0x011f
            r6 = 817897212(0x30c01efc, float:1.3978645E-9)
            r7 = r19
            java.io.StringWriter r11 = new java.io.StringWriter     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r11.<init>()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            X.15p r9 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            X.17W r10 = r9.A0A(r11)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r10.A0c()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x002f:
            boolean r0 = r13.hasNext()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r13.next()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            X.41T r4 = (X.AnonymousClass41T) r4     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.io.StringWriter r3 = new java.io.StringWriter     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r3.<init>()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            X.17W r2 = r9.A0A(r3)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r2.A0c()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r1 = r4.A03     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = "adID"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x005c:
            java.lang.String r1 = r4.A05     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "packageName"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x0065:
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = "deepLinkURI"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x006e:
            X.Tj0 r0 = r4.A02     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r0 = "postAppInstallCallback"
            r2.A0q(r0)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r2.A0a()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x007a:
            java.lang.String r1 = r4.A08     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r1 == 0) goto L_0x0083
            java.lang.String r0 = "trackingToken"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x0083:
            long r0 = r4.A0B     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r12 = "trackingTime"
            r2.A0Q(r12, r0)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r1 = r4.A06     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r1 == 0) goto L_0x0093
            java.lang.String r0 = "sponsoredTrackingToken"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x0093:
            boolean r1 = r4.A09     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r0 = "isInstalled"
            r2.A0S(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            long r0 = r4.A00     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r12 = "installedTime"
            r2.A0Q(r12, r0)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            long r0 = r4.A01     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r12 = "openTime"
            r2.A0Q(r12, r0)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            boolean r1 = r4.A0A     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r0 = "receivedOnForeground"
            r2.A0S(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r1 = r4.A07     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r0 = "storeInterface"
            r2.A0R(r0, r1)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
        L_0x00b8:
            r2.A0Z()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r2.close()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r2 = 0
            if (r5 == 0) goto L_0x00cc
            int r1 = r5.length()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r0 = 0
            if (r1 != 0) goto L_0x00cd
        L_0x00cc:
            r0 = 1
        L_0x00cd:
            if (r0 != 0) goto L_0x002f
            if (r3 == 0) goto L_0x00d7
            int r0 = r3.length()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            if (r0 != 0) goto L_0x00d8
        L_0x00d7:
            r2 = 1
        L_0x00d8:
            if (r2 != 0) goto L_0x002f
            r10.A0R(r5, r3)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            goto L_0x002f
        L_0x00df:
            r10.A0Z()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            r10.close()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            java.lang.String r0 = r11.toString()     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            X.0qQ.A07(r0)     // Catch:{ IOException -> 0x00ed, 1bD -> 0x00f7 }
            return r0
        L_0x00ed:
            r2 = move-exception
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = r2.getMessage()
            java.lang.String r18 = "IOException during serialization"
            goto L_0x0100
        L_0x00f7:
            r2 = move-exception
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = r2.getMessage()
            java.lang.String r18 = "JsonParseException during serialization"
        L_0x0100:
            if (r0 != 0) goto L_0x0104
            r0 = r18
        L_0x0104:
            X.0f9 r1 = r1.AEf(r0, r6)
            java.lang.String r0 = X.2Og.A00(r2)
            r1.ABQ(r8, r0)
            r1.report()
            if (r19 == 0) goto L_0x011f
            java.lang.String r19 = r2.toString()
            X.215 r15 = r7.A00
            java.lang.String r20 = "store_interface_unknown"
            X.215.A04(r15, r16, r17, r18, r19, r20)
        L_0x011f:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass41R.A00(X.21R, java.util.concurrent.ConcurrentHashMap):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r2.length() == 0) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.concurrent.ConcurrentHashMap A01(X.AnonymousClass21R r12, java.lang.String r13) {
        /*
            java.lang.String r9 = "ExceptionToken"
            java.lang.String r8 = "DebugException"
            java.lang.String r3 = "path"
            r0 = 0
            X.0qQ.A0B(r13, r0)
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap
            r6.<init>()
            int r1 = r13.length()
            if (r1 != 0) goto L_0x0016
            r0 = 1
        L_0x0016:
            if (r0 != 0) goto L_0x0097
            r4 = 817897212(0x30c01efc, float:1.3978645E-9)
            X.15p r0 = X.AnonymousClass15o.A00     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            X.16F r7 = r0.A03(r13)     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
        L_0x0021:
            X.16L r1 = r7.A11()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            if (r1 == r0) goto L_0x0097
            java.lang.String r5 = r7.A0q()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            if (r5 == 0) goto L_0x0061
            X.16L r0 = X.16L.A0A     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            if (r1 != r0) goto L_0x0061
            r7.A1J()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            java.lang.String r2 = r7.A1P()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            r7.A1J()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            int r1 = r5.length()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            r0 = 0
            if (r1 != 0) goto L_0x0045
            r0 = 1
        L_0x0045:
            if (r0 != 0) goto L_0x0021
            if (r2 == 0) goto L_0x0050
            int r1 = r2.length()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            r0 = 0
            if (r1 != 0) goto L_0x0051
        L_0x0050:
            r0 = 1
        L_0x0051:
            if (r0 != 0) goto L_0x0021
            X.16F r0 = X.16P.A00(r2)     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            X.41T r0 = X.AnonymousClass41S.parseFromJson(r0)     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            if (r0 == 0) goto L_0x0021
            r6.put(r5, r0)     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            goto L_0x0021
        L_0x0061:
            r7.A1J()     // Catch:{ IOException -> 0x006f, 1bD -> 0x0065 }
            goto L_0x0021
        L_0x0065:
            r2 = move-exception
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = r2.getMessage()
            java.lang.String r10 = "JsonParseException during deserialization"
            goto L_0x0078
        L_0x006f:
            r2 = move-exception
            X.0wj r1 = X.0wj.A01
            java.lang.String r0 = r2.getMessage()
            java.lang.String r10 = "IOException during deserialization"
        L_0x0078:
            if (r0 != 0) goto L_0x007b
            r0 = r10
        L_0x007b:
            X.0f9 r1 = r1.AEf(r0, r4)
            java.lang.String r0 = X.2Og.A00(r2)
            r1.ABQ(r3, r0)
            r1.report()
            if (r12 == 0) goto L_0x0096
            java.lang.String r11 = r2.toString()
            X.215 r7 = r12.A00
            java.lang.String r12 = "store_interface_unknown"
            X.215.A04(r7, r8, r9, r10, r11, r12)
        L_0x0096:
            throw r2
        L_0x0097:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass41R.A01(X.21R, java.lang.String):java.util.concurrent.ConcurrentHashMap");
    }
}
