package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

/* renamed from: X.Tvr  reason: case insensitive filesystem */
public final class C14422Tvr extends AnonymousClass3O7 {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public C14411Tvf A09 = C14411Tvf.ONE_BY_ONE;
    public final float A0A;
    public final Paint A0B;
    public final RectF A0C;

    public C14422Tvr(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        this.A0B = paint;
        this.A0C = new RectF();
        this.A0A = (float) C13989Tnp.A0B(context);
        AnonymousClass7TE.A1N(context, paint, 2Yu.A04(context));
    }

    private final void A02(Canvas canvas) {
        float f = 0.0f;
        int i = 0;
        do {
            A04(canvas, f);
            f += this.A02 + this.A0A;
            i++;
        } while (i < 3);
        A00();
    }

    private final void setSquareSizes(int i) {
        float f = (float) i;
        float f2 = this.A0A;
        float f3 = (f - (f2 * 2.0f)) / 3.0f;
        this.A02 = f3;
        this.A01 = f3;
        this.A00 = 1.7777778f * f3;
        this.A06 = (2.0f * f3) + f2;
        this.A04 = f3;
        this.A03 = (4.0f * f3) / 3.0f;
        this.A08 = f - f2;
        this.A07 = f3 * 3.5f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (r5 >= 4) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r1 = r8.A01;
        r4 = r8.A0A;
        r6 = ((float) r7) * (r1 + r4);
        r3 = r8.A05;
        r1 = r8.A0C;
        r1.set(r6, r3, r6 + r1, r8.A00 + r3);
        r9.drawRect(r1, r8.A0B);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        if (r7 < 3) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r8.A05 += r8.A00 + r4;
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b6, code lost:
        A05(r9, 0.0f);
        r0 = r8.A02;
        r1 = r8.A0A;
        A06(r9, r0 + r1);
        A06(r9, r8.A02 + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00cc, code lost:
        if (r5 >= 6) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ce, code lost:
        A02(r9);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        A02(r9);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f9, code lost:
        r3 = r8.A05;
        r0 = r8.A06;
        r1 = r8.A0C;
        r1.set(0.0f, r3, 0.0f + r0, r0 + r3);
        r9.drawRect(r1, r8.A0B);
        r1 = r8.A06 + r8.A0A;
        A04(r9, r1);
        A00();
        A04(r9, r1);
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x011b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0122, code lost:
        A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        if (r5 >= 6) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        if (r5 >= 6) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        r7 = 0.0f;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        r4 = r8.A05;
        r1 = r8.A0C;
        r1.set(r7, r4, r7 + r8.A04, r8.A03 + r4);
        r9.drawRect(r1, r8.A0B);
        r0 = r8.A04;
        r2 = r8.A0A;
        r7 = r7 + (r0 + r2);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r6 < 3) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        r8.A05 += r8.A03 + r2;
        r5 = r5 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDraw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r9, r0)
            r4 = 0
            r8.A05 = r4
            int r0 = r8.getWidth()
            r8.setSquareSizes(r0)
            X.Tvf r0 = r8.A09
            int r0 = r0.ordinal()
            r3 = 6
            r5 = 0
            switch(r0) {
                case 0: goto L_0x00ce;
                case 1: goto L_0x00f0;
                case 2: goto L_0x011c;
                case 3: goto L_0x009f;
                case 4: goto L_0x0051;
                case 5: goto L_0x0023;
                case 6: goto L_0x0122;
                case 7: goto L_0x00b6;
                case 8: goto L_0x008d;
                case 9: goto L_0x007b;
                case 10: goto L_0x00d4;
                case 11: goto L_0x00ec;
                case 12: goto L_0x00f9;
                case 13: goto L_0x00c8;
                default: goto L_0x0019;
            }
        L_0x0019:
            r8.A02(r9)
            int r5 = r5 + 1
            if (r5 >= r3) goto L_0x00eb
            goto L_0x0019
        L_0x0021:
            if (r5 >= r3) goto L_0x00eb
        L_0x0023:
            r7 = 0
            r6 = 0
        L_0x0025:
            float r4 = r8.A05
            float r0 = r8.A04
            float r2 = r7 + r0
            float r0 = r8.A03
            float r0 = r0 + r4
            android.graphics.RectF r1 = r8.A0C
            r1.set(r7, r4, r2, r0)
            android.graphics.Paint r0 = r8.A0B
            r9.drawRect(r1, r0)
            float r0 = r8.A04
            float r2 = r8.A0A
            float r0 = r0 + r2
            float r7 = r7 + r0
            int r6 = r6 + 1
            r0 = 3
            if (r6 < r0) goto L_0x0025
            float r1 = r8.A05
            float r0 = r8.A03
            float r0 = r0 + r2
            float r1 = r1 + r0
            r8.A05 = r1
            int r5 = r5 + 1
            goto L_0x0021
        L_0x004e:
            r0 = 4
            if (r5 >= r0) goto L_0x00eb
        L_0x0051:
            r7 = 0
        L_0x0052:
            float r6 = (float) r7
            float r1 = r8.A01
            float r4 = r8.A0A
            float r0 = r1 + r4
            float r6 = r6 * r0
            float r3 = r8.A05
            float r2 = r6 + r1
            float r0 = r8.A00
            float r0 = r0 + r3
            android.graphics.RectF r1 = r8.A0C
            r1.set(r6, r3, r2, r0)
            android.graphics.Paint r0 = r8.A0B
            r9.drawRect(r1, r0)
            int r7 = r7 + 1
            r0 = 3
            if (r7 < r0) goto L_0x0052
            float r1 = r8.A05
            float r0 = r8.A00
            float r0 = r0 + r4
            float r1 = r1 + r0
            r8.A05 = r1
            int r5 = r5 + 1
            goto L_0x004e
        L_0x007b:
            float r1 = r8.A02
            float r0 = r8.A0A
            float r1 = r1 + r0
            r8.A05(r9, r4)
            r8.A05(r9, r1)
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r0
            r8.A05(r9, r1)
            return
        L_0x008d:
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r8.A02
            float r0 = r8.A0A
            float r1 = r1 + r0
            float r2 = r2 * r1
            r8.A05(r9, r2)
            r8.A06(r9, r4)
            r8.A06(r9, r4)
            return
        L_0x009f:
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r8.A02
            float r0 = r8.A0A
            float r1 = r1 + r0
            float r2 = r2 * r1
            r8.A05(r9, r2)
            r8.A06(r9, r4)
            r8.A06(r9, r4)
            r8.A02(r9)
            r8.A02(r9)
        L_0x00b6:
            r8.A05(r9, r4)
            float r0 = r8.A02
            float r1 = r8.A0A
            float r0 = r0 + r1
            r8.A06(r9, r0)
            float r0 = r8.A02
            float r0 = r0 + r1
            r8.A06(r9, r0)
            return
        L_0x00c8:
            r8.A03(r9)
            return
        L_0x00cc:
            if (r5 >= r3) goto L_0x00eb
        L_0x00ce:
            r8.A02(r9)
            int r5 = r5 + 1
            goto L_0x00cc
        L_0x00d4:
            float r1 = r8.A02
            float r0 = r8.A0A
            float r1 = r1 + r0
            r8.A05(r9, r4)
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r1
            r8.A05(r9, r0)
            r8.A04(r9, r1)
            r8.A00()
            r8.A04(r9, r1)
        L_0x00eb:
            return
        L_0x00ec:
            r8.A01(r9)
            return
        L_0x00f0:
            r8.A01(r9)
            r8.A02(r9)
            r8.A02(r9)
        L_0x00f9:
            float r3 = r8.A05
            float r0 = r8.A06
            float r2 = r4 + r0
            float r0 = r0 + r3
            android.graphics.RectF r1 = r8.A0C
            r1.set(r4, r3, r2, r0)
            android.graphics.Paint r0 = r8.A0B
            r9.drawRect(r1, r0)
            float r1 = r8.A06
            float r0 = r8.A0A
            float r1 = r1 + r0
            r8.A04(r9, r1)
            r8.A00()
            r8.A04(r9, r1)
            r8.A00()
            return
        L_0x011c:
            r8.A03(r9)
            r8.A02(r9)
        L_0x0122:
            r8.A02(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14422Tvr.onDraw(android.graphics.Canvas):void");
    }

