package X;

/* renamed from: X.7cO  reason: invalid class name and case insensitive filesystem */
public final class C335107cO {
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C335097cN parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.7cN r4 = new X.7cN     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r4.<init>()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 == r0) goto L_0x0016
            r5.A0z()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r4 = 0
            return r4
        L_0x0016:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 == r0) goto L_0x00a9
            java.lang.String r1 = r5.A0q()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r5.A1J()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            java.lang.String r0 = "m21_media_ids"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r2 = 0
            if (r0 == 0) goto L_0x0058
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 != r0) goto L_0x0055
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r2.<init>()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
        L_0x003b:
            X.16L r1 = r5.A1J()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 == r0) goto L_0x0055
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 == r0) goto L_0x003b
            java.lang.String r0 = r5.A1P()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x003b
            r2.add(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            goto L_0x003b
        L_0x0055:
            r4.A03 = r2     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            goto L_0x007a
        L_0x0058:
            java.lang.String r0 = "nudge_type"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x007e
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 == r0) goto L_0x006c
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
        L_0x006c:
            java.util.Map r0 = com.instagram.api.schemas.NudgeType.A01     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            com.instagram.api.schemas.NudgeType r0 = (com.instagram.api.schemas.NudgeType) r0     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r0 != 0) goto L_0x0078
            com.instagram.api.schemas.NudgeType r0 = com.instagram.api.schemas.NudgeType.UNRECOGNIZED     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
        L_0x0078:
            r4.A01 = r0     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
        L_0x007a:
            r5.A0z()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            goto L_0x0016
        L_0x007e:
            r0 = 1013(0x3f5, float:1.42E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r0 == 0) goto L_0x00a5
            X.16L r1 = r5.A11()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r1 == r0) goto L_0x0096
            java.lang.String r2 = r5.A1P()     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
        L_0x0096:
            java.util.Map r0 = com.instagram.api.schemas.NudgeVisualType.A01     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            com.instagram.api.schemas.NudgeVisualType r0 = (com.instagram.api.schemas.NudgeVisualType) r0     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            if (r0 != 0) goto L_0x00a2
            com.instagram.api.schemas.NudgeVisualType r0 = com.instagram.api.schemas.NudgeVisualType.UNRECOGNIZED     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
        L_0x00a2:
            r4.A02 = r0     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            goto L_0x007a
        L_0x00a5:
            X.1XY.A01(r5, r4, r1)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            goto L_0x007a
        L_0x00a9:
            java.util.List r3 = r4.A03     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            com.instagram.api.schemas.NudgeType r2 = r4.A01     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            com.instagram.api.schemas.NudgeVisualType r1 = r4.A02     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            X.7dD r0 = new X.7dD     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r0.<init>(r2, r1, r3)     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            r4.A00 = r0     // Catch:{ IOException -> 0x00be, Exception -> 0x00b7 }
            return r4
        L_0x00b7:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x00be:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C335107cO.parseFromJson(X.16F):X.7cN");
    }
}
