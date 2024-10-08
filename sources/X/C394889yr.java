package X;

/* renamed from: X.9yr  reason: invalid class name and case insensitive filesystem */
public abstract class C394889yr {
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.8Yx] */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C388649oA parseFromJson(X.16F r5) {
        /*
            r0 = 0
            X.0qQ.A0B(r5, r0)
            X.9oA r0 = new X.9oA     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            r0.<init>()     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            X.16L r2 = r5.A11()     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            if (r2 == r1) goto L_0x0015
            r5.A0z()     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            goto L_0x004d
        L_0x0015:
            X.16L r2 = r5.A1J()     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            if (r2 == r1) goto L_0x004e
            java.lang.String r2 = X.AnonymousClass7TE.A17(r5)     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            java.lang.String r1 = "sourceEffect"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r5.A1P()     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0046 }
            r2.<init>(r1)     // Catch:{ JSONException -> 0x0046 }
            java.lang.String r1 = "processingAmount"
            double r3 = r2.getDouble(r1)     // Catch:{ JSONException -> 0x0046 }
            float r2 = (float) r3     // Catch:{ JSONException -> 0x0046 }
            X.8Yx r1 = new X.8Yx     // Catch:{ JSONException -> 0x0046 }
            r1.<init>()     // Catch:{ JSONException -> 0x0046 }
            r1.A00 = r2     // Catch:{ JSONException -> 0x0046 }
            r0.A00 = r1     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
        L_0x0042:
            r5.A0z()     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            goto L_0x0015
        L_0x0046:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
            throw r0     // Catch:{ IOException -> 0x0055, Exception -> 0x004f }
        L_0x004d:
            r0 = 0
        L_0x004e:
            return r0
        L_0x004f:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x0055:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C394889yr.parseFromJson(X.16F):X.9oA");
    }
}
