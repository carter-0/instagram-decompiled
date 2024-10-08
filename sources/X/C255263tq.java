package X;

/* renamed from: X.3tq  reason: invalid class name and case insensitive filesystem */
public abstract class C255263tq {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.direct.smartsuggestion.model.SmartSuggestion parseFromJson(X.16F r9) {
        /*
            r7 = 0
            X.0qQ.A0B(r9, r7)
            com.instagram.direct.smartsuggestion.model.SmartSuggestion r0 = new com.instagram.direct.smartsuggestion.model.SmartSuggestion     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r0.<init>()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r6 = X.16L.A0D     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == r6) goto L_0x0016
            r9.A0z()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0136
        L_0x0016:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r8 = X.16L.A09     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == r8) goto L_0x0137
            java.lang.String r2 = r9.A0q()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r9.A1J()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            java.lang.String r1 = "type"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r5 = 0
            if (r1 == 0) goto L_0x0056
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r2 == r1) goto L_0x003a
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x003a:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r1 = 7
            java.lang.Integer[] r8 = X.AnonymousClass05K.A00(r1)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            int r4 = r8.length     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r3 = 0
            goto L_0x0047
        L_0x0045:
            int r3 = r3 + 1
        L_0x0047:
            if (r3 >= r4) goto L_0x012a
            r2 = r8[r3]     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            java.lang.String r1 = X.C255293tt.A00(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            boolean r1 = X.0qQ.A0K(r1, r5)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 != 0) goto L_0x012c
            goto L_0x0045
        L_0x0056:
            java.lang.String r1 = "source"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x0089
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r2 == r1) goto L_0x006a
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x006a:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.3tr[] r8 = X.C255273tr.values()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            int r4 = r8.length     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r3 = 0
            goto L_0x0076
        L_0x0074:
            int r3 = r3 + 1
        L_0x0076:
            if (r3 >= r4) goto L_0x0083
            r2 = r8[r3]     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            java.lang.String r1 = r2.A01     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            boolean r1 = X.0qQ.A0K(r1, r5)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 != 0) goto L_0x0085
            goto L_0x0074
        L_0x0083:
            X.3tr r2 = X.C255273tr.A09     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x0085:
            r0.A02 = r2     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x0089:
            java.lang.String r1 = "body"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00a1
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r2 == r1) goto L_0x009d
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x009d:
            r0.A04 = r5     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x00a1:
            java.lang.String r1 = "title"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00b8
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r2 == r1) goto L_0x00b5
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x00b5:
            r0.A06 = r5     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x00b8:
            java.lang.String r1 = "request_id"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00cf
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r2 == r1) goto L_0x00cc
            java.lang.String r5 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x00cc:
            r0.A05 = r5     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x00cf:
            java.lang.String r1 = "primary_cta"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00de
            com.instagram.direct.smartsuggestion.model.SmartSuggestionCTA r1 = X.C255303tu.parseFromJson(r9)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r0.A00 = r1     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x00de:
            java.lang.String r1 = "secondary_cta"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x00ed
            com.instagram.direct.smartsuggestion.model.SmartSuggestionCTA r1 = X.C255303tu.parseFromJson(r9)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r0.A01 = r1     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x00ed:
            java.lang.String r1 = "additional_info"
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x0131
            X.16L r1 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 != r6) goto L_0x0124
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r4.<init>()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x0100:
            X.16L r1 = r9.A1J()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == r8) goto L_0x0123
            java.lang.String r3 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r9.A1J()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r2 = r9.A11()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            X.16L r1 = X.16L.A0G     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r2 != r1) goto L_0x0119
            r4.put(r3, r5)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0100
        L_0x0119:
            java.lang.String r1 = r9.A1P()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            if (r1 == 0) goto L_0x0100
            r4.put(r3, r1)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0100
        L_0x0123:
            r5 = r4
        L_0x0124:
            X.0qQ.A0B(r5, r7)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r0.A07 = r5     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0131
        L_0x012a:
            java.lang.Integer r2 = X.AnonymousClass05K.A00     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x012c:
            X.0qQ.A0B(r2, r7)     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            r0.A03 = r2     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
        L_0x0131:
            r9.A0z()     // Catch:{ IOException -> 0x013f, Exception -> 0x0138 }
            goto L_0x0016
        L_0x0136:
            r0 = 0
        L_0x0137:
            return r0
        L_0x0138:
            r1 = move-exception
            X.1Pf r0 = new X.1Pf
            r0.<init>(r1)
            throw r0
        L_0x013f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C255263tq.parseFromJson(X.16F):com.instagram.direct.smartsuggestion.model.SmartSuggestion");
    }
}
