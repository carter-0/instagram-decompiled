package X;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SfW  reason: case insensitive filesystem */
public final class C11735SfW implements C13684Tf1 {
    public static final Pattern A06 = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public float A00;
    public float A01;
    public Map A02;
    public final SFO A03;
    public final boolean A04;
    public final C11389SRd A05;

    public final /* synthetic */ void reset() {
    }

    public static long A01(String str) {
        Matcher matcher = A06.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x020b, code lost:
        if (r1 != 3) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c2, code lost:
        if (X.C11378SQq.A02(X.Pxe.A13(r3, r0)) == false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d2, code lost:
        if (X.C11378SQq.A02(X.Pxe.A13(r3, r15)) == false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01e2, code lost:
        if (X.C11378SQq.A02(X.Pxe.A13(r3, r8)) == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01f2, code lost:
        if (X.C11378SQq.A02(X.Pxe.A13(r3, r12)) == false) goto L_0x01f4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01fa A[Catch:{ RuntimeException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b8 A[Catch:{ RuntimeException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01c8 A[Catch:{ RuntimeException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01d8 A[Catch:{ RuntimeException -> 0x0223 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01e8 A[Catch:{ RuntimeException -> 0x0223 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(X.C11389SRd r43, java.nio.charset.Charset r44) {
        /*
            r42 = this;
        L_0x0000:
            r6 = r43
            r5 = r44
            java.lang.String r1 = r6.A0H(r5)
            if (r1 == 0) goto L_0x02b8
            java.lang.String r0 = "[Script Info]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r41 = r42
            if (r0 != 0) goto L_0x0246
            java.lang.String r0 = "[V4+ Styles]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0237
            r29 = 0
            r28 = 0
            r27 = 0
            r26 = 0
            r15 = 0
            r25 = 0
            r24 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r8 = 0
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            r17 = 0
        L_0x0033:
            java.lang.String r4 = r6.A0H(r5)
            if (r4 == 0) goto L_0x0231
            int r0 = X.Pxe.A06(r6)
            if (r0 == 0) goto L_0x005d
            com.google.common.collect.ImmutableSet r0 = X.C11389SRd.A03
            boolean r2 = r0.contains(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported charset: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            X.C11366SPh.A03(r2, r0)
            int r0 = X.C11389SRd.A00(r6, r5)
            int r0 = r0 >> 16
            char r1 = (char) r0
            r0 = 91
            if (r1 == r0) goto L_0x0231
        L_0x005d:
            java.lang.String r0 = "Format:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0125
            r0 = 7
            java.lang.String r1 = r4.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r4 = android.text.TextUtils.split(r1, r0)
            r3 = -1
            r2 = 0
            r1 = -1
            r23 = -1
            r22 = -1
            r21 = -1
            r20 = -1
            r19 = -1
            r18 = -1
            r16 = -1
            r11 = -1
            r10 = -1
        L_0x0083:
            int r0 = r4.length
            if (r2 >= r0) goto L_0x0108
            java.lang.String r0 = X.Pxe.A13(r4, r2)
            java.lang.String r9 = X.C256643w7.A00(r0)
            int r0 = r9.hashCode()
            switch(r0) {
                case -1178781136: goto L_0x00fd;
                case -1026963764: goto L_0x00f1;
                case -192095652: goto L_0x00e6;
                case -70925746: goto L_0x00da;
                case 3029637: goto L_0x00cf;
                case 3373707: goto L_0x00c4;
                case 366554320: goto L_0x00b9;
                case 767321349: goto L_0x00af;
                case 1767875043: goto L_0x00a4;
                case 1988365454: goto L_0x0098;
                default: goto L_0x0095;
            }
        L_0x0095:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0098:
            java.lang.String r0 = "outlinecolour"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r21 = r2
            goto L_0x0095
        L_0x00a4:
            java.lang.String r0 = "alignment"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r23 = r2
            goto L_0x0095
        L_0x00af:
            java.lang.String r0 = "borderstyle"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r10 = r2
            goto L_0x0095
        L_0x00b9:
            java.lang.String r0 = "fontsize"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r20 = r2
            goto L_0x0095
        L_0x00c4:
            java.lang.String r0 = "name"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r1 = r2
            goto L_0x0095
        L_0x00cf:
            java.lang.String r0 = "bold"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r19 = r2
            goto L_0x0095
        L_0x00da:
            java.lang.String r0 = "primarycolour"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r22 = r2
            goto L_0x0095
        L_0x00e6:
            java.lang.String r0 = "strikeout"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r11 = r2
            goto L_0x0095
        L_0x00f1:
            java.lang.String r0 = "underline"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r16 = r2
            goto L_0x0095
        L_0x00fd:
            java.lang.String r0 = "italic"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0095
            r18 = r2
            goto L_0x0095
        L_0x0108:
            r17 = 0
            if (r1 == r3) goto L_0x0033
            r17 = 1
            r24 = r1
            r29 = r23
            r13 = r22
            r14 = r21
            r26 = r20
            r28 = r19
            r15 = r18
            r8 = r16
            r12 = r11
            r27 = r10
            r25 = r0
            goto L_0x0033
        L_0x0125:
            java.lang.String r0 = "Style:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0033
            if (r17 != 0) goto L_0x013c
            java.lang.String r0 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r1 = X.002.A0R(r0, r4)
            java.lang.String r0 = "SsaParser"
            X.STH.A03(r0, r1)
            goto L_0x0033
        L_0x013c:
            r0 = 6
            java.lang.String r1 = r4.substring(r0)
            java.lang.String r0 = ","
            java.lang.String[] r3 = android.text.TextUtils.split(r1, r0)
            int r9 = r3.length
            java.lang.String r2 = "SsaStyle"
            r32 = 0
            r16 = 1
            r0 = r25
            if (r9 == r0) goto L_0x016b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r0, r4}
            java.lang.String r1 = "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'"
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r0 = java.lang.String.format(r0, r1, r3)
            X.STH.A03(r2, r0)
            goto L_0x0033
        L_0x016b:
            r0 = r24
            java.lang.String r33 = X.Pxe.A13(r3, r0)     // Catch:{ RuntimeException -> 0x0223 }
            r1 = -1
            r0 = r29
            if (r0 == r1) goto L_0x017f
            java.lang.String r0 = X.Pxe.A13(r3, r0)     // Catch:{ RuntimeException -> 0x0223 }
            int r35 = X.C11378SQq.A00(r0)     // Catch:{ RuntimeException -> 0x0223 }
            goto L_0x0181
        L_0x017f:
            r35 = -1
        L_0x0181:
            if (r13 == r1) goto L_0x018c
            java.lang.String r0 = X.Pxe.A13(r3, r13)     // Catch:{ RuntimeException -> 0x0223 }
            java.lang.Integer r31 = X.C11378SQq.A01(r0)     // Catch:{ RuntimeException -> 0x0223 }
            goto L_0x018e
        L_0x018c:
            r31 = r32
        L_0x018e:
            if (r14 == r1) goto L_0x0198
            java.lang.String r0 = X.Pxe.A13(r3, r14)     // Catch:{ RuntimeException -> 0x0223 }
            java.lang.Integer r32 = X.C11378SQq.A01(r0)     // Catch:{ RuntimeException -> 0x0223 }
        L_0x0198:
            r0 = r26
            if (r0 == r1) goto L_0x01b1
            java.lang.String r11 = X.Pxe.A13(r3, r0)     // Catch:{ RuntimeException -> 0x0223 }
            float r34 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x01a5 }
            goto L_0x01b4
        L_0x01a5:
            r10 = move-exception
            java.lang.String r9 = "Failed to parse font size: '"
            java.lang.String r0 = "'"
            java.lang.String r0 = X.002.A0g(r9, r11, r0)     // Catch:{ RuntimeException -> 0x0223 }
            X.STH.A05(r2, r0, r10)     // Catch:{ RuntimeException -> 0x0223 }
        L_0x01b1:
            r34 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x01b4:
            r0 = r28
            if (r0 == r1) goto L_0x01c4
            java.lang.String r0 = X.Pxe.A13(r3, r0)     // Catch:{ RuntimeException -> 0x0223 }
            boolean r0 = X.C11378SQq.A02(r0)     // Catch:{ RuntimeException -> 0x0223 }
            r37 = 1
            if (r0 != 0) goto L_0x01c6
        L_0x01c4:
            r37 = 0
        L_0x01c6:
            if (r15 == r1) goto L_0x01d4
            java.lang.String r0 = X.Pxe.A13(r3, r15)     // Catch:{ RuntimeException -> 0x0223 }
            boolean r0 = X.C11378SQq.A02(r0)     // Catch:{ RuntimeException -> 0x0223 }
            r38 = 1
            if (r0 != 0) goto L_0x01d6
        L_0x01d4:
            r38 = 0
        L_0x01d6:
            if (r8 == r1) goto L_0x01e4
            java.lang.String r0 = X.Pxe.A13(r3, r8)     // Catch:{ RuntimeException -> 0x0223 }
            boolean r0 = X.C11378SQq.A02(r0)     // Catch:{ RuntimeException -> 0x0223 }
            r39 = 1
            if (r0 != 0) goto L_0x01e6
        L_0x01e4:
            r39 = 0
        L_0x01e6:
            if (r12 == r1) goto L_0x01f4
            java.lang.String r0 = X.Pxe.A13(r3, r12)     // Catch:{ RuntimeException -> 0x0223 }
            boolean r0 = X.C11378SQq.A02(r0)     // Catch:{ RuntimeException -> 0x0223 }
            r40 = 1
            if (r0 != 0) goto L_0x01f6
        L_0x01f4:
            r40 = 0
        L_0x01f6:
            r0 = r27
            if (r0 == r1) goto L_0x0212
            java.lang.String r3 = X.Pxe.A13(r3, r0)     // Catch:{ RuntimeException -> 0x0223 }
            java.lang.String r0 = r3.trim()     // Catch:{ NumberFormatException -> 0x020d }
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x020d }
            r0 = r16
            if (r1 == r0) goto L_0x0213
            r0 = 3
            if (r1 == r0) goto L_0x0213
        L_0x020d:
            java.lang.String r0 = "Ignoring unknown BorderStyle: "
            X.Pxh.A1J(r0, r3, r2)     // Catch:{ RuntimeException -> 0x0223 }
        L_0x0212:
            r1 = -1
        L_0x0213:
            X.SQq r0 = new X.SQq     // Catch:{ RuntimeException -> 0x0223 }
            r30 = r0
            r36 = r1
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ RuntimeException -> 0x0223 }
            java.lang.String r1 = r0.A05
            r7.put(r1, r0)
            goto L_0x0033
        L_0x0223:
            r3 = move-exception
            java.lang.String r1 = "Skipping malformed 'Style:' line: '"
            java.lang.String r0 = "'"
            java.lang.String r0 = X.002.A0g(r1, r4, r0)
            X.STH.A05(r2, r0, r3)
            goto L_0x0033
        L_0x0231:
            r0 = r41
            r0.A02 = r7
            goto L_0x0000
        L_0x0237:
            java.lang.String r0 = "[V4 Styles]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x02b0
            java.lang.String r0 = "[V4 Styles] are not supported"
            X.STH.A01(r0)
            goto L_0x0000
        L_0x0246:
            java.lang.String r3 = r6.A0H(r5)
            if (r3 == 0) goto L_0x0000
            int r0 = X.Pxe.A06(r6)
            if (r0 == 0) goto L_0x0270
            com.google.common.collect.ImmutableSet r0 = X.C11389SRd.A03
            boolean r2 = r0.contains(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported charset: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r5, r0, r1)
            X.C11366SPh.A03(r2, r0)
            int r0 = X.C11389SRd.A00(r6, r5)
            int r0 = r0 >> 16
            char r1 = (char) r0
            r0 = 91
            if (r1 == r0) goto L_0x0000
        L_0x0270:
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r3.split(r0)
            int r1 = r3.length
            r0 = 2
            if (r1 != r0) goto L_0x0246
            r0 = 0
            java.lang.String r0 = X.Pxe.A13(r3, r0)
            java.lang.String r2 = X.C256643w7.A00(r0)
            java.lang.String r0 = "playresx"
            boolean r0 = r2.equals(r0)
            r1 = 1
            if (r0 != 0) goto L_0x02a3
            java.lang.String r0 = "playresy"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0246
            java.lang.String r0 = X.Pxe.A13(r3, r1)     // Catch:{ NumberFormatException -> 0x0246 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0246 }
            r0 = r41
            r0.A00 = r1     // Catch:{ NumberFormatException -> 0x0246 }
            goto L_0x0246
        L_0x02a3:
            java.lang.String r0 = X.Pxe.A13(r3, r1)     // Catch:{ NumberFormatException -> 0x0246 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x0246 }
            r0 = r41
            r0.A01 = r1     // Catch:{ NumberFormatException -> 0x0246 }
            goto L_0x0246
        L_0x02b0:
            java.lang.String r0 = "[Events]"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0000
        L_0x02b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11735SfW.A02(X.SRd, java.nio.charset.Charset):void");
    }

    public C11735SfW(List list) {
        this.A01 = -3.4028235E38f;
        this.A00 = -3.4028235E38f;
        this.A05 = new C11389SRd();
        if (list == null || list.isEmpty()) {
            this.A04 = false;
            this.A03 = null;
            return;
        }
        this.A04 = true;
        Charset charset = AnonymousClass2RN.A05;
        String str = new String((byte[]) list.get(0), charset);
        C11366SPh.A01(str.startsWith("Format:"));
        SFO A002 = SFO.A00(str);
        A002.getClass();
        this.A03 = A002;
        A02(new C11389SRd((byte[]) list.get(1)), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r0 = X.AnonymousClass7TE.A1C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r5.add(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r0 = X.AnonymousClass7TE.A1D((java.util.Collection) r5.get(r3 - 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r4.add(r3, java.lang.Long.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r3 != 0) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A00(java.util.List r4, java.util.List r5, long r6) {
        /*
            int r3 = r4.size()
        L_0x0004:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x0038
            long r1 = X.Pxg.A0I(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            long r1 = X.Pxg.A0I(r4, r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0004
            int r3 = r3 + 1
        L_0x001a:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r4.add(r3, r0)
            if (r3 != 0) goto L_0x002b
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
        L_0x0027:
            r5.add(r3, r0)
        L_0x002a:
            return r3
        L_0x002b:
            int r0 = r3 + -1
            java.lang.Object r0 = r5.get(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            goto L_0x0027
        L_0x0038:
            r3 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11735SfW.A00(java.util.List, java.util.List, long):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:32|33|34|(2:(2:37|40)|41)(5:(1:39)|43|44|(2:48|154)|150)|42|43|44|46|48|154|150|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0112 */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01d4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1l(X.C13507TbY r41, X.C11115SAs r42, byte[] r43, int r44, int r45) {
        /*
            r40 = this;
            java.util.ArrayList r23 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            r7 = r40
            X.SRd r9 = r7.A05
            r1 = r44
            int r0 = r44 + r45
            r2 = r43
            r9.A0Q(r2, r0)
            r9.A0O(r1)
            java.nio.charset.Charset r8 = r9.A0J()
            if (r8 != 0) goto L_0x0020
            java.nio.charset.Charset r8 = X.AnonymousClass2RN.A05
        L_0x0020:
            boolean r0 = r7.A04
            if (r0 != 0) goto L_0x0291
            r7.A02(r9, r8)
            r6 = 0
        L_0x0028:
            java.lang.String r4 = r9.A0H(r8)
            if (r4 == 0) goto L_0x0295
            java.lang.String r0 = "Format:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x003b
            X.SFO r6 = X.SFO.A00(r4)
            goto L_0x0028
        L_0x003b:
            java.lang.String r0 = "Dialogue:"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0028
            if (r6 != 0) goto L_0x0051
            java.lang.String r0 = "Skipping dialogue line before complete format: "
            java.lang.String r1 = X.002.A0R(r0, r4)
            java.lang.String r0 = "SsaParser"
            X.STH.A03(r0, r1)
            goto L_0x0028
        L_0x0051:
            r0 = 9
            java.lang.String r2 = r4.substring(r0)
            int r1 = r6.A01
            java.lang.String r0 = ","
            java.lang.String[] r3 = r2.split(r0, r1)
            int r0 = r3.length
            java.lang.String r2 = "SsaParser"
            if (r0 == r1) goto L_0x0072
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r1 = "Skipping dialogue line with fewer columns than format: "
        L_0x006a:
            java.lang.String r0 = X.Pxg.A0s(r1, r4, r0)
            X.STH.A03(r2, r0)
            goto L_0x0028
        L_0x0072:
            int r0 = r6.A02
            r0 = r3[r0]
            long r18 = A01(r0)
            java.lang.String r1 = "Skipping invalid timing: "
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0130
            int r0 = r6.A00
            r0 = r3[r0]
            long r16 = A01(r0)
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0130
            java.util.Map r2 = r7.A02
            if (r2 == 0) goto L_0x012d
            int r1 = r6.A03
            r0 = -1
            if (r1 == r0) goto L_0x012d
            java.lang.String r0 = X.Pxe.A13(r3, r1)
            java.lang.Object r2 = r2.get(r0)
            X.SQq r2 = (X.C11378SQq) r2
        L_0x00a4:
            int r0 = r6.A04
            r12 = r3[r0]
            java.util.regex.Pattern r10 = X.C10120Rmw.A01
            java.util.regex.Matcher r5 = r10.matcher(r12)
            r22 = -1
            r14 = 0
            r21 = -1
        L_0x00b3:
            boolean r0 = r5.find()
            if (r0 == 0) goto L_0x0136
            r13 = 1
            java.lang.String r4 = X.Pxf.A0o(r5, r13)
            java.util.regex.Pattern r0 = X.C10120Rmw.A03     // Catch:{ RuntimeException -> 0x0112 }
            java.util.regex.Matcher r15 = r0.matcher(r4)     // Catch:{ RuntimeException -> 0x0112 }
            java.util.regex.Pattern r0 = X.C10120Rmw.A02     // Catch:{ RuntimeException -> 0x0112 }
            java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch:{ RuntimeException -> 0x0112 }
            boolean r20 = r15.find()     // Catch:{ RuntimeException -> 0x0112 }
            boolean r1 = r0.find()     // Catch:{ RuntimeException -> 0x0112 }
            r3 = 2
            if (r20 == 0) goto L_0x00d8
            if (r1 == 0) goto L_0x00ee
            goto L_0x00e3
        L_0x00d8:
            if (r1 == 0) goto L_0x0112
            java.lang.String r20 = r0.group(r13)     // Catch:{ RuntimeException -> 0x0112 }
            java.lang.String r1 = r0.group(r3)     // Catch:{ RuntimeException -> 0x0112 }
            goto L_0x00f6
        L_0x00e3:
            java.lang.String r1 = "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='"
            java.lang.String r0 = "'"
            java.lang.String r0 = X.002.A0g(r1, r4, r0)     // Catch:{ RuntimeException -> 0x0112 }
            X.STH.A01(r0)     // Catch:{ RuntimeException -> 0x0112 }
        L_0x00ee:
            java.lang.String r20 = r15.group(r13)     // Catch:{ RuntimeException -> 0x0112 }
            java.lang.String r1 = r15.group(r3)     // Catch:{ RuntimeException -> 0x0112 }
        L_0x00f6:
            r20.getClass()     // Catch:{ RuntimeException -> 0x0112 }
            java.lang.String r0 = r20.trim()     // Catch:{ RuntimeException -> 0x0112 }
            float r3 = java.lang.Float.parseFloat(r0)     // Catch:{ RuntimeException -> 0x0112 }
            r1.getClass()     // Catch:{ RuntimeException -> 0x0112 }
            java.lang.String r0 = r1.trim()     // Catch:{ RuntimeException -> 0x0112 }
            float r1 = java.lang.Float.parseFloat(r0)     // Catch:{ RuntimeException -> 0x0112 }
            android.graphics.PointF r0 = new android.graphics.PointF     // Catch:{ RuntimeException -> 0x0112 }
            r0.<init>(r3, r1)     // Catch:{ RuntimeException -> 0x0112 }
            r14 = r0
        L_0x0112:
            java.util.regex.Pattern r0 = X.C10120Rmw.A00     // Catch:{ RuntimeException -> 0x00b3 }
            java.util.regex.Matcher r0 = r0.matcher(r4)     // Catch:{ RuntimeException -> 0x00b3 }
            boolean r1 = r0.find()     // Catch:{ RuntimeException -> 0x00b3 }
            if (r1 == 0) goto L_0x00b3
            java.lang.String r0 = X.Pxf.A0o(r0, r13)     // Catch:{ RuntimeException -> 0x00b3 }
            int r1 = X.C11378SQq.A00(r0)     // Catch:{ RuntimeException -> 0x00b3 }
            r0 = r22
            if (r1 == r0) goto L_0x00b3
            r21 = r1
            goto L_0x00b3
        L_0x012d:
            r2 = 0
            goto L_0x00a4
        L_0x0130:
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            goto L_0x006a
        L_0x0136:
            java.util.regex.Matcher r1 = r10.matcher(r12)
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)
            java.lang.String r0 = "\\N"
            java.lang.String r3 = "\n"
            java.lang.String r1 = r1.replace(r0, r3)
            java.lang.String r0 = "\\n"
            java.lang.String r3 = r1.replace(r0, r3)
            java.lang.String r1 = "\\h"
            java.lang.String r0 = " "
            java.lang.String r0 = r3.replace(r1, r0)
            float r15 = r7.A01
            float r10 = r7.A00
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r0)
            r25 = 0
            r38 = -2147483648(0xffffffff80000000, float:-0.0)
            r31 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r32 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = 0
            if (r2 == 0) goto L_0x01e0
            java.lang.Integer r0 = r2.A04
            r3 = 33
            if (r0 == 0) goto L_0x0183
            int r0 = r0.intValue()
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r5.length()
            r5.setSpan(r1, r4, r0, r3)
        L_0x0183:
            int r0 = r2.A02
            r1 = 3
            if (r0 != r1) goto L_0x019c
            java.lang.Integer r0 = r2.A03
            if (r0 == 0) goto L_0x019c
            int r12 = r0.intValue()
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r12)
            int r12 = r5.length()
            r5.setSpan(r0, r4, r12, r3)
        L_0x019c:
            float r0 = r2.A00
            r13 = 1
            int r12 = (r0 > r31 ? 1 : (r0 == r31 ? 0 : -1))
            if (r12 == 0) goto L_0x01ac
            int r12 = (r10 > r31 ? 1 : (r10 == r31 ? 0 : -1))
            if (r12 == 0) goto L_0x01ac
            float r0 = r0 / r10
            r31 = r0
            r38 = 1
        L_0x01ac:
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0281
            boolean r12 = r2.A07
            if (r12 == 0) goto L_0x0281
        L_0x01b4:
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
        L_0x01b9:
            int r1 = r5.length()
            r5.setSpan(r0, r4, r1, r3)
        L_0x01c0:
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x01d0
            android.text.style.UnderlineSpan r1 = new android.text.style.UnderlineSpan
            r1.<init>()
            int r0 = r5.length()
            r5.setSpan(r1, r4, r0, r3)
        L_0x01d0:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x01e0
            android.text.style.StrikethroughSpan r1 = new android.text.style.StrikethroughSpan
            r1.<init>()
            int r0 = r5.length()
            r5.setSpan(r1, r4, r0, r3)
        L_0x01e0:
            r0 = -1
            r3 = r21
            if (r3 == r0) goto L_0x027b
            r0 = r3
        L_0x01e6:
            r26 = 0
            switch(r0) {
                case -1: goto L_0x01ed;
                case 0: goto L_0x01eb;
                case 1: goto L_0x0277;
                case 2: goto L_0x0273;
                case 3: goto L_0x01eb;
                case 4: goto L_0x0277;
                case 5: goto L_0x0273;
                case 6: goto L_0x01eb;
                case 7: goto L_0x0277;
                case 8: goto L_0x0273;
                default: goto L_0x01eb;
            }
        L_0x01eb:
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x01ed:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L_0x01f3;
                case 0: goto L_0x01f2;
                case 1: goto L_0x0271;
                case 2: goto L_0x026f;
                case 3: goto L_0x01f2;
                case 4: goto L_0x0271;
                case 5: goto L_0x026f;
                case 6: goto L_0x01f2;
                case 7: goto L_0x0271;
                case 8: goto L_0x026f;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            r3 = 2
        L_0x01f3:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            switch(r0) {
                case -1: goto L_0x01f9;
                case 0: goto L_0x01f8;
                case 1: goto L_0x026d;
                case 2: goto L_0x026d;
                case 3: goto L_0x026d;
                case 4: goto L_0x026b;
                case 5: goto L_0x026b;
                case 6: goto L_0x026b;
                default: goto L_0x01f8;
            }
        L_0x01f8:
            r2 = 0
        L_0x01f9:
            if (r14 == 0) goto L_0x0240
            int r0 = (r10 > r32 ? 1 : (r10 == r32 ? 0 : -1))
            if (r0 == 0) goto L_0x0240
            int r0 = (r15 > r32 ? 1 : (r15 == r32 ? 0 : -1))
            if (r0 == 0) goto L_0x0240
            float r1 = r14.x
            float r1 = r1 / r15
            float r0 = r14.y
            float r0 = r0 / r10
        L_0x0209:
            r39 = -2147483648(0xffffffff80000000, float:-0.0)
            r34 = 0
            X.SIh r10 = new X.SIh
            r24 = r10
            r27 = r25
            r28 = r5
            r29 = r0
            r30 = r1
            r33 = r32
            r35 = r4
            r36 = r2
            r37 = r3
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r0 = r18
            r2 = r23
            int r3 = A00(r11, r2, r0)
            r0 = r16
            int r1 = A00(r11, r2, r0)
        L_0x0232:
            if (r3 >= r1) goto L_0x0028
            java.lang.Object r0 = r2.get(r3)
            java.util.List r0 = (java.util.List) r0
            r0.add(r10)
            int r3 = r3 + 1
            goto L_0x0232
        L_0x0240:
            if (r3 == 0) goto L_0x0260
            r0 = 1
            if (r3 == r0) goto L_0x025d
            r0 = 2
            r1 = 1064514355(0x3f733333, float:0.95)
            if (r3 == r0) goto L_0x024e
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        L_0x024e:
            if (r2 == 0) goto L_0x0267
            r0 = 1
            if (r2 == r0) goto L_0x0264
            r10 = 2
            r0 = 1064514355(0x3f733333, float:0.95)
            if (r2 == r10) goto L_0x0209
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            goto L_0x0209
        L_0x025d:
            r1 = 1056964608(0x3f000000, float:0.5)
            goto L_0x024e
        L_0x0260:
            r1 = 1028443341(0x3d4ccccd, float:0.05)
            goto L_0x024e
        L_0x0264:
            r0 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0209
        L_0x0267:
            r0 = 1028443341(0x3d4ccccd, float:0.05)
            goto L_0x0209
        L_0x026b:
            r2 = 1
            goto L_0x01f9
        L_0x026d:
            r2 = 2
            goto L_0x01f9
        L_0x026f:
            r3 = 1
            goto L_0x01f3
        L_0x0271:
            r3 = 0
            goto L_0x01f3
        L_0x0273:
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01ed
        L_0x0277:
            android.text.Layout$Alignment r26 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x01ed
        L_0x027b:
            if (r2 == 0) goto L_0x01e6
            int r0 = r2.A01
            goto L_0x01e6
        L_0x0281:
            if (r0 == 0) goto L_0x028a
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r13)
            goto L_0x01b9
        L_0x028a:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x01c0
            r1 = 2
            goto L_0x01b4
        L_0x0291:
            X.SFO r6 = r7.A03
            goto L_0x0028
        L_0x0295:
            r2 = 0
        L_0x0296:
            int r0 = r23.size()
            if (r2 >= r0) goto L_0x02e0
            r0 = r23
            java.lang.Object r4 = r0.get(r2)
            java.util.List r4 = (java.util.List) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x02af
            if (r2 == 0) goto L_0x02af
        L_0x02ac:
            int r2 = r2 + 1
            goto L_0x0296
        L_0x02af:
            int r0 = X.Pxe.A0A(r23)
            if (r2 == r0) goto L_0x02db
            java.lang.Object r0 = r11.get(r2)
            long r5 = X.AnonymousClass7TE.A0R(r0)
            int r0 = r2 + 1
            java.lang.Object r0 = r11.get(r0)
            long r7 = X.AnonymousClass7TE.A0R(r0)
            java.lang.Object r0 = r11.get(r2)
            long r0 = X.AnonymousClass7TE.A0R(r0)
            long r7 = r7 - r0
            X.RtS r3 = new X.RtS
            r3.<init>(r4, r5, r7)
            r0 = r41
            r0.accept(r3)
            goto L_0x02ac
        L_0x02db:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        L_0x02e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11735SfW.E1l(X.TbY, X.SAs, byte[], int, int):void");
    }

    public C11735SfW() {
        this((List) null);
    }
}
