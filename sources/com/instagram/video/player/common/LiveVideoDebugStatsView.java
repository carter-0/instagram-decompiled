package com.instagram.video.player.common;

import X.C13988Tno;
import X.C13992Tns;
import X.C17547Va0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import java.util.Timer;

public final class LiveVideoDebugStatsView extends View {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Timer A07;
    public float A08;
    public final long A09 = 100;
    public final C17547Va0[] A0A;
    public final Paint A0B;

    public final long getPreferredTimePeriod() {
        return this.A09;
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setWillNotDraw(false);
        this.A0A = new C17547Va0[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics A0F = C13988Tno.A0F(this);
        Paint paint = new Paint();
        boolean A1D = C13992Tns.A1D(paint, A0F);
        this.A0B = paint;
        this.A08 = TypedValue.applyDimension(A1D ? 1 : 0, 16.0f, A0F);
    }

    private final void A00(Canvas canvas, float f, float f2, float f3, float f4, int i, int i2) {
        float f5 = this.A08;
        float height = ((float) getHeight()) - (2.0f * f5);
        float height2 = (((float) getHeight()) - f5) - (height * f4);
        Paint paint = this.A0B;
        paint.setColor(i2);
        paint.setAlpha(i);
        canvas.drawLine(f, (((float) getHeight()) - f5) - (f2 * height), f3, height2, paint);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0089, code lost:
        if (r0 <= 0) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r43) {
        /*
            r42 = this;
            r0 = 1593692228(0x5efdd044, float:9.1445964E18)
            int r29 = X.AnonymousClass0fD.A03(r0)
            r28 = 0
            r31 = r43
            r1 = r28
            r0 = r31
            X.0qQ.A0B(r0, r1)
            r4 = r42
            super.draw(r0)
            monitor-enter(r4)
            int r0 = r4.A00     // Catch:{ all -> 0x015c }
            r27 = r0
            int r15 = r4.A01     // Catch:{ all -> 0x015c }
            if (r15 >= r0) goto L_0x0024
            X.Va0[] r0 = r4.A0A     // Catch:{ all -> 0x015c }
            int r0 = r0.length     // Catch:{ all -> 0x015c }
            int r15 = r15 + r0
        L_0x0024:
            monitor-exit(r4)
            int r0 = r4.getWidth()
            float r0 = (float) r0
            r26 = r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r4.A08
            r25 = r0
            float r1 = r1 * r0
            float r26 = r26 - r1
            int r7 = r15 + -1
            r23 = -1
            r5 = r27
        L_0x003b:
            if (r5 >= r7) goto L_0x0054
            X.Va0[] r1 = r4.A0A
            int r0 = r1.length
            int r0 = r5 % r0
            r0 = r1[r0]
            if (r0 == 0) goto L_0x0054
            long r2 = r0.A03
            long r0 = r0.A02
            long r2 = r2 - r0
            int r0 = (r2 > r23 ? 1 : (r2 == r23 ? 0 : -1))
            if (r0 <= 0) goto L_0x0051
            r23 = r2
        L_0x0051:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0054:
            r5 = 0
            int r0 = (r23 > r5 ? 1 : (r23 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0063
            r1 = 1902306666(0x7162e56a, float:1.1235353E30)
        L_0x005d:
            r0 = r29
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0063:
            X.Va0[] r10 = r4.A0A
            int r8 = r10.length
            int r7 = r7 % r8
            r0 = r10[r7]
            r1 = 0
            if (r0 == 0) goto L_0x0072
            long r0 = r0.A01
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0072:
            int r0 = r27 % r8
            r0 = r10[r0]
            if (r0 == 0) goto L_0x008b
            long r2 = r0.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            if (r0 == 0) goto L_0x008b
            if (r1 == 0) goto L_0x008b
            long r0 = r1.longValue()
            long r0 = r0 - r2
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x008d
        L_0x008b:
            r0 = 1
        L_0x008d:
            r22 = r10[r27]
            if (r22 != 0) goto L_0x0095
            r1 = 1896146459(0x7104e61b, float:6.580832E29)
            goto L_0x005d
        L_0x0095:
            int r21 = r15 + -2
            r14 = r27
        L_0x0099:
            r2 = r21
            if (r14 >= r2) goto L_0x0157
            int r6 = r14 % r8
            float r2 = (float) r6
            float r2 = r2 * r26
            float r5 = (float) r8
            float r2 = r2 / r5
            float r32 = r25 + r2
            int r3 = r6 + 1
            int r3 = r3 % r8
            float r2 = (float) r3
            float r2 = r2 * r26
            float r2 = r2 / r5
            float r38 = r25 + r2
            int r2 = (r38 > r32 ? 1 : (r38 == r32 ? 0 : -1))
            if (r2 <= 0) goto L_0x0153
            r9 = r10[r6]
            r20 = r10[r3]
            int r2 = r14 - r27
            int r2 = r2 * 255
            r19 = r2
            int r2 = r15 - r27
            int r2 = java.lang.Math.min(r2, r8)
            int r19 = r19 / r2
            if (r9 == 0) goto L_0x0153
            if (r20 == 0) goto L_0x0153
            r2 = r27
            if (r14 == r2) goto L_0x00f3
            int r2 = r8 + r14
            int r2 = r2 + -1
            int r2 = r2 % r8
            r2 = r10[r2]
            if (r2 == 0) goto L_0x00f3
            long r5 = r9.A04
            long r2 = r2.A04
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f3
            r33 = 0
            int r2 = r4.getHeight()
            float r2 = (float) r2
            r37 = -3355444(0xffffffffffcccccc, float:NaN)
            r30 = r4
            r34 = r32
            r35 = r2
            r36 = r19
            r30.A00(r31, r32, r33, r34, r35, r36, r37)
        L_0x00f3:
            long r2 = r9.A01
            r5 = r22
            long r5 = r5.A01
            long r2 = r2 - r5
            float r7 = (float) r2
            float r11 = (float) r0
            float r7 = r7 / r11
            r2 = r20
            long r2 = r2.A01
            long r2 = r2 - r5
            float r5 = (float) r2
            float r5 = r5 / r11
            r41 = -256(0xffffffffffffff00, float:NaN)
            r34 = r4
            r35 = r31
            r37 = r7
            r39 = r5
            r40 = r19
            r36 = r32
            r34.A00(r35, r36, r37, r38, r39, r40, r41)
            long r12 = r9.A00
            long r5 = r9.A02
            long r2 = r12 - r5
            float r5 = (float) r2
            r18 = r5
            r2 = r23
            float r5 = (float) r2
            float r18 = r18 / r5
            r2 = r20
            long r6 = r2.A00
            long r2 = r2.A02
            long r16 = r6 - r2
            r2 = r16
            float r11 = (float) r2
            float r11 = r11 / r5
            r41 = -65536(0xffffffffffff0000, float:NaN)
            r37 = r18
            r39 = r11
            r34.A00(r35, r36, r37, r38, r39, r40, r41)
            long r2 = r9.A03
            long r2 = r2 - r12
            float r9 = (float) r2
            float r9 = r9 / r5
            r2 = r20
            long r2 = r2.A03
            long r2 = r2 - r6
            float r6 = (float) r2
            float r6 = r6 / r5
            r5 = 128(0x80, float:1.794E-43)
            r3 = r28
            int r41 = android.graphics.Color.rgb(r5, r3, r3)
            r37 = r9
            r39 = r6
            r34.A00(r35, r36, r37, r38, r39, r40, r41)
        L_0x0153:
            int r14 = r14 + 1
            goto L_0x0099
        L_0x0157:
            r1 = -1652112719(0xffffffff9d86c2b1, float:-3.567081E-21)
            goto L_0x005d
        L_0x015c:
            r2 = move-exception
            monitor-exit(r4)
            r1 = 896263821(0x356be68d, float:8.787982E-7)
            r0 = r29
            X.AnonymousClass0fD.A0A(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.player.common.LiveVideoDebugStatsView.draw(android.graphics.Canvas):void");
    }

    public LiveVideoDebugStatsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.A0A = new C17547Va0[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics A0F = C13988Tno.A0F(this);
        Paint paint = new Paint();
        boolean A1D = C13992Tns.A1D(paint, A0F);
        this.A0B = paint;
        this.A08 = TypedValue.applyDimension(A1D ? 1 : 0, 16.0f, A0F);
    }

    public LiveVideoDebugStatsView(Context context) {
        super(context);
        setWillNotDraw(false);
        this.A0A = new C17547Va0[100];
        this.A01 = 0;
        this.A00 = 0;
        DisplayMetrics A0F = C13988Tno.A0F(this);
        Paint paint = new Paint();
        boolean A1D = C13992Tns.A1D(paint, A0F);
        this.A0B = paint;
        this.A08 = TypedValue.applyDimension(A1D ? 1 : 0, 16.0f, A0F);
    }
}
