package X;

import java.util.ArrayList;
import java.util.List;

public final class S73 {
    public int A00 = -1;
    public String A01;
    public String A02 = "";
    public String A03 = "";
    public String A04;
    public String A05;
    public List A06;
    public final List A07;

    public final void A01(String str) {
        ArrayList arrayList;
        String str2 = str;
        if (str != null) {
            arrayList = C11427STm.A03(C11427STm.A02(str2, " \"'<>#", 0, str.length(), true, false, true, true));
        } else {
            arrayList = null;
        }
        this.A06 = arrayList;
    }

    public final C11427STm A00() {
        if (this.A05 == null) {
            throw AnonymousClass7TE.A0z("scheme == null");
        } else if (this.A04 != null) {
            return new C11427STm(this);
        } else {
            throw AnonymousClass7TE.A0z("host == null");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0290, code lost:
        if (r9 <= 65535) goto L_0x0293;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r9 >= 'A') goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0058, code lost:
        if (r9 <= 'Z') goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a3, code lost:
        if (r9 > 'z') goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00a6, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a8, code lost:
        if (r3 >= r2) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
        r9 = r13.charAt(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ae, code lost:
        if (r9 >= 'a') goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b0, code lost:
        if (r9 >= 'A') goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b4, code lost:
        if (r9 < '0') goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00b8, code lost:
        if (r9 <= '9') goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00bc, code lost:
        if (r9 == ':') goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c1, code lost:
        if (r9 == '+') goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c5, code lost:
        if (r9 == '-') goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00c9, code lost:
        if (r9 != '.') goto L_0x005a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r25, X.C11427STm r26) {
        /*
            r24 = this;
            r13 = r25
            int r4 = r13.length()
            r6 = 0
            r0 = 0
            byte[] r1 = X.SUS.A07
        L_0x000a:
            if (r0 >= r4) goto L_0x00d3
            char r2 = r13.charAt(r0)
            r1 = 9
            if (r2 == r1) goto L_0x00cf
            r1 = 10
            if (r2 == r1) goto L_0x00cf
            r1 = 12
            if (r2 == r1) goto L_0x00cf
            r1 = 13
            if (r2 == r1) goto L_0x00cf
            r1 = 32
            if (r2 == r1) goto L_0x00cf
        L_0x0024:
            r3 = r0
        L_0x0025:
            int r4 = r4 + -1
            if (r4 < r0) goto L_0x00cc
            char r2 = r13.charAt(r4)
            r1 = 9
            if (r2 == r1) goto L_0x0025
            r1 = 10
            if (r2 == r1) goto L_0x0025
            r1 = 12
            if (r2 == r1) goto L_0x0025
            r1 = 13
            if (r2 == r1) goto L_0x0025
            r1 = 32
            if (r2 == r1) goto L_0x0025
            int r2 = r4 + 1
        L_0x0043:
            int r1 = r2 - r0
            r8 = 2
            if (r1 < r8) goto L_0x005a
            char r9 = r13.charAt(r0)
            r10 = 90
            r7 = 122(0x7a, float:1.71E-43)
            r5 = 65
            r4 = 97
            if (r9 >= r4) goto L_0x00a3
            if (r9 < r5) goto L_0x005a
        L_0x0058:
            if (r9 <= r10) goto L_0x00a6
        L_0x005a:
            r3 = -1
        L_0x005b:
            r4 = -1
            r1 = r24
            r7 = r26
            if (r3 == r4) goto L_0x009c
            r14 = 1
            r18 = 6
            java.lang.String r16 = "https:"
            r15 = r0
            r17 = r6
            boolean r5 = r13.regionMatches(r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x008b
            java.lang.String r3 = "https"
            r1.A05 = r3
            int r0 = r0 + 6
        L_0x0076:
            r9 = r0
            r10 = 0
        L_0x0078:
            if (r9 >= r2) goto L_0x00d6
            char r5 = r13.charAt(r9)
            r3 = 92
            if (r5 == r3) goto L_0x0086
            r3 = 47
            if (r5 != r3) goto L_0x00d6
        L_0x0086:
            int r10 = r10 + 1
            int r9 = r9 + 1
            goto L_0x0078
        L_0x008b:
            r18 = 5
            java.lang.String r16 = "http:"
            boolean r5 = r13.regionMatches(r14, r15, r16, r17, r18)
            if (r5 == 0) goto L_0x030c
            java.lang.String r3 = "http"
            r1.A05 = r3
            int r0 = r0 + 5
            goto L_0x0076
        L_0x009c:
            if (r26 == 0) goto L_0x0319
            java.lang.String r3 = r7.A03
            r1.A05 = r3
            goto L_0x0076
        L_0x00a3:
            if (r9 <= r7) goto L_0x00a6
            goto L_0x005a
        L_0x00a6:
            int r3 = r3 + 1
            if (r3 >= r2) goto L_0x005a
            char r9 = r13.charAt(r3)
            if (r9 >= r4) goto L_0x00a3
            if (r9 >= r5) goto L_0x0058
            r1 = 48
            if (r9 < r1) goto L_0x00bf
            r1 = 57
            if (r9 <= r1) goto L_0x00a6
            r1 = 58
            if (r9 == r1) goto L_0x005b
            goto L_0x005a
        L_0x00bf:
            r1 = 43
            if (r9 == r1) goto L_0x00a6
            r1 = 45
            if (r9 == r1) goto L_0x00a6
            r1 = 46
            if (r9 != r1) goto L_0x005a
            goto L_0x00a6
        L_0x00cc:
            r2 = r0
            goto L_0x0043
        L_0x00cf:
            int r0 = r0 + 1
            goto L_0x000a
        L_0x00d3:
            r0 = r4
            goto L_0x0024
        L_0x00d6:
            r5 = 63
            r3 = 35
            if (r10 >= r8) goto L_0x01cc
            if (r26 == 0) goto L_0x01cc
            java.lang.String r9 = r7.A03
            java.lang.String r8 = r1.A05
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x01cc
            java.lang.String r4 = r7.A09()
            r1.A03 = r4
            java.lang.String r4 = r7.A06()
            r1.A02 = r4
            java.lang.String r4 = r7.A02
            r1.A04 = r4
            int r4 = r7.A00
            r1.A00 = r4
            java.util.List r8 = r1.A07
            r8.clear()
            java.util.ArrayList r4 = r7.A0C()
            r8.addAll(r4)
            if (r0 == r2) goto L_0x0110
            char r4 = r13.charAt(r0)
            if (r4 != r3) goto L_0x0117
        L_0x0110:
            java.lang.String r4 = r7.A08()
            r1.A01(r4)
        L_0x0117:
            java.lang.String r4 = "?#"
            int r10 = X.SUS.A01(r13, r4, r0, r2)
            if (r0 == r10) goto L_0x02c5
            char r7 = r13.charAt(r0)
            r4 = 47
            java.lang.String r9 = ""
            r8 = 1
            if (r7 == r4) goto L_0x01c3
            r4 = 92
            if (r7 == r4) goto L_0x01c3
            java.util.List r7 = r1.A07
            int r4 = X.DbT.A02(r7, r8)
            r7.set(r4, r9)
        L_0x0137:
            r15 = r0
            if (r0 >= r10) goto L_0x02c5
            java.lang.String r4 = "/\\"
            int r0 = X.SUS.A01(r13, r4, r0, r10)
            boolean r12 = X.AnonymousClass7TF.A1T(r0, r10)
            java.lang.String r14 = " \"<>^`{}|/\\?#"
            r16 = r0
            r17 = r8
            r18 = r6
            r19 = r6
            r20 = r8
            java.lang.String r11 = X.C11427STm.A02(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r4 = "."
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x019c
            java.lang.String r4 = "%2e"
            boolean r4 = r11.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x019c
            java.lang.String r4 = ".."
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x01a5
            java.lang.String r4 = "%2e."
            boolean r4 = r11.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x01a5
            java.lang.String r4 = ".%2e"
            boolean r4 = r11.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x01a5
            java.lang.String r4 = "%2e%2e"
            boolean r4 = r11.equalsIgnoreCase(r4)
            if (r4 != 0) goto L_0x01a5
            java.lang.Object r4 = X.C66582MXn.A0r(r7)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x01a1
            int r4 = X.C51966G9m.A06(r7)
            r7.set(r4, r11)
        L_0x0197:
            if (r12 == 0) goto L_0x0137
        L_0x0199:
            r7.add(r9)
        L_0x019c:
            if (r12 == 0) goto L_0x0137
        L_0x019e:
            int r0 = r0 + 1
            goto L_0x0137
        L_0x01a1:
            r7.add(r11)
            goto L_0x0197
        L_0x01a5:
            int r4 = X.C51966G9m.A06(r7)
            java.lang.Object r4 = r7.remove(r4)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0199
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L_0x0199
            int r4 = X.C51966G9m.A06(r7)
            r7.set(r4, r9)
            goto L_0x019c
        L_0x01c3:
            java.util.List r7 = r1.A07
            r7.clear()
            r7.add(r9)
            goto L_0x019e
        L_0x01cc:
            int r0 = r0 + r10
            r15 = r0
            r12 = 0
            r11 = 0
        L_0x01d0:
            java.lang.String r0 = "@/\\?#"
            int r0 = X.SUS.A01(r13, r0, r15, r2)
            if (r0 == r2) goto L_0x0245
            char r8 = r13.charAt(r0)
            if (r8 == r4) goto L_0x0245
            if (r8 == r3) goto L_0x0245
            r7 = 47
            if (r8 == r7) goto L_0x0245
            r7 = 92
            if (r8 == r7) goto L_0x0245
            if (r8 == r5) goto L_0x0245
            r7 = 64
            if (r8 != r7) goto L_0x01d0
            java.lang.String r9 = "%40"
            if (r12 != 0) goto L_0x0200
            r10 = r15
            r8 = 58
        L_0x01f5:
            if (r10 >= r0) goto L_0x0219
            char r7 = r13.charAt(r10)
            if (r7 == r8) goto L_0x021a
            int r10 = r10 + 1
            goto L_0x01f5
        L_0x0200:
            java.lang.String r8 = r1.A02
            r17 = 1
            java.lang.String r14 = " \"':;<=>@[]^`{}|/\\?#"
            r16 = r0
            r18 = r6
            r19 = r6
            r20 = r17
            java.lang.String r7 = X.C11427STm.A02(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.String r7 = X.002.A0g(r8, r9, r7)
            r1.A02 = r7
            goto L_0x0242
        L_0x0219:
            r10 = r0
        L_0x021a:
            r17 = 1
            java.lang.String r14 = " \"':;<=>@[]^`{}|/\\?#"
            r19 = r6
            r20 = r17
            r18 = r6
            r16 = r10
            java.lang.String r8 = X.C11427STm.A02(r13, r14, r15, r16, r17, r18, r19, r20)
            if (r11 == 0) goto L_0x0232
            java.lang.String r7 = r1.A03
            java.lang.String r8 = X.002.A0g(r7, r9, r8)
        L_0x0232:
            r1.A03 = r8
            if (r10 == r0) goto L_0x0241
            int r15 = r10 + 1
            r16 = r0
            java.lang.String r7 = X.C11427STm.A02(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.A02 = r7
            r12 = 1
        L_0x0241:
            r11 = 1
        L_0x0242:
            int r15 = r0 + 1
            goto L_0x01d0
        L_0x0245:
            r7 = r15
        L_0x0246:
            if (r7 >= r0) goto L_0x0264
            char r9 = r13.charAt(r7)
            r8 = 58
            if (r9 == r8) goto L_0x0265
            r8 = 91
            if (r9 == r8) goto L_0x0257
        L_0x0254:
            int r7 = r7 + 1
            goto L_0x0246
        L_0x0257:
            int r7 = r7 + 1
            if (r7 >= r0) goto L_0x0254
            char r9 = r13.charAt(r7)
            r8 = 93
            if (r9 != r8) goto L_0x0257
            goto L_0x0254
        L_0x0264:
            r7 = r0
        L_0x0265:
            int r10 = r7 + 1
            java.lang.String r8 = X.C11427STm.A01(r13, r15, r7, r6)
            java.lang.String r8 = X.SUS.A03(r8)
            r1.A04 = r8
            if (r10 >= r0) goto L_0x02a8
            java.lang.String r17 = ""
            r23 = 1
            r16 = r13
            r18 = r10
            r19 = r0
            r20 = r6
            r21 = r6
            r22 = r6
            java.lang.String r8 = X.C11427STm.A02(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ NumberFormatException -> 0x0292 }
            int r9 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0292 }
            if (r9 <= 0) goto L_0x0292
            r8 = 65535(0xffff, float:9.1834E-41)
            if (r9 <= r8) goto L_0x0293
        L_0x0292:
            r9 = -1
        L_0x0293:
            r1.A00 = r9
            if (r9 != r4) goto L_0x02b0
            java.lang.String r2 = "Invalid URL port: \""
            java.lang.String r1 = r13.substring(r10, r0)
            r0 = 34
            java.lang.String r0 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x02a8:
            java.lang.String r4 = r1.A05
            int r4 = X.C11427STm.A00(r4)
            r1.A00 = r4
        L_0x02b0:
            java.lang.String r4 = r1.A04
            if (r4 != 0) goto L_0x0117
            java.lang.String r2 = "Invalid URL host: \""
            java.lang.String r1 = r13.substring(r15, r7)
            r0 = 34
            java.lang.String r0 = X.002.A0S(r2, r1, r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        L_0x02c5:
            if (r10 >= r2) goto L_0x02f3
            char r0 = r13.charAt(r10)
            if (r0 != r5) goto L_0x02f3
            r4 = r10
        L_0x02ce:
            if (r4 >= r2) goto L_0x02d9
            char r0 = r13.charAt(r4)
            if (r0 == r3) goto L_0x02da
            int r4 = r4 + 1
            goto L_0x02ce
        L_0x02d9:
            r4 = r2
        L_0x02da:
            int r15 = r10 + 1
            r17 = 1
            java.lang.String r14 = " \"'<>#"
            r19 = r17
            r20 = r17
            r16 = r4
            r18 = r6
            java.lang.String r0 = X.C11427STm.A02(r13, r14, r15, r16, r17, r18, r19, r20)
            java.util.ArrayList r0 = X.C11427STm.A03(r0)
            r1.A06 = r0
            r10 = r4
        L_0x02f3:
            if (r10 >= r2) goto L_0x030b
            char r0 = r13.charAt(r10)
            if (r0 != r3) goto L_0x030b
            int r9 = r10 + 1
            r11 = 1
            java.lang.String r8 = ""
            r7 = r13
            r10 = r2
            r12 = r6
            r13 = r6
            r14 = r6
            java.lang.String r0 = X.C11427STm.A02(r7, r8, r9, r10, r11, r12, r13, r14)
            r1.A01 = r0
        L_0x030b:
            return
        L_0x030c:
            java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
            java.lang.String r1 = r13.substring(r6, r3)
            java.lang.String r0 = "'"
            java.lang.IllegalArgumentException r0 = X.Pxg.A0c(r2, r1, r0)
            throw r0
        L_0x0319:
            java.lang.String r0 = "Expected URL scheme 'http' or 'https' but no colon was found"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S73.A02(java.lang.String, X.STm):void");
    }

    public S73() {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A07 = A1C;
        A1C.add("");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (r1 != X.C11427STm.A00(r4)) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        r6.append(':');
        r6.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r4 != null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String toString() {
        /*
            r7 = this;
            java.lang.StringBuilder r6 = X.AnonymousClass7TE.A1A()
            java.lang.String r4 = r7.A05
            if (r4 == 0) goto L_0x0085
            r6.append(r4)
            java.lang.String r0 = "://"
        L_0x000d:
            r6.append(r0)
            java.lang.String r1 = r7.A03
            boolean r0 = r1.isEmpty()
            r3 = 58
            if (r0 == 0) goto L_0x0022
            java.lang.String r0 = r7.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
        L_0x0022:
            r6.append(r1)
            java.lang.String r1 = r7.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0033
            r6.append(r3)
            r6.append(r1)
        L_0x0033:
            r0 = 64
            r6.append(r0)
        L_0x0038:
            java.lang.String r1 = r7.A04
            r2 = -1
            if (r1 == 0) goto L_0x0050
            int r0 = r1.indexOf(r3)
            if (r0 == r2) goto L_0x0081
            r0 = 91
            r6.append(r0)
            r6.append(r1)
            r0 = 93
            r6.append(r0)
        L_0x0050:
            int r1 = r7.A00
            if (r1 != r2) goto L_0x007e
            if (r4 == 0) goto L_0x0066
            int r1 = X.C11427STm.A00(r4)
        L_0x005a:
            int r0 = X.C11427STm.A00(r4)
            if (r1 == r0) goto L_0x0066
        L_0x0060:
            r6.append(r3)
            r6.append(r1)
        L_0x0066:
            java.util.List r3 = r7.A07
            int r2 = r3.size()
            r1 = 0
        L_0x006d:
            if (r1 >= r2) goto L_0x0088
            r0 = 47
            r6.append(r0)
            java.lang.String r0 = X.AnonymousClass7TE.A19(r3, r1)
            r6.append(r0)
            int r1 = r1 + 1
            goto L_0x006d
        L_0x007e:
            if (r4 == 0) goto L_0x0060
            goto L_0x005a
        L_0x0081:
            r6.append(r1)
            goto L_0x0050
        L_0x0085:
            java.lang.String r0 = "//"
            goto L_0x000d
        L_0x0088:
            java.util.List r5 = r7.A06
            if (r5 == 0) goto L_0x00b9
            r0 = 63
            r6.append(r0)
            int r4 = r5.size()
            r3 = 0
        L_0x0096:
            if (r3 >= r4) goto L_0x00b9
            java.lang.String r2 = X.AnonymousClass7TE.A19(r5, r3)
            int r0 = r3 + 1
            java.lang.String r1 = X.AnonymousClass7TE.A19(r5, r0)
            if (r3 <= 0) goto L_0x00a9
            r0 = 38
            r6.append(r0)
        L_0x00a9:
            r6.append(r2)
            if (r1 == 0) goto L_0x00b6
            r0 = 61
            r6.append(r0)
            r6.append(r1)
        L_0x00b6:
            int r3 = r3 + 2
            goto L_0x0096
        L_0x00b9:
            java.lang.String r1 = r7.A01
            if (r1 == 0) goto L_0x00c5
            r0 = 35
            r6.append(r0)
            r6.append(r1)
        L_0x00c5:
            java.lang.String r0 = r6.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S73.toString():java.lang.String");
    }
}
