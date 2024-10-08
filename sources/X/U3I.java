package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

public final class U3I extends View {
    public static final float[] A0C = {0.0f, 0.24f, 0.73f, 1.0f};
    public static final int[] A0D = {Color.parseColor("#FF74D7"), Color.parseColor("#015CF3"), Color.parseColor("#1D5FF0"), Color.parseColor("#08F2E0")};
    public static final int[] A0E = {Color.parseColor("#08F2E0"), Color.parseColor("#015CF3"), Color.parseColor("#FF74D7"), Color.parseColor("#1D5FF0")};
    public static final SizeF A0F;
    public static final List A0G;
    public static final float[] A0H = {0.0f, 0.92f, 0.96f, 1.0f};
    public static final int[] A0I = {Color.parseColor("#00FFFFFF"), Color.parseColor("#00FFFFFF"), Color.parseColor("#B3FFFFFF"), Color.parseColor("#FFFFFFFF")};
    public float A00 = 1.0f;
    public final Paint A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final ValueAnimator A05;
    public final ValueAnimator A06;
    public final Matrix A07 = new Matrix();
    public final Paint A08;
    public final Path A09 = new Path(VKq.A00);
    public final PointF A0A = new PointF();
    public final RectF A0B = new RectF();

    static {
        List A1P = 0sr.A1P(new C18040VkO[]{new C18040VkO(C51967G9n.A0t(new Integer[]{0, C13988Tno.A0R(), 3, 5, 7, 8, 11, 12, 14, 16, 17, 18}, 0), 50.166668f, 0.70382804f), new C18040VkO(C51967G9n.A0t(new Integer[]{3, 6, 9, 15, 19}, 0), 56.666668f, 0.5319006f), new C18040VkO(0sl.A00, 63.0f, 0.4513096f)});
        A0G = A1P;
        A0F = new SizeF((((C18040VkO) 00k.A0K(A1P)).A01.A03.getWidth() + 7.445f) * 1.03f, (((C18040VkO) 00k.A0K(A1P)).A01.A03.getHeight() + 7.445f) * 1.03f);
    }

