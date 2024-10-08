package X;

/* renamed from: X.6Be  reason: invalid class name and case insensitive filesystem */
public abstract class C303886Be {
    /* JADX WARNING: type inference failed for: r15v0, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: type inference failed for: r2v21, types: [X.XaN, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        r1 = r13.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass9IV A00(java.lang.String r34, int r35, long r36, boolean r38) {
        /*
            r5 = 1
            r21 = 0
            r6 = r34
            X.6Bf r20 = new X.6Bf     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r20.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0 = 16
            X.6Bd r4 = new X.6Bd     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r4.<init>(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0rk r15 = new X.0rk     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r15.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r31 = 0
            r28 = 65534(0xfffe, float:9.1833E-41)
            X.5ZB r19 = new X.5ZB     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r29 = r36
            r22 = r19
            r23 = r21
            r24 = r21
            r25 = r21
            r26 = r21
            r27 = r21
            r33 = r31
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r31, r33)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            android.text.SpannableString r9 = new android.text.SpannableString     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r9.<init>(r6)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r8 = 0
            int r1 = r9.length()     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r2 = r9.getSpans(r8, r1, r0)     // Catch:{ RuntimeException -> 0x0151 }
            android.text.style.ClickableSpan[] r2 = (android.text.style.ClickableSpan[]) r2     // Catch:{ RuntimeException -> 0x0151 }
            int r1 = r2.length     // Catch:{ RuntimeException -> 0x0151 }
            int r1 = r1 - r5
        L_0x0044:
            if (r1 < 0) goto L_0x004e
            r0 = r2[r1]     // Catch:{ RuntimeException -> 0x0151 }
            r9.removeSpan(r0)     // Catch:{ RuntimeException -> 0x0151 }
            int r1 = r1 + -1
            goto L_0x0044
        L_0x004e:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x0151 }
            r7.<init>()     // Catch:{ RuntimeException -> 0x0151 }
            java.util.regex.Pattern r0 = X.C252783ph.A00     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String[] r14 = X.C303906Bg.A01     // Catch:{ RuntimeException -> 0x0151 }
            android.text.util.Linkify$MatchFilter r11 = android.text.util.Linkify.sUrlMatchFilter     // Catch:{ RuntimeException -> 0x0151 }
            java.util.regex.Matcher r12 = r0.matcher(r9)     // Catch:{ RuntimeException -> 0x0151 }
        L_0x005d:
            boolean r0 = r12.find()     // Catch:{ RuntimeException -> 0x0151 }
            if (r0 == 0) goto L_0x00d5
            int r10 = r12.start()     // Catch:{ RuntimeException -> 0x0151 }
            int r3 = r12.end()     // Catch:{ RuntimeException -> 0x0151 }
            if (r11 == 0) goto L_0x0073
            boolean r0 = r11.acceptMatch(r9, r10, r3)     // Catch:{ RuntimeException -> 0x0151 }
            if (r0 == 0) goto L_0x005d
        L_0x0073:
            X.XaN r2 = new X.XaN     // Catch:{ RuntimeException -> 0x0151 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r1 = r12.group(r8)     // Catch:{ RuntimeException -> 0x0151 }
            r0 = 0
        L_0x007d:
            r25 = r14[r0]     // Catch:{ RuntimeException -> 0x0151 }
            int r27 = r25.length()     // Catch:{ RuntimeException -> 0x0151 }
            r22 = r1
            r23 = r5
            r24 = r8
            r26 = r8
            boolean r13 = r22.regionMatches(r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x0151 }
            if (r13 == 0) goto L_0x00c2
            r25 = r14[r0]     // Catch:{ RuntimeException -> 0x0151 }
            int r27 = r25.length()     // Catch:{ RuntimeException -> 0x0151 }
            r23 = r8
            boolean r13 = r22.regionMatches(r23, r24, r25, r26, r27)     // Catch:{ RuntimeException -> 0x0151 }
            if (r13 != 0) goto L_0x00b8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0151 }
            r13.<init>()     // Catch:{ RuntimeException -> 0x0151 }
            r0 = r14[r0]     // Catch:{ RuntimeException -> 0x0151 }
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r0.length()     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r0 = r1.substring(r0)     // Catch:{ RuntimeException -> 0x0151 }
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0151 }
        L_0x00b4:
            java.lang.String r1 = r13.toString()     // Catch:{ RuntimeException -> 0x0151 }
        L_0x00b8:
            r2.A02 = r1     // Catch:{ RuntimeException -> 0x0151 }
            r2.A01 = r10     // Catch:{ RuntimeException -> 0x0151 }
            r2.A00 = r3     // Catch:{ RuntimeException -> 0x0151 }
            r7.add(r2)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x005d
        L_0x00c2:
            int r0 = r0 + 1
            r13 = 3
            if (r0 < r13) goto L_0x007d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0151 }
            r13.<init>()     // Catch:{ RuntimeException -> 0x0151 }
            r0 = r14[r8]     // Catch:{ RuntimeException -> 0x0151 }
            r13.append(r0)     // Catch:{ RuntimeException -> 0x0151 }
            r13.append(r1)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x00b4
        L_0x00d5:
            java.util.Comparator r0 = X.C303906Bg.A00     // Catch:{ RuntimeException -> 0x0151 }
            java.util.Collections.sort(r7, r0)     // Catch:{ RuntimeException -> 0x0151 }
            int r14 = r7.size()     // Catch:{ RuntimeException -> 0x0151 }
            r13 = 0
        L_0x00df:
            int r0 = r14 + -1
            if (r13 >= r0) goto L_0x012a
            java.lang.Object r12 = r7.get(r13)     // Catch:{ RuntimeException -> 0x0151 }
            X.XaN r12 = (X.C21413XaN) r12     // Catch:{ RuntimeException -> 0x0151 }
            int r11 = r13 + 1
            java.lang.Object r10 = r7.get(r11)     // Catch:{ RuntimeException -> 0x0151 }
            X.XaN r10 = (X.C21413XaN) r10     // Catch:{ RuntimeException -> 0x0151 }
            int r1 = r12.A01     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r10.A01     // Catch:{ RuntimeException -> 0x0151 }
            if (r1 > r0) goto L_0x0128
            int r1 = r12.A00     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r10.A01     // Catch:{ RuntimeException -> 0x0151 }
            if (r1 <= r0) goto L_0x0128
            int r1 = r10.A00     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r12.A00     // Catch:{ RuntimeException -> 0x0151 }
            r3 = -1
            if (r1 <= r0) goto L_0x011d
            int r2 = r12.A00     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r12.A01     // Catch:{ RuntimeException -> 0x0151 }
            int r2 = r2 - r0
            int r1 = r10.A00     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r10.A01     // Catch:{ RuntimeException -> 0x0151 }
            int r1 = r1 - r0
            if (r2 > r1) goto L_0x011d
            int r1 = r12.A00     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r12.A01     // Catch:{ RuntimeException -> 0x0151 }
            int r1 = r1 - r0
            int r2 = r10.A00     // Catch:{ RuntimeException -> 0x0151 }
            int r0 = r10.A01     // Catch:{ RuntimeException -> 0x0151 }
            int r2 = r2 - r0
            if (r1 >= r2) goto L_0x0128
            goto L_0x011f
        L_0x011d:
            r0 = r11
            goto L_0x0120
        L_0x011f:
            r0 = r13
        L_0x0120:
            if (r0 == r3) goto L_0x0128
            r7.remove(r0)     // Catch:{ RuntimeException -> 0x0151 }
            int r14 = r14 + -1
            goto L_0x00df
        L_0x0128:
            r13 = r11
            goto L_0x00df
        L_0x012a:
            boolean r0 = r7.isEmpty()     // Catch:{ RuntimeException -> 0x0151 }
            if (r0 != 0) goto L_0x0155
            java.util.Iterator r7 = r7.iterator()     // Catch:{ RuntimeException -> 0x0151 }
        L_0x0134:
            boolean r0 = r7.hasNext()     // Catch:{ RuntimeException -> 0x0151 }
            if (r0 == 0) goto L_0x0155
            java.lang.Object r1 = r7.next()     // Catch:{ RuntimeException -> 0x0151 }
            X.XaN r1 = (X.C21413XaN) r1     // Catch:{ RuntimeException -> 0x0151 }
            java.lang.String r0 = r1.A02     // Catch:{ RuntimeException -> 0x0151 }
            int r3 = r1.A01     // Catch:{ RuntimeException -> 0x0151 }
            int r2 = r1.A00     // Catch:{ RuntimeException -> 0x0151 }
            android.text.style.URLSpan r1 = new android.text.style.URLSpan     // Catch:{ RuntimeException -> 0x0151 }
            r1.<init>(r0)     // Catch:{ RuntimeException -> 0x0151 }
            r0 = 33
            r9.setSpan(r1, r3, r2, r0)     // Catch:{ RuntimeException -> 0x0151 }
            goto L_0x0134
        L_0x0151:
            r0 = move-exception
            r0.getMessage()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x0155:
            int r1 = r9.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r13 = 0
            java.lang.Object[] r12 = r9.getSpans(r8, r1, r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            android.text.style.URLSpan[] r12 = (android.text.style.URLSpan[]) r12     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A0A(r12)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r12.length     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r22 = r0
        L_0x0168:
            r0 = r22
            if (r13 >= r0) goto L_0x02fc
            r0 = r12[r13]     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r2 = r0.getURL()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r11 = r9.getSpanStart(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r7 = r9.getSpanEnd(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r10 = r7
        L_0x017e:
            int r0 = r6.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r3 = r10 + 1
            if (r0 <= r3) goto L_0x0194
            int r1 = r6.codePointAt(r10)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0 = 10
            if (r1 == r0) goto L_0x0194
            r0 = 32
            if (r1 == r0) goto L_0x0194
            r10 = r3
            goto L_0x017e
        L_0x0194:
            if (r11 >= r10) goto L_0x01ab
            int r3 = r10 + -1
            int r1 = r6.codePointAt(r3)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0 = 33
            if (r1 == r0) goto L_0x01a9
            r0 = 46
            if (r1 == r0) goto L_0x01a9
            r0 = 59
            if (r1 == r0) goto L_0x01a9
            goto L_0x01ab
        L_0x01a9:
            r10 = r3
            goto L_0x0194
        L_0x01ab:
            int r0 = r15.A00     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r0 = r6.substring(r0, r11)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r4.A09(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r1 = r2.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r10 - r7
            if (r0 <= r8) goto L_0x01c0
            r0 = 0
        L_0x01c0:
            int r1 = r1 + r0
            java.lang.String r7 = r2.substring(r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r7)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r3 = r7
            java.lang.String r1 = "IgSecureUriParser"
            X.1Q7 r0 = new X.1Q7     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0bY r0 = r0.A00     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            android.net.Uri r16 = X.0cp.A00(r0, r7)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r16 == 0) goto L_0x0205
            java.lang.String r1 = r16.getHost()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r1 == 0) goto L_0x0205
            java.lang.String r0 = "www."
            java.lang.String r3 = X.00l.A0F(r0, r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r3.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r14 = 0
            r1 = 30
            if (r0 < r1) goto L_0x0261
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r1 = r3.substring(r8, r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r1 = 8230(0x2026, float:1.1533E-41)
            r0.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x0201:
            java.lang.String r3 = r0.toString()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x0205:
            int r0 = r6.codePointCount(r8, r11)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r14 = r35 + r0
            X.6Bc r0 = X.C303866Bc.A01     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A0B(r3, r8)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r2 = r3.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r1 = r3.codePointCount(r8, r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r11 = r6.substring(r11, r10)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r11)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r11.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r11.codePointCount(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r1 = r1 - r0
            r0 = r20
            java.util.List r11 = r0.A00     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.6Bi r0 = new X.6Bi     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>(r14, r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r11.add(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r4.A09(r3)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.StringBuilder r0 = r4.A00     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r3 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r3 = r3 - r2
            int r11 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0 = r19
            r4.A06(r0, r3, r11)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r0 = "web_url_span"
            r4.A0A(r0, r7, r3, r11)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.Hrz r2 = new X.Hrz     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r2.<init>(r7)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.util.List r7 = r4.A01     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r1 = ""
            X.6Bh r0 = new X.6Bh     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>(r2, r1, r3, r11)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r7.add(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r15.A00 = r10     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            goto L_0x02f8
        L_0x0261:
            java.lang.String r2 = r16.getPath()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r2 != 0) goto L_0x0269
            java.lang.String r2 = ""
        L_0x0269:
            r0 = 47
            boolean r0 = X.00l.A0Y(r2, r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r0 == 0) goto L_0x0281
            int r0 = r2.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r0 + -1
            if (r0 >= r8) goto L_0x027a
            r0 = 0
        L_0x027a:
            java.lang.String r2 = r2.substring(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x0281:
            java.lang.String r0 = r16.getQuery()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r0 == 0) goto L_0x028d
            int r0 = r0.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r0 != 0) goto L_0x028e
        L_0x028d:
            r14 = 1
        L_0x028e:
            r18 = r14 ^ 1
            int r1 = r2.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r1 == 0) goto L_0x02eb
            r14 = 6
            r0 = 6
            if (r14 <= r1) goto L_0x029b
            r0 = r1
        L_0x029b:
            java.lang.String r14 = r2.substring(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r14)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r14.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x02bb
        L_0x02aa:
            int r17 = r0 + -1
            char r16 = r14.charAt(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            boolean r16 = java.lang.Character.isLetterOrDigit(r16)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r16 != 0) goto L_0x02bc
            if (r17 < 0) goto L_0x02bb
            r0 = r17
            goto L_0x02aa
        L_0x02bb:
            r0 = 0
        L_0x02bc:
            int r0 = r0 + 1
            if (r0 <= r1) goto L_0x02c1
            r0 = r1
        L_0x02c1:
            java.lang.String r1 = r2.substring(r8, r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            boolean r0 = r1.equals(r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r14 = 8230(0x2026, float:1.1533E-41)
            if (r0 == 0) goto L_0x02d3
            if (r18 == 0) goto L_0x02eb
            goto L_0x02dc
        L_0x02d3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.append(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            goto L_0x02e4
        L_0x02dc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.append(r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x02e4:
            r0.append(r14)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            java.lang.String r2 = r0.toString()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x02eb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.<init>()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.append(r3)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0.append(r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            goto L_0x0201
        L_0x02f8:
            int r13 = r13 + 1
            goto L_0x0168
        L_0x02fc:
            int r1 = r15.A00     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            int r0 = r6.length()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            if (r1 == r0) goto L_0x030e
            java.lang.String r0 = r6.substring(r1)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.0qQ.A07(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r4.A09(r0)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
        L_0x030e:
            X.5Tq r2 = r4.A02()     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            X.9IV r1 = new X.9IV     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            r0 = r20
            r1.<init>((int) r5, (java.lang.Object) r0, (java.lang.Object) r2)     // Catch:{ IndexOutOfBoundsException -> 0x031a }
            return r1
        L_0x031a:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 817899461(0x30c027c5, float:1.3981142E-9)
            java.lang.String r0 = "LinkSpanUtil"
            X.0f9 r2 = r2.AEf(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r3.getMessage()
            r1.append(r0)
            java.lang.String r0 = " isReducedSpacing: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", text: "
            r1.append(r0)
            r0 = r38 ^ 1
            if (r0 == 0) goto L_0x0345
            r21 = r6
        L_0x0345:
            r0 = r21
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "message"
            r2.ABQ(r0, r1)
            r2.report()
            X.0sn r0 = X.0sn.A00
            X.5Tq r2 = new X.5Tq
            r2.<init>(r0, r0, r6)
            X.6Bf r1 = new X.6Bf
            r1.<init>()
            X.9IV r0 = new X.9IV
            r0.<init>((int) r5, (java.lang.Object) r1, (java.lang.Object) r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C303886Be.A00(java.lang.String, int, long, boolean):X.9IV");
    }
}
