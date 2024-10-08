package com.instagram.ui.widget.flyingreactionview;

import X.0qQ;
import X.C17602Vau;
import X.C3020561i;
import X.JTT;
import X.VXE;
import X.WC2;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class FlyingReactionView extends View {
    public static final OvershootInterpolator A06 = new OvershootInterpolator(2.0f);
    public static final C3020561i A07 = new C3020561i();
    public VXE A00;
    public C17602Vau A01;
    public boolean A02;
    public final float A03;
    public final Matrix A04;
    public final Paint A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlyingReactionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A05 = new Paint(1);
        this.A04 = new Matrix();
        this.A03 = (float) context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
        setOnTouchListener(WC2.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r38) {
        /*
            r37 = this;
            r2 = 0
            r12 = r38
            X.0qQ.A0B(r12, r2)
            r7 = r37
            boolean r0 = r7.A02
            if (r0 == 0) goto L_0x00c9
            X.Vau r0 = r7.A01
            if (r0 == 0) goto L_0x019d
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r5 = r0.A00
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0164
            float r2 = (float) r3
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r1
            android.graphics.Paint r10 = r7.A05
            android.graphics.Matrix r8 = r7.A04
            android.graphics.Bitmap r11 = r0.A03
            double r3 = (double) r2
            r25 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r1 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r1 >= 0) goto L_0x013c
            android.graphics.Point r1 = r0.A05
            int r2 = r1.x
            float r9 = (float) r2
        L_0x0036:
            float r2 = r7.A03
            r13 = r3
            r23 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r5 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r5 >= 0) goto L_0x0101
            r15 = 0
            r17 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r0 = r1.y
            double r5 = (double) r0
            float r0 = (float) r0
            float r0 = r0 - r2
            double r0 = (double) r0
        L_0x004f:
            r19 = r5
            r21 = r0
            double r5 = X.AnonymousClass37Q.A04(r13, r15, r17, r19, r21)
            float r1 = (float) r5
        L_0x0058:
            int r0 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x00da
            r15 = 0
            r17 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r21 = 4611686018427387904(0x4000000000000000, double:2.0)
        L_0x0067:
            r13 = r3
            double r5 = X.AnonymousClass37Q.A04(r13, r15, r17, r19, r21)
            float r0 = (float) r5
        L_0x006d:
            r15 = 4606732058837280358(0x3fee666666666666, double:0.95)
            int r2 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ca
            r2 = 255(0xff, float:3.57E-43)
        L_0x0078:
            r5 = 0
            r15 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r6 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r6 < 0) goto L_0x009f
            r17 = 4599976659396224614(0x3fd6666666666666, double:0.35)
            int r6 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r6 >= 0) goto L_0x009f
            r19 = 0
            r21 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r13 = r3
            double r13 = X.AnonymousClass37Q.A04(r13, r15, r17, r19, r21)
            r5 = 4613937818241073152(0x4008000000000000, double:3.0)
            r3 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r13 = r13 * r3
            double r3 = java.lang.Math.sin(r13)
            double r3 = r3 * r5
            float r5 = (float) r3
        L_0x009f:
            r8.reset()
            r8.postScale(r0, r0)
            int r3 = r11.getWidth()
            float r13 = (float) r3
            float r13 = r13 * r0
            r6 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r6
            int r3 = r11.getHeight()
            float r4 = (float) r3
            float r4 = r4 * r0
            float r4 = r4 / r6
            float r3 = -r13
            float r0 = -r4
            r8.postTranslate(r3, r0)
            r8.postRotate(r5)
            r8.postTranslate(r9, r1)
            r10.setAlpha(r2)
            r12.drawBitmap(r11, r8, r10)
            r7.postInvalidateOnAnimation()
        L_0x00c9:
            return
        L_0x00ca:
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 4643176031446892544(0x406fe00000000000, double:255.0)
            r21 = 4636737291354636288(0x4059000000000000, double:100.0)
            r13 = r3
            double r5 = X.AnonymousClass37Q.A04(r13, r15, r17, r19, r21)
            int r2 = (int) r5
            goto L_0x0078
        L_0x00da:
            r15 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x00f9
            r27 = 0
            r29 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r21 = r3
            double r5 = X.AnonymousClass37Q.A04(r21, r23, r25, r27, r29)
            float r13 = (float) r5
            r2 = 1073741824(0x40000000, float:2.0)
            android.view.animation.OvershootInterpolator r0 = A06
            float r0 = r0.getInterpolation(r13)
            float r0 = r0 + r2
            goto L_0x006d
        L_0x00f9:
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 4613937818241073152(0x4008000000000000, double:3.0)
            r21 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x0067
        L_0x0101:
            int r5 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r5 >= 0) goto L_0x010b
            int r0 = r1.y
            float r1 = (float) r0
            float r1 = r1 - r2
            goto L_0x0058
        L_0x010b:
            X.61i r5 = A07
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r33 = 0
            r27 = r3
            r29 = r25
            r31 = r17
            r35 = r17
            double r1 = X.AnonymousClass37Q.A04(r27, r29, r31, r33, r35)
            float r6 = (float) r1
            float r1 = r5.getInterpolation(r6)
            r13 = 4616637984853807812(0x401197c987c952c4, double:4.39822971502571)
            double r1 = (double) r1
            r5 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r1 = r1 + r5
            double r1 = r1 * r13
            double r1 = java.lang.Math.sin(r1)
            double r13 = -r1
            r15 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r5 = r0.A01
            double r0 = r0.A02
            goto L_0x004f
        L_0x013c:
            X.61i r5 = A07
            r17 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 0
            r13 = r3
            r15 = r25
            r21 = r17
            double r1 = X.AnonymousClass37Q.A04(r13, r15, r17, r19, r21)
            float r6 = (float) r1
            float r1 = r5.getInterpolation(r6)
            double r13 = (double) r1
            android.graphics.Point r1 = r0.A05
            int r2 = r1.x
            double r15 = (double) r2
            android.graphics.Point r2 = r0.A04
            int r2 = r2.x
            double r5 = (double) r2
            r17 = r5
            double r5 = X.AnonymousClass37Q.A03(r13, r15, r17)
            float r9 = (float) r5
            goto L_0x0036
        L_0x0164:
            r0 = 8
            r7.setVisibility(r0)
            r6 = 0
            r7.A01 = r6
            r7.A02 = r2
            X.VXE r5 = r7.A00
            if (r5 == 0) goto L_0x019a
            android.view.View r0 = r5.A00
            r4 = 1
            r0.performHapticFeedback(r4)
            android.view.View r0 = r5.A01
            X.5nL r3 = X.C294975nL.A01(r0, r2)
            r3.A0G()
            r2 = 1061997773(0x3f4ccccd, float:0.8)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.A0U(r2, r1, r0)
            r3.A0V(r2, r1, r0)
            X.5nL r0 = r3.A0F(r4)
            r0.A0H()
            X.4mU r0 = r5.A02
            r0.EHd()
        L_0x019a:
            r7.A00 = r6
            return
        L_0x019d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.flyingreactionview.FlyingReactionView.onDraw(android.graphics.Canvas):void");
    }

    public final void setAnimating(boolean z) {
        this.A02 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FlyingReactionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FlyingReactionView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ FlyingReactionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }
}
