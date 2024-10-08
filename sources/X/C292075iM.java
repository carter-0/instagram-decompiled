package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;

/* renamed from: X.5iM  reason: invalid class name and case insensitive filesystem */
public final class C292075iM {
    public AnonymousClass6E3 A00;
    public SRG A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final Rect A08 = new Rect();
    public final Layout A09;
    public final TextPaint A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint.FontMetricsInt A0D;
    public final C291965iA A0E;
    public final C291955i9[] A0F;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (((android.text.Spanned) r3).nextSpanTransition(-1, r5, X.C292095iO.class) >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C292075iM(android.text.TextPaint r28, android.text.TextUtils.TruncateAt r29, X.C291965iA r30, java.lang.CharSequence r31, float r32, int r33, int r34, int r35, int r36, int r37, int r38, int r39, int r40) {
        /*
            r27 = this;
            r7 = 0
            r8 = 1
            r2 = r27
            r2.<init>()
            r15 = r28
            r2.A0A = r15
            r9 = r30
            r2.A0E = r9
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.A08 = r0
            r3 = r31
            int r5 = r3.length()
            android.text.TextDirectionHeuristic r14 = X.C291975iB.A00(r34)
            android.text.Layout$Alignment r0 = X.C292085iN.A01
            r1 = r33
            if (r33 == 0) goto L_0x0054
            if (r1 == r8) goto L_0x0051
            r0 = 2
            if (r1 == r0) goto L_0x004e
            r0 = 3
            if (r1 == r0) goto L_0x004b
            android.text.Layout$Alignment r13 = X.C292085iN.A01
        L_0x0030:
            boolean r0 = r3 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0041
            r4 = r3
            android.text.Spanned r4 = (android.text.Spanned) r4
            r1 = -1
            java.lang.Class<X.5iO> r0 = X.C292095iO.class
            int r0 = r4.nextSpanTransition(r1, r5, r0)
            r10 = 1
            if (r0 < r5) goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            r1 = -1047876740(0xffffffffc18aab7c, float:-17.333733)
            java.lang.String r0 = "TextLayout:initLayout"
            X.0fg.A01(r0, r1)
            goto L_0x0057
        L_0x004b:
            android.text.Layout$Alignment r13 = X.C292085iN.A00
            goto L_0x0030
        L_0x004e:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0030
        L_0x0051:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0030
        L_0x0054:
            android.text.Layout$Alignment r13 = android.text.Layout.Alignment.ALIGN_NORMAL
            goto L_0x0030
        L_0x0057:
            boolean r0 = r9.A02     // Catch:{ all -> 0x02c5 }
            if (r0 != 0) goto L_0x006d
            int r0 = r9.A04     // Catch:{ all -> 0x02c5 }
            android.text.TextDirectionHeuristic r4 = X.C291975iB.A00(r0)     // Catch:{ all -> 0x02c5 }
            java.lang.CharSequence r1 = r9.A06     // Catch:{ all -> 0x02c5 }
            android.text.TextPaint r0 = r9.A05     // Catch:{ all -> 0x02c5 }
            android.text.BoringLayout$Metrics r0 = X.C291995iD.A00(r4, r0, r1)     // Catch:{ all -> 0x02c5 }
            r9.A01 = r0     // Catch:{ all -> 0x02c5 }
            r9.A02 = r8     // Catch:{ all -> 0x02c5 }
        L_0x006d:
            android.text.BoringLayout$Metrics r5 = r9.A01     // Catch:{ all -> 0x02c5 }
            r6 = r32
            double r0 = (double) r6     // Catch:{ all -> 0x02c5 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x02c5 }
            float r4 = (float) r0     // Catch:{ all -> 0x02c5 }
            int r4 = (int) r4     // Catch:{ all -> 0x02c5 }
            r16 = r29
            r1 = r35
            if (r5 == 0) goto L_0x009d
            float r0 = r9.A00()     // Catch:{ all -> 0x02c5 }
            int r0 = (r0 > r32 ? 1 : (r0 == r32 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            if (r10 != 0) goto L_0x009d
            r2.A0C = r8     // Catch:{ all -> 0x02c5 }
            r17 = r5
            r18 = r13
            r19 = r15
            r20 = r16
            r21 = r3
            r22 = r4
            r23 = r4
            android.text.BoringLayout r10 = X.C291995iD.A01(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ all -> 0x02c5 }
            goto L_0x00c0
        L_0x009d:
            r2.A0C = r7     // Catch:{ all -> 0x02c5 }
            int r18 = r3.length()     // Catch:{ all -> 0x02c5 }
            X.5iR r0 = X.C292105iP.A00     // Catch:{ all -> 0x02c5 }
            X.5iS r12 = new X.5iS     // Catch:{ all -> 0x02c5 }
            r22 = r40
            r23 = r36
            r24 = r37
            r25 = r38
            r26 = r39
            r19 = r4
            r20 = r1
            r21 = r4
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x02c5 }
            android.text.StaticLayout r10 = r0.AKs(r12)     // Catch:{ all -> 0x02c5 }
        L_0x00c0:
            r2.A09 = r10     // Catch:{ all -> 0x02c5 }
            r0 = 1051194490(0x3ea7f47a, float:0.32803708)
            X.0fg.A00(r0)
            int r0 = r10.getLineCount()
            int r0 = java.lang.Math.min(r0, r1)
            r2.A06 = r0
            int r9 = r0 + -1
            if (r0 < r1) goto L_0x01d7
            int r0 = r10.getEllipsisCount(r9)
            if (r0 > 0) goto L_0x00e6
            int r1 = r10.getLineEnd(r9)
            int r0 = r3.length()
            if (r1 == r0) goto L_0x01d7
        L_0x00e6:
            r0 = 1
        L_0x00e7:
            r2.A0B = r0
            boolean r0 = r2.A0C
            android.text.Layout r3 = r2.A09
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = "null cannot be cast to non-null type android.text.BoringLayout"
            X.0qQ.A0C(r3, r0)
            r0 = r3
            android.text.BoringLayout r0 = (android.text.BoringLayout) r0
            boolean r0 = X.C291995iD.A02(r0)
        L_0x00fb:
            if (r0 != 0) goto L_0x013a
            android.text.TextPaint r11 = r3.getPaint()
            java.lang.CharSequence r6 = r3.getText()
            int r1 = r3.getLineStart(r7)
            int r0 = r3.getLineEnd(r7)
            android.graphics.Rect r1 = X.C14135TqV.A00(r11, r6, r1, r0)
            int r5 = r3.getLineAscent(r7)
            int r0 = r1.top
            if (r0 >= r5) goto L_0x01c1
            int r5 = r5 - r0
        L_0x011a:
            int r4 = r2.A06
            if (r4 == r8) goto L_0x012c
            int r0 = r4 - r8
            int r1 = r3.getLineStart(r0)
            int r0 = r3.getLineEnd(r0)
            android.graphics.Rect r1 = X.C14135TqV.A00(r11, r6, r1, r0)
        L_0x012c:
            int r4 = r4 - r8
            int r0 = r3.getLineDescent(r4)
            int r4 = r1.bottom
            if (r4 <= r0) goto L_0x01bb
            int r4 = r4 - r0
        L_0x0136:
            if (r5 != 0) goto L_0x01ae
            if (r4 != 0) goto L_0x01ae
        L_0x013a:
            long r5 = X.C291975iB.A00
        L_0x013c:
            android.text.Layout r12 = r2.A09
            java.lang.CharSequence r0 = r12.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            r11 = 0
            if (r0 == 0) goto L_0x016d
            java.lang.CharSequence r13 = r12.getText()
            java.lang.String r4 = "null cannot be cast to non-null type android.text.Spanned"
            X.0qQ.A0C(r13, r4)
            android.text.Spanned r13 = (android.text.Spanned) r13
            java.lang.Class<X.5i9> r3 = X.C291955i9.class
            int r1 = r13.length()
            r0 = -1
            int r1 = r13.nextSpanTransition(r0, r1, r3)
            int r0 = r13.length()
            if (r1 != r0) goto L_0x0196
            java.lang.CharSequence r0 = r12.getText()
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0196
        L_0x016d:
            r2.A0F = r11
            if (r11 == 0) goto L_0x01da
            int r12 = r11.length
            r4 = 0
            r3 = 0
            r1 = 0
        L_0x0175:
            if (r4 >= r12) goto L_0x01dd
            r13 = r11[r4]
            int r0 = r13.A03
            if (r0 >= 0) goto L_0x0187
            int r0 = r13.A03
            int r0 = java.lang.Math.abs(r0)
            int r3 = java.lang.Math.max(r3, r0)
        L_0x0187:
            int r0 = r13.A05
            if (r0 >= 0) goto L_0x0193
            int r0 = java.lang.Math.abs(r0)
            int r1 = java.lang.Math.max(r3, r0)
        L_0x0193:
            int r4 = r4 + 1
            goto L_0x0175
        L_0x0196:
            java.lang.CharSequence r1 = r12.getText()
            X.0qQ.A0C(r1, r4)
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.CharSequence r0 = r12.getText()
            int r0 = r0.length()
            java.lang.Object[] r11 = r1.getSpans(r7, r0, r3)
            X.5i9[] r11 = (X.C291955i9[]) r11
            goto L_0x016d
        L_0x01ae:
            long r0 = (long) r5
            r3 = 32
            long r0 = r0 << r3
            long r5 = (long) r4
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r3
            long r5 = r5 | r0
            goto L_0x013c
        L_0x01bb:
            int r4 = r3.getBottomPadding()
            goto L_0x0136
        L_0x01c1:
            int r5 = r3.getTopPadding()
            goto L_0x011a
        L_0x01c7:
            java.lang.String r0 = "null cannot be cast to non-null type android.text.StaticLayout"
            X.0qQ.A0C(r3, r0)
            r1 = r3
            android.text.StaticLayout r1 = (android.text.StaticLayout) r1
            X.5iR r0 = X.C292105iP.A00
            boolean r0 = r0.CT6(r1, r8)
            goto L_0x00fb
        L_0x01d7:
            r0 = 0
            goto L_0x00e7
        L_0x01da:
            long r0 = X.C291975iB.A00
            goto L_0x01e3
        L_0x01dd:
            if (r3 != 0) goto L_0x02b7
            if (r1 != 0) goto L_0x02b7
            long r0 = X.C291975iB.A00
        L_0x01e3:
            r13 = 32
            long r3 = r5 >> r13
            int r12 = (int) r3
            long r3 = r0 >> r13
            int r13 = (int) r3
            int r3 = java.lang.Math.max(r12, r13)
            r2.A07 = r3
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r12
            int r4 = (int) r5
            long r0 = r0 & r12
            int r3 = (int) r0
            int r0 = java.lang.Math.max(r4, r3)
            r2.A04 = r0
            int r3 = r2.A06
            int r3 = r3 - r8
            android.text.Layout r0 = r2.A09
            int r1 = r0.getLineStart(r3)
            int r0 = r0.getLineEnd(r3)
            if (r1 != r0) goto L_0x02b4
            if (r11 == 0) goto L_0x02b4
            int r0 = r11.length
            if (r0 == 0) goto L_0x02b4
            java.lang.String r0 = "​"
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            java.lang.Object r0 = X.03t.A05(r11)
            X.5i9 r0 = (X.C291955i9) r0
            int r19 = r1.length()
            if (r3 == 0) goto L_0x02ae
            boolean r5 = r0.A09
            if (r5 == 0) goto L_0x02ae
            r20 = 0
        L_0x022d:
            float r3 = r0.A06
            float r0 = r0.A07
            X.5i9 r4 = new X.5i9
            r18 = r0
            r21 = r5
            r16 = r4
            r17 = r3
            r16.<init>(r17, r18, r19, r20, r21)
            int r3 = r1.length()
            r0 = 33
            r1.setSpan(r4, r7, r3, r0)
            int r18 = r1.length()
            r16 = 0
            android.text.Layout$Alignment r13 = X.VKT.A00
            r19 = 2147483647(0x7fffffff, float:NaN)
            X.5iR r0 = X.C292105iP.A00
            X.5iS r12 = new X.5iS
            r17 = r1
            r20 = r19
            r21 = r19
            r22 = r7
            r23 = r7
            r24 = r7
            r25 = r7
            r26 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            android.text.StaticLayout r1 = r0.AKs(r12)
            android.graphics.Paint$FontMetricsInt r4 = new android.graphics.Paint$FontMetricsInt
            r4.<init>()
            int r0 = r1.getLineAscent(r7)
            r4.ascent = r0
            int r0 = r1.getLineDescent(r7)
            r4.descent = r0
            int r0 = r1.getLineTop(r7)
            r4.top = r0
            int r3 = r1.getLineBottom(r7)
            r4.bottom = r3
            float r1 = r2.A01(r9)
            float r0 = r2.A02(r9)
            float r1 = r1 - r0
            int r0 = (int) r1
            int r3 = r3 - r0
        L_0x0295:
            r2.A05 = r3
            r2.A0D = r4
            android.text.TextPaint r0 = r10.getPaint()
            float r0 = X.C292155iU.A00(r0, r10, r9)
            r2.A02 = r0
            android.text.TextPaint r0 = r10.getPaint()
            float r0 = X.C292155iU.A01(r0, r10, r9)
            r2.A03 = r0
            return
        L_0x02ae:
            boolean r5 = r0.A09
            r20 = r5
            goto L_0x022d
        L_0x02b4:
            r4 = 0
            r3 = 0
            goto L_0x0295
        L_0x02b7:
            long r3 = (long) r3
            r0 = 32
            long r3 = r3 << r0
            long r0 = (long) r1
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r12
            long r0 = r0 | r3
            goto L_0x01e3
        L_0x02c5:
            r1 = move-exception
            r0 = -546180558(0xffffffffdf71f232, float:-1.7434052E19)
            X.0fg.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C292075iM.<init>(android.text.TextPaint, android.text.TextUtils$TruncateAt, X.5iA, java.lang.CharSequence, float, int, int, int, int, int, int, int, int):void");
    }

    public final float A00(int i) {
        float lineBaseline;
        Paint.FontMetricsInt fontMetricsInt;
        float f = (float) this.A07;
        if (i != this.A06 - 1 || (fontMetricsInt = this.A0D) == null) {
            lineBaseline = (float) this.A09.getLineBaseline(i);
        } else {
            lineBaseline = A02(i) - ((float) fontMetricsInt.ascent);
        }
        return f + lineBaseline;
    }

    public final float A01(int i) {
        float lineBottom;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.A06 - 1;
        if (i != i3 || (fontMetricsInt = this.A0D) == null) {
            lineBottom = ((float) this.A07) + ((float) this.A09.getLineBottom(i));
            if (i == i3) {
                i2 = this.A04;
            } else {
                i2 = 0;
            }
        } else {
            lineBottom = (float) this.A09.getLineBottom(i - 1);
            i2 = fontMetricsInt.bottom;
        }
        return lineBottom + ((float) i2);
    }

    public final float A02(int i) {
        int i2;
        float lineTop = (float) this.A09.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.A07;
        }
        return lineTop + ((float) i2);
    }

    public final float A03(int i, boolean z) {
        float f;
        AnonymousClass6E3 r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass6E3(this.A09);
            this.A00 = r1;
        }
        float A012 = r1.A01(i, true, z);
        if (this.A09.getLineForOffset(i) == this.A06 - 1) {
            f = this.A02 + this.A03;
        } else {
            f = 0.0f;
        }
        return A012 + f;
    }

    public final float A04(int i, boolean z) {
        float f;
        AnonymousClass6E3 r1 = this.A00;
        if (r1 == null) {
            r1 = new AnonymousClass6E3(this.A09);
            this.A00 = r1;
        }
        float A012 = r1.A01(i, false, z);
        if (this.A09.getLineForOffset(i) == this.A06 - 1) {
            f = this.A02 + this.A03;
        } else {
            f = 0.0f;
        }
        return A012 + f;
    }

    public final int A05(int i) {
        Layout layout = this.A09;
        if (layout.getEllipsisStart(i) == 0) {
            return layout.getLineEnd(i);
        }
        return layout.getText().length();
    }

    public final SRG A06() {
        SRG srg = this.A01;
        if (srg != null) {
            return srg;
        }
        Layout layout = this.A09;
        SRG srg2 = new SRG(layout.getText(), this.A0A.getTextLocale(), layout.getText().length());
        this.A01 = srg2;
        return srg2;
    }

    public final int[] A07(RectF rectF, 0sL r24, int i) {
        XAM A002;
        RectF rectF2 = rectF;
        0sL r11 = r24;
        int i2 = i;
        if (Build.VERSION.SDK_INT >= 34) {
            return C18087VlH.A01(rectF2, this, r11, i2);
        }
        Layout layout = this.A09;
        AnonymousClass6E3 r8 = this.A00;
        if (r8 == null) {
            r8 = new AnonymousClass6E3(layout);
            this.A00 = r8;
        }
        CharSequence text = layout.getText();
        if (i2 == 1) {
            A002 = new C18931WDj(A06(), text);
        } else {
            A002 = C16755V4o.A00(this.A0A, text);
        }
        int lineForVertical = layout.getLineForVertical((int) rectF2.top);
        if (rectF2.top > A01(lineForVertical) && (lineForVertical = lineForVertical + 1) >= this.A06) {
            return null;
        }
        int lineForVertical2 = layout.getLineForVertical((int) rectF2.bottom);
        if (lineForVertical2 == 0 && rectF2.bottom < A02(0)) {
            return null;
        }
        while (true) {
            int A003 = C16753V4m.A00(rectF2, layout, r8, this, A002, r11, lineForVertical, true);
            if (A003 != -1) {
                while (true) {
                    int A004 = C16753V4m.A00(rectF2, layout, r8, this, A002, r11, lineForVertical2, false);
                    if (A004 != -1) {
                        return new int[]{A002.E4P(A003 + 1), A002.Cra(A004 - 1)};
                    }
                    if (lineForVertical >= lineForVertical2) {
                        return null;
                    }
                    lineForVertical2--;
                }
            } else if (lineForVertical >= lineForVertical2) {
                return null;
            } else {
                lineForVertical++;
            }
        }
    }
}
