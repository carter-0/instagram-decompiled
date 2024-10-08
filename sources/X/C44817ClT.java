package X;

/* renamed from: X.ClT  reason: case insensitive filesystem */
public abstract class C44817ClT {
    /* JADX WARNING: type inference failed for: r0v3, types: [X.Cur, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C45349Cur parseFromJson(X.16F r7) {
        /*
            r4 = 0
            X.0qQ.A0B(r7, r4)
            X.Cur r0 = new X.Cur     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r0.<init>()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A0D     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 == r1) goto L_0x0016
            r7.A0z()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x00e2
        L_0x0016:
            X.16L r2 = r7.A1J()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A09     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 == r1) goto L_0x00e3
            java.lang.String r2 = X.AnonymousClass7TE.A17(r7)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            java.lang.String r1 = "appMessages"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r3 = 0
            if (r1 == 0) goto L_0x0049
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 != r1) goto L_0x00d8
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
        L_0x0037:
            X.16L r2 = r7.A1J()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 == r1) goto L_0x00d8
            X.JwG r1 = X.C44812ClO.parseFromJson(r7)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r1 == 0) goto L_0x0037
            r3.add(r1)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x0037
        L_0x0049:
            java.lang.String r1 = "caller"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r1 == 0) goto L_0x0061
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 == r1) goto L_0x005d
            java.lang.String r3 = r7.A1P()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
        L_0x005d:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x00dd
        L_0x0061:
            java.lang.String r1 = "ringType"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r1 == 0) goto L_0x0094
            int r6 = r7.A0i()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r1 = 8
            java.lang.Integer[] r5 = X.AnonymousClass05K.A00(r1)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            int r3 = r5.length     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r2 = 0
        L_0x0075:
            if (r2 >= r3) goto L_0x00dd
            r1 = r5[r2]     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            int r1 = r1.intValue()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            switch(r1) {
                case 1: goto L_0x0082;
                case 2: goto L_0x0084;
                case 3: goto L_0x0086;
                case 4: goto L_0x0088;
                case 5: goto L_0x008a;
                case 6: goto L_0x008c;
                case 7: goto L_0x008e;
                default: goto L_0x0080;
            }     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
        L_0x0080:
            r1 = 0
            goto L_0x008f
        L_0x0082:
            r1 = 1
            goto L_0x008f
        L_0x0084:
            r1 = 2
            goto L_0x008f
        L_0x0086:
            r1 = 3
            goto L_0x008f
        L_0x0088:
            r1 = 4
            goto L_0x008f
        L_0x008a:
            r1 = 5
            goto L_0x008f
        L_0x008c:
            r1 = 6
            goto L_0x008f
        L_0x008e:
            r1 = -1
        L_0x008f:
            if (r1 == r6) goto L_0x00dd
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0094:
            java.lang.String r1 = "otherParticipants"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r1 == 0) goto L_0x00ba
            X.16L r2 = r7.A11()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A0C     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 != r1) goto L_0x00b4
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
        L_0x00a8:
            X.16L r2 = r7.A1J()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.16L r1 = X.16L.A08     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r2 == r1) goto L_0x00b4
            X.AnonymousClass7TG.A1F(r7, r3)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x00a8
        L_0x00b4:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r0.A02 = r3     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x00dd
        L_0x00ba:
            java.lang.String r1 = "isTransferCall"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r1 == 0) goto L_0x00c6
            r7.A0d()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x00dd
        L_0x00c6:
            java.lang.String r1 = "e2eeEnforcement"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            if (r1 == 0) goto L_0x00dd
            X.ClR r1 = X.C44816ClS.parseFromJson(r7)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            X.0qQ.A0B(r1, r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r0.A00 = r1     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x00dd
        L_0x00d8:
            X.0qQ.A0B(r3, r4)     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            r0.A01 = r3     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
        L_0x00dd:
            r7.A0z()     // Catch:{ IOException -> 0x00ea, Exception -> 0x00e4 }
            goto L_0x0016
        L_0x00e2:
            r0 = 0
        L_0x00e3:
            return r0
        L_0x00e4:
            r0 = move-exception
            X.1Pf r0 = X.AnonymousClass7TE.A0j(r0)
            throw r0
        L_0x00ea:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44817ClT.parseFromJson(X.16F):X.Cur");
    }
}