    public U3I(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Pxi.A0v(paint, PorterDuff.Mode.SRC_ATOP);
        this.A08 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        Pxi.A0v(paint2, PorterDuff.Mode.SRC_IN);
        this.A01 = paint2;
        List list = A0G;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            JTP.A1V(arrayList, 0.5f);
        }
        this.A03 = arrayList;
        int size2 = list.size();
        ArrayList arrayList2 = new ArrayList(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            JTP.A1V(arrayList2, 0.0f);
        }
        this.A04 = arrayList2;
        int size3 = list.size();
        ArrayList arrayList3 = new ArrayList(size3);
        for (int i3 = 0; i3 < size3; i3++) {
            JTP.A1V(arrayList3, 0.0f);
        }
        this.A02 = arrayList3;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(2500);
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(2);
        ofFloat.addUpdateListener(new W4K(7, new ArgbEvaluator(), this));
        this.A05 = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 6.2831855f});
        ofFloat2.setDuration(1500);
        ofFloat2.setRepeatCount(-1);
        ofFloat2.setRepeatMode(1);
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        W4Q.A00(ofFloat2, this, 19);
        this.A06 = ofFloat2;
        ofFloat.start();
        ofFloat2.start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r34) {
        /*
            r33 = this;
            r24 = 0
            r32 = r34
            r1 = r32
            r0 = r24
            X.0qQ.A0B(r1, r0)
            r8 = r33
            super.onDraw(r1)
            java.util.List r0 = A0G
            java.util.Iterator r23 = r0.iterator()
            r10 = 0
        L_0x0017:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x02f1
            java.lang.Object r22 = r23.next()
            int r21 = r10 + 1
            if (r10 >= 0) goto L_0x002d
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002d:
            r0 = r22
            X.VkO r0 = (X.C18040VkO) r0
            r22 = r0
            java.util.List r0 = r8.A03
            float r7 = X.AnonymousClass7TG.A00(r0, r10)
            r0 = r22
            float r0 = r0.A00
            float r7 = r7 * r0
            float r0 = r8.A00
            float r7 = r7 * r0
            r0 = 1089355121(0x40ee3d71, float:7.445)
            float r7 = r7 * r0
            r2 = 19
            X.2HY r1 = new X.2HY
            r0 = r24
            r1.<init>(r0, r2)
            java.util.Iterator r20 = r1.iterator()
        L_0x0052:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x02ed
            r0 = r20
            X.0sh r0 = (X.0sh) r0
            int r18 = r0.A00()
            float r5 = r8.A00
            int r0 = r10 % 2
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            r0 = 1101004800(0x41a00000, float:20.0)
            r17 = 1101004800(0x41a00000, float:20.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 / r0
            if (r1 == 0) goto L_0x02e7
            r1 = 0
        L_0x0072:
            r0 = r18
            float r13 = (float) r0
            float r2 = r2 * r13
            float r1 = r1 + r2
            r0 = r22
            X.VkY r4 = r0.A01
            android.util.SizeF r0 = r4.A03
            r25 = r0
            float r3 = r25.getWidth()
            float r3 = r3 * r5
            float r0 = r25.getHeight()
            float r0 = r0 * r5
            android.util.SizeF r2 = new android.util.SizeF
            r2.<init>(r3, r0)
            float r12 = r4.A00
            float r0 = r12 * r5
            X.VkY r11 = new X.VkY
            r11.<init>(r2, r0)
            float r0 = r11.A02
            float r1 = r1 * r0
            android.util.SizeF r3 = r11.A04
            float r4 = r3.getWidth()
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r2
            r9 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f7
            android.util.SizeF r0 = r11.A03
            float r0 = r0.getWidth()
            float r0 = r0 / r2
        L_0x00af:
            float r0 = r0 + r1
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r0, r9)
        L_0x00b5:
            java.util.List r0 = r8.A04
            float r9 = X.AnonymousClass7TG.A00(r0, r10)
            float r0 = r8.A00
            float r12 = r12 * r0
            float r9 = r9 * r12
            r1 = 1086918619(0x40c90fdb, float:6.2831855)
            float r1 = r1 / r17
            r0 = 2
            int r0 = r10 % r0
            if (r0 != 0) goto L_0x01f1
            r0 = 0
        L_0x00ca:
            float r1 = r1 * r13
            float r0 = r0 + r1
            double r4 = (double) r0
            double r0 = java.lang.Math.sin(r4)
            float r6 = (float) r0
            float r6 = r6 * r9
            double r0 = java.lang.Math.cos(r4)
            float r2 = (float) r0
            float r0 = -r2
            float r9 = r9 * r0
            android.graphics.PointF r5 = r8.A0A
            int r0 = r8.getWidth()
            float r2 = (float) r0
            float r1 = r25.getWidth()
            float r0 = r8.A00
            float r1 = r1 * r0
            float r2 = r2 - r1
            r19 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r19
            float r2 = r2 + r6
            r5.x = r2
            int r0 = r8.getHeight()
            float r2 = (float) r0
            float r1 = r25.getHeight()
            float r0 = r8.A00
            float r1 = r1 * r0
            float r2 = r2 - r1
            float r2 = r2 / r19
            float r2 = r2 + r9
            r5.y = r2
            float r1 = r3.x
            float r0 = r3.y
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r1, r0)
            float r1 = r5.x
            float r0 = r5.y
            r4.offset(r1, r0)
            r0 = r22
            java.util.Set r1 = r0.A02
            r0 = r18
            boolean r0 = X.Pxf.A1U(r1, r0)
            if (r0 == 0) goto L_0x01e4
            android.graphics.Matrix r5 = r8.A07
            r5.reset()
            android.graphics.Path r0 = X.VKq.A00
            java.util.List r0 = r8.A02
            float r18 = X.AnonymousClass7TG.A00(r0, r10)
            android.graphics.Path r3 = r8.A09
            r0 = 1
            X.0qQ.A0B(r3, r0)
            r3.reset()
            r1 = 0
            r0 = 1112014848(0x42480000, float:50.0)
            r3.moveTo(r1, r0)
            java.util.List r17 = X.VKq.A01
            int r13 = r17.size()
            r12 = 0
        L_0x0141:
            if (r12 >= r13) goto L_0x01a1
            r0 = r17
            java.lang.Object r1 = r0.get(r12)
            X.Vkd r1 = (X.C18055Vkd) r1
            java.util.List r0 = X.VKq.A02
            java.lang.Object r15 = r0.get(r12)
            X.Vkd r15 = (X.C18055Vkd) r15
            float r14 = r1.A00
            r16 = 1065353216(0x3f800000, float:1.0)
            float r16 = r16 - r18
            float r14 = r14 * r16
            float r0 = r15.A00
            float r0 = r0 * r18
            float r14 = r14 + r0
            float r11 = r1.A03
            float r11 = r11 * r16
            float r0 = r15.A03
            float r0 = r0 * r18
            float r11 = r11 + r0
            float r9 = r1.A01
            float r9 = r9 * r16
            float r0 = r15.A01
            float r0 = r0 * r18
            float r9 = r9 + r0
            float r6 = r1.A04
            float r6 = r6 * r16
            float r0 = r15.A04
            float r0 = r0 * r18
            float r6 = r6 + r0
            float r2 = r1.A02
            float r2 = r2 * r16
            float r0 = r15.A02
            float r0 = r0 * r18
            float r2 = r2 + r0
            float r1 = r1.A05
            float r1 = r1 * r16
            float r0 = r15.A05
            float r0 = r0 * r18
            float r1 = r1 + r0
            r25 = r3
            r26 = r14
            r27 = r11
            r28 = r9
            r29 = r6
            r30 = r2
            r31 = r1
            r25.cubicTo(r26, r27, r28, r29, r30, r31)
            int r12 = r12 + 1
            goto L_0x0141
        L_0x01a1:
            r3.close()
            android.graphics.RectF r6 = r8.A0B
            r0 = r24
            r3.computeBounds(r6, r0)
            float r9 = r7 * r19
            float r0 = r6.width()
            float r2 = r9 / r0
            float r0 = r6.width()
            float r9 = r9 / r0
            float r1 = r6.centerX()
            float r0 = r6.centerY()
            r5.postScale(r2, r9, r1, r0)
            float r2 = r4.x
            float r0 = r6.width()
            float r0 = r0 / r19
            float r2 = r2 - r0
            float r1 = r4.y
            float r0 = r6.height()
            float r0 = r0 / r19
            float r1 = r1 - r0
            r5.postTranslate(r2, r1)
            r3.transform(r5)
            android.graphics.Paint r1 = r8.A01
            r0 = r32
            r0.drawPath(r3, r1)
            goto L_0x0052
        L_0x01e4:
            float r3 = r4.x
            float r2 = r4.y
            android.graphics.Paint r1 = r8.A01
            r0 = r32
            r0.drawCircle(r3, r2, r7, r1)
            goto L_0x0052
        L_0x01f1:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r1 / r0
            goto L_0x00ca
        L_0x01f7:
            float r1 = r1 - r4
            float r2 = r11.A01
            r15 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0229
            float r6 = r11.A00
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0229
            float r1 = r1 / r2
            double r4 = (double) r1
            double r4 = r4 * r15
            android.util.SizeF r0 = r11.A03
            float r9 = r0.getWidth()
            float r9 = r9 - r6
            double r2 = java.lang.Math.sin(r4)
            double r0 = (double) r6
            double r2 = r2 * r0
            float r11 = (float) r2
            float r9 = r9 + r11
            double r2 = java.lang.Math.cos(r4)
            double r2 = r2 * r0
            float r0 = (float) r2
            float r6 = r6 - r0
        L_0x0222:
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r9, r6)
            goto L_0x00b5
        L_0x0229:
            float r1 = r1 - r2
            float r0 = r3.getHeight()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x023c
            android.util.SizeF r0 = r11.A03
            float r9 = r0.getWidth()
            float r6 = r11.A00
            float r6 = r6 + r1
            goto L_0x0222
        L_0x023c:
            float r0 = r3.getHeight()
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x026a
            float r14 = r11.A00
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x026a
            float r1 = r1 / r2
            double r0 = (double) r1
            double r0 = r0 * r15
            android.util.SizeF r11 = r11.A03
            float r9 = r11.getWidth()
            float r9 = r9 - r14
            double r4 = java.lang.Math.cos(r0)
            double r2 = (double) r14
            double r4 = r4 * r2
            float r6 = (float) r4
            float r9 = r9 + r6
            float r6 = r11.getHeight()
            float r6 = r6 - r14
            double r0 = java.lang.Math.sin(r0)
        L_0x0266:
            double r0 = r0 * r2
            float r2 = (float) r0
            float r6 = r6 + r2
            goto L_0x0222
        L_0x026a:
            float r1 = r1 - r2
            float r0 = r3.getWidth()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0282
            android.util.SizeF r2 = r11.A03
            float r9 = r2.getWidth()
            float r0 = r11.A00
            float r0 = r0 + r1
            float r9 = r9 - r0
            float r6 = r2.getHeight()
            goto L_0x0222
        L_0x0282:
            float r0 = r3.getWidth()
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x02a9
            float r14 = r11.A00
            int r0 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a9
            float r1 = r1 / r2
            double r0 = (double) r1
            double r0 = r0 * r15
            double r4 = java.lang.Math.sin(r0)
            double r2 = (double) r14
            double r4 = r4 * r2
            float r6 = (float) r4
            float r9 = r14 - r6
            android.util.SizeF r4 = r11.A03
            float r6 = r4.getHeight()
            float r6 = r6 - r14
            double r0 = java.lang.Math.cos(r0)
            goto L_0x0266
        L_0x02a9:
            float r1 = r1 - r2
            float r0 = r3.getHeight()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02be
            android.util.SizeF r0 = r11.A03
            float r6 = r0.getHeight()
            float r0 = r11.A00
            float r6 = r6 - r0
            float r6 = r6 - r1
            goto L_0x0222
        L_0x02be:
            float r0 = r3.getHeight()
            float r1 = r1 - r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x02e2
            float r6 = r11.A00
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02e2
            float r1 = r1 / r2
            double r4 = (double) r1
            double r4 = r4 * r15
            double r0 = java.lang.Math.cos(r4)
            double r2 = (double) r6
            double r0 = r0 * r2
            float r9 = (float) r0
            float r9 = r6 - r9
            double r0 = java.lang.Math.sin(r4)
            double r0 = r0 * r2
            float r2 = (float) r0
            float r6 = r6 - r2
            goto L_0x0222
        L_0x02e2:
            float r1 = r1 - r2
            float r0 = r11.A00
            goto L_0x00af
        L_0x02e7:
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r2 / r0
            goto L_0x0072
        L_0x02ed:
            r10 = r21
            goto L_0x0017
        L_0x02f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U3I.onDraw(android.graphics.Canvas):void");
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(1496283814);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00 = ((float) getWidth()) / A0F.getWidth();
        float height = ((float) (getHeight() * 3)) / 4.0f;
        Paint paint = this.A01;
        int[] iArr = A0D;
        float[] fArr = A0C;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new LinearGradient(height, ((float) getHeight()) - height, ((float) getWidth()) - height, height, iArr, fArr, tileMode));
        this.A08.setShader(new RadialGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, ((float) getWidth()) / 2.0f, A0I, A0H, tileMode));
        AnonymousClass0fD.A0D(1745986600, A062);
    }
}
