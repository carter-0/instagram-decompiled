package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.51g  reason: invalid class name */
public abstract class AnonymousClass51g {
    public static final ThreadLocal A00 = new ThreadLocal();

    /* JADX WARNING: type inference failed for: r1v33, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0105, code lost:
        if (r7 > 100.0f) goto L_0x0107;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015e  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList A00(android.content.res.Resources.Theme r33, android.content.res.Resources r34, android.util.AttributeSet r35, org.xmlpull.v1.XmlPullParser r36) {
        /*
            java.lang.String r2 = r36.getName()
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x030e
            int r0 = r36.getDepth()
            r5 = 1
            int r32 = r0 + 1
            r1 = 20
            int[][] r0 = new int[r1][]
            r31 = r0
            int[] r8 = new int[r1]
            r4 = 0
        L_0x001c:
            int r2 = r36.next()
            if (r2 == r5) goto L_0x02fb
            int r1 = r36.getDepth()
            r0 = r32
            if (r1 >= r0) goto L_0x002d
            r0 = 3
            if (r2 == r0) goto L_0x02fb
        L_0x002d:
            r6 = 2
            if (r2 != r6) goto L_0x001c
            r0 = r32
            if (r1 > r0) goto L_0x001c
            java.lang.String r1 = r36.getName()
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            int[] r1 = X.AnonymousClass026.A00
            r12 = r33
            r10 = r34
            r11 = r35
            if (r33 != 0) goto L_0x02f4
            android.content.res.TypedArray r9 = r10.obtainAttributes(r11, r1)
        L_0x004e:
            r3 = 0
            r0 = -1
            int r13 = r9.getResourceId(r3, r0)
            r7 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r0) goto L_0x008f
            java.lang.ThreadLocal r1 = A00
            java.lang.Object r0 = r1.get()
            android.util.TypedValue r0 = (android.util.TypedValue) r0
            if (r0 != 0) goto L_0x006b
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1.set(r0)
        L_0x006b:
            r2 = 1
            r10.getValue(r13, r0, r5)
            int r1 = r0.type
            r0 = 28
            if (r1 < r0) goto L_0x008d
            r0 = 31
            if (r1 > r0) goto L_0x008d
        L_0x0079:
            if (r2 != 0) goto L_0x008f
            android.content.res.XmlResourceParser r0 = r10.getXml(r13)     // Catch:{ Exception -> 0x0088 }
            android.content.res.ColorStateList r0 = A01(r12, r10, r0)     // Catch:{ Exception -> 0x0088 }
            int r15 = r0.getDefaultColor()     // Catch:{ Exception -> 0x0088 }
            goto L_0x0093
        L_0x0088:
            int r15 = r9.getColor(r3, r7)
            goto L_0x0093
        L_0x008d:
            r2 = 0
            goto L_0x0079
        L_0x008f:
            int r15 = r9.getColor(r3, r7)
        L_0x0093:
            r2 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = r9.hasValue(r5)
            if (r0 == 0) goto L_0x00eb
            float r2 = r9.getFloat(r5, r2)
        L_0x009f:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r7 < r0) goto L_0x00e5
            boolean r0 = r9.hasValue(r6)
            if (r0 == 0) goto L_0x00e5
            float r7 = r9.getFloat(r6, r1)
        L_0x00b1:
            r9.recycle()
            int r14 = r11.getAttributeCount()
            int[] r13 = new int[r14]
            r12 = 0
            r10 = 0
        L_0x00bc:
            if (r12 >= r14) goto L_0x00f7
            int r9 = r11.getAttributeNameResource(r12)
            r0 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r9 == r0) goto L_0x00e2
            r0 = 16843551(0x101031f, float:2.3695797E-38)
            if (r9 == r0) goto L_0x00e2
            r0 = 2130968657(0x7f040051, float:1.7545974E38)
            if (r9 == r0) goto L_0x00e2
            r0 = 2130970440(0x7f040748, float:1.754959E38)
            if (r9 == r0) goto L_0x00e2
            int r1 = r10 + 1
            boolean r0 = r11.getAttributeBooleanValue(r12, r3)
            if (r0 != 0) goto L_0x00df
            int r9 = -r9
        L_0x00df:
            r13[r10] = r9
            r10 = r1
        L_0x00e2:
            int r12 = r12 + 1
            goto L_0x00bc
        L_0x00e5:
            r0 = 4
            float r7 = r9.getFloat(r0, r1)
            goto L_0x00b1
        L_0x00eb:
            r1 = 3
            boolean r0 = r9.hasValue(r1)
            if (r0 == 0) goto L_0x009f
            float r2 = r9.getFloat(r1, r2)
            goto L_0x009f
        L_0x00f7:
            int[] r30 = android.util.StateSet.trimStateSet(r13, r10)
            r13 = 0
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x0107
            r0 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r9 = 1
            if (r0 <= 0) goto L_0x0108
        L_0x0107:
            r9 = 0
        L_0x0108:
            r29 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r29 ? 1 : (r2 == r29 ? 0 : -1))
            if (r0 != 0) goto L_0x014d
            if (r9 != 0) goto L_0x014d
        L_0x0110:
            int r1 = r4 + 1
            int r0 = r8.length
            if (r1 <= r0) goto L_0x0122
            r1 = 4
            int r0 = r4 * 2
            if (r4 > r1) goto L_0x011c
            r0 = 8
        L_0x011c:
            int[] r0 = new int[r0]
            java.lang.System.arraycopy(r8, r3, r0, r3, r4)
            r8 = r0
        L_0x0122:
            r8[r4] = r15
            int r1 = r4 + 1
            r0 = r31
            int r0 = r0.length
            if (r1 <= r0) goto L_0x0147
            java.lang.Class r0 = r31.getClass()
            java.lang.Class r2 = r0.getComponentType()
            r1 = 4
            int r0 = r4 * 2
            if (r4 > r1) goto L_0x013a
            r0 = 8
        L_0x013a:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r0)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r31
            java.lang.System.arraycopy(r0, r3, r1, r3, r4)
            r31 = r1
        L_0x0147:
            r31[r4] = r30
            int r4 = r4 + 1
            goto L_0x001c
        L_0x014d:
            int r0 = android.graphics.Color.alpha(r15)
            float r1 = (float) r0
            float r1 = r1 * r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r2 = (int) r1
            r0 = 255(0xff, float:3.57E-43)
            if (r2 >= r3) goto L_0x02ee
            r2 = 0
        L_0x015c:
            if (r9 == 0) goto L_0x025f
            X.Vzo r0 = X.C18753Vzo.A01(r15)
            float r9 = r0.A03
            float r0 = r0.A02
            r28 = r0
            X.VtE r27 = X.C18515VtE.A0A
            double r0 = (double) r0
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 < 0) goto L_0x02a8
            int r0 = java.lang.Math.round(r7)
            double r0 = (double) r0
            r11 = 0
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x02a8
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x02a8
            r26 = 0
            int r0 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r0 >= 0) goto L_0x02a0
            r12 = 0
        L_0x0189:
            r25 = 0
            r10 = r28
            r24 = r25
            r23 = 0
            r22 = 1
        L_0x0193:
            float r0 = r23 - r28
            float r1 = java.lang.Math.abs(r0)
            r0 = 1053609165(0x3ecccccd, float:0.4)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0295
            r21 = 1148846080(0x447a0000, float:1000.0)
            r20 = r25
            r19 = 1148846080(0x447a0000, float:1000.0)
            r18 = 1120403456(0x42c80000, float:100.0)
            r17 = 0
        L_0x01aa:
            float r0 = r17 - r18
            float r1 = java.lang.Math.abs(r0)
            r0 = 1008981770(0x3c23d70a, float:0.01)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0251
            float r11 = r18 - r17
            r0 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r0
            float r11 = r11 + r17
            X.Vzo r1 = X.C18753Vzo.A00(r11, r10, r12)
            r0 = r27
            int r15 = r1.A02(r0)
            int r0 = android.graphics.Color.red(r15)
            float r9 = X.C18408VrA.A00(r0)
            int r0 = android.graphics.Color.green(r15)
            float r14 = X.C18408VrA.A00(r0)
            int r0 = android.graphics.Color.blue(r15)
            float r13 = X.C18408VrA.A00(r0)
            float[][] r0 = X.C18408VrA.A02
            r1 = r0[r5]
            r0 = r1[r3]
            float r9 = r9 * r0
            r0 = r1[r5]
            float r14 = r14 * r0
            float r9 = r9 + r14
            r0 = r1[r6]
            float r13 = r13 * r0
            float r9 = r9 + r13
            r0 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r0
            r0 = 1007753895(0x3c111aa7, float:0.008856452)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0287
            r0 = 1147261687(0x4461d2f7, float:903.2963)
            float r9 = r9 * r0
        L_0x01fd:
            float r0 = r7 - r9
            float r16 = java.lang.Math.abs(r0)
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            int r0 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0249
            X.Vzo r13 = X.C18753Vzo.A01(r15)
            float r1 = r13.A04
            float r0 = r13.A02
            X.Vzo r0 = X.C18753Vzo.A00(r1, r0, r12)
            float r15 = r13.A05
            float r1 = r0.A05
            float r15 = r15 - r1
            float r14 = r13.A00
            float r1 = r0.A00
            float r14 = r14 - r1
            float r1 = r13.A01
            float r0 = r0.A01
            float r1 = r1 - r0
            float r15 = r15 * r15
            float r14 = r14 * r14
            float r15 = r15 + r14
            float r1 = r1 * r1
            float r15 = r15 + r1
            double r0 = (double) r15
            double r14 = java.lang.Math.sqrt(r0)
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r14, r0)
            r14 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            double r0 = r0 * r14
            float r14 = (float) r0
            int r0 = (r14 > r29 ? 1 : (r14 == r29 ? 0 : -1))
            if (r0 > 0) goto L_0x0249
            r20 = r13
            r21 = r16
            r19 = r14
        L_0x0249:
            int r0 = (r21 > r26 ? 1 : (r21 == r26 ? 0 : -1))
            if (r0 != 0) goto L_0x027b
            int r0 = (r19 > r26 ? 1 : (r19 == r26 ? 0 : -1))
            if (r0 != 0) goto L_0x027b
        L_0x0251:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r22 == 0) goto L_0x026b
            if (r20 == 0) goto L_0x0268
            r1 = r20
            r0 = r27
            int r15 = r1.A02(r0)
        L_0x025f:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r15 = r15 & r0
            int r0 = r2 << 24
            r15 = r15 | r0
            goto L_0x0110
        L_0x0268:
            r22 = 0
            goto L_0x026f
        L_0x026b:
            if (r20 != 0) goto L_0x0276
            r28 = r10
        L_0x026f:
            float r10 = r28 - r23
            float r10 = r10 / r0
            float r10 = r10 + r23
            goto L_0x0193
        L_0x0276:
            r23 = r10
            r24 = r20
            goto L_0x026f
        L_0x027b:
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0283
            r17 = r11
            goto L_0x01aa
        L_0x0283:
            r18 = r11
            goto L_0x01aa
        L_0x0287:
            double r0 = (double) r9
            double r0 = java.lang.Math.cbrt(r0)
            float r9 = (float) r0
            r0 = 1122500608(0x42e80000, float:116.0)
            float r9 = r9 * r0
            r0 = 1098907648(0x41800000, float:16.0)
            float r9 = r9 - r0
            goto L_0x01fd
        L_0x0295:
            if (r24 == 0) goto L_0x02a8
            r1 = r24
            r0 = r27
            int r15 = r1.A02(r0)
            goto L_0x025f
        L_0x02a0:
            r0 = 1135869952(0x43b40000, float:360.0)
            float r12 = java.lang.Math.min(r0, r9)
            goto L_0x0189
        L_0x02a8:
            int r0 = (r7 > r29 ? 1 : (r7 == r29 ? 0 : -1))
            if (r0 >= 0) goto L_0x02af
            r15 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            goto L_0x025f
        L_0x02af:
            r0 = 1120272384(0x42c60000, float:99.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b7
            r15 = -1
            goto L_0x025f
        L_0x02b7:
            r13 = 1098907648(0x41800000, float:16.0)
            float r12 = r7 + r13
            r11 = 1122500608(0x42e80000, float:116.0)
            float r12 = r12 / r11
            r10 = 1147261687(0x4461d2f7, float:903.2963)
            r9 = 1007753895(0x3c111aa7, float:0.008856452)
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ec
            float r7 = r12 * r12
            float r7 = r7 * r12
        L_0x02cd:
            float r1 = r12 * r12
            float r1 = r1 * r12
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x02d8
            float r12 = r12 * r11
            float r12 = r12 - r13
            float r12 = r12 / r10
            r1 = r12
        L_0x02d8:
            float[] r9 = X.C18408VrA.A00
            r0 = r9[r3]
            float r0 = r0 * r1
            double r10 = (double) r0
            r0 = r9[r5]
            float r7 = r7 * r0
            double r12 = (double) r7
            r0 = r9[r6]
            float r1 = r1 * r0
            double r14 = (double) r1
            int r15 = X.2eL.A02(r10, r12, r14)
            goto L_0x025f
        L_0x02ec:
            float r7 = r7 / r10
            goto L_0x02cd
        L_0x02ee:
            if (r2 <= r0) goto L_0x015c
            r2 = 255(0xff, float:3.57E-43)
            goto L_0x015c
        L_0x02f4:
            r0 = 0
            android.content.res.TypedArray r9 = r12.obtainStyledAttributes(r11, r1, r0, r0)
            goto L_0x004e
        L_0x02fb:
            int[] r3 = new int[r4]
            int[][] r2 = new int[r4][]
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r3, r1, r4)
            r0 = r31
            java.lang.System.arraycopy(r0, r1, r2, r1, r4)
            android.content.res.ColorStateList r0 = new android.content.res.ColorStateList
            r0.<init>(r2, r3)
            return r0
        L_0x030e:
            java.lang.String r1 = r36.getPositionDescription()
            java.lang.String r0 = ": invalid color state list tag "
            java.lang.String r1 = X.002.A0g(r1, r0, r2)
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51g.A00(android.content.res.Resources$Theme, android.content.res.Resources, android.util.AttributeSet, org.xmlpull.v1.XmlPullParser):android.content.res.ColorStateList");
    }

    public static ColorStateList A01(Resources.Theme theme, Resources resources, XmlPullParser xmlPullParser) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return A00(theme, resources, asAttributeSet, xmlPullParser);
            }
        } while (next != 1);
        throw new XmlPullParserException(AnonymousClass000.A00(990));
    }
}
