package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.List;
import java.util.Map;

/* renamed from: X.QGk  reason: case insensitive filesystem */
public final class C7493QGk extends C11796Sgi {
    public C11388SRb A00;
    public C11388SRb A01;
    public C11388SRb A02;
    public C11388SRb A03;
    public C11388SRb A04;
    public C11388SRb A05;
    public C11388SRb A06;
    public C11388SRb A07;
    public C11388SRb A08;
    public C11388SRb A09;
    public final Matrix A0A = AnonymousClass7TE.A0U();
    public final Paint A0B = new Q6T(this);
    public final Paint A0C = new Q6U(this);
    public final RectF A0D = AnonymousClass7TE.A0Y();
    public final 01c A0E = new 01c();
    public final S7N A0F;
    public final Q6Y A0G;
    public final StringBuilder A0H = Pxe.A14(2);
    public final List A0I = AnonymousClass7TE.A1C();
    public final Map A0J = AnonymousClass7TE.A1E();
    public final QGO A0K;

    private List A00(C10654Rvo rvo, String str, float f, float f2, float f3, boolean z) {
        String str2;
        float measureText;
        int i = 0;
        float f4 = 0.0f;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        float f5 = 0.0f;
        int i4 = 0;
        float f6 = 0.0f;
        while (true) {
            str2 = str;
            if (i >= str2.length()) {
                break;
            }
            char charAt = str2.charAt(i);
            if (z) {
                C10654Rvo rvo2 = rvo;
                C10944S2b s2b = (C10944S2b) AnonymousClass01t.A00(this.A0F.A07, C41845B3m.A01(rvo2.A03, AnonymousClass7TF.A08(rvo2.A01, charAt * 31)));
                if (s2b != null) {
                    measureText = ((float) s2b.A00) * f2 * SSo.A00();
                } else {
                    i++;
                }
            } else {
                measureText = this.A0B.measureText(str2.substring(i, i + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                i4 = i;
                f5 = f7;
                z2 = false;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i2++;
                List list = this.A0I;
                for (int size = list.size(); size < i2; size++) {
                    list.add(new C10353Rqq());
                }
                C10353Rqq rqq = (C10353Rqq) list.get(i2 - 1);
                if (i4 == i3) {
                    String substring = str2.substring(i3, i);
                    String trim = substring.trim();
                    rqq.A01 = trim;
                    rqq.A00 = (f4 - f7) - (((float) (trim.length() - substring.length())) * f6);
                    i3 = i;
                    i4 = i;
                    f4 = f7;
                    f5 = f7;
                } else {
                    String substring2 = str2.substring(i3, i4 - 1);
                    String trim2 = substring2.trim();
                    rqq.A01 = trim2;
                    rqq.A00 = ((f4 - f5) - (((float) (substring2.length() - trim2.length())) * f6)) - f6;
                    f4 = f5;
                    i3 = i4;
                }
            }
            i++;
        }
        if (f4 > 0.0f) {
            i2++;
            List list2 = this.A0I;
            for (int size2 = list2.size(); size2 < i2; size2++) {
                list2.add(new C10353Rqq());
            }
            C10353Rqq rqq2 = (C10353Rqq) list2.get(i2 - 1);
            rqq2.A01 = str2.substring(i3);
            rqq2.A00 = f4;
        }
        return this.A0I.subList(0, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A03(android.graphics.Canvas r8, X.S3U r9, float r10, int r11) {
        /*
            r7 = this;
            android.graphics.PointF r2 = r9.A07
            android.graphics.PointF r3 = r9.A08
            float r6 = X.SSo.A00()
            r4 = 0
            if (r2 != 0) goto L_0x004f
            r1 = 0
        L_0x000c:
            float r5 = (float) r11
            float r0 = r9.A01
            float r5 = r5 * r0
            float r5 = r5 * r6
            float r5 = r5 + r1
            X.Q6Y r0 = r7.A0G
            boolean r0 = r0.A0Q
            if (r0 == 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
            if (r2 == 0) goto L_0x002c
            float r1 = r2.y
            float r0 = r3.y
            float r1 = r1 + r0
            float r0 = r9.A02
            float r1 = r1 + r0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x004c
            r3 = 0
        L_0x0029:
            return r3
        L_0x002a:
            if (r2 != 0) goto L_0x004c
        L_0x002c:
            r2 = 0
        L_0x002d:
            if (r3 == 0) goto L_0x0031
            float r4 = r3.x
        L_0x0031:
            java.lang.Integer r0 = r9.A09
            int r1 = r0.intValue()
            r3 = 1
            r0 = 0
            if (r1 == r0) goto L_0x0046
            if (r1 == r3) goto L_0x004a
            r0 = 2
            if (r1 != r0) goto L_0x0029
            r0 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r0
            float r2 = r2 + r4
            float r10 = r10 / r0
        L_0x0045:
            float r2 = r2 - r10
        L_0x0046:
            r8.translate(r2, r5)
            return r3
        L_0x004a:
            float r2 = r2 + r4
            goto L_0x0045
        L_0x004c:
            float r2 = r2.x
            goto L_0x002d
        L_0x004f:
            float r1 = r9.A01
            float r1 = r1 * r6
            float r0 = r2.y
            float r1 = r1 + r0
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7493QGk.A03(android.graphics.Canvas, X.S3U, float, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:139:0x038a, code lost:
        if (r3.containsKey(r1) != false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0392, code lost:
        if (r14 == null) goto L_0x040d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0394, code lost:
        if (r14 == null) goto L_0x0396;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33) {
        /*
            r30 = this;
            r9 = r30
            X.QGO r0 = r9.A0K
            java.lang.Object r7 = r0.A06()
            X.S3U r7 = (X.S3U) r7
            X.S7N r0 = r9.A0F
            r26 = r0
            java.util.Map r1 = r0.A0A
            java.lang.String r0 = r7.A0A
            java.lang.Object r6 = r1.get(r0)
            X.Rvo r6 = (X.C10654Rvo) r6
            if (r6 == 0) goto L_0x0410
            r8 = r31
            r8.save()
            r2 = r32
            r8.concat(r2)
            X.SRb r0 = r9.A01
            if (r0 != 0) goto L_0x01ec
            X.SRb r0 = r9.A00
            if (r0 != 0) goto L_0x01ec
            android.graphics.Paint r5 = r9.A0B
            int r0 = r7.A04
        L_0x0030:
            r5.setColor(r0)
            X.SRb r0 = r9.A03
            if (r0 != 0) goto L_0x01e0
            X.SRb r0 = r9.A02
            if (r0 != 0) goto L_0x01e0
            android.graphics.Paint r4 = r9.A0C
            int r0 = r7.A05
        L_0x003f:
            r4.setColor(r0)
            X.S7O r0 = r9.A0K
            X.SRb r0 = r0.A02
            r1 = 100
            if (r0 != 0) goto L_0x01d6
            r0 = 100
        L_0x004c:
            int r0 = r0 * 255
            int r0 = r0 / r1
            int r0 = r0 * r33
            int r0 = r0 / 255
            r5.setAlpha(r0)
            r4.setAlpha(r0)
            X.SRb r0 = r9.A05
            if (r0 != 0) goto L_0x01d0
            X.SRb r0 = r9.A04
            if (r0 != 0) goto L_0x01d0
            float r1 = r7.A03
            float r0 = X.SSo.A00()
            float r1 = r1 * r0
        L_0x0068:
            r4.setStrokeWidth(r1)
            X.Q6Y r10 = r9.A0G
            java.util.Map r0 = r10.A0P
            if (r0 != 0) goto L_0x01f8
            X.S7N r0 = r10.A0G
            X.01s r0 = r0.A07
            int r0 = r0.A00()
            if (r0 <= 0) goto L_0x01f8
            X.SRb r0 = r9.A06
            if (r0 == 0) goto L_0x01cc
            float r3 = X.C11388SRb.A01(r0)
        L_0x0083:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 / r0
            X.SSo.A01(r2)
            java.lang.String r1 = r7.A0B
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\u0003"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r24 = java.util.Arrays.asList(r0)
            int r23 = r24.size()
            int r0 = r7.A06
            float r2 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r0
            X.SRb r0 = r9.A08
            if (r0 != 0) goto L_0x00b9
            X.SRb r0 = r9.A07
            if (r0 == 0) goto L_0x00be
        L_0x00b9:
            float r0 = X.C11388SRb.A01(r0)
            float r2 = r2 + r0
        L_0x00be:
            r22 = 0
            r21 = -1
        L_0x00c2:
            r1 = r23
            r0 = r22
            if (r0 >= r1) goto L_0x0396
            r1 = r24
            java.lang.String r13 = X.DbU.A0t(r1, r0)
            android.graphics.PointF r0 = r7.A08
            if (r0 != 0) goto L_0x01c8
            r0 = 0
        L_0x00d3:
            r17 = 1
            r11 = r9
            r12 = r6
            r14 = r0
            r15 = r3
            r16 = r2
            java.util.List r20 = r11.A00(r12, r13, r14, r15, r16, r17)
            r19 = 0
        L_0x00e1:
            int r1 = r20.size()
            r0 = r19
            if (r0 >= r1) goto L_0x01c4
            r1 = r20
            java.lang.Object r11 = r1.get(r0)
            X.Rqq r11 = (X.C10353Rqq) r11
            int r21 = r21 + 1
            r8.save()
            float r1 = r11.A00
            r0 = r21
            boolean r0 = r9.A03(r8, r7, r1, r0)
            if (r0 == 0) goto L_0x01bd
            java.lang.String r0 = r11.A01
            r25 = r0
            r18 = 0
        L_0x0106:
            int r1 = r25.length()
            r0 = r18
            if (r0 >= r1) goto L_0x01bd
            r1 = r25
            char r0 = r1.charAt(r0)
            java.lang.String r11 = r6.A01
            java.lang.String r1 = r6.A03
            int r0 = r0 * 31
            int r0 = X.AnonymousClass7TF.A08(r11, r0)
            int r1 = X.C41845B3m.A01(r1, r0)
            r0 = r26
            X.01s r0 = r0.A07
            java.lang.Object r13 = X.AnonymousClass01t.A00(r0, r1)
            X.S2b r13 = (X.C10944S2b) r13
            if (r13 == 0) goto L_0x01b9
            java.util.Map r12 = r9.A0J
            boolean r0 = r12.containsKey(r13)
            if (r0 == 0) goto L_0x0181
            java.util.List r11 = X.C66580MXl.A13(r13, r12)
        L_0x013a:
            r17 = 0
            r12 = 0
        L_0x013d:
            int r0 = r11.size()
            if (r12 >= r0) goto L_0x01ab
            java.lang.Object r0 = r11.get(r12)
            X.Sgc r0 = (X.C11790Sgc) r0
            android.graphics.Path r1 = r0.Bar()
            android.graphics.RectF r14 = r9.A0D
            r0 = r17
            r1.computeBounds(r14, r0)
            android.graphics.Matrix r15 = r9.A0A
            r15.reset()
            r16 = 0
            float r0 = r7.A00
            float r14 = -r0
            float r0 = X.SSo.A00()
            float r14 = r14 * r0
            r0 = r16
            r15.preTranslate(r0, r14)
            r15.preScale(r3, r3)
            r1.transform(r15)
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x017c
            A01(r8, r5, r1)
            r0 = r4
        L_0x0176:
            A01(r8, r0, r1)
            int r12 = r12 + 1
            goto L_0x013d
        L_0x017c:
            A01(r8, r4, r1)
            r0 = r5
            goto L_0x0176
        L_0x0181:
            java.util.List r0 = r13.A01
            r17 = r0
            int r16 = r17.size()
            java.util.ArrayList r11 = X.DbS.A0v(r16)
            r1 = 0
        L_0x018e:
            r0 = r16
            if (r1 >= r0) goto L_0x01a7
            r0 = r17
            java.lang.Object r15 = r0.get(r1)
            X.Sgx r15 = (X.C11811Sgx) r15
            X.Sgc r0 = new X.Sgc
            r14 = r26
            r0.<init>(r14, r10, r15, r9)
            r11.add(r0)
            int r1 = r1 + 1
            goto L_0x018e
        L_0x01a7:
            r12.put(r13, r11)
            goto L_0x013a
        L_0x01ab:
            double r0 = r13.A00
            float r11 = (float) r0
            float r11 = r11 * r3
            float r0 = X.SSo.A00()
            float r11 = r11 * r0
            float r11 = r11 + r2
            r0 = 0
            r8.translate(r11, r0)
        L_0x01b9:
            int r18 = r18 + 1
            goto L_0x0106
        L_0x01bd:
            r8.restore()
            int r19 = r19 + 1
            goto L_0x00e1
        L_0x01c4:
            int r22 = r22 + 1
            goto L_0x00c2
        L_0x01c8:
            float r0 = r0.x
            goto L_0x00d3
        L_0x01cc:
            float r3 = r7.A02
            goto L_0x0083
        L_0x01d0:
            float r1 = X.C11388SRb.A01(r0)
            goto L_0x0068
        L_0x01d6:
            java.lang.Object r0 = r0.A06()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x004c
        L_0x01e0:
            android.graphics.Paint r4 = r9.A0C
            java.lang.Object r0 = r0.A06()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x003f
        L_0x01ec:
            android.graphics.Paint r5 = r9.A0B
            java.lang.Object r0 = r0.A06()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            goto L_0x0030
        L_0x01f8:
            X.SRb r0 = r9.A09
            if (r0 == 0) goto L_0x0369
            java.lang.Object r14 = r0.A06()
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            if (r14 == 0) goto L_0x0369
        L_0x0204:
            java.lang.String r1 = r7.A0B
            r5.setTypeface(r14)
            X.SRb r0 = r9.A06
            if (r0 == 0) goto L_0x0365
            float r2 = X.C11388SRb.A01(r0)
        L_0x0211:
            float r0 = X.SSo.A00()
            float r0 = r0 * r2
            r5.setTextSize(r0)
            android.graphics.Typeface r0 = r5.getTypeface()
            r4.setTypeface(r0)
            float r0 = r5.getTextSize()
            r4.setTextSize(r0)
            int r0 = r7.A06
            float r14 = (float) r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r14 = r14 / r0
            X.SRb r0 = r9.A08
            if (r0 != 0) goto L_0x0235
            X.SRb r0 = r9.A07
            if (r0 == 0) goto L_0x023a
        L_0x0235:
            float r0 = X.C11388SRb.A01(r0)
            float r14 = r14 + r0
        L_0x023a:
            float r0 = X.SSo.A00()
            float r14 = r14 * r0
            float r14 = r14 * r2
            r0 = 1120403456(0x42c80000, float:100.0)
            float r14 = r14 / r0
            java.lang.String r0 = "\r\n"
            java.lang.String r2 = "\r"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\u0003"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            java.lang.String r0 = "\n"
            java.lang.String r0 = r1.replaceAll(r0, r2)
            java.lang.String[] r0 = r0.split(r2)
            java.util.List r22 = java.util.Arrays.asList(r0)
            int r21 = r22.size()
            r13 = 0
            r20 = -1
        L_0x0266:
            r0 = r21
            if (r13 >= r0) goto L_0x0396
            r0 = r22
            java.lang.String r25 = X.DbU.A0t(r0, r13)
            android.graphics.PointF r0 = r7.A08
            if (r0 != 0) goto L_0x0361
            r0 = 0
        L_0x0275:
            r19 = 0
            r18 = 0
            r23 = r9
            r24 = r6
            r26 = r0
            r27 = r19
            r28 = r14
            r29 = r18
            java.util.List r17 = r23.A00(r24, r25, r26, r27, r28, r29)
            r15 = 0
        L_0x028a:
            int r0 = r17.size()
            if (r15 >= r0) goto L_0x035d
            r0 = r17
            java.lang.Object r2 = r0.get(r15)
            X.Rqq r2 = (X.C10353Rqq) r2
            int r20 = r20 + 1
            r8.save()
            float r1 = r2.A00
            r0 = r20
            boolean r0 = r9.A03(r8, r7, r1, r0)
            if (r0 == 0) goto L_0x0356
            java.lang.String r0 = r2.A01
            r24 = r0
            r12 = 0
        L_0x02ac:
            int r10 = r24.length()
            if (r12 >= r10) goto L_0x0356
            r16 = r12
            r0 = r24
            int r1 = r0.codePointAt(r12)
            int r11 = java.lang.Character.charCount(r1)
            int r11 = r11 + r12
        L_0x02bf:
            if (r11 >= r10) goto L_0x02ff
            r0 = r24
            int r3 = r0.codePointAt(r11)
            int r2 = java.lang.Character.getType(r3)
            r0 = 16
            if (r2 == r0) goto L_0x02f6
            int r2 = java.lang.Character.getType(r3)
            r0 = 27
            if (r2 == r0) goto L_0x02f6
            int r2 = java.lang.Character.getType(r3)
            r0 = 6
            if (r2 == r0) goto L_0x02f6
            int r2 = java.lang.Character.getType(r3)
            r0 = 28
            if (r2 == r0) goto L_0x02f6
            int r2 = java.lang.Character.getType(r3)
            r0 = 8
            if (r2 == r0) goto L_0x02f6
            int r2 = java.lang.Character.getType(r3)
            r0 = 19
            if (r2 != r0) goto L_0x02ff
        L_0x02f6:
            int r0 = java.lang.Character.charCount(r3)
            int r11 = r11 + r0
            int r1 = r1 * 31
            int r1 = r1 + r3
            goto L_0x02bf
        L_0x02ff:
            X.01c r10 = r9.A0E
            long r2 = (long) r1
            int r0 = r10.A01(r2)
            if (r0 < 0) goto L_0x032e
            java.lang.Object r1 = r10.A05(r2)
            java.lang.String r1 = (java.lang.String) r1
        L_0x030e:
            int r0 = r1.length()
            int r12 = r12 + r0
            boolean r0 = r7.A0C
            if (r0 == 0) goto L_0x0329
            A02(r8, r5, r1)
            r0 = r4
        L_0x031b:
            A02(r8, r0, r1)
            float r1 = r5.measureText(r1)
            float r1 = r1 + r14
            r0 = r19
            r8.translate(r1, r0)
            goto L_0x02ac
        L_0x0329:
            A02(r8, r4, r1)
            r0 = r5
            goto L_0x031b
        L_0x032e:
            java.lang.StringBuilder r0 = r9.A0H
            r23 = r0
            r1 = r0
            r0 = r18
            r1.setLength(r0)
        L_0x0338:
            r0 = r16
            if (r0 >= r11) goto L_0x034e
            r1 = r24
            int r0 = r1.codePointAt(r0)
            r1 = r23
            r1.appendCodePoint(r0)
            int r0 = java.lang.Character.charCount(r0)
            int r16 = r16 + r0
            goto L_0x0338
        L_0x034e:
            java.lang.String r1 = r23.toString()
            r10.A09(r2, r1)
            goto L_0x030e
        L_0x0356:
            r8.restore()
            int r15 = r15 + 1
            goto L_0x028a
        L_0x035d:
            int r13 = r13 + 1
            goto L_0x0266
        L_0x0361:
            float r0 = r0.x
            goto L_0x0275
        L_0x0365:
            float r2 = r7.A02
            goto L_0x0211
        L_0x0369:
            java.util.Map r3 = r10.A0P
            if (r3 == 0) goto L_0x039a
            java.lang.String r1 = r6.A01
            r2 = r1
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x038c
            java.lang.String r1 = r6.A02
            boolean r0 = r3.containsKey(r1)
            if (r0 != 0) goto L_0x038c
            java.lang.String r1 = "-"
            java.lang.String r0 = r6.A03
            java.lang.String r1 = X.002.A0g(r2, r1, r0)
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x039a
        L_0x038c:
            java.lang.Object r14 = r3.get(r1)
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
        L_0x0392:
            if (r14 == 0) goto L_0x040d
        L_0x0394:
            if (r14 != 0) goto L_0x0204
        L_0x0396:
            r8.restore()
            return
        L_0x039a:
            android.graphics.drawable.Drawable$Callback r0 = r10.getCallback()
            if (r0 == 0) goto L_0x040d
            X.Rxk r13 = r10.A0J
            if (r13 != 0) goto L_0x03b5
            android.graphics.drawable.Drawable$Callback r0 = r10.getCallback()
            X.Rxk r13 = new X.Rxk
            r13.<init>(r0)
            r10.A0J = r13
            java.lang.String r0 = r10.A0N
            if (r0 == 0) goto L_0x03b5
            r13.A01 = r0
        L_0x03b5:
            X.S5R r11 = r13.A03
            java.lang.String r12 = r6.A01
            java.lang.String r10 = r6.A03
            r11.A00 = r12
            r11.A01 = r10
            java.util.Map r3 = r13.A05
            java.lang.Object r14 = r3.get(r11)
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            if (r14 != 0) goto L_0x0392
            java.util.Map r2 = r13.A04
            java.lang.Object r14 = r2.get(r12)
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            if (r14 != 0) goto L_0x03e8
            android.graphics.Typeface r14 = r6.A00
            if (r14 != 0) goto L_0x03e8
            java.lang.String r1 = "fonts/"
            java.lang.String r0 = r13.A01
            java.lang.String r1 = X.002.A0g(r1, r12, r0)
            android.content.res.AssetManager r0 = r13.A02
            android.graphics.Typeface r14 = android.graphics.Typeface.createFromAsset(r0, r1)
            r2.put(r12, r14)
        L_0x03e8:
            java.lang.String r0 = "Italic"
            boolean r1 = r10.contains(r0)
            java.lang.String r0 = "Bold"
            boolean r0 = r10.contains(r0)
            if (r1 == 0) goto L_0x0408
            r1 = 2
            if (r0 == 0) goto L_0x03fa
            r1 = 3
        L_0x03fa:
            int r0 = r14.getStyle()
            if (r0 == r1) goto L_0x0404
            android.graphics.Typeface r14 = android.graphics.Typeface.create(r14, r1)
        L_0x0404:
            r3.put(r11, r14)
            goto L_0x0392
        L_0x0408:
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            goto L_0x03fa
        L_0x040d:
            android.graphics.Typeface r14 = r6.A00
            goto L_0x0394
        L_0x0410:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7493QGk.A0B(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [X.SRb, X.QGO] */
    public C7493QGk(Q6Y q6y, S56 s56) {
        super(q6y, s56);
        this.A0G = q6y;
        this.A0F = s56.A09;
        ? sRb = new C11388SRb(s56.A0B.A00);
        this.A0K = sRb;
        sRb.A09(this);
        A0C(sRb);
        C10655Rvp rvp = s56.A0C;
        if (rvp != null) {
            QGX qgx = rvp.A00;
            if (qgx != null) {
                C11388SRb sRb2 = new C11388SRb(qgx.A00);
                this.A00 = sRb2;
                sRb2.A09(this);
                A0C(this.A00);
            }
            QGX qgx2 = rvp.A01;
            if (qgx2 != null) {
                C11388SRb sRb3 = new C11388SRb(qgx2.A00);
                this.A02 = sRb3;
                sRb3.A09(this);
                A0C(this.A02);
            }
            QGY qgy = rvp.A02;
            if (qgy != null) {
                QGR A002 = C11802Sgo.A00(qgy);
                this.A04 = A002;
                A002.A09(this);
                A0C(this.A04);
            }
            QGY qgy2 = rvp.A03;
            if (qgy2 != null) {
                QGR A003 = C11802Sgo.A00(qgy2);
                this.A07 = A003;
                A003.A09(this);
                A0C(this.A07);
            }
        }
    }

    public static void A01(Canvas canvas, Paint paint, Path path) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawPath(path, paint);
        }
    }

    public static void A02(Canvas canvas, Paint paint, String str) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.RyA] */
    /* JADX WARNING: type inference failed for: r1v0, types: [X.S3U, java.lang.Object] */
    public final void AAd(SIR sir, Object obj) {
        C11388SRb sRb;
        super.AAd(sir, obj);
        if (obj == C13881Tj4.A0a) {
            C11388SRb sRb2 = this.A01;
            if (sRb2 != null) {
                this.A0M.remove(sRb2);
            }
            if (sir == null) {
                this.A01 = null;
                return;
            }
            QGN qgn = new QGN(sir, (Object) null);
            this.A01 = qgn;
            qgn.A09(this);
            sRb = this.A01;
        } else if (obj == C13881Tj4.A0d) {
            C11388SRb sRb3 = this.A03;
            if (sRb3 != null) {
                this.A0M.remove(sRb3);
            }
            if (sir == null) {
                this.A03 = null;
                return;
            }
            QGN qgn2 = new QGN(sir, (Object) null);
            this.A03 = qgn2;
            qgn2.A09(this);
            sRb = this.A03;
        } else if (obj == C13881Tj4.A0P) {
            C11388SRb sRb4 = this.A05;
            if (sRb4 != null) {
                this.A0M.remove(sRb4);
            }
            if (sir == null) {
                this.A05 = null;
                return;
            }
            QGN qgn3 = new QGN(sir, (Object) null);
            this.A05 = qgn3;
            qgn3.A09(this);
            sRb = this.A05;
        } else if (obj == C13881Tj4.A0R) {
            C11388SRb sRb5 = this.A08;
            if (sRb5 != null) {
                this.A0M.remove(sRb5);
            }
            if (sir == null) {
                this.A08 = null;
                return;
            }
            QGN qgn4 = new QGN(sir, (Object) null);
            this.A08 = qgn4;
            qgn4.A09(this);
            sRb = this.A08;
        } else if (obj == C13881Tj4.A0Q) {
            C11388SRb sRb6 = this.A06;
            if (sRb6 != null) {
                this.A0M.remove(sRb6);
            }
            if (sir == null) {
                this.A06 = null;
                return;
            }
            QGN qgn5 = new QGN(sir, (Object) null);
            this.A06 = qgn5;
            qgn5.A09(this);
            sRb = this.A06;
        } else if (obj == C13881Tj4.A08) {
            C11388SRb sRb7 = this.A09;
            if (sRb7 != null) {
                this.A0M.remove(sRb7);
            }
            if (sir == null) {
                this.A09 = null;
                return;
            }
            QGN qgn6 = new QGN(sir, (Object) null);
            this.A09 = qgn6;
            qgn6.A09(this);
            sRb = this.A09;
        } else if (obj == "dynamic_text") {
            QGO qgo = this.A0K;
            qgo.A0A(new C7497QGo(qgo, new Object(), new Object(), sir));
            return;
        } else {
            return;
        }
        A0C(sRb);
    }

    public final void Aha(Matrix matrix, RectF rectF, boolean z) {
        super.Aha(matrix, rectF, z);
        S7N s7n = this.A0F;
        rectF.set(0.0f, 0.0f, (float) s7n.A05.width(), (float) s7n.A05.height());
    }
}
