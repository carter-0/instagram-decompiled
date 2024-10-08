package X;

/* renamed from: X.51U  reason: invalid class name */
public abstract class AnonymousClass51U {
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.Set] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass51S parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.51S r2 = new X.51S     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r2.<init>()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x00e6
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 == r0) goto L_0x00de
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r5.A1J()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            java.lang.String r0 = "speed"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x0038
            double r3 = r5.A0U()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            float r0 = (float) r3     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r2.A00 = r0     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
        L_0x0034:
            r5.A0z()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x0016
        L_0x0038:
            java.lang.String r0 = "timer_duration_ms"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x0047
            int r0 = r5.A1D()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r2.A01 = r0     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x0034
        L_0x0047:
            java.lang.String r0 = "ghost_mode_on"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x0056
            boolean r0 = r5.A0d()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r2.A05 = r0     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x0034
        L_0x0056:
            java.lang.String r0 = "camera_tool"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r3 = 0
            if (r0 == 0) goto L_0x0089
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 != r0) goto L_0x0086
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r3.<init>()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
        L_0x006c:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 == r0) goto L_0x0086
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 == r0) goto L_0x006c
            java.lang.String r0 = r5.A1P()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x006c
            r3.add(r0)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x006c
        L_0x0086:
            r2.A04 = r3     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x0034
        L_0x0089:
            java.lang.String r0 = "camera_ar_effect_list"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00b3
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 != r0) goto L_0x00b0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r3.<init>()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
        L_0x009e:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 == r0) goto L_0x00b0
            com.instagram.camera.effect.models.CameraAREffect r0 = X.AnonymousClass515.parseFromJson(r5)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x009e
            r3.add(r0)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x009e
        L_0x00b0:
            r2.A02 = r3     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x0034
        L_0x00b3:
            java.lang.String r0 = "camera_tools_struct"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x0034
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 != r0) goto L_0x00da
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            r3.<init>()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
        L_0x00c8:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r1 == r0) goto L_0x00da
            com.instagram.feed.media.CameraToolInfo r0 = X.AnonymousClass53j.parseFromJson(r5)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 == 0) goto L_0x00c8
            r3.add(r0)     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x00c8
        L_0x00da:
            r2.A03 = r3     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            goto L_0x0034
        L_0x00de:
            int r0 = r2.A01     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            if (r0 > 0) goto L_0x00e7
            r0 = -1
            r2.A01 = r0     // Catch:{ IOException -> 0x00ef, Exception -> 0x00e8 }
            return r2
        L_0x00e6:
            r2 = 0
        L_0x00e7:
            return r2
        L_0x00e8:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51U.parseFromJson(X.16F):X.51S");
    }
}
