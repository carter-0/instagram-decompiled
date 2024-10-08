package com.instagram.ui.widget.segmentedprogressbar;

import X.0mk;
import X.0nA;
import X.0qQ;
import X.C317526nP;
import X.C71164Oed;
import X.C71382cm;
import X.C74373Ptn;
import X.W40;
import X.W4I;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import com.instagram.android.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SegmentedProgressBar extends View {
    public static final int A0V = Color.argb(0, 255, 225, 255);
    public static final int A0W = Color.argb(255, 255, 226, 164);
    public static final int[] A0X = {R.drawable.fuse_1, R.drawable.fuse_2, R.drawable.fuse_3, R.drawable.fuse_4, R.drawable.fuse_5, R.drawable.fuse_6, R.drawable.fuse_7, R.drawable.fuse_8, R.drawable.fuse_9};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public Bitmap A0B;
    public C74373Ptn A0C;
    public boolean A0D;
    public Bitmap[] A0E;
    public long A0F;
    public final float A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final ValueAnimator A0M;
    public final Paint A0N;
    public final RectF A0O;
    public final RectF A0P;
    public final SparseArray A0Q;
    public final SparseArray A0R;
    public final SparseArray A0S;
    public final boolean A0T;
    public final BitmapFactory.Options A0U;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    private final float A00(Canvas canvas, float f, float f2, boolean z) {
        int i = 0;
        do {
            Paint paint = this.A0N;
            paint.setShader((Shader) null);
            RectF rectF = this.A0P;
            rectF.set(f, f2, getEllipsisWidth() + f, this.A02 + f2);
            paint.setStyle(Paint.Style.FILL);
            if (z) {
                paint.setColor(this.A0H);
            } else {
                paint.setColor(this.A0L);
                paint.setAlpha(153);
            }
            float f3 = (float) this.A0I;
            canvas.drawRoundRect(rectF, f3, f3, paint);
            f += rectF.width() + ((float) this.A0K);
            i++;
        } while (i < 3);
        return f;
    }

    public final void A06(int i, boolean z) {
        setProgress(0.0f);
        this.A03 = Math.min(i, this.A04 - 1);
        this.A0D = z;
        A03();
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0209, code lost:
        if (r3 != false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0080, code lost:
        if (r13 > (r5.A0A + r2)) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r25) {
        /*
            r24 = this;
            r0 = 0
            r4 = r25
            X.0qQ.A0B(r4, r0)
            r5 = r24
            int r0 = r5.A04
            if (r0 == 0) goto L_0x041a
            android.animation.ValueAnimator r1 = r5.A0M
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L_0x0114
            float r7 = r1.getAnimatedFraction()
            int r1 = r5.getWidth()
            int r2 = r5.A0J
            int r0 = r2 * 2
            int r1 = r1 - r0
            float r12 = (float) r1
            int r1 = r5.A04
            int r0 = r1 + -1
            int r6 = r5.A0K
            int r0 = r0 * r6
            float r0 = (float) r0
            float r18 = r12 - r0
            float r0 = (float) r1
            float r18 = r18 / r0
            int r0 = r5.A09
            r1 = 3
            r11 = -1
            r3 = 0
            if (r0 == r11) goto L_0x0037
            r3 = 3
        L_0x0037:
            int r0 = r5.A07
            if (r0 != r11) goto L_0x003c
            r1 = 0
        L_0x003c:
            int r3 = r3 + r1
            float r17 = r5.getEllipsisWidth()
            float r10 = (float) r6
            float r17 = r17 + r10
            float r0 = r18 - r17
            float r0 = r0 * r7
            float r17 = r17 + r0
            float r18 = r18 * r7
            int r0 = r5.A04
            int r1 = r5.A0A
            int r0 = r0 - r1
            int r0 = r0 - r3
            float r0 = (float) r0
            float r0 = r0 * r18
            float r12 = r12 - r0
            float r0 = (float) r3
            float r0 = r0 * r17
            float r12 = r12 - r0
            float r0 = (float) r1
            float r12 = r12 / r0
            int r0 = r5.getHeight()
            float r9 = (float) r0
            float r8 = (float) r2
            int r0 = r5.getHeight()
            float r7 = (float) r0
            float r7 = r7 - r9
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r0
            int r6 = r5.A04
            r3 = 0
        L_0x006d:
            if (r3 >= r6) goto L_0x041a
            boolean r14 = r5.A0T
            r0 = 1
            if (r14 == 0) goto L_0x0111
            int r13 = r5.A04
            int r13 = r13 - r0
            int r13 = r13 - r3
        L_0x0078:
            int r2 = r5.A09
            if (r3 <= r2) goto L_0x0082
            int r0 = r5.A0A
            int r0 = r0 + r2
            r1 = 1
            if (r13 <= r0) goto L_0x0083
        L_0x0082:
            r1 = 0
        L_0x0083:
            if (r2 == r11) goto L_0x008b
            if (r3 > r2) goto L_0x008b
            int r0 = r2 + 3
            if (r3 > r0) goto L_0x0095
        L_0x008b:
            int r0 = r5.A06
            if (r0 == r11) goto L_0x010f
            if (r3 < r0) goto L_0x010f
            int r0 = r0 + 3
            if (r3 >= r0) goto L_0x010f
        L_0x0095:
            r0 = 1
        L_0x0096:
            if (r1 == 0) goto L_0x0108
            r16 = r12
        L_0x009a:
            android.graphics.Paint r2 = r5.A0N
            r0 = 0
            r2.setShader(r0)
            android.graphics.RectF r1 = r5.A0P
            float r15 = r8 + r16
            float r0 = r7 + r9
            r1.set(r8, r7, r15, r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r2.setStyle(r0)
            int r0 = r5.A03
            if (r13 >= r0) goto L_0x00fd
            int r0 = r5.A0H
            r2.setColor(r0)
        L_0x00b7:
            int r0 = r5.A0I
            float r15 = (float) r0
            r4.drawRoundRect(r1, r15, r15, r2)
            int r0 = r5.A0H
            r2.setColor(r0)
            int r0 = r5.A03
            if (r13 != r0) goto L_0x00e3
            if (r14 != 0) goto L_0x00e3
            float r13 = r1.left
            float r0 = r5.A01
            float r0 = r0 * r16
            float r13 = r13 + r0
            r1.right = r13
            r4.drawRoundRect(r1, r15, r15, r2)
            float r0 = r1.left
            float r0 = r0 + r16
            r1.right = r0
        L_0x00da:
            float r0 = r1.width()
            float r0 = r0 + r10
            float r8 = r8 + r0
            int r3 = r3 + 1
            goto L_0x006d
        L_0x00e3:
            if (r13 != r0) goto L_0x00da
            if (r14 == 0) goto L_0x00da
            r13 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A01
            float r13 = r13 - r0
            float r0 = r1.left
            float r13 = r13 * r16
            float r0 = r0 + r13
            r1.left = r0
            r4.drawRoundRect(r1, r15, r15, r2)
            float r0 = r1.right
            float r0 = r0 - r16
            r1.left = r0
            goto L_0x00da
        L_0x00fd:
            int r0 = r5.A0L
            r2.setColor(r0)
            r0 = 153(0x99, float:2.14E-43)
            r2.setAlpha(r0)
            goto L_0x00b7
        L_0x0108:
            r16 = r18
            if (r0 == 0) goto L_0x009a
            r16 = r17
            goto L_0x009a
        L_0x010f:
            r0 = 0
            goto L_0x0096
        L_0x0111:
            r13 = r3
            goto L_0x0078
        L_0x0114:
            android.util.SparseArray r6 = r5.A0Q
            int r2 = r6.size()
            r9 = 0
            r10 = 0
            r1 = 0
            r12 = 0
            r11 = 0
        L_0x011f:
            if (r1 >= r2) goto L_0x0144
            java.lang.Object r0 = r6.valueAt(r1)
            if (r0 == 0) goto L_0x013c
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r12 = r12 + r0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0139
            int r0 = r5.A0K
            float r0 = (float) r0
            float r12 = r12 + r0
        L_0x0136:
            int r1 = r1 + 1
            goto L_0x011f
        L_0x0139:
            int r11 = r11 + 1
            goto L_0x0136
        L_0x013c:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0144:
            boolean r3 = r5.A0T
            r2 = -1
            if (r3 == 0) goto L_0x0169
            int r0 = r5.A06
        L_0x014b:
            r8 = 0
            if (r0 == r2) goto L_0x014f
            r8 = 3
        L_0x014f:
            if (r3 == 0) goto L_0x0166
            int r0 = r5.A08
        L_0x0153:
            if (r0 == r2) goto L_0x0157
            int r8 = r8 + 3
        L_0x0157:
            r7 = 0
        L_0x0158:
            if (r9 >= r8) goto L_0x016c
            float r1 = r5.getEllipsisWidth()
            int r0 = r5.A0K
            float r0 = (float) r0
            float r1 = r1 + r0
            float r7 = r7 + r1
            int r9 = r9 + 1
            goto L_0x0158
        L_0x0166:
            int r0 = r5.A06
            goto L_0x0153
        L_0x0169:
            int r0 = r5.A08
            goto L_0x014b
        L_0x016c:
            int r0 = r5.getWidth()
            float r9 = (float) r0
            float r9 = r9 - r12
            float r9 = r9 - r7
            int r8 = r5.A0J
            int r0 = r8 * 2
            float r0 = (float) r0
            float r9 = r9 - r0
            int r7 = r5.A04
            int r0 = r6.size()
            int r7 = r7 - r0
            int r1 = r7 + -1
            int r1 = r1 - r11
            int r0 = r5.A0K
            r22 = r0
            int r1 = r1 * r0
            float r0 = (float) r1
            if (r7 == 0) goto L_0x018f
            float r9 = r9 - r0
            float r0 = (float) r7
            float r10 = r9 / r0
        L_0x018f:
            r5.A00 = r10
            float r7 = (float) r8
            int r0 = r5.getHeight()
            float r1 = (float) r0
            float r0 = r5.A02
            float r1 = r1 - r0
            r21 = 2
            r20 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r20
            r8 = 1
            if (r3 == 0) goto L_0x03e7
            int r0 = r5.A06
        L_0x01a5:
            if (r0 != r2) goto L_0x01a8
            r8 = 0
        L_0x01a8:
            r19 = 1
            if (r8 == 0) goto L_0x01b2
            r0 = r3 ^ 1
            float r7 = r5.A00(r4, r7, r1, r0)
        L_0x01b2:
            int r0 = r5.A04
            r23 = r0
            r9 = 0
        L_0x01b7:
            r0 = r23
            if (r9 >= r0) goto L_0x040d
            java.lang.Object r8 = r6.get(r9)
            java.lang.Float r8 = (java.lang.Float) r8
            if (r8 != 0) goto L_0x01c9
            float r0 = r5.A00
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
        L_0x01c9:
            r0 = 0
            boolean r0 = X.0qQ.A0I(r8, r0)
            if (r0 != 0) goto L_0x029b
            android.graphics.Paint r11 = r5.A0N
            r0 = 0
            r11.setShader(r0)
            android.graphics.RectF r10 = r5.A0P
            float r18 = r8.floatValue()
            float r8 = r18 + r7
            float r0 = r5.A02
            float r0 = r0 + r1
            r10.set(r7, r1, r8, r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.setStyle(r0)
            if (r3 == 0) goto L_0x03e4
            int r8 = r5.A04
            int r8 = r8 - r19
            int r8 = r8 - r9
        L_0x01f0:
            int r0 = r5.A03
            if (r8 >= r0) goto L_0x03c6
            int r0 = r5.A0H
            r11.setColor(r0)
        L_0x01f9:
            int r0 = r5.A0I
            float r13 = (float) r0
            r4.drawRoundRect(r10, r13, r13, r11)
            int r0 = r5.A0H
            r11.setColor(r0)
            int r14 = r5.A03
            if (r8 != r14) goto L_0x020b
            r0 = 1
            if (r3 == 0) goto L_0x020c
        L_0x020b:
            r0 = 0
        L_0x020c:
            java.lang.String r17 = "Required value was null."
            if (r0 == 0) goto L_0x033d
            float r12 = r10.left
            float r15 = r5.A00
            float r0 = r5.A01
            r16 = r0
            float r15 = r15 * r0
            float r15 = r15 + r12
            r10.right = r15
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0238
            if (r8 != r14) goto L_0x0238
            float r14 = r5.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r16
            float r0 = r0 * r18
            float r15 = r15 - r0
            float r0 = java.lang.Math.max(r12, r15)
            r10.left = r0
            android.graphics.LinearGradient r0 = r5.A01(r14)
            r11.setShader(r0)
        L_0x0238:
            r4.drawRoundRect(r10, r13, r13, r11)
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0270
            int r0 = r5.A03
            if (r8 != r0) goto L_0x0270
            float r0 = r10.left
            r5.A04(r9, r0)
            r5.A02()
            android.graphics.Bitmap[] r8 = r5.A0E
            if (r8 == 0) goto L_0x03fd
            int r0 = r5.A05
            r14 = r8[r0]
            X.0qQ.A0A(r14)
            float r13 = r10.right
            int r0 = r14.getWidth()
            int r0 = r0 / r21
            float r0 = (float) r0
            float r13 = r13 - r0
            float r8 = r10.top
            int r0 = r14.getHeight()
            int r0 = r0 / r21
            float r0 = (float) r0
            float r8 = r8 - r0
            float r0 = r5.A0G
            float r8 = r8 + r0
            r4.drawBitmap(r14, r13, r8, r11)
        L_0x0270:
            X.Ptn r11 = r5.A0C
            if (r11 == 0) goto L_0x028b
            r0 = r11
            X.PRR r0 = (X.PRR) r0
            com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer r0 = r0.A00
            X.MsG r0 = r0.A00
            if (r0 == 0) goto L_0x028b
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x028b
            float r8 = r10.right
            float r0 = r5.A00
            float r0 = r0 + r12
            r11.Eg7(r8, r12, r0)
        L_0x028b:
            r10.left = r12
            float r0 = r5.A00
            float r12 = r12 + r0
            r10.right = r12
        L_0x0292:
            float r8 = r10.width()
            r0 = r22
            float r0 = (float) r0
            float r8 = r8 + r0
            float r7 = r7 + r8
        L_0x029b:
            android.util.SparseArray r0 = r5.A0S
            java.lang.Object r10 = r0.get(r9)
            android.animation.ValueAnimator r10 = (android.animation.ValueAnimator) r10
            if (r10 == 0) goto L_0x02c0
            java.lang.Object r11 = r6.get(r9)
            java.lang.Number r11 = (java.lang.Number) r11
            float r8 = r5.A01
            r0 = 1064514355(0x3f733333, float:0.95)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x02c4
            if (r11 == 0) goto L_0x02c0
            float r8 = r11.floatValue()
            float r0 = r5.A00
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02c4
        L_0x02c0:
            int r9 = r9 + 1
            goto L_0x01b7
        L_0x02c4:
            boolean r0 = r10.isStarted()
            if (r0 != 0) goto L_0x02cd
            r10.start()
        L_0x02cd:
            java.lang.Object r8 = r10.getAnimatedValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Float"
            X.0qQ.A0C(r8, r0)
            java.lang.Number r8 = (java.lang.Number) r8
            float r13 = r8.floatValue()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r12 = r13 - r0
            java.lang.String r10 = "Required value was null."
            android.graphics.RectF r11 = r5.A0O
            android.util.SparseArray r0 = r5.A0R
            java.lang.Object r0 = r0.get(r9)
            if (r3 == 0) goto L_0x0333
            if (r0 == 0) goto L_0x03f1
            java.lang.Number r0 = (java.lang.Number) r0
            float r8 = r0.floatValue()
            float r8 = r8 - r12
        L_0x02f5:
            r11.left = r8
            android.graphics.Bitmap r0 = r5.A0B
            if (r0 == 0) goto L_0x03eb
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r0 * r13
            float r8 = r8 + r0
            r11.right = r8
            int r0 = r5.getHeight()
            float r8 = (float) r0
            android.graphics.Bitmap r0 = r5.A0B
            X.0qQ.A0A(r0)
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r13
            float r8 = r8 - r0
            float r8 = r8 / r20
            r11.top = r8
            android.graphics.Bitmap r0 = r5.A0B
            X.0qQ.A0A(r0)
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r0 * r13
            float r8 = r8 + r0
            r11.bottom = r8
            android.graphics.Bitmap r10 = r5.A0B
            X.0qQ.A0A(r10)
            r8 = 0
            android.graphics.Paint r0 = r5.A0N
            r4.drawBitmap(r10, r8, r11, r0)
            goto L_0x02c0
        L_0x0333:
            if (r0 == 0) goto L_0x03f7
            java.lang.Number r0 = (java.lang.Number) r0
            float r8 = r0.floatValue()
            float r8 = r8 + r12
            goto L_0x02f5
        L_0x033d:
            if (r8 != r14) goto L_0x0292
            if (r3 == 0) goto L_0x0292
            r16 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A01
            float r16 = r16 - r0
            float r15 = r10.left
            float r0 = r5.A00
            float r0 = r0 * r16
            float r15 = r15 + r0
            r10.left = r15
            float r12 = r10.right
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x0369
            float r14 = r5.A02
            float r16 = r16 * r18
            float r15 = r15 + r16
            float r0 = java.lang.Math.min(r12, r15)
            r10.right = r0
            android.graphics.LinearGradient r0 = r5.A01(r14)
            r11.setShader(r0)
        L_0x0369:
            r4.drawRoundRect(r10, r13, r13, r11)
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x03a1
            int r0 = r5.A03
            if (r8 != r0) goto L_0x03a1
            float r0 = r10.left
            r5.A04(r9, r0)
            r5.A02()
            android.graphics.Bitmap[] r8 = r5.A0E
            if (r8 == 0) goto L_0x0405
            int r0 = r5.A05
            r14 = r8[r0]
            X.0qQ.A0A(r14)
            float r13 = r10.left
            int r0 = r14.getWidth()
            int r0 = r0 / r21
            float r0 = (float) r0
            float r13 = r13 - r0
            float r8 = r10.top
            int r0 = r14.getHeight()
            int r0 = r0 / r21
            float r0 = (float) r0
            float r8 = r8 - r0
            float r0 = r5.A0G
            float r8 = r8 + r0
            r4.drawBitmap(r14, r13, r8, r11)
        L_0x03a1:
            X.Ptn r11 = r5.A0C
            if (r11 == 0) goto L_0x03bd
            r0 = r11
            X.PRR r0 = (X.PRR) r0
            com.instagram.ui.widget.segmentedprogressbar.ProgressAnchorContainer r0 = r0.A00
            X.MsG r0 = r0.A00
            if (r0 == 0) goto L_0x03bd
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x03bd
            float r8 = r10.left
            float r0 = r5.A00
            float r0 = r12 - r0
            r11.Eg7(r8, r0, r12)
        L_0x03bd:
            r10.right = r12
            float r0 = r5.A00
            float r12 = r12 - r0
            r10.left = r12
            goto L_0x0292
        L_0x03c6:
            int r0 = r5.A0L
            r11.setColor(r0)
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x03e1
            int r0 = r5.A03
            if (r8 != r0) goto L_0x03e1
            r12 = 1065353216(0x3f800000, float:1.0)
            float r0 = r5.A01
            float r12 = r12 - r0
            r0 = 1125711872(0x43190000, float:153.0)
            float r12 = r12 * r0
            int r0 = (int) r12
        L_0x03dc:
            r11.setAlpha(r0)
            goto L_0x01f9
        L_0x03e1:
            r0 = 153(0x99, float:2.14E-43)
            goto L_0x03dc
        L_0x03e4:
            r8 = r9
            goto L_0x01f0
        L_0x03e7:
            int r0 = r5.A08
            goto L_0x01a5
        L_0x03eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x03f1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x03f7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r10)
            throw r0
        L_0x03fd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r17
            r1.<init>(r0)
            throw r1
        L_0x0405:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r0 = r17
            r1.<init>(r0)
            throw r1
        L_0x040d:
            if (r3 == 0) goto L_0x0417
            int r0 = r5.A08
        L_0x0411:
            if (r0 == r2) goto L_0x041a
            r5.A00(r4, r7, r1, r3)
            return
        L_0x0417:
            int r0 = r5.A06
            goto L_0x0411
        L_0x041a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar.onDraw(android.graphics.Canvas):void");
    }

    public final void setCurrentSegment(int i) {
        setProgress(0.0f);
        this.A03 = Math.min(i, this.A04 - 1);
        this.A0D = false;
        A03();
        invalidate();
    }

    public final void setProgress(float f) {
        this.A01 = Math.min(Math.max(f, 0.0f), 1.0f);
        invalidate();
    }

    public final void setSegmentHeight(int i) {
        this.A02 = (float) i;
        invalidate();
    }

    private final LinearGradient A01(float f) {
        int i;
        int i2;
        RectF rectF = this.A0P;
        float f2 = rectF.left;
        float f3 = rectF.top;
        float f4 = rectF.right;
        if (this.A0T) {
            i = A0W;
            i2 = A0V;
        } else {
            i = A0V;
            i2 = A0W;
        }
        return new LinearGradient(f2, f3, f4, f, i, i2, Shader.TileMode.CLAMP);
    }

    private final void A04(int i, float f) {
        this.A0R.put(i, Float.valueOf(f));
        SparseArray sparseArray = this.A0S;
        if (sparseArray.get(i) == null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 2.0f});
            ofFloat.setDuration(1000);
            ofFloat.addListener(new W40(this, i));
            ofFloat.addUpdateListener(new C71164Oed(this));
            sparseArray.put(i, ofFloat);
        }
    }

    public final void A05(int i) {
        if (this.A0T) {
            i = (this.A04 - 1) - i;
        }
        SparseArray sparseArray = this.A0Q;
        if (sparseArray.get(i) == null) {
            float f = this.A00;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
            ofFloat.setDuration(250);
            sparseArray.put(i, Float.valueOf(f));
            ofFloat.addUpdateListener(new W4I(this, i));
            ofFloat.start();
        }
    }

    public final int getCurrentSegment() {
        return this.A03;
    }

    public final int getSegments() {
        return this.A04;
    }

    public final void setSegments(int i) {
        this.A04 = i;
        invalidate();
    }

    private final void A02() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A0F;
        if (j == -1 || currentTimeMillis - j > 30) {
            this.A05 = (this.A05 + 1) % 9;
            this.A0F = currentTimeMillis;
        }
    }

    private final void A03() {
        Resources resources = getResources();
        if (!this.A0D) {
            Bitmap[] bitmapArr = this.A0E;
            if (bitmapArr != null) {
                int length = bitmapArr.length;
                for (int i = 0; i < length; i++) {
                    Bitmap[] bitmapArr2 = this.A0E;
                    0qQ.A0A(bitmapArr2);
                    Bitmap bitmap = bitmapArr2[i];
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                }
                this.A0E = null;
            }
        } else if (this.A0E == null) {
            int[] iArr = A0X;
            this.A0E = new Bitmap[9];
            int i2 = 0;
            do {
                Bitmap[] bitmapArr3 = this.A0E;
                0qQ.A0A(bitmapArr3);
                bitmapArr3[i2] = BitmapFactory.decodeResource(resources, iArr[i2], this.A0U);
                i2++;
            } while (i2 < 9);
        }
        if (this.A0D && this.A0B == null) {
            this.A0B = BitmapFactory.decodeResource(resources, R.drawable.smoke, this.A0U);
        }
        this.A0F = -1;
        this.A05 = -1;
    }

    private final float getEllipsisWidth() {
        Context context = getContext();
        0qQ.A07(context);
        return 0nA.A04(context, 6);
    }

    public final void setEllipsisAfterIndex(int i) {
        this.A06 = i;
    }

    public final void setEllipsisBeforeIndex(int i) {
        this.A08 = i;
    }

    public final void setPositionAnchorDelegate(C74373Ptn ptn) {
        this.A0C = ptn;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A0Q = new SparseArray();
        this.A0R = new SparseArray();
        this.A0S = new SparseArray();
        this.A08 = -1;
        this.A06 = -1;
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A27, i, 0);
        0qQ.A07(obtainStyledAttributes);
        this.A0I = obtainStyledAttributes.getDimensionPixelSize(0, resources.getDimensionPixelSize(R.dimen.account_recs_header_image_margin));
        this.A0K = obtainStyledAttributes.getDimensionPixelOffset(4, resources.getDimensionPixelOffset(R.dimen.abc_control_corner_material));
        this.A02 = (float) obtainStyledAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(R.dimen.segmented_progress_bar_default_height));
        this.A0J = resources.getDimensionPixelOffset(R.dimen.abc_button_inset_vertical_material);
        this.A0H = obtainStyledAttributes.getColor(1, Color.argb(255, 255, 255, 255));
        this.A0L = obtainStyledAttributes.getColor(5, Color.argb(153, 255, 255, 255));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.A0N = paint;
        paint.setShadowLayer(resources.getDisplayMetrics().density * 1.0f, 0.0f, 0.0f, Color.argb(39, 0, 0, 0));
        this.A0P = new RectF();
        this.A0O = new RectF();
        this.A0T = 0mk.A02(context);
        BitmapFactory.Options options = new BitmapFactory.Options();
        this.A0U = options;
        options.inSampleSize = 3;
        Context context2 = getContext();
        0qQ.A07(context2);
        this.A0G = 0nA.A04(context2, 1);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
        this.A0M = duration;
        duration.addUpdateListener(new C317526nP(this));
        duration.setInterpolator(new OvershootInterpolator(1.25f));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SegmentedProgressBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
