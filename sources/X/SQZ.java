package X;

public abstract class SQZ {
    public static final TAH A00 = TAH.A02("\"\\");
    public static final TAH A01 = TAH.A02("\t ,=");

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0239, code lost:
        r0 = X.Pxe.A0g();
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01dc A[Catch:{ IllegalArgumentException -> 0x02c9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0239 A[EDGE_INSN: B:227:0x0239->B:124:0x0239 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.YBQ r47, X.C22023Xt4 r48, X.C11427STm r49) {
        /*
            X.YBQ r0 = X.YBQ.A00
            r1 = r47
            if (r1 == r0) goto L_0x0396
            r0 = 2493(0x9bd, float:3.493E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            r0 = r48
            java.lang.String[] r4 = r0.A00
            int r0 = r4.length
            int r3 = r0 / 2
            r2 = 0
            r1 = 0
        L_0x0015:
            if (r1 >= r3) goto L_0x0034
            int r0 = r1 * 2
            r0 = r4[r0]
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0031
            if (r2 != 0) goto L_0x0028
            r0 = 2
            java.util.ArrayList r2 = X.DbS.A0v(r0)
        L_0x0028:
            int r0 = r1 * 2
            int r0 = r0 + 1
            r0 = r4[r0]
            r2.add(r0)
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x0015
        L_0x0034:
            if (r2 == 0) goto L_0x0381
            java.util.List r37 = java.util.Collections.unmodifiableList(r2)
        L_0x003a:
            int r36 = r37.size()
            r35 = 0
            r34 = 0
        L_0x0042:
            r1 = r36
            r0 = r34
            if (r0 >= r1) goto L_0x0387
            r1 = r37
            java.lang.String r11 = X.AnonymousClass7TE.A19(r1, r0)
            long r16 = java.lang.System.currentTimeMillis()
            int r33 = r11.length()
            r9 = 0
            r4 = 0
            r1 = 59
            byte[] r0 = X.SUS.A07
        L_0x005c:
            r0 = r33
            if (r4 >= r0) goto L_0x0069
            char r0 = r11.charAt(r4)
            if (r0 == r1) goto L_0x006a
            int r4 = r4 + 1
            goto L_0x005c
        L_0x0069:
            r4 = r0
        L_0x006a:
            r5 = 0
            r1 = 61
        L_0x006d:
            if (r5 >= r4) goto L_0x0078
            char r0 = r11.charAt(r5)
            if (r0 == r1) goto L_0x0079
            int r5 = r5 + 1
            goto L_0x006d
        L_0x0078:
            r5 = r4
        L_0x0079:
            r32 = 0
            if (r5 == r4) goto L_0x00c3
            java.lang.String r31 = X.SUS.A04(r11, r9, r5)
            boolean r0 = r31.isEmpty()
            if (r0 != 0) goto L_0x00c3
            int r3 = r31.length()
            r2 = 0
        L_0x008c:
            if (r2 >= r3) goto L_0x009f
            r0 = r31
            char r1 = r0.charAt(r2)
            r0 = 31
            if (r1 <= r0) goto L_0x00a0
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L_0x00a0
            int r2 = r2 + 1
            goto L_0x008c
        L_0x009f:
            r2 = -1
        L_0x00a0:
            r10 = -1
            if (r2 != r10) goto L_0x00c3
            int r0 = r5 + 1
            java.lang.String r30 = X.SUS.A04(r11, r0, r4)
            int r3 = r30.length()
            r2 = 0
        L_0x00ae:
            if (r2 >= r3) goto L_0x00c7
            r0 = r30
            char r1 = r0.charAt(r2)
            r0 = 31
            if (r1 <= r0) goto L_0x00c1
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L_0x00c1
            int r2 = r2 + 1
            goto L_0x00ae
        L_0x00c1:
            if (r2 == r10) goto L_0x00c7
        L_0x00c3:
            int r34 = r34 + 1
            goto L_0x0042
        L_0x00c7:
            int r3 = r4 + 1
            r24 = -1
            r18 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r29 = r32
            r20 = -1
            r22 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r45 = 0
            r46 = 0
            r47 = 1
            r48 = 0
        L_0x00e1:
            r0 = r33
            if (r3 >= r0) goto L_0x02cd
            r8 = r3
            r1 = 59
        L_0x00e8:
            r0 = r33
            if (r8 >= r0) goto L_0x00f5
            char r0 = r11.charAt(r8)
            if (r0 == r1) goto L_0x00f6
            int r8 = r8 + 1
            goto L_0x00e8
        L_0x00f5:
            r8 = r0
        L_0x00f6:
            r2 = r3
            r1 = 61
        L_0x00f9:
            if (r2 >= r8) goto L_0x0104
            char r0 = r11.charAt(r2)
            if (r0 == r1) goto L_0x0105
            int r2 = r2 + 1
            goto L_0x00f9
        L_0x0104:
            r2 = r8
        L_0x0105:
            java.lang.String r1 = X.SUS.A04(r11, r3, r2)
            if (r2 >= r8) goto L_0x011a
            int r0 = r2 + 1
            java.lang.String r7 = X.SUS.A04(r11, r0, r8)
        L_0x0111:
            java.lang.String r0 = "expires"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x023e
            goto L_0x011d
        L_0x011a:
            java.lang.String r7 = ""
            goto L_0x0111
        L_0x011d:
            int r15 = r7.length()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r12 = X.SP8.A00(r7, r9, r15, r9)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.util.regex.Pattern r28 = X.SP8.A0B     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0 = r28
            java.util.regex.Matcher r6 = r0.matcher(r7)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r5 = -1
            r4 = -1
            r3 = -1
            r2 = -1
            r14 = -1
            r13 = -1
        L_0x0133:
            r27 = 2
            r1 = 1
            if (r12 >= r15) goto L_0x01c6
            int r0 = r12 + 1
            int r26 = X.SP8.A00(r7, r0, r15, r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0 = r26
            r6.region(r12, r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r4 != r10) goto L_0x0146
            goto L_0x0197
        L_0x0146:
            if (r3 != r10) goto L_0x015d
            java.util.regex.Pattern r0 = X.SP8.A09     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.util.regex.Matcher r0 = r6.usePattern(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            boolean r0 = r0.matches()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 == 0) goto L_0x015d
            java.lang.String r0 = r6.group(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x01be
        L_0x015d:
            if (r2 != r10) goto L_0x0180
            java.util.regex.Pattern r12 = X.SP8.A0A     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.util.regex.Matcher r0 = r6.usePattern(r12)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            boolean r0 = r0.matches()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 == 0) goto L_0x0180
            java.lang.String r1 = r6.group(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.lang.String r1 = r1.toLowerCase(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.lang.String r0 = r12.pattern()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r0 = r0.indexOf(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r2 = r0 / 4
            goto L_0x01be
        L_0x0180:
            if (r5 != r10) goto L_0x01be
            java.util.regex.Pattern r0 = X.SP8.A0C     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.util.regex.Matcher r0 = r6.usePattern(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            boolean r0 = r0.matches()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = r6.group(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r5 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x01be
        L_0x0197:
            r0 = r28
            java.util.regex.Matcher r0 = r6.usePattern(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            boolean r0 = r0.matches()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 == 0) goto L_0x0146
            java.lang.String r0 = r6.group(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r4 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0 = r27
            java.lang.String r0 = r6.group(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r14 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0 = 3
            java.lang.String r0 = r6.group(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r13 = java.lang.Integer.parseInt(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
        L_0x01be:
            int r0 = r26 + 1
            int r12 = X.SP8.A00(r7, r0, r15, r9)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x0133
        L_0x01c6:
            r0 = 70
            if (r5 < r0) goto L_0x01d0
            r0 = 99
            if (r5 > r0) goto L_0x01d8
            int r5 = r5 + 1900
        L_0x01d0:
            if (r5 < 0) goto L_0x0239
            r0 = 69
            if (r5 > r0) goto L_0x01d8
            int r5 = r5 + 2000
        L_0x01d8:
            r0 = 1601(0x641, float:2.243E-42)
            if (r5 < r0) goto L_0x0239
            if (r2 == r10) goto L_0x0234
            if (r3 < r1) goto L_0x022f
            r0 = 31
            if (r3 > r0) goto L_0x022f
            if (r4 < 0) goto L_0x022a
            r0 = 23
            if (r4 > r0) goto L_0x022a
            if (r14 < 0) goto L_0x0298
            r0 = 59
            if (r14 > r0) goto L_0x0298
            if (r13 < 0) goto L_0x0225
            if (r13 > r0) goto L_0x0225
            java.util.TimeZone r6 = X.SUS.A02     // Catch:{ IllegalArgumentException -> 0x02c9 }
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0.setLenient(r9)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r0.set(r1, r5)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            int r2 = r2 - r1
            r1 = r27
            r0.set(r1, r2)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r1 = 5
            r0.set(r1, r3)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r1 = 11
            r0.set(r1, r4)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r1 = 12
            r0.set(r1, r14)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r1 = 13
            r0.set(r1, r13)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            r1 = 14
            r0.set(r1, r9)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            long r22 = r0.getTimeInMillis()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x02c7
        L_0x0225:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x022a:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x022f:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x0234:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x0239:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x023e:
            java.lang.String r0 = "max-age"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0268
            r5 = -9223372036854775808
            long r3 = java.lang.Long.parseLong(r7)     // Catch:{ NumberFormatException -> 0x0255 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x02c5
            r5 = r3
            goto L_0x02c5
        L_0x0255:
            r1 = move-exception
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r7.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x0267
            java.lang.String r0 = "-"
            boolean r0 = r7.startsWith(r0)     // Catch:{  }
            if (r0 != 0) goto L_0x02c5
            goto L_0x02c0
        L_0x0267:
            throw r1     // Catch:{  }
        L_0x0268:
            java.lang.String r0 = "domain"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x029d
            java.lang.String r1 = "."
            boolean r0 = r7.endsWith(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 != 0) goto L_0x0293
            boolean r0 = r7.startsWith(r1)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 == 0) goto L_0x0283
            r0 = 1
            java.lang.String r7 = r7.substring(r0)     // Catch:{ IllegalArgumentException -> 0x02c9 }
        L_0x0283:
            java.lang.String r0 = X.SUS.A03(r7)     // Catch:{ IllegalArgumentException -> 0x02c9 }
            if (r0 == 0) goto L_0x028e
            r29 = r0
            r47 = 0
            goto L_0x02c9
        L_0x028e:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x0293:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
            goto L_0x029c
        L_0x0298:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()     // Catch:{ IllegalArgumentException -> 0x02c9 }
        L_0x029c:
            throw r0     // Catch:{ IllegalArgumentException -> 0x02c9 }
        L_0x029d:
            java.lang.String r0 = "path"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02a9
            r32 = r7
            goto L_0x02c9
        L_0x02a9:
            java.lang.String r0 = "secure"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02b5
            r45 = 1
            goto L_0x02c9
        L_0x02b5:
            java.lang.String r0 = "httponly"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02c9
            r46 = 1
            goto L_0x02c9
        L_0x02c0:
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x02c5:
            r20 = r5
        L_0x02c7:
            r48 = 1
        L_0x02c9:
            int r3 = r8 + 1
            goto L_0x00e1
        L_0x02cd:
            r43 = -9223372036854775808
            int r0 = (r20 > r43 ? 1 : (r20 == r43 ? 0 : -1))
            if (r0 == 0) goto L_0x02f3
            int r0 = (r20 > r24 ? 1 : (r20 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x0343
            r1 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x033d
            r0 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r0
        L_0x02e4:
            long r43 = r16 + r20
            int r0 = (r43 > r16 ? 1 : (r43 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x02ee
            int r0 = (r43 > r18 ? 1 : (r43 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x02f3
        L_0x02ee:
            r43 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x02f3:
            r1 = r49
            java.lang.String r3 = r1.A02
            if (r29 != 0) goto L_0x0311
            r29 = r3
        L_0x02fb:
            int r2 = r3.length()
            int r0 = r29.length()
            if (r2 == r0) goto L_0x0346
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r2 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance
            r0 = r29
            java.lang.String r0 = r2.getEffectiveTldPlusOne(r0)
            if (r0 != 0) goto L_0x0346
            goto L_0x00c3
        L_0x0311:
            r0 = r29
            boolean r0 = r3.equals(r0)
            r4 = 1
            if (r0 != 0) goto L_0x02fb
            r0 = r29
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L_0x00c3
            int r2 = r3.length()
            int r0 = r29.length()
            int r2 = r2 - r0
            int r2 = r2 - r4
            char r2 = r3.charAt(r2)
            r0 = 46
            if (r2 != r0) goto L_0x00c3
            java.util.regex.Pattern r0 = X.SUS.A03
            boolean r0 = X.DbV.A1b(r3, r0)
            if (r0 != 0) goto L_0x00c3
            goto L_0x02fb
        L_0x033d:
            r20 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02e4
        L_0x0343:
            r43 = r22
            goto L_0x02f3
        L_0x0346:
            java.lang.String r2 = "/"
            if (r32 == 0) goto L_0x0370
            r0 = r32
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L_0x0370
            r2 = r32
        L_0x0354:
            X.SP8 r1 = new X.SP8
            r38 = r1
            r39 = r31
            r40 = r30
            r41 = r29
            r42 = r2
            r38.<init>(r39, r40, r41, r42, r43, r45, r46, r47, r48)
            if (r35 != 0) goto L_0x0369
            java.util.ArrayList r35 = X.AnonymousClass7TE.A1C()
        L_0x0369:
            r0 = r35
            r0.add(r1)
            goto L_0x00c3
        L_0x0370:
            java.lang.String r1 = r1.A07()
            r0 = 47
            int r0 = r1.lastIndexOf(r0)
            if (r0 == 0) goto L_0x0354
            java.lang.String r2 = r1.substring(r9, r0)
            goto L_0x0354
        L_0x0381:
            java.util.List r37 = java.util.Collections.emptyList()
            goto L_0x003a
        L_0x0387:
            if (r35 == 0) goto L_0x0391
            java.util.List r0 = java.util.Collections.unmodifiableList(r35)
        L_0x038d:
            r0.isEmpty()
            return
        L_0x0391:
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x038d
        L_0x0396:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQZ.A01(X.YBQ, X.Xt4, X.STm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r3 == -1) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.Y1H r8) {
        /*
            X.Xbw r0 = r8.A07
            java.lang.String r1 = r0.A00
            java.lang.String r0 = "HEAD"
            boolean r0 = r1.equals(r0)
            r7 = 0
            if (r0 != 0) goto L_0x004a
            int r1 = r8.A00
            r0 = 100
            r6 = 1
            if (r1 < r0) goto L_0x0020
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L_0x0021
            r0 = 204(0xcc, float:2.86E-43)
            if (r1 == r0) goto L_0x0021
            r0 = 304(0x130, float:4.26E-43)
            if (r1 == r0) goto L_0x0021
        L_0x0020:
            return r6
        L_0x0021:
            X.Xt4 r5 = r8.A05
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r5.A03(r0)
            r3 = -1
            if (r0 == 0) goto L_0x0037
            long r3 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0031 }
        L_0x0031:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0020
        L_0x0037:
            java.lang.String r0 = "Transfer-Encoding"
            r1 = 0
            java.lang.String r0 = r5.A03(r0)
            if (r0 == 0) goto L_0x0041
            r1 = r0
        L_0x0041:
            java.lang.String r0 = "chunked"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x004a
            return r6
        L_0x004a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SQZ.A02(X.Y1H):boolean");
    }

    public static int A00(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i;
        }
    }
}
