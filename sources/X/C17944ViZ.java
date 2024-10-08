package X;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.List;

/* renamed from: X.ViZ  reason: case insensitive filesystem */
public final class C17944ViZ {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final String A06;
    public final boolean A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final StaticLayout A0C;
    public final C306576Mr A0D;
    public final List A0E;
    public final boolean A0F;
    public final C358848bZ[] A0G;
    public final AnonymousClass91R[] A0H;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0044, code lost:
        if (r2 == X.C306576Mr.INVERTED_OUTLINED) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17944ViZ(android.text.Layout.Alignment r16, android.text.Spannable r17, android.text.TextPaint r18, X.0rN r19, float r20, float r21, float r22, float r23, float r24, int r25, int r26, int r27) {
        /*
            r15 = this;
            r6 = r17
            r9 = r18
            X.C51972G9s.A1B(r6, r9)
            r15.<init>()
            r0 = r27
            r15.A0B = r0
            r0 = r20
            r15.A02 = r0
            r0 = r21
            r15.A03 = r0
            r0 = r22
            r15.A08 = r0
            r0 = r23
            r15.A09 = r0
            r0 = r24
            r15.A01 = r0
            java.lang.String r0 = r6.toString()
            boolean r0 = X.0mk.A03(r0)
            r15.A07 = r0
            r7 = r25
            r8 = r26
            java.lang.String r0 = X.C13988Tno.A0c(r6, r7, r8)
            r15.A06 = r0
            X.6Mr r2 = X.C358948bj.A00(r6, r7, r8)
            r15.A0D = r2
            X.6Mr r4 = X.C306576Mr.OUTLINED
            r14 = 0
            if (r2 == r4) goto L_0x0046
            X.6Mr r1 = X.C306576Mr.INVERTED_OUTLINED
            r0 = 0
            if (r2 != r1) goto L_0x0047
        L_0x0046:
            r0 = 1
        L_0x0047:
            r15.A0F = r0
            java.lang.Class<X.8bZ> r0 = X.C358848bZ.class
            java.lang.Object[] r5 = r6.getSpans(r7, r8, r0)
            int r3 = r5.length
            r2 = 0
        L_0x0051:
            if (r2 >= r3) goto L_0x0065
            r1 = r5[r2]
            X.8bZ r1 = (X.C358848bZ) r1
            boolean r0 = r15.A0F
            r0 = r0 ^ 1
            r1.A04 = r0
            int r0 = r1.A05
            r9.setColor(r0)
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0065:
            X.8bZ[] r5 = (X.C358848bZ[]) r5
            r15.A0G = r5
            boolean r0 = r15.A0F
            if (r0 == 0) goto L_0x00e9
            java.lang.Class<X.91R> r0 = X.AnonymousClass91R.class
            java.lang.Object[] r2 = r6.getSpans(r7, r8, r0)
            X.91R[] r2 = (X.AnonymousClass91R[]) r2
        L_0x0075:
            r15.A0H = r2
            r1 = r19
            int r10 = r1.A00
            float r12 = r1.A02
            float r13 = r1.A01
            android.text.StaticLayout r5 = new android.text.StaticLayout
            r11 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.A0C = r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r15.A0E = r0
            boolean r0 = r15.A0F
            if (r0 == 0) goto L_0x00eb
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r2 == 0) goto L_0x00c6
            X.6Mr r5 = r15.A0D
            r0 = r2[r14]
            if (r5 != r4) goto L_0x00e6
            int r5 = r0.A02
        L_0x00a2:
            X.8bh r0 = r0.A09
            float r0 = r0.A02
            android.text.TextPaint r0 = X.VBG.A00(r9, r0, r5)
            r3.add(r0)
            r5 = r2[r14]
            X.8bh r0 = r5.A09
            java.lang.Float r0 = r0.A03
            if (r0 == 0) goto L_0x00c6
            float r2 = r0.floatValue()
            X.6Mr r0 = r15.A0D
            if (r0 != r4) goto L_0x00e3
            int r0 = r5.A01
        L_0x00bf:
            android.text.TextPaint r0 = X.VBG.A00(r9, r2, r0)
            r3.add(r0)
        L_0x00c6:
            java.util.Iterator r2 = r3.iterator()
        L_0x00ca:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r9 = r2.next()
            android.text.TextPaint r9 = (android.text.TextPaint) r9
            java.util.List r0 = r15.A0E
            int r10 = r1.A00
            android.text.StaticLayout r5 = new android.text.StaticLayout
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0.add(r5)
            goto L_0x00ca
        L_0x00e3:
            int r0 = r5.A02
            goto L_0x00bf
        L_0x00e6:
            int r5 = r0.A01
            goto L_0x00a2
        L_0x00e9:
            r2 = 0
            goto L_0x0075
        L_0x00eb:
            int r1 = r15.A0B
            android.text.StaticLayout r0 = r15.A0C
            int r0 = r0.getLineCount()
            float r2 = r15.A01
            if (r1 >= r0) goto L_0x0101
            android.text.StaticLayout r1 = r15.A0C
            int r0 = r15.A0B
            int r0 = r1.getLineBaseline(r0)
            float r0 = (float) r0
            float r2 = r2 - r0
        L_0x0101:
            r15.A0A = r2
            int r1 = r15.A0B
            android.text.StaticLayout r0 = r15.A0C
            int r0 = r0.getLineCount()
            r3 = 0
            if (r1 >= r0) goto L_0x013a
            android.text.StaticLayout r1 = r15.A0C
            int r0 = r15.A0B
            float r2 = r1.getLineLeft(r0)
        L_0x0116:
            r15.A04 = r2
            int r1 = r15.A0B
            android.text.StaticLayout r0 = r15.A0C
            int r0 = r0.getLineCount()
            if (r1 >= r0) goto L_0x012a
            android.text.StaticLayout r1 = r15.A0C
            int r0 = r15.A0B
            float r3 = r1.getLineRight(r0)
        L_0x012a:
            r15.A05 = r3
            boolean r0 = r15.A07
            if (r0 == 0) goto L_0x0136
            float r0 = r15.A09
            float r0 = r0 - r3
        L_0x0133:
            r15.A00 = r0
            return
        L_0x0136:
            float r0 = r15.A08
            float r0 = r0 - r2
            goto L_0x0133
        L_0x013a:
            r2 = 0
            goto L_0x0116
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17944ViZ.<init>(android.text.Layout$Alignment, android.text.Spannable, android.text.TextPaint, X.0rN, float, float, float, float, float, int, int, int):void");
    }

    public final void A00(Canvas canvas, Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (this.A0F) {
                for (Layout paint : this.A0E) {
                    TextPaint paint2 = paint.getPaint();
                    if (paint2 != null) {
                        paint2.setAlpha(intValue);
                    }
                }
                this.A0C.getPaint().setAlpha(intValue);
            } else {
                for (C358848bZ r1 : this.A0G) {
                    r1.A03 = Integer.valueOf(intValue);
                    r1.A01 = 0.0f;
                    r1.A00 = 0.0f;
                }
            }
        }
        canvas.save();
        canvas.translate(this.A00, this.A0A);
        for (Layout draw : this.A0E) {
            draw.draw(canvas);
        }
        this.A0C.draw(canvas);
        canvas.restore();
    }
}
