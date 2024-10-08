package X;

/* renamed from: X.4VI  reason: invalid class name */
public abstract class AnonymousClass4VI {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass4VB parseFromJson(X.16F r4) {
        /*
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.4VB r2 = new X.4VB     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0D     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x0016
            r4.A0z()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x019a
        L_0x0016:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A09     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x0154
            java.lang.String r1 = r4.A0q()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.String r0 = "userId"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r3 = 0
            if (r0 == 0) goto L_0x0040
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x003a
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x003a:
            r2.A02 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x003c:
            r4.A0z()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x0016
        L_0x0040:
            java.lang.String r0 = "promotionId"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x0057
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0G     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x0054
            java.lang.String r3 = r4.A1P()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x0054:
            r2.A01 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x0057:
            java.lang.String r0 = "primaryActionTimes"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x0085
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 != r0) goto L_0x0082
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r3.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x006c:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x0082
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x006c
            r3.add(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x006c
        L_0x0082:
            r2.A05 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x0085:
            java.lang.String r0 = "secondaryActionTimes"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x00b3
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 != r0) goto L_0x00b0
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r3.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x009a:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x00b0
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x009a
            r3.add(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x009a
        L_0x00b0:
            r2.A06 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x00b3:
            java.lang.String r0 = "dismissActionTimes"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x00e2
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 != r0) goto L_0x00de
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r3.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x00c8:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x00de
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x00c8
            r3.add(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x00c8
        L_0x00de:
            r2.A04 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x00e2:
            java.lang.String r0 = "impressionTimes"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x0111
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 != r0) goto L_0x010d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r3.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x00f7:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x010d
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x00f7
            r3.add(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x00f7
        L_0x010d:
            r2.A03 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x0111:
            java.lang.String r0 = "totalDismissTimes"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x0140
            X.16L r1 = r4.A11()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A0C     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 != r0) goto L_0x013c
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r3.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x0126:
            X.16L r1 = r4.A1J()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            X.16L r0 = X.16L.A08     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r1 == r0) goto L_0x013c
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x0126
            r3.add(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x0126
        L_0x013c:
            r2.A07 = r3     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x0140:
            java.lang.String r0 = "endTime"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x003c
            long r0 = r4.A0y()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.A00 = r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x003c
        L_0x0154:
            java.lang.String r0 = r2.A02     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r2.A01     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x01a8
            java.lang.Long r0 = r2.A00     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 == 0) goto L_0x019c
            java.util.List r0 = r2.A05     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 != 0) goto L_0x016d
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.A05 = r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x016d:
            java.util.List r0 = r2.A06     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 != 0) goto L_0x0178
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.A06 = r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x0178:
            java.util.List r0 = r2.A04     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 != 0) goto L_0x0183
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.A04 = r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x0183:
            java.util.List r0 = r2.A03     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 != 0) goto L_0x018e
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.A03 = r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x018e:
            java.util.List r0 = r2.A07     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            if (r0 != 0) goto L_0x019b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>()     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r2.A07 = r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            return r2
        L_0x019a:
            r2 = 0
        L_0x019b:
            return r2
        L_0x019c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x01ad
        L_0x01a2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            goto L_0x01ad
        L_0x01a8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
            r0.<init>(r1)     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x01ad:
            throw r0     // Catch:{ IOException -> 0x01b5, Exception -> 0x01ae }
        L_0x01ae:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x01b5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VI.parseFromJson(X.16F):X.4VB");
    }

    public static void A00(17Z r3, AnonymousClass4VB r4) {
        r3.A0c();
        String str = r4.A02;
        if (str != null) {
            r3.A0R("userId", str);
        }
        String str2 = r4.A01;
        if (str2 != null) {
            r3.A0R("promotionId", str2);
        }
        if (r4.A05 != null) {
            16P.A03(r3, "primaryActionTimes");
            for (Number number : r4.A05) {
                if (number != null) {
                    r3.A0h(number.longValue());
                }
            }
            r3.A0Y();
        }
        if (r4.A06 != null) {
            16P.A03(r3, "secondaryActionTimes");
            for (Number number2 : r4.A06) {
                if (number2 != null) {
                    r3.A0h(number2.longValue());
                }
            }
            r3.A0Y();
        }
        if (r4.A04 != null) {
            16P.A03(r3, "dismissActionTimes");
            for (Number number3 : r4.A04) {
                if (number3 != null) {
                    r3.A0h(number3.longValue());
                }
            }
            r3.A0Y();
        }
        if (r4.A03 != null) {
            16P.A03(r3, "impressionTimes");
            for (Number number4 : r4.A03) {
                if (number4 != null) {
                    r3.A0h(number4.longValue());
                }
            }
            r3.A0Y();
        }
        if (r4.A07 != null) {
            16P.A03(r3, "totalDismissTimes");
            for (Number number5 : r4.A07) {
                if (number5 != null) {
                    r3.A0h(number5.longValue());
                }
            }
            r3.A0Y();
        }
        Long l = r4.A00;
        if (l != null) {
            r3.A0Q("endTime", l.longValue());
        }
        r3.A0Z();
    }
}
