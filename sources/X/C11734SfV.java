package X;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: X.SfV  reason: case insensitive filesystem */
public final class C11734SfV implements C13684Tf1 {
    public static final C10514RtT A01 = new C10514RtT(1, 1, 30.0f);
    public static final Pattern A02 = Pattern.compile("^(\\d+) (\\d+)$");
    public static final Pattern A03 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern A04 = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern A05 = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern A06 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern A07 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern A08 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public final XmlPullParserFactory A00;

    public final /* synthetic */ void reset() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r1 = r1 * r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        r1 = r1 / r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A00(X.C10514RtT r12, java.lang.String r13) {
        /*
            java.util.regex.Pattern r0 = A07
            java.util.regex.Matcher r9 = r0.matcher(r13)
            boolean r2 = r9.matches()
            r10 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r0 = 4
            r7 = 3
            r5 = 2
            r1 = 1
            if (r2 == 0) goto L_0x0068
            long r3 = X.Pxi.A0A(r9, r1)
            r1 = 3600(0xe10, double:1.7786E-320)
            long r3 = r3 * r1
            double r1 = (double) r3
            long r5 = X.Pxi.A0A(r9, r5)
            r3 = 60
            long r5 = r5 * r3
            double r3 = (double) r5
            double r1 = r1 + r3
            long r5 = X.Pxi.A0A(r9, r7)
            double r3 = (double) r5
            double r1 = r1 + r3
            java.lang.String r0 = r9.group(r0)
            r5 = 0
            if (r0 == 0) goto L_0x0065
            double r3 = java.lang.Double.parseDouble(r0)
        L_0x0038:
            double r1 = r1 + r3
            r0 = 5
            java.lang.String r0 = r9.group(r0)
            if (r0 == 0) goto L_0x0062
            long r7 = java.lang.Long.parseLong(r0)
            float r3 = (float) r7
            float r0 = r12.A00
            float r3 = r3 / r0
            double r3 = (double) r3
        L_0x0049:
            double r1 = r1 + r3
            r0 = 6
            java.lang.String r0 = r9.group(r0)
            if (r0 == 0) goto L_0x005e
            long r3 = java.lang.Long.parseLong(r0)
            double r5 = (double) r3
            int r0 = r12.A01
            double r3 = (double) r0
            double r5 = r5 / r3
            float r0 = r12.A00
            double r3 = (double) r0
            double r5 = r5 / r3
        L_0x005e:
            double r1 = r1 + r5
        L_0x005f:
            double r1 = r1 * r10
            long r3 = (long) r1
            return r3
        L_0x0062:
            r3 = 0
            goto L_0x0049
        L_0x0065:
            r3 = 0
            goto L_0x0038
        L_0x0068:
            java.util.regex.Pattern r0 = A08
            java.util.regex.Matcher r3 = r0.matcher(r13)
            boolean r0 = r3.matches()
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = X.Pxf.A0o(r3, r1)
            double r1 = java.lang.Double.parseDouble(r0)
            java.lang.String r3 = X.Pxf.A0o(r3, r5)
            int r0 = r3.hashCode()
            switch(r0) {
                case 102: goto L_0x00be;
                case 104: goto L_0x00af;
                case 109: goto L_0x00a4;
                case 116: goto L_0x0097;
                case 3494: goto L_0x0088;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x005f
        L_0x0088:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005f
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            goto L_0x00c9
        L_0x0097:
            java.lang.String r0 = "t"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005f
            int r0 = r12.A02
            double r3 = (double) r0
            goto L_0x00c9
        L_0x00a4:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005f
            r3 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x00bc
        L_0x00af:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005f
            r3 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x00bc:
            double r1 = r1 * r3
            goto L_0x005f
        L_0x00be:
            java.lang.String r0 = "f"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x005f
            float r0 = r12.A00
            double r3 = (double) r0
        L_0x00c9:
            double r1 = r1 / r3
            goto L_0x005f
        L_0x00cb:
            java.lang.String r0 = "Malformed time expression: "
            java.lang.String r1 = X.002.A0R(r0, r13)
            X.QDv r0 = new X.QDv
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11734SfV.A00(X.RtT, java.lang.String):long");
    }

    public static C10968S3a A02(C10968S3a s3a, Object obj) {
        if (obj == null) {
            return new C10968S3a();
        }
        return s3a;
    }

    public C11734SfV() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.A00 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw Pxe.A0u("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        return android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout.Alignment A01(java.lang.String r1) {
        /*
            java.lang.String r1 = X.C256643w7.A00(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x002b;
                case 100571: goto L_0x0020;
                case 3317767: goto L_0x0015;
                case 108511772: goto L_0x0011;
                case 109757538: goto L_0x000d;
                default: goto L_0x000b;
            }
        L_0x000b:
            r0 = 0
            return r0
        L_0x000d:
            java.lang.String r0 = "start"
            goto L_0x0017
        L_0x0011:
            java.lang.String r0 = "right"
            goto L_0x0022
        L_0x0015:
            java.lang.String r0 = "left"
        L_0x0017:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r0
        L_0x0020:
            java.lang.String r0 = "end"
        L_0x0022:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r0
        L_0x002b:
            java.lang.String r0 = "center"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000b
            android.text.Layout$Alignment r0 = android.text.Layout.Alignment.ALIGN_CENTER
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11734SfV.A01(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0243, code lost:
        if (r5 == -1360216880) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0248, code lost:
        if (r5 == -905816648) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x024d, code lost:
        if (r5 != 99657) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0255, code lost:
        if (r7.equals("dot") == false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0257, code lost:
        r0 = new X.SF0(r2, r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x025e, code lost:
        r2 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0266, code lost:
        if (r7.equals("sesame") != false) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0268, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x026a, code lost:
        r0 = r5.equals("outside");
        r1 = -2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0271, code lost:
        r12 = A02(r12, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r12.A02 = X.C11323SMx.A00(r2, false);
        r12.A0H = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0281, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Failed parsing background value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0287, code lost:
        X.STH.A03("TtmlParser", X.Pxg.A0s(r0, r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0290, code lost:
        r12 = A02(r12, r12);
        r12.A0C = A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x029c, code lost:
        r1 = X.C256643w7.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r6 = new X.C10968S3a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02a4, code lost:
        switch(r1.hashCode()) {
            case -1461280213: goto L_0x02a9;
            case -1026963764: goto L_0x02b8;
            case 913457136: goto L_0x02ca;
            case 1679736913: goto L_0x02d9;
            default: goto L_0x02a7;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02b0, code lost:
        if (r1.equals("nounderline") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02b2, code lost:
        r12 = A02(r12, r12);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02bf, code lost:
        if (r1.equals("underline") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02c1, code lost:
        r12 = A02(r12, r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02c6, code lost:
        r12.A0B = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02d1, code lost:
        if (r1.equals("nolinethrough") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r12 = r6;
        r0 = X.Pxh.A1b(r2, "\\s+");
        r8 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02d3, code lost:
        r12 = A02(r12, r12);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02df, code lost:
        if (r1.equals("linethrough") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02e1, code lost:
        r12 = A02(r12, r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02e6, code lost:
        r12.A07 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02f5, code lost:
        if ("style".equals(r13.getName()) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02f7, code lost:
        r12 = A02(r12, r12);
        r12.A0G = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ff, code lost:
        r1 = X.C256643w7.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0307, code lost:
        switch(r1.hashCode()) {
            case -618561360: goto L_0x030c;
            case -410956671: goto L_0x030f;
            case -250518009: goto L_0x031d;
            case -136074796: goto L_0x032b;
            case 3016401: goto L_0x032f;
            case 3556653: goto L_0x033d;
            default: goto L_0x030a;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r8 != 1) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030c, code lost:
        r0 = "baseContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0315, code lost:
        if (r1.equals("container") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0317, code lost:
        r12 = A02(r12, r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0323, code lost:
        if (r1.equals("delimiter") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0325, code lost:
        r12 = A02(r12, r12);
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032b, code lost:
        r0 = "textContainer";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x032f, code lost:
        r0 = "base";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r8 = A03.matcher(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0335, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0337, code lost:
        r12 = A02(r12, r12);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x033d, code lost:
        r0 = "text";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0344, code lost:
        if (r1.equals(r0) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0346, code lost:
        r12 = A02(r12, r12);
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x034b, code lost:
        r12.A09 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x034f, code lost:
        r1 = X.C256643w7.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0359, code lost:
        if (r1.equals("all") != false) goto L_0x036d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0362, code lost:
        if (r1.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0364, code lost:
        r12 = A02(r12, r12);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0369, code lost:
        r12.A0A = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x036d, code lost:
        r12 = A02(r12, r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0373, code lost:
        r1 = X.C256643w7.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037d, code lost:
        if (r1.equals("before") != false) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0385, code lost:
        if (r1.equals("after") == false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0387, code lost:
        r12 = A02(r12, r12);
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x038c, code lost:
        r12.A08 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r8.matches() == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0390, code lost:
        r12 = A02(r12, r12);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r10 = X.Pxf.A0o(r8, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x041c, code lost:
        if (r0 == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        switch(r10.hashCode()) {
            case 37: goto L_0x0059;
            case 3240: goto L_0x0064;
            case 3592: goto L_0x006f;
            default: goto L_0x004d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r1 = new java.lang.Exception(X.002.A0g("Invalid unit for fontSize: '", r10, "'."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (r10.equals("%") == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r6.A05 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        if (r10.equals("em") == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        r6.A05 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r10.equals("px") == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        r6.A05 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r6.A00 = X.Pxj.A07(r8, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0081, code lost:
        r1 = new java.lang.Exception(X.002.A0g("Invalid expression for fontSize: '", r2, "'."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r8 != 2) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        r8 = A03.matcher(r0[1]);
        X.STH.A03("TtmlParser", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009d, code lost:
        r1 = new java.lang.Exception(X.002.A0c("Invalid number of entries for fontSize: ", ".", r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ab, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Failed parsing fontSize value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b3, code lost:
        r12 = A02(r12, r12);
        r12.A06 = "italic".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        r12 = A02(r12, r12);
        r12.A0F = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r12 = A02(r12, r12);
        r12.A0D = A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
        r12 = A02(r12, r12);
        r12.A03 = "bold".equalsIgnoreCase(r2) ? 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e3, code lost:
        r12 = A02(r12, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r12.A04 = X.C11323SMx.A00(r2, false);
        r12.A0I = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f3, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Failed parsing color value: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fb, code lost:
        r12 = A02(r12, r12);
        r1 = A06.matcher(r2);
        r6 = Float.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        if (r1.matches() != false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010e, code lost:
        X.Pxh.A1J("Invalid value for shear: ", r2, "TtmlParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r6 = java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, X.Pxj.A07(r1, 1)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0129, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012a, code lost:
        X.STH.A05("TtmlParser", X.002.A0R("Failed to parse shear: ", r2), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0134, code lost:
        r12 = A02(r12, r12);
        r0 = X.SF0.A03;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013b, code lost:
        if (r2 == null) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013d, code lost:
        r2 = X.C256643w7.A00(r2.trim());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0149, code lost:
        if (r2.isEmpty() != false) goto L_0x01d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014b, code lost:
        r9 = com.google.common.collect.ImmutableSet.A04(android.text.TextUtils.split(r2, X.SF0.A07));
        r1 = X.SF0.A05;
        X.17k.A07(r1, "set1");
        X.17k.A07(r9, "set2");
        r1 = new X.R1K(r1, r9).iterator();
        r5 = "outside";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0174, code lost:
        if (r1.hasNext() == false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        r5 = r1.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x017a, code lost:
        r5 = (java.lang.String) r5;
        r1 = r5.hashCode();
        r2 = 2;
        r7 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0186, code lost:
        if (r1 == -1392885889) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x018b, code lost:
        if (r1 == -1106037339) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0190, code lost:
        if (r1 != 92734940) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0192, code lost:
        r0 = r5.equals("after");
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0199, code lost:
        if (r0 != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        switch(r1) {
            case 0: goto L_0x00b3;
            case 1: goto L_0x00c1;
            case 2: goto L_0x00c9;
            case 3: goto L_0x029c;
            case 4: goto L_0x00d5;
            case 5: goto L_0x02ea;
            case 6: goto L_0x02ff;
            case 7: goto L_0x00e3;
            case 8: goto L_0x00fb;
            case 9: goto L_0x034f;
            case 10: goto L_0x001f;
            case 11: goto L_0x0134;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x0373;
            case 13: goto L_0x0271;
            case 14: goto L_0x0290;
            default: goto L_0x001c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019b, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019c, code lost:
        r0 = X.SF0.A06;
        X.17k.A07(r0, "set1");
        X.17k.A07(r9, "set2");
        r5 = new X.R1K(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ad, code lost:
        if (r5.isEmpty() != false) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01af, code lost:
        r5 = X.AnonymousClass7TE.A18(r5.iterator());
        r2 = r5.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        if (r2 == 3005871) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c3, code lost:
        if (r2 != 3387192) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cc, code lost:
        if (r5.equals(com.facebook.catalyst.modules.netinfo.NetInfoModule.CONNECTION_TYPE_NONE) == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01ce, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cf, code lost:
        r0 = new X.SF0(r7, 0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d4, code lost:
        r12.A0E = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d8, code lost:
        r0 = X.SF0.A03;
        X.17k.A07(r0, "set1");
        X.17k.A07(r9, "set2");
        r5 = new X.R1K(r0, r9);
        r0 = X.SF0.A04;
        X.17k.A07(r0, "set1");
        X.17k.A07(r9, "set2");
        r8 = new X.R1K(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f6, code lost:
        if (r5.isEmpty() == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01fc, code lost:
        if (r8.isEmpty() == false) goto L_0x01ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ff, code lost:
        r6 = "filled";
        r5 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0209, code lost:
        if (r5.hasNext() == false) goto L_0x020f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020b, code lost:
        r6 = r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020f, code lost:
        r6 = (java.lang.String) r6;
        r5 = r6.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0218, code lost:
        if (r5 == -1274499742) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x021d, code lost:
        if (r5 != 3417674) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021f, code lost:
        r0 = r6.equals("open");
        r6 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0227, code lost:
        if (r0 != false) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0229, code lost:
        r6 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022a, code lost:
        r7 = "circle";
        r5 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0234, code lost:
        if (r5.hasNext() == false) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0236, code lost:
        r7 = r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x023a, code lost:
        r7 = (java.lang.String) r7;
        r5 = r7.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r12 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C10968S3a A03(X.C10968S3a r12, org.xmlpull.v1.XmlPullParser r13) {
        /*
            int r4 = r13.getAttributeCount()
            r3 = 0
        L_0x0005:
            if (r3 >= r4) goto L_0x0420
            java.lang.String r2 = r13.getAttributeValue(r3)
            java.lang.String r1 = r13.getAttributeName(r3)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1550943582: goto L_0x0396;
                case -1224696685: goto L_0x039e;
                case -1065511464: goto L_0x03a6;
                case -879295043: goto L_0x03af;
                case -734428249: goto L_0x03b8;
                case 3355: goto L_0x03c0;
                case 3511770: goto L_0x03c8;
                case 94842723: goto L_0x03d1;
                case 109403361: goto L_0x03d9;
                case 110138194: goto L_0x03e3;
                case 365601008: goto L_0x03ed;
                case 921125321: goto L_0x03f6;
                case 1115953443: goto L_0x0400;
                case 1287124693: goto L_0x040a;
                case 1754920356: goto L_0x0413;
                default: goto L_0x0016;
            }
        L_0x0016:
            r1 = -1
        L_0x0017:
            java.lang.String r5 = "TtmlParser"
            switch(r1) {
                case 0: goto L_0x00b3;
                case 1: goto L_0x00c1;
                case 2: goto L_0x00c9;
                case 3: goto L_0x029c;
                case 4: goto L_0x00d5;
                case 5: goto L_0x02ea;
                case 6: goto L_0x02ff;
                case 7: goto L_0x00e3;
                case 8: goto L_0x00fb;
                case 9: goto L_0x034f;
                case 10: goto L_0x001f;
                case 11: goto L_0x0134;
                case 12: goto L_0x0373;
                case 13: goto L_0x0271;
                case 14: goto L_0x0290;
                default: goto L_0x001c;
            }
        L_0x001c:
            int r3 = r3 + 1
            goto L_0x0005
        L_0x001f:
            r6 = r12
            if (r12 != 0) goto L_0x0027
            X.S3a r6 = new X.S3a     // Catch:{ QDv -> 0x00ab }
            r6.<init>()     // Catch:{ QDv -> 0x00ab }
        L_0x0027:
            r12 = r6
            java.lang.String r0 = "\\s+"
            java.lang.String[] r0 = X.Pxh.A1b(r2, r0)     // Catch:{ QDv -> 0x00ab }
            int r8 = r0.length     // Catch:{ QDv -> 0x00ab }
            r9 = 2
            r7 = 1
            if (r8 != r7) goto L_0x008d
            java.util.regex.Pattern r0 = A03     // Catch:{ QDv -> 0x00ab }
            java.util.regex.Matcher r8 = r0.matcher(r2)     // Catch:{ QDv -> 0x00ab }
        L_0x0039:
            boolean r0 = r8.matches()     // Catch:{ QDv -> 0x00ab }
            java.lang.String r1 = "'."
            if (r0 == 0) goto L_0x0081
            r11 = 3
            java.lang.String r10 = X.Pxf.A0o(r8, r11)     // Catch:{ QDv -> 0x00ab }
            int r0 = r10.hashCode()     // Catch:{ QDv -> 0x00ab }
            switch(r0) {
                case 37: goto L_0x0059;
                case 3240: goto L_0x0064;
                case 3592: goto L_0x006f;
                default: goto L_0x004d;
            }     // Catch:{ QDv -> 0x00ab }
        L_0x004d:
            java.lang.String r0 = "Invalid unit for fontSize: '"
            java.lang.String r0 = X.002.A0g(r0, r10, r1)     // Catch:{ QDv -> 0x00ab }
            X.QDv r1 = new X.QDv     // Catch:{ QDv -> 0x00ab }
            r1.<init>(r0)     // Catch:{ QDv -> 0x00ab }
        L_0x0058:
            throw r1     // Catch:{ QDv -> 0x00ab }
        L_0x0059:
            java.lang.String r0 = "%"
            boolean r0 = r10.equals(r0)     // Catch:{ QDv -> 0x00ab }
            if (r0 == 0) goto L_0x004d
            r6.A05 = r11     // Catch:{ QDv -> 0x00ab }
            goto L_0x007a
        L_0x0064:
            java.lang.String r0 = "em"
            boolean r0 = r10.equals(r0)     // Catch:{ QDv -> 0x00ab }
            if (r0 == 0) goto L_0x004d
            r6.A05 = r9     // Catch:{ QDv -> 0x00ab }
            goto L_0x007a
        L_0x006f:
            java.lang.String r0 = "px"
            boolean r0 = r10.equals(r0)     // Catch:{ QDv -> 0x00ab }
            if (r0 == 0) goto L_0x004d
            r6.A05 = r7     // Catch:{ QDv -> 0x00ab }
        L_0x007a:
            float r0 = X.Pxj.A07(r8, r7)     // Catch:{ QDv -> 0x00ab }
            r6.A00 = r0     // Catch:{ QDv -> 0x00ab }
            goto L_0x001c
        L_0x0081:
            java.lang.String r0 = "Invalid expression for fontSize: '"
            java.lang.String r0 = X.002.A0g(r0, r2, r1)     // Catch:{ QDv -> 0x00ab }
            X.QDv r1 = new X.QDv     // Catch:{ QDv -> 0x00ab }
            r1.<init>(r0)     // Catch:{ QDv -> 0x00ab }
            goto L_0x0058
        L_0x008d:
            if (r8 != r9) goto L_0x009d
            java.util.regex.Pattern r1 = A03     // Catch:{ QDv -> 0x00ab }
            r0 = r0[r7]     // Catch:{ QDv -> 0x00ab }
            java.util.regex.Matcher r8 = r1.matcher(r0)     // Catch:{ QDv -> 0x00ab }
            java.lang.String r0 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            X.STH.A03(r5, r0)     // Catch:{ QDv -> 0x00ab }
            goto L_0x0039
        L_0x009d:
            java.lang.String r1 = "Invalid number of entries for fontSize: "
            java.lang.String r0 = "."
            java.lang.String r0 = X.002.A0c(r1, r0, r8)     // Catch:{ QDv -> 0x00ab }
            X.QDv r1 = new X.QDv     // Catch:{ QDv -> 0x00ab }
            r1.<init>(r0)     // Catch:{ QDv -> 0x00ab }
            goto L_0x0058
        L_0x00ab:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed parsing fontSize value: "
            goto L_0x0287
        L_0x00b3:
            X.S3a r12 = A02(r12, r12)
            java.lang.String r0 = "italic"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r12.A06 = r0
            goto L_0x001c
        L_0x00c1:
            X.S3a r12 = A02(r12, r12)
            r12.A0F = r2
            goto L_0x001c
        L_0x00c9:
            X.S3a r12 = A02(r12, r12)
            android.text.Layout$Alignment r0 = A01(r2)
            r12.A0D = r0
            goto L_0x001c
        L_0x00d5:
            X.S3a r12 = A02(r12, r12)
            java.lang.String r0 = "bold"
            boolean r0 = r0.equalsIgnoreCase(r2)
            r12.A03 = r0
            goto L_0x001c
        L_0x00e3:
            X.S3a r12 = A02(r12, r12)
            r0 = 0
            int r0 = X.C11323SMx.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x00f3 }
            r12.A04 = r0     // Catch:{ IllegalArgumentException -> 0x00f3 }
            r0 = 1
            r12.A0I = r0     // Catch:{ IllegalArgumentException -> 0x00f3 }
            goto L_0x001c
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed parsing color value: "
            goto L_0x0287
        L_0x00fb:
            X.S3a r12 = A02(r12, r12)
            java.util.regex.Pattern r0 = A06
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.matches()
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r0 != 0) goto L_0x0117
            java.lang.String r0 = "Invalid value for shear: "
            X.Pxh.A1J(r0, r2, r5)
        L_0x0113:
            r12.A01 = r6
            goto L_0x001c
        L_0x0117:
            r0 = 1
            float r1 = X.Pxj.A07(r1, r0)     // Catch:{ NumberFormatException -> 0x0129 }
            r0 = -1027080192(0xffffffffc2c80000, float:-100.0)
            float r1 = java.lang.Math.max(r0, r1)     // Catch:{ NumberFormatException -> 0x0129 }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r6 = java.lang.Math.min(r0, r1)     // Catch:{ NumberFormatException -> 0x0129 }
            goto L_0x0113
        L_0x0129:
            r1 = move-exception
            java.lang.String r0 = "Failed to parse shear: "
            java.lang.String r0 = X.002.A0R(r0, r2)
            X.STH.A05(r5, r0, r1)
            goto L_0x0113
        L_0x0134:
            X.S3a r12 = A02(r12, r12)
            com.google.common.collect.ImmutableSet r0 = X.SF0.A03
            r0 = 0
            if (r2 == 0) goto L_0x01d4
            java.lang.String r1 = r2.trim()
            java.lang.String r2 = X.C256643w7.A00(r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x01d4
            java.util.regex.Pattern r0 = X.SF0.A07
            java.lang.String[] r0 = android.text.TextUtils.split(r2, r0)
            com.google.common.collect.ImmutableSet r9 = com.google.common.collect.ImmutableSet.A04(r0)
            com.google.common.collect.ImmutableSet r1 = X.SF0.A05
            java.lang.String r10 = "set1"
            X.17k.A07(r1, r10)
            java.lang.String r8 = "set2"
            X.17k.A07(r9, r8)
            X.R1K r0 = new X.R1K
            r0.<init>(r1, r9)
            java.lang.String r11 = "outside"
            java.util.Iterator r1 = r0.iterator()
            r5 = r11
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017a
            java.lang.Object r5 = r1.next()
        L_0x017a:
            java.lang.String r5 = (java.lang.String) r5
            int r1 = r5.hashCode()
            r0 = -1392885889(0xffffffffacfa3f7f, float:-7.112477E-12)
            r2 = 2
            r7 = -1
            r6 = 0
            if (r1 == r0) goto L_0x019b
            r0 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            if (r1 == r0) goto L_0x026a
            r0 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r1 != r0) goto L_0x019b
            java.lang.String r0 = "after"
            boolean r0 = r5.equals(r0)
            r1 = 2
        L_0x0199:
            if (r0 != 0) goto L_0x019c
        L_0x019b:
            r1 = 1
        L_0x019c:
            com.google.common.collect.ImmutableSet r0 = X.SF0.A06
            X.17k.A07(r0, r10)
            X.17k.A07(r9, r8)
            X.R1K r5 = new X.R1K
            r5.<init>(r0, r9)
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01d8
            java.util.Iterator r0 = r5.iterator()
            java.lang.String r5 = X.AnonymousClass7TE.A18(r0)
            int r2 = r5.hashCode()
            r0 = 3005871(0x2dddaf, float:4.212122E-39)
            if (r2 == r0) goto L_0x01cf
            r0 = 3387192(0x33af38, float:4.746467E-39)
            if (r2 != r0) goto L_0x01cf
            java.lang.String r0 = "none"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x01cf
            r7 = 0
        L_0x01cf:
            X.SF0 r0 = new X.SF0
            r0.<init>(r7, r6, r1)
        L_0x01d4:
            r12.A0E = r0
            goto L_0x001c
        L_0x01d8:
            com.google.common.collect.ImmutableSet r0 = X.SF0.A03
            X.17k.A07(r0, r10)
            X.17k.A07(r9, r8)
            X.R1K r5 = new X.R1K
            r5.<init>(r0, r9)
            com.google.common.collect.ImmutableSet r0 = X.SF0.A04
            X.17k.A07(r0, r10)
            X.17k.A07(r9, r8)
            X.R1K r8 = new X.R1K
            r8.<init>(r0, r9)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x01ff
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01ff
            goto L_0x01cf
        L_0x01ff:
            java.lang.String r6 = "filled"
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x020f
            java.lang.Object r6 = r5.next()
        L_0x020f:
            java.lang.String r6 = (java.lang.String) r6
            int r5 = r6.hashCode()
            r0 = -1274499742(0xffffffffb408ad62, float:-1.2729063E-7)
            if (r5 == r0) goto L_0x0229
            r0 = 3417674(0x34264a, float:4.789181E-39)
            if (r5 != r0) goto L_0x0229
            java.lang.String r0 = "open"
            boolean r0 = r6.equals(r0)
            r6 = 2
            if (r0 != 0) goto L_0x022a
        L_0x0229:
            r6 = 1
        L_0x022a:
            java.lang.String r7 = "circle"
            java.util.Iterator r5 = r8.iterator()
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x023a
            java.lang.Object r7 = r5.next()
        L_0x023a:
            java.lang.String r7 = (java.lang.String) r7
            int r5 = r7.hashCode()
            r0 = -1360216880(0xffffffffaeecbcd0, float:-1.0765577E-10)
            if (r5 == r0) goto L_0x0268
            r0 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r5 == r0) goto L_0x025e
            r0 = 99657(0x18549, float:1.39649E-40)
            if (r5 != r0) goto L_0x0268
            java.lang.String r0 = "dot"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0268
        L_0x0257:
            X.SF0 r0 = new X.SF0
            r0.<init>(r2, r6, r1)
            goto L_0x01d4
        L_0x025e:
            java.lang.String r0 = "sesame"
            boolean r0 = r7.equals(r0)
            r2 = 3
            if (r0 != 0) goto L_0x0257
        L_0x0268:
            r2 = 1
            goto L_0x0257
        L_0x026a:
            boolean r0 = r5.equals(r11)
            r1 = -2
            goto L_0x0199
        L_0x0271:
            X.S3a r12 = A02(r12, r12)
            r0 = 0
            int r0 = X.C11323SMx.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x0281 }
            r12.A02 = r0     // Catch:{ IllegalArgumentException -> 0x0281 }
            r0 = 1
            r12.A0H = r0     // Catch:{ IllegalArgumentException -> 0x0281 }
            goto L_0x001c
        L_0x0281:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed parsing background value: "
        L_0x0287:
            java.lang.String r0 = X.Pxg.A0s(r0, r2, r1)
            X.STH.A03(r5, r0)
            goto L_0x001c
        L_0x0290:
            X.S3a r12 = A02(r12, r12)
            android.text.Layout$Alignment r0 = A01(r2)
            r12.A0C = r0
            goto L_0x001c
        L_0x029c:
            java.lang.String r1 = X.C256643w7.A00(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1461280213: goto L_0x02a9;
                case -1026963764: goto L_0x02b8;
                case 913457136: goto L_0x02ca;
                case 1679736913: goto L_0x02d9;
                default: goto L_0x02a7;
            }
        L_0x02a7:
            goto L_0x001c
        L_0x02a9:
            java.lang.String r0 = "nounderline"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 0
            goto L_0x02c6
        L_0x02b8:
            java.lang.String r0 = "underline"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 1
        L_0x02c6:
            r12.A0B = r0
            goto L_0x001c
        L_0x02ca:
            java.lang.String r0 = "nolinethrough"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 0
            goto L_0x02e6
        L_0x02d9:
            java.lang.String r0 = "linethrough"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 1
        L_0x02e6:
            r12.A07 = r0
            goto L_0x001c
        L_0x02ea:
            java.lang.String r1 = r13.getName()
            java.lang.String r0 = "style"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r12.A0G = r2
            goto L_0x001c
        L_0x02ff:
            java.lang.String r1 = X.C256643w7.A00(r2)
            int r0 = r1.hashCode()
            switch(r0) {
                case -618561360: goto L_0x030c;
                case -410956671: goto L_0x030f;
                case -250518009: goto L_0x031d;
                case -136074796: goto L_0x032b;
                case 3016401: goto L_0x032f;
                case 3556653: goto L_0x033d;
                default: goto L_0x030a;
            }
        L_0x030a:
            goto L_0x001c
        L_0x030c:
            java.lang.String r0 = "baseContainer"
            goto L_0x0331
        L_0x030f:
            java.lang.String r0 = "container"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 1
            goto L_0x034b
        L_0x031d:
            java.lang.String r0 = "delimiter"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 4
            goto L_0x034b
        L_0x032b:
            java.lang.String r0 = "textContainer"
            goto L_0x0340
        L_0x032f:
            java.lang.String r0 = "base"
        L_0x0331:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 2
            goto L_0x034b
        L_0x033d:
            java.lang.String r0 = "text"
        L_0x0340:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 3
        L_0x034b:
            r12.A09 = r0
            goto L_0x001c
        L_0x034f:
            java.lang.String r1 = X.C256643w7.A00(r2)
            java.lang.String r0 = "all"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x036d
            java.lang.String r0 = "none"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 0
        L_0x0369:
            r12.A0A = r0
            goto L_0x001c
        L_0x036d:
            X.S3a r12 = A02(r12, r12)
            r0 = 1
            goto L_0x0369
        L_0x0373:
            java.lang.String r1 = X.C256643w7.A00(r2)
            java.lang.String r0 = "before"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0390
            java.lang.String r0 = "after"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            X.S3a r12 = A02(r12, r12)
            r0 = 2
        L_0x038c:
            r12.A08 = r0
            goto L_0x001c
        L_0x0390:
            X.S3a r12 = A02(r12, r12)
            r0 = 1
            goto L_0x038c
        L_0x0396:
            java.lang.String r0 = "fontStyle"
            boolean r0 = r1.equals(r0)
            r1 = 0
            goto L_0x041c
        L_0x039e:
            java.lang.String r0 = "fontFamily"
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L_0x041c
        L_0x03a6:
            java.lang.String r0 = "textAlign"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto L_0x041c
        L_0x03af:
            java.lang.String r0 = "textDecoration"
            boolean r0 = r1.equals(r0)
            r1 = 3
            goto L_0x041c
        L_0x03b8:
            java.lang.String r0 = "fontWeight"
            boolean r0 = r1.equals(r0)
            r1 = 4
            goto L_0x041c
        L_0x03c0:
            java.lang.String r0 = "id"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L_0x041c
        L_0x03c8:
            java.lang.String r0 = "ruby"
            boolean r0 = r1.equals(r0)
            r1 = 6
            goto L_0x041c
        L_0x03d1:
            java.lang.String r0 = "color"
            boolean r0 = r1.equals(r0)
            r1 = 7
            goto L_0x041c
        L_0x03d9:
            java.lang.String r0 = "shear"
            boolean r0 = r1.equals(r0)
            r1 = 8
            goto L_0x041c
        L_0x03e3:
            java.lang.String r0 = "textCombine"
            boolean r0 = r1.equals(r0)
            r1 = 9
            goto L_0x041c
        L_0x03ed:
            java.lang.String r0 = "fontSize"
            boolean r0 = r1.equals(r0)
            r1 = 10
            goto L_0x041c
        L_0x03f6:
            java.lang.String r0 = "textEmphasis"
            boolean r0 = r1.equals(r0)
            r1 = 11
            goto L_0x041c
        L_0x0400:
            java.lang.String r0 = "rubyPosition"
            boolean r0 = r1.equals(r0)
            r1 = 12
            goto L_0x041c
        L_0x040a:
            java.lang.String r0 = "backgroundColor"
            boolean r0 = r1.equals(r0)
            r1 = 13
            goto L_0x041c
        L_0x0413:
            java.lang.String r0 = "multiRowAlign"
            boolean r0 = r1.equals(r0)
            r1 = 14
        L_0x041c:
            if (r0 != 0) goto L_0x0017
            goto L_0x0016
        L_0x0420:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11734SfV.A03(X.S3a, org.xmlpull.v1.XmlPullParser):X.S3a");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:42|43) */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02a9, code lost:
        if (r1 != r9) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04ac, code lost:
        r36 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04ae, code lost:
        if (r1 != false) goto L_0x04b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.Pxh.A1J("Ignoring malformed cell resolution: ", r14, "TtmlParser");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b3, code lost:
        if (r13.equals("information") != false) goto L_0x01b5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0103 */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02c5 A[Catch:{ QDv -> 0x02d4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0486 A[Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }] */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0369 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0110 A[Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E1l(X.C13507TbY r41, X.C11115SAs r42, byte[] r43, int r44, int r45) {
        /*
            r40 = this;
            r17 = 0
            r20 = 0
            java.lang.String r19 = ""
            r0 = r40
            org.xmlpull.v1.XmlPullParserFactory r0 = r0.A00     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.HashMap r21 = X.AnonymousClass7TE.A1E()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.HashMap r22 = X.AnonymousClass7TE.A1E()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.HashMap r18 = X.AnonymousClass7TE.A1E()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            X.Ryi r3 = new X.Ryi     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r4 = r19
            r6 = r5
            r7 = r5
            r8 = r5
            r9 = r5
            r11 = r10
            r12 = r10
            r13 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r2 = r22
            r2.put(r4, r3)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r4 = r43
            r3 = r44
            r2 = r45
            r1.<init>(r4, r3, r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r25 = 0
            r3 = 0
            r0.setInput(r1, r3)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.ArrayDeque r23 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r23.<init>()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.RtT r6 = A01     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r5 = 15
            r24 = 0
        L_0x0052:
            r7 = 1
            if (r2 == r7) goto L_0x0521
            java.lang.Object r4 = r23.peek()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.ST1 r4 = (X.ST1) r4     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r9 = 2
            if (r24 != 0) goto L_0x034f
            java.lang.String r13 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r15 = "tt"
            if (r2 != r9) goto L_0x02de
            boolean r1 = r15.equals(r13)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x0138
            java.lang.String r5 = "http://www.w3.org/ns/ttml#parameter"
            java.lang.String r1 = "frameRate"
            java.lang.String r1 = r0.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x008d
            int r10 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x007b:
            r6 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "frameRateMultiplier"
            java.lang.String r2 = r0.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r2 == 0) goto L_0x00a9
            java.lang.String r1 = " "
            java.lang.String[] r8 = X.Pxh.A1b(r2, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r1 = r8.length     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0090
        L_0x008d:
            r10 = 30
            goto L_0x007b
        L_0x0090:
            r6 = 0
            boolean r2 = X.AnonymousClass7TF.A1S(r1, r9)
            java.lang.String r1 = "frameRateMultiplier doesn't have 2 parts"
            X.C11366SPh.A03(r2, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r1 = r8[r6]     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            float r6 = (float) r1     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r1 = r8[r7]     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            float r1 = (float) r1     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            float r6 = r6 / r1
        L_0x00a9:
            r8 = 1
            java.lang.String r1 = "subFrameRate"
            java.lang.String r1 = r0.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x00b7
            int r8 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x00b7:
            r2 = 1
            java.lang.String r1 = "tickRate"
            java.lang.String r1 = r0.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x00c5
            int r2 = java.lang.Integer.parseInt(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x00c5:
            float r1 = (float) r10     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            float r1 = r1 * r6
            X.RtT r6 = new X.RtT     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r6.<init>(r8, r2, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = "cellResolution"
            java.lang.String r14 = r0.getAttributeValue(r5, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r14 == 0) goto L_0x0106
            java.util.regex.Pattern r1 = A02     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.regex.Matcher r1 = r1.matcher(r14)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            boolean r2 = r1.matches()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r12 = "Ignoring malformed cell resolution: "
            java.lang.String r11 = "TtmlParser"
            if (r2 != 0) goto L_0x00e8
            X.Pxh.A1J(r12, r14, r11)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0106
        L_0x00e8:
            r10 = 1
            int r8 = X.Pxi.A07(r1, r7)     // Catch:{ NumberFormatException -> 0x0103 }
            int r5 = X.Pxi.A07(r1, r9)     // Catch:{ NumberFormatException -> 0x0103 }
            if (r8 == 0) goto L_0x00f6
            if (r5 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r10 = 0
        L_0x00f7:
            java.lang.String r2 = "Invalid cell resolution "
            java.lang.String r1 = " "
            java.lang.String r1 = X.002.A02(r8, r5, r2, r1)     // Catch:{ NumberFormatException -> 0x0103 }
            X.C11366SPh.A03(r10, r1)     // Catch:{ NumberFormatException -> 0x0103 }
            goto L_0x0108
        L_0x0103:
            X.Pxh.A1J(r12, r14, r11)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x0106:
            r5 = 15
        L_0x0108:
            java.lang.String r1 = "extent"
            java.lang.String r8 = X.SKA.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r8 == 0) goto L_0x0136
            java.util.regex.Pattern r1 = A05     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.regex.Matcher r1 = r1.matcher(r8)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            boolean r10 = r1.matches()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r2 = "TtmlParser"
            if (r10 != 0) goto L_0x0124
            java.lang.String r1 = "Ignoring non-pixel tts extent: "
            X.Pxh.A1J(r1, r8, r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0136
        L_0x0124:
            int r10 = X.Pxi.A07(r1, r7)     // Catch:{ NumberFormatException -> 0x0131 }
            int r17 = X.Pxi.A07(r1, r9)     // Catch:{ NumberFormatException -> 0x0131 }
            r20 = r10
            r25 = 1
            goto L_0x0138
        L_0x0131:
            java.lang.String r1 = "Ignoring malformed tts extent: "
            X.Pxh.A1J(r1, r8, r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x0136:
            r25 = 0
        L_0x0138:
            boolean r1 = r13.equals(r15)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "head"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "body"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "div"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "p"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "span"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "br"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "style"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "styling"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "layout"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "region"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "metadata"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "image"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "data"
            boolean r1 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x01b5
            java.lang.String r1 = "information"
            boolean r2 = r13.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r1 = 0
            if (r2 == 0) goto L_0x01b6
        L_0x01b5:
            r1 = 1
        L_0x01b6:
            java.lang.String r14 = "TtmlParser"
            if (r1 != 0) goto L_0x01c9
            java.lang.String r2 = "Ignoring unsupported tag: "
            java.lang.String r1 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = X.002.A0R(r2, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.STH.A01(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x02da
        L_0x01c9:
            java.lang.String r11 = "head"
            boolean r1 = r11.equals(r13)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x0372
            int r10 = r0.getAttributeCount()     // Catch:{ QDv -> 0x02d4 }
            r8 = 0
            X.S3a r28 = A03(r8, r0)     // Catch:{ QDv -> 0x02d4 }
            r31 = r19
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = r8
            r9 = 0
        L_0x01ee:
            if (r9 >= r10) goto L_0x0277
            java.lang.String r11 = r0.getAttributeName(r9)     // Catch:{ QDv -> 0x02d4 }
            java.lang.String r2 = r0.getAttributeValue(r9)     // Catch:{ QDv -> 0x02d4 }
            int r1 = r11.hashCode()     // Catch:{ QDv -> 0x02d4 }
            switch(r1) {
                case -934795532: goto L_0x0260;
                case 99841: goto L_0x0253;
                case 100571: goto L_0x0246;
                case 93616297: goto L_0x0239;
                case 109780401: goto L_0x0215;
                case 1292595405: goto L_0x0200;
                default: goto L_0x01ff;
            }     // Catch:{ QDv -> 0x02d4 }
        L_0x01ff:
            goto L_0x0273
        L_0x0200:
            java.lang.String r1 = "backgroundImage"
            boolean r1 = r11.equals(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            java.lang.String r1 = "#"
            boolean r1 = r2.startsWith(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            java.lang.String r8 = r2.substring(r7)     // Catch:{ QDv -> 0x02d4 }
            goto L_0x0273
        L_0x0215:
            java.lang.String r1 = "style"
            boolean r1 = r11.equals(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            java.lang.String r2 = r2.trim()     // Catch:{ QDv -> 0x02d4 }
            boolean r1 = r2.isEmpty()     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x022f
            r1 = 0
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ QDv -> 0x02d4 }
        L_0x022b:
            int r1 = r2.length     // Catch:{ QDv -> 0x02d4 }
            if (r1 <= 0) goto L_0x0273
            goto L_0x0236
        L_0x022f:
            java.lang.String r1 = "\\s+"
            java.lang.String[] r2 = X.Pxh.A1b(r2, r1)     // Catch:{ QDv -> 0x02d4 }
            goto L_0x022b
        L_0x0236:
            r33 = r2
            goto L_0x0273
        L_0x0239:
            java.lang.String r1 = "begin"
            boolean r1 = r11.equals(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            long r34 = A00(r6, r2)     // Catch:{ QDv -> 0x02d4 }
            goto L_0x0273
        L_0x0246:
            java.lang.String r1 = "end"
            boolean r1 = r11.equals(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            long r15 = A00(r6, r2)     // Catch:{ QDv -> 0x02d4 }
            goto L_0x0273
        L_0x0253:
            java.lang.String r1 = "dur"
            boolean r1 = r11.equals(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            long r12 = A00(r6, r2)     // Catch:{ QDv -> 0x02d4 }
            goto L_0x0273
        L_0x0260:
            java.lang.String r1 = "region"
            boolean r1 = r11.equals(r1)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            r1 = r22
            boolean r1 = r1.containsKey(r2)     // Catch:{ QDv -> 0x02d4 }
            if (r1 == 0) goto L_0x0273
            r31 = r2
        L_0x0273:
            int r9 = r9 + 1
            goto L_0x01ee
        L_0x0277:
            if (r4 == 0) goto L_0x0290
            long r1 = r4.A02     // Catch:{ QDv -> 0x02d4 }
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0295
            int r7 = (r34 > r9 ? 1 : (r34 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x028a
            long r34 = r34 + r1
        L_0x028a:
            int r7 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x0295
            long r15 = r15 + r1
            goto L_0x0295
        L_0x0290:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0295:
            int r1 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x02a3
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x02a0
            long r1 = r34 + r12
            goto L_0x02ab
        L_0x02a0:
            if (r4 == 0) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r1 = r15
            goto L_0x02ab
        L_0x02a5:
            long r1 = r4.A01     // Catch:{ QDv -> 0x02d4 }
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x02a3
        L_0x02ab:
            java.lang.String r29 = r0.getName()     // Catch:{ QDv -> 0x02d4 }
            r30 = 0
            X.ST1 r7 = new X.ST1     // Catch:{ QDv -> 0x02d4 }
            r26 = r7
            r27 = r4
            r32 = r8
            r36 = r1
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r36)     // Catch:{ QDv -> 0x02d4 }
            r1 = r23
            r1.push(r7)     // Catch:{ QDv -> 0x02d4 }
            if (r4 == 0) goto L_0x0369
            java.util.List r1 = r4.A00     // Catch:{ QDv -> 0x02d4 }
            if (r1 != 0) goto L_0x02cf
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ QDv -> 0x02d4 }
            r4.A00 = r1     // Catch:{ QDv -> 0x02d4 }
        L_0x02cf:
            r1.add(r7)     // Catch:{ QDv -> 0x02d4 }
            goto L_0x0369
        L_0x02d4:
            r2 = move-exception
            java.lang.String r1 = "Suppressing parser error"
            X.STH.A05(r14, r1, r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x02da:
            r24 = 1
            goto L_0x0369
        L_0x02de:
            r1 = 4
            if (r2 != r1) goto L_0x032a
            r4.getClass()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r2 = r0.getText()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = "\r\n"
            java.lang.String r8 = "\n"
            java.lang.String r2 = r2.replaceAll(r1, r8)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = " *\n *"
            java.lang.String r1 = r2.replaceAll(r1, r8)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r7 = " "
            java.lang.String r2 = r1.replaceAll(r8, r7)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = "[ \t\\x0B\f\r]+"
            java.lang.String r30 = r2.replaceAll(r1, r7)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r27 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            X.ST1 r2 = new X.ST1     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r26 = r2
            r28 = r27
            r29 = r27
            r31 = r19
            r32 = r27
            r33 = r27
            r36 = r34
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r36)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.List r1 = r4.A00     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x0326
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r4.A00 = r1     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x0326:
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0369
        L_0x032a:
            r1 = 3
            if (r2 != r1) goto L_0x0369
            java.lang.String r1 = r0.getName()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            boolean r1 = r1.equals(r15)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x034b
            java.lang.Object r7 = r23.peek()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r7.getClass()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.ST1 r7 = (X.ST1) r7     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.Rwz r3 = new X.Rwz     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r4 = r21
            r2 = r18
            r1 = r22
            r3.<init>(r7, r4, r1, r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x034b:
            r23.pop()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0369
        L_0x034f:
            if (r2 != r9) goto L_0x0354
            int r24 = r24 + 1
            goto L_0x0369
        L_0x0354:
            r1 = 3
            if (r2 != r1) goto L_0x0369
            int r24 = r24 + -1
            goto L_0x0369
        L_0x035a:
            java.lang.String r2 = r8.A0G     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r2 == 0) goto L_0x0363
            r1 = r21
            r1.put(r2, r8)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x0363:
            boolean r1 = X.SKA.A01(r11, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x0372
        L_0x0369:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0052
        L_0x0372:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r2 = "style"
            boolean r1 = X.SKA.A02(r2, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x03b6
            java.lang.String r2 = X.SKA.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.S3a r1 = new X.S3a     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.S3a r8 = A03(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r2 == 0) goto L_0x035a
            java.lang.String r2 = r2.trim()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            boolean r1 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x039d
            r1 = 0
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x039a:
            int r12 = r4.length     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r10 = 0
            goto L_0x03a4
        L_0x039d:
            java.lang.String r1 = "\\s+"
            java.lang.String[] r4 = X.Pxh.A1b(r2, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x039a
        L_0x03a4:
            if (r10 >= r12) goto L_0x035a
            r2 = r4[r10]     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r1 = r21
            java.lang.Object r1 = r1.get(r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            X.S3a r1 = (X.C10968S3a) r1     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r8.A00(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r10 = r10 + 1
            goto L_0x03a4
        L_0x03b6:
            java.lang.String r1 = "region"
            boolean r1 = X.SKA.A02(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x04f4
            java.lang.String r1 = "id"
            java.lang.String r27 = X.SKA.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r27 == 0) goto L_0x0363
            java.lang.String r1 = "origin"
            java.lang.String r12 = X.SKA.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r12 == 0) goto L_0x04e2
            java.util.regex.Pattern r1 = A04     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.regex.Matcher r8 = r1.matcher(r12)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.regex.Pattern r13 = A05     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.regex.Matcher r10 = r13.matcher(r12)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            boolean r15 = r8.matches()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r2 = "Ignoring region with malformed origin: "
            java.lang.String r4 = "Ignoring region with missing tts:extent: "
            r16 = 1120403456(0x42c80000, float:100.0)
            if (r15 == 0) goto L_0x03f5
            float r10 = X.Pxj.A07(r8, r7)     // Catch:{ NumberFormatException -> 0x04d1 }
            float r10 = r10 / r16
            float r8 = X.Pxj.A07(r8, r9)     // Catch:{ NumberFormatException -> 0x04d1 }
            float r8 = r8 / r16
            goto L_0x040f
        L_0x03f5:
            boolean r8 = r10.matches()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r8 == 0) goto L_0x04db
            if (r25 == 0) goto L_0x04d6
            int r8 = X.Pxi.A07(r10, r7)     // Catch:{ NumberFormatException -> 0x04d1 }
            int r2 = X.Pxi.A07(r10, r9)     // Catch:{ NumberFormatException -> 0x04d1 }
            float r10 = (float) r8     // Catch:{ NumberFormatException -> 0x04d1 }
            r8 = r20
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x04d1 }
            float r10 = r10 / r8
            float r8 = (float) r2     // Catch:{ NumberFormatException -> 0x04d1 }
            r2 = r17
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x04d1 }
            float r8 = r8 / r2
        L_0x040f:
            java.lang.String r2 = "extent"
            java.lang.String r2 = X.SKA.A00(r2, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r2 == 0) goto L_0x04ce
            java.util.regex.Matcher r1 = r1.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.util.regex.Matcher r13 = r13.matcher(r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            boolean r15 = r1.matches()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r2 = "Ignoring region with malformed extent: "
            if (r15 == 0) goto L_0x0434
            float r4 = X.Pxj.A07(r1, r7)     // Catch:{ NumberFormatException -> 0x04d1 }
            float r4 = r4 / r16
            float r2 = X.Pxj.A07(r1, r9)     // Catch:{ NumberFormatException -> 0x04d1 }
            float r2 = r2 / r16
            goto L_0x044e
        L_0x0434:
            boolean r1 = r13.matches()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x04e5
            if (r25 == 0) goto L_0x04d6
            int r1 = X.Pxi.A07(r13, r7)     // Catch:{ NumberFormatException -> 0x04d1 }
            int r2 = X.Pxi.A07(r13, r9)     // Catch:{ NumberFormatException -> 0x04d1 }
            float r4 = (float) r1     // Catch:{ NumberFormatException -> 0x04d1 }
            r1 = r20
            float r1 = (float) r1     // Catch:{ NumberFormatException -> 0x04d1 }
            float r4 = r4 / r1
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x04d1 }
            r1 = r17
            float r1 = (float) r1     // Catch:{ NumberFormatException -> 0x04d1 }
            float r2 = r2 / r1
        L_0x044e:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = X.SKA.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x0476
            java.lang.String r12 = X.C256643w7.A00(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = "center"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 != 0) goto L_0x046e
            java.lang.String r1 = "after"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x0476
            float r8 = r8 + r2
            r34 = 2
            goto L_0x0478
        L_0x046e:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r1
            float r8 = r8 + r1
            r34 = 1
            goto L_0x0478
        L_0x0476:
            r34 = 0
        L_0x0478:
            r32 = 1065353216(0x3f800000, float:1.0)
            float r1 = (float) r5     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            float r32 = r32 / r1
            java.lang.String r1 = "writingMode"
            java.lang.String r1 = X.SKA.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x04b0
            java.lang.String r12 = X.C256643w7.A00(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            int r1 = r12.hashCode()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            switch(r1) {
                case 3694: goto L_0x0492;
                case 3553396: goto L_0x049a;
                case 3553576: goto L_0x04a2;
                default: goto L_0x0491;
            }     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x0491:
            goto L_0x04b0
        L_0x0492:
            java.lang.String r1 = "tb"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x04ac
        L_0x049a:
            java.lang.String r1 = "tblr"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x04ac
        L_0x04a2:
            java.lang.String r1 = "tbrl"
            boolean r1 = r12.equals(r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r36 = 1
            goto L_0x04ae
        L_0x04ac:
            r36 = 2
        L_0x04ae:
            if (r1 != 0) goto L_0x04b2
        L_0x04b0:
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x04b2:
            r33 = 0
            X.Ryi r1 = new X.Ryi     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r26 = r1
            r28 = r10
            r29 = r8
            r30 = r4
            r31 = r2
            r35 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r4 = r1.A09     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r2 = r22
            r2.put(r4, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0363
        L_0x04ce:
            java.lang.String r1 = "Ignoring region without an extent"
            goto L_0x04ef
        L_0x04d1:
            java.lang.String r1 = X.002.A0R(r2, r12)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x04ef
        L_0x04d6:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x04eb
        L_0x04db:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r4 = "Ignoring region with unsupported origin: "
            goto L_0x04eb
        L_0x04e2:
            java.lang.String r1 = "Ignoring region without an origin"
            goto L_0x04ef
        L_0x04e5:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r4 = "Ignoring region with unsupported extent: "
        L_0x04eb:
            java.lang.String r1 = X.Pxg.A0s(r4, r12, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x04ef:
            X.STH.A03(r14, r1)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            goto L_0x0363
        L_0x04f4:
            java.lang.String r8 = "metadata"
            boolean r1 = X.SKA.A02(r8, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x0363
        L_0x04fd:
            r0.next()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            java.lang.String r1 = "image"
            boolean r1 = X.SKA.A02(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x0519
            java.lang.String r1 = "id"
            java.lang.String r4 = X.SKA.A00(r1, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r4 == 0) goto L_0x0519
            java.lang.String r2 = r0.nextText()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            r1 = r18
            r1.put(r4, r2)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
        L_0x0519:
            boolean r1 = X.SKA.A01(r8, r0)     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            if (r1 == 0) goto L_0x04fd
            goto L_0x0363
        L_0x0521:
            r3.getClass()     // Catch:{ XmlPullParserException -> 0x0720, IOException -> 0x0718 }
            long[] r5 = r3.A04
            int r4 = r5.length
            if (r4 == 0) goto L_0x0717
            r2 = 0
        L_0x052a:
            if (r2 >= r4) goto L_0x0717
            r16 = r5[r2]
            X.ST1 r11 = r3.A00
            java.util.Map r10 = r3.A01
            java.util.Map r0 = r3.A03
            r39 = r0
            java.util.Map r7 = r3.A02
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.lang.String r6 = r11.A06
            r0 = r16
            X.ST1.A01(r11, r6, r8, r0)
            java.util.TreeMap r36 = new java.util.TreeMap
            r36.<init>()
            r9 = 0
            r20 = r11
            r21 = r6
            r22 = r36
            r23 = r16
            r25 = r9
            X.ST1.A02(r20, r21, r22, r23, r25)
            r34 = r10
            r35 = r39
            r37 = r16
            r32 = r11
            r33 = r6
            X.ST1.A03(r32, r33, r34, r35, r36, r37)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r14 = r8.iterator()
        L_0x056b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x05c6
            java.lang.Object r8 = r14.next()
            android.util.Pair r8 = (android.util.Pair) r8
            java.lang.Object r0 = r8.second
            java.lang.String r0 = X.DbT.A11(r0, r7)
            if (r0 == 0) goto L_0x056b
            byte[] r1 = android.util.Base64.decode(r0, r9)
            int r0 = r1.length
            android.graphics.Bitmap r21 = android.graphics.BitmapFactory.decodeByteArray(r1, r9, r0)
            java.lang.Object r1 = r8.first
            r0 = r39
            java.lang.Object r0 = X.Pxe.A0r(r1, r0)
            X.Ryi r0 = (X.C10822Ryi) r0
            r22 = 0
            float r13 = r0.A02
            float r12 = r0.A01
            int r11 = r0.A05
            float r10 = r0.A04
            float r8 = r0.A00
            int r1 = r0.A08
            r34 = -2147483648(0xffffffff80000000, float:-0.0)
            r27 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r30 = 0
            X.SIh r0 = new X.SIh
            r23 = r22
            r24 = r22
            r25 = r12
            r26 = r13
            r28 = r10
            r29 = r8
            r31 = r9
            r32 = r11
            r33 = r9
            r35 = r1
            r20 = r0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r6.add(r0)
            goto L_0x056b
        L_0x05c6:
            java.util.Iterator r18 = X.AnonymousClass7TF.A0s(r36)
        L_0x05ca:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x06e9
            java.util.Map$Entry r7 = X.AnonymousClass7TE.A1J(r18)
            java.lang.Object r1 = r7.getKey()
            r0 = r39
            java.lang.Object r8 = X.Pxe.A0r(r1, r0)
            X.Ryi r8 = (X.C10822Ryi) r8
            java.lang.Object r7 = r7.getValue()
            X.S3W r7 = (X.S3W) r7
            java.lang.CharSequence r10 = r7.A0E
            r10.getClass()
            android.text.SpannableStringBuilder r10 = (android.text.SpannableStringBuilder) r10
            int r1 = r10.length()
            java.lang.Class<X.RS4> r0 = X.RS4.class
            r13 = 0
            java.lang.Object[] r15 = r10.getSpans(r9, r1, r0)
            X.RS4[] r15 = (X.RS4[]) r15
            int r14 = r15.length
            r12 = 0
        L_0x05fc:
            if (r12 >= r14) goto L_0x0610
            r0 = r15[r12]
            int r11 = r10.getSpanStart(r0)
            int r1 = r10.getSpanEnd(r0)
            r0 = r19
            r10.replace(r11, r1, r0)
            int r12 = r12 + 1
            goto L_0x05fc
        L_0x0610:
            r12 = 0
        L_0x0611:
            int r0 = r10.length()
            r14 = 32
            if (r12 >= r0) goto L_0x063b
            char r0 = r10.charAt(r12)
            if (r0 != r14) goto L_0x0638
            int r11 = r12 + 1
            r1 = r11
        L_0x0622:
            int r0 = r10.length()
            if (r1 >= r0) goto L_0x0631
            char r0 = r10.charAt(r1)
            if (r0 != r14) goto L_0x0631
            int r1 = r1 + 1
            goto L_0x0622
        L_0x0631:
            int r1 = r1 - r11
            if (r1 <= 0) goto L_0x0638
            int r1 = r1 + r12
            r10.delete(r12, r1)
        L_0x0638:
            int r12 = r12 + 1
            goto L_0x0611
        L_0x063b:
            int r0 = r10.length()
            r11 = 1
            if (r0 <= 0) goto L_0x064b
            char r0 = r10.charAt(r9)
            if (r0 != r14) goto L_0x064b
            r10.delete(r9, r11)
        L_0x064b:
            r1 = 0
        L_0x064c:
            int r0 = r10.length()
            int r0 = r0 - r11
            r12 = 10
            if (r1 >= r0) goto L_0x066b
            char r0 = r10.charAt(r1)
            if (r0 != r12) goto L_0x0668
            int r12 = r1 + 1
            char r0 = r10.charAt(r12)
            if (r0 != r14) goto L_0x0668
            int r0 = r1 + 2
            r10.delete(r12, r0)
        L_0x0668:
            int r1 = r1 + 1
            goto L_0x064c
        L_0x066b:
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x0688
            int r0 = r10.length()
            int r0 = r0 - r11
            char r0 = r10.charAt(r0)
            if (r0 != r14) goto L_0x0688
            int r1 = r10.length()
            int r1 = r1 - r11
            int r0 = r10.length()
            r10.delete(r1, r0)
        L_0x0688:
            int r0 = r10.length()
            int r0 = r0 - r11
            if (r13 >= r0) goto L_0x06a3
            char r0 = r10.charAt(r13)
            if (r0 != r14) goto L_0x06a0
            int r1 = r13 + 1
            char r0 = r10.charAt(r1)
            if (r0 != r12) goto L_0x06a0
            r10.delete(r13, r1)
        L_0x06a0:
            int r13 = r13 + 1
            goto L_0x0688
        L_0x06a3:
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x06c0
            int r0 = r10.length()
            int r0 = r0 - r11
            char r0 = r10.charAt(r0)
            if (r0 != r12) goto L_0x06c0
            int r1 = r10.length()
            int r1 = r1 - r11
            int r0 = r10.length()
            r10.delete(r1, r0)
        L_0x06c0:
            float r1 = r8.A01
            int r0 = r8.A06
            r7.A01 = r1
            r7.A07 = r0
            int r0 = r8.A05
            r7.A06 = r0
            float r0 = r8.A02
            r7.A02 = r0
            float r0 = r8.A04
            r7.A04 = r0
            float r1 = r8.A03
            int r0 = r8.A07
            r7.A05 = r1
            r7.A09 = r0
            int r0 = r8.A08
            r7.A0A = r0
            X.SIh r0 = r7.A00()
            r6.add(r0)
            goto L_0x05ca
        L_0x06e9:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x070e
            int r0 = r4 + -1
            if (r2 == r0) goto L_0x0712
            int r0 = r2 + 1
            r11 = r5[r0]
            r0 = r5[r2]
            long r11 = r11 - r0
            r7 = 0
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x070e
            X.RtS r0 = new X.RtS
            r7 = r0
            r8 = r6
            r9 = r16
            r7.<init>(r8, r9, r11)
            r1 = r41
            r1.accept(r0)
        L_0x070e:
            int r2 = r2 + 1
            goto L_0x052a
        L_0x0712:
            java.lang.IllegalStateException r0 = X.Pxe.A0i()
            throw r0
        L_0x0717:
            return
        L_0x0718:
            r1 = move-exception
            java.lang.String r0 = "Unexpected error when reading input."
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)
            throw r0
        L_0x0720:
            r1 = move-exception
            java.lang.String r0 = "Unable to decode source"
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11734SfV.E1l(X.TbY, X.SAs, byte[], int, int):void");
    }
}
