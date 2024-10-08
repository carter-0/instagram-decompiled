package X;

/* renamed from: X.QoN  reason: case insensitive filesystem */
public final class C8321QoN extends C296725qX {
    public final AnonymousClass4XV A00 = new AnonymousClass4XV();
    public final S3H A01 = new S3H();
    public final boolean A02 = 2BY.A02(2BQ.A1N);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01f4, code lost:
        if (r2 != 5) goto L_0x01f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0238, code lost:
        if (r25 == 0) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x02b5, code lost:
        X.2AG.A04("WebvttCueParser", X.002.A0g("ignoring unsupported entity: '&", r1, ";'"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x02c2, code lost:
        if (r0 != r8) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x02c4, code lost:
        r5.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x02c9, code lost:
        r2 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x02f9, code lost:
        r5.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a9, code lost:
        if (r5.equals(r0) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b5, code lost:
        r26 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        r8 = r8.substring(0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        X.Pxh.A1M("Invalid alignment value: ", r8, "WebvttCueParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        if (r8.equals(r0) != false) goto L_0x0119;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0119, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x015c, code lost:
        if (r5.equals(r0) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0165, code lost:
        if (r5.equals(r0) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016e, code lost:
        if (r5.equals(r0) == false) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0174, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0176, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0178, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0179, code lost:
        r8 = X.Pxe.A0x(r8, r6);
     */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C264814Rj A00(X.AnonymousClass4XV r31, int r32) {
        /*
            r11 = r32
            r19 = 0
            r22 = 0
            r4 = 0
            r26 = 0
            r25 = 0
            r21 = 0
            r3 = 0
            r23 = 0
            r18 = 0
            r28 = 0
            r30 = 0
            r29 = 0
            r17 = 0
        L_0x001a:
            if (r11 <= 0) goto L_0x0427
            r0 = 8
            if (r11 < r0) goto L_0x041f
            r5 = r31
            int r2 = r5.A01()
            int r1 = r5.A01()
            int r11 = r11 + -8
            int r2 = r2 - r0
            byte[] r7 = r5.A02
            int r6 = r5.A01
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            java.lang.String r0 = X.Pxe.A11(r0, r7, r6, r2)
            r5.A0H(r2)
            int r11 = r11 - r2
            r2 = 1937011815(0x73747467, float:1.9367696E31)
            if (r1 != r2) goto L_0x0262
            r2 = 2
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r25 = 1
            r26 = 0
            r21 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r9 = "WebvttCueParser"
            java.util.regex.Pattern r5 = X.SMz.A03
            java.util.regex.Matcher r10 = r5.matcher(r0)
        L_0x0059:
            boolean r0 = r10.find()
            if (r0 == 0) goto L_0x01d5
            r0 = 1
            java.lang.String r6 = X.Pxf.A0o(r10, r0)
            r0 = 2
            java.lang.String r8 = X.Pxf.A0o(r10, r0)
            java.lang.String r0 = "line"
            boolean r0 = r0.equals(r6)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x00d1
            r0 = 44
            int r7 = r8.indexOf(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            r6 = 0
            r0 = -1
            if (r7 == r0) goto L_0x00bb
            java.lang.String r5 = X.Pxe.A0v(r7, r8)     // Catch:{ NumberFormatException -> 0x01ca }
            int r0 = r5.hashCode()     // Catch:{ NumberFormatException -> 0x01ca }
            switch(r0) {
                case -1364013995: goto L_0x00a3;
                case -1074341483: goto L_0x009f;
                case 100571: goto L_0x0096;
                case 109757538: goto L_0x008c;
                default: goto L_0x0086;
            }     // Catch:{ NumberFormatException -> 0x01ca }
        L_0x0086:
            java.lang.String r0 = "Invalid anchor value: "
            X.Pxh.A1M(r0, r5, r9)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x00ac
        L_0x008c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0086
            goto L_0x00af
        L_0x0096:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0086
            goto L_0x00b2
        L_0x009f:
            java.lang.String r0 = "middle"
            goto L_0x00a5
        L_0x00a3:
            java.lang.String r0 = "center"
        L_0x00a5:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0086
            goto L_0x00b5
        L_0x00ac:
            r26 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x00b7
        L_0x00af:
            r26 = 0
            goto L_0x00b7
        L_0x00b2:
            r26 = 2
            goto L_0x00b7
        L_0x00b5:
            r26 = 1
        L_0x00b7:
            java.lang.String r8 = r8.substring(r6, r7)     // Catch:{ NumberFormatException -> 0x01ca }
        L_0x00bb:
            java.lang.String r0 = "%"
            boolean r0 = r8.endsWith(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x00c8
            float r4 = X.C11138SBt.A00(r8)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x00ce
        L_0x00c8:
            int r0 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01ca }
            float r4 = (float) r0     // Catch:{ NumberFormatException -> 0x01ca }
            r6 = 1
        L_0x00ce:
            r25 = r6
            goto L_0x0059
        L_0x00d1:
            java.lang.String r0 = "align"
            boolean r0 = r0.equals(r6)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0128
            int r0 = r8.hashCode()     // Catch:{ NumberFormatException -> 0x01ca }
            switch(r0) {
                case -1364013995: goto L_0x00e6;
                case -1074341483: goto L_0x00e9;
                case 100571: goto L_0x00f3;
                case 3317767: goto L_0x00fc;
                case 108511772: goto L_0x0105;
                case 109757538: goto L_0x010f;
                default: goto L_0x00e0;
            }     // Catch:{ NumberFormatException -> 0x01ca }
        L_0x00e0:
            java.lang.String r0 = "Invalid alignment value: "
            X.Pxh.A1M(r0, r8, r9)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x0119
        L_0x00e6:
            java.lang.String r0 = "center"
            goto L_0x00ec
        L_0x00e9:
            java.lang.String r0 = "middle"
        L_0x00ec:
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 != 0) goto L_0x0119
            goto L_0x00e0
        L_0x00f3:
            java.lang.String r0 = "end"
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x00e0
            goto L_0x011c
        L_0x00fc:
            java.lang.String r0 = "left"
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x00e0
            goto L_0x011f
        L_0x0105:
            java.lang.String r0 = "right"
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x00e0
            goto L_0x0122
        L_0x010f:
            java.lang.String r0 = "start"
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x00e0
            goto L_0x0125
        L_0x0119:
            r2 = 2
            goto L_0x0059
        L_0x011c:
            r2 = 3
            goto L_0x0059
        L_0x011f:
            r2 = 4
            goto L_0x0059
        L_0x0122:
            r2 = 5
            goto L_0x0059
        L_0x0125:
            r2 = 1
            goto L_0x0059
        L_0x0128:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r6)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0183
            r0 = 44
            int r6 = r8.indexOf(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            r0 = -1
            if (r6 == r0) goto L_0x017d
            java.lang.String r5 = X.Pxe.A0v(r6, r8)     // Catch:{ NumberFormatException -> 0x01ca }
            int r0 = r5.hashCode()     // Catch:{ NumberFormatException -> 0x01ca }
            switch(r0) {
                case -1842484672: goto L_0x0168;
                case -1364013995: goto L_0x015f;
                case -1276788989: goto L_0x0156;
                case -1074341483: goto L_0x0152;
                case 100571: goto L_0x014f;
                case 109757538: goto L_0x014b;
                default: goto L_0x0145;
            }     // Catch:{ NumberFormatException -> 0x01ca }
        L_0x0145:
            java.lang.String r0 = "Invalid anchor value: "
            X.Pxh.A1M(r0, r5, r9)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x0171
        L_0x014b:
            java.lang.String r0 = "start"
            goto L_0x016a
        L_0x014f:
            java.lang.String r0 = "end"
            goto L_0x0158
        L_0x0152:
            java.lang.String r0 = "middle"
            goto L_0x0161
        L_0x0156:
            java.lang.String r0 = "line-right"
        L_0x0158:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0145
            goto L_0x0174
        L_0x015f:
            java.lang.String r0 = "center"
        L_0x0161:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0145
            goto L_0x0176
        L_0x0168:
            java.lang.String r0 = "line-left"
        L_0x016a:
            boolean r0 = r5.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0145
            goto L_0x0178
        L_0x0171:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0179
        L_0x0174:
            r3 = 2
            goto L_0x0179
        L_0x0176:
            r3 = 1
            goto L_0x0179
        L_0x0178:
            r3 = 0
        L_0x0179:
            java.lang.String r8 = X.Pxe.A0x(r8, r6)     // Catch:{ NumberFormatException -> 0x01ca }
        L_0x017d:
            float r21 = X.C11138SBt.A00(r8)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x0059
        L_0x0183:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r6)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x0192
            float r1 = X.C11138SBt.A00(r8)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x0059
        L_0x0192:
            java.lang.String r0 = "vertical"
            boolean r0 = r0.equals(r6)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = "lr"
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 != 0) goto L_0x01b9
            java.lang.String r0 = "rl"
            boolean r0 = r8.equals(r0)     // Catch:{ NumberFormatException -> 0x01ca }
            if (r0 != 0) goto L_0x01b5
            java.lang.String r0 = "Invalid 'vertical' value: "
            X.Pxh.A1M(r0, r8, r9)     // Catch:{ NumberFormatException -> 0x01ca }
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0059
        L_0x01b5:
            r30 = 1
            goto L_0x0059
        L_0x01b9:
            r30 = 2
            goto L_0x0059
        L_0x01bd:
            java.lang.String r5 = "Unknown cue setting "
            java.lang.String r0 = ":"
            java.lang.String r0 = X.002.A0u(r5, r6, r0, r8)     // Catch:{ NumberFormatException -> 0x01ca }
            X.2AG.A04(r9, r0)     // Catch:{ NumberFormatException -> 0x01ca }
            goto L_0x0059
        L_0x01ca:
            java.lang.String r5 = "Skipping bad cue setting: "
            java.lang.String r0 = r10.group()
            X.Pxh.A1M(r5, r0, r9)
            goto L_0x0059
        L_0x01d5:
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r21 > r6 ? 1 : (r21 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x01e6
            r0 = 4
            if (r2 == r0) goto L_0x0245
            r0 = 5
            r21 = 1065353216(0x3f800000, float:1.0)
            if (r2 == r0) goto L_0x01e6
            r21 = 1056964608(0x3f000000, float:0.5)
        L_0x01e6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L_0x01f6
            r3 = 1
            if (r2 == r3) goto L_0x0243
            r0 = 3
            if (r2 == r0) goto L_0x0241
            r0 = 4
            if (r2 == r0) goto L_0x0243
            r0 = 5
            if (r2 == r0) goto L_0x0241
        L_0x01f6:
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            r22 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = 1
            if (r2 == r0) goto L_0x023e
            r0 = 2
            if (r2 == r0) goto L_0x023b
            r0 = 3
            if (r2 == r0) goto L_0x0209
            r0 = 4
            if (r2 == r0) goto L_0x023e
        L_0x0209:
            android.text.Layout$Alignment r18 = android.text.Layout.Alignment.ALIGN_OPPOSITE
        L_0x020b:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x0231
            if (r25 != 0) goto L_0x0231
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x021c
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0231
        L_0x021c:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x021e:
            r2 = r21
            if (r3 == 0) goto L_0x0248
            r0 = 1
            if (r3 == r0) goto L_0x0250
            r0 = 2
            if (r3 == r0) goto L_0x025a
            java.lang.String r0 = java.lang.String.valueOf(r3)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0231:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x021e
            r4 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r25 != 0) goto L_0x021e
            goto L_0x021c
        L_0x023b:
            android.text.Layout$Alignment r18 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x020b
        L_0x023e:
            android.text.Layout$Alignment r18 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x020b
        L_0x0241:
            r3 = 2
            goto L_0x01f6
        L_0x0243:
            r3 = 0
            goto L_0x01f6
        L_0x0245:
            r21 = 0
            goto L_0x01e6
        L_0x0248:
            float r5 = r5 - r21
            goto L_0x024e
        L_0x024b:
            float r5 = r5 - r21
            float r5 = r5 * r2
        L_0x024e:
            r2 = r5
            goto L_0x025a
        L_0x0250:
            r0 = 1056964608(0x3f000000, float:0.5)
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x024b
            float r2 = r21 * r2
        L_0x025a:
            float r23 = java.lang.Math.min(r1, r2)
            r17 = 1
            goto L_0x001a
        L_0x0262:
            r2 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r1 != r2) goto L_0x001a
            java.lang.String r6 = r0.trim()
            java.util.List r13 = java.util.Collections.emptyList()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            r14.<init>()
            java.util.ArrayList r12 = X.AnonymousClass7TE.A1C()
            r1 = 0
        L_0x027e:
            int r8 = r6.length()
            if (r1 >= r8) goto L_0x03f6
            char r2 = r6.charAt(r1)
            r0 = 38
            if (r2 == r0) goto L_0x0296
            r0 = 60
            if (r2 == r0) goto L_0x0304
            r5.append(r2)
            int r1 = r1 + 1
            goto L_0x027e
        L_0x0296:
            r0 = 59
            int r1 = r1 + 1
            int r0 = r6.indexOf(r0, r1)
            r7 = 32
            int r8 = r6.indexOf(r7, r1)
            r7 = -1
            if (r0 != r7) goto L_0x02fd
            r0 = r8
        L_0x02a8:
            if (r0 == r7) goto L_0x03f1
            java.lang.String r1 = r6.substring(r1, r0)
            int r2 = r1.hashCode()
            switch(r2) {
                case 3309: goto L_0x02cd;
                case 3464: goto L_0x02d8;
                case 96708: goto L_0x02e3;
                case 3374865: goto L_0x02ee;
                default: goto L_0x02b5;
            }
        L_0x02b5:
            java.lang.String r7 = "ignoring unsupported entity: '&"
            java.lang.String r2 = ";'"
            java.lang.String r2 = X.002.A0g(r7, r1, r2)
            java.lang.String r1 = "WebvttCueParser"
            X.2AG.A04(r1, r2)
        L_0x02c2:
            if (r0 != r8) goto L_0x02c9
            java.lang.String r1 = " "
            r5.append(r1)
        L_0x02c9:
            int r2 = r0 + 1
            goto L_0x0359
        L_0x02cd:
            java.lang.String r2 = "gt"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x02b5
            r1 = 62
            goto L_0x02f9
        L_0x02d8:
            java.lang.String r2 = "lt"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x02b5
            r1 = 60
            goto L_0x02f9
        L_0x02e3:
            java.lang.String r2 = "amp"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x02b5
            r1 = 38
            goto L_0x02f9
        L_0x02ee:
            java.lang.String r2 = "nbsp"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x02b5
            r1 = 32
        L_0x02f9:
            r5.append(r1)
            goto L_0x02c2
        L_0x02fd:
            if (r8 == r7) goto L_0x02a8
            int r0 = java.lang.Math.min(r0, r8)
            goto L_0x02a8
        L_0x0304:
            int r2 = r1 + 1
            if (r2 >= r8) goto L_0x0359
            char r0 = r6.charAt(r2)
            r7 = 47
            r15 = 1
            boolean r16 = X.AnonymousClass7TF.A1S(r0, r7)
            r0 = 62
            int r0 = r6.indexOf(r0, r2)
            r9 = -1
            int r2 = r0 + 1
            if (r0 != r9) goto L_0x031f
            r2 = r8
        L_0x031f:
            int r0 = r2 + -2
            char r8 = r6.charAt(r0)
            boolean r10 = X.AnonymousClass7TF.A1S(r8, r7)
            if (r16 == 0) goto L_0x032c
            r15 = 2
        L_0x032c:
            int r1 = r1 + r15
            if (r10 != 0) goto L_0x0331
            int r0 = r2 + -1
        L_0x0331:
            java.lang.String r15 = r6.substring(r1, r0)
            boolean r0 = X.Pxi.A1Z(r15)
            if (r0 != 0) goto L_0x0359
            java.lang.String r7 = r15.trim()
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            X.C256703wD.A03(r0)
            java.lang.String r1 = "[ \\.]"
            r0 = 2
            java.lang.String[] r0 = r7.split(r1, r0)
            r8 = 0
            r7 = r0[r8]
            int r0 = r7.hashCode()
            switch(r0) {
                case 98: goto L_0x035c;
                case 99: goto L_0x035f;
                case 105: goto L_0x0362;
                case 117: goto L_0x0365;
                case 118: goto L_0x0369;
                case 3650: goto L_0x036d;
                case 3314158: goto L_0x0371;
                case 3511770: goto L_0x0374;
                default: goto L_0x0359;
            }
        L_0x0359:
            r1 = r2
            goto L_0x027e
        L_0x035c:
            java.lang.String r0 = "b"
            goto L_0x0377
        L_0x035f:
            java.lang.String r0 = "c"
            goto L_0x0377
        L_0x0362:
            java.lang.String r0 = "i"
            goto L_0x0377
        L_0x0365:
            java.lang.String r0 = "u"
            goto L_0x0377
        L_0x0369:
            java.lang.String r0 = "v"
            goto L_0x0377
        L_0x036d:
            java.lang.String r0 = "rt"
            goto L_0x0377
        L_0x0371:
            java.lang.String r0 = "lang"
            goto L_0x0377
        L_0x0374:
            java.lang.String r0 = "ruby"
        L_0x0377:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0359
            if (r16 != 0) goto L_0x03c2
            if (r10 != 0) goto L_0x0359
            int r10 = r5.length()
            java.lang.String r1 = r15.trim()
            boolean r7 = r1.isEmpty()
            r0 = 1
            r7 = r7 ^ 1
            X.C256703wD.A03(r7)
            java.lang.String r7 = " "
            int r7 = r1.indexOf(r7)
            if (r7 == r9) goto L_0x03a2
            r1.substring(r7)
            java.lang.String r1 = r1.substring(r8, r7)
        L_0x03a2:
            java.lang.String r7 = "\\."
            java.lang.String[] r1 = r1.split(r7, r9)
            r9 = r1[r8]
            java.util.HashSet r7 = X.AnonymousClass7TE.A1F()
        L_0x03ae:
            int r8 = r1.length
            if (r0 >= r8) goto L_0x03b9
            r8 = r1[r0]
            r7.add(r8)
            int r0 = r0 + 1
            goto L_0x03ae
        L_0x03b9:
            X.Ruq r0 = new X.Ruq
            r0.<init>(r9, r7, r10)
            r14.push(r0)
            goto L_0x0359
        L_0x03c2:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0359
            java.lang.Object r1 = r14.pop()
            X.Ruq r1 = (X.C10596Ruq) r1
            X.SMz.A00(r5, r1, r12, r13)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x03ed
            int r8 = r5.length()
            X.SEY r0 = new X.SEY
            r0.<init>(r1, r8)
            r12.add(r0)
        L_0x03e3:
            java.lang.String r0 = r1.A01
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x03c2
            goto L_0x0359
        L_0x03ed:
            r12.clear()
            goto L_0x03e3
        L_0x03f1:
            r5.append(r2)
            goto L_0x027e
        L_0x03f6:
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x0406
            java.lang.Object r0 = r14.pop()
            X.Ruq r0 = (X.C10596Ruq) r0
            X.SMz.A00(r5, r0, r12, r13)
            goto L_0x03f6
        L_0x0406:
            java.util.Set r6 = java.util.Collections.emptySet()
            java.lang.String r2 = ""
            r1 = 0
            X.Ruq r0 = new X.Ruq
            r0.<init>(r2, r6, r1)
            java.util.List r1 = java.util.Collections.emptyList()
            X.SMz.A00(r5, r0, r1, r13)
            android.text.SpannedString r19 = android.text.SpannedString.valueOf(r5)
            goto L_0x001a
        L_0x041f:
            java.lang.String r1 = "Incomplete vtt cue box header found."
            X.4UK r0 = new X.4UK
            r0.<init>(r1)
            throw r0
        L_0x0427:
            if (r19 != 0) goto L_0x042b
            java.lang.String r19 = ""
        L_0x042b:
            if (r17 == 0) goto L_0x0439
            X.4Rj r17 = new X.4Rj
            r20 = r4
            r24 = r22
            r27 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r17
        L_0x0439:
            r25 = 1
            android.text.Layout$Alignment r18 = android.text.Layout.Alignment.ALIGN_CENTER
            r1 = 1065353216(0x3f800000, float:1.0)
            r21 = 1056964608(0x3f000000, float:0.5)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r21 * r0
            float r23 = java.lang.Math.min(r1, r0)
            r20 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r26 = 0
            r28 = -2147483648(0xffffffff80000000, float:-0.0)
            r29 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.4Rj r17 = new X.4Rj
            r22 = r20
            r24 = r20
            r27 = r25
            r30 = r28
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8321QoN.A00(X.4XV, int):X.4Rj");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0237, code lost:
        if (r13.equals(r0) == false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0239, code lost:
        if (r16 != false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x023b, code lost:
        if (r15 != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x023d, code lost:
        r13 = r8.length();
        r14 = r14.trim();
        X.C256703wD.A03(!r14.isEmpty());
        r0 = r14.indexOf(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0255, code lost:
        if (r0 == -1) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0257, code lost:
        r14.substring(r0);
        r14 = r14.substring(0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x025e, code lost:
        r14 = r14.split("\\.", -1);
        r4 = r14[0];
        r3 = r14.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0267, code lost:
        if (r3 <= 1) goto L_0x0281;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0269, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x026a, code lost:
        if (r3 <= r3) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x026c, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x026d, code lost:
        X.C256703wD.A03(r0);
        r0 = (java.lang.String[]) java.util.Arrays.copyOfRange(r14, 1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0276, code lost:
        r18.push(new X.C11195SEv(r4, r0, r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0281, code lost:
        r0 = X.C11195SEv.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0288, code lost:
        if (r18.isEmpty() != false) goto L_0x02d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x028a, code lost:
        r0 = (X.C11195SEv) r18.pop();
        X.C11313SMn.A01(r8, r0, r9, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0299, code lost:
        if (r0.A01.equals(r13) == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02bb, code lost:
        X.2AG.A04("WebvttCueParser", X.002.A0g("ignoring unsupported entity: '&", r3, ";'"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c8, code lost:
        if (r12 != r4) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02ca, code lost:
        r8.append(" ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02cf, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0300, code lost:
        r8.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0373, code lost:
        if (r3 != 5) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0399, code lost:
        if (r4 == 0) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fb, code lost:
        X.Pxh.A1M("Invalid alignment value: ", r7, "WebvttCueParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0131, code lost:
        if (r7.equals(r0) != false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013c, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013d, code lost:
        r5.A06 = r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0353  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0367  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x037d  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x03ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C296765qb A05(byte[] r21, int r22, boolean r23) {
        /*
            r20 = this;
            r19 = r20
            r0 = r19
            boolean r3 = r0.A02
            X.4XV r2 = r0.A00
            r1 = r21
            r0 = r22
            r2.A0I(r1, r0)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            if (r3 == 0) goto L_0x0043
        L_0x0015:
            int r3 = r2.A00
            int r0 = r2.A01
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x0413
            r0 = 8
            if (r3 < r0) goto L_0x003b
            int r0 = r2.A01()
            int r4 = r2.A01()
            r3 = 1987343459(0x76747463, float:1.2395323E33)
            int r0 = r0 + -8
            if (r4 != r3) goto L_0x0037
            X.4Rj r0 = A00(r2, r0)
            r1.add(r0)
            goto L_0x0015
        L_0x0037:
            r2.A0H(r0)
            goto L_0x0015
        L_0x003b:
            java.lang.String r1 = "Incomplete Mp4Webvtt Top Level box header found."
            X.4UK r0 = new X.4UK
            r0.<init>(r1)
            throw r0
        L_0x0043:
            int r3 = r2.A00
            int r0 = r2.A01
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x0413
            r10 = 8
            if (r3 < r10) goto L_0x040b
            int r4 = r2.A01()
            int r3 = r2.A01()
            r0 = 1987343459(0x76747463, float:1.2395323E33)
            if (r3 != r0) goto L_0x03fc
            r0 = r19
            X.S3H r5 = r0.A01
            int r11 = r4 + -8
            X.2BQ r0 = X.2BQ.A1N
            boolean r0 = X.2BY.A02(r0)
            if (r0 == 0) goto L_0x0071
            X.4Rj r5 = A00(r2, r11)
        L_0x006d:
            r1.add(r5)
            goto L_0x0043
        L_0x0071:
            r5.A00()
        L_0x0074:
            if (r11 <= 0) goto L_0x0331
            if (r11 < r10) goto L_0x0403
            int r7 = r2.A01()
            int r6 = r2.A01()
            int r11 = r11 + -8
            int r7 = r7 - r10
            byte[] r4 = r2.A02
            int r3 = r2.A01
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
            java.lang.String r3 = X.Pxe.A11(r0, r4, r3, r7)
            r2.A0H(r7)
            int r11 = r11 - r7
            r0 = 1937011815(0x73747467, float:1.9367696E31)
            if (r6 != r0) goto L_0x0192
            java.lang.String r6 = "WebvttCueParser"
            java.util.regex.Pattern r0 = X.C11313SMn.A01
            java.util.regex.Matcher r4 = r0.matcher(r3)
        L_0x009e:
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x0074
            r0 = 1
            java.lang.String r8 = r4.group(r0)
            r0 = 2
            java.lang.String r7 = r4.group(r0)
            java.lang.String r0 = "line"
            boolean r0 = r0.equals(r8)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x00ec
            r0 = 44
            int r8 = r7.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            r3 = 0
            r0 = -1
            if (r8 == r0) goto L_0x00ce
            java.lang.String r0 = X.Pxe.A0v(r8, r7)     // Catch:{ NumberFormatException -> 0x0187 }
            int r0 = X.C11313SMn.A00(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            r5.A03 = r0     // Catch:{ NumberFormatException -> 0x0187 }
            java.lang.String r7 = r7.substring(r3, r8)     // Catch:{ NumberFormatException -> 0x0187 }
        L_0x00ce:
            java.lang.String r0 = "%"
            boolean r0 = r7.endsWith(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x00df
            float r0 = X.C11138SBt.A00(r7)     // Catch:{ NumberFormatException -> 0x0187 }
            r5.A00 = r0     // Catch:{ NumberFormatException -> 0x0187 }
        L_0x00dc:
            r5.A04 = r3     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x009e
        L_0x00df:
            int r0 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 >= 0) goto L_0x00e7
            int r0 = r0 + -1
        L_0x00e7:
            float r0 = (float) r0     // Catch:{ NumberFormatException -> 0x0187 }
            r5.A00 = r0     // Catch:{ NumberFormatException -> 0x0187 }
            r3 = 1
            goto L_0x00dc
        L_0x00ec:
            java.lang.String r0 = "align"
            boolean r0 = r0.equals(r8)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x0141
            int r0 = r7.hashCode()     // Catch:{ NumberFormatException -> 0x0187 }
            switch(r0) {
                case -1364013995: goto L_0x012b;
                case -1074341483: goto L_0x0127;
                case 100571: goto L_0x011e;
                case 3317767: goto L_0x0115;
                case 108511772: goto L_0x010b;
                case 109757538: goto L_0x0101;
                default: goto L_0x00fb;
            }     // Catch:{ NumberFormatException -> 0x0187 }
        L_0x00fb:
            java.lang.String r0 = "Invalid alignment value: "
            X.Pxh.A1M(r0, r7, r6)     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x013c
        L_0x0101:
            java.lang.String r0 = "start"
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0134
        L_0x010b:
            java.lang.String r0 = "right"
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0136
        L_0x0115:
            java.lang.String r0 = "left"
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x0138
        L_0x011e:
            java.lang.String r0 = "end"
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x00fb
            goto L_0x013a
        L_0x0127:
            java.lang.String r0 = "middle"
            goto L_0x012d
        L_0x012b:
            java.lang.String r0 = "center"
        L_0x012d:
            boolean r0 = r7.equals(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 != 0) goto L_0x013c
            goto L_0x00fb
        L_0x0134:
            r0 = 1
            goto L_0x013d
        L_0x0136:
            r0 = 5
            goto L_0x013d
        L_0x0138:
            r0 = 4
            goto L_0x013d
        L_0x013a:
            r0 = 3
            goto L_0x013d
        L_0x013c:
            r0 = 2
        L_0x013d:
            r5.A06 = r0     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x009e
        L_0x0141:
            java.lang.String r0 = "position"
            boolean r0 = r0.equals(r8)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x0169
            r0 = 44
            int r3 = r7.indexOf(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            r0 = -1
            if (r3 == r0) goto L_0x0161
            java.lang.String r0 = X.Pxe.A0v(r3, r7)     // Catch:{ NumberFormatException -> 0x0187 }
            int r0 = X.C11313SMn.A00(r0)     // Catch:{ NumberFormatException -> 0x0187 }
            r5.A05 = r0     // Catch:{ NumberFormatException -> 0x0187 }
            java.lang.String r7 = X.Pxe.A0x(r7, r3)     // Catch:{ NumberFormatException -> 0x0187 }
        L_0x0161:
            float r0 = X.C11138SBt.A00(r7)     // Catch:{ NumberFormatException -> 0x0187 }
            r5.A01 = r0     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x009e
        L_0x0169:
            java.lang.String r0 = "size"
            boolean r0 = r0.equals(r8)     // Catch:{ NumberFormatException -> 0x0187 }
            if (r0 == 0) goto L_0x017a
            float r0 = X.C11138SBt.A00(r7)     // Catch:{ NumberFormatException -> 0x0187 }
            r5.A02 = r0     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x009e
        L_0x017a:
            java.lang.String r3 = "Unknown cue setting "
            java.lang.String r0 = ":"
            java.lang.String r0 = X.002.A0u(r3, r8, r0, r7)     // Catch:{ NumberFormatException -> 0x0187 }
            X.2AG.A04(r6, r0)     // Catch:{ NumberFormatException -> 0x0187 }
            goto L_0x009e
        L_0x0187:
            java.lang.String r3 = "Skipping bad cue setting: "
            java.lang.String r0 = r4.group()
            X.Pxh.A1M(r3, r0, r6)
            goto L_0x009e
        L_0x0192:
            r0 = 1885436268(0x7061796c, float:2.7912367E29)
            if (r6 != r0) goto L_0x0074
            java.lang.String r6 = r3.trim()
            java.util.List r9 = java.util.Collections.emptyList()
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            java.util.ArrayDeque r18 = new java.util.ArrayDeque
            r18.<init>()
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            r3 = 0
        L_0x01ae:
            int r15 = r6.length()
            if (r3 >= r15) goto L_0x0310
            char r13 = r6.charAt(r3)
            r0 = 38
            if (r13 == r0) goto L_0x029c
            r0 = 60
            if (r13 == r0) goto L_0x01c6
            r8.append(r13)
            int r3 = r3 + 1
            goto L_0x01ae
        L_0x01c6:
            int r12 = r3 + 1
            if (r12 >= r15) goto L_0x02d1
            char r0 = r6.charAt(r12)
            r14 = 47
            r17 = 1
            boolean r16 = X.AnonymousClass7TF.A1S(r0, r14)
            r0 = 62
            int r0 = r6.indexOf(r0, r12)
            r4 = -1
            int r12 = r0 + 1
            if (r0 != r4) goto L_0x01e2
            r12 = r15
        L_0x01e2:
            int r13 = r12 + -2
            char r0 = r6.charAt(r13)
            boolean r15 = X.AnonymousClass7TF.A1S(r0, r14)
            if (r16 == 0) goto L_0x01f0
            r17 = 2
        L_0x01f0:
            int r3 = r3 + r17
            if (r15 != 0) goto L_0x01f6
            int r13 = r12 + -1
        L_0x01f6:
            java.lang.String r14 = r6.substring(r3, r13)
            boolean r0 = X.Pxi.A1Z(r14)
            if (r0 != 0) goto L_0x02d1
            java.lang.String r13 = r14.trim()
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ 1
            X.C256703wD.A03(r0)
            java.lang.String r3 = "[ \\.]"
            r0 = 2
            java.lang.String[] r0 = r13.split(r3, r0)
            r3 = 0
            r13 = r0[r3]
            int r0 = r13.hashCode()
            switch(r0) {
                case 98: goto L_0x0231;
                case 99: goto L_0x022e;
                case 105: goto L_0x022b;
                case 117: goto L_0x0227;
                case 118: goto L_0x0223;
                case 3314158: goto L_0x0220;
                default: goto L_0x021e;
            }
        L_0x021e:
            goto L_0x02d1
        L_0x0220:
            java.lang.String r0 = "lang"
            goto L_0x0233
        L_0x0223:
            java.lang.String r0 = "v"
            goto L_0x0233
        L_0x0227:
            java.lang.String r0 = "u"
            goto L_0x0233
        L_0x022b:
            java.lang.String r0 = "i"
            goto L_0x0233
        L_0x022e:
            java.lang.String r0 = "c"
            goto L_0x0233
        L_0x0231:
            java.lang.String r0 = "b"
        L_0x0233:
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x02d1
            if (r16 != 0) goto L_0x0284
            if (r15 != 0) goto L_0x02d1
            int r13 = r8.length()
            java.lang.String r14 = r14.trim()
            boolean r0 = r14.isEmpty()
            r15 = 1
            r0 = r0 ^ 1
            X.C256703wD.A03(r0)
            java.lang.String r0 = " "
            int r0 = r14.indexOf(r0)
            if (r0 == r4) goto L_0x025e
            r14.substring(r0)
            java.lang.String r14 = r14.substring(r3, r0)
        L_0x025e:
            java.lang.String r0 = "\\."
            java.lang.String[] r14 = r14.split(r0, r4)
            r4 = r14[r3]
            int r3 = r14.length
            if (r3 <= r15) goto L_0x0281
            r0 = 1
            if (r3 <= r3) goto L_0x026d
            r0 = 0
        L_0x026d:
            X.C256703wD.A03(r0)
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r14, r15, r3)
            java.lang.String[] r0 = (java.lang.String[]) r0
        L_0x0276:
            X.SEv r3 = new X.SEv
            r3.<init>(r4, r0, r13)
            r0 = r18
            r0.push(r3)
            goto L_0x02d1
        L_0x0281:
            java.lang.String[] r0 = X.C11195SEv.A03
            goto L_0x0276
        L_0x0284:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x02d1
            java.lang.Object r0 = r18.pop()
            X.SEv r0 = (X.C11195SEv) r0
            X.C11313SMn.A01(r8, r0, r9, r7)
            java.lang.String r0 = r0.A01
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0284
            goto L_0x02d1
        L_0x029c:
            r0 = 59
            int r3 = r3 + 1
            int r12 = r6.indexOf(r0, r3)
            r0 = 32
            int r4 = r6.indexOf(r0, r3)
            r0 = -1
            if (r12 != r0) goto L_0x0304
            r12 = r4
        L_0x02ae:
            if (r12 == r0) goto L_0x030b
            java.lang.String r3 = r6.substring(r3, r12)
            int r0 = r3.hashCode()
            switch(r0) {
                case 3309: goto L_0x02f6;
                case 3464: goto L_0x02eb;
                case 96708: goto L_0x02e0;
                case 3374865: goto L_0x02d4;
                default: goto L_0x02bb;
            }
        L_0x02bb:
            java.lang.String r13 = "ignoring unsupported entity: '&"
            java.lang.String r0 = ";'"
            java.lang.String r3 = X.002.A0g(r13, r3, r0)
            java.lang.String r0 = "WebvttCueParser"
            X.2AG.A04(r0, r3)
        L_0x02c8:
            if (r12 != r4) goto L_0x02cf
            java.lang.String r0 = " "
            r8.append(r0)
        L_0x02cf:
            int r12 = r12 + 1
        L_0x02d1:
            r3 = r12
            goto L_0x01ae
        L_0x02d4:
            java.lang.String r0 = "nbsp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02bb
            r0 = 32
            goto L_0x0300
        L_0x02e0:
            java.lang.String r0 = "amp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02bb
            r0 = 38
            goto L_0x0300
        L_0x02eb:
            java.lang.String r0 = "lt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02bb
            r0 = 60
            goto L_0x0300
        L_0x02f6:
            java.lang.String r0 = "gt"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x02bb
            r0 = 62
        L_0x0300:
            r8.append(r0)
            goto L_0x02c8
        L_0x0304:
            if (r4 == r0) goto L_0x02ae
            int r12 = java.lang.Math.min(r12, r4)
            goto L_0x02ae
        L_0x030b:
            r8.append(r13)
            goto L_0x01ae
        L_0x0310:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x0320
            java.lang.Object r0 = r18.pop()
            X.SEv r0 = (X.C11195SEv) r0
            X.C11313SMn.A01(r8, r0, r9, r7)
            goto L_0x0310
        L_0x0320:
            r6 = 0
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r3 = ""
            X.SEv r0 = new X.SEv
            r0.<init>(r3, r4, r6)
            X.C11313SMn.A01(r8, r0, r9, r7)
            r5.A07 = r8
            goto L_0x0074
        L_0x0331:
            float r6 = r5.A00
            int r4 = r5.A04
            r3 = 1065353216(0x3f800000, float:1.0)
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x0392
            if (r4 != 0) goto L_0x0392
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0349
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0392
        L_0x0349:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x034b:
            r5.A00 = r6
            float r7 = r5.A01
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0361
            int r3 = r5.A06
            r0 = 4
            if (r3 == r0) goto L_0x0390
            r0 = 5
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r0) goto L_0x035f
            r7 = 1056964608(0x3f000000, float:0.5)
        L_0x035f:
            r5.A01 = r7
        L_0x0361:
            int r8 = r5.A05
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r8 != r0) goto L_0x0377
            int r3 = r5.A06
            r8 = 1
            if (r3 == r8) goto L_0x038e
            r0 = 3
            if (r3 == r0) goto L_0x038c
            r0 = 4
            if (r3 == r0) goto L_0x038e
            r0 = 5
            if (r3 == r0) goto L_0x038c
        L_0x0375:
            r5.A05 = r8
        L_0x0377:
            float r6 = r5.A02
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r8 == 0) goto L_0x039c
            r0 = 1
            if (r8 == r0) goto L_0x039f
            r0 = 2
            if (r8 == r0) goto L_0x03a8
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x038c:
            r8 = 2
            goto L_0x0375
        L_0x038e:
            r8 = 0
            goto L_0x0375
        L_0x0390:
            r7 = 0
            goto L_0x035f
        L_0x0392:
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x034b
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            if (r4 != 0) goto L_0x034b
            goto L_0x0349
        L_0x039c:
            float r7 = r4 - r7
            goto L_0x03a8
        L_0x039f:
            r0 = 1056964608(0x3f000000, float:0.5)
            r3 = 1073741824(0x40000000, float:2.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x03f8
            float r7 = r7 * r3
        L_0x03a8:
            float r0 = java.lang.Math.min(r6, r7)
            r5.A02 = r0
            X.4Rj r0 = X.C264814Rj.A0D
            java.lang.CharSequence r7 = r5.A07
            r7.getClass()
            int r3 = r5.A06
            r0 = 1
            if (r3 == r0) goto L_0x03f5
            r0 = 2
            if (r3 == r0) goto L_0x03f2
            r0 = 3
            if (r3 == r0) goto L_0x03ef
            r0 = 4
            if (r3 == r0) goto L_0x03f5
            r0 = 5
            if (r3 == r0) goto L_0x03ef
            java.lang.String r0 = "Unknown textAlignment: "
            java.lang.String r3 = X.002.A0O(r0, r3)
            java.lang.String r0 = "WebvttCueBuilder"
            X.2AG.A04(r0, r3)
            r6 = 0
        L_0x03d2:
            float r8 = r5.A00
            int r4 = r5.A04
            int r3 = r5.A03
            float r9 = r5.A01
            int r0 = r5.A05
            float r11 = r5.A02
            r17 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            X.QoM r5 = new X.QoM
            r12 = r10
            r15 = r0
            r18 = r16
            r13 = r4
            r14 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x006d
        L_0x03ef:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x03d2
        L_0x03f2:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x03d2
        L_0x03f5:
            android.text.Layout$Alignment r6 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x03d2
        L_0x03f8:
            float r4 = r4 - r7
            float r7 = r4 * r3
            goto L_0x03a8
        L_0x03fc:
            int r0 = r4 + -8
            r2.A0H(r0)
            goto L_0x0043
        L_0x0403:
            java.lang.String r1 = "Incomplete vtt cue box header found."
            X.4UK r0 = new X.4UK
            r0.<init>(r1)
            throw r0
        L_0x040b:
            java.lang.String r1 = "Incomplete Mp4Webvtt Top Level box header found."
            X.4UK r0 = new X.4UK
            r0.<init>(r1)
            throw r0
        L_0x0413:
            X.Swj r0 = new X.Swj
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8321QoN.A05(byte[], int, boolean):X.5qb");
    }
}
