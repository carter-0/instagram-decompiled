package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.5iJ  reason: invalid class name and case insensitive filesystem */
public final class C292045iJ implements C292055iK {
    public final long A00;
    public final C292075iM A01;
    public final C291835hx A02;
    public final CharSequence A03;
    public final List A04;
    public final int A05;

    public final void E1c(C304786Ff r6, AnonymousClass5QA r7, C291805hu r8, C289645dx r9, C291795ht r10, float f, int i) {
        C291855hz r3 = this.A02.A05;
        int i2 = r3.A00;
        r3.A03(r6, f, C288015bE.A00((float) Constraints.A01(this.A00), BCs()));
        r3.A04(r8);
        r3.A06(r10);
        r3.A05(r9);
        r3.A01(3);
        A00(r7, this);
        r3.A01(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0256, code lost:
        if (r12 <= r6.A01.A09.getEllipsisStart(r13)) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02ad, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02ae, code lost:
        r5 = new X.AnonymousClass5VN(r3, r1, r2, ((float) r5.A00()) + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0308, code lost:
        r1 = r1 - ((float) r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C292045iJ(X.C291835hx r31, int r32, long r33, boolean r35) {
        /*
            r30 = this;
            r6 = r30
            r6.<init>()
            r7 = r31
            r6.A02 = r7
            r5 = r32
            r6.A05 = r5
            r11 = r33
            r6.A00 = r11
            int r0 = androidx.compose.ui.unit.Constraints.A02(r11)
            r4 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0329
            int r0 = androidx.compose.ui.unit.Constraints.A03(r11)
            if (r0 != 0) goto L_0x0329
            if (r5 < r3) goto L_0x0321
            X.5Z4 r2 = r7.A02
            r13 = 0
            if (r35 == 0) goto L_0x0049
            X.5ZB r0 = r2.A02
            long r0 = r0.A02
            long r9 = X.AnonymousClass5Z7.A01(r4)
            X.5Z6[] r8 = X.AnonymousClass5Z5.A02
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0049
            long r9 = X.AnonymousClass5Z5.A01
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x0049
            X.5ZC r0 = r2.A00
            int r1 = r0.A02
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r0) goto L_0x0049
            r0 = 5
            if (r1 == r0) goto L_0x0049
            r0 = 4
            if (r1 == r0) goto L_0x0049
            r13 = 1
        L_0x0049:
            java.lang.CharSequence r0 = r7.A06
            if (r13 == 0) goto L_0x0073
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0073
            boolean r1 = r0 instanceof android.text.Spannable
            if (r1 != 0) goto L_0x005d
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            r0 = r1
        L_0x005d:
            android.text.Spannable r0 = (android.text.Spannable) r0
            X.I9o r9 = new X.I9o
            r9.<init>()
            int r8 = r0.length()
            int r8 = r8 - r3
            int r7 = r0.length()
            int r7 = r7 - r3
            r1 = 33
            r0.setSpan(r9, r8, r7, r1)
        L_0x0073:
            r6.A03 = r0
            X.5ZC r7 = r2.A00
            int r8 = r7.A02
            r22 = 3
            if (r8 == r3) goto L_0x0084
            r22 = 0
            r1 = 2
            if (r8 != r1) goto L_0x013a
            r22 = 4
        L_0x0084:
            r1 = 4
            r29 = 0
            if (r8 != r1) goto L_0x008b
            r29 = 1
        L_0x008b:
            int r1 = r7.A00
            int r28 = X.C292065iL.A00(r1)
            int r8 = r7.A01
            r7 = r8 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r7 != r3) goto L_0x0099
            r1 = 1
        L_0x0099:
            r25 = 0
            if (r1 != 0) goto L_0x00a2
            r1 = 2
            if (r7 != r1) goto L_0x0133
            r25 = 1
        L_0x00a2:
            int r1 = r8 >> 8
            r7 = r1 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r7 != r3) goto L_0x00aa
            r1 = 1
        L_0x00aa:
            r26 = 0
            if (r1 != 0) goto L_0x00b3
            r1 = 2
            if (r7 != r1) goto L_0x0127
            r26 = 1
        L_0x00b3:
            int r1 = r8 >> 16
            r7 = r1 & 255(0xff, float:3.57E-43)
            r1 = 0
            if (r7 != r3) goto L_0x00bb
            r1 = 1
        L_0x00bb:
            r27 = 0
            if (r1 != 0) goto L_0x00c4
            r1 = 2
            if (r7 != r1) goto L_0x00c4
            r27 = 1
        L_0x00c4:
            r15 = 0
            if (r35 == 0) goto L_0x0124
            android.text.TextUtils$TruncateAt r18 = android.text.TextUtils.TruncateAt.END
        L_0x00c9:
            long r7 = r6.A00
            int r1 = androidx.compose.ui.unit.Constraints.A01(r7)
            float r10 = (float) r1
            X.5hx r1 = r6.A02
            X.5hz r9 = r1.A05
            int r8 = r1.A01
            X.5iA r1 = r1.A03
            X.5i8 r7 = X.C291935i7.A00
            X.5iM r7 = new X.5iM
            r17 = r9
            r19 = r1
            r20 = r0
            r21 = r10
            r23 = r8
            r24 = r5
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r35 == 0) goto L_0x014b
            boolean r0 = r7.A0B
            android.text.Layout r1 = r7.A09
            if (r0 == 0) goto L_0x011f
            int r0 = r7.A06
            int r0 = r0 + -1
            int r1 = r1.getLineBottom(r0)
        L_0x00fd:
            int r0 = r7.A07
            int r1 = r1 + r0
            int r0 = r7.A04
            int r1 = r1 + r0
            int r0 = r7.A05
            int r1 = r1 + r0
            int r8 = androidx.compose.ui.unit.Constraints.A00(r11)
            if (r1 <= r8) goto L_0x014b
            if (r5 <= r3) goto L_0x014b
            int r9 = r7.A06
            r1 = 0
        L_0x0111:
            if (r1 >= r9) goto L_0x014e
            float r10 = r7.A01(r1)
            float r0 = (float) r8
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x014f
            int r1 = r1 + 1
            goto L_0x0111
        L_0x011f:
            int r1 = r1.getHeight()
            goto L_0x00fd
        L_0x0124:
            r18 = r15
            goto L_0x00c9
        L_0x0127:
            r1 = 3
            if (r7 != r1) goto L_0x012d
            r26 = 2
            goto L_0x00b3
        L_0x012d:
            r1 = 4
            if (r7 != r1) goto L_0x00b3
            r26 = 3
            goto L_0x00b3
        L_0x0133:
            r1 = 3
            if (r7 != r1) goto L_0x00a2
            r25 = 2
            goto L_0x00a2
        L_0x013a:
            r1 = 3
            if (r8 != r1) goto L_0x0141
            r22 = 2
            goto L_0x0084
        L_0x0141:
            r1 = 5
            if (r8 == r1) goto L_0x0084
            r1 = 6
            if (r8 != r1) goto L_0x0084
            r22 = 1
            goto L_0x0084
        L_0x014b:
            r6.A01 = r7
            goto L_0x017c
        L_0x014e:
            r1 = r9
        L_0x014f:
            if (r1 < 0) goto L_0x017a
            if (r1 == r5) goto L_0x017a
            if (r1 >= r3) goto L_0x0156
            r1 = 1
        L_0x0156:
            java.lang.CharSequence r9 = r6.A03
            long r7 = r6.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r7)
            float r8 = (float) r0
            X.5hx r0 = r6.A02
            X.5hz r5 = r0.A05
            int r3 = r0.A01
            X.5iA r0 = r0.A03
            X.5iM r7 = new X.5iM
            r17 = r5
            r19 = r0
            r20 = r9
            r21 = r8
            r23 = r3
            r24 = r1
            r16 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x017a:
            r6.A01 = r7
        L_0x017c:
            X.5hx r0 = r6.A02
            X.5hz r7 = r0.A05
            X.5ZB r0 = r2.A02
            X.5ZA r5 = r0.A0C
            X.6Ff r3 = r5.AiJ()
            long r0 = r6.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            float r1 = (float) r0
            float r0 = r6.BCs()
            long r1 = X.C288015bE.A00(r1, r0)
            float r0 = r5.AbF()
            r7.A03(r3, r0, r1)
            X.5iM r0 = r6.A01
            android.text.Layout r7 = r0.A09
            java.lang.CharSequence r0 = r7.getText()
            boolean r0 = r0 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0208
            java.lang.CharSequence r5 = r7.getText()
            java.lang.String r3 = "null cannot be cast to non-null type android.text.Spanned"
            X.0qQ.A0C(r5, r3)
            android.text.Spanned r5 = (android.text.Spanned) r5
            java.lang.Class<X.5iV> r2 = X.C292165iV.class
            int r1 = r5.length()
            r0 = -1
            int r1 = r5.nextSpanTransition(r0, r1, r2)
            int r0 = r5.length()
            if (r1 == r0) goto L_0x0208
            java.lang.CharSequence r1 = r7.getText()
            X.0qQ.A0C(r1, r3)
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.CharSequence r0 = r7.getText()
            int r0 = r0.length()
            java.lang.Object[] r0 = r1.getSpans(r4, r0, r2)
            if (r0 == 0) goto L_0x0208
            X.0sC r7 = new X.0sC
            r7.<init>(r0)
        L_0x01e2:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0208
            java.lang.Object r5 = r7.next()
            X.5iV r5 = (X.C292165iV) r5
            long r0 = r6.A00
            int r0 = androidx.compose.ui.unit.Constraints.A01(r0)
            float r1 = (float) r0
            float r0 = r6.BCs()
            long r2 = X.C288015bE.A00(r1, r0)
            X.5Oz r1 = r5.A00
            X.5bF r0 = new X.5bF
            r0.<init>(r2)
            r1.Epw(r0)
            goto L_0x01e2
        L_0x0208:
            java.lang.CharSequence r1 = r6.A03
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 != 0) goto L_0x0213
            X.0sn r11 = X.0sn.A00
        L_0x0210:
            r6.A04 = r11
            return
        L_0x0213:
            r10 = r1
            android.text.Spanned r10 = (android.text.Spanned) r10
            int r1 = r1.length()
            java.lang.Class<X.5iW> r0 = X.C292175iW.class
            java.lang.Object[] r9 = r10.getSpans(r4, r1, r0)
            int r8 = r9.length
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r8)
            r7 = 0
        L_0x0227:
            if (r7 >= r8) goto L_0x0210
            r5 = r9[r7]
            X.5iW r5 = (X.C292175iW) r5
            int r2 = r10.getSpanStart(r5)
            int r12 = r10.getSpanEnd(r5)
            X.5iM r0 = r6.A01
            android.text.Layout r0 = r0.A09
            int r13 = r0.getLineForOffset(r2)
            int r0 = r6.A05
            r14 = 0
            if (r13 < r0) goto L_0x0243
            r14 = 1
        L_0x0243:
            X.5iM r0 = r6.A01
            android.text.Layout r0 = r0.A09
            int r0 = r0.getEllipsisCount(r13)
            if (r0 <= 0) goto L_0x0258
            X.5iM r0 = r6.A01
            android.text.Layout r0 = r0.A09
            int r0 = r0.getEllipsisStart(r13)
            r3 = 1
            if (r12 > r0) goto L_0x0259
        L_0x0258:
            r3 = 0
        L_0x0259:
            X.5iM r0 = r6.A01
            int r1 = r0.A05(r13)
            r0 = 0
            if (r12 <= r1) goto L_0x0263
            r0 = 1
        L_0x0263:
            if (r3 != 0) goto L_0x030f
            if (r0 != 0) goto L_0x030f
            if (r14 != 0) goto L_0x030f
            X.5iM r0 = r6.A01
            android.text.Layout r0 = r0.A09
            boolean r0 = r0.isRtlCharAt(r2)
            if (r0 == 0) goto L_0x030b
            X.GSi r0 = X.C52430GSi.Rtl
        L_0x0275:
            int r1 = r0.ordinal()
            r14 = 2
            X.5iM r0 = r6.A01
            float r3 = r0.A03(r2, r4)
            if (r1 == r4) goto L_0x028a
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0319
            int r0 = r5.A00
            float r0 = (float) r0
            float r3 = r3 - r0
        L_0x028a:
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0311
            int r0 = r5.A00
            float r2 = (float) r0
            float r2 = r2 + r3
            X.5iM r12 = r6.A01
            int r0 = r5.A04
            switch(r0) {
                case 0: goto L_0x0300;
                case 1: goto L_0x02fb;
                case 2: goto L_0x02f2;
                case 3: goto L_0x02df;
                case 4: goto L_0x02d3;
                case 5: goto L_0x02c0;
                default: goto L_0x0299;
            }
        L_0x0299:
            android.graphics.Paint$FontMetricsInt r0 = r5.A01()
            int r1 = r0.ascent
            int r0 = r0.descent
            int r1 = r1 + r0
            int r0 = r5.A00()
            int r1 = r1 - r0
            int r1 = r1 / r14
            float r1 = (float) r1
            float r0 = r12.A00(r13)
        L_0x02ad:
            float r1 = r1 + r0
        L_0x02ae:
            int r0 = r5.A00()
            float r0 = (float) r0
            float r0 = r0 + r1
            X.5VN r5 = new X.5VN
            r5.<init>(r3, r1, r2, r0)
        L_0x02b9:
            r11.add(r5)
            int r7 = r7 + 1
            goto L_0x0227
        L_0x02c0:
            android.graphics.Paint$FontMetricsInt r0 = r5.A01()
            int r0 = r0.descent
            float r1 = (float) r0
            float r0 = r12.A00(r13)
            float r1 = r1 + r0
            int r0 = r5.A00()
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L_0x02ae
        L_0x02d3:
            android.graphics.Paint$FontMetricsInt r0 = r5.A01()
            int r0 = r0.ascent
            float r1 = (float) r0
            float r0 = r12.A00(r13)
            goto L_0x02ad
        L_0x02df:
            float r1 = r12.A02(r13)
            float r0 = r12.A01(r13)
            float r1 = r1 + r0
            int r0 = r5.A00()
            float r0 = (float) r0
            float r1 = r1 - r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            goto L_0x02ae
        L_0x02f2:
            float r1 = r12.A01(r13)
            int r0 = r5.A00()
            goto L_0x0308
        L_0x02fb:
            float r1 = r12.A02(r13)
            goto L_0x02ae
        L_0x0300:
            float r1 = r12.A00(r13)
            int r0 = r5.A00()
        L_0x0308:
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L_0x02ae
        L_0x030b:
            X.GSi r0 = X.C52430GSi.Ltr
            goto L_0x0275
        L_0x030f:
            r5 = r15
            goto L_0x02b9
        L_0x0311:
            java.lang.String r1 = "PlaceholderSpan is not laid out yet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0319:
            java.lang.String r1 = "PlaceholderSpan is not laid out yet."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0321:
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0329:
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C292045iJ.<init>(X.5hx, int, long, boolean):void");
    }

    public final float BCs() {
        int height;
        C292075iM r2 = this.A01;
        boolean z = r2.A0B;
        Layout layout = r2.A09;
        if (z) {
            height = layout.getLineBottom(r2.A06 - 1);
        } else {
            height = layout.getHeight();
        }
        return (float) (height + r2.A07 + r2.A04 + r2.A05);
    }

    public final long Bj9(AnonymousClass5VN r6, C59647JRp jRp, int i) {
        C292075iM r4 = this.A01;
        RectF A012 = I2D.A01(r6);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        int i2 = 0;
        if (!z && i == 1) {
            i2 = 1;
        }
        int[] A07 = r4.A07(A012, new C59344JFw(jRp, 14), i2);
        if (A07 == null) {
            return C285965Tk.A01;
        }
        return C3026964x.A00(A07[0], A07[1]);
    }

    public static final void A00(AnonymousClass5QA r6, C292045iJ r7) {
        Canvas A002 = AnonymousClass5R4.A00(r6);
        C292075iM r62 = r7.A01;
        boolean z = r62.A0B;
        if (z) {
            A002.save();
            A002.clipRect(0.0f, 0.0f, (float) Constraints.A01(r7.A00), r7.BCs());
        }
        if (A002.getClipBounds(r62.A08)) {
            int i = r62.A07;
            if (i != 0) {
                A002.translate(0.0f, (float) i);
            }
            C291985iC r1 = C291975iB.A01;
            r1.A00 = A002;
            r62.A09.draw(r1);
            if (i != 0) {
                A002.translate(0.0f, -1.0f * ((float) i));
            }
        }
        if (z) {
            A002.restore();
        }
    }
}
