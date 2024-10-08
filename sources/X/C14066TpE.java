package X;

import android.content.res.Resources;
import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.TpE  reason: case insensitive filesystem */
public abstract class C14066TpE {
    public static final Set A00 = ImmutableSet.A05(new Object[]{Locale.CHINA, Locale.TAIWAN, Locale.JAPAN, Locale.KOREA}, 4);

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r4 >= r10) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.content.res.Resources r13, java.lang.Integer r14, java.lang.Integer r15, boolean r16) {
        /*
            r1 = 0
            android.content.res.Configuration r0 = r13.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
            java.util.Locale$Category r0 = java.util.Locale.Category.FORMAT
            java.util.Locale r1 = java.util.Locale.getDefault(r0)
        L_0x0015:
            if (r14 != 0) goto L_0x0027
            java.lang.String r0 = ""
            return r0
        L_0x001a:
            android.content.res.Configuration r0 = r13.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            java.util.Locale r1 = r0.get(r1)
            goto L_0x0015
        L_0x0027:
            int r7 = r14.intValue()
            if (r15 == 0) goto L_0x003c
            int r0 = r15.intValue()
        L_0x0031:
            if (r7 >= r0) goto L_0x003f
            java.text.NumberFormat r0 = java.text.NumberFormat.getNumberInstance(r1)
            java.lang.String r0 = r0.format(r14)
            return r0
        L_0x003c:
            r0 = 10000(0x2710, float:1.4013E-41)
            goto L_0x0031
        L_0x003f:
            java.util.Set r0 = A00
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x014d
            java.lang.Integer r6 = X.AnonymousClass05K.A00
        L_0x0049:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r12 = 1
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r6 != r0) goto L_0x0071
            if (r15 == 0) goto L_0x0071
            int r0 = r15.intValue()
            double r4 = (double) r0
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r10 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0071
            double r4 = (double) r7
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r8 = java.lang.Math.pow(r2, r0)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            int r1 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0072
        L_0x0071:
            r0 = 0
        L_0x0072:
            java.lang.String r8 = "%d"
            double r4 = (double) r7
            if (r0 == 0) goto L_0x00d6
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r0 = java.lang.Math.pow(r2, r0)
            double r4 = r4 / r0
            int r0 = (int) r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r12 = java.lang.String.format(r0, r8, r1)
            r8 = 3
        L_0x0090:
            r0 = 3
            java.lang.String r2 = "%s"
            if (r8 == r0) goto L_0x00cd
            r0 = 4
            if (r8 == r0) goto L_0x00c9
            r0 = 6
            if (r8 == r0) goto L_0x00c0
            r0 = 8
            if (r8 == r0) goto L_0x00bc
            r0 = 9
            if (r8 != r0) goto L_0x0151
            r1 = 2131973850(0x7f1356da, float:1.9584747E38)
            if (r16 == 0) goto L_0x00ab
            r1 = 2131973851(0x7f1356db, float:1.958475E38)
        L_0x00ab:
            java.lang.Object[] r0 = new java.lang.Object[]{r12}
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r2, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r13.getString(r1, r0)
            return r0
        L_0x00bc:
            r1 = 2131973852(0x7f1356dc, float:1.9584752E38)
            goto L_0x00ab
        L_0x00c0:
            r1 = 2131973853(0x7f1356dd, float:1.9584754E38)
            if (r16 == 0) goto L_0x00ab
            r1 = 2131973854(0x7f1356de, float:1.9584756E38)
            goto L_0x00ab
        L_0x00c9:
            r1 = 2131973855(0x7f1356df, float:1.9584758E38)
            goto L_0x00ab
        L_0x00cd:
            r1 = 2131973856(0x7f1356e0, float:1.958476E38)
            if (r16 == 0) goto L_0x00ab
            r1 = 2131973857(0x7f1356e1, float:1.9584762E38)
            goto L_0x00ab
        L_0x00d6:
            int r11 = r6.intValue()
            if (r11 == 0) goto L_0x014b
            r10 = 3
        L_0x00dd:
            double r0 = (double) r10
            double r6 = java.lang.Math.pow(r2, r0)
            double r8 = java.lang.Math.log10(r4)
            double r8 = java.lang.Math.floor(r8)
            double r8 = r8 / r0
            double r0 = java.lang.Math.floor(r8)
            double r0 = java.lang.Math.pow(r6, r0)
            double r8 = r4 / r0
            int r10 = r10 - r12
            double r0 = (double) r10
            double r6 = java.lang.Math.pow(r2, r0)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0144
            double r0 = java.lang.Math.floor(r8)
        L_0x0103:
            double r6 = r2 * r0
            double r6 = java.lang.Math.floor(r6)
            int r8 = (int) r6
            int r6 = r8 % 10
            if (r6 != 0) goto L_0x0141
            java.lang.String r6 = "%.0f"
        L_0x0110:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r12 = java.lang.String.format(r0, r6, r1)
            r8 = 0
            r10 = 1
        L_0x0122:
            if (r11 == 0) goto L_0x013f
            r9 = 3
        L_0x0125:
            int r1 = r9 + r8
            if (r11 == 0) goto L_0x013c
            r0 = 9
        L_0x012b:
            if (r1 > r0) goto L_0x0090
            double r6 = (double) r10
            double r0 = (double) r9
            double r0 = java.lang.Math.pow(r2, r0)
            double r6 = r6 * r0
            int r10 = (int) r6
            double r6 = (double) r10
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0090
            int r8 = r8 + r9
            goto L_0x0122
        L_0x013c:
            r0 = 8
            goto L_0x012b
        L_0x013f:
            r9 = 4
            goto L_0x0125
        L_0x0141:
            java.lang.String r6 = "%.1f"
            goto L_0x0110
        L_0x0144:
            double r8 = r8 * r2
            double r0 = java.lang.Math.floor(r8)
            double r0 = r0 / r2
            goto L_0x0103
        L_0x014b:
            r10 = 4
            goto L_0x00dd
        L_0x014d:
            java.lang.Integer r6 = X.AnonymousClass05K.A01
            goto L_0x0049
        L_0x0151:
            r0 = 969(0x3c9, float:1.358E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.002.A0O(r0, r8)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14066TpE.A00(android.content.res.Resources, java.lang.Integer, java.lang.Integer, boolean):java.lang.String");
    }

    public static String A01(Resources resources, Integer num, boolean z) {
        return A00(resources, num, (Integer) null, z);
    }
}
