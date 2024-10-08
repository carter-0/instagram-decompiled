package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.SfU  reason: case insensitive filesystem */
public final class C11733SfU implements C13684Tf1 {
    public static final Pattern A03 = Pattern.compile("\\{\\\\.*?\\}");
    public static final Pattern A04 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public final C11389SRd A00 = new C11389SRd();
    public final StringBuilder A01 = AnonymousClass7TE.A1A();
    public final ArrayList A02 = AnonymousClass7TE.A1C();

    public final /* synthetic */ void reset() {
    }

    public static long A00(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 60 * 60 * 1000;
        } else {
            j = 0;
        }
        long A0A = j + (Pxi.A0A(matcher, i + 2) * 60 * 1000) + (Pxi.A0A(matcher, i + 3) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            A0A += Long.parseLong(group2);
        }
        return A0A * 1000;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011b, code lost:
        switch(r13) {
            case -685620710: goto L_0x014a;
            case -685620679: goto L_0x014f;
            case -685620648: goto L_0x0145;
            case -685620524: goto L_0x0156;
            case -685620493: goto L_0x015b;
            case -685620462: goto L_0x0140;
            default: goto L_0x011e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011e, code lost:
        r25 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0120, code lost:
        r13 = new X.C11270SIh((android.graphics.Bitmap) null, (android.text.Layout.Alignment) null, (android.text.Layout.Alignment) null, r17, X.Pxj.A05(r25), X.Pxj.A05(r26), -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0.0f, 0, r25, r26, X.AnonymousClass972.MUTABLE_FLAG_MASK, X.AnonymousClass972.MUTABLE_FLAG_MASK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0140, code lost:
        r3 = r8.equals("{\\an9}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0145, code lost:
        r3 = r8.equals("{\\an3}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x014a, code lost:
        r3 = r8.equals("{\\an1}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x014f, code lost:
        r3 = r8.equals("{\\an2}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0153, code lost:
        r25 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0156, code lost:
        r3 = r8.equals("{\\an7}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x015b, code lost:
        r3 = r8.equals("{\\an8}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015f, code lost:
        r25 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0161, code lost:
        if (r3 != false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x017c, code lost:
        r26 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0183, code lost:
        r26 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0185, code lost:
        if (r5 != false) goto L_0x011b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1l(X.C13507TbY r34, X.C11115SAs r35, byte[] r36, int r37, int r38) {
        /*
            r33 = this;
            java.lang.String r2 = "SubripParser"
            r12 = r33
            X.SRd r1 = r12.A00
            r3 = r37
            int r0 = r37 + r38
            r4 = r36
            r1.A0Q(r4, r0)
            r1.A0O(r3)
            java.nio.charset.Charset r0 = r1.A0J()
            if (r0 != 0) goto L_0x001a
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
        L_0x001a:
            java.lang.String r4 = r1.A0H(r0)
            if (r4 == 0) goto L_0x003b
            int r3 = r4.length()
            if (r3 == 0) goto L_0x001a
            java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x002a }
            goto L_0x0030
        L_0x002a:
            java.lang.String r3 = "Skipping invalid index: "
            X.Pxh.A1J(r3, r4, r2)
            goto L_0x001a
        L_0x0030:
            java.lang.String r5 = r1.A0H(r0)
            if (r5 != 0) goto L_0x003c
            java.lang.String r0 = "Unexpected end"
            X.STH.A03(r2, r0)
        L_0x003b:
            return
        L_0x003c:
            java.util.regex.Pattern r3 = A04
            java.util.regex.Matcher r4 = r3.matcher(r5)
            boolean r3 = r4.matches()
            if (r3 == 0) goto L_0x0188
            r3 = 1
            long r29 = A00(r4, r3)
            r3 = 6
            long r31 = A00(r4, r3)
            java.lang.StringBuilder r10 = r12.A01
            r5 = 0
            r10.setLength(r5)
            java.util.ArrayList r4 = r12.A02
            r4.clear()
        L_0x005d:
            java.lang.String r6 = r1.A0H(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L_0x00a4
            int r3 = r10.length()
            if (r3 <= 0) goto L_0x0072
            java.lang.String r3 = "<br>"
            r10.append(r3)
        L_0x0072:
            java.lang.String r6 = r6.trim()
            java.lang.StringBuilder r9 = X.Pxe.A16(r6)
            java.util.regex.Pattern r3 = A03
            java.util.regex.Matcher r13 = r3.matcher(r6)
            r11 = 0
        L_0x0081:
            boolean r3 = r13.find()
            if (r3 == 0) goto L_0x00a0
            java.lang.String r3 = r13.group()
            r4.add(r3)
            int r8 = r13.start()
            int r8 = r8 - r11
            int r7 = r3.length()
            int r6 = r8 + r7
            java.lang.String r3 = ""
            r9.replace(r8, r6, r3)
            int r11 = r11 + r7
            goto L_0x0081
        L_0x00a0:
            X.Pxf.A1O(r10, r9)
            goto L_0x005d
        L_0x00a4:
            java.lang.String r3 = r10.toString()
            android.text.Spanned r17 = android.text.Html.fromHtml(r3)
        L_0x00ac:
            int r3 = r4.size()
            if (r5 >= r3) goto L_0x00c3
            java.lang.Object r8 = r4.get(r5)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r3 = "\\{\\\\an[1-9]\\}"
            boolean r3 = r8.matches(r3)
            if (r3 != 0) goto L_0x00c4
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            r14 = 0
            if (r8 != 0) goto L_0x00fa
            r18 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r24 = -2147483648(0xffffffff80000000, float:-0.0)
            r23 = 0
            X.SIh r13 = new X.SIh
            r15 = r14
            r16 = r14
            r19 = r18
            r20 = r18
            r21 = r18
            r22 = r18
            r25 = r24
            r26 = r24
            r27 = r24
            r28 = r24
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x00e6:
            com.google.common.collect.ImmutableList r28 = com.google.common.collect.ImmutableList.of(r13)
            long r31 = r31 - r29
            X.RtS r3 = new X.RtS
            r27 = r3
            r27.<init>(r28, r29, r31)
            r4 = r34
            r4.accept(r3)
            goto L_0x001a
        L_0x00fa:
            int r13 = r8.hashCode()
            java.lang.String r7 = "{\\an9}"
            java.lang.String r11 = "{\\an8}"
            java.lang.String r6 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r5 = "{\\an4}"
            java.lang.String r4 = "{\\an3}"
            java.lang.String r10 = "{\\an2}"
            java.lang.String r3 = "{\\an1}"
            switch(r13) {
                case -685620710: goto L_0x016e;
                case -685620648: goto L_0x0173;
                case -685620617: goto L_0x0178;
                case -685620555: goto L_0x017f;
                case -685620524: goto L_0x0169;
                case -685620462: goto L_0x0164;
                default: goto L_0x0119;
            }
        L_0x0119:
            r26 = 1
        L_0x011b:
            switch(r13) {
                case -685620710: goto L_0x014a;
                case -685620679: goto L_0x014f;
                case -685620648: goto L_0x0145;
                case -685620524: goto L_0x0156;
                case -685620493: goto L_0x015b;
                case -685620462: goto L_0x0140;
                default: goto L_0x011e;
            }
        L_0x011e:
            r25 = 1
        L_0x0120:
            float r19 = X.Pxj.A05(r26)
            float r18 = X.Pxj.A05(r25)
            r24 = 0
            r27 = -2147483648(0xffffffff80000000, float:-0.0)
            r20 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r23 = 0
            X.SIh r13 = new X.SIh
            r15 = r14
            r16 = r14
            r21 = r20
            r22 = r20
            r28 = r27
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x00e6
        L_0x0140:
            boolean r3 = r8.equals(r7)
            goto L_0x015f
        L_0x0145:
            boolean r3 = r8.equals(r4)
            goto L_0x0153
        L_0x014a:
            boolean r3 = r8.equals(r3)
            goto L_0x0153
        L_0x014f:
            boolean r3 = r8.equals(r10)
        L_0x0153:
            r25 = 2
            goto L_0x0161
        L_0x0156:
            boolean r3 = r8.equals(r6)
            goto L_0x015f
        L_0x015b:
            boolean r3 = r8.equals(r11)
        L_0x015f:
            r25 = 0
        L_0x0161:
            if (r3 != 0) goto L_0x0120
            goto L_0x011e
        L_0x0164:
            boolean r5 = r8.equals(r7)
            goto L_0x0183
        L_0x0169:
            boolean r5 = r8.equals(r6)
            goto L_0x017c
        L_0x016e:
            boolean r5 = r8.equals(r3)
            goto L_0x017c
        L_0x0173:
            boolean r5 = r8.equals(r4)
            goto L_0x0183
        L_0x0178:
            boolean r5 = r8.equals(r5)
        L_0x017c:
            r26 = 0
            goto L_0x0185
        L_0x017f:
            boolean r5 = r8.equals(r9)
        L_0x0183:
            r26 = 2
        L_0x0185:
            if (r5 != 0) goto L_0x011b
            goto L_0x0119
        L_0x0188:
            java.lang.String r3 = "Skipping invalid timing: "
            X.Pxh.A1J(r3, r5, r2)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11733SfU.E1l(X.TbY, X.SAs, byte[], int, int):void");
    }
}