    public final void setLayoutType(C14411Tvf tvf) {
        0qQ.A0B(tvf, 0);
        this.A09 = tvf;
        invalidate();
        requestLayout();
    }

    private final void A00() {
        this.A05 += this.A02 + this.A0A;
    }

    private final void A01(Canvas canvas) {
        float f = this.A02 + this.A0A;
        float f2 = this.A05;
        float f3 = this.A06;
        RectF rectF = this.A0C;
        rectF.set(f, f2, f + f3, f3 + f2);
        canvas.drawRect(rectF, this.A0B);
        A04(canvas, 0.0f);
        A00();
        A04(canvas, 0.0f);
        A00();
    }

    private final void A03(Canvas canvas) {
        float f = this.A05;
        RectF rectF = this.A0C;
        rectF.set(0.0f, f, this.A08, f + this.A07);
        canvas.drawRect(rectF, this.A0B);
        this.A05 += this.A07 + this.A0A;
    }

    private final void A04(Canvas canvas, float f) {
        float f2 = this.A05;
        float f3 = this.A02;
        RectF rectF = this.A0C;
        rectF.set(f, f2, f + f3, f3 + f2);
        canvas.drawRect(rectF, this.A0B);
    }

    private final void A05(Canvas canvas, float f) {
        float f2 = this.A05;
        RectF rectF = this.A0C;
        rectF.set(f, f2, f + this.A02, this.A06 + f2);
        canvas.drawRect(rectF, this.A0B);
    }

    private final void A06(Canvas canvas, float f) {
        A04(canvas, f);
        A04(canvas, f + this.A02 + this.A0A);
        A00();
    }
}
