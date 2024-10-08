package X;

import java.util.Arrays;

/* renamed from: X.Go0  reason: case insensitive filesystem */
public final class C53408Go0 extends AnonymousClass0T0 implements C59538JNk {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final C52710GbN A06;
    public final JLX A07;
    public final float[] A08;
    public final JLY A09;

    public C53408Go0(C52710GbN gbN, JLX jlx, JLY jly, float[] fArr, float f, float f2, float f3, int i, int i2, int i3) {
        0qQ.A0B(jly, 1);
        this.A09 = jly;
        this.A07 = jlx;
        this.A03 = i;
        this.A06 = gbN;
        this.A01 = f;
        this.A04 = i2;
        this.A05 = i3;
        this.A02 = f2;
        this.A08 = fArr;
        this.A00 = f3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0075, code lost:
        if (r5 == r4) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r5 == r4) goto L_0x0089;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d9, code lost:
        if (r4 == r1) goto L_0x00db;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AQK(android.graphics.Canvas r9, X.I13 r10) {
        /*
            r8 = this;
            r1 = 1
            X.0qQ.A0B(r10, r1)
            android.graphics.Paint r2 = r10.A02
            if (r2 != 0) goto L_0x0014
            r0 = 7
            android.graphics.Paint r2 = X.AnonymousClass7TE.A0V(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r2.setStyle(r0)
            r10.A02 = r2
        L_0x0014:
            X.GbN r7 = r8.A06
            X.Go0 r0 = r10.A05
            r3 = 0
            if (r0 == 0) goto L_0x0147
            X.GbN r0 = r0.A06
        L_0x001d:
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 != 0) goto L_0x0030
            if (r7 == 0) goto L_0x0142
            float r6 = r7.A02
            float r5 = r7.A00
            float r4 = r7.A01
            int r0 = r7.A03
            r2.setShadowLayer(r6, r5, r4, r0)
        L_0x0030:
            int r4 = r8.A03
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x003a
            int r0 = r0.A03
            if (r4 == r0) goto L_0x003d
        L_0x003a:
            X.SMJ.A01(r4, r2)
        L_0x003d:
            X.JLX r5 = r8.A07
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x013f
            X.JLX r0 = r0.A07
        L_0x0045:
            boolean r0 = X.0qQ.A0K(r5, r0)
            if (r0 != 0) goto L_0x0065
            boolean r0 = r5 instanceof X.C53417Go9
            if (r0 == 0) goto L_0x012e
            android.graphics.Shader r0 = r2.getShader()
            if (r0 == 0) goto L_0x0058
            r2.setShader(r3)
        L_0x0058:
            int r4 = r2.getColor()
            X.Go9 r5 = (X.C53417Go9) r5
            int r0 = r5.A00
            if (r4 == r0) goto L_0x0065
            r2.setColor(r0)
        L_0x0065:
            float r5 = r8.A01
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x0121
            float r4 = r0.A01
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            if (r0 == 0) goto L_0x0121
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0121
        L_0x0077:
            float r5 = r8.A02
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x0114
            float r4 = r0.A02
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
            if (r0 == 0) goto L_0x0114
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0114
        L_0x0089:
            int r4 = r8.A04
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x0093
            int r0 = r0.A04
            if (r4 == r0) goto L_0x00a1
        L_0x0093:
            r0 = 0
            if (r4 != r0) goto L_0x010c
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
        L_0x0098:
            android.graphics.Paint$Cap r0 = r2.getStrokeCap()
            if (r0 == r4) goto L_0x00a1
            r2.setStrokeCap(r4)
        L_0x00a1:
            int r4 = r8.A05
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x00ab
            int r0 = r0.A05
            if (r4 == r0) goto L_0x00b9
        L_0x00ab:
            r0 = 0
            if (r4 != r0) goto L_0x0104
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.MITER
        L_0x00b0:
            android.graphics.Paint$Join r0 = r2.getStrokeJoin()
            if (r0 == r1) goto L_0x00b9
            r2.setStrokeJoin(r1)
        L_0x00b9:
            float[] r5 = r8.A08
            if (r5 == 0) goto L_0x00fa
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x00f8
            float[] r0 = r0.A08
        L_0x00c3:
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 == 0) goto L_0x00ed
            float r4 = r8.A00
            X.Go0 r0 = r10.A05
            if (r0 == 0) goto L_0x00ed
            float r1 = r0.A00
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            if (r0 == 0) goto L_0x00ed
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00ed
        L_0x00db:
            r10.A05 = r8
            X.JLY r1 = r8.A09
            boolean r0 = r1 instanceof X.C53418GoA
            if (r0 == 0) goto L_0x014a
            X.GoA r1 = (X.C53418GoA) r1
            android.graphics.Path r0 = r10.A00(r1, r3)
            r9.drawPath(r0, r2)
            return
        L_0x00ed:
            float r1 = r8.A00
            android.graphics.DashPathEffect r0 = new android.graphics.DashPathEffect
            r0.<init>(r5, r1)
            r2.setPathEffect(r0)
            goto L_0x00db
        L_0x00f8:
            r0 = r3
            goto L_0x00c3
        L_0x00fa:
            android.graphics.PathEffect r0 = r2.getPathEffect()
            if (r0 == 0) goto L_0x00db
            r2.setPathEffect(r3)
            goto L_0x00db
        L_0x0104:
            if (r4 != r1) goto L_0x0109
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.ROUND
            goto L_0x00b0
        L_0x0109:
            android.graphics.Paint$Join r1 = android.graphics.Paint.Join.BEVEL
            goto L_0x00b0
        L_0x010c:
            if (r4 != r1) goto L_0x0111
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.ROUND
            goto L_0x0098
        L_0x0111:
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.SQUARE
            goto L_0x0098
        L_0x0114:
            float r0 = r2.getStrokeMiter()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0089
            r2.setStrokeMiter(r5)
            goto L_0x0089
        L_0x0121:
            float r0 = r2.getStrokeWidth()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0077
            r2.setStrokeWidth(r5)
            goto L_0x0077
        L_0x012e:
            boolean r0 = r5 instanceof X.C53416Go8
            if (r0 == 0) goto L_0x0159
            X.Go8 r5 = (X.C53416Go8) r5
            X.JNj r0 = r5.A00
            android.graphics.Shader r0 = r0.FH5()
            r2.setShader(r0)
            goto L_0x0065
        L_0x013f:
            r0 = r3
            goto L_0x0045
        L_0x0142:
            r2.clearShadowLayer()
            goto L_0x0030
        L_0x0147:
            r0 = r3
            goto L_0x001d
        L_0x014a:
            boolean r0 = r1 instanceof X.C59666JSl
            if (r0 == 0) goto L_0x0154
            X.JSl r1 = (X.C59666JSl) r1
            r1.AQJ(r9, r2)
            return
        L_0x0154:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0159:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53408Go0.AQK(android.graphics.Canvas, X.I13):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0078
            java.lang.Class r1 = r4.getClass()
            if (r5 == 0) goto L_0x0076
            java.lang.Class r0 = r5.getClass()
        L_0x000d:
            boolean r0 = X.0qQ.A0K(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "null cannot be cast to non-null type com.facebook.primitive.canvas.model.CanvasStroke"
            X.0qQ.A0C(r5, r0)
            X.Go0 r5 = (X.C53408Go0) r5
            X.JLY r1 = r4.A09
            X.JLY r0 = r5.A09
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0069
            X.JLX r1 = r4.A07
            X.JLX r0 = r5.A07
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0069
            int r1 = r4.A03
            int r0 = r5.A03
            if (r1 != r0) goto L_0x0069
            X.GbN r1 = r4.A06
            X.GbN r0 = r5.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0069
            float r1 = r4.A01
            float r0 = r5.A01
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0069
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0069
            float r1 = r4.A02
            float r0 = r5.A02
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            float[] r1 = r4.A08
            float[] r0 = r5.A08
            if (r1 == 0) goto L_0x006a
            if (r0 == 0) goto L_0x0069
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x006d
        L_0x0069:
            return r2
        L_0x006a:
            if (r0 == 0) goto L_0x006d
            return r2
        L_0x006d:
            float r1 = r4.A00
            float r0 = r5.A00
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0069
            return r3
        L_0x0076:
            r0 = 0
            goto L_0x000d
        L_0x0078:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53408Go0.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        int A002 = AnonymousClass7TF.A00((((AnonymousClass7TF.A00((((AnonymousClass7TF.A07(this.A07, AnonymousClass7TE.A0K(this.A09)) + this.A03) * 31) + C51971G9r.A0E(this.A06)) * 31, this.A01) + this.A04) * 31) + this.A05) * 31, this.A02);
        float[] fArr = this.A08;
        if (fArr != null) {
            i = Arrays.hashCode(fArr);
        }
        return C51966G9m.A02((A002 + i) * 31, this.A00);
    }
}
