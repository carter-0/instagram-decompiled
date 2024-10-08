package X;

import android.view.View;

/* renamed from: X.59I  reason: invalid class name */
public final class AnonymousClass59I extends AnonymousClass59E {
    public final View A00;
    public final AnonymousClass5FD A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f1, code lost:
        if (r14 != r9) goto L_0x01f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x021d, code lost:
        if (r16 == false) goto L_0x021f;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass59I(android.view.View r19, X.C244063aa r20, X.AnonymousClass5FD r21, java.lang.String r22) {
        /*
            r18 = this;
            r3 = r18
            r0 = r20
            r12 = r19
            r3.<init>(r12, r0)
            r3.A00 = r12
            r0 = r22
            r3.A02 = r0
            r0 = r21
            r3.A01 = r0
            java.util.Map r0 = r3.A01
            r17 = r0
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            boolean r0 = r12 instanceof android.widget.TextSwitcher
            if (r0 == 0) goto L_0x0026
            android.widget.ViewAnimator r12 = (android.widget.ViewAnimator) r12
            android.view.View r12 = r12.getCurrentView()
        L_0x0026:
            boolean r4 = r12 instanceof android.widget.TextView
            if (r4 != 0) goto L_0x0036
            boolean r0 = r12 instanceof com.facebook.rendercore.text.RCTextView
            if (r0 != 0) goto L_0x0036
            boolean r0 = r12 instanceof com.instagram.ui.widget.textview.IgTextLayoutView
            if (r0 != 0) goto L_0x0036
            X.5FD r0 = r3.A01
            if (r0 == 0) goto L_0x00ce
        L_0x0036:
            java.lang.String r1 = "component_type"
            java.lang.String r0 = "text"
            r2.put(r1, r0)
            if (r4 == 0) goto L_0x00ce
            android.widget.TextView r12 = (android.widget.TextView) r12
            android.content.Context r4 = r12.getContext()
            java.lang.CharSequence r0 = r12.getText()
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "text_string"
            r2.put(r0, r1)
            int r0 = r12.getCurrentTextColor()
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "text_color"
            r2.put(r0, r1)
            X.0qQ.A0A(r4)
            float r0 = r12.getTextSize()
            float r0 = X.0nA.A01(r4, r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "font_size"
            r2.put(r0, r1)
            android.graphics.Typeface r0 = r12.getTypeface()
            if (r0 == 0) goto L_0x0091
            int r0 = r0.getStyle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.C244083ac.A01(r0)
            java.lang.String r0 = "font_style"
            r2.put(r0, r1)
        L_0x0091:
            int r0 = r12.getLineHeight()
            float r0 = (float) r0
            float r0 = X.0nA.A01(r4, r0)
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "font_line_height"
            r2.put(r0, r1)
            int r0 = r12.getLineCount()
        L_0x00a8:
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_lines_showed"
            r2.put(r0, r1)
            java.lang.String r1 = "view_rendering_component_type"
            java.lang.String r0 = "NATIVE"
        L_0x00b6:
            r2.put(r1, r0)
        L_0x00b9:
            X.59A r1 = X.AnonymousClass59A.A00
            java.lang.String r0 = r3.A02
            java.lang.Integer r1 = r1.A06(r0)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r0 = "index_of_card"
            r2.put(r0, r1)
        L_0x00c8:
            r0 = r17
            r0.putAll(r2)
            return
        L_0x00ce:
            boolean r0 = r12 instanceof com.instagram.ui.widget.textview.IgTextLayoutView
            if (r0 == 0) goto L_0x0158
            com.instagram.ui.widget.textview.IgTextLayoutView r12 = (com.instagram.ui.widget.textview.IgTextLayoutView) r12
            android.content.Context r5 = r12.getContext()
            android.text.Layout r4 = r12.A00
            if (r4 == 0) goto L_0x00b9
            java.lang.CharSequence r1 = r4.getText()
            java.lang.String r0 = "text_string"
            r2.put(r0, r1)
            android.text.TextPaint r0 = r4.getPaint()
            int r0 = r0.getColor()
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "text_color"
            r2.put(r0, r1)
            X.0qQ.A0A(r5)
            android.text.TextPaint r0 = r4.getPaint()
            float r0 = r0.getTextSize()
            float r0 = X.0nA.A01(r5, r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "font_size"
            r2.put(r0, r1)
            android.text.TextPaint r0 = r4.getPaint()
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == 0) goto L_0x0130
            int r0 = r0.getStyle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.C244083ac.A01(r0)
            java.lang.String r0 = "font_style"
            r2.put(r0, r1)
        L_0x0130:
            android.text.TextPaint r1 = r4.getPaint()
            r0 = 0
            int r0 = r1.getFontMetricsInt(r0)
            float r1 = (float) r0
            float r0 = r4.getSpacingMultiplier()
            float r1 = r1 * r0
            float r0 = r4.getSpacingAdd()
            float r1 = r1 + r0
            float r0 = X.0nA.A01(r5, r1)
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "font_line_height"
            r2.put(r0, r1)
            int r0 = r4.getLineCount()
            goto L_0x00a8
        L_0x0158:
            boolean r0 = r12 instanceof com.facebook.rendercore.text.RCTextView
            if (r0 == 0) goto L_0x02b9
            com.facebook.rendercore.text.RCTextView r12 = (com.facebook.rendercore.text.RCTextView) r12
            java.lang.CharSequence r13 = r12.A03
            X.0qQ.A07(r13)
            android.text.Layout r0 = r12.A02
            int r1 = r0.getLineCount()
            r4 = 0
            r7 = 0
        L_0x016b:
            r6 = -1
            if (r7 >= r1) goto L_0x0179
            android.text.Layout r0 = r12.A02
            int r0 = r0.getEllipsisCount(r7)
            if (r0 > 0) goto L_0x017a
            int r7 = r7 + 1
            goto L_0x016b
        L_0x0179:
            r7 = -1
        L_0x017a:
            int r5 = r13.length()
            if (r7 == r6) goto L_0x018d
            android.text.Layout r0 = r12.A02
            int r5 = r0.getLineStart(r7)
            android.text.Layout r0 = r12.A02
            int r0 = r0.getEllipsisStart(r7)
            int r5 = r5 + r0
        L_0x018d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.CharSequence r0 = r13.subSequence(r4, r5)
            r1.append(r0)
            if (r7 <= r6) goto L_0x02b5
            java.lang.String r0 = "…"
        L_0x019d:
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "text_string"
            r2.put(r0, r1)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r10 = r1.length()
            boolean r0 = r13 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x021f
            android.text.Spanned r13 = (android.text.Spanned) r13
            int r9 = r10 + -1
            java.lang.Class<android.text.style.ForegroundColorSpan> r0 = android.text.style.ForegroundColorSpan.class
            java.lang.Object[] r8 = r13.getSpans(r4, r9, r0)
            android.text.style.ForegroundColorSpan[] r8 = (android.text.style.ForegroundColorSpan[]) r8
            X.0qQ.A0A(r8)
            int r7 = r8.length
            if (r7 == 0) goto L_0x021f
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r7)
            r5 = 0
            r16 = 0
        L_0x01d0:
            r4 = r8[r5]
            int r0 = r4.getForegroundColor()
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r15 = X.002.A0R(r1, r0)
            X.0qQ.A07(r15)
            int r1 = r13.getSpanStart(r4)
            int r14 = r13.getSpanEnd(r4)
            if (r16 != 0) goto L_0x01f5
            if (r1 != 0) goto L_0x01f3
            r16 = 1
            if (r14 == r9) goto L_0x01f5
        L_0x01f3:
            r16 = 0
        L_0x01f5:
            X.B9F r4 = new X.B9F
            r4.<init>()
            java.lang.String r0 = "color"
            r4.A06(r0, r15)
            long r0 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start"
            r4.A05(r0, r1)
            long r0 = (long) r14
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "end"
            r4.A05(r0, r1)
            r6.add(r4)
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x01d0
            r11.addAll(r6)
            if (r16 != 0) goto L_0x025a
        L_0x021f:
            android.text.Layout r0 = r12.A02
            android.text.TextPaint r0 = r0.getPaint()
            int r0 = r0.getColor()
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.0qQ.A07(r1)
            X.B9F r4 = new X.B9F
            r4.<init>()
            java.lang.String r0 = "color"
            r4.A06(r0, r1)
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "start"
            r4.A05(r0, r1)
            r0 = 1
            int r10 = r10 - r0
            long r0 = (long) r10
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "end"
            r4.A05(r0, r1)
            r11.add(r4)
        L_0x025a:
            java.lang.String r0 = "text_colors"
            r2.put(r0, r11)
            android.text.Layout r4 = r12.A02
            X.0qQ.A0A(r4)
            android.text.TextPaint r5 = r4.getPaint()
            X.0qQ.A07(r5)
            android.content.Context r1 = r12.getContext()
            X.0qQ.A07(r1)
            float r0 = r5.getTextSize()
            float r0 = X.0nA.A01(r1, r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "font_size"
            r2.put(r0, r1)
            android.graphics.Typeface r0 = r5.getTypeface()
            int r0 = r0.getStyle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.C244083ac.A01(r0)
            java.lang.String r0 = "font_style"
            r2.put(r0, r1)
            r0 = 0
            int r0 = r5.getFontMetricsInt(r0)
            float r1 = (float) r0
            float r0 = r4.getSpacingMultiplier()
            float r1 = r1 * r0
            float r0 = r4.getSpacingAdd()
            float r1 = r1 + r0
            double r0 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "font_line_height"
            r2.put(r0, r1)
            goto L_0x00b9
        L_0x02b5:
            java.lang.String r0 = ""
            goto L_0x019d
        L_0x02b9:
            X.5FD r4 = r3.A01
            if (r4 == 0) goto L_0x00b9
            java.lang.CharSequence r1 = r4.A06
            java.lang.String r0 = "text_string"
            r2.put(r0, r1)
            android.view.View r0 = r3.A00
            android.content.Context r5 = r0.getContext()
            X.0qQ.A07(r5)
            float r0 = r4.A01
            float r0 = X.0nA.A01(r5, r0)
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "font_size"
            r2.put(r0, r1)
            android.graphics.Typeface r0 = r4.A04
            if (r0 == 0) goto L_0x0325
            int r0 = r0.getStyle()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x02e9:
            java.lang.String r1 = X.C244083ac.A01(r0)
            java.lang.String r0 = "font_style"
            r2.put(r0, r1)
            int r0 = r4.A02
            java.lang.String r1 = "#"
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "text_color"
            r2.put(r0, r1)
            float r0 = r4.A00
            float r0 = X.0nA.A01(r5, r0)
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "font_line_height"
            r2.put(r0, r1)
            int r0 = r4.A03
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "number_lines_showed"
            r2.put(r0, r1)
            java.lang.String r1 = "view_rendering_component_type"
            java.lang.String r0 = "LITHO"
            goto L_0x00b6
        L_0x0325:
            r0 = 0
            goto L_0x02e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59I.<init>(android.view.View, X.3aa, X.5FD, java.lang.String):void");
    }
}
