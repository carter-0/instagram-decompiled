package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5Hw  reason: invalid class name and case insensitive filesystem */
public final class C283485Hw {
    public int A00 = 0;
    public C283505Hy A01 = new C283505Hy();
    public C283495Hx A02 = new C283495Hx();
    public Map A03 = new HashMap();
    public boolean A04 = false;
    public int[] A05 = null;

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00de, code lost:
        if (r1 == 2) goto L_0x00e0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.io.InputStream r24, java.io.InputStream r25, int r26) {
        /*
            r23 = this;
            r3 = r23
            r0 = r26
            r3.A00 = r0
            java.nio.channels.ReadableByteChannel r6 = java.nio.channels.Channels.newChannel(r24)     // Catch:{ IOException -> 0x00a1 }
            X.5Hy r0 = X.C283515Hz.A00(r6)     // Catch:{ all -> 0x0095 }
            r3.A01 = r0     // Catch:{ all -> 0x0095 }
            int r0 = r0.A00     // Catch:{ all -> 0x0095 }
            if (r0 <= 0) goto L_0x008f
            int r0 = r0 * 2
            int[] r0 = X.C283515Hz.A03(r6, r0)     // Catch:{ all -> 0x0095 }
            r3.A05 = r0     // Catch:{ all -> 0x0095 }
            if (r25 == 0) goto L_0x0088
            java.lang.String r0 = X.C283515Hz.A01(r25)     // Catch:{ all -> 0x0095 }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0078 }
            r11.<init>(r0)     // Catch:{ JSONException -> 0x0078 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ JSONException -> 0x0078 }
            r10.<init>()     // Catch:{ JSONException -> 0x0078 }
            r12 = 0
            r9 = 0
        L_0x002e:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x0078 }
            if (r9 >= r0) goto L_0x008d
            java.lang.String r1 = r11.getString(r9)     // Catch:{ JSONException -> 0x0078 }
            if (r1 == 0) goto L_0x0075
            java.lang.String r0 = ":"
            java.lang.String[] r8 = r1.split(r0)     // Catch:{ JSONException -> 0x0078 }
            r0 = r8[r12]     // Catch:{ JSONException -> 0x0078 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ JSONException -> 0x0078 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0078 }
            r0 = 1
            r1 = r8[r0]     // Catch:{ JSONException -> 0x0078 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ JSONException -> 0x0078 }
            r5.<init>()     // Catch:{ JSONException -> 0x0078 }
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0078 }
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x0078 }
            r4 = 2
        L_0x005b:
            int r0 = r8.length     // Catch:{ JSONException -> 0x0078 }
            if (r4 >= r0) goto L_0x0072
            r0 = r8[r4]     // Catch:{ JSONException -> 0x0078 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ JSONException -> 0x0078 }
            int r0 = r4 + 1
            r1 = r8[r0]     // Catch:{ JSONException -> 0x0078 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0078 }
            r5.put(r0, r1)     // Catch:{ JSONException -> 0x0078 }
            int r4 = r4 + 2
            goto L_0x005b
        L_0x0072:
            r10.put(r7, r5)     // Catch:{ JSONException -> 0x0078 }
        L_0x0075:
            int r9 = r9 + 1
            goto L_0x002e
        L_0x0078:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "ParamsMapParser"
            X.0KC.A0F(r0, r1, r2)     // Catch:{ all -> 0x0095 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0095 }
            r10.<init>()     // Catch:{ all -> 0x0095 }
            goto L_0x008d
        L_0x0088:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x0095 }
            r10.<init>()     // Catch:{ all -> 0x0095 }
        L_0x008d:
            r3.A03 = r10     // Catch:{ all -> 0x0095 }
        L_0x008f:
            if (r6 == 0) goto L_0x00a9
            r6.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a9
        L_0x0095:
            r1 = move-exception
            if (r6 == 0) goto L_0x00a0
            r6.close()     // Catch:{ all -> 0x009c }
            goto L_0x00a0
        L_0x009c:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x00a1 }
        L_0x00a0:
            throw r1     // Catch:{ IOException -> 0x00a1 }
        L_0x00a1:
            r2 = move-exception
            java.lang.String r1 = "ParamsMapParser"
            java.lang.String r0 = "Failed to load params map due to exception"
            X.0KC.A0F(r1, r0, r2)
        L_0x00a9:
            java.lang.String r1 = "ParamsMapParser"
            int[] r0 = r3.A05
            if (r0 == 0) goto L_0x017a
            X.5Hx r1 = r3.A02
            X.5Hy r0 = r3.A01
            java.lang.String r0 = r0.A01
            r1.A00 = r0
            r14 = -1
            r4 = 0
            r2 = 0
            r1 = 0
        L_0x00bb:
            int[] r8 = r3.A05
            int r0 = r8.length
            if (r4 >= r0) goto L_0x017f
            int r0 = r4 + 1
            r0 = r8[r0]
            int r5 = r0 >>> 12
            r13 = r0 & 4095(0xfff, float:5.738E-42)
            r0 = r8[r4]
            int r0 = r0 >> 9
            r10 = r0 & 127(0x7f, float:1.78E-43)
            r7 = r10 & 2
            r6 = 1
            int r7 = r7 >> r6
            r0 = 2
            if (r5 == r2) goto L_0x00e5
            int r14 = r14 + 1
            int r1 = r3.A00
            if (r1 == 0) goto L_0x00e0
            if (r1 == r6) goto L_0x00e0
            r2 = r5
            if (r1 != r0) goto L_0x00e5
        L_0x00e0:
            r2 = r5
            r1 = 2
            if (r7 <= 0) goto L_0x00e5
            r1 = 1
        L_0x00e5:
            r7 = r8[r4]
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r7
            int r16 = r0 >> 16
            r0 = r7 & 14336(0x3800, float:2.0089E-41)
            int r17 = r0 >> 11
            r9 = r10 & 32
            if (r9 == 0) goto L_0x00f8
            boolean r0 = r3.A04
            if (r0 == 0) goto L_0x0174
        L_0x00f8:
            java.util.Map r0 = r3.A03
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            boolean r0 = r0.containsKey(r8)
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0178
            java.util.Map r0 = r3.A03
            java.lang.Object r7 = r0.get(r8)
            java.util.Map r7 = (java.util.Map) r7
            r7.getClass()
            r0 = -2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r11 = r7.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            r11.getClass()
        L_0x011f:
            java.util.Map r0 = r3.A03
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L_0x014d
            java.util.Map r0 = r3.A03
            java.lang.Object r0 = r0.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            r0.getClass()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x014d
            java.util.Map r0 = r3.A03
            java.lang.Object r0 = r0.get(r8)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r12 = r0.get(r7)
            java.lang.String r12 = (java.lang.String) r12
            r12.getClass()
        L_0x014d:
            int r0 = r10 % 2
            r20 = 0
            if (r0 != r6) goto L_0x0155
            r20 = 1
        L_0x0155:
            int r0 = r10 >> 6
            r21 = 0
            if (r0 != r6) goto L_0x015d
            r21 = 1
        L_0x015d:
            r22 = 0
            if (r9 <= 0) goto L_0x0163
            r22 = 1
        L_0x0163:
            X.5I0 r10 = new X.5I0
            r15 = r13
            r19 = r5
            r18 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            X.5Hx r0 = r3.A02
            java.util.List r0 = r0.A01
            r0.add(r10)
        L_0x0174:
            int r4 = r4 + 2
            goto L_0x00bb
        L_0x0178:
            r11 = r12
            goto L_0x011f
        L_0x017a:
            java.lang.String r0 = "Failed to load base params_map v4"
            X.0KC.A0C(r1, r0)
        L_0x017f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283485Hw.A00(java.io.InputStream, java.io.InputStream, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r4 = ""
            r5 = 0
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0028 }
            r0.<init>(r7)     // Catch:{ IOException -> 0x0028 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0028 }
            r1 = 2
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x001e }
            r2.read(r0)     // Catch:{ all -> 0x001e }
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x001e }
            r3.<init>(r0, r5, r1)     // Catch:{ all -> 0x001e }
            r2.close()     // Catch:{ IOException -> 0x001c }
            goto L_0x0031
        L_0x001c:
            r2 = move-exception
            goto L_0x002a
        L_0x001e:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0023 }
            goto L_0x0027
        L_0x0023:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x0028 }
        L_0x0027:
            throw r1     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            r3 = r4
        L_0x002a:
            java.lang.String r1 = "ParamsMapParser"
            java.lang.String r0 = "could not read param map file to verify version from header"
            X.0KC.A0F(r1, r0, r2)
        L_0x0031:
            java.lang.String r0 = "v4"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0047
            boolean r0 = r3.equals(r4)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = "_v4_u"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x00ca
        L_0x0047:
            java.io.File r3 = new java.io.File
            r3.<init>(r7)
            java.lang.String r2 = r3.getName()
            java.lang.String r1 = "params_map"
            java.lang.String r0 = "params_names"
            java.lang.String r2 = r2.replace(r1, r0)
            java.lang.String r0 = r3.getParent()
            if (r0 == 0) goto L_0x006b
            java.lang.String r1 = r3.getParent()
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.lang.String r4 = r0.toString()
        L_0x006b:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0077
            r4 = 0
        L_0x0077:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            java.lang.String r3 = r0.getName()
            java.lang.String r0 = "params_map.txt"
            boolean r0 = r3.equals(r0)
            r2 = 0
            if (r0 != 0) goto L_0x00af
            java.lang.String r0 = "_kMobileConfigAdminId"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0093
            r2 = 4
            goto L_0x00af
        L_0x0093:
            java.lang.String r1 = "_u"
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x00af
            int r0 = r3.indexOf(r1)
            int r1 = r0 + 2
            java.lang.String r0 = ".txt"
            int r0 = r3.indexOf(r0)
            java.lang.String r0 = r3.substring(r1, r0)
            int r2 = java.lang.Integer.parseInt(r0)
        L_0x00af:
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c1 }
            r1.<init>(r7)     // Catch:{ IOException -> 0x00c1 }
            if (r4 != 0) goto L_0x00b8
            r0 = 0
            goto L_0x00bd
        L_0x00b8:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00c1 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x00c1 }
        L_0x00bd:
            r6.A00(r1, r0, r2)     // Catch:{ IOException -> 0x00c1 }
            return
        L_0x00c1:
            r2 = move-exception
            java.lang.String r1 = "ParamsMapParser"
            java.lang.String r0 = "Failed to parse params map V4 by paths"
            X.0KC.A0F(r1, r0, r2)
            return
        L_0x00ca:
            X.5Hx r0 = new X.5Hx
            r0.<init>()
            r6.A02 = r0
            java.lang.String r3 = "FileParsingUtils"
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x00f5 }
            r0.<init>(r7)     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x00f5 }
            java.lang.String r2 = X.C283515Hz.A01(r0)     // Catch:{ all -> 0x00e0 }
            r0.close()     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x00f5 }
            goto L_0x0100
        L_0x00e0:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x00e5 }
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x00f5 }
        L_0x00e9:
            throw r1     // Catch:{ FileNotFoundException -> 0x00ea, IOException -> 0x00f5 }
        L_0x00ea:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "getFileContentAsString: failed. File does not exist: %s "
            X.0KC.A0M(r3, r0, r2, r1)
            goto L_0x00ff
        L_0x00f5:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "getFileContentAsString: failed for path: %s "
            X.0KC.A0N(r3, r0, r2, r1)
        L_0x00ff:
            r2 = r4
        L_0x0100:
            X.5Hx r1 = r6.A02
            boolean r0 = r6.A04
            X.5Hx r0 = X.C69708NqU.A00(r2, r0)
            java.util.List r0 = r0.A01
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C283485Hw.A01(java.lang.String):void");
    }
}
