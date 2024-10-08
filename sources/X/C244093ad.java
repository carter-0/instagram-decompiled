package X;

import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.text.BreakIterator;

/* renamed from: X.3ad  reason: invalid class name and case insensitive filesystem */
public abstract class C244093ad {
    public static final int A00;
    public static final ColorStateList A01;
    public static final Path A02 = new Path();
    public static final Rect A03 = new Rect();
    public static final RectF A04 = new RectF();
    public static final Typeface A05;
    public static final Integer A06 = AnonymousClass05K.A00;
    public static final Typeface A07;
    public static final int[] A08;
    public static final int[][] A09;

    public static CharSequence A01(Layout layout, Layout layout2, CharSequence charSequence, CharSequence charSequence2, float f, int i, boolean z, boolean z2) {
        int lineStart;
        CharSequence charSequence3 = charSequence;
        float lineWidth = layout2.getLineWidth(0);
        int i2 = i;
        boolean z3 = z2;
        if (!z2) {
            if (z) {
                lineWidth = f - lineWidth;
            } else {
                lineWidth = (f - lineWidth) + (f - layout.getLineWidth(i2));
            }
        } else if (z) {
            lineWidth -= f - layout.getLineWidth(i2);
        }
        TextPaint paint = layout.getPaint();
        0qQ.A07(paint);
        int lineStart2 = layout.getLineStart(i2);
        int lineEnd = layout.getLineEnd(i2);
        int offsetForAdvance = paint.getOffsetForAdvance(charSequence3, lineStart2, lineEnd, lineStart2, lineEnd, z3, lineWidth);
        if (offsetForAdvance <= 0) {
            return charSequence3;
        }
        int i3 = offsetForAdvance - 1;
        if (layout.getEllipsisCount(i2) > 0 && i3 > (lineStart = layout.getLineStart(i2) + layout.getEllipsisStart(i2))) {
            i3 = lineStart;
        }
        if (i3 < 0) {
            i3 = 0;
        } else if (i3 > charSequence.length()) {
            i3 = charSequence.length();
        } else if (!(!Character.isSurrogate(charSequence.charAt(i3)) || i3 == 0 || i3 == charSequence.length())) {
            if (Build.VERSION.SDK_INT >= 29) {
                i3 = F40.A01(charSequence, i3);
            } else {
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(charSequence.toString());
                i3 = characterInstance.preceding(i3);
            }
        }
        return TextUtils.concat(new CharSequence[]{charSequence.subSequence(0, i3), charSequence2});
    }

