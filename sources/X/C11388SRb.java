package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.SRb  reason: case insensitive filesystem */
public abstract class C11388SRb {
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = 0.0f;
    public SIR A03;
    public boolean A04 = false;
    public Object A05 = null;
    public final C13826Thx A06;
    public final List A07 = DbS.A0v(1);

    public void A07() {
        int i = 0;
        while (true) {
            List list = this.A07;
            if (i < list.size()) {
                ((C13518Tbn) list.get(i)).Dwx();
                i++;
            } else {
                return;
            }
        }
    }

    public static int A02(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) >= 0 || i2 * i3 == i) {
            return i3;
        }
        return i3 - 1;
    }

    public final float A04() {
        ST4 Au7 = this.A06.Au7();
        if (Au7 == null || Au7.A03()) {
            return 0.0f;
        }
        return Au7.A0B.getInterpolation(A05());
    }

    public final float A05() {
        if (this.A04) {
            return 0.0f;
        }
        ST4 Au7 = this.A06.Au7();
        if (!Au7.A03()) {
            return (this.A02 - Au7.A02()) / (Au7.A01() - Au7.A02());
        }
        return 0.0f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.SHA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v53, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v54, resolved type: java.lang.Float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v55, resolved type: X.S5S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v56, resolved type: X.S5S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v57, resolved type: X.S5S} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v58, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v59, resolved type: android.graphics.PointF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v60, resolved type: android.graphics.PointF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v62, resolved type: android.graphics.PointF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v63, resolved type: X.S0z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v67, resolved type: android.graphics.Path} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v69, resolved type: android.graphics.PointF} */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x04f9, code lost:
        if (r5 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x054b, code lost:
        if (r5 != null) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0597, code lost:
        if (r5 == null) goto L_0x0599;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0111, code lost:
        if (r3.A01 != false) goto L_0x0113;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06() {
        /*
            r31 = this;
            r9 = r31
            boolean r0 = r9 instanceof X.QGN
            if (r0 == 0) goto L_0x0019
            r0 = r9
            X.QGN r0 = (X.QGN) r0
            X.SIR r1 = r0.A03
            java.lang.Object r2 = r0.A00
            float r6 = r0.A02
            r4 = 0
            r3 = r2
            r5 = r4
            r7 = r6
            r8 = r6
            java.lang.Object r0 = r1.A01(r2, r3, r4, r5, r6, r7, r8)
            return r0
        L_0x0019:
            boolean r0 = r9 instanceof X.QGM
            if (r0 == 0) goto L_0x009e
            r2 = r9
            X.QGM r2 = (X.QGM) r2
            r10 = 0
            X.SIR r0 = r2.A00
            r4 = 0
            if (r0 == 0) goto L_0x009c
            X.SRb r3 = r2.A04
            X.Thx r0 = r3.A06
            X.ST4 r1 = r0.Au7()
            if (r1 == 0) goto L_0x009c
            float r12 = r3.A04()
            java.lang.Float r0 = r1.A07
            X.SIR r5 = r2.A00
            float r8 = r1.A0A
            if (r0 != 0) goto L_0x0097
            r9 = r8
        L_0x003d:
            java.lang.Object r6 = r1.A0E
            java.lang.Object r7 = r1.A08
            r11 = r10
            java.lang.Object r5 = r5.A01(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Number r5 = (java.lang.Number) r5
        L_0x0048:
            X.SIR r0 = r2.A01
            if (r0 == 0) goto L_0x0071
            X.SRb r3 = r2.A05
            X.Thx r0 = r3.A06
            X.ST4 r1 = r0.Au7()
            if (r1 == 0) goto L_0x0071
            float r18 = r3.A04()
            java.lang.Float r0 = r1.A07
            X.SIR r11 = r2.A01
            float r14 = r1.A0A
            if (r0 != 0) goto L_0x0092
            r15 = r14
        L_0x0063:
            java.lang.Object r12 = r1.A0E
            java.lang.Object r13 = r1.A08
            r16 = r10
            r17 = r10
            java.lang.Object r4 = r11.A01(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Number r4 = (java.lang.Number) r4
        L_0x0071:
            android.graphics.PointF r3 = r2.A03
            if (r5 != 0) goto L_0x008d
            android.graphics.PointF r0 = r2.A02
            float r0 = r0.x
        L_0x0079:
            r3.set(r0, r10)
            float r1 = r3.x
            if (r4 != 0) goto L_0x0088
            android.graphics.PointF r0 = r2.A02
            float r0 = r0.y
        L_0x0084:
            r3.set(r1, r0)
            return r3
        L_0x0088:
            float r0 = r4.floatValue()
            goto L_0x0084
        L_0x008d:
            float r0 = r5.floatValue()
            goto L_0x0079
        L_0x0092:
            float r15 = r0.floatValue()
            goto L_0x0063
        L_0x0097:
            float r9 = r0.floatValue()
            goto L_0x003d
        L_0x009c:
            r5 = r4
            goto L_0x0048
        L_0x009e:
            float r5 = r9.A05()
            X.SIR r0 = r9.A03
            if (r0 != 0) goto L_0x00b1
            X.Thx r0 = r9.A06
            boolean r0 = r0.CPv(r5)
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r5 = r9.A05
            return r5
        L_0x00b1:
            X.Thx r0 = r9.A06
            X.ST4 r4 = r0.Au7()
            android.view.animation.Interpolator r1 = r4.A0C
            if (r1 == 0) goto L_0x00d5
            android.view.animation.Interpolator r0 = r4.A0D
            if (r0 == 0) goto L_0x00d5
            float r3 = r1.getInterpolation(r5)
            float r2 = r0.getInterpolation(r5)
            r1 = r9
            boolean r0 = r9 instanceof X.QGV
            if (r0 == 0) goto L_0x0657
            X.QGV r1 = (X.QGV) r1
            android.graphics.PointF r5 = r1.A0B(r4, r5, r3, r2)
        L_0x00d2:
            r9.A05 = r5
            return r5
        L_0x00d5:
            float r1 = r9.A04()
            r0 = r9
            boolean r2 = r9 instanceof X.QGL
            if (r2 == 0) goto L_0x04a0
            X.QGL r0 = (X.QGL) r0
            java.lang.Object r2 = r4.A0E
            r23 = r2
            r2 = r23
            X.SHA r2 = (X.SHA) r2
            r23 = r2
            java.lang.Object r2 = r4.A08
            r21 = r2
            r2 = r21
            X.SHA r2 = (X.SHA) r2
            r21 = r2
            X.SHA r8 = r0.A04
            r3 = r2
            if (r2 != 0) goto L_0x00fb
            r3 = r23
        L_0x00fb:
            android.graphics.PointF r2 = r8.A00
            if (r2 != 0) goto L_0x0106
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            r8.A00 = r2
        L_0x0106:
            r2 = r23
            boolean r2 = r2.A01
            r22 = 1
            if (r2 != 0) goto L_0x0113
            boolean r5 = r3.A01
            r2 = 0
            if (r5 == 0) goto L_0x0114
        L_0x0113:
            r2 = 1
        L_0x0114:
            r8.A01 = r2
            r2 = r23
            java.util.List r2 = r2.A02
            r17 = r2
            int r5 = r17.size()
            java.util.List r2 = r3.A02
            r16 = r2
            int r2 = r16.size()
            if (r5 == r2) goto L_0x013d
            java.lang.String r7 = "Curves must have the same number of control points. Shape 1: "
            int r6 = r17.size()
            java.lang.String r5 = "\tShape 2: "
            int r2 = r16.size()
            java.lang.String r2 = X.002.A02(r6, r2, r7, r5)
            X.S85.A00(r2)
        L_0x013d:
            int r5 = r17.size()
            int r2 = r16.size()
            int r7 = java.lang.Math.min(r5, r2)
            java.util.List r5 = r8.A02
            int r2 = r5.size()
            int r6 = r5.size()
            if (r2 < r7) goto L_0x016b
            if (r6 <= r7) goto L_0x0178
            r2 = r22
            int r6 = X.DbT.A02(r5, r2)
        L_0x015d:
            if (r6 < r7) goto L_0x0178
            r2 = r22
            int r2 = X.DbT.A02(r5, r2)
            r5.remove(r2)
            int r6 = r6 + -1
            goto L_0x015d
        L_0x016b:
            if (r6 >= r7) goto L_0x0178
            X.SH9 r2 = new X.SH9
            r2.<init>()
            r5.add(r2)
            int r6 = r6 + 1
            goto L_0x016b
        L_0x0178:
            r2 = r23
            android.graphics.PointF r10 = r2.A00
            android.graphics.PointF r7 = r3.A00
            float r3 = r10.x
            float r2 = r7.x
            float r6 = X.Pxh.A00(r2, r3, r1)
            float r3 = r10.y
            float r2 = r7.y
            float r2 = r2 - r3
            float r2 = r2 * r1
            float r3 = r3 + r2
            android.graphics.PointF r2 = r8.A00
            if (r2 != 0) goto L_0x0198
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>()
            r8.A00 = r2
        L_0x0198:
            r2.set(r6, r3)
            r2 = r22
            int r7 = X.DbT.A02(r5, r2)
        L_0x01a1:
            if (r7 < 0) goto L_0x020d
            r2 = r17
            java.lang.Object r3 = r2.get(r7)
            X.SH9 r3 = (X.SH9) r3
            r2 = r16
            java.lang.Object r2 = r2.get(r7)
            X.SH9 r2 = (X.SH9) r2
            android.graphics.PointF r10 = r3.A00
            android.graphics.PointF r6 = r3.A01
            android.graphics.PointF r3 = r3.A02
            android.graphics.PointF r15 = r2.A00
            android.graphics.PointF r13 = r2.A01
            android.graphics.PointF r11 = r2.A02
            java.lang.Object r14 = r5.get(r7)
            X.SH9 r14 = (X.SH9) r14
            float r12 = r10.x
            float r2 = r15.x
            float r2 = r2 - r12
            float r2 = r2 * r1
            float r12 = r12 + r2
            float r10 = r10.y
            float r2 = r15.y
            float r2 = r2 - r10
            float r2 = r2 * r1
            float r10 = r10 + r2
            android.graphics.PointF r2 = r14.A00
            r2.set(r12, r10)
            java.lang.Object r12 = r5.get(r7)
            X.SH9 r12 = (X.SH9) r12
            float r10 = r6.x
            float r2 = r13.x
            float r2 = r2 - r10
            float r2 = r2 * r1
            float r10 = r10 + r2
            float r6 = r6.y
            float r2 = r13.y
            float r2 = r2 - r6
            float r2 = r2 * r1
            float r6 = r6 + r2
            android.graphics.PointF r2 = r12.A01
            r2.set(r10, r6)
            java.lang.Object r10 = r5.get(r7)
            X.SH9 r10 = (X.SH9) r10
            float r6 = r3.x
            float r2 = r11.x
            float r2 = r2 - r6
            float r2 = r2 * r1
            float r6 = r6 + r2
            float r3 = r3.y
            float r2 = r11.y
            float r2 = r2 - r3
            float r2 = r2 * r1
            float r3 = r3 + r2
            android.graphics.PointF r2 = r10.A02
            r2.set(r6, r3)
            int r7 = r7 + -1
            goto L_0x01a1
        L_0x020d:
            java.util.List r2 = r0.A02
            if (r2 == 0) goto L_0x0455
            int r20 = r2.size()
        L_0x0215:
            int r20 = r20 + -1
            if (r20 < 0) goto L_0x0455
            java.util.List r3 = r0.A02
            r2 = r20
            java.lang.Object r6 = r3.get(r2)
            X.SgU r6 = (X.C11782SgU) r6
            java.util.List r2 = r8.A02
            r30 = r2
            int r3 = r30.size()
            r2 = 2
            if (r3 <= r2) goto L_0x0215
            X.SRb r2 = r6.A01
            float r19 = A01(r2)
            r10 = 0
            int r2 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x0215
            boolean r5 = r8.A01
            int r12 = r30.size()
            int r12 = r12 - r22
            r7 = 0
            r11 = 0
        L_0x0243:
            if (r12 < 0) goto L_0x029e
            r2 = r30
            java.lang.Object r3 = r2.get(r12)
            X.SH9 r3 = (X.SH9) r3
            int r14 = r12 + -1
            int r13 = r30.size()
            int r2 = A02(r14, r13)
            int r2 = r2 * r13
            int r14 = r14 - r2
            r2 = r30
            java.lang.Object r2 = r2.get(r14)
            X.SH9 r2 = (X.SH9) r2
            if (r12 != 0) goto L_0x0293
            if (r5 != 0) goto L_0x0293
            android.graphics.PointF r15 = r8.A00
            r14 = r15
        L_0x0268:
            android.graphics.PointF r13 = r3.A00
            boolean r2 = r8.A01
            if (r2 != 0) goto L_0x0291
            if (r12 == 0) goto L_0x027a
            r3 = r22
            r2 = r30
            int r2 = X.DbT.A02(r2, r3)
            if (r12 != r2) goto L_0x0291
        L_0x027a:
            r3 = 1
        L_0x027b:
            boolean r2 = r15.equals(r14)
            if (r2 == 0) goto L_0x028e
            boolean r2 = r13.equals(r14)
            if (r2 == 0) goto L_0x028e
            if (r3 != 0) goto L_0x028e
            int r11 = r11 + 2
        L_0x028b:
            int r12 = r12 + -1
            goto L_0x0243
        L_0x028e:
            int r11 = r11 + 1
            goto L_0x028b
        L_0x0291:
            r3 = 0
            goto L_0x027b
        L_0x0293:
            android.graphics.PointF r15 = r2.A02
            r14 = r15
            if (r12 != 0) goto L_0x029b
            if (r5 != 0) goto L_0x029b
            goto L_0x0268
        L_0x029b:
            android.graphics.PointF r15 = r2.A01
            goto L_0x0268
        L_0x029e:
            X.SHA r2 = r6.A00
            if (r2 == 0) goto L_0x02aa
            java.util.List r2 = r2.A02
            int r2 = r2.size()
            if (r2 == r11) goto L_0x02c8
        L_0x02aa:
            java.util.ArrayList r12 = X.DbS.A0v(r11)
            r3 = 0
        L_0x02af:
            if (r3 >= r11) goto L_0x02bc
            X.SH9 r2 = new X.SH9
            r2.<init>()
            r12.add(r2)
            int r3 = r3 + 1
            goto L_0x02af
        L_0x02bc:
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r10, r10)
            X.SHA r2 = new X.SHA
            r2.<init>(r3, r12, r7)
            r6.A00 = r2
        L_0x02c8:
            X.SHA r2 = r6.A00
            r29 = r2
            r2.A01 = r5
            android.graphics.PointF r2 = r8.A00
            float r6 = r2.x
            float r5 = r2.y
            r2 = r29
            android.graphics.PointF r3 = r2.A00
            if (r3 != 0) goto L_0x02e1
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>()
            r2.A00 = r3
        L_0x02e1:
            r3.set(r6, r5)
            java.util.List r2 = r2.A02
            r28 = r2
            boolean r2 = r8.A01
            r18 = r2
            r10 = 0
        L_0x02ed:
            int r2 = r30.size()
            if (r7 >= r2) goto L_0x0451
            r2 = r30
            java.lang.Object r11 = r2.get(r7)
            X.SH9 r11 = (X.SH9) r11
            int r5 = r7 + -1
            int r3 = r30.size()
            int r2 = A02(r5, r3)
            int r2 = r2 * r3
            int r5 = r5 - r2
            r2 = r30
            java.lang.Object r6 = r2.get(r5)
            X.SH9 r6 = (X.SH9) r6
            int r5 = r7 + -2
            int r3 = r30.size()
            int r2 = A02(r5, r3)
            int r2 = r2 * r3
            int r5 = r5 - r2
            r2 = r30
            java.lang.Object r2 = r2.get(r5)
            X.SH9 r2 = (X.SH9) r2
            if (r7 != 0) goto L_0x0444
            if (r18 != 0) goto L_0x0444
            android.graphics.PointF r15 = r8.A00
            r13 = r15
        L_0x032a:
            android.graphics.PointF r14 = r11.A00
            android.graphics.PointF r5 = r2.A02
            android.graphics.PointF r3 = r11.A02
            boolean r2 = r8.A01
            if (r2 != 0) goto L_0x0441
            if (r7 == 0) goto L_0x033c
            int r2 = X.C51966G9m.A06(r30)
            if (r7 != r2) goto L_0x0441
        L_0x033c:
            r12 = 1
        L_0x033d:
            boolean r2 = r15.equals(r13)
            if (r2 == 0) goto L_0x040a
            boolean r2 = r14.equals(r13)
            if (r2 == 0) goto L_0x040a
            if (r12 != 0) goto L_0x040a
            float r12 = r13.x
            float r2 = r5.x
            r17 = r2
            float r2 = r12 - r2
            float r11 = r13.y
            float r15 = r5.y
            float r5 = r11 - r15
            float r14 = r3.x
            float r14 = r14 - r12
            float r13 = r3.y
            float r13 = r13 - r11
            double r2 = (double) r2
            r26 = r2
            double r2 = (double) r5
            r5 = r26
            double r5 = java.lang.Math.hypot(r5, r2)
            float r5 = (float) r5
            r16 = r5
            double r2 = (double) r14
            r26 = r2
            double r2 = (double) r13
            r5 = r26
            double r5 = java.lang.Math.hypot(r5, r2)
            float r5 = (float) r5
            r6 = r5
            float r2 = r19 / r16
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = java.lang.Math.min(r2, r5)
            float r2 = r19 / r6
            float r2 = java.lang.Math.min(r2, r5)
            float r17 = r17 - r12
            float r17 = r17 * r3
            float r5 = r12 + r17
            float r15 = r15 - r11
            float r15 = r15 * r3
            float r6 = r11 + r15
            float r14 = r14 * r2
            float r3 = r12 + r14
            float r13 = r13 * r2
            float r13 = r13 + r11
            float r2 = r5 - r12
            r14 = 1057835346(0x3f0d4952, float:0.5519)
            float r2 = r2 * r14
            float r17 = r5 - r2
            float r2 = r6 - r11
            float r2 = r2 * r14
            float r16 = r6 - r2
            float r2 = r3 - r12
            float r2 = r2 * r14
            float r15 = r3 - r2
            float r2 = r13 - r11
            float r2 = r2 * r14
            float r11 = r13 - r2
            int r14 = r10 + -1
            int r12 = r28.size()
            int r2 = A02(r14, r12)
            int r2 = r2 * r12
            int r14 = r14 - r2
            r2 = r28
            java.lang.Object r14 = r2.get(r14)
            X.SH9 r14 = (X.SH9) r14
            java.lang.Object r12 = r2.get(r10)
            X.SH9 r12 = (X.SH9) r12
            android.graphics.PointF r2 = r14.A01
            r2.set(r5, r6)
            android.graphics.PointF r2 = r14.A02
            r2.set(r5, r6)
            if (r7 != 0) goto L_0x03e2
            r2 = r29
            android.graphics.PointF r14 = r2.A00
            if (r14 != 0) goto L_0x03df
            android.graphics.PointF r14 = new android.graphics.PointF
            r14.<init>()
            r2.A00 = r14
        L_0x03df:
            r14.set(r5, r6)
        L_0x03e2:
            android.graphics.PointF r6 = r12.A00
            r5 = r17
            r2 = r16
            r6.set(r5, r2)
            int r10 = r10 + 1
            r2 = r28
            java.lang.Object r5 = r2.get(r10)
            X.SH9 r5 = (X.SH9) r5
            android.graphics.PointF r6 = r12.A01
            r6.set(r15, r11)
            android.graphics.PointF r2 = r12.A02
            r2.set(r3, r13)
        L_0x03ff:
            android.graphics.PointF r2 = r5.A00
            r2.set(r3, r13)
            int r10 = r10 + 1
            int r7 = r7 + 1
            goto L_0x02ed
        L_0x040a:
            int r5 = r10 + -1
            int r3 = r28.size()
            int r2 = A02(r5, r3)
            int r2 = r2 * r3
            int r5 = r5 - r2
            r2 = r28
            java.lang.Object r12 = r2.get(r5)
            X.SH9 r12 = (X.SH9) r12
            java.lang.Object r5 = r2.get(r10)
            X.SH9 r5 = (X.SH9) r5
            android.graphics.PointF r2 = r6.A01
            float r13 = r2.x
            float r3 = r2.y
            android.graphics.PointF r2 = r12.A01
            r2.set(r13, r3)
            android.graphics.PointF r2 = r6.A02
            float r6 = r2.x
            float r3 = r2.y
            android.graphics.PointF r2 = r12.A02
            r2.set(r6, r3)
            android.graphics.PointF r2 = r11.A00
            float r3 = r2.x
            float r13 = r2.y
            goto L_0x03ff
        L_0x0441:
            r12 = 0
            goto L_0x033d
        L_0x0444:
            android.graphics.PointF r15 = r6.A02
            r13 = r15
            if (r7 != 0) goto L_0x044d
            if (r18 != 0) goto L_0x044d
            goto L_0x032a
        L_0x044d:
            android.graphics.PointF r15 = r6.A01
            goto L_0x032a
        L_0x0451:
            r8 = r29
            goto L_0x0215
        L_0x0455:
            android.graphics.Path r5 = r0.A03
            X.SQL.A01(r5, r8)
            X.SIR r2 = r0.A03
            if (r2 == 0) goto L_0x00d2
            android.graphics.Path r2 = r0.A01
            if (r2 != 0) goto L_0x046e
            android.graphics.Path r2 = X.C51965G9l.A0C()
            r0.A01 = r2
            android.graphics.Path r2 = X.C51965G9l.A0C()
            r0.A00 = r2
        L_0x046e:
            android.graphics.Path r3 = r0.A01
            r2 = r23
            X.SQL.A01(r3, r2)
            if (r21 == 0) goto L_0x047e
            android.graphics.Path r3 = r0.A00
            r2 = r21
            X.SQL.A01(r3, r2)
        L_0x047e:
            X.SIR r10 = r0.A03
            float r3 = r4.A0A
            java.lang.Float r2 = r4.A07
            float r14 = r2.floatValue()
            android.graphics.Path r11 = r0.A01
            if (r21 != 0) goto L_0x049d
            r12 = r11
        L_0x048d:
            float r16 = r0.A05()
            float r0 = r0.A02
            r13 = r3
            r15 = r1
            r17 = r0
            java.lang.Object r5 = r10.A01(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00d2
        L_0x049d:
            android.graphics.Path r12 = r0.A00
            goto L_0x048d
        L_0x04a0:
            boolean r2 = r9 instanceof X.QGO
            if (r2 == 0) goto L_0x04cd
            X.SIR r10 = r9.A03
            if (r10 == 0) goto L_0x058f
            float r2 = r4.A0A
            java.lang.Float r0 = r4.A07
            if (r0 != 0) goto L_0x04c8
            r14 = 2139095039(0x7f7fffff, float:3.4028235E38)
        L_0x04b1:
            java.lang.Object r11 = r4.A0E
            java.lang.Object r12 = r4.A08
            if (r12 != 0) goto L_0x04b8
            r12 = r11
        L_0x04b8:
            float r16 = r9.A04()
            float r0 = r9.A02
            r13 = r2
            r15 = r1
            r17 = r0
            java.lang.Object r5 = r10.A01(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00d2
        L_0x04c8:
            float r14 = r0.floatValue()
            goto L_0x04b1
        L_0x04cd:
            boolean r2 = r9 instanceof X.QGT
            if (r2 == 0) goto L_0x0514
            X.QGT r0 = (X.QGT) r0
            java.lang.Object r11 = r4.A0E
            if (r11 == 0) goto L_0x065e
            java.lang.Object r12 = r4.A08
            if (r12 == 0) goto L_0x065e
            X.S0z r11 = (X.S0z) r11
            X.S0z r12 = (X.S0z) r12
            X.SIR r10 = r0.A03
            if (r10 == 0) goto L_0x04fd
            float r3 = r4.A0A
            java.lang.Float r2 = r4.A07
            float r14 = r2.floatValue()
            float r16 = r0.A05()
            float r2 = r0.A02
            r13 = r3
            r15 = r1
            r17 = r2
            java.lang.Object r5 = r10.A01(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x04fd
            goto L_0x00d2
        L_0x04fd:
            X.S0z r5 = r0.A00
            float r2 = r11.A00
            float r0 = r12.A00
            float r3 = X.Pxh.A00(r0, r2, r1)
            float r2 = r11.A01
            float r0 = r12.A01
            float r0 = r0 - r2
            float r1 = r1 * r0
            float r2 = r2 + r1
            r5.A00 = r3
            r5.A01 = r2
            goto L_0x00d2
        L_0x0514:
            boolean r2 = r9 instanceof X.QGV
            if (r2 == 0) goto L_0x0520
            X.QGV r0 = (X.QGV) r0
            android.graphics.PointF r5 = r0.A0B(r4, r1, r1, r1)
            goto L_0x00d2
        L_0x0520:
            boolean r2 = r9 instanceof X.QGU
            if (r2 == 0) goto L_0x059d
            X.QGU r0 = (X.QGU) r0
            r6 = r4
            X.QGm r6 = (X.C7495QGm) r6
            android.graphics.Path r3 = r6.A00
            if (r3 == 0) goto L_0x0599
            X.SIR r10 = r0.A03
            if (r10 == 0) goto L_0x054f
            float r13 = r6.A0A
            java.lang.Float r2 = r6.A07
            float r14 = r2.floatValue()
            java.lang.Object r11 = r6.A0E
            java.lang.Object r12 = r6.A08
            float r15 = r0.A05()
            float r2 = r0.A02
            r16 = r1
            r17 = r2
            java.lang.Object r5 = r10.A01(r11, r12, r13, r14, r15, r16, r17)
            if (r5 == 0) goto L_0x054f
            goto L_0x00d2
        L_0x054f:
            X.QGm r2 = r0.A00
            r8 = 0
            if (r2 == r6) goto L_0x055b
            android.graphics.PathMeasure r2 = r0.A01
            r2.setPath(r3, r8)
            r0.A00 = r6
        L_0x055b:
            android.graphics.PathMeasure r2 = r0.A01
            float r7 = r2.getLength()
            float r1 = r1 * r7
            float[] r6 = r0.A03
            float[] r4 = r0.A04
            r2.getPosTan(r1, r6, r4)
            android.graphics.PointF r5 = r0.A02
            r2 = r6[r8]
            r3 = 1
            r0 = r6[r3]
            r5.set(r2, r0)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0583
            r2 = r4[r8]
            float r2 = r2 * r1
            r0 = r4[r3]
            float r0 = r0 * r1
        L_0x057e:
            r5.offset(r2, r0)
            goto L_0x00d2
        L_0x0583:
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d2
            r2 = r4[r8]
            float r1 = r1 - r7
            float r2 = r2 * r1
            r0 = r4[r3]
            float r0 = r0 * r1
            goto L_0x057e
        L_0x058f:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0599
            java.lang.Object r5 = r4.A08
            if (r5 != 0) goto L_0x00d2
        L_0x0599:
            java.lang.Object r5 = r4.A0E
            goto L_0x00d2
        L_0x059d:
            boolean r2 = r9 instanceof X.QGQ
            if (r2 == 0) goto L_0x05ad
            X.QGQ r0 = (X.QGQ) r0
            int r0 = r0.A0B(r4, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x00d2
        L_0x05ad:
            boolean r2 = r9 instanceof X.QGS
            if (r2 == 0) goto L_0x063b
            X.QGS r0 = (X.QGS) r0
            X.S5S r5 = r0.A00
            java.lang.Object r10 = r4.A0E
            X.S5S r10 = (X.S5S) r10
            java.lang.Object r11 = r4.A08
            X.S5S r11 = (X.S5S) r11
            boolean r0 = r10.equals(r11)
            if (r0 != 0) goto L_0x0624
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0624
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x05e5
            r3 = 0
        L_0x05cf:
            int[] r2 = r11.A01
            int r0 = r2.length
            if (r3 >= r0) goto L_0x00d2
            float[] r1 = r5.A00
            float[] r0 = r11.A00
            r0 = r0[r3]
            r1[r3] = r0
            int[] r1 = r5.A01
            r0 = r2[r3]
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x05cf
        L_0x05e5:
            int[] r8 = r10.A01
            int r4 = r8.length
            int[] r7 = r11.A01
            int r3 = r7.length
            if (r4 != r3) goto L_0x0665
            r6 = 0
        L_0x05ee:
            if (r6 >= r4) goto L_0x060f
            float[] r3 = r5.A00
            float[] r0 = r10.A00
            r2 = r0[r6]
            float[] r0 = r11.A00
            r0 = r0[r6]
            float r0 = X.Pxh.A00(r0, r2, r1)
            r3[r6] = r0
            int[] r3 = r5.A01
            r2 = r8[r6]
            r0 = r7[r6]
            int r0 = X.SKD.A02(r1, r2, r0)
            r3[r6] = r0
            int r6 = r6 + 1
            goto L_0x05ee
        L_0x060f:
            r3 = r4
        L_0x0610:
            float[] r1 = r5.A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x00d2
            int r2 = r4 + -1
            r0 = r1[r2]
            r1[r3] = r0
            int[] r1 = r5.A01
            r0 = r1[r2]
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0610
        L_0x0624:
            r3 = 0
        L_0x0625:
            int[] r2 = r10.A01
            int r0 = r2.length
            if (r3 >= r0) goto L_0x00d2
            float[] r1 = r5.A00
            float[] r0 = r10.A00
            r0 = r0[r3]
            r1[r3] = r0
            int[] r1 = r5.A01
            r0 = r2[r3]
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0625
        L_0x063b:
            boolean r2 = r9 instanceof X.QGR
            if (r2 == 0) goto L_0x064b
            X.QGR r0 = (X.QGR) r0
            float r0 = r0.A0C(r4, r1)
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            goto L_0x00d2
        L_0x064b:
            X.QGP r0 = (X.QGP) r0
            int r0 = r0.A0B(r4, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            goto L_0x00d2
        L_0x0657:
            java.lang.String r0 = "This animation does not support split dimensions!"
            java.lang.UnsupportedOperationException r0 = X.AnonymousClass7TE.A1B(r0)
            throw r0
        L_0x065e:
            java.lang.String r0 = "Missing values for keyframe."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0665:
            java.lang.String r2 = "Cannot interpolate between gradients. Lengths vary ("
            java.lang.String r1 = " vs "
            java.lang.String r0 = ")"
            java.lang.String r0 = X.002.A0n(r2, r1, r0, r4, r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11388SRb.A06():java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(float r6) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.QGN
            if (r0 == 0) goto L_0x0007
            r5.A02 = r6
        L_0x0006:
            return
        L_0x0007:
            boolean r0 = r5 instanceof X.QGM
            if (r0 == 0) goto L_0x003a
            r3 = r5
            X.QGM r3 = (X.QGM) r3
            X.SRb r1 = r3.A04
            r1.A08(r6)
            X.SRb r0 = r3.A05
            r0.A08(r6)
            android.graphics.PointF r2 = r3.A02
            float r1 = A01(r1)
            float r0 = A01(r0)
            r2.set(r1, r0)
            r2 = 0
        L_0x0026:
            java.util.List r1 = r3.A07
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0006
            java.lang.Object r0 = r1.get(r2)
            X.Tbn r0 = (X.C13518Tbn) r0
            r0.Dwx()
            int r2 = r2 + 1
            goto L_0x0026
        L_0x003a:
            X.Thx r4 = r5.A06
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0006
            float r1 = r5.A01
            r2 = r1
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0052
            float r1 = r4.Bye()
            r5.A01 = r1
            r2 = r1
        L_0x0052:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0073
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            float r2 = r4.Bye()
            r5.A01 = r2
        L_0x0060:
            r6 = r2
        L_0x0061:
            float r0 = r5.A02
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0006
            r5.A02 = r6
            boolean r0 = r4.CeI(r6)
            if (r0 == 0) goto L_0x0006
            r5.A07()
            return
        L_0x0073:
            float r1 = r5.A00
            r2 = r1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0081
            float r1 = r4.B1Y()
            r5.A00 = r1
            r2 = r1
        L_0x0081:
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0061
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0060
            float r2 = r4.B1Y()
            r5.A00 = r2
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11388SRb.A08(float):void");
    }

    public final void A09(C13518Tbn tbn) {
        this.A07.add(tbn);
    }

    public final void A0A(SIR sir) {
        SIR sir2 = this.A03;
        if (sir2 != null) {
            sir2.A00 = null;
        }
        this.A03 = sir;
        if (sir != null) {
            sir.A00 = this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: X.Thx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.Thx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.Thx} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.Thx} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11388SRb(java.util.List r3) {
        /*
            r2 = this;
            r2.<init>()
            r1 = 1
            java.util.ArrayList r0 = X.DbS.A0v(r1)
            r2.A07 = r0
            r0 = 0
            r2.A04 = r0
            r0 = 0
            r2.A02 = r0
            r0 = 0
            r2.A05 = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A01 = r0
            r2.A00 = r0
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0027
            X.Sgj r0 = new X.Sgj
            r0.<init>()
        L_0x0024:
            r2.A06 = r0
            return
        L_0x0027:
            int r0 = r3.size()
            if (r0 != r1) goto L_0x0033
            X.Sgk r0 = new X.Sgk
            r0.<init>(r3)
            goto L_0x0024
        L_0x0033:
            X.Sgl r0 = new X.Sgl
            r0.<init>(r3)
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11388SRb.<init>(java.util.List):void");
    }

    public static float A01(C11388SRb sRb) {
        return ((Number) sRb.A06()).floatValue();
    }

    public static PointF A03(C11388SRb sRb) {
        return (PointF) sRb.A06();
    }
}
