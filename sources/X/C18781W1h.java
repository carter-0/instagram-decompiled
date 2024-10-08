package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.W1h  reason: case insensitive filesystem */
public final class C18781W1h {
    public static final Matrix A0G = new Matrix();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public Paint A05;
    public Paint A06;
    public PathMeasure A07;
    public Boolean A08;
    public String A09;
    public int A0A;
    public final Matrix A0B;
    public final Path A0C;
    public final Path A0D;
    public final 0yf A0E;
    public final UFG A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010f, code lost:
        if (r1.A00 != 0) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.graphics.Canvas r18, android.graphics.Matrix r19, X.UFG r20, X.C18781W1h r21, int r22, int r23) {
        /*
            r8 = 0
            r14 = r20
            android.graphics.Matrix r7 = r14.A0B
            r0 = r19
            r7.set(r0)
            android.graphics.Matrix r0 = r14.A0A
            r7.preConcat(r0)
            r15 = r18
            r15.save()
            r6 = 0
        L_0x0015:
            java.util.ArrayList r1 = r14.A0C
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x01dd
            java.lang.Object r5 = r1.get(r6)
            X.V4N r5 = (X.V4N) r5
            boolean r0 = r5 instanceof X.UFG
            r9 = r21
            r2 = r22
            r1 = r23
            if (r0 == 0) goto L_0x003f
            X.UFG r5 = (X.UFG) r5
            r17 = r5
            r18 = r9
            r19 = r2
            r20 = r1
            r16 = r7
            A00(r15, r16, r17, r18, r19, r20)
        L_0x003c:
            int r6 = r6 + 1
            goto L_0x0015
        L_0x003f:
            boolean r0 = r5 instanceof X.UFF
            if (r0 == 0) goto L_0x003c
            X.UFF r5 = (X.UFF) r5
            float r2 = (float) r2
            float r0 = r9.A03
            float r2 = r2 / r0
            float r1 = (float) r1
            float r0 = r9.A02
            float r1 = r1 / r0
            float r18 = java.lang.Math.min(r2, r1)
            android.graphics.Matrix r4 = r9.A0B
            r4.set(r7)
            r4.postScale(r2, r1)
            r0 = 4
            float[] r12 = new float[r0]
            r12 = {0, 1065353216, 1065353216, 0} // fill-array
            r7.mapVectors(r12)
            r0 = 0
            r3 = r12[r0]
            double r10 = (double) r3
            r0 = 1
            r2 = r12[r0]
            double r0 = (double) r2
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            r16 = r10
            r0 = 2
            r13 = r12[r0]
            double r10 = (double) r13
            r0 = 3
            r12 = r12[r0]
            double r0 = (double) r12
            double r0 = java.lang.Math.hypot(r10, r0)
            float r10 = (float) r0
            float r3 = r3 * r12
            float r2 = r2 * r13
            float r3 = r3 - r2
            r0 = r16
            float r1 = java.lang.Math.max(r0, r10)
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            float r17 = java.lang.Math.abs(r3)
            float r17 = r17 / r1
            r12 = 0
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
            android.graphics.Path r3 = r9.A0C
            r3.reset()
            X.Vz3[] r0 = r5.A03
            if (r0 == 0) goto L_0x00a3
            X.C18667VwP.A01(r3, r0)
        L_0x00a3:
            android.graphics.Path r11 = r9.A0D
            r11.reset()
            boolean r0 = r5 instanceof X.UFE
            if (r0 == 0) goto L_0x00bf
            int r0 = r5.A01
            if (r0 != 0) goto L_0x00bc
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x00b2:
            r11.setFillType(r0)
            r11.addPath(r3, r4)
            r15.clipPath(r11)
            goto L_0x003c
        L_0x00bc:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x00b2
        L_0x00bf:
            X.UFH r5 = (X.UFH) r5
            float r13 = r5.A06
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = 1
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x00d0
            float r0 = r5.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0103
        L_0x00d0:
            float r0 = r5.A05
            float r13 = r13 + r0
            float r13 = r13 % r1
            float r2 = r5.A04
            float r2 = r2 + r0
            float r2 = r2 % r1
            android.graphics.PathMeasure r1 = r9.A07
            if (r1 != 0) goto L_0x00e3
            android.graphics.PathMeasure r1 = new android.graphics.PathMeasure
            r1.<init>()
            r9.A07 = r1
        L_0x00e3:
            r0 = 0
            r1.setPath(r3, r0)
            android.graphics.PathMeasure r0 = r9.A07
            float r1 = r0.getLength()
            float r13 = r13 * r1
            float r2 = r2 * r1
            r3.reset()
            int r16 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            android.graphics.PathMeasure r0 = r9.A07
            if (r16 <= 0) goto L_0x01d8
            r0.getSegment(r13, r1, r3, r10)
            android.graphics.PathMeasure r0 = r9.A07
            r0.getSegment(r12, r2, r3, r10)
        L_0x0100:
            r3.rLineTo(r12, r12)
        L_0x0103:
            r11.addPath(r3, r4)
            X.VUH r1 = r5.A09
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0111
            int r0 = r1.A00
            r2 = 0
            if (r0 == 0) goto L_0x0112
        L_0x0111:
            r2 = 1
        L_0x0112:
            r12 = 1132396544(0x437f0000, float:255.0)
            r3 = 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x014a
            android.graphics.Paint r0 = r9.A05
            if (r0 != 0) goto L_0x0126
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r10)
            r9.A05 = r0
            X.AnonymousClass7TE.A1Q(r0)
        L_0x0126:
            android.graphics.Paint r2 = r9.A05
            android.graphics.Shader r0 = r1.A02
            if (r0 == 0) goto L_0x01ba
            r0.setLocalMatrix(r4)
            r2.setShader(r0)
            float r0 = r5.A00
            int r0 = X.AnonymousClass7TE.A05(r0, r12)
            r2.setAlpha(r0)
        L_0x013b:
            r2.setColorFilter(r8)
            int r0 = r5.A01
            if (r0 != 0) goto L_0x01b7
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.WINDING
        L_0x0144:
            r11.setFillType(r0)
            r15.drawPath(r11, r2)
        L_0x014a:
            X.VUH r1 = r5.A0A
            android.graphics.Shader r0 = r1.A02
            if (r0 != 0) goto L_0x0154
            int r0 = r1.A00
            if (r0 == 0) goto L_0x003c
        L_0x0154:
            android.graphics.Paint r0 = r9.A06
            if (r0 != 0) goto L_0x0162
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r10)
            r9.A06 = r0
            X.JTO.A1N(r0)
        L_0x0162:
            android.graphics.Paint r2 = r9.A06
            android.graphics.Paint$Join r0 = r5.A08
            if (r0 == 0) goto L_0x016b
            r2.setStrokeJoin(r0)
        L_0x016b:
            android.graphics.Paint$Cap r0 = r5.A07
            if (r0 == 0) goto L_0x0172
            r2.setStrokeCap(r0)
        L_0x0172:
            float r0 = r5.A02
            r2.setStrokeMiter(r0)
            android.graphics.Shader r0 = r1.A02
            if (r0 == 0) goto L_0x019b
            r0.setLocalMatrix(r4)
            r2.setShader(r0)
            float r0 = r5.A01
            int r0 = X.AnonymousClass7TE.A05(r0, r12)
            r2.setAlpha(r0)
        L_0x018a:
            r2.setColorFilter(r8)
            float r18 = r18 * r17
            float r0 = r5.A03
            float r0 = r0 * r18
            r2.setStrokeWidth(r0)
            r15.drawPath(r11, r2)
            goto L_0x003c
        L_0x019b:
            r2.setShader(r8)
            r2.setAlpha(r3)
            int r4 = r1.A00
            float r3 = r5.A01
            int r1 = android.graphics.Color.alpha(r4)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r0
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            int r0 = r0 << 24
            r4 = r4 | r0
            r2.setColor(r4)
            goto L_0x018a
        L_0x01b7:
            android.graphics.Path$FillType r0 = android.graphics.Path.FillType.EVEN_ODD
            goto L_0x0144
        L_0x01ba:
            r2.setShader(r8)
            r2.setAlpha(r3)
            int r1 = r1.A00
            float r13 = r5.A00
            int r0 = android.graphics.Color.alpha(r1)
            r16 = 16777215(0xffffff, float:2.3509886E-38)
            r1 = r1 & r16
            float r0 = (float) r0
            float r0 = r0 * r13
            int r0 = (int) r0
            int r0 = r0 << 24
            r1 = r1 | r0
            r2.setColor(r1)
            goto L_0x013b
        L_0x01d8:
            r0.getSegment(r13, r2, r3, r10)
            goto L_0x0100
        L_0x01dd:
            r15.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18781W1h.A00(android.graphics.Canvas, android.graphics.Matrix, X.UFG, X.W1h, int, int):void");
    }

    public float getAlpha() {
        return ((float) this.A04) / 255.0f;
    }

    public int getRootAlpha() {
        return this.A04;
    }

    public void setAlpha(float f) {
        this.A04 = (int) (f * 255.0f);
    }

    public void setRootAlpha(int i) {
        this.A04 = i;
    }

    public C18781W1h(C18781W1h w1h) {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        01r r2 = new 01r(0);
        this.A0E = r2;
        this.A0F = new UFG(r2, w1h.A0F);
        this.A0C = new Path(w1h.A0C);
        this.A0D = new Path(w1h.A0D);
        this.A01 = w1h.A01;
        this.A00 = w1h.A00;
        this.A03 = w1h.A03;
        this.A02 = w1h.A02;
        this.A0A = w1h.A0A;
        this.A04 = w1h.A04;
        this.A09 = w1h.A09;
        String str = w1h.A09;
        if (str != null) {
            r2.put(str, this);
        }
        this.A08 = w1h.A08;
    }

    public C18781W1h() {
        this.A0B = new Matrix();
        this.A01 = 0.0f;
        this.A00 = 0.0f;
        this.A03 = 0.0f;
        this.A02 = 0.0f;
        this.A04 = 255;
        this.A09 = null;
        this.A08 = null;
        this.A0E = new 01r(0);
        this.A0F = new UFG();
        this.A0C = new Path();
        this.A0D = new Path();
    }
}
