package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.QoO  reason: case insensitive filesystem */
public final class C8322QoO extends C296725qX {
    public static final Pattern A02 = Pattern.compile("\\{\\\\.*?\\}");
    public static final Pattern A03 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public final StringBuilder A00 = AnonymousClass7TE.A1A();
    public final ArrayList A01 = AnonymousClass7TE.A1C();

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

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4XV, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x012f, code lost:
        switch(r14) {
            case -685620710: goto L_0x015b;
            case -685620679: goto L_0x0160;
            case -685620648: goto L_0x0156;
            case -685620524: goto L_0x0167;
            case -685620493: goto L_0x016c;
            case -685620462: goto L_0x0151;
            default: goto L_0x0132;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0132, code lost:
        r23 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0134, code lost:
        r14 = new X.C264814Rj((android.text.Layout.Alignment) null, r16, X.Pxj.A05(r23), X.Pxj.A05(r24), -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, 0, r23, r24, X.AnonymousClass972.MUTABLE_FLAG_MASK, -16777216, X.AnonymousClass972.MUTABLE_FLAG_MASK);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0151, code lost:
        r4 = r12.equals("{\\an9}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0156, code lost:
        r4 = r12.equals("{\\an3}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x015b, code lost:
        r4 = r12.equals("{\\an1}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0160, code lost:
        r4 = r12.equals("{\\an2}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0164, code lost:
        r23 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0167, code lost:
        r4 = r12.equals("{\\an7}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016c, code lost:
        r4 = r12.equals("{\\an8}");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0170, code lost:
        r23 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0172, code lost:
        if (r4 != false) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x018d, code lost:
        r24 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0194, code lost:
        r24 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0196, code lost:
        if (r4 != false) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C296765qb A05(byte[] r29, int r30, boolean r31) {
        /*
            r28 = this;
            java.lang.String r6 = "SubripDecoder"
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            X.5zw r2 = new X.5zw
            r2.<init>()
            X.4XV r1 = new X.4XV
            r1.<init>()
            r0 = r29
            r1.A02 = r0
            r0 = r30
            r1.A00 = r0
            java.nio.charset.Charset r0 = r1.A0C()
            if (r0 != 0) goto L_0x0020
            java.nio.charset.Charset r0 = X.AnonymousClass2RN.A05
        L_0x0020:
            java.lang.String r5 = r1.A0B(r0)
            r7 = 0
            if (r5 == 0) goto L_0x0042
            int r4 = r5.length()
            if (r4 == 0) goto L_0x0020
            java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0031 }
            goto L_0x0037
        L_0x0031:
            java.lang.String r4 = "Skipping invalid index: "
            X.Pxh.A1M(r4, r5, r6)
            goto L_0x0020
        L_0x0037:
            java.lang.String r5 = r1.A0B(r0)
            if (r5 != 0) goto L_0x0058
            java.lang.String r0 = "Unexpected end"
            X.2AG.A04(r6, r0)
        L_0x0042:
            X.4Rj[] r0 = new X.C264814Rj[r7]
            java.lang.Object[] r3 = r3.toArray(r0)
            X.4Rj[] r3 = (X.C264814Rj[]) r3
            long[] r1 = r2.A01
            int r0 = r2.A00
            long[] r1 = java.util.Arrays.copyOf(r1, r0)
            X.Swk r0 = new X.Swk
            r0.<init>(r1, r3)
            return r0
        L_0x0058:
            java.util.regex.Pattern r4 = A03
            java.util.regex.Matcher r8 = r4.matcher(r5)
            boolean r4 = r8.matches()
            if (r4 == 0) goto L_0x019d
            r4 = 1
            long r4 = A00(r8, r4)
            r2.A01(r4)
            r4 = 6
            long r4 = A00(r8, r4)
            r2.A01(r4)
            r4 = r28
            java.lang.StringBuilder r13 = r4.A00
            r13.setLength(r7)
            java.util.ArrayList r8 = r4.A01
            r8.clear()
        L_0x0080:
            java.lang.String r5 = r1.A0B(r0)
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x00c7
            int r4 = r13.length()
            if (r4 <= 0) goto L_0x0095
            java.lang.String r4 = "<br>"
            r13.append(r4)
        L_0x0095:
            java.lang.String r5 = r5.trim()
            java.lang.StringBuilder r12 = X.Pxe.A16(r5)
            java.util.regex.Pattern r4 = A02
            java.util.regex.Matcher r14 = r4.matcher(r5)
            r11 = 0
        L_0x00a4:
            boolean r4 = r14.find()
            if (r4 == 0) goto L_0x00c3
            java.lang.String r4 = r14.group()
            r8.add(r4)
            int r10 = r14.start()
            int r10 = r10 - r11
            int r9 = r4.length()
            int r5 = r10 + r9
            java.lang.String r4 = ""
            r12.replace(r10, r5, r4)
            int r11 = r11 + r9
            goto L_0x00a4
        L_0x00c3:
            X.Pxf.A1O(r13, r12)
            goto L_0x0080
        L_0x00c7:
            java.lang.String r4 = r13.toString()
            android.text.Spanned r16 = android.text.Html.fromHtml(r4)
            r12 = 0
        L_0x00d0:
            int r4 = r8.size()
            if (r7 >= r4) goto L_0x00e5
            java.lang.Object r5 = r8.get(r7)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r4 = "\\{\\\\an[1-9]\\}"
            boolean r4 = r5.matches(r4)
            if (r4 == 0) goto L_0x0199
            r12 = r5
        L_0x00e5:
            r15 = 0
            if (r12 != 0) goto L_0x010e
            r17 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r22 = -2147483648(0xffffffff80000000, float:-0.0)
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.4Rj r14 = new X.4Rj
            r18 = r17
            r19 = r17
            r20 = r17
            r21 = r17
            r23 = r22
            r24 = r22
            r25 = r22
            r27 = r22
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0104:
            r3.add(r14)
            X.4Rj r4 = X.C264814Rj.A0D
            r3.add(r4)
            goto L_0x0020
        L_0x010e:
            int r14 = r12.hashCode()
            java.lang.String r11 = "{\\an9}"
            java.lang.String r10 = "{\\an8}"
            java.lang.String r9 = "{\\an7}"
            java.lang.String r13 = "{\\an6}"
            java.lang.String r4 = "{\\an4}"
            java.lang.String r8 = "{\\an3}"
            java.lang.String r7 = "{\\an2}"
            java.lang.String r5 = "{\\an1}"
            switch(r14) {
                case -685620710: goto L_0x017f;
                case -685620648: goto L_0x0184;
                case -685620617: goto L_0x0189;
                case -685620555: goto L_0x0190;
                case -685620524: goto L_0x017a;
                case -685620462: goto L_0x0175;
                default: goto L_0x012d;
            }
        L_0x012d:
            r24 = 1
        L_0x012f:
            switch(r14) {
                case -685620710: goto L_0x015b;
                case -685620679: goto L_0x0160;
                case -685620648: goto L_0x0156;
                case -685620524: goto L_0x0167;
                case -685620493: goto L_0x016c;
                case -685620462: goto L_0x0151;
                default: goto L_0x0132;
            }
        L_0x0132:
            r23 = 1
        L_0x0134:
            float r18 = X.Pxj.A05(r24)
            float r17 = X.Pxj.A05(r23)
            r22 = 0
            r25 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r26 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.4Rj r14 = new X.4Rj
            r20 = r19
            r21 = r19
            r27 = r25
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0104
        L_0x0151:
            boolean r4 = r12.equals(r11)
            goto L_0x0170
        L_0x0156:
            boolean r4 = r12.equals(r8)
            goto L_0x0164
        L_0x015b:
            boolean r4 = r12.equals(r5)
            goto L_0x0164
        L_0x0160:
            boolean r4 = r12.equals(r7)
        L_0x0164:
            r23 = 2
            goto L_0x0172
        L_0x0167:
            boolean r4 = r12.equals(r9)
            goto L_0x0170
        L_0x016c:
            boolean r4 = r12.equals(r10)
        L_0x0170:
            r23 = 0
        L_0x0172:
            if (r4 != 0) goto L_0x0134
            goto L_0x0132
        L_0x0175:
            boolean r4 = r12.equals(r11)
            goto L_0x0194
        L_0x017a:
            boolean r4 = r12.equals(r9)
            goto L_0x018d
        L_0x017f:
            boolean r4 = r12.equals(r5)
            goto L_0x018d
        L_0x0184:
            boolean r4 = r12.equals(r8)
            goto L_0x0194
        L_0x0189:
            boolean r4 = r12.equals(r4)
        L_0x018d:
            r24 = 0
            goto L_0x0196
        L_0x0190:
            boolean r4 = r12.equals(r13)
        L_0x0194:
            r24 = 2
        L_0x0196:
            if (r4 != 0) goto L_0x012f
            goto L_0x012d
        L_0x0199:
            int r7 = r7 + 1
            goto L_0x00d0
        L_0x019d:
            java.lang.String r4 = "Skipping invalid timing: "
            X.Pxh.A1M(r4, r5, r6)
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8322QoO.A05(byte[], int, boolean):X.5qb");
    }
}
