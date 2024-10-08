package X;

/* renamed from: X.KxN  reason: case insensitive filesystem */
public abstract class C63458KxN {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.tagging.api.model.MediaSuggestedProductTag, java.lang.Object, com.instagram.tagging.model.Tag] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.tagging.api.model.MediaSuggestedProductTag parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            com.instagram.tagging.api.model.MediaSuggestedProductTag r1 = new com.instagram.tagging.api.model.MediaSuggestedProductTag     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r1.<init>()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0015
            r4.A0z()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0093
        L_0x0015:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0094
            java.lang.String r2 = X.AnonymousClass7TE.A17(r4)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            java.lang.String r0 = "product_items"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r3 = 0
            if (r0 == 0) goto L_0x004b
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 != r0) goto L_0x0048
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x0036:
            X.16L r2 = r4.A1J()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0048
            com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer r0 = X.C63457KxM.parseFromJson(r4)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0036
            r3.add(r0)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0036
        L_0x0048:
            r1.A02 = r3     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x005d
        L_0x004b:
            r0 = 3030(0xbd6, float:4.246E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0061
            android.graphics.PointF r0 = X.C273894nM.A00(r4)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r1.A00 = r0     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x005d:
            r4.A0z()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x0015
        L_0x0061:
            java.lang.String r0 = "tag_mode"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x0084
            X.16L r2 = r4.A11()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r2 == r0) goto L_0x0075
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x0075:
            java.util.Map r0 = X.C62565Khv.A01     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            X.Khv r0 = (X.C62565Khv) r0     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 != 0) goto L_0x0081
            X.Khv r0 = X.C62565Khv.A06     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
        L_0x0081:
            r1.A01 = r0     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x005d
        L_0x0084:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r2)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            if (r0 == 0) goto L_0x005d
            android.graphics.PointF r0 = X.C273894nM.A00(r4)     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            r1.A00 = r0     // Catch:{ IOException -> 0x009b, Exception -> 0x0095 }
            goto L_0x005d
        L_0x0093:
            r1 = 0
        L_0x0094:
            return r1
        L_0x0095:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x009b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63458KxN.parseFromJson(X.16F):com.instagram.tagging.api.model.MediaSuggestedProductTag");
    }
}
