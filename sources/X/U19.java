package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.PathMotion;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;

public final class U19 extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public RectF A03;
    public VV8 A04;
    public C17562VaG A05;
    public final Paint A06;
    public final Paint A07 = new Paint();
    public final View A08;
    public final View A09;
    public final C297875sV A0A;
    public final VZB A0B;
    public final float A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final float A0G;
    public final Paint A0H;
    public final Paint A0I;
    public final Paint A0J;
    public final Paint A0K;
    public final Path A0L;
    public final PathMeasure A0M;
    public final RectF A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final RectF A0Q;
    public final RectF A0R;
    public final RectF A0S;
    public final C297895sX A0T;
    public final C297895sX A0U;
    public final X1E A0V;
    public final C20974X7e A0W;
    public final C17478VXf A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final float[] A0b;

    public final int getOpacity() {
        return -3;
    }

    private void A00(Canvas canvas) {
        A02(canvas, this.A0I);
        Rect bounds = getBounds();
        RectF rectF = this.A0N;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.A05.A04;
        int i = this.A04.A00;
        RectF rectF2 = W3G.A00;
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF3 = W3G.A00;
                rectF3.set(bounds);
                canvas.saveLayerAlpha(rectF3, i);
            }
            this.A08.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    private void A01(Canvas canvas) {
        A02(canvas, this.A0K);
        Rect bounds = getBounds();
        RectF rectF = this.A0P;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = this.A05.A05;
        int i = this.A04.A01;
        RectF rectF2 = W3G.A00;
        if (i > 0) {
            int save = canvas.save();
            canvas.translate(f, f2);
            canvas.scale(f3, f3);
            if (i < 255) {
                RectF rectF3 = W3G.A00;
                rectF3.set(bounds);
                canvas.saveLayerAlpha(rectF3, i);
            }
            this.A09.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01fc, code lost:
        if (r15.A00.ArV(r13) != 0.0f) goto L_0x01fe;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.U19 r25, float r26) {
        /*
            r3 = r25
            r4 = r26
            r3.A02 = r4
            android.graphics.Paint r6 = r3.A0J
            boolean r5 = r3.A0a
            r1 = 0
            r2 = 1132396544(0x437f0000, float:255.0)
            android.graphics.RectF r0 = X.W3G.A00
            if (r5 == 0) goto L_0x026f
            float r0 = X.C13988Tno.A00(r2, r1, r4)
        L_0x0015:
            int r0 = (int) r0
            r6.setAlpha(r0)
            android.graphics.PathMeasure r12 = r3.A0M
            float r11 = r3.A0F
            float r2 = r11 * r26
            float[] r10 = r3.A0b
            r18 = 0
            r0 = r18
            r12.getPosTan(r2, r10, r0)
            r5 = 0
            r9 = r10[r5]
            r17 = 1
            r6 = r10[r17]
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0039
            int r0 = (r26 > r1 ? 1 : (r26 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
        L_0x0039:
            int r0 = (r26 > r2 ? 1 : (r26 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0265
            r7 = 1065185444(0x3f7d70a4, float:0.99)
            float r8 = r26 - r2
            r0 = 1008981760(0x3c23d700, float:0.00999999)
            float r8 = r8 / r0
        L_0x0046:
            float r11 = r11 * r7
            r0 = r18
            r12.getPosTan(r11, r10, r0)
            r0 = r10[r5]
            r7 = r10[r17]
            float r0 = r9 - r0
            float r0 = r0 * r8
            float r9 = r9 + r0
            float r0 = r6 - r7
            float r0 = r0 * r8
            float r6 = r6 + r0
        L_0x0058:
            X.VXf r7 = r3.A0X
            X.VR6 r0 = r7.A01
            float r11 = r0.A01
            float r10 = r0.A00
            X.X7e r8 = r3.A0W
            android.graphics.RectF r0 = r3.A0S
            float r23 = r0.width()
            float r24 = r0.height()
            android.graphics.RectF r0 = r3.A0R
            float r25 = r0.width()
            float r26 = r0.height()
            r19 = r8
            r20 = r4
            r21 = r11
            r22 = r10
            X.VaG r0 = r19.ASu(r20, r21, r22, r23, r24, r25, r26)
            r3.A05 = r0
            android.graphics.RectF r13 = r3.A0P
            float r11 = r0.A03
            r16 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r16
            float r10 = r9 - r11
            float r11 = r11 + r9
            float r0 = r0.A02
            float r0 = r0 + r6
            r13.set(r10, r6, r11, r0)
            android.graphics.RectF r11 = r3.A0N
            X.VaG r12 = r3.A05
            float r0 = r12.A01
            float r0 = r0 / r16
            float r10 = r9 - r0
            float r9 = r9 + r0
            float r0 = r12.A00
            float r0 = r0 + r6
            r11.set(r10, r6, r9, r0)
            android.graphics.RectF r10 = r3.A0Q
            r10.set(r13)
            android.graphics.RectF r9 = r3.A0O
            r9.set(r11)
            X.VR6 r0 = r7.A02
            float r14 = r0.A01
            float r0 = r0.A00
            X.VaG r12 = r3.A05
            boolean r11 = r8.Esa(r12)
            r6 = r9
            if (r11 == 0) goto L_0x00c0
            r6 = r10
        L_0x00c0:
            float r0 = X.W3G.A00(r1, r2, r14, r0, r4)
            if (r11 != 0) goto L_0x00c8
            float r0 = r2 - r0
        L_0x00c8:
            r8.AC4(r6, r12, r0)
            float r6 = r10.left
            float r0 = r9.left
            float r12 = java.lang.Math.min(r6, r0)
            float r6 = r10.top
            float r0 = r9.top
            float r11 = java.lang.Math.min(r6, r0)
            float r6 = r10.right
            float r0 = r9.right
            float r8 = java.lang.Math.max(r6, r0)
            float r6 = r10.bottom
            float r0 = r9.bottom
            float r6 = java.lang.Math.max(r6, r0)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r12, r11, r8, r6)
            r3.A03 = r0
            X.VZB r8 = r3.A0B
            X.5sX r15 = r3.A0U
            X.5sX r14 = r3.A0T
            X.VR6 r0 = r7.A03
            float r12 = r0.A01
            float r11 = r0.A00
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0107
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d5
            r15 = r14
        L_0x0107:
            r8.A00 = r15
            X.5sg r1 = r8.A04
            android.graphics.Path r11 = r8.A03
            r19 = r1
            r20 = r11
            r21 = r10
            r22 = r15
            r23 = r18
            r24 = r2
            r19.A01(r20, r21, r22, r23, r24)
            X.5sX r0 = r8.A00
            android.graphics.Path r6 = r8.A01
            r20 = r6
            r21 = r9
            r22 = r0
            r19.A01(r20, r21, r22, r23, r24)
            android.graphics.Path r1 = r8.A02
            android.graphics.Path$Op r0 = android.graphics.Path.Op.UNION
            r1.op(r11, r6, r0)
            float r1 = r3.A0G
            float r0 = r3.A0E
            float r0 = X.C13988Tno.A00(r0, r1, r4)
            r3.A00 = r0
            android.graphics.RectF r1 = r3.A03
            float r0 = r3.A0D
            float r6 = r1.centerX()
            float r0 = r0 / r16
            float r6 = r6 / r0
            float r6 = r6 - r2
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r6 = r6 * r0
            android.graphics.RectF r1 = r3.A03
            float r0 = r3.A0C
            float r1 = r1.centerY()
            float r1 = r1 / r0
            r0 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r0
            float r8 = r3.A00
            float r6 = r6 * r8
            int r0 = (int) r6
            float r6 = (float) r0
            float r1 = r1 * r8
            int r0 = (int) r1
            float r2 = (float) r0
            r3.A01 = r2
            android.graphics.Paint r1 = r3.A07
            r0 = 754974720(0x2d000000, float:7.2759576E-12)
            r1.setShadowLayer(r8, r6, r2, r0)
            X.VR6 r0 = r7.A00
            float r7 = r0.A01
            float r6 = r0.A00
            X.X1E r0 = r3.A0V
            X.WMe r0 = (X.C19123WMe) r0
            int r0 = r0.A00
            switch(r0) {
                case 0: goto L_0x01c7;
                case 1: goto L_0x01bb;
                case 2: goto L_0x01b0;
                default: goto L_0x0176;
            }
        L_0x0176:
            r0 = 1051931443(0x3eb33333, float:0.35)
            float r2 = r6 - r7
            float r2 = r2 * r0
            float r2 = r2 + r7
            r0 = 255(0xff, float:3.57E-43)
            int r1 = X.W3G.A02(r7, r2, r4, r0, r5)
            int r0 = X.W3G.A02(r2, r6, r4, r5, r0)
        L_0x0187:
            X.VV8 r4 = new X.VV8
            r4.<init>(r1, r0, r5)
        L_0x018c:
            r3.A04 = r4
            android.graphics.Paint r1 = r3.A0K
            int r0 = r1.getColor()
            if (r0 == 0) goto L_0x019d
            X.VV8 r0 = r3.A04
            int r0 = r0.A01
            r1.setAlpha(r0)
        L_0x019d:
            android.graphics.Paint r1 = r3.A0I
            int r0 = r1.getColor()
            if (r0 == 0) goto L_0x01ac
            X.VV8 r0 = r3.A04
            int r0 = r0.A00
            r1.setAlpha(r0)
        L_0x01ac:
            r3.invalidateSelf()
            return
        L_0x01b0:
            r0 = 255(0xff, float:3.57E-43)
            int r1 = X.W3G.A02(r7, r6, r4, r0, r5)
            int r0 = X.W3G.A02(r7, r6, r4, r5, r0)
            goto L_0x0187
        L_0x01bb:
            r1 = 255(0xff, float:3.57E-43)
            int r0 = X.W3G.A02(r7, r6, r4, r1, r5)
            X.VV8 r4 = new X.VV8
            r4.<init>(r0, r1, r5)
            goto L_0x018c
        L_0x01c7:
            r2 = 255(0xff, float:3.57E-43)
            int r1 = X.W3G.A02(r7, r6, r4, r5, r2)
            X.VV8 r4 = new X.VV8
            r0 = r17
            r4.<init>(r2, r1, r0)
            goto L_0x018c
        L_0x01d5:
            X.5sb r0 = r15.A02
            float r6 = r0.ArV(r13)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01fe
            X.5sb r6 = r15.A03
            float r6 = r6.ArV(r13)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01fe
            X.5sb r6 = r15.A01
            float r6 = r6.ArV(r13)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x01fe
            X.5sb r6 = r15.A00
            float r6 = r6.ArV(r13)
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = r14
            if (r6 == 0) goto L_0x01ff
        L_0x01fe:
            r1 = r15
        L_0x01ff:
            X.6yg r6 = new X.6yg
            r6.<init>(r1)
            X.5sb r1 = r14.A02
            float r0 = r0.ArV(r13)
            float r1 = r1.ArV(r9)
            float r1 = X.W3G.A00(r0, r1, r12, r11, r4)
            X.5sa r0 = new X.5sa
            r0.<init>(r1)
            r6.A02 = r0
            X.5sb r1 = r15.A03
            X.5sb r0 = r14.A03
            float r1 = r1.ArV(r13)
            float r0 = r0.ArV(r9)
            float r1 = X.W3G.A00(r1, r0, r12, r11, r4)
            X.5sa r0 = new X.5sa
            r0.<init>(r1)
            r6.A03 = r0
            X.5sb r1 = r15.A00
            X.5sb r0 = r14.A00
            float r1 = r1.ArV(r13)
            float r0 = r0.ArV(r9)
            float r1 = X.W3G.A00(r1, r0, r12, r11, r4)
            X.5sa r0 = new X.5sa
            r0.<init>(r1)
            r6.A00 = r0
            X.5sb r1 = r15.A01
            X.5sb r0 = r14.A01
            float r1 = r1.ArV(r13)
            float r0 = r0.ArV(r9)
            float r1 = X.W3G.A00(r1, r0, r12, r11, r4)
            X.5sa r0 = new X.5sa
            r0.<init>(r1)
            r6.A01 = r0
            X.5sX r15 = new X.5sX
            r15.<init>(r6)
            goto L_0x0107
        L_0x0265:
            r7 = 1008981770(0x3c23d70a, float:0.01)
            float r8 = r26 / r7
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r8 = r8 * r0
            goto L_0x0046
        L_0x026f:
            float r0 = X.C13988Tno.A00(r1, r2, r4)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U19.A03(X.U19, float):void");
    }

    public final void draw(Canvas canvas) {
        int i;
        Paint paint = this.A0J;
        if (paint.getAlpha() > 0) {
            canvas.drawRect(getBounds(), paint);
        }
        boolean z = this.A0Y;
        if (z) {
            i = canvas.save();
        } else {
            i = -1;
        }
        if (this.A0Z && this.A00 > 0.0f) {
            canvas.save();
            VZB vzb = this.A0B;
            Path path = vzb.A02;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                C297895sX r1 = vzb.A00;
                if (r1.A03(this.A03)) {
                    float ArV = r1.A02.ArV(this.A03);
                    canvas.drawRoundRect(this.A03, ArV, ArV, this.A07);
                } else {
                    canvas.drawPath(path, this.A07);
                }
            } else {
                C297875sV r4 = this.A0A;
                RectF rectF = this.A03;
                r4.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                r4.A0A(this.A00);
                r4.A0D((int) this.A01);
                r4.setShapeAppearanceModel(vzb.A00);
                r4.draw(canvas);
            }
            canvas.restore();
        }
        canvas.clipPath(this.A0B.A02);
        A02(canvas, this.A0H);
        if (this.A04.A02) {
            A01(canvas);
            A00(canvas);
        } else {
            A00(canvas);
            A01(canvas);
        }
        if (z) {
            canvas.restoreToCount(i);
            RectF rectF2 = this.A0P;
            Path path2 = this.A0L;
            PointF pointF = new PointF(rectF2.centerX(), rectF2.top);
            if (this.A02 == 0.0f) {
                path2.reset();
                path2.moveTo(pointF.x, pointF.y);
            } else {
                path2.lineTo(pointF.x, pointF.y);
                Paint paint2 = this.A06;
                paint2.setColor(-65281);
                canvas.drawPath(path2, paint2);
            }
            RectF rectF3 = this.A0Q;
            Paint paint3 = this.A06;
            paint3.setColor(-256);
            canvas.drawRect(rectF3, paint3);
            paint3.setColor(-16711936);
            canvas.drawRect(rectF2, paint3);
            RectF rectF4 = this.A0O;
            paint3.setColor(-16711681);
            canvas.drawRect(rectF4, paint3);
            RectF rectF5 = this.A0N;
            paint3.setColor(-16776961);
            canvas.drawRect(rectF5, paint3);
        }
    }

    public final void setAlpha(int i) {
        throw new UnsupportedOperationException("Setting alpha on is not supported");
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("Setting a color filter is not supported");
    }

    private void A02(Canvas canvas, Paint paint) {
        if (paint.getColor() != 0 && paint.getAlpha() > 0) {
            canvas.drawRect(getBounds(), paint);
        }
    }

    public U19(RectF rectF, RectF rectF2, PathMotion pathMotion, View view, View view2, C297895sX r18, C297895sX r19, X1E x1e, C20974X7e x7e, C17478VXf vXf, float f, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        Paint paint = new Paint();
        this.A0H = paint;
        Paint paint2 = new Paint();
        this.A0K = paint2;
        Paint paint3 = new Paint();
        this.A0I = paint3;
        Paint paint4 = new Paint();
        this.A0J = paint4;
        this.A0B = new VZB();
        float[] fArr = new float[2];
        this.A0b = fArr;
        C297875sV r4 = new C297875sV();
        this.A0A = r4;
        Paint paint5 = new Paint();
        this.A06 = paint5;
        this.A0L = new Path();
        View view3 = view;
        this.A09 = view3;
        this.A0S = rectF;
        this.A0U = r18;
        this.A0G = f;
        this.A08 = view2;
        this.A0R = rectF2;
        this.A0T = r19;
        this.A0E = f2;
        this.A0a = z;
        this.A0Z = z2;
        this.A0V = x1e;
        this.A0W = x7e;
        this.A0X = vXf;
        this.A0Y = z3;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) view3.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.A0D = (float) displayMetrics.widthPixels;
        this.A0C = (float) displayMetrics.heightPixels;
        paint.setColor(i);
        paint2.setColor(i2);
        paint3.setColor(i3);
        r4.A0F(ColorStateList.valueOf(0));
        r4.A09();
        r4.A03 = false;
        r4.A0C(-7829368);
        RectF rectF3 = new RectF(rectF);
        this.A0P = rectF3;
        this.A0Q = new RectF(rectF3);
        RectF rectF4 = new RectF(rectF3);
        this.A0N = rectF4;
        this.A0O = new RectF(rectF4);
        PointF pointF = new PointF(rectF.centerX(), rectF.top);
        PointF pointF2 = new PointF(rectF2.centerX(), rectF2.top);
        PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(pointF.x, pointF.y, pointF2.x, pointF2.y), false);
        this.A0M = pathMeasure;
        this.A0F = pathMeasure.getLength();
        fArr[0] = rectF.centerX();
        fArr[1] = rectF.top;
        AnonymousClass7TE.A1Q(paint4);
        RectF rectF5 = W3G.A00;
        int i5 = i4;
        paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, 0.0f, i5, i5, Shader.TileMode.CLAMP));
        JTO.A1N(paint5);
        paint5.setStrokeWidth(10.0f);
        A03(this, 0.0f);
    }
}
