package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* renamed from: X.5iW  reason: invalid class name and case insensitive filesystem */
public final class C292175iW extends ReplacementSpan {
    public int A00;
    public boolean A01;
    public int A02;
    public Paint.FontMetricsInt A03;
    public final int A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final int A08;
    public final int A09;

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bb, code lost:
        if ((r2 + A00()) > r11.descent) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cc, code lost:
        r11.ascent = r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getSize(android.graphics.Paint r7, java.lang.CharSequence r8, int r9, int r10, android.graphics.Paint.FontMetricsInt r11) {
        /*
            r6 = this;
            r4 = 1
            r6.A01 = r4
            float r5 = r7.getTextSize()
            android.graphics.Paint$FontMetricsInt r0 = r7.getFontMetricsInt()
            r6.A03 = r0
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r1 = r0.descent
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r0 = r0.ascent
            if (r1 <= r0) goto L_0x00f1
            int r0 = r6.A09
            java.lang.String r3 = "Unsupported unit."
            if (r0 == 0) goto L_0x00d6
            if (r0 != r4) goto L_0x00eb
            float r1 = r6.A07
            float r1 = r1 * r5
        L_0x0026:
            double r0 = (double) r1
            double r1 = java.lang.Math.ceil(r0)
            float r0 = (float) r1
            int r0 = (int) r0
            r6.A00 = r0
            int r0 = r6.A08
            if (r0 == 0) goto L_0x00cf
            if (r0 != r4) goto L_0x00e5
            float r1 = r6.A05
            float r1 = r1 * r5
        L_0x0038:
            double r0 = (double) r1
            double r1 = java.lang.Math.ceil(r0)
            float r0 = (float) r1
            int r0 = (int) r0
            r6.A02 = r0
            if (r11 == 0) goto L_0x0098
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r0 = r0.ascent
            r11.ascent = r0
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r0 = r0.descent
            r11.descent = r0
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r0 = r0.leading
            r11.leading = r0
            int r0 = r6.A04
            switch(r0) {
                case 0: goto L_0x00be;
                case 1: goto L_0x00b1;
                case 2: goto L_0x009f;
                case 3: goto L_0x0060;
                case 4: goto L_0x00b1;
                case 5: goto L_0x009f;
                default: goto L_0x0060;
            }
        L_0x0060:
            int r1 = r11.descent
            int r2 = r11.ascent
            int r1 = r1 - r2
            int r0 = r6.A00()
            if (r1 >= r0) goto L_0x007c
            int r0 = r6.A00()
            int r0 = r0 - r1
            int r0 = r0 / 2
            int r2 = r2 - r0
            r11.ascent = r2
        L_0x0075:
            int r0 = r6.A00()
            int r2 = r2 + r0
            r11.descent = r2
        L_0x007c:
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r1 = r0.top
            int r0 = r11.ascent
            int r0 = java.lang.Math.min(r1, r0)
            r11.top = r0
            android.graphics.Paint$FontMetricsInt r0 = r6.A01()
            int r1 = r0.bottom
            int r0 = r11.descent
            int r0 = java.lang.Math.max(r1, r0)
            r11.bottom = r0
        L_0x0098:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x00dd
            int r0 = r6.A00
            return r0
        L_0x009f:
            int r2 = r11.ascent
            int r1 = r11.descent
            int r0 = r6.A00()
            int r0 = r1 - r0
            if (r2 <= r0) goto L_0x007c
            int r0 = r6.A00()
            int r1 = r1 - r0
            goto L_0x00cc
        L_0x00b1:
            int r2 = r11.ascent
            int r0 = r6.A00()
            int r1 = r2 + r0
            int r0 = r11.descent
            if (r1 <= r0) goto L_0x007c
            goto L_0x0075
        L_0x00be:
            int r1 = r11.ascent
            int r0 = r6.A00()
            int r0 = -r0
            if (r1 <= r0) goto L_0x007c
            int r0 = r6.A00()
            int r1 = -r0
        L_0x00cc:
            r11.ascent = r1
            goto L_0x007c
        L_0x00cf:
            float r1 = r6.A05
            float r0 = r6.A06
            float r1 = r1 * r0
            goto L_0x0038
        L_0x00d6:
            float r1 = r6.A07
            float r0 = r6.A06
            float r1 = r1 * r0
            goto L_0x0026
        L_0x00dd:
            java.lang.String r1 = "PlaceholderSpan is not laid out yet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00e5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        L_0x00f1:
            java.lang.String r1 = "Invalid fontMetrics: line height can not be negative."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C292175iW.getSize(android.graphics.Paint, java.lang.CharSequence, int, int, android.graphics.Paint$FontMetricsInt):int");
    }

    public final int A00() {
        if (this.A01) {
            return this.A02;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    public final Paint.FontMetricsInt A01() {
        Paint.FontMetricsInt fontMetricsInt = this.A03;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        0qQ.A0F("fontMetrics");
        throw AnonymousClass00P.createAndThrow();
    }

    public C292175iW(float f, float f2, float f3, int i, int i2, int i3) {
        this.A07 = f;
        this.A09 = i;
        this.A05 = f2;
        this.A08 = i2;
        this.A06 = f3;
        this.A04 = i3;
    }
}
