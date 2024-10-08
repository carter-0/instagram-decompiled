package X;

import android.content.Context;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.VwO  reason: case insensitive filesystem */
public abstract class C18666VwO {
    /* JADX WARNING: type inference failed for: r2v14, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r23v4, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: type inference failed for: r21v4, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.VUH A01(android.content.res.Resources.Theme r25, android.content.res.TypedArray r26, java.lang.String r27, org.xmlpull.v1.XmlPullParser r28, int r29) {
        /*
            r8 = 0
            r1 = r27
            r0 = r28
            boolean r0 = A02(r1, r0)
            if (r0 == 0) goto L_0x026e
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r4 = r26
            r3 = r29
            r4.getValue(r3, r2)
            int r1 = r2.type
            r0 = 28
            if (r1 < r0) goto L_0x002a
            r0 = 31
            if (r1 > r0) goto L_0x002a
            int r1 = r2.data
            r0 = 0
            X.VUH r3 = new X.VUH
            r3.<init>(r0, r0, r1)
            return r3
        L_0x002a:
            android.content.res.Resources r9 = r4.getResources()
            int r0 = r4.getResourceId(r3, r8)
            android.content.res.XmlResourceParser r7 = r9.getXml(r0)     // Catch:{ Exception -> 0x0266 }
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r7)     // Catch:{ Exception -> 0x0266 }
        L_0x003a:
            int r1 = r7.next()     // Catch:{ Exception -> 0x0266 }
            r5 = 2
            if (r1 == r5) goto L_0x0046
            r0 = 1
            if (r1 != r0) goto L_0x003a
            goto L_0x025a
        L_0x0046:
            java.lang.String r2 = r7.getName()     // Catch:{ Exception -> 0x0266 }
            java.lang.String r1 = "gradient"
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x0266 }
            r10 = r25
            if (r0 != 0) goto L_0x007c
            java.lang.String r0 = "selector"
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x0266 }
            if (r0 == 0) goto L_0x006b
            android.content.res.ColorStateList r2 = X.AnonymousClass51g.A00(r10, r9, r6, r7)     // Catch:{ Exception -> 0x0266 }
            int r1 = r2.getDefaultColor()     // Catch:{ Exception -> 0x0266 }
            r0 = 0
            X.VUH r3 = new X.VUH     // Catch:{ Exception -> 0x0266 }
            r3.<init>(r2, r0, r1)     // Catch:{ Exception -> 0x0266 }
            return r3
        L_0x006b:
            java.lang.String r1 = r7.getPositionDescription()     // Catch:{ Exception -> 0x0266 }
            java.lang.String r0 = ": unsupported complex color tag "
            java.lang.String r0 = X.002.A0g(r1, r0, r2)     // Catch:{ Exception -> 0x0266 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0266 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0266 }
            goto L_0x0265
        L_0x007c:
            java.lang.String r2 = r7.getName()     // Catch:{ Exception -> 0x0266 }
            boolean r0 = r2.equals(r1)     // Catch:{ Exception -> 0x0266 }
            if (r0 == 0) goto L_0x024a
            int[] r0 = X.AnonymousClass026.A03     // Catch:{ Exception -> 0x0266 }
            if (r25 != 0) goto L_0x009a
            android.content.res.TypedArray r0 = r9.obtainAttributes(r6, r0)     // Catch:{ Exception -> 0x0266 }
        L_0x008e:
            java.lang.String r1 = "startX"
            r2 = 8
            r4 = 0
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x00a2
            goto L_0x009f
        L_0x009a:
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r6, r0, r8, r8)     // Catch:{ Exception -> 0x0266 }
            goto L_0x008e
        L_0x009f:
            r22 = 0
            goto L_0x00a6
        L_0x00a2:
            float r22 = r0.getFloat(r2, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x00a6:
            java.lang.String r1 = "startY"
            r2 = 9
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x00b3
            r23 = 0
            goto L_0x00b7
        L_0x00b3:
            float r23 = r0.getFloat(r2, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x00b7:
            java.lang.String r1 = "endX"
            r2 = 10
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x00c4
            r24 = 0
            goto L_0x00c8
        L_0x00c4:
            float r24 = r0.getFloat(r2, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x00c8:
            java.lang.String r1 = "endY"
            r2 = 11
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x00d5
            r25 = 0
            goto L_0x00d9
        L_0x00d5:
            float r25 = r0.getFloat(r2, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x00d9:
            java.lang.String r1 = "centerX"
            r2 = 3
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x00e5
            r21 = 0
            goto L_0x00e9
        L_0x00e5:
            float r21 = r0.getFloat(r2, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x00e9:
            java.lang.String r1 = "centerY"
            r2 = 4
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x00f5
            r20 = 0
            goto L_0x00f9
        L_0x00f5:
            float r20 = r0.getFloat(r2, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x00f9:
            java.lang.String r1 = "type"
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x0104
            r19 = 0
            goto L_0x0108
        L_0x0104:
            int r19 = r0.getInt(r5, r8)     // Catch:{ Exception -> 0x0266 }
        L_0x0108:
            java.lang.String r1 = "startColor"
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x0112
            r15 = 0
            goto L_0x0116
        L_0x0112:
            int r15 = r0.getColor(r8, r8)     // Catch:{ Exception -> 0x0266 }
        L_0x0116:
            java.lang.String r1 = "centerColor"
            boolean r18 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            r2 = 7
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x0126
            r17 = 0
            goto L_0x012a
        L_0x0126:
            int r17 = r0.getColor(r2, r8)     // Catch:{ Exception -> 0x0266 }
        L_0x012a:
            java.lang.String r1 = "endColor"
            r3 = 1
            boolean r1 = A02(r1, r7)     // Catch:{ Exception -> 0x0266 }
            if (r1 != 0) goto L_0x0135
            r14 = 0
            goto L_0x0139
        L_0x0135:
            int r14 = r0.getColor(r3, r8)     // Catch:{ Exception -> 0x0266 }
        L_0x0139:
            java.lang.String r2 = "tileMode"
            r1 = 6
            boolean r2 = A02(r2, r7)     // Catch:{ Exception -> 0x0266 }
            if (r2 != 0) goto L_0x0144
            r2 = 0
            goto L_0x0148
        L_0x0144:
            int r2 = r0.getInt(r1, r8)     // Catch:{ Exception -> 0x0266 }
        L_0x0148:
            java.lang.String r11 = "gradientRadius"
            r1 = 5
            boolean r11 = A02(r11, r7)     // Catch:{ Exception -> 0x0266 }
            if (r11 != 0) goto L_0x0154
            r26 = 0
            goto L_0x0158
        L_0x0154:
            float r26 = r0.getFloat(r1, r4)     // Catch:{ Exception -> 0x0266 }
        L_0x0158:
            r0.recycle()     // Catch:{ Exception -> 0x0266 }
            int r0 = r7.getDepth()     // Catch:{ Exception -> 0x0266 }
            int r16 = r0 + 1
            r0 = 20
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ Exception -> 0x0266 }
            r13.<init>(r0)     // Catch:{ Exception -> 0x0266 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ Exception -> 0x0266 }
            r12.<init>(r0)     // Catch:{ Exception -> 0x0266 }
        L_0x016d:
            int r11 = r7.next()     // Catch:{ Exception -> 0x0266 }
            if (r11 == r3) goto L_0x01cd
            int r1 = r7.getDepth()     // Catch:{ Exception -> 0x0266 }
            r0 = r16
            if (r1 >= r0) goto L_0x017e
            r0 = 3
            if (r11 == r0) goto L_0x01cd
        L_0x017e:
            if (r11 != r5) goto L_0x016d
            r0 = r16
            if (r1 > r0) goto L_0x016d
            java.lang.String r1 = r7.getName()     // Catch:{ Exception -> 0x0266 }
            java.lang.String r0 = "item"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0266 }
            if (r0 == 0) goto L_0x016d
            int[] r0 = X.AnonymousClass026.A04     // Catch:{ Exception -> 0x0266 }
            if (r10 != 0) goto L_0x01a3
            android.content.res.TypedArray r0 = r9.obtainAttributes(r6, r0)     // Catch:{ Exception -> 0x0266 }
        L_0x0198:
            boolean r11 = r0.hasValue(r8)     // Catch:{ Exception -> 0x0266 }
            boolean r1 = r0.hasValue(r3)     // Catch:{ Exception -> 0x0266 }
            if (r11 == 0) goto L_0x01bc
            goto L_0x01a8
        L_0x01a3:
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r6, r0, r8, r8)     // Catch:{ Exception -> 0x0266 }
            goto L_0x0198
        L_0x01a8:
            if (r1 == 0) goto L_0x01bc
            int r11 = r0.getColor(r8, r8)     // Catch:{ Exception -> 0x0266 }
            float r1 = r0.getFloat(r3, r4)     // Catch:{ Exception -> 0x0266 }
            r0.recycle()     // Catch:{ Exception -> 0x0266 }
            X.AnonymousClass7TF.A1M(r12, r11)     // Catch:{ Exception -> 0x0266 }
            X.JTP.A1V(r13, r1)     // Catch:{ Exception -> 0x0266 }
            goto L_0x016d
        L_0x01bc:
            java.lang.String r1 = r7.getPositionDescription()     // Catch:{ Exception -> 0x0266 }
            java.lang.String r0 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            java.lang.String r0 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0266 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0266 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0266 }
            goto L_0x0265
        L_0x01cd:
            int r0 = r12.size()     // Catch:{ Exception -> 0x0266 }
            if (r0 <= 0) goto L_0x01d9
            X.Vz2 r1 = new X.Vz2     // Catch:{ Exception -> 0x0266 }
            r1.<init>((java.util.List) r12, (java.util.List) r13)     // Catch:{ Exception -> 0x0266 }
            goto L_0x01e8
        L_0x01d9:
            if (r18 == 0) goto L_0x01e3
            X.Vz2 r1 = new X.Vz2     // Catch:{ Exception -> 0x0266 }
            r0 = r17
            r1.<init>(r15, r0, r14)     // Catch:{ Exception -> 0x0266 }
            goto L_0x01e8
        L_0x01e3:
            X.Vz2 r1 = new X.Vz2     // Catch:{ Exception -> 0x0266 }
            r1.<init>((int) r15, (int) r14)     // Catch:{ Exception -> 0x0266 }
        L_0x01e8:
            r0 = r19
            if (r0 == r3) goto L_0x020a
            if (r0 == r5) goto L_0x01fc
            int[] r4 = r1.A01     // Catch:{ Exception -> 0x0266 }
            float[] r0 = r1.A00     // Catch:{ Exception -> 0x0266 }
            if (r2 == r3) goto L_0x01f9
            if (r2 == r5) goto L_0x022e
            android.graphics.Shader$TileMode r28 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x0266 }
            goto L_0x0230
        L_0x01f9:
            android.graphics.Shader$TileMode r28 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x0266 }
            goto L_0x0230
        L_0x01fc:
            int[] r4 = r1.A01     // Catch:{ Exception -> 0x0266 }
            float[] r3 = r1.A00     // Catch:{ Exception -> 0x0266 }
            android.graphics.SweepGradient r2 = new android.graphics.SweepGradient     // Catch:{ Exception -> 0x0266 }
            r1 = r21
            r0 = r20
            r2.<init>(r1, r0, r4, r3)     // Catch:{ Exception -> 0x0266 }
            goto L_0x023b
        L_0x020a:
            int r0 = (r26 > r4 ? 1 : (r26 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0242
            int[] r4 = r1.A01     // Catch:{ Exception -> 0x0266 }
            float[] r0 = r1.A00     // Catch:{ Exception -> 0x0266 }
            if (r2 == r3) goto L_0x0219
            if (r2 == r5) goto L_0x021c
            android.graphics.Shader$TileMode r29 = android.graphics.Shader.TileMode.CLAMP     // Catch:{ Exception -> 0x0266 }
            goto L_0x021e
        L_0x0219:
            android.graphics.Shader$TileMode r29 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ Exception -> 0x0266 }
            goto L_0x021e
        L_0x021c:
            android.graphics.Shader$TileMode r29 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x0266 }
        L_0x021e:
            android.graphics.RadialGradient r2 = new android.graphics.RadialGradient     // Catch:{ Exception -> 0x0266 }
            r23 = r2
            r24 = r21
            r25 = r20
            r27 = r4
            r28 = r0
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x0266 }
            goto L_0x023b
        L_0x022e:
            android.graphics.Shader$TileMode r28 = android.graphics.Shader.TileMode.MIRROR     // Catch:{ Exception -> 0x0266 }
        L_0x0230:
            android.graphics.LinearGradient r2 = new android.graphics.LinearGradient     // Catch:{ Exception -> 0x0266 }
            r21 = r2
            r26 = r4
            r27 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x0266 }
        L_0x023b:
            r0 = 0
            X.VUH r3 = new X.VUH     // Catch:{ Exception -> 0x0266 }
            r3.<init>(r0, r2, r8)     // Catch:{ Exception -> 0x0266 }
            return r3
        L_0x0242:
            java.lang.String r0 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0266 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0266 }
            goto L_0x0265
        L_0x024a:
            java.lang.String r1 = r7.getPositionDescription()     // Catch:{ Exception -> 0x0266 }
            java.lang.String r0 = ": invalid gradient color tag "
            java.lang.String r0 = X.002.A0g(r1, r0, r2)     // Catch:{ Exception -> 0x0266 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0266 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0266 }
            goto L_0x0265
        L_0x025a:
            r0 = 990(0x3de, float:1.387E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ Exception -> 0x0266 }
            org.xmlpull.v1.XmlPullParserException r1 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0266 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0266 }
        L_0x0265:
            throw r1     // Catch:{ Exception -> 0x0266 }
        L_0x0266:
            r2 = move-exception
            java.lang.String r1 = "ComplexColorCompat"
            java.lang.String r0 = "Failed to inflate ComplexColor."
            android.util.Log.e(r1, r0, r2)
        L_0x026e:
            r0 = 0
            X.VUH r3 = new X.VUH
            r3.<init>(r0, r0, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18666VwO.A01(android.content.res.Resources$Theme, android.content.res.TypedArray, java.lang.String, org.xmlpull.v1.XmlPullParser, int):X.VUH");
    }

    public static int A00(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId != 0) {
            return i;
        }
        return i2;
    }

    public static boolean A02(String str, XmlPullParser xmlPullParser) {
        return AnonymousClass7TF.A1V(xmlPullParser.getAttributeValue(Pxd.A00(220), str));
    }
}