    static {
        Typeface typeface = Typeface.DEFAULT;
        A07 = typeface;
        int[][] iArr = {new int[]{0}};
        A09 = iArr;
        int[] iArr2 = {-16777216};
        A08 = iArr2;
        A01 = new ColorStateList(iArr, iArr2);
        A00 = typeface.getStyle();
        A05 = typeface;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01a9, code lost:
        if (r6.Cb2(r15, 0, r15.length()) != false) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01ab, code lost:
        r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01cd, code lost:
        return r3.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ce, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01de, code lost:
        throw new java.lang.RuntimeException(X.002.A0R("text: ", r15.toString()), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016f, code lost:
        r1 = android.text.Layout.Alignment.ALIGN_NORMAL;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0173, code lost:
        if (r2.A0E == r1) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0175, code lost:
        r2.A0E = r1;
        r3.A04 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0185, code lost:
        if (r5 == r6.Cb2(r15, 0, r15.length())) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0193, code lost:
        if (r5 == r6.Cb2(r15, 0, r15.length())) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x019e, code lost:
        if (r6.Cb2(r15, 0, r15.length()) != false) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A00(android.content.res.ColorStateList r10, android.graphics.Typeface r11, android.text.TextUtils.TruncateAt r12, X.2V1 r13, X.C245033cB r14, java.lang.CharSequence r15, java.lang.Integer r16, float r17, float r18, float r19, float r20, float r21, float r22, float r23, int r24, int r25, int r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, int r34, int r35, int r36, int r37, boolean r38, boolean r39) {
        /*
            r0 = r29
            r5 = 0
            X.3cU r3 = new X.3cU
            r3.<init>()
            r7 = 0
            r3.A05 = r7
            int r2 = android.view.View.MeasureSpec.getMode(r24)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r1) goto L_0x01c6
            if (r2 == 0) goto L_0x001a
            r1 = 1073741824(0x40000000, float:2.0)
            if (r2 != r1) goto L_0x01df
            r7 = 1
        L_0x001a:
            r4 = r25
            if (r12 != 0) goto L_0x0025
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r1) goto L_0x0025
            android.text.TextUtils$TruncateAt r12 = android.text.TextUtils.TruncateAt.END
        L_0x0025:
            X.3cV r2 = r3.A06
            android.text.TextPaint r1 = r2.A0F
            float r1 = r1.density
            r6 = r22
            int r1 = (r1 > r22 ? 1 : (r1 == r22 ? 0 : -1))
            if (r1 == 0) goto L_0x003b
            r2.A00()
            android.text.TextPaint r1 = r2.A0F
            r1.density = r6
            r1 = 0
            r3.A04 = r1
        L_0x003b:
            android.text.TextUtils$TruncateAt r1 = r2.A0G
            if (r1 == r12) goto L_0x0044
            r2.A0G = r12
            r1 = 0
            r3.A04 = r1
        L_0x0044:
            int r1 = r2.A0A
            if (r1 == r4) goto L_0x004d
            r2.A0A = r4
            r1 = 0
            r3.A04 = r1
        L_0x004d:
            r2.A00()
            r9 = r17
            r2.A03 = r9
            r8 = r18
            r2.A01 = r8
            r6 = r19
            r2.A02 = r6
            r4 = r26
            r2.A09 = r4
            android.text.TextPaint r1 = r2.A0F
            r1.setShadowLayer(r9, r8, r6, r4)
            r4 = 0
            r3.A04 = r4
            boolean r1 = r2.A0M
            r6 = r39
            if (r1 == r6) goto L_0x0072
            r2.A0M = r6
            r3.A04 = r4
        L_0x0072:
            r3.A05(r15)
            int r6 = android.view.View.MeasureSpec.getSize(r24)
            int r1 = r2.A0C
            if (r1 != r6) goto L_0x0081
            int r1 = r2.A0B
            if (r1 == r7) goto L_0x0087
        L_0x0081:
            r2.A0C = r6
            r2.A0B = r7
            r3.A04 = r4
        L_0x0087:
            boolean r1 = r2.A0J
            r6 = r38
            if (r1 == r6) goto L_0x0091
            r2.A0J = r6
            r3.A04 = r4
        L_0x0091:
            float r6 = r2.A00
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00a6
            float r1 = r2.A04
            r7 = r20
            int r1 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r1 == 0) goto L_0x00a6
            r2.A04 = r7
            r3.A04 = r4
        L_0x00a6:
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x00b9
            float r1 = r2.A05
            r6 = r21
            int r1 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x00b9
            r2.A05 = r6
            r3.A04 = r4
        L_0x00b9:
            android.text.TextPaint r1 = r2.A0F
            int r1 = r1.linkColor
            r6 = r28
            if (r1 == r6) goto L_0x00ca
            r2.A00()
            android.text.TextPaint r1 = r2.A0F
            r1.linkColor = r6
            r3.A04 = r4
        L_0x00ca:
            int r1 = r2.A08
            r6 = r37
            if (r1 == r6) goto L_0x00d4
            r2.A08 = r6
            r3.A04 = r4
        L_0x00d4:
            int r1 = r2.A06
            r6 = r35
            if (r1 == r6) goto L_0x00de
            r2.A06 = r6
            r3.A04 = r4
        L_0x00de:
            int r1 = r2.A07
            r6 = r36
            if (r1 == r6) goto L_0x00e8
            r2.A07 = r6
            r3.A04 = r4
        L_0x00e8:
            r6 = -1
            if (r0 != r6) goto L_0x00fc
            X.2V4 r0 = r13.A0D
            r1 = 1096810496(0x41600000, float:14.0)
            android.content.res.Resources r0 = r0.A01
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.scaledDensity
            float r1 = r1 * r0
            int r0 = X.AnonymousClass2Tt.A00(r1)
        L_0x00fc:
            r3.A03(r0)
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1 = r23
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x010b
            r3.A01(r1)
        L_0x010b:
            android.text.TextPaint r0 = r2.A0F
            float r0 = r0.getLetterSpacing()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x011f
            r2.A00()
            android.text.TextPaint r0 = r2.A0F
            r0.setLetterSpacing(r5)
            r3.A04 = r4
        L_0x011f:
            r0 = r31
            if (r0 == r6) goto L_0x01bf
            r3.A02 = r0
            r0 = 1
        L_0x0126:
            r3.A03 = r0
            r0 = r32
            if (r0 == r6) goto L_0x01b8
            r3.A00 = r0
            r0 = 1
        L_0x012f:
            r3.A01 = r0
            r0 = r27
            if (r27 == 0) goto L_0x01b4
            r3.A02(r0)
        L_0x0138:
            android.graphics.Typeface r0 = A07
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x0144
            android.graphics.Typeface r11 = android.graphics.Typeface.defaultFromStyle(r30)
        L_0x0144:
            android.text.TextPaint r0 = r2.A0F
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == r11) goto L_0x0156
            r2.A00()
            android.text.TextPaint r0 = r2.A0F
            r0.setTypeface(r11)
            r3.A04 = r4
        L_0x0156:
            X.3cB r7 = X.C245033cB.RTL
            if (r14 != r7) goto L_0x01b1
            X.3cZ r6 = X.C245223cW.A02
        L_0x015c:
            X.3cZ r0 = r2.A0H
            if (r0 == r6) goto L_0x0164
            r2.A0H = r6
            r3.A04 = r4
        L_0x0164:
            X.3ce r0 = X.C245303ce.$redex_init_class
            int r0 = r16.intValue()
            r5 = 1
            r1 = 0
            switch(r0) {
                case 1: goto L_0x01ab;
                case 2: goto L_0x01ae;
                case 3: goto L_0x0188;
                case 4: goto L_0x017a;
                case 5: goto L_0x01a1;
                case 6: goto L_0x0196;
                default: goto L_0x016f;
            }
        L_0x016f:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x0171:
            android.text.Layout$Alignment r0 = r2.A0E
            if (r0 == r1) goto L_0x01c9
            r2.A0E = r1
            r3.A04 = r4
            goto L_0x01c9
        L_0x017a:
            if (r14 == r7) goto L_0x017d
            r5 = 0
        L_0x017d:
            int r0 = r15.length()
            boolean r0 = r6.Cb2(r15, r1, r0)
            if (r5 != r0) goto L_0x016f
            goto L_0x01ab
        L_0x0188:
            if (r14 == r7) goto L_0x018b
            r5 = 0
        L_0x018b:
            int r0 = r15.length()
            boolean r0 = r6.Cb2(r15, r1, r0)
            if (r5 != r0) goto L_0x01ab
            goto L_0x016f
        L_0x0196:
            int r0 = r15.length()
            boolean r0 = r6.Cb2(r15, r1, r0)
            if (r0 == 0) goto L_0x01ab
            goto L_0x016f
        L_0x01a1:
            int r0 = r15.length()
            boolean r0 = r6.Cb2(r15, r1, r0)
            if (r0 == 0) goto L_0x016f
        L_0x01ab:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x0171
        L_0x01ae:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x0171
        L_0x01b1:
            X.3cZ r6 = X.C245223cW.A01
            goto L_0x015c
        L_0x01b4:
            r3.A04(r10)
            goto L_0x0138
        L_0x01b8:
            r0 = r34
            r3.A00 = r0
            r0 = 2
            goto L_0x012f
        L_0x01bf:
            r0 = r33
            r3.A02 = r0
            r0 = 2
            goto L_0x0126
        L_0x01c6:
            r7 = 2
            goto L_0x001a
        L_0x01c9:
            android.text.Layout r0 = r3.A00()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x01ce }
            return r0
        L_0x01ce:
            r2 = move-exception
            java.lang.String r1 = "text: "
            java.lang.String r0 = r15.toString()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r2)
            throw r1
        L_0x01df:
            r0 = 2523(0x9db, float:3.535E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = android.view.View.MeasureSpec.getMode(r24)
            java.lang.String r0 = X.002.A0O(r1, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244093ad.A00(android.content.res.ColorStateList, android.graphics.Typeface, android.text.TextUtils$TruncateAt, X.2V1, X.3cB, java.lang.CharSequence, java.lang.Integer, float, float, float, float, float, float, float, int, int, int, int, int, int, int, int, int, int, int, int, int, int, boolean, boolean):android.text.Layout");
    }
}
