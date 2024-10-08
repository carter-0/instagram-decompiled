package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class U13 extends Drawable {
    public C17179VLj A00;
    public C18659VwF A01;
    public final Context A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final Paint A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: float[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: int} */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.Number] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        if (r0 != null) goto L_0x00fd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r19) {
        /*
            r18 = this;
            r5 = 0
            r12 = r19
            X.0qQ.A0B(r12, r5)
            r1 = r18
            X.VwF r7 = r1.A01
            r4 = 0
            if (r7 == 0) goto L_0x004d
            int r6 = r1.getLayoutDirection()
            android.content.Context r3 = r1.A02
            int r0 = X.AnonymousClass7TF.A06(r1)
            float r0 = (float) r0
            float r2 = X.W2U.A00(r0)
            int r0 = X.JTP.A06(r1)
            float r0 = (float) r0
            float r0 = X.W2U.A00(r0)
            X.Vw5 r7 = r7.A00(r3, r2, r0, r6)
            r2 = 1
            boolean r0 = r7.A00()
            if (r0 != r2) goto L_0x004d
            X.W08 r0 = r7.A02
            X.W08 r6 = X.W08.A00(r0)
            X.W08 r0 = r7.A03
            X.W08 r3 = X.W08.A00(r0)
            X.W08 r0 = r7.A00
            X.W08 r2 = X.W08.A00(r0)
            X.W08 r0 = r7.A01
            X.W08 r0 = X.W08.A00(r0)
            X.Vw5 r4 = new X.Vw5
            r4.<init>(r6, r3, r2, r0)
        L_0x004d:
            X.VLj r7 = r1.A00
            if (r7 == 0) goto L_0x03ba
            int r6 = r1.getLayoutDirection()
            android.content.Context r2 = r1.A02
            r0 = 1
            X.0qQ.A0B(r2, r0)
            r3 = 0
            if (r6 == 0) goto L_0x0316
            if (r6 != r0) goto L_0x03d6
            com.facebook.react.modules.i18nmanager.I18nUtil r0 = com.facebook.react.modules.i18nmanager.I18nUtil.A00
            boolean r6 = r0.A00(r2)
            java.lang.Float[] r2 = r7.A00
            X.UyB r0 = X.C16615UyB.A07
            java.lang.Float r0 = A00(r0, r2)
            if (r6 == 0) goto L_0x02b6
            if (r0 != 0) goto L_0x02b0
            X.UyB r0 = X.C16615UyB.A0A
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02b0
            X.UyB r0 = X.C16615UyB.A08
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02b0
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02b0
            r6 = 0
        L_0x008b:
            X.UyB r0 = X.C16615UyB.A05
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02aa
            X.UyB r0 = X.C16615UyB.A0C
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02aa
            X.UyB r0 = X.C16615UyB.A03
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02aa
            X.UyB r0 = X.C16615UyB.A0D
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02aa
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x02aa
            r7 = 0
        L_0x00b4:
            X.UyB r0 = X.C16615UyB.A0B
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0310
            X.UyB r0 = X.C16615UyB.A09
        L_0x00be:
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0310
            X.UyB r0 = X.C16615UyB.A08
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0310
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0310
            r8 = 0
        L_0x00d5:
            X.UyB r0 = X.C16615UyB.A04
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A06
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A03
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A0D
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
        L_0x00fb:
            if (r0 == 0) goto L_0x0101
        L_0x00fd:
            float r3 = r0.floatValue()
        L_0x0101:
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r6, r7, r8, r3)
            float r0 = r9.left
            float r6 = X.W2U.A01(r0)
            float r0 = r9.top
            float r3 = X.W2U.A01(r0)
            float r0 = r9.right
            float r2 = X.W2U.A01(r0)
            float r0 = r9.bottom
            float r0 = X.W2U.A01(r0)
            android.graphics.RectF r10 = new android.graphics.RectF
            r10.<init>(r6, r3, r2, r0)
        L_0x0123:
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.left
            float r7 = (float) r0
            r11 = 0
            if (r10 == 0) goto L_0x02a7
            float r0 = r10.left
        L_0x012f:
            float r7 = r7 + r0
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.top
            float r6 = (float) r0
            if (r10 == 0) goto L_0x02a4
            float r0 = r10.top
        L_0x013b:
            float r6 = r6 + r0
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.right
            float r3 = (float) r0
            if (r10 == 0) goto L_0x02a1
            float r0 = r10.right
        L_0x0147:
            float r3 = r3 - r0
            android.graphics.Rect r0 = r1.getBounds()
            int r0 = r0.bottom
            float r2 = (float) r0
            if (r10 == 0) goto L_0x029e
            float r0 = r10.bottom
        L_0x0153:
            float r2 = r2 - r0
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r7, r6, r3, r2)
            r7 = 0
            r6 = 0
            if (r4 == 0) goto L_0x0221
            r0 = 8
            float[] r8 = new float[r0]
            X.W08 r3 = r4.A02
            float r2 = r3.A00
            if (r10 == 0) goto L_0x029b
            float r0 = r10.left
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x016d:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0177
            r2 = 0
        L_0x0177:
            r8[r5] = r2
            float r2 = r3.A01
            if (r10 == 0) goto L_0x0298
            float r0 = r10.top
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0183:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x018d
            r2 = 0
        L_0x018d:
            r0 = 1
            r8[r0] = r2
            r3 = 2
            X.W08 r5 = r4.A03
            float r2 = r5.A00
            if (r10 == 0) goto L_0x0295
            float r0 = r10.right
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x019d:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01a7
            r2 = 0
        L_0x01a7:
            r8[r3] = r2
            r3 = 3
            float r2 = r5.A01
            if (r10 == 0) goto L_0x0292
            float r0 = r10.top
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01b4:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01be
            r2 = 0
        L_0x01be:
            r8[r3] = r2
            r3 = 4
            X.W08 r5 = r4.A01
            float r2 = r5.A00
            if (r10 == 0) goto L_0x028f
            float r0 = r10.right
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01cd:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d7
            r2 = 0
        L_0x01d7:
            r8[r3] = r2
            r3 = 5
            float r2 = r5.A01
            if (r10 == 0) goto L_0x028c
            float r0 = r10.bottom
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01e4:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x01ee
            r2 = 0
        L_0x01ee:
            r8[r3] = r2
            r3 = 6
            X.W08 r4 = r4.A00
            float r2 = r4.A00
            if (r10 == 0) goto L_0x0289
            float r0 = r10.left
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x01fd:
            float r0 = X.C13989Tnp.A05(r0)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0207
            r2 = 0
        L_0x0207:
            r8[r3] = r2
            r3 = 7
            float r2 = r4.A01
            if (r10 == 0) goto L_0x0214
            float r0 = r10.bottom
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
        L_0x0214:
            float r0 = X.C13989Tnp.A05(r6)
            float r2 = r2 - r0
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x021e
            r2 = 0
        L_0x021e:
            r8[r3] = r2
            r6 = r8
        L_0x0221:
            float r0 = r1.A04
            float r2 = X.W2U.A01(r0)
            float r0 = r1.A05
            float r4 = X.W2U.A01(r0)
            float r0 = r1.A06
            float r8 = X.W2U.A01(r0)
            android.graphics.RectF r15 = new android.graphics.RectF
            r15.<init>(r9)
            r15.inset(r8, r8)
            r15.offset(r2, r4)
            float r0 = r1.A03
            float r0 = X.C18808W3f.A00(r0)
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r15)
            float r0 = -r0
            r13.inset(r0, r0)
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0254
            r13.inset(r8, r8)
        L_0x0254:
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r13)
            float r2 = -r2
            float r0 = -r4
            r3.offset(r2, r0)
            r13.union(r3)
            int r5 = r12.save()
            if (r6 == 0) goto L_0x03bd
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            android.graphics.Path$Direction r0 = android.graphics.Path.Direction.CW
            r2.addRoundRect(r9, r6, r0)
            r12.clipPath(r2)
            int r4 = r6.length
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r4)
        L_0x027a:
            if (r7 >= r4) goto L_0x03c5
            r2 = r6[r7]
            float r0 = -r8
            float r0 = X.V6F.A00(r2, r0)
            X.JTP.A1V(r3, r0)
            int r7 = r7 + 1
            goto L_0x027a
        L_0x0289:
            r0 = r6
            goto L_0x01fd
        L_0x028c:
            r0 = r6
            goto L_0x01e4
        L_0x028f:
            r0 = r6
            goto L_0x01cd
        L_0x0292:
            r0 = r6
            goto L_0x01b4
        L_0x0295:
            r0 = r6
            goto L_0x019d
        L_0x0298:
            r0 = r6
            goto L_0x0183
        L_0x029b:
            r0 = r6
            goto L_0x016d
        L_0x029e:
            r0 = 0
            goto L_0x0153
        L_0x02a1:
            r0 = 0
            goto L_0x0147
        L_0x02a4:
            r0 = 0
            goto L_0x013b
        L_0x02a7:
            r0 = 0
            goto L_0x012f
        L_0x02aa:
            float r7 = r0.floatValue()
            goto L_0x00b4
        L_0x02b0:
            float r6 = r0.floatValue()
            goto L_0x008b
        L_0x02b6:
            if (r0 != 0) goto L_0x030b
            X.UyB r0 = X.C16615UyB.A09
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x030b
            X.UyB r0 = X.C16615UyB.A08
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x030b
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x030b
            r6 = 0
        L_0x02d1:
            X.UyB r0 = X.C16615UyB.A05
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0306
            X.UyB r0 = X.C16615UyB.A0C
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0306
            X.UyB r0 = X.C16615UyB.A03
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0306
            X.UyB r0 = X.C16615UyB.A0D
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0306
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0306
            r7 = 0
        L_0x02fa:
            X.UyB r0 = X.C16615UyB.A0B
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x0310
            X.UyB r0 = X.C16615UyB.A0A
            goto L_0x00be
        L_0x0306:
            float r7 = r0.floatValue()
            goto L_0x02fa
        L_0x030b:
            float r6 = r0.floatValue()
            goto L_0x02d1
        L_0x0310:
            float r8 = r0.floatValue()
            goto L_0x00d5
        L_0x0316:
            java.lang.Float[] r2 = r7.A00
            X.UyB r0 = X.C16615UyB.A0B
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b5
            X.UyB r0 = X.C16615UyB.A09
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b5
            X.UyB r0 = X.C16615UyB.A08
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b5
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b5
            r6 = 0
        L_0x0339:
            X.UyB r0 = X.C16615UyB.A05
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b0
            X.UyB r0 = X.C16615UyB.A0C
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b0
            X.UyB r0 = X.C16615UyB.A03
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b0
            X.UyB r0 = X.C16615UyB.A0D
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b0
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03b0
            r7 = 0
        L_0x0362:
            X.UyB r0 = X.C16615UyB.A07
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03ab
            X.UyB r0 = X.C16615UyB.A0A
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03ab
            X.UyB r0 = X.C16615UyB.A08
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03ab
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x03ab
            r8 = 0
        L_0x0383:
            X.UyB r0 = X.C16615UyB.A04
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A06
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A03
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A0D
            java.lang.Float r0 = A00(r0, r2)
            if (r0 != 0) goto L_0x00fd
            X.UyB r0 = X.C16615UyB.A02
            java.lang.Float r0 = A00(r0, r2)
            goto L_0x00fb
        L_0x03ab:
            float r8 = r0.floatValue()
            goto L_0x0383
        L_0x03b0:
            float r7 = r0.floatValue()
            goto L_0x0362
        L_0x03b5:
            float r6 = r0.floatValue()
            goto L_0x0339
        L_0x03ba:
            r10 = 0
            goto L_0x0123
        L_0x03bd:
            r12.clipRect(r9)
            float[] r14 = X.VJe.A00
            r16 = r14
            goto L_0x03cb
        L_0x03c5:
            float[] r16 = X.00k.A0w(r3)
            float[] r14 = X.VJe.A00
        L_0x03cb:
            android.graphics.Paint r0 = r1.A08
            r17 = r0
            r12.drawDoubleRoundRect(r13, r14, r15, r16, r17)
            r12.restoreToCount(r5)
            return
        L_0x03d6:
            java.lang.String r1 = "Expected resolved layout direction"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U13.draw(android.graphics.Canvas):void");
    }

    public final C18659VwF A01() {
        return this.A01;
    }

    public final void A02(C17179VLj vLj) {
        if (!0qQ.A0K(vLj, this.A00)) {
            this.A00 = vLj;
            invalidateSelf();
        }
    }

    public final void A03(C18659VwF vwF) {
        if (!vwF.equals(this.A01)) {
            this.A01 = vwF;
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        int alpha = Color.alpha(this.A07);
        if (alpha == 0) {
            return -2;
        }
        return AnonymousClass7TE.A06((((float) this.A08.getAlpha()) / 255.0f) / (((float) alpha) / 255.0f), 255.0f);
    }

    public final void setAlpha(int i) {
        this.A08.setAlpha(AnonymousClass7TE.A06((((float) i) / 255.0f) * (((float) Color.alpha(this.A07)) / 255.0f), 255.0f));
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public U13(Context context, C17179VLj vLj, C18659VwF vwF, float f, float f2, float f3, float f4, int i) {
        this.A02 = context;
        this.A07 = i;
        this.A04 = f;
        this.A05 = f2;
        this.A03 = f3;
        this.A06 = f4;
        this.A01 = vwF;
        this.A00 = vLj;
        Paint paint = new Paint();
        paint.setColor(i);
        if (f3 > 0.0f) {
            paint.setMaskFilter(new BlurMaskFilter(C18808W3f.A00(f3 * 0.5f), BlurMaskFilter.Blur.NORMAL));
        }
        this.A08 = paint;
    }

    public static Float A00(Enum enumR, Float[] fArr) {
        return fArr[enumR.ordinal()];
    }
}
