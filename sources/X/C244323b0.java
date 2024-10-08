package X;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3b0  reason: invalid class name and case insensitive filesystem */
public final class C244323b0 extends Drawable implements Drawable.Callback {
    public Bitmap A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Integer A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;
    public final int A09;
    public final int A0A;
    public final Paint A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C244323b0(android.content.Context r10, java.lang.Integer r11, java.util.List r12, float r13, int r14, boolean r15) {
        /*
            r9 = this;
            r4 = r12
            if (r15 == 0) goto L_0x000f
            r8 = 0
        L_0x0004:
            r2 = 0
            r0 = r9
            r1 = r10
            r3 = r11
            r5 = r13
            r6 = r14
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x000f:
            int r0 = r12.size()
            int r8 = r0 + -1
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244323b0.<init>(android.content.Context, java.lang.Integer, java.util.List, float, int, boolean):void");
    }

    public final int getOpacity() {
        return -3;
    }

    public final void invalidateDrawable(Drawable drawable) {
        this.A01 = true;
        invalidateSelf();
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    public static void A00(List list, List list2) {
        ArrayList arrayList = new ArrayList(list2);
        list2.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            list2.add(arrayList.get(((Number) it.next()).intValue()));
        }
    }

    public final int getIntrinsicHeight() {
        return this.A09;
    }

    public final int getIntrinsicWidth() {
        return this.A0A;
    }

    public final void setAlpha(int i) {
        for (Drawable alpha : this.A05) {
            alpha.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        for (Drawable colorFilter2 : this.A05) {
            colorFilter2.setColorFilter(colorFilter);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd A[EDGE_INSN: B:44:0x00cd->B:37:0x00cd ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r12) {
        /*
            r11 = this;
            android.graphics.Rect r4 = r11.getBounds()
            int r0 = r4.width()
            if (r0 <= 0) goto L_0x00f4
            int r0 = r4.height()
            if (r0 <= 0) goto L_0x00f4
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x00cd
            android.graphics.Bitmap r0 = r11.A00
            r3 = 0
            if (r0 == 0) goto L_0x00bb
            int r1 = r0.getWidth()
            int r0 = r4.width()
            if (r1 != r0) goto L_0x00b6
            android.graphics.Bitmap r0 = r11.A00
            int r1 = r0.getHeight()
            int r0 = r4.height()
            if (r1 != r0) goto L_0x00b6
            android.graphics.Bitmap r0 = r11.A00
            r0.eraseColor(r3)
        L_0x0034:
            android.graphics.Bitmap r0 = r11.A00
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r0)
            int r1 = r11.A03
            int r0 = r11.A02
            int r1 = r1 - r0
            float r5 = (float) r1
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
        L_0x0044:
            java.util.List r7 = r11.A05
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00cd
            java.util.List r0 = r11.A06
            java.lang.Object r0 = r0.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = r0.intValue()
            java.util.List r0 = r11.A08
            java.lang.Object r0 = r0.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r9 = r0.intValue()
            java.util.List r0 = r11.A07
            java.lang.Object r0 = r0.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            r6.save()
            java.lang.Integer r0 = r11.A04
            int r1 = r0.intValue()
            r8 = 1
            r0 = 2
            if (r1 == r0) goto L_0x00ae
            if (r1 == r8) goto L_0x00b0
            r0 = 3
            r2 = 0
            if (r1 == r0) goto L_0x00a1
            r0 = 0
            if (r1 != r0) goto L_0x0092
            float r1 = (float) r10
            int r0 = r7.size()
            int r0 = r0 - r8
            if (r3 == r0) goto L_0x008f
            r2 = r5
        L_0x008f:
            r6.translate(r1, r2)
        L_0x0092:
            java.lang.Object r0 = r7.get(r3)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r0.draw(r6)
            r6.restore()
            int r3 = r3 + 1
            goto L_0x0044
        L_0x00a1:
            int r0 = r7.size()
            int r0 = r0 - r8
            if (r3 == r0) goto L_0x00a9
            r2 = r5
        L_0x00a9:
            float r0 = (float) r9
            r6.translate(r2, r0)
            goto L_0x0092
        L_0x00ae:
            float r1 = (float) r2
            goto L_0x00b1
        L_0x00b0:
            float r1 = (float) r10
        L_0x00b1:
            float r0 = (float) r9
            r6.translate(r1, r0)
            goto L_0x0092
        L_0x00b6:
            android.graphics.Bitmap r0 = r11.A00
            r0.recycle()
        L_0x00bb:
            int r2 = r4.width()
            int r1 = r4.height()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)
            r11.A00 = r0
            goto L_0x0034
        L_0x00cd:
            android.graphics.Bitmap r0 = r11.A00
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L_0x00e5
            android.graphics.Bitmap r3 = r11.A00
            int r0 = r4.left
            float r2 = (float) r0
            int r0 = r4.top
            float r1 = (float) r0
            android.graphics.Paint r0 = r11.A0B
            r12.drawBitmap(r3, r2, r1, r0)
            return
        L_0x00e5:
            r0 = 2408(0x968, float:3.374E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2701(0xa8d, float:3.785E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r1, r0)
        L_0x00f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244323b0.draw(android.graphics.Canvas):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0137, code lost:
        if (r9 < 0) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C244323b0(android.content.Context r19, java.lang.Integer r20, java.lang.Integer r21, java.util.List r22, float r23, int r24, int r25, int r26) {
        /*
            r18 = this;
            r13 = r18
            r13.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r13.A05 = r2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A06 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A07 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.A08 = r0
            r1 = 3
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r1)
            r13.A0B = r0
            r10 = 1
            r13.A01 = r10
            r12 = r24
            r13.A03 = r12
            r11 = r25
            r13.A02 = r11
            r17 = r21
            r0 = r17
            r13.A04 = r0
            boolean r0 = X.0mk.A02(r19)
            r15 = r22
            if (r0 == 0) goto L_0x012b
            java.util.Collections.reverse(r15)
            int r9 = r15.size()
            int r9 = r9 - r10
            int r9 = r9 - r26
        L_0x004c:
            r2.addAll(r15)
            boolean r0 = r15.isEmpty()
            if (r0 != 0) goto L_0x0177
            float r14 = (float) r11
            r0 = r23
            float r0 = -r0
            float r14 = r14 * r0
            int r8 = r15.size()
            int r8 = r8 - r10
            int r8 = r8 * r25
            int r1 = r15.size()
            int r1 = r1 - r10
            int r0 = java.lang.Math.round(r14)
            int r1 = r1 * r0
            int r8 = r8 + r1
            if (r11 <= r12) goto L_0x0071
            int r0 = r25 - r24
            int r8 = r8 - r0
        L_0x0071:
            r7 = 0
            r6 = 0
            r5 = 0
            r4 = 0
            r3 = 0
        L_0x0076:
            int r0 = r15.size()
            if (r7 >= r0) goto L_0x012f
            java.lang.Object r2 = r15.get(r7)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r2.setCallback(r13)
            r1 = r11
            if (r7 != r9) goto L_0x0089
            r1 = r12
        L_0x0089:
            if (r20 == 0) goto L_0x0125
            int r16 = r20.intValue()
            if (r16 <= 0) goto L_0x0125
            int r0 = r15.size()
            int r0 = r0 + -1
            r6 = r1
            if (r7 != r0) goto L_0x009c
            r6 = r16
        L_0x009c:
            r0 = 0
            r2.setBounds(r0, r0, r6, r1)
        L_0x00a0:
            java.util.List r1 = r13.A07
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r1.add(r0)
            java.util.List r1 = r13.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.add(r0)
            java.util.List r1 = r13.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.add(r0)
            int r1 = r17.intValue()
            r0 = 2
            android.graphics.Rect r6 = r2.getBounds()
            int r6 = r6.width()
            int r6 = r6 + r4
            android.graphics.Rect r16 = r2.getBounds()
            if (r1 == r0) goto L_0x0110
            int r0 = r16.height()
            if (r1 == r10) goto L_0x010d
            int r5 = java.lang.Math.max(r5, r0)
        L_0x00d9:
            r0 = 0
        L_0x00da:
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.width()
            int r4 = r4 + r1
            float r1 = (float) r4
            float r1 = r1 + r14
            int r4 = java.lang.Math.round(r1)
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.height()
            int r3 = r3 + r1
            float r1 = (float) r3
            float r1 = r1 + r14
            int r3 = java.lang.Math.round(r1)
            android.graphics.Rect r1 = r2.getBounds()
            int r1 = r1.width()
            int r8 = r8 - r1
            float r1 = (float) r8
            float r1 = r1 - r14
            float r0 = (float) r0
            float r1 = r1 + r0
            int r8 = java.lang.Math.round(r1)
            int r7 = r7 + 1
            goto L_0x0076
        L_0x010d:
            int r5 = r3 + r0
            goto L_0x00d9
        L_0x0110:
            int r0 = r16.height()
            int r5 = r3 + r0
            int r1 = r7 + 1
            int r0 = r15.size()
            int r0 = r0 + -1
            if (r1 != r0) goto L_0x00d9
            int r0 = r25 - r24
            if (r11 > r12) goto L_0x00da
            goto L_0x00d9
        L_0x0125:
            r0 = 0
            r2.setBounds(r0, r0, r1, r1)
            goto L_0x00a0
        L_0x012b:
            r9 = r26
            goto L_0x004c
        L_0x012f:
            int r3 = r15.size()
            r2 = 0
            if (r3 <= r9) goto L_0x0139
            r0 = 1
            if (r9 >= 0) goto L_0x013a
        L_0x0139:
            r0 = 0
        L_0x013a:
            X.17k.A0E(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
        L_0x0142:
            if (r2 >= r9) goto L_0x014e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.add(r0)
            int r2 = r2 + 1
            goto L_0x0142
        L_0x014e:
            int r3 = r3 - r10
        L_0x014f:
            if (r3 <= r9) goto L_0x015b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.add(r0)
            int r3 = r3 + -1
            goto L_0x014f
        L_0x015b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.add(r0)
            java.util.List r0 = r13.A05
            A00(r1, r0)
            java.util.List r0 = r13.A08
            A00(r1, r0)
            java.util.List r0 = r13.A06
            A00(r1, r0)
            java.util.List r0 = r13.A07
            A00(r1, r0)
            goto L_0x0179
        L_0x0177:
            r5 = 0
            r6 = 0
        L_0x0179:
            r13.A09 = r5
            r13.A0A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244323b0.<init>(android.content.Context, java.lang.Integer, java.lang.Integer, java.util.List, float, int, int, int):void");
    }
}
