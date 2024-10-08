package X;

/* renamed from: X.NqU  reason: case insensitive filesystem */
public abstract class C69708NqU {
    /* JADX WARNING: type inference failed for: r1v3, types: [X.5Hx, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:166:?, code lost:
        r0 = X.AnonymousClass7TE.A15(X.002.A0R("could not find configName in configs ", r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f5, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0209 A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x024d A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0263 A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02bb A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d5 A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e8 A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fe A[Catch:{ all -> 0x02f6, all -> 0x02fb, IOException -> 0x0300 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C283495Hx A00(java.lang.String r43, boolean r44) {
        /*
            java.lang.String r26 = ""
            java.util.LinkedList r25 = new java.util.LinkedList
            r25.<init>()
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r4 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r24 = X.AnonymousClass7TE.A1E()
            java.util.HashMap r23 = X.AnonymousClass7TE.A1E()
            r22 = 6
            r0 = r22
            int[] r3 = new int[r0]
            int[] r0 = new int[r0]
            r21 = r0
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r0 = r43
            r1.add(r0)
            boolean r0 = r26.isEmpty()
            if (r0 != 0) goto L_0x02d1
            r0 = r26
            r1.add(r0)
            r20 = 1
        L_0x0037:
            java.util.Iterator r19 = r1.iterator()
            r2 = r26
            r18 = -1
            r12 = -1
            r1 = -1
            r40 = 0
        L_0x0043:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0324
            java.lang.Object r7 = r19.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x005d
            java.lang.String r6 = "ParamsMapParserOld"
            java.lang.String r0 = "paramsMap content is empty"
            X.0KC.A0C(r6, r0)
            goto L_0x0043
        L_0x005d:
            java.lang.String r0 = "v2,"
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x0306
            r8 = 0
        L_0x0066:
            r6 = r3[r8]
            r0 = r21[r8]
            if (r6 >= r0) goto L_0x006e
            r3[r8] = r0
        L_0x006e:
            int r8 = r8 + 1
            r0 = r22
            if (r8 < r0) goto L_0x0066
            java.io.StringReader r6 = new java.io.StringReader     // Catch:{ IOException -> 0x0300 }
            r6.<init>(r7)     // Catch:{ IOException -> 0x0300 }
            java.io.BufferedReader r17 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0300 }
            r0 = r17
            r0.<init>(r6)     // Catch:{ IOException -> 0x0300 }
            r15 = 0
            r0 = 0
            r6 = 1
        L_0x0083:
            java.lang.String r8 = r17.readLine()     // Catch:{ all -> 0x02f6 }
            if (r8 != 0) goto L_0x008b
            goto L_0x02c2
        L_0x008b:
            if (r6 != 0) goto L_0x02bf
            java.lang.String r6 = "END"
            boolean r6 = r8.startsWith(r6)     // Catch:{ all -> 0x02f6 }
            if (r6 == 0) goto L_0x0097
            goto L_0x02c4
        L_0x0097:
            java.lang.String r6 = ","
            r14 = -1
            java.lang.String[] r10 = r8.split(r6, r14)     // Catch:{ all -> 0x02f6 }
            r6 = 0
            r7 = r10[r6]     // Catch:{ all -> 0x02f6 }
            java.lang.String r9 = "+"
            boolean r9 = r7.startsWith(r9)     // Catch:{ all -> 0x02f6 }
            if (r9 != 0) goto L_0x0269
            java.lang.String r9 = "-"
            boolean r9 = r7.startsWith(r9)     // Catch:{ all -> 0x02f6 }
            if (r9 != 0) goto L_0x0269
            java.lang.String r9 = "*"
            boolean r9 = r7.startsWith(r9)     // Catch:{ all -> 0x02f6 }
            r11 = 3
            if (r9 == 0) goto L_0x015c
            r0 = 1
            java.lang.String r2 = r7.substring(r0)     // Catch:{ all -> 0x02f6 }
            int r8 = r10.length     // Catch:{ all -> 0x02f6 }
            if (r8 <= r0) goto L_0x00d1
            r1 = r10[r0]     // Catch:{ all -> 0x02f6 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x00d1
            r0 = 16
            int r1 = java.lang.Integer.parseInt(r1, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x00d2
        L_0x00d1:
            r1 = 0
        L_0x00d2:
            r7 = 2
            if (r8 <= r7) goto L_0x00e4
            r9 = r10[r7]     // Catch:{ all -> 0x02f6 }
            boolean r0 = r9.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x00e4
            r0 = 16
            int r40 = java.lang.Integer.parseInt(r9, r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x00e6
        L_0x00e4:
            r40 = 0
        L_0x00e6:
            if (r8 <= r11) goto L_0x00fb
            r8 = r10[r11]     // Catch:{ all -> 0x02f6 }
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r0 != 0) goto L_0x00fb
            r0 = 10
            int r0 = java.lang.Integer.parseInt(r8, r0)     // Catch:{ all -> 0x02f6 }
            if (r0 == 0) goto L_0x00fc
            if (r0 > r7) goto L_0x02bf
            goto L_0x00fc
        L_0x00fb:
            r0 = 0
        L_0x00fc:
            if (r20 == 0) goto L_0x02bb
            java.lang.String r8 = java.lang.Integer.toString(r40)     // Catch:{ all -> 0x02f6 }
            boolean r7 = r5.containsKey(r8)     // Catch:{ all -> 0x02f6 }
            if (r7 == 0) goto L_0x0120
            java.lang.Object r9 = r4.get(r8)     // Catch:{ all -> 0x02f6 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ all -> 0x02f6 }
            if (r9 == 0) goto L_0x02eb
            boolean r7 = r9.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r7 != 0) goto L_0x02eb
            java.lang.Object r6 = r9.get(r6)     // Catch:{ all -> 0x02f6 }
            X.5I0 r6 = (X.AnonymousClass5I0) r6     // Catch:{ all -> 0x02f6 }
            int r12 = r6.A02     // Catch:{ all -> 0x02f6 }
            goto L_0x02bf
        L_0x0120:
            boolean r7 = r4.containsKey(r2)     // Catch:{ all -> 0x02f6 }
            if (r7 == 0) goto L_0x013e
            java.lang.Object r8 = r4.get(r2)     // Catch:{ all -> 0x02f6 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x02f6 }
            if (r8 == 0) goto L_0x02d5
            boolean r7 = r8.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r7 != 0) goto L_0x02d5
            java.lang.Object r6 = r8.get(r6)     // Catch:{ all -> 0x02f6 }
            X.5I0 r6 = (X.AnonymousClass5I0) r6     // Catch:{ all -> 0x02f6 }
            int r12 = r6.A02     // Catch:{ all -> 0x02f6 }
            goto L_0x02bf
        L_0x013e:
            int r18 = r18 + 1
            if (r40 != 0) goto L_0x0143
            r8 = r2
        L_0x0143:
            java.util.HashSet r6 = X.AnonymousClass7TE.A1F()     // Catch:{ all -> 0x02f6 }
            r5.put(r8, r6)     // Catch:{ all -> 0x02f6 }
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x02f6 }
            r4.put(r8, r6)     // Catch:{ all -> 0x02f6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)     // Catch:{ all -> 0x02f6 }
            r6 = r24
            r6.put(r7, r8)     // Catch:{ all -> 0x02f6 }
            goto L_0x02bd
        L_0x015c:
            java.lang.String r6 = "?"
            boolean r6 = r7.startsWith(r6)     // Catch:{ all -> 0x02f6 }
            if (r6 == 0) goto L_0x0182
            if (r0 == 0) goto L_0x0169
            r6 = 2
            if (r0 > r6) goto L_0x02bf
        L_0x0169:
            if (r15 == 0) goto L_0x017f
            java.lang.String r9 = r15.A00     // Catch:{ all -> 0x02f6 }
            java.lang.String r7 = ":"
            java.lang.String r6 = r15.A01     // Catch:{ all -> 0x02f6 }
            java.lang.String r9 = X.002.A0g(r9, r7, r6)     // Catch:{ all -> 0x02f6 }
            r6 = 1
            java.lang.String r7 = r8.substring(r6)     // Catch:{ all -> 0x02f6 }
            r6 = r23
            r6.put(r9, r7)     // Catch:{ all -> 0x02f6 }
        L_0x017f:
            r15 = 0
            goto L_0x02bf
        L_0x0182:
            int r6 = r10.length     // Catch:{ all -> 0x02f6 }
            r9 = 1
            if (r6 <= r9) goto L_0x02e0
            if (r0 == 0) goto L_0x018b
            r8 = 2
            if (r0 > r8) goto L_0x02bf
        L_0x018b:
            r8 = r26
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x02f6 }
            if (r8 == 0) goto L_0x0195
            java.lang.String r7 = "_"
        L_0x0195:
            r16 = 1
            r13 = r10[r9]     // Catch:{ all -> 0x02f6 }
            r8 = r26
            boolean r8 = r13.equals(r8)     // Catch:{ all -> 0x02f6 }
            if (r8 != 0) goto L_0x01a7
            r8 = 16
            int r16 = java.lang.Integer.parseInt(r13, r8)     // Catch:{ all -> 0x02f6 }
        L_0x01a7:
            int r1 = r1 + r16
            if (r20 == 0) goto L_0x01e2
            java.lang.String r8 = java.lang.Integer.toString(r40)     // Catch:{ all -> 0x02f6 }
            java.lang.String r13 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x02f6 }
            boolean r16 = r5.containsKey(r8)     // Catch:{ all -> 0x02f6 }
            if (r16 == 0) goto L_0x01c0
            java.lang.Object r8 = r5.get(r8)     // Catch:{ all -> 0x02f6 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ all -> 0x02f6 }
            goto L_0x01c6
        L_0x01c0:
            java.lang.Object r8 = r5.get(r2)     // Catch:{ all -> 0x02f6 }
            java.util.Set r8 = (java.util.Set) r8     // Catch:{ all -> 0x02f6 }
        L_0x01c6:
            if (r8 == 0) goto L_0x01d6
            boolean r16 = r8.contains(r13)     // Catch:{ all -> 0x02f6 }
            if (r16 != 0) goto L_0x02bf
            boolean r16 = r8.contains(r7)     // Catch:{ all -> 0x02f6 }
            if (r16 == 0) goto L_0x01d6
            goto L_0x02bf
        L_0x01d6:
            if (r1 == r14) goto L_0x01dc
            r14 = 16384(0x4000, float:2.2959E-41)
            if (r1 < r14) goto L_0x01dd
        L_0x01dc:
            r13 = r7
        L_0x01dd:
            if (r8 == 0) goto L_0x01e2
            r8.add(r13)     // Catch:{ all -> 0x02f6 }
        L_0x01e2:
            r8 = 2
            if (r6 <= r8) goto L_0x01f4
            r14 = r10[r8]     // Catch:{ all -> 0x02f6 }
            boolean r13 = r14.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r13 != 0) goto L_0x01f4
            r13 = 16
            int r14 = java.lang.Integer.parseInt(r14, r13)     // Catch:{ all -> 0x02f6 }
            goto L_0x01f5
        L_0x01f4:
            r14 = 4
        L_0x01f5:
            r13 = r14 & 28
            int r38 = r13 >> 2
            r13 = r14 & 64
            boolean r42 = X.AnonymousClass7TF.A1P(r13)
            if (r6 <= r11) goto L_0x0202
            goto L_0x0209
        L_0x0202:
            r37 = r3[r38]     // Catch:{ all -> 0x02f6 }
            int r6 = r37 + 1
            r3[r38] = r6     // Catch:{ all -> 0x02f6 }
            goto L_0x0217
        L_0x0209:
            r10 = r10[r11]     // Catch:{ all -> 0x02f6 }
            boolean r6 = r10.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r6 != 0) goto L_0x0202
            r6 = 16
            int r37 = java.lang.Integer.parseInt(r10, r6)     // Catch:{ all -> 0x02f6 }
        L_0x0217:
            r6 = r21[r38]     // Catch:{ all -> 0x02f6 }
            int r6 = r6 + 1
            r21[r38] = r6     // Catch:{ all -> 0x02f6 }
            int r6 = r14 / 2
            r39 = 2
            int r6 = r6 % r8
            boolean r6 = X.AnonymousClass7TF.A1S(r6, r9)
            if (r6 == 0) goto L_0x022a
            r39 = 1
        L_0x022a:
            int r6 = r14 % 2
            boolean r41 = X.AnonymousClass7TF.A1S(r6, r9)
            r6 = r14 & 32
            r43 = 0
            if (r6 == 0) goto L_0x023a
            r43 = 1
            if (r44 == 0) goto L_0x02bf
        L_0x023a:
            X.5I0 r6 = new X.5I0     // Catch:{ all -> 0x02f6 }
            r31 = r6
            r32 = r2
            r33 = r7
            r34 = r1
            r35 = r12
            r36 = r1
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x02f6 }
            if (r20 == 0) goto L_0x0263
            if (r40 == 0) goto L_0x0250
            goto L_0x0252
        L_0x0250:
            r7 = r2
            goto L_0x0256
        L_0x0252:
            java.lang.String r7 = java.lang.Integer.toString(r40)     // Catch:{ all -> 0x02f6 }
        L_0x0256:
            java.lang.Object r7 = r4.get(r7)     // Catch:{ all -> 0x02f6 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ all -> 0x02f6 }
            r7.add(r6)     // Catch:{ all -> 0x02f6 }
            if (r43 == 0) goto L_0x02bf
            r15 = r6
            goto L_0x02bf
        L_0x0263:
            r7 = r25
            r7.add(r6)     // Catch:{ all -> 0x02f6 }
            goto L_0x02bf
        L_0x0269:
            r8 = 1
            java.lang.String r2 = r7.substring(r8)     // Catch:{ all -> 0x02f6 }
            int r12 = r12 + 1
            r7 = r10[r6]     // Catch:{ all -> 0x02f6 }
            char r9 = r7.charAt(r6)     // Catch:{ all -> 0x02f6 }
            r7 = 43
            r35 = 2
            if (r9 != r7) goto L_0x027e
            r35 = 1
        L_0x027e:
            int r7 = r10.length     // Catch:{ all -> 0x02f6 }
            if (r7 <= r8) goto L_0x02b4
            r9 = r10[r8]     // Catch:{ all -> 0x02f6 }
            boolean r7 = r9.isEmpty()     // Catch:{ all -> 0x02f6 }
            if (r7 != 0) goto L_0x02b4
            r7 = 16
            int r33 = java.lang.Integer.parseInt(r9, r7)     // Catch:{ all -> 0x02f6 }
        L_0x028f:
            java.lang.String r7 = "gk_"
            java.lang.String r28 = X.002.A0R(r7, r2)     // Catch:{ all -> 0x02f6 }
            X.5I0 r7 = new X.5I0     // Catch:{ all -> 0x02f6 }
            r27 = r7
            r29 = r26
            r30 = r8
            r31 = r12
            r32 = r8
            r34 = r8
            r36 = r6
            r37 = r6
            r38 = r6
            r39 = r6
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x02f6 }
            r6 = r25
            r6.add(r7)     // Catch:{ all -> 0x02f6 }
            goto L_0x02bf
        L_0x02b4:
            r33 = r3[r8]     // Catch:{ all -> 0x02f6 }
            int r7 = r33 + 1
            r3[r8] = r7     // Catch:{ all -> 0x02f6 }
            goto L_0x028f
        L_0x02bb:
            int r18 = r18 + 1
        L_0x02bd:
            r12 = r18
        L_0x02bf:
            r6 = 0
            goto L_0x0083
        L_0x02c2:
            r0 = 0
            goto L_0x02c5
        L_0x02c4:
            r0 = 1
        L_0x02c5:
            r17.close()     // Catch:{ IOException -> 0x0300 }
            if (r0 != 0) goto L_0x0043
            java.lang.String r0 = "Invalid paramsMapContent: no END marker found"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x02d1:
            r20 = 0
            goto L_0x0037
        L_0x02d5:
            java.lang.String r0 = "could not find configName in configs "
            java.lang.String r0 = X.002.A0R(r0, r2)     // Catch:{ all -> 0x02f6 }
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x02e0:
            java.lang.String r0 = "Found incognible line : "
            java.lang.String r0 = X.002.A0R(r0, r8)     // Catch:{ all -> 0x02f6 }
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x02f6 }
            goto L_0x02f5
        L_0x02eb:
            java.lang.String r0 = "could not find key in configs "
            java.lang.String r0 = X.002.A0R(r0, r8)     // Catch:{ all -> 0x02f6 }
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)     // Catch:{ all -> 0x02f6 }
        L_0x02f5:
            throw r0     // Catch:{ all -> 0x02f6 }
        L_0x02f6:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x02fb }
            goto L_0x02ff
        L_0x02fb:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x0300 }
        L_0x02ff:
            throw r1     // Catch:{ IOException -> 0x0300 }
        L_0x0300:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.C41845B3m.A0j(r0)
            throw r0
        L_0x0306:
            int r1 = r7.length()
            r0 = 15
            int r1 = java.lang.Math.min(r1, r0)
            r0 = 0
            java.lang.String r0 = r7.substring(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "current ParamsMap parsing only supports version 2 but found %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            throw r0
        L_0x0324:
            if (r20 == 0) goto L_0x0340
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r24)
        L_0x032a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0340
            java.lang.Object r0 = X.C51971G9r.A0p(r2)
            java.lang.Object r1 = r4.get(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            r0 = r25
            r0.addAll(r1)
            goto L_0x032a
        L_0x0340:
            X.5Hx r1 = new X.5Hx
            r1.<init>()
            r0 = r26
            r1.A00 = r0
            r0 = r25
            r1.A01 = r0
            r0 = r23
            r1.A02 = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69708NqU.A00(java.lang.String, boolean):X.5Hx");
    }
}
