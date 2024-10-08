package com.instagram.ui.widget.gradientspinner;

import X.00k;
import X.0qQ;
import X.AnonymousClass0fD;
import X.AnonymousClass3Mh;
import X.AnonymousClass3Mi;
import X.AnonymousClass3Mk;
import X.C20858X1k;
import X.C240753Mf;
import X.C240763Mg;
import X.C240773Mj;
import X.C240863Mx;
import X.C240873My;
import X.C240883Mz;
import X.C241473Pi;
import X.C267014am;
import X.C71382cm;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class GradientSpinner extends View {
    public static final C240763Mg A0c = new C240753Mf();
    public static final C240763Mg A0d = new AnonymousClass3Mh();
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public LinearGradient A09;
    public AnonymousClass3Mi A0A;
    public float[] A0B;
    public float[] A0C;
    public float[] A0D;
    public int[] A0E;
    public C240773Mj[] A0F;
    public float A0G;
    public C240763Mg A0H;
    public Integer A0I;
    public WeakReference A0J;
    public float[] A0K;
    public float[] A0L;
    public float[] A0M;
    public int[] A0N;
    public final int A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final Matrix A0S;
    public final Paint A0T;
    public final Paint A0U;
    public final Paint A0V;
    public final RectF A0W;
    public final int A0X;
    public final int A0Y;
    public final Paint A0Z;
    public final Picture A0a;
    public final AccelerateDecelerateInterpolator A0b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GradientSpinner(Context context) {
        this(context, (AttributeSet) null, R.attr.gradientSpinnerStyle);
        0qQ.A0B(context, 1);
    }

    public static final LinearGradient A00(GradientSpinner gradientSpinner, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i, int i2) {
        float[] fArr4 = fArr;
        int[] iArr2 = iArr;
        if (fArr == null || fArr2 == null || fArr3 == null) {
            return C267014am.A02(iArr, i, i2);
        }
        int measuredWidth = gradientSpinner.getMeasuredWidth();
        int measuredHeight = gradientSpinner.getMeasuredHeight();
        0qQ.A0B(iArr, 2);
        float f = (float) measuredWidth;
        float f2 = (float) measuredHeight;
        return new LinearGradient(fArr2[0] * f, fArr2[1] * f2, f * fArr3[0], f2 * fArr3[1], iArr2, fArr4, Shader.TileMode.CLAMP);
    }

    public final void A02() {
        setState(0);
    }

    public final void A05() {
        A01(1, 1.0f / ((float) this.A0A.A02));
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0P);
    }

    public final void A06() {
        A01(-1, 1.0f / ((float) this.A0A.A02));
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0P);
    }

    /* JADX WARNING: Removed duplicated region for block: B:118:0x0307  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x00fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r34) {
        /*
            r33 = this;
            r4 = 0
            r32 = r34
            r0 = r32
            X.0qQ.A0B(r0, r4)
            r0 = r33
            android.graphics.LinearGradient r1 = r0.A09
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = "GradientSpinner"
            java.lang.String r0 = "onDraw called before the gradient is initialized"
            X.0wb.A03(r1, r0)
            return
        L_0x0016:
            android.graphics.Picture r14 = r0.A0a
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            android.graphics.Canvas r21 = r14.beginRecording(r2, r1)
            X.0qQ.A07(r21)
            int r2 = r0.A04
            int r11 = r0.A0P
            r19 = 1099257348(0x41855604, float:16.667)
            if (r2 != r11) goto L_0x0196
            X.3Mi r4 = r0.A0A
            long r2 = r4.A03
            float r1 = (float) r2
            float r19 = r19 / r1
            r9 = 1174011904(0x45fa0000, float:8000.0)
            float r7 = r4.A01
        L_0x003b:
            android.graphics.LinearGradient r6 = r0.A09
            if (r6 == 0) goto L_0x02cc
            android.graphics.Matrix r5 = r0.A0S
            r6.getLocalMatrix(r5)
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r1 = r0.A07
            long r3 = r3 - r1
            float r8 = (float) r3
            float r4 = r8 / r9
            r3 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 * r3
            float r4 = r4 % r3
            r0.A01 = r4
            int r1 = r0.getWidth()
            float r2 = (float) r1
            r16 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r16
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r16
            r5.setRotate(r4, r2, r1)
            r6.setLocalMatrix(r5)
            float r8 = r8 / r7
            float r8 = r8 * r3
            float r8 = r8 % r3
            r0.A03 = r8
            android.graphics.Paint r2 = r0.getCurrentPaint()
            int r1 = r0.getCurrentPaintAlpha()
            r2.setAlpha(r1)
            android.graphics.Paint r13 = r0.A0V
            int r1 = r0.getNextPaintAlpha()
            r13.setAlpha(r1)
            X.3Mi r1 = r0.A0A
            int r10 = r1.A02
            r9 = 0
            r15 = 0
        L_0x0089:
            if (r9 >= r10) goto L_0x02c6
            X.3Mj[] r1 = r0.A0F
            r8 = r1[r9]
            int r2 = r0.A04
            if (r2 != r11) goto L_0x012a
            if (r8 == 0) goto L_0x00fc
            android.graphics.Paint r22 = r0.getCurrentPaint()
            float r7 = r0.A03
            android.graphics.RectF r6 = r0.A0W
            float r5 = r0.A00
            r31 = 1
            r1 = 5
            X.0qQ.A0B(r6, r1)
            float r2 = r8.A01
            r3 = 0
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00b0
            float r2 = r2 + r19
            r8.A01 = r2
        L_0x00b0:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x011f
            float r1 = r8.A00
            float r1 = r1 + r2
            r8.A00 = r1
            r8.A01 = r3
        L_0x00bb:
            float r2 = r8.A00
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d0
            int r1 = r8.A02
            if (r1 <= 0) goto L_0x00cb
            int r1 = r1 + -1
            r8.A02 = r1
        L_0x00cb:
            if (r1 == 0) goto L_0x011c
            float r2 = r2 % r4
        L_0x00ce:
            r8.A00 = r2
        L_0x00d0:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x0101
            r4 = 0
        L_0x00d5:
            X.3Mg r3 = r8.A06
            r26 = 1132920832(0x43870000, float:270.0)
            int r2 = r8.A04
            int r1 = r8.A03
            r23 = r13
            r24 = r6
            r25 = r5
            r27 = r7
            r28 = r4
            r29 = r2
            r30 = r1
            r20 = r3
            r20.AQw(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x00f0:
            int r1 = r8.A02
            if (r1 != 0) goto L_0x00ff
            float r2 = r8.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00ff
        L_0x00fc:
            int r9 = r9 + 1
            goto L_0x0089
        L_0x00ff:
            r15 = 1
            goto L_0x00fc
        L_0x0101:
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            float r2 = r2 * r16
            if (r1 >= 0) goto L_0x0113
            android.view.animation.Interpolator r1 = r8.A05
            float r2 = r4 - r2
            float r1 = r1.getInterpolation(r2)
            float r4 = r4 - r1
            goto L_0x00d5
        L_0x0113:
            float r2 = r2 - r4
            float r4 = r4 - r2
            android.view.animation.Interpolator r1 = r8.A05
            float r4 = r1.getInterpolation(r4)
            goto L_0x00d5
        L_0x011c:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ce
        L_0x011f:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x00bb
            float r1 = r8.A00
            float r1 = r1 + r19
            r8.A00 = r1
            goto L_0x00bb
        L_0x012a:
            int r1 = r0.A0O
            if (r2 != r1) goto L_0x0192
            if (r8 == 0) goto L_0x00fc
            android.graphics.Paint r22 = r0.getCurrentPaint()
            float r7 = r0.A03
            android.graphics.RectF r6 = r0.A0W
            float r5 = r0.A00
            r31 = 0
            r1 = 5
            X.0qQ.A0B(r6, r1)
            float r12 = r8.A01
            r3 = 0
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x014b
            float r12 = r12 + r19
            r8.A01 = r12
        L_0x014b:
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0187
            float r1 = r8.A00
            float r1 = r1 + r12
            r8.A00 = r1
            r8.A01 = r3
            r12 = 0
        L_0x0157:
            float r2 = r8.A00
            r4 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x016c
            int r1 = r8.A02
            if (r1 <= 0) goto L_0x0167
            int r1 = r1 + -1
            r8.A02 = r1
        L_0x0167:
            if (r1 == 0) goto L_0x0184
            float r2 = r2 % r4
        L_0x016a:
            r8.A00 = r2
        L_0x016c:
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 < 0) goto L_0x00f0
            r1 = 1056964608(0x3f000000, float:0.5)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            float r2 = r2 * r16
            if (r1 < 0) goto L_0x0181
            float r2 = r2 - r4
            android.view.animation.Interpolator r1 = r8.A05
            float r2 = r4 - r2
            float r2 = r1.getInterpolation(r2)
        L_0x0181:
            float r4 = r4 - r2
            goto L_0x00d5
        L_0x0184:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x016a
        L_0x0187:
            int r1 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0157
            float r1 = r8.A00
            float r1 = r1 + r19
            r8.A00 = r1
            goto L_0x0157
        L_0x0192:
            if (r8 == 0) goto L_0x00fc
            goto L_0x00f0
        L_0x0196:
            int r1 = r0.A0Y
            if (r2 != r1) goto L_0x0265
            r1 = 1157234688(0x44fa0000, float:2000.0)
            float r19 = r19 / r1
            android.graphics.LinearGradient r8 = r0.A09
            if (r8 == 0) goto L_0x02d4
            android.graphics.Matrix r7 = r0.A0S
            r8.getLocalMatrix(r7)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r1 = r0.A07
            long r5 = r5 - r1
            float r3 = (float) r5
            X.3Mi r1 = r0.A0A
            float r1 = r1.A00
            float r2 = r3 / r1
            float r10 = r0.A01
            r18 = 1135869952(0x43b40000, float:360.0)
            float r10 = r10 % r18
            float r1 = r18 - r10
            float r1 = r1 * r2
            float r10 = r10 + r1
            int r1 = r0.getWidth()
            float r2 = (float) r1
            r17 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r17
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r17
            r7.setRotate(r10, r2, r1)
            r8.setLocalMatrix(r7)
            X.3Mi r1 = r0.A0A
            float r1 = r1.A01
            float r3 = r3 / r1
            float r3 = r3 * r18
            float r3 = r3 % r18
            r0.A03 = r3
            android.graphics.Paint r2 = r0.getCurrentPaint()
            int r1 = r0.getCurrentPaintAlpha()
            r2.setAlpha(r1)
            android.graphics.Paint r9 = r0.A0V
            int r1 = r0.getNextPaintAlpha()
            r9.setAlpha(r1)
            X.3Mi r1 = r0.A0A
            int r6 = r1.A02
            r5 = 0
            r16 = 0
        L_0x01fb:
            if (r5 >= r6) goto L_0x02dc
            X.3Mj[] r1 = r0.A0F
            r3 = r1[r5]
            if (r3 == 0) goto L_0x0263
            android.graphics.Paint r22 = r0.getCurrentPaint()
            float r15 = r0.A03
            android.graphics.RectF r2 = r0.A0W
            float r13 = r0.A00
            r31 = 1
            r1 = 5
            X.0qQ.A0B(r2, r1)
            float r1 = r3.A00
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1056964608(0x3f000000, float:0.5)
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0221
            float r1 = r11 - r1
            r3.A00 = r1
        L_0x0221:
            float r1 = r1 + r19
            r3.A00 = r1
            int r12 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x022d
            r3.A00 = r11
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x022d:
            float r1 = r1 * r17
            float r1 = r1 - r11
            float r11 = r11 - r1
            android.view.animation.Interpolator r1 = r3.A05
            float r28 = r1.getInterpolation(r11)
            X.3Mg r12 = r3.A06
            r26 = 1132920832(0x43870000, float:270.0)
            int r11 = r3.A04
            int r1 = r3.A03
            r23 = r9
            r24 = r2
            r25 = r13
            r27 = r15
            r29 = r11
            r30 = r1
            r20 = r12
            r20.AQw(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            float r1 = r3.A00
            java.lang.Float r2 = java.lang.Float.valueOf(r1)
        L_0x0256:
            r1 = 1065353216(0x3f800000, float:1.0)
            boolean r1 = X.0qQ.A0I(r2, r1)
            if (r1 != 0) goto L_0x0260
            r16 = 1
        L_0x0260:
            int r5 = r5 + 1
            goto L_0x01fb
        L_0x0263:
            r2 = 0
            goto L_0x0256
        L_0x0265:
            if (r2 != r4) goto L_0x0296
            android.graphics.Paint r2 = r0.getCurrentPaint()
            int r1 = r0.getCurrentPaintAlpha()
            r2.setAlpha(r1)
            android.graphics.RectF r3 = r0.A0W
            r23 = 0
            r24 = 1135869952(0x43b40000, float:360.0)
            r22 = r3
            r25 = r4
            r26 = r2
            r21.drawArc(r22, r23, r24, r25, r26)
            android.graphics.Paint r2 = r0.A0V
            int r1 = r0.getNextPaintAlpha()
            r2.setAlpha(r1)
            int r1 = r2.getAlpha()
            if (r1 <= 0) goto L_0x02ff
            r26 = r2
        L_0x0292:
            r21.drawArc(r22, r23, r24, r25, r26)
            goto L_0x02ff
        L_0x0296:
            int r1 = r0.A0O
            if (r2 != r1) goto L_0x02a6
            r1 = 1174011904(0x45fa0000, float:8000.0)
            float r19 = r19 / r1
            r9 = 1185669120(0x46abe000, float:22000.0)
            r7 = 1181376512(0x466a6000, float:15000.0)
            goto L_0x003b
        L_0x02a6:
            int r1 = r0.A0X
            if (r2 != r1) goto L_0x02ff
            float r3 = r0.A0G
            android.graphics.RectF r2 = r0.A0W
            android.graphics.Paint r1 = r0.A0U
            r23 = 0
            r24 = 1135869952(0x43b40000, float:360.0)
            r22 = r2
            r25 = r4
            r26 = r1
            r21.drawArc(r22, r23, r24, r25, r26)
            float r24 = r24 * r3
            android.graphics.Paint r1 = r0.A0T
            r23 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r26 = r1
            goto L_0x0292
        L_0x02c6:
            if (r15 != 0) goto L_0x02fc
            r0.A08()
            goto L_0x02fc
        L_0x02cc:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02d4:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02dc:
            if (r16 != 0) goto L_0x02fc
            int r1 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r1 < 0) goto L_0x02fc
            r0.setAnimMode(r4)
            r3 = 0
            r0.A01 = r3
            int r1 = r0.getWidth()
            float r2 = (float) r1
            float r2 = r2 / r17
            int r1 = r0.getHeight()
            float r1 = (float) r1
            float r1 = r1 / r17
            r7.setRotate(r3, r2, r1)
            r8.setLocalMatrix(r7)
        L_0x02fc:
            r0.postInvalidateOnAnimation()
        L_0x02ff:
            long r5 = r0.A08
            r3 = -1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0314
            float r2 = r0.getGradientTransitionProgress()
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x031a
            r0.postInvalidateOnAnimation()
        L_0x0314:
            r0 = r32
            r0.drawPicture(r14)
            return
        L_0x031a:
            r0.A08 = r3
            int r10 = r0.getMeasuredWidth()
            int r11 = r0.getMeasuredHeight()
            int[] r4 = r0.A0E
            float[] r3 = r0.A0C
            float[] r2 = r0.A0D
            float[] r1 = r0.A0B
            r5 = r0
            r6 = r3
            r7 = r2
            r8 = r1
            r9 = r4
            android.graphics.LinearGradient r1 = A00(r5, r6, r7, r8, r9, r10, r11)
            android.graphics.Paint r0 = r0.A0T
            r0.setShader(r1)
            goto L_0x0314
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.gradientspinner.GradientSpinner.onDraw(android.graphics.Canvas):void");
    }

    public final void setGradientColors(RingSpec ringSpec) {
        0qQ.A0B(ringSpec, 0);
        if (GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT.equals(ringSpec.getName())) {
            ringSpec = (RingSpec) AnonymousClass3Mk.A0A.getValue();
        }
        this.A0N = C240863Mx.A00(ringSpec);
        0qQ.A0B(ringSpec, 0);
        this.A0L = 00k.A0w(ringSpec.BNn());
        this.A0M = C240873My.A00(ringSpec.Byj());
        this.A0K = C240873My.A00(ringSpec.B1X());
        this.A0I = null;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        LinearGradient A002 = A00(this, this.A0L, this.A0M, this.A0K, this.A0N, measuredWidth, measuredHeight);
        this.A09 = A002;
        this.A0T.setShader(A002);
        invalidate();
    }

    public final void setProgressState(C241473Pi r5) {
        0qQ.A0B(r5, 0);
        this.A0F = r5.A03;
        this.A07 = SystemClock.elapsedRealtime() - r5.A02;
        this.A04 = r5.A00;
        this.A06 = r5.A01;
        invalidate();
    }

    public final void setSpinnerType(int i) {
        C240763Mg r0;
        if (i != 1) {
            if (i == 2) {
                this.A0A = AnonymousClass3Mi.A06;
                r0 = A0d;
            }
            this.A0F = new C240773Mj[this.A0A.A02];
            invalidate();
        }
        this.A0A = AnonymousClass3Mi.A05;
        r0 = A0c;
        this.A0H = r0;
        this.A0F = new C240773Mj[this.A0A.A02];
        invalidate();
    }

    private final void A01(int i, float f) {
        int i2 = this.A0A.A02;
        while (true) {
            i2--;
            if (i2 >= 0) {
                float interpolation = this.A0A.A04.getInterpolation(((float) i2) * f);
                C240773Mj[] r1 = this.A0F;
                float f2 = -interpolation;
                AnonymousClass3Mi r0 = this.A0A;
                r1[i2] = new C240773Mj(r0.A04, this.A0H, f2, i2, i, r0.A02);
            } else {
                return;
            }
        }
    }

    private final Paint getCurrentPaint() {
        boolean z;
        Paint paint;
        float f;
        int i = this.A06;
        if (i == this.A0R) {
            z = true;
            paint = this.A0U;
        } else {
            z = false;
            if (i == this.A0Q) {
                paint = this.A0Z;
            } else {
                paint = this.A0T;
            }
        }
        if (this.A04 != 0 || !z) {
            f = this.A00;
        } else {
            f = this.A02;
        }
        paint.setStrokeWidth(f);
        return paint;
    }

    private final int getCurrentPaintAlpha() {
        int i = this.A05;
        if (i != -1) {
            return i;
        }
        if (this.A08 != -1) {
            return Math.round((1.0f - getGradientTransitionProgress()) * 255.0f);
        }
        return 255;
    }

    private final int getGradientColorRes() {
        Integer num = this.A0I;
        if (num != null) {
            return num.intValue();
        }
        return R.style.GradientPatternStyle;
    }

    private final float getGradientTransitionProgress() {
        long j = this.A08;
        boolean z = false;
        if (j != -1) {
            z = true;
        }
        if (!z) {
            return 0.0f;
        }
        return this.A0b.getInterpolation(Math.max(Math.min(((float) (SystemClock.elapsedRealtime() - j)) / 500.0f, 1.0f), 0.0f));
    }

    private final int getNextPaintAlpha() {
        if (this.A08 != -1) {
            return Math.round(getGradientTransitionProgress() * 255.0f);
        }
        return 0;
    }

    private final void setAnimMode(int i) {
        if (this.A04 != i) {
            this.A04 = i;
            invalidate();
        }
    }

    private final void setState(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            invalidate();
        }
    }

    public final void A03() {
        setState(this.A0Q);
    }

    public final void A04() {
        setState(this.A0R);
    }

    public final void A07() {
        A01(-1, 0.5f / ((float) this.A0A.A02));
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0O);
    }

    public final void A08() {
        int i;
        int i2 = this.A04;
        if (i2 != 0 && i2 != (i = this.A0Y)) {
            this.A07 = SystemClock.elapsedRealtime();
            setAnimMode(i);
        }
    }

    public final float getActiveStrokeWidth() {
        return this.A00;
    }

    public final float getInactiveStrokeWidth() {
        return this.A02;
    }

    public final C241473Pi getProgressState() {
        return new C241473Pi(this.A0F, this.A04, this.A06, this.A07);
    }

    public final void setActiveStrokeWidth(float f) {
        this.A00 = f;
        invalidate();
    }

    public final void setErrorColour(int i) {
        this.A0Z.setShader(C240883Mz.A00(i));
        if (this.A06 == this.A0Q) {
            invalidate();
        }
    }

    public final void setInactiveColour(int i) {
        this.A0U.setShader(C240883Mz.A00(i));
        if (this.A06 == this.A0R) {
            invalidate();
        }
    }

    public final void setInactiveStrokeWidth(float f) {
        this.A02 = f;
        invalidate();
    }

    public final void setInvalidateListener(C20858X1k x1k) {
        WeakReference weakReference;
        if (x1k == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(x1k);
        }
        this.A0J = weakReference;
    }

    public final void setProgress(float f) {
        this.A0G = f;
        invalidate();
    }

    public final void A09(float f) {
        setProgress(f);
        A01(-1, 0.5f / ((float) this.A0A.A02));
        this.A07 = SystemClock.elapsedRealtime();
        setAnimMode(this.A0X);
        this.A0G = f;
    }

    public final void invalidate() {
        C20858X1k x1k;
        int A032 = AnonymousClass0fD.A03(-1684837458);
        super.invalidate();
        WeakReference weakReference = this.A0J;
        if (!(weakReference == null || (x1k = (C20858X1k) weakReference.get()) == null)) {
            ((Drawable) x1k).invalidateSelf();
        }
        AnonymousClass0fD.A0A(82444027, A032);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (!(mode == Integer.MIN_VALUE || mode == 1073741824) || size >= size2) {
            size = size2;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, SN3.MAX_SIGNED_POWER_OF_TWO);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        LinearGradient A002 = A00(this, this.A0L, this.A0M, this.A0K, this.A0N, measuredWidth, measuredHeight);
        this.A09 = A002;
        this.A0T.setShader(A002);
        float max = Math.max(this.A00, this.A02) / 2.0f;
        this.A0W.set(((float) getPaddingLeft()) + max, ((float) getPaddingTop()) + max, ((float) (measuredWidth - getPaddingRight())) - max, ((float) (measuredHeight - getPaddingBottom())) - max);
    }

    public final void postInvalidateOnAnimation() {
        C20858X1k x1k;
        super.postInvalidateOnAnimation();
        WeakReference weakReference = this.A0J;
        if (weakReference != null && (x1k = (C20858X1k) weakReference.get()) != null) {
            ((Drawable) x1k).invalidateSelf();
        }
    }

    public final void setOverrideDrawingAlpha(int i) {
        this.A05 = i;
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GradientSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0P = 1;
        this.A0Y = 2;
        this.A0O = 3;
        this.A0X = 4;
        this.A0R = 1;
        this.A0Q = 2;
        this.A0a = new Picture();
        this.A0S = new Matrix();
        this.A0E = new int[5];
        this.A0b = new AccelerateDecelerateInterpolator();
        this.A0A = AnonymousClass3Mi.A05;
        this.A0H = A0c;
        this.A0F = new C240773Mj[30];
        this.A04 = 0;
        this.A06 = 0;
        this.A08 = -1;
        this.A05 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A0v, i, 2132017755);
        0qQ.A07(obtainStyledAttributes);
        try {
            this.A00 = obtainStyledAttributes.getDimension(0, 4.0f);
            this.A02 = obtainStyledAttributes.getDimension(4, 4.0f);
            this.A0I = Integer.valueOf(obtainStyledAttributes.getResourceId(2, R.style.GradientPatternStyle));
            int color = obtainStyledAttributes.getColor(3, -16777216);
            int color2 = obtainStyledAttributes.getColor(1, -65536);
            obtainStyledAttributes.recycle();
            Integer num = this.A0I;
            if (num != null) {
                if (num.intValue() == R.style.GradientPatternStyle) {
                    RingSpec ringSpec = (RingSpec) AnonymousClass3Mk.A0A.getValue();
                    this.A0N = C240863Mx.A00(ringSpec);
                    0qQ.A0B(ringSpec, 0);
                    this.A0L = 00k.A0w(ringSpec.BNn());
                    this.A0M = C240873My.A00(ringSpec.Byj());
                    this.A0K = C240873My.A00(ringSpec.B1X());
                    this.A0I = null;
                } else {
                    this.A0N = new int[5];
                    Context context2 = getContext();
                    0qQ.A07(context2);
                    C267014am.A03(context2, attributeSet, this.A0N, getGradientColorRes());
                }
                Paint paint = new Paint(1);
                this.A0T = paint;
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.A00);
                paint.setStrokeCap(Paint.Cap.ROUND);
                Paint paint2 = new Paint(paint);
                this.A0U = paint2;
                setInactiveColour(color);
                paint2.setStrokeWidth(this.A02);
                Paint paint3 = new Paint(paint2);
                this.A0Z = paint3;
                paint3.setShader(C240883Mz.A00(color2));
                this.A0V = new Paint(paint);
                this.A0W = new RectF();
                return;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void setGradientColors(int i) {
        if (i == R.style.GradientPatternStyle) {
            setGradientColors((RingSpec) AnonymousClass3Mk.A0A.getValue());
            return;
        }
        Integer num = this.A0I;
        if (num == null || num.intValue() != i) {
            this.A0I = Integer.valueOf(i);
            this.A0N = new int[5];
            Context context = getContext();
            0qQ.A07(context);
            C267014am.A03(context, (AttributeSet) null, this.A0N, getGradientColorRes());
            this.A0L = null;
            this.A0M = null;
            this.A0K = null;
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            LinearGradient A002 = A00(this, this.A0L, this.A0M, this.A0K, this.A0N, measuredWidth, measuredHeight);
            this.A09 = A002;
            this.A0T.setShader(A002);
            invalidate();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GradientSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.gradientSpinnerStyle);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GradientSpinner(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.gradientSpinnerStyle : i);
    }
}
