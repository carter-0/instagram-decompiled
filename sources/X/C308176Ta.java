package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spannable;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: X.6Ta  reason: invalid class name and case insensitive filesystem */
public abstract class C308176Ta {
    public static final SparseIntArray A00 = new SparseIntArray();
    public static final SparseIntArray A01 = new SparseIntArray();

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01a4, code lost:
        if (r8 == false) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01a6, code lost:
        if (r6 == r5) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01b7, code lost:
        if (r5 != false) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01ba, code lost:
        if (r5 != false) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01bd, code lost:
        if (r8 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01bf, code lost:
        if (r6 == r5) goto L_0x01c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01c1, code lost:
        r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A00(android.content.Context r11, X.AnonymousClass90O r12, java.lang.CharSequence r13, int r14) {
        /*
            X.3cU r4 = new X.3cU
            r4.<init>()
            r5 = 0
            r4.A05 = r5
            int r1 = android.view.View.MeasureSpec.getMode(r14)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 2
            if (r1 == r0) goto L_0x01e8
            if (r1 == 0) goto L_0x01e5
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != r0) goto L_0x01eb
            r8 = 1
        L_0x0018:
            android.text.TextUtils$TruncateAt r2 = r12.A0T
            if (r2 != 0) goto L_0x0025
            int r1 = r12.A0I
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x0025
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
        L_0x0025:
            boolean r0 = r12.A0a
            if (r0 == 0) goto L_0x0033
            int r0 = r12.A0G
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L_0x01e2
            int r0 = r12.A0F
            if (r0 == r1) goto L_0x01e2
        L_0x0033:
            r6 = 0
        L_0x0034:
            android.content.res.Resources r0 = r11.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r1 = r0.density
            X.3cV r3 = r4.A06
            android.text.TextPaint r0 = r3.A0F
            float r0 = r0.density
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0052
            r3.A00()
            android.text.TextPaint r0 = r3.A0F
            r0.density = r1
            r0 = 0
            r4.A04 = r0
        L_0x0052:
            android.text.TextUtils$TruncateAt r0 = r3.A0G
            if (r0 == r2) goto L_0x005b
            r3.A0G = r2
            r0 = 0
            r4.A04 = r0
        L_0x005b:
            int r1 = r12.A0I
            int r0 = r3.A0A
            if (r0 == r1) goto L_0x0066
            r3.A0A = r1
            r0 = 0
            r4.A04 = r0
        L_0x0066:
            float r10 = r12.A08
            float r9 = r12.A06
            float r2 = r12.A07
            int r1 = r12.A0N
            r3.A00()
            r3.A03 = r10
            r3.A01 = r9
            r3.A02 = r2
            r3.A09 = r1
            android.text.TextPaint r0 = r3.A0F
            r0.setShadowLayer(r10, r9, r2, r1)
            r2 = 0
            r4.A04 = r2
            boolean r1 = r12.A0b
            boolean r0 = r3.A0M
            if (r0 == r1) goto L_0x008b
            r3.A0M = r1
            r4.A04 = r2
        L_0x008b:
            r4.A05(r13)
            int r0 = r12.A0P
            r4.A03(r0)
            int r1 = android.view.View.MeasureSpec.getSize(r14)
            int r0 = r3.A0C
            if (r0 != r1) goto L_0x009f
            int r0 = r3.A0B
            if (r0 == r8) goto L_0x00a5
        L_0x009f:
            r3.A0C = r1
            r3.A0B = r8
            r4.A04 = r2
        L_0x00a5:
            boolean r0 = r3.A0J
            if (r0 == r6) goto L_0x00ad
            r3.A0J = r6
            r4.A04 = r2
        L_0x00ad:
            float r1 = r12.A05
            float r6 = r3.A00
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00c2
            float r0 = r3.A04
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c2
            r3.A04 = r1
            r4.A04 = r2
        L_0x00c2:
            float r1 = r12.A04
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x00d5
            float r0 = r3.A05
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d5
            r3.A05 = r1
            r4.A04 = r2
        L_0x00d5:
            int r1 = r12.A0E
            android.text.TextPaint r0 = r3.A0F
            int r0 = r0.linkColor
            if (r0 == r1) goto L_0x00e6
            r3.A00()
            android.text.TextPaint r0 = r3.A0F
            r0.linkColor = r1
            r4.A04 = r2
        L_0x00e6:
            int r1 = r12.A0D
            int r0 = r3.A08
            if (r0 == r1) goto L_0x00f0
            r3.A08 = r1
            r4.A04 = r2
        L_0x00f0:
            int r1 = r12.A09
            int r0 = r3.A06
            if (r0 == r1) goto L_0x00fa
            r3.A06 = r1
            r4.A04 = r2
        L_0x00fa:
            int r1 = r12.A0C
            int r0 = r3.A07
            if (r0 == r1) goto L_0x0104
            r3.A07 = r1
            r4.A04 = r2
        L_0x0104:
            boolean r1 = r12.A0d
            boolean r0 = r3.A0L
            if (r0 == r1) goto L_0x0116
            r3.A0L = r1
            java.lang.CharSequence r0 = r3.A0I
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0116
            r4.A04 = r2
        L_0x0116:
            float r1 = r12.A03
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            r4.A01(r1)
        L_0x0122:
            float r1 = r12.A02
            android.text.TextPaint r0 = r3.A0F
            float r0 = r0.getLetterSpacing()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0138
            r3.A00()
            android.text.TextPaint r0 = r3.A0F
            r0.setLetterSpacing(r1)
            r4.A04 = r2
        L_0x0138:
            int r0 = r12.A0K
            r1 = -1
            if (r0 == r1) goto L_0x01da
            r4.A02 = r0
            r0 = 1
            r4.A03 = r0
        L_0x0142:
            int r0 = r12.A0H
            if (r0 == r1) goto L_0x01d2
            r4.A00 = r0
            r0 = 1
            r4.A01 = r0
        L_0x014b:
            int r0 = r12.A0O
            if (r0 == 0) goto L_0x01cc
            r4.A02(r0)
        L_0x0152:
            android.graphics.Typeface r1 = r12.A0S
            if (r1 != 0) goto L_0x015c
            int r0 = r12.A0Q
            android.graphics.Typeface r1 = android.graphics.Typeface.defaultFromStyle(r0)
        L_0x015c:
            android.text.TextPaint r0 = r3.A0F
            android.graphics.Typeface r0 = r0.getTypeface()
            if (r0 == r1) goto L_0x016e
            r3.A00()
            android.text.TextPaint r0 = r3.A0F
            r0.setTypeface(r1)
            r4.A04 = r2
        L_0x016e:
            boolean r6 = X.AnonymousClass6T5.A00(r11)
            X.3cZ r1 = r12.A0U
            if (r1 != 0) goto L_0x01ca
            if (r6 == 0) goto L_0x01c7
            X.3cZ r1 = X.C245223cW.A02
        L_0x017a:
            r12.A0U = r1
            r8 = 0
        L_0x017d:
            X.3cZ r0 = r3.A0H
            if (r0 == r1) goto L_0x0185
            r3.A0H = r1
            r4.A04 = r2
        L_0x0185:
            int r0 = r13.length()
            boolean r5 = r1.Cb2(r13, r5, r0)
            X.90N r0 = r12.A0V
            int r1 = r0.ordinal()
            if (r1 == r7) goto L_0x01c4
            r0 = 1
            if (r1 == r0) goto L_0x01bd
            r0 = 3
            if (r1 == r0) goto L_0x01a6
            r0 = 4
            if (r1 == r0) goto L_0x01bf
            r0 = 5
            if (r1 == r0) goto L_0x01ba
            r0 = 6
            if (r1 == r0) goto L_0x01b7
            if (r8 != 0) goto L_0x01a8
        L_0x01a6:
            if (r6 != r5) goto L_0x01c1
        L_0x01a8:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x01aa:
            android.text.Layout$Alignment r0 = r3.A0E
            if (r0 == r1) goto L_0x01b2
            r3.A0E = r1
            r4.A04 = r2
        L_0x01b2:
            android.text.Layout r0 = r4.A00()
            return r0
        L_0x01b7:
            if (r5 == 0) goto L_0x01c1
            goto L_0x01a8
        L_0x01ba:
            if (r5 == 0) goto L_0x01a8
            goto L_0x01c1
        L_0x01bd:
            if (r8 != 0) goto L_0x01c1
        L_0x01bf:
            if (r6 != r5) goto L_0x01a8
        L_0x01c1:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01aa
        L_0x01c4:
            android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01aa
        L_0x01c7:
            X.3cZ r1 = X.C245223cW.A01
            goto L_0x017a
        L_0x01ca:
            r8 = 1
            goto L_0x017d
        L_0x01cc:
            android.content.res.ColorStateList r0 = r12.A0R
            r4.A04(r0)
            goto L_0x0152
        L_0x01d2:
            int r0 = r12.A0J
            r4.A00 = r0
            r4.A01 = r7
            goto L_0x014b
        L_0x01da:
            int r0 = r12.A0M
            r4.A02 = r0
            r4.A03 = r7
            goto L_0x0142
        L_0x01e2:
            r6 = 1
            goto L_0x0034
        L_0x01e5:
            r8 = 0
            goto L_0x0018
        L_0x01e8:
            r8 = 2
            goto L_0x0018
        L_0x01eb:
            r0 = 2523(0x9db, float:3.535E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            int r0 = android.view.View.MeasureSpec.getMode(r14)
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308176Ta.A00(android.content.Context, X.90O, java.lang.CharSequence, int):android.text.Layout");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.6Tb, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        if (r0 != -1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r11.A0I = r0;
        r7 = A00(r2, r11, r10, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014a, code lost:
        if (r11.A0F == Integer.MIN_VALUE) goto L_0x014c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0267  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(android.content.Context r16, X.AnonymousClass90O r17, java.lang.CharSequence r18, int r19, int r20) {
        /*
            r10 = r18
            X.6Tb r9 = new X.6Tb
            r9.<init>()
            r11 = r17
            r9.A03 = r11
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r8 = 0
            if (r0 == 0) goto L_0x0023
            boolean r0 = r11.A0d
            if (r0 != 0) goto L_0x0023
            r9.A04 = r10
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r8, r8, r8, r8)
        L_0x001d:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r9)
            return r0
        L_0x0023:
            r2 = r16
            r5 = r19
            android.text.Layout r7 = A00(r2, r11, r10, r5)
            int r0 = android.view.View.MeasureSpec.getMode(r20)
            r3 = -1
            r6 = 1
            if (r0 == 0) goto L_0x0062
            int r4 = android.view.View.MeasureSpec.getSize(r20)
            boolean r0 = r11.A0e
            if (r0 == 0) goto L_0x0062
            int r1 = r11.A0I
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0062
            r0 = 0
            if (r7 == 0) goto L_0x0049
            int r0 = r7.getHeight()
        L_0x0049:
            if (r0 <= r4) goto L_0x0062
            int r1 = r7.getLineCount()
            int r1 = r1 - r6
        L_0x0050:
            if (r1 < 0) goto L_0x0093
            int r0 = r7.getLineBottom(r1)
            if (r0 > r4) goto L_0x0090
            int r0 = r1 + 1
            if (r0 == r3) goto L_0x0062
        L_0x005c:
            r11.A0I = r0
            android.text.Layout r7 = A00(r2, r11, r10, r5)
        L_0x0062:
            int r4 = r7.getWidth()
            float r1 = r11.A00
            float r0 = r11.A01
            float r1 = r1 + r0
            int r0 = java.lang.Math.round(r1)
            int r4 = r4 + r0
            int r19 = android.view.View.resolveSize(r4, r5)
            java.lang.CharSequence r1 = r11.A0Y
            if (r1 == 0) goto L_0x00f7
            java.lang.String r0 = ""
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00f7
            r5 = 0
        L_0x0081:
            int r0 = r7.getLineCount()
            if (r5 >= r0) goto L_0x0095
            int r0 = r7.getEllipsisCount(r5)
            if (r0 > 0) goto L_0x0096
            int r5 = r5 + 1
            goto L_0x0081
        L_0x0090:
            int r1 = r1 + -1
            goto L_0x0050
        L_0x0093:
            r0 = 1
            goto L_0x005c
        L_0x0095:
            r5 = -1
        L_0x0096:
            if (r5 == r3) goto L_0x00f7
            java.lang.CharSequence r4 = r11.A0Y
            r0 = r19
            float r12 = (float) r0
            float r0 = r11.A00
            float r12 = r12 - r0
            float r0 = r11.A01
            float r12 = r12 - r0
            int r1 = r4.length()
            android.text.TextPaint r0 = r7.getPaint()
            float r0 = android.text.Layout.getDesiredWidth(r4, r8, r1, r0)
            int r1 = r7.getParagraphDirection(r5)
            if (r1 == r3) goto L_0x00bb
            float r12 = r12 - r0
            float r0 = r7.getLineLeft(r5)
            float r0 = r0 + r12
        L_0x00bb:
            int r0 = r7.getOffsetForHorizontal(r5, r0)
            if (r0 <= 0) goto L_0x00e9
            int r3 = r0 + -1
            int r0 = r7.getEllipsisCount(r5)
            if (r0 <= 0) goto L_0x00d5
            int r1 = r7.getLineStart(r5)
            int r0 = r7.getEllipsisStart(r5)
            int r1 = r1 + r0
            if (r3 <= r1) goto L_0x00d5
            r3 = r1
        L_0x00d5:
            if (r3 < 0) goto L_0x00e9
            int r0 = r10.length()
            if (r3 >= r0) goto L_0x00e9
            java.lang.CharSequence r0 = r10.subSequence(r8, r3)
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r0, r4}
            java.lang.CharSequence r10 = android.text.TextUtils.concat(r0)
        L_0x00e9:
            r1 = 1073741824(0x40000000, float:2.0)
            r0 = r19
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            android.text.Layout r7 = A00(r2, r11, r10, r0)
            r9.A05 = r6
        L_0x00f7:
            r5 = 0
            if (r7 == 0) goto L_0x00fe
            int r5 = r7.getHeight()
        L_0x00fe:
            float r0 = r11.A04
            r3 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x017b
            boolean r0 = r11.A0c
            if (r0 == 0) goto L_0x017b
            android.text.TextPaint r0 = r7.getPaint()
            int r0 = r0.getFontMetricsInt(r3)
            float r1 = (float) r0
            float r0 = r11.A04
            float r0 = r0 - r2
            float r1 = r1 * r0
            int r4 = (int) r1
            int r5 = r5 + r4
        L_0x011a:
            int r2 = r7.getLineCount()
            int r0 = r11.A0L
            if (r2 >= r0) goto L_0x013a
            android.text.TextPaint r0 = r7.getPaint()
            int r0 = r0.getFontMetricsInt(r3)
            float r1 = (float) r0
            float r0 = r11.A04
            float r1 = r1 * r0
            float r0 = r11.A05
            float r1 = r1 + r0
            int r1 = java.lang.Math.round(r1)
            int r0 = r11.A0L
            int r0 = r0 - r2
            int r1 = r1 * r0
            int r5 = r5 + r1
        L_0x013a:
            int r0 = r7.getHeight()
            float r0 = (float) r0
            r18 = r0
            int r0 = r11.A0G
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r13) goto L_0x014c
            int r1 = r11.A0F
            r0 = 1
            if (r1 != r13) goto L_0x014d
        L_0x014c:
            r0 = 0
        L_0x014d:
            if (r0 == 0) goto L_0x023f
            android.text.TextPaint r17 = r7.getPaint()
            android.text.TextPaint r12 = new android.text.TextPaint
            r0 = r17
            r12.<init>(r0)
            boolean r14 = r10 instanceof android.text.Spanned
            if (r14 == 0) goto L_0x017d
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x017d
            r1 = r10
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<android.text.style.MetricAffectingSpan> r0 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r2 = r1.getSpans(r8, r8, r0)
            android.text.style.MetricAffectingSpan[] r2 = (android.text.style.MetricAffectingSpan[]) r2
            r1 = 0
        L_0x0170:
            int r0 = r2.length
            if (r1 >= r0) goto L_0x017d
            r0 = r2[r1]
            r0.updateMeasureState(r12)
            int r1 = r1 + 1
            goto L_0x0170
        L_0x017b:
            r4 = 0
            goto L_0x011a
        L_0x017d:
            float r0 = r12.getTextSize()
            android.graphics.Typeface r1 = r12.getTypeface()
            int r0 = (int) r0
            int r15 = r0 * 31
            int r0 = r1.hashCode()
            int r15 = r15 + r0
            android.util.SparseIntArray r1 = A01
            monitor-enter(r1)
            int r2 = r1.get(r15, r13)     // Catch:{ all -> 0x02af }
            monitor-exit(r1)     // Catch:{ all -> 0x02af }
            if (r2 != r13) goto L_0x01b8
            android.graphics.Rect r16 = new android.graphics.Rect
            r16.<init>()
            android.graphics.Paint$FontMetricsInt r3 = new android.graphics.Paint$FontMetricsInt
            r3.<init>()
            r12.getFontMetricsInt(r3)
            java.lang.String r2 = "T"
            r0 = r16
            r12.getTextBounds(r2, r8, r6, r0)
            int r0 = r3.ascent
            int r2 = -r0
            int r0 = r16.height()
            int r2 = r2 - r0
            monitor-enter(r1)
            r1.put(r15, r2)     // Catch:{ all -> 0x02a6 }
            monitor-exit(r1)     // Catch:{ all -> 0x02a6 }
        L_0x01b8:
            android.text.TextPaint r16 = new android.text.TextPaint
            r1 = r17
            r0 = r16
            r0.<init>(r1)
            if (r14 == 0) goto L_0x01ed
            int r0 = r10.length()
            if (r0 <= 0) goto L_0x01ed
            r0 = r10
            android.text.Spanned r0 = (android.text.Spanned) r0
            r1 = r0
            int r15 = r10.length()
            int r15 = r15 - r6
            int r14 = r10.length()
            int r14 = r14 - r6
            java.lang.Class<android.text.style.MetricAffectingSpan> r0 = android.text.style.MetricAffectingSpan.class
            java.lang.Object[] r15 = r1.getSpans(r15, r14, r0)
            android.text.style.MetricAffectingSpan[] r15 = (android.text.style.MetricAffectingSpan[]) r15
            r14 = 0
        L_0x01e0:
            int r0 = r15.length
            if (r14 >= r0) goto L_0x01ed
            r1 = r15[r14]
            r0 = r16
            r1.updateMeasureState(r0)
            int r14 = r14 + 1
            goto L_0x01e0
        L_0x01ed:
            float r0 = r16.getTextSize()
            android.graphics.Typeface r1 = r16.getTypeface()
            int r0 = (int) r0
            int r15 = r0 * 31
            int r0 = r1.hashCode()
            int r15 = r15 + r0
            android.util.SparseIntArray r14 = A00
            monitor-enter(r14)
            int r1 = r14.get(r15, r13)     // Catch:{ all -> 0x02ac }
            monitor-exit(r14)     // Catch:{ all -> 0x02ac }
            if (r1 != r13) goto L_0x0230
            if (r3 == 0) goto L_0x021f
            float r1 = r12.getTextSize()
            float r0 = r16.getTextSize()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x021f
            android.graphics.Typeface r1 = r12.getTypeface()
            android.graphics.Typeface r0 = r16.getTypeface()
            if (r1 == r0) goto L_0x0229
        L_0x021f:
            android.graphics.Paint$FontMetricsInt r3 = new android.graphics.Paint$FontMetricsInt
            r3.<init>()
            r0 = r16
            r0.getFontMetricsInt(r3)
        L_0x0229:
            int r1 = r3.descent
            monitor-enter(r14)
            r14.put(r15, r1)     // Catch:{ all -> 0x02a9 }
            monitor-exit(r14)     // Catch:{ all -> 0x02a9 }
        L_0x0230:
            int[] r0 = new int[]{r2, r1}
            r3 = r0[r8]
            int r0 = r11.A0G
            int r3 = r3 - r0
            int r1 = r1 + r3
            int r5 = r5 - r1
            int r0 = r11.A0F
            int r5 = r5 + r0
            goto L_0x0240
        L_0x023f:
            r3 = 0
        L_0x0240:
            r0 = r20
            int r2 = android.view.View.resolveSize(r5, r0)
            X.90P r0 = r11.A0X
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x029b
            r0 = 2
            if (r1 == r0) goto L_0x0297
            int r4 = r4 - r3
            float r1 = (float) r4
        L_0x0253:
            r9.A04 = r10
            r9.A02 = r7
            X.90N r3 = r11.A0V
            X.90N r0 = X.AnonymousClass90N.TEXT_START
            if (r3 != r0) goto L_0x028f
            float r0 = r11.A00
        L_0x025f:
            r9.A00 = r0
        L_0x0261:
            r9.A01 = r1
            boolean r0 = r10 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0286
            r3 = r10
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r1 = r10.length()
            java.lang.Class<android.text.style.ClickableSpan> r0 = android.text.style.ClickableSpan.class
            java.lang.Object[] r0 = r3.getSpans(r8, r1, r0)
            android.text.style.ClickableSpan[] r0 = (android.text.style.ClickableSpan[]) r0
            r9.A06 = r0
            int r1 = r10.length()
            java.lang.Class<android.text.style.ImageSpan> r0 = android.text.style.ImageSpan.class
            java.lang.Object[] r0 = r3.getSpans(r8, r1, r0)
            android.text.style.ImageSpan[] r0 = (android.text.style.ImageSpan[]) r0
            r9.A07 = r0
        L_0x0286:
            android.graphics.Rect r1 = new android.graphics.Rect
            r0 = r19
            r1.<init>(r8, r8, r0, r2)
            goto L_0x001d
        L_0x028f:
            X.90N r0 = X.AnonymousClass90N.TEXT_END
            if (r3 != r0) goto L_0x0261
            float r0 = r11.A01
            float r0 = -r0
            goto L_0x025f
        L_0x0297:
            float r1 = (float) r2
            float r1 = r1 - r18
            goto L_0x02a1
        L_0x029b:
            float r1 = (float) r2
            float r1 = r1 - r18
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
        L_0x02a1:
            float r0 = (float) r4
            float r1 = r1 + r0
            float r0 = (float) r3
            float r1 = r1 - r0
            goto L_0x0253
        L_0x02a6:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02a6 }
            throw r0
        L_0x02a9:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x02a9 }
            throw r0
        L_0x02ac:
            r0 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x02ac }
            throw r0
        L_0x02af:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02af }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C308176Ta.A01(android.content.Context, X.90O, java.lang.CharSequence, int, int):android.util.Pair");
    }

    public static C308196Tc A02(C244943c0 r25, AnonymousClass6TT r26, AnonymousClass90O r27, CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence charSequence2 = charSequence;
        Context context = r25.A04;
        AnonymousClass90O r5 = r27;
        int i4 = i;
        int i5 = i2;
        Pair A012 = A01(context, r5, charSequence2, i4, i5);
        C3727192c r3 = r5.A0W;
        if (r3 != null && (charSequence2 instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence2;
            C308186Tb r1 = (C308186Tb) A012.second;
            RectF rectF = r3.A02;
            float f = rectF.top;
            float f2 = rectF.bottom;
            float f3 = rectF.left;
            float f4 = rectF.right;
            float f5 = r3.A00;
            int i6 = r3.A01;
            if (View.MeasureSpec.getMode(i5) != 0) {
                int size = View.MeasureSpec.getSize(i5);
                Layout layout = r1.A02;
                int i7 = 0;
                if (layout != null) {
                    i7 = layout.getHeight();
                }
                float f6 = ((float) i7) + f + f2;
                float f7 = (float) size;
                float f8 = (f7 - f6) / 2.0f;
                if (f7 < f6) {
                    float max = Math.max(0.0f, f8);
                    f = Math.abs(Math.min(f, max));
                    f2 = Math.abs(Math.min(f2, max));
                }
            }
            if (View.MeasureSpec.getMode(i4) != 0) {
                int size2 = View.MeasureSpec.getSize(i4);
                Layout layout2 = r1.A02;
                int i8 = 0;
                for (int i9 = 0; i9 < layout2.getLineCount(); i9++) {
                    i8 = (int) Math.max((float) i8, layout2.getLineWidth(i9));
                }
                int i10 = (size2 - i8) / 2;
                if (((float) size2) < ((float) i8) + f3 + f4) {
                    float max2 = (float) Math.max(0, i10);
                    f3 = Math.min(f3, max2);
                    f4 = Math.min(f4, max2);
                }
            }
            spannable.setSpan(new AnonymousClass6OY(r1.A02, f3, f4, f, f2, f5, i6), 0, spannable.length(), 18);
            r5.A00 = f3;
            r5.A01 = f4;
            Pair A013 = A01(context, r5, spannable, i4, i5);
            C308186Tb r9 = (C308186Tb) A013.second;
            r9.A01 = f;
            int ordinal = r5.A0V.ordinal();
            if (ordinal != 2) {
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        float width = (float) ((Rect) A013.first).width();
                        Layout layout3 = r9.A02;
                        if (layout3 == null) {
                            i3 = 0;
                        } else {
                            int lineCount = layout3.getLineCount();
                            i3 = 0;
                            for (int i11 = 0; i11 < lineCount; i11++) {
                                i3 = Math.max(i3, (int) layout3.getLineRight(i11));
                            }
                        }
                        r9.A00 = width - (((float) i3) + f4);
                    }
                }
                r9.A00 = f3;
            } else if (r9.A02.getLineCount() == 1) {
                f3 = (f3 + f4) / 2.0f;
                r9.A00 = f3;
            }
            int width2 = ((Rect) A013.first).width();
            Layout layout4 = r9.A02;
            int i12 = 0;
            if (layout4 != null) {
                i12 = layout4.getHeight();
            }
            A012 = new Pair(new Rect(0, 0, width2, i12 + ((int) (f + f2))), r9);
        }
        return new C308196Tc(r26, A012.second, ((Rect) A012.first).width(), ((Rect) A012.first).height());
    }
}
