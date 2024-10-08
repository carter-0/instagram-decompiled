package X;

import android.text.TextPaint;

/* renamed from: X.Ttl  reason: case insensitive filesystem */
public final class C14311Ttl extends C299975wK {
    public TextPaint A00;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r21, java.lang.CharSequence r22, int r23, int r24, float r25, int r26, int r27, int r28, android.graphics.Paint r29) {
        /*
            r20 = this;
            r4 = r22
            r13 = r29
            r5 = r13
            boolean r0 = r4 instanceof android.text.Spanned
            r1 = 0
            r7 = r21
            r11 = r25
            r6 = r20
            if (r0 == 0) goto L_0x0029
            android.text.Spanned r4 = (android.text.Spanned) r4
            java.lang.Class<android.text.style.CharacterStyle> r0 = android.text.style.CharacterStyle.class
            r2 = r24
            r3 = r23
            java.lang.Object[] r4 = r4.getSpans(r3, r2, r0)
            android.text.style.CharacterStyle[] r4 = (android.text.style.CharacterStyle[]) r4
            int r3 = r4.length
            if (r3 == 0) goto L_0x0029
            r2 = 0
            r0 = 1
            if (r3 != r0) goto L_0x0084
            r0 = r4[r2]
            if (r0 != r6) goto L_0x0084
        L_0x0029:
            boolean r0 = r13 instanceof android.text.TextPaint
            if (r0 == 0) goto L_0x0082
            android.text.TextPaint r5 = (android.text.TextPaint) r5
        L_0x002f:
            if (r5 == 0) goto L_0x005e
            int r0 = r5.bgColor
            if (r0 == 0) goto L_0x005e
            short r0 = r6.A00
            float r0 = (float) r0
            float r17 = r25 + r0
            r0 = r26
            float r4 = (float) r0
            r0 = r28
            float r3 = (float) r0
            int r2 = r5.getColor()
            android.graphics.Paint$Style r1 = r5.getStyle()
            int r0 = r5.bgColor
            X.C13988Tno.A0p(r0, r5)
            r14 = r7
            r15 = r11
            r18 = r3
            r19 = r5
            r16 = r4
            r14.drawRect(r15, r16, r17, r18, r19)
            r5.setStyle(r1)
            r5.setColor(r2)
        L_0x005e:
            X.C13993Tnu.A00()
            X.2Ca r3 = r6.A02
            r0 = r27
            float r12 = (float) r0
            if (r5 == 0) goto L_0x0069
            r13 = r5
        L_0x0069:
            X.2CV r2 = r3.A01
            android.graphics.Typeface r0 = r2.A00
            android.graphics.Typeface r1 = r13.getTypeface()
            r13.setTypeface(r0)
            int r0 = r3.A00
            int r9 = r0 * 2
            char[] r8 = r2.A03
            r10 = 2
            r7.drawText(r8, r9, r10, r11, r12, r13)
            r13.setTypeface(r1)
            return
        L_0x0082:
            r5 = r1
            goto L_0x005e
        L_0x0084:
            android.text.TextPaint r5 = r6.A00
            if (r5 != 0) goto L_0x008f
            android.text.TextPaint r5 = new android.text.TextPaint
            r5.<init>()
            r6.A00 = r5
        L_0x008f:
            r5.set(r13)
        L_0x0092:
            r1 = r4[r2]
            boolean r0 = r1 instanceof android.text.style.MetricAffectingSpan
            if (r0 != 0) goto L_0x009b
            r1.updateDrawState(r5)
        L_0x009b:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x002f
            goto L_0x0092
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14311Ttl.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
