package X;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import java.util.AbstractCollection;
import java.util.concurrent.ConcurrentHashMap;

public final class W3I {
    public static final TextPaint A00 = new TextPaint(1);
    public static final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public static Layout.Alignment A01(Spannable spannable, XCN xcn) {
        boolean z;
        Layout.Alignment alignment;
        if (xcn.contains(2)) {
            if (A06(xcn) != TextDirectionHeuristics.FIRSTSTRONG_LTR.isRtl(spannable, 0, spannable.length())) {
                z = true;
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                z = false;
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            XCN mapBuffer = xcn.getMapBuffer(2);
            if (mapBuffer.getCount() == 0) {
                return alignment;
            }
            XCN mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
            if (!mapBuffer2.contains(12)) {
                return alignment;
            }
            String string = mapBuffer2.getString(12);
            if (string.equals("center")) {
                return Layout.Alignment.ALIGN_CENTER;
            }
            if (!string.equals("right")) {
                return alignment;
            }
            if (!z) {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public static boolean A06(XCN xcn) {
        if (!xcn.contains(2)) {
            return false;
        }
        XCN mapBuffer = xcn.getMapBuffer(2);
        if (mapBuffer.getCount() == 0) {
            return false;
        }
        XCN mapBuffer2 = mapBuffer.getMapBuffer(0).getMapBuffer(5);
        if (!mapBuffer2.contains(23) || C18672VwV.A00(mapBuffer2.getString(23)) != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ec, code lost:
        if (r9 > r29) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010b, code lost:
        if (r15 > r30) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b9, code lost:
        if (r2 != false) goto L_0x01c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A00(android.content.Context r23, X.XCN r24, X.XCN r25, X.C245103cK r26, X.C245103cK r27, float[] r28, float r29, float r30) {
        /*
            r4 = r24
            r0 = r23
            android.text.Spannable r7 = A03(r0, r4)
            android.text.TextPaint r0 = A00
            android.text.BoringLayout$Metrics r18 = android.text.BoringLayout.isBoring(r7, r0)
            r0 = 2
            r1 = r25
            java.lang.String r0 = r1.getString(r0)
            int r15 = X.C18672VwV.A01(r0)
            r2 = 4
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x009a
            boolean r17 = r1.getBoolean(r2)
        L_0x0024:
            r0 = 5
            java.lang.String r2 = r1.getString(r0)
            r16 = 0
            if (r2 == 0) goto L_0x003f
            java.lang.String r0 = "normal"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0097
            java.lang.String r0 = "none"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x003f
            r16 = 2
        L_0x003f:
            r3 = 3
            boolean r2 = r1.contains(r3)
            r0 = 0
            if (r2 == 0) goto L_0x0095
            boolean r3 = r1.getBoolean(r3)
        L_0x004b:
            boolean r2 = r1.contains(r0)
            if (r2 == 0) goto L_0x0093
            int r14 = r1.getInt(r0)
        L_0x0055:
            android.text.Layout$Alignment r6 = A01(r7, r4)
            r12 = r29
            r13 = r30
            if (r3 == 0) goto L_0x0071
            r3 = 6
            boolean r2 = r1.contains(r3)
            if (r2 == 0) goto L_0x0090
            double r10 = r1.getDouble(r3)
        L_0x006a:
            X.3cK r8 = X.C245103cK.EXACTLY
            X.3cK r9 = X.C245103cK.UNDEFINED
            A04(r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
        L_0x0071:
            X.3cK r2 = X.C245103cK.EXACTLY
            r19 = r6
            r20 = r7
            r21 = r2
            r22 = r12
            r23 = r15
            r24 = r16
            r25 = r17
            android.text.Layout r5 = A02(r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.CharSequence r4 = r5.getText()
            android.text.Spanned r4 = (android.text.Spanned) r4
            if (r4 != 0) goto L_0x009d
            r0 = 0
            return r0
        L_0x0090:
            r10 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x006a
        L_0x0093:
            r14 = -1
            goto L_0x0055
        L_0x0095:
            r3 = 0
            goto L_0x004b
        L_0x0097:
            r16 = 1
            goto L_0x003f
        L_0x009a:
            r17 = 1
            goto L_0x0024
        L_0x009d:
            boolean r6 = r1.contains(r0)
            r3 = -1
            if (r6 == 0) goto L_0x00e1
            int r1 = r1.getInt(r0)
            if (r1 == r3) goto L_0x00e1
            if (r1 == 0) goto L_0x00e1
            int r0 = r5.getLineCount()
            int r6 = java.lang.Math.min(r1, r0)
        L_0x00b4:
            r9 = 0
            r10 = 10
            r11 = 1
            r8 = r26
            if (r8 == r2) goto L_0x00ee
            r7 = 0
        L_0x00bd:
            if (r7 >= r6) goto L_0x00e6
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x00dc
            int r0 = r5.getLineEnd(r7)
            int r0 = r0 - r11
            char r0 = r4.charAt(r0)
            if (r0 != r10) goto L_0x00dc
            float r1 = r5.getLineMax(r7)
        L_0x00d4:
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d9
            r9 = r1
        L_0x00d9:
            int r7 = r7 + 1
            goto L_0x00bd
        L_0x00dc:
            float r1 = r5.getLineWidth(r7)
            goto L_0x00d4
        L_0x00e1:
            int r6 = r5.getLineCount()
            goto L_0x00b4
        L_0x00e6:
            X.3cK r0 = X.C245103cK.AT_MOST
            if (r8 != r0) goto L_0x00ef
            int r0 = (r9 > r29 ? 1 : (r9 == r29 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ef
        L_0x00ee:
            r9 = r12
        L_0x00ef:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 <= r0) goto L_0x00fb
            double r0 = (double) r9
            double r0 = java.lang.Math.ceil(r0)
            float r9 = (float) r0
        L_0x00fb:
            r1 = r27
            if (r1 == r2) goto L_0x010d
            int r6 = r6 - r11
            int r0 = r5.getLineBottom(r6)
            float r15 = (float) r0
            X.3cK r0 = X.C245103cK.AT_MOST
            if (r1 != r0) goto L_0x010e
            int r0 = (r15 > r30 ? 1 : (r15 == r30 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
        L_0x010d:
            r15 = r13
        L_0x010e:
            r2 = 0
            r16 = 0
        L_0x0111:
            int r0 = r4.length()
            if (r2 >= r0) goto L_0x01c5
            int r1 = r4.length()
            java.lang.Class<X.U2c> r0 = X.C14702U2c.class
            int r14 = r4.nextSpanTransition(r2, r1, r0)
            java.lang.Object[] r13 = r4.getSpans(r2, r14, r0)
            X.U2c[] r13 = (X.C14702U2c[]) r13
            int r12 = r13.length
            r11 = 0
        L_0x0129:
            if (r11 >= r12) goto L_0x01c2
            r1 = r13[r11]
            int r10 = r4.getSpanStart(r1)
            int r8 = r5.getLineForOffset(r10)
            int r0 = r5.getEllipsisCount(r8)
            if (r0 <= 0) goto L_0x014c
            int r2 = r5.getLineStart(r8)
            int r0 = r5.getEllipsisStart(r8)
            int r2 = r2 + r0
            if (r10 < r2) goto L_0x014c
            int r0 = r5.getLineEnd(r8)
            if (r10 < r0) goto L_0x019a
        L_0x014c:
            int r0 = r1.A02
            float r7 = (float) r0
            int r0 = r1.A00
            float r6 = (float) r0
            boolean r2 = r5.isRtlCharAt(r10)
            int r0 = r5.getParagraphDirection(r8)
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r3)
            int r0 = r4.length()
            int r0 = r0 + -1
            if (r10 != r0) goto L_0x01a2
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x019d
            int r0 = r5.getLineEnd(r8)
            int r0 = r0 + -1
            char r2 = r4.charAt(r0)
            r0 = 10
            if (r2 != r0) goto L_0x019d
            float r0 = r5.getLineMax(r8)
        L_0x017e:
            if (r1 == 0) goto L_0x01bc
            float r0 = r9 - r0
        L_0x0182:
            int r1 = r5.getLineBaseline(r8)
            float r1 = (float) r1
            float r1 = r1 - r6
            int r2 = r16 * 2
            float r1 = X.W2U.A00(r1)
            r28[r2] = r1
            int r1 = r2 + 1
            float r0 = X.W2U.A00(r0)
            r28[r1] = r0
            int r16 = r16 + 1
        L_0x019a:
            int r11 = r11 + 1
            goto L_0x0129
        L_0x019d:
            float r0 = r5.getLineWidth(r8)
            goto L_0x017e
        L_0x01a2:
            if (r1 != r2) goto L_0x01b4
            float r0 = r5.getPrimaryHorizontal(r10)
        L_0x01a8:
            if (r1 == 0) goto L_0x01b9
            if (r2 != 0) goto L_0x01c0
            float r1 = r5.getLineRight(r8)
            float r1 = r1 - r0
            float r0 = r9 - r1
            goto L_0x0182
        L_0x01b4:
            float r0 = r5.getSecondaryHorizontal(r10)
            goto L_0x01a8
        L_0x01b9:
            if (r2 == 0) goto L_0x0182
            goto L_0x01c0
        L_0x01bc:
            float r0 = r5.getLineRight(r8)
        L_0x01c0:
            float r0 = r0 - r7
            goto L_0x0182
        L_0x01c2:
            r2 = r14
            goto L_0x0111
        L_0x01c5:
            float r1 = X.W2U.A00(r9)
            float r0 = X.W2U.A00(r15)
            long r0 = X.C13990Tnq.A0C(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3I.A00(android.content.Context, X.XCN, X.XCN, X.3cK, X.3cK, float[], float, float):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Layout A02(android.text.BoringLayout.Metrics r16, android.text.Layout.Alignment r17, android.text.Spannable r18, X.C245103cK r19, float r20, int r21, int r22, boolean r23) {
        /*
            r2 = r18
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "\n"
            boolean r0 = r1.endsWith(r0)
            if (r0 == 0) goto L_0x00f6
            android.text.SpannableStringBuilder r15 = new android.text.SpannableStringBuilder
            r15.<init>(r2)
            java.lang.String r0 = "I"
            r15.append(r0)
        L_0x0018:
            int r8 = r15.length()
            r9 = 0
            r7 = 0
            r1 = r20
            int r0 = (r20 > r9 ? 1 : (r20 == r9 ? 0 : -1))
            boolean r14 = X.C51970G9q.A1T(r0)
            r10 = r16
            if (r16 != 0) goto L_0x00f2
            android.text.TextPaint r0 = A00
            float r12 = android.text.Layout.getDesiredWidth(r15, r0)
        L_0x0030:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            boolean r13 = r0.isRtl(r15, r7, r8)
            r2 = 1065353216(0x3f800000, float:1.0)
            r6 = r17
            r11 = r19
            r5 = r21
            r4 = r22
            r3 = r23
            if (r16 != 0) goto L_0x0085
            if (r14 != 0) goto L_0x0050
            boolean r0 = X.C244163ak.A00(r12)
            if (r0 != 0) goto L_0x00c1
            int r0 = (r12 > r20 ? 1 : (r12 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
        L_0x0050:
            X.3cK r0 = X.C245103cK.EXACTLY
            if (r11 != r0) goto L_0x0055
            r12 = r1
        L_0x0055:
            double r0 = (double) r12
            double r0 = java.lang.Math.ceil(r0)
            int r10 = (int) r0
            android.text.TextPaint r0 = A00
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r15, r7, r8, r0, r10)
            android.text.StaticLayout$Builder r0 = r0.setAlignment(r6)
            android.text.StaticLayout$Builder r0 = r0.setLineSpacing(r9, r2)
            android.text.StaticLayout$Builder r0 = r0.setIncludePad(r3)
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r5)
            android.text.StaticLayout$Builder r1 = r0.setHyphenationFrequency(r4)
            if (r13 == 0) goto L_0x0082
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
        L_0x0079:
            android.text.StaticLayout$Builder r1 = r1.setTextDirection(r0)
        L_0x007d:
            android.text.StaticLayout r0 = r1.build()
            return r0
        L_0x0082:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            goto L_0x0079
        L_0x0085:
            if (r14 != 0) goto L_0x008e
            int r0 = r10.width
            float r0 = (float) r0
            int r0 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r0 > 0) goto L_0x00c1
        L_0x008e:
            int r4 = r10.width
            r5 = r4
            X.3cK r0 = X.C245103cK.EXACTLY
            if (r11 != r0) goto L_0x009b
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r4 = (int) r0
        L_0x009b:
            if (r5 >= 0) goto L_0x00ae
            java.lang.String r4 = "TextLayoutManager"
            java.lang.String r0 = "Text width is invalid: "
            java.lang.String r1 = X.002.A0O(r0, r5)
            X.TQR r0 = new X.TQR
            r0.<init>(r1)
            com.facebook.react.bridge.ReactSoftExceptionLogger.logSoftException(r4, r0)
            r4 = 0
        L_0x00ae:
            android.text.TextPaint r16 = A00
            r21 = r10
            r22 = r3
            r19 = r2
            r20 = r9
            r17 = r4
            r18 = r6
            android.text.BoringLayout r0 = android.text.BoringLayout.make(r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
        L_0x00c1:
            android.text.TextPaint r10 = A00
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r9 = (int) r0
            android.text.StaticLayout$Builder r0 = android.text.StaticLayout.Builder.obtain(r15, r7, r8, r10, r9)
            android.text.StaticLayout$Builder r1 = r0.setAlignment(r6)
            r0 = 0
            android.text.StaticLayout$Builder r0 = r1.setLineSpacing(r0, r2)
            android.text.StaticLayout$Builder r0 = r0.setIncludePad(r3)
            android.text.StaticLayout$Builder r0 = r0.setBreakStrategy(r5)
            android.text.StaticLayout$Builder r1 = r0.setHyphenationFrequency(r4)
            if (r13 == 0) goto L_0x00ef
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.RTL
        L_0x00e6:
            android.text.StaticLayout$Builder r1 = r1.setTextDirection(r0)
            r0 = 1
            r1.setUseLineSpacingFromFallbacks(r0)
            goto L_0x007d
        L_0x00ef:
            android.text.TextDirectionHeuristic r0 = android.text.TextDirectionHeuristics.LTR
            goto L_0x00e6
        L_0x00f2:
            r12 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x0030
        L_0x00f6:
            r15 = r2
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3I.A02(android.text.BoringLayout$Metrics, android.text.Layout$Alignment, android.text.Spannable, X.3cK, float, int, int, boolean):android.text.Layout");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: X.Uze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: X.Uze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.Uze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: X.Uze} */
    /* JADX WARNING: type inference failed for: r0v28, types: [android.text.style.AbsoluteSizeSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r0v42, types: [android.text.style.StrikethroughSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r0v43, types: [android.text.style.UnderlineSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r7v7, types: [android.text.style.BackgroundColorSpan, X.X0n] */
    /* JADX WARNING: type inference failed for: r7v8, types: [android.text.style.ForegroundColorSpan, X.X0n] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x023d, code lost:
        r12.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x026c, code lost:
        if (r12 != false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0283, code lost:
        if (r3 != false) goto L_0x0285;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0285, code lost:
        r18 = X.W2U.A02(r2, Float.NaN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x028d, code lost:
        r18 = X.W2U.A01(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0293, code lost:
        r18 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x047c, code lost:
        if (Float.NaN > r18) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0490, code lost:
        if (Float.NaN > r18) goto L_0x0494;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.Spannable A03(android.content.Context r45, X.XCN r46) {
        /*
            r38 = 3
            r1 = r46
            r0 = r38
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x001f
            r0 = r38
            int r0 = r1.getInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r0 = A01
            java.lang.Object r6 = r0.get(r1)
            android.text.Spannable r6 = (android.text.Spannable) r6
        L_0x001e:
            return r6
        L_0x001f:
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r37 = 2
            r0 = r37
            X.XCN r36 = r1.getMapBuffer(r0)
            int r35 = r36.getCount()
            r34 = 0
            r9 = 0
        L_0x0038:
            r0 = r35
            if (r9 >= r0) goto L_0x04b4
            r0 = r36
            X.XCN r7 = r0.getMapBuffer(r9)
            int r4 = r6.length()
            r0 = 5
            X.XCN r0 = r7.getMapBuffer(r0)
            r22 = 0
            r24 = 0
            r18 = 2143289344(0x7fc00000, float:NaN)
            r25 = 0
            r3 = 1
            r23 = 0
            r21 = 2143289344(0x7fc00000, float:NaN)
            r8 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r17 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Integer r32 = X.AnonymousClass05K.A00
            r15 = r32
            r11 = 0
            r10 = 0
            r31 = 0
            r30 = 1426063360(0x55000000, float:8.796093E12)
            r29 = 0
            r28 = 0
            r27 = 0
            r16 = r27
            r19 = -1
            r20 = -1
            r42 = r27
            r41 = r27
            java.util.Iterator r26 = r0.iterator()
        L_0x007d:
            boolean r0 = r26.hasNext()
            if (r0 == 0) goto L_0x035c
            java.lang.Object r0 = r26.next()
            X.X9J r0 = (X.X9J) r0
            int r1 = r0.BJq()
            switch(r1) {
                case 0: goto L_0x0091;
                case 1: goto L_0x00a4;
                case 2: goto L_0x00b7;
                case 3: goto L_0x00bf;
                case 4: goto L_0x00c4;
                case 5: goto L_0x0090;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00ef;
                case 9: goto L_0x024e;
                case 10: goto L_0x026f;
                case 11: goto L_0x0278;
                case 12: goto L_0x0090;
                case 13: goto L_0x0090;
                case 14: goto L_0x0090;
                case 15: goto L_0x0297;
                case 16: goto L_0x0090;
                case 17: goto L_0x0090;
                case 18: goto L_0x02c9;
                case 19: goto L_0x02d6;
                case 20: goto L_0x02e2;
                case 21: goto L_0x02ed;
                case 22: goto L_0x0090;
                case 23: goto L_0x02f8;
                case 24: goto L_0x0301;
                case 25: goto L_0x0090;
                case 26: goto L_0x0311;
                case 27: goto L_0x031d;
                default: goto L_0x0090;
            }
        L_0x0090:
            goto L_0x007d
        L_0x0091:
            int r0 = r0.BI6()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r25 = X.AnonymousClass7TF.A1V(r0)
            if (r25 == 0) goto L_0x007d
            int r24 = r0.intValue()
            goto L_0x007d
        L_0x00a4:
            int r0 = r0.BI6()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r23 = X.AnonymousClass7TF.A1V(r0)
            if (r23 == 0) goto L_0x007d
            int r22 = r0.intValue()
            goto L_0x007d
        L_0x00b7:
            double r0 = r0.Ayk()
            float r12 = (float) r0
            r21 = r12
            goto L_0x007d
        L_0x00bf:
            java.lang.String r42 = r0.C1u()
            goto L_0x007d
        L_0x00c4:
            double r0 = r0.Ayk()
            float r8 = (float) r0
            r33 = r8
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x00db
            float r0 = X.W2U.A03(r3, r8)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r8 = (float) r0
        L_0x00db:
            int r8 = (int) r8
            goto L_0x007d
        L_0x00dd:
            java.lang.String r0 = r0.C1u()
            int r20 = X.C18788W1q.A01(r0)
            goto L_0x007d
        L_0x00e6:
            java.lang.String r0 = r0.C1u()
            int r19 = X.C18788W1q.A00(r0)
            goto L_0x007d
        L_0x00ef:
            X.XCN r1 = r0.BOx()
            if (r1 == 0) goto L_0x024a
            int r0 = r1.getCount()
            if (r0 == 0) goto L_0x024a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r13 = r1.iterator()
        L_0x0104:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0242
            java.lang.Object r0 = r13.next()
            X.X9J r0 = (X.X9J) r0
            java.lang.String r1 = r0.C1u()
            if (r1 == 0) goto L_0x0104
            int r0 = r1.hashCode()
            switch(r0) {
                case -1983120972: goto L_0x011e;
                case -1933522176: goto L_0x012a;
                case -1534462052: goto L_0x0136;
                case -1195362251: goto L_0x0142;
                case -1061392823: goto L_0x014e;
                case -771984547: goto L_0x015a;
                case -659678800: goto L_0x0166;
                case 296506098: goto L_0x0172;
                case 309330544: goto L_0x017e;
                case 310339585: goto L_0x018a;
                case 604478526: goto L_0x0196;
                case 979426287: goto L_0x01a2;
                case 979432035: goto L_0x01ae;
                case 979664367: goto L_0x01ba;
                case 1001434505: goto L_0x01c5;
                case 1001438213: goto L_0x01d0;
                case 1001439040: goto L_0x01db;
                case 1001439599: goto L_0x01e6;
                case 1030714463: goto L_0x01f1;
                case 1044065430: goto L_0x01fc;
                case 1044067310: goto L_0x0207;
                case 1183323111: goto L_0x0212;
                case 1463562569: goto L_0x021d;
                case 1648446397: goto L_0x0228;
                case 2097122634: goto L_0x0233;
                default: goto L_0x011d;
            }
        L_0x011d:
            goto L_0x0104
        L_0x011e:
            java.lang.String r0 = "stylistic-thirteen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss13'"
            goto L_0x023d
        L_0x012a:
            java.lang.String r0 = "stylistic-fifteen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss15'"
            goto L_0x023d
        L_0x0136:
            java.lang.String r0 = "stylistic-eighteen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss18'"
            goto L_0x023d
        L_0x0142:
            java.lang.String r0 = "proportional-nums"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'pnum'"
            goto L_0x023d
        L_0x014e:
            java.lang.String r0 = "lining-nums"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'lnum'"
            goto L_0x023d
        L_0x015a:
            java.lang.String r0 = "tabular-nums"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'tnum'"
            goto L_0x023d
        L_0x0166:
            java.lang.String r0 = "oldstyle-nums"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'onum'"
            goto L_0x023d
        L_0x0172:
            java.lang.String r0 = "stylistic-eight"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss08'"
            goto L_0x023d
        L_0x017e:
            java.lang.String r0 = "stylistic-seven"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss07'"
            goto L_0x023d
        L_0x018a:
            java.lang.String r0 = "stylistic-three"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss03'"
            goto L_0x023d
        L_0x0196:
            java.lang.String r0 = "stylistic-eleven"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss11'"
            goto L_0x023d
        L_0x01a2:
            java.lang.String r0 = "stylistic-five"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss05'"
            goto L_0x023d
        L_0x01ae:
            java.lang.String r0 = "stylistic-four"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss04'"
            goto L_0x023d
        L_0x01ba:
            java.lang.String r0 = "stylistic-nine"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss09'"
            goto L_0x023d
        L_0x01c5:
            java.lang.String r0 = "stylistic-one"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss01'"
            goto L_0x023d
        L_0x01d0:
            java.lang.String r0 = "stylistic-six"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss06'"
            goto L_0x023d
        L_0x01db:
            java.lang.String r0 = "stylistic-ten"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss10'"
            goto L_0x023d
        L_0x01e6:
            java.lang.String r0 = "stylistic-two"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss02'"
            goto L_0x023d
        L_0x01f1:
            java.lang.String r0 = "stylistic-sixteen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss16'"
            goto L_0x023d
        L_0x01fc:
            java.lang.String r0 = "stylistic-twelve"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss12'"
            goto L_0x023d
        L_0x0207:
            java.lang.String r0 = "stylistic-twenty"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss20'"
            goto L_0x023d
        L_0x0212:
            java.lang.String r0 = "small-caps"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'smcp'"
            goto L_0x023d
        L_0x021d:
            java.lang.String r0 = "stylistic-nineteen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss19'"
            goto L_0x023d
        L_0x0228:
            java.lang.String r0 = "stylistic-fourteen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss14'"
            goto L_0x023d
        L_0x0233:
            java.lang.String r0 = "stylistic-seventeen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "'ss17'"
        L_0x023d:
            r12.add(r0)
            goto L_0x0104
        L_0x0242:
            java.lang.String r0 = ", "
            java.lang.String r41 = android.text.TextUtils.join(r0, r12)
            goto L_0x007d
        L_0x024a:
            r41 = 0
            goto L_0x007d
        L_0x024e:
            boolean r12 = r0.Agz()
            if (r12 == r3) goto L_0x007d
            r3 = r12
            r8 = r33
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r33 > r13 ? 1 : (r33 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0267
            float r0 = X.W2U.A03(r12, r8)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            float r8 = (float) r0
        L_0x0267:
            int r8 = (int) r8
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0293
            if (r12 == 0) goto L_0x028d
            goto L_0x0285
        L_0x026f:
            double r0 = r0.Ayk()
            float r12 = (float) r0
            r17 = r12
            goto L_0x007d
        L_0x0278:
            double r0 = r0.Ayk()
            float r2 = (float) r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0293
            if (r3 == 0) goto L_0x028d
        L_0x0285:
            r0 = 2143289344(0x7fc00000, float:NaN)
            float r18 = X.W2U.A02(r2, r0)
            goto L_0x007d
        L_0x028d:
            float r18 = X.W2U.A01(r2)
            goto L_0x007d
        L_0x0293:
            r18 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x007d
        L_0x0297:
            java.lang.String r1 = r0.C1u()
            r13 = 0
            r29 = 0
            r28 = 0
            if (r1 == 0) goto L_0x007d
            java.lang.String r0 = "-"
            java.lang.String[] r12 = r1.split(r0)
            int r14 = r12.length
        L_0x02a9:
            if (r13 >= r14) goto L_0x007d
            r1 = r12[r13]
            java.lang.String r0 = "underline"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02ba
            r29 = 1
        L_0x02b7:
            int r13 = r13 + 1
            goto L_0x02a9
        L_0x02ba:
            r0 = 4063(0xfdf, float:5.693E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02b7
            r28 = 1
            goto L_0x02b7
        L_0x02c9:
            double r0 = r0.Ayk()
            float r12 = (float) r0
            int r0 = (r12 > r31 ? 1 : (r12 == r31 ? 0 : -1))
            if (r0 == 0) goto L_0x007d
            r31 = r12
            goto L_0x007d
        L_0x02d6:
            int r1 = r0.BI6()
            r0 = r30
            if (r1 == r0) goto L_0x007d
            r30 = r1
            goto L_0x007d
        L_0x02e2:
            double r0 = r0.Ayk()
            float r11 = (float) r0
            float r11 = X.W2U.A01(r11)
            goto L_0x007d
        L_0x02ed:
            double r0 = r0.Ayk()
            float r10 = (float) r0
            float r10 = X.W2U.A01(r10)
            goto L_0x007d
        L_0x02f8:
            java.lang.String r0 = r0.C1u()
            X.C18672VwV.A00(r0)
            goto L_0x007d
        L_0x0301:
            java.lang.String r0 = r0.C1u()
            if (r0 != 0) goto L_0x030b
            r27 = 0
            goto L_0x007d
        L_0x030b:
            X.Uze r27 = X.C16684Uze.A01(r0)
            goto L_0x007d
        L_0x0311:
            X.Uwb[] r1 = X.C16531Uwb.values()
            int r0 = r0.BI6()
            r16 = r1[r0]
            goto L_0x007d
        L_0x031d:
            java.lang.String r1 = r0.C1u()
            if (r1 == 0) goto L_0x0358
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0358
            java.lang.String r0 = "uppercase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0337
            java.lang.Integer r15 = X.AnonymousClass05K.A01
            goto L_0x007d
        L_0x0337:
            java.lang.String r0 = "lowercase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0343
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            goto L_0x007d
        L_0x0343:
            java.lang.String r0 = "capitalize"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x034f
            java.lang.Integer r15 = X.AnonymousClass05K.A0N
            goto L_0x007d
        L_0x034f:
            java.lang.String r0 = "Invalid textTransform: "
            X.C13989Tnp.A1T(r0, r1)
            r15 = r32
            goto L_0x007d
        L_0x0358:
            r15 = r32
            goto L_0x007d
        L_0x035c:
            r0 = r34
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r0 = X.V6H.A00(r15, r0)
            r6.append(r0)
            int r1 = r6.length()
            r12 = 1
            boolean r0 = r7.contains(r12)
            r13 = -1
            if (r0 == 0) goto L_0x04b1
            int r2 = r7.getInt(r12)
        L_0x0379:
            r0 = r37
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x03bc
            r0 = r37
            boolean r0 = r7.getBoolean(r0)
            if (r0 == 0) goto L_0x03bc
            r0 = r38
            double r0 = r7.getDouble(r0)
            float r3 = (float) r0
            r4 = 2143289344(0x7fc00000, float:NaN)
            float r8 = X.W2U.A02(r3, r4)
            r0 = 4
            double r0 = r7.getDouble(r0)
            float r3 = (float) r0
            float r0 = X.W2U.A02(r3, r4)
            int r7 = r6.length()
            int r7 = r7 - r12
            int r4 = r6.length()
            int r3 = (int) r8
            int r1 = (int) r0
            X.U2c r0 = new X.U2c
            r0.<init>(r2, r3, r1)
            X.Vu9 r2 = new X.Vu9
            r2.<init>(r0, r7, r4)
        L_0x03b5:
            r5.add(r2)
        L_0x03b8:
            int r9 = r9 + 1
            goto L_0x0038
        L_0x03bc:
            if (r1 < r4) goto L_0x03b8
            if (r16 == 0) goto L_0x04ab
            X.Uwb r7 = X.C16531Uwb.LINK
        L_0x03c2:
            r0 = r16
            if (r0 != r7) goto L_0x03ce
            X.U2K r0 = new X.U2K
            r0.<init>(r2)
            A05(r0, r5, r4, r1)
        L_0x03ce:
            if (r25 == 0) goto L_0x03da
            com.facebook.react.views.text.internal.span.ReactForegroundColorSpan r7 = new com.facebook.react.views.text.internal.span.ReactForegroundColorSpan
            r0 = r24
            r7.<init>(r0)
            A05(r7, r5, r4, r1)
        L_0x03da:
            if (r23 == 0) goto L_0x03e6
            com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan r7 = new com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan
            r0 = r22
            r7.<init>(r0)
            A05(r7, r5, r4, r1)
        L_0x03e6:
            boolean r0 = java.lang.Float.isNaN(r21)
            if (r0 != 0) goto L_0x03f6
            X.U2C r7 = new X.U2C
            r0 = r21
            r7.<init>(r0)
            A05(r7, r5, r4, r1)
        L_0x03f6:
            r0 = r17
            float r0 = X.W2U.A03(r3, r0)
            if (r8 <= 0) goto L_0x04ce
            float r7 = (float) r8
            float r0 = r0 / r7
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L_0x0415
            r0 = r17
            float r3 = X.W2U.A03(r3, r0)
            float r3 = r3 / r7
            X.U2R r0 = new X.U2R
            r0.<init>(r3)
            A05(r0, r5, r4, r1)
        L_0x0415:
            com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan r0 = new com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan
            r0.<init>(r8)
            A05(r0, r5, r4, r1)
            r0 = r19
            if (r0 != r13) goto L_0x0427
            r0 = r20
            if (r0 != r13) goto L_0x0427
            if (r42 == 0) goto L_0x0439
        L_0x0427:
            android.content.res.AssetManager r40 = r45.getAssets()
            X.U2S r0 = new X.U2S
            r39 = r0
            r43 = r19
            r44 = r20
            r39.<init>(r40, r41, r42, r43, r44)
            A05(r0, r5, r4, r1)
        L_0x0439:
            if (r29 == 0) goto L_0x0443
            com.facebook.react.views.text.internal.span.ReactUnderlineSpan r0 = new com.facebook.react.views.text.internal.span.ReactUnderlineSpan
            r0.<init>()
            A05(r0, r5, r4, r1)
        L_0x0443:
            if (r28 == 0) goto L_0x044d
            com.facebook.react.views.text.internal.span.ReactStrikethroughSpan r0 = new com.facebook.react.views.text.internal.span.ReactStrikethroughSpan
            r0.<init>()
            A05(r0, r5, r4, r1)
        L_0x044d:
            r3 = 0
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x045a
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x045a
            int r0 = (r31 > r3 ? 1 : (r31 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x046c
        L_0x045a:
            int r0 = android.graphics.Color.alpha(r30)
            if (r0 == 0) goto L_0x046c
            X.U2D r7 = new X.U2D
            r3 = r31
            r0 = r30
            r7.<init>(r11, r10, r3, r0)
            A05(r7, r5, r4, r1)
        L_0x046c:
            boolean r7 = java.lang.Float.isNaN(r18)
            if (r7 != 0) goto L_0x04a8
            r3 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x04a8
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 <= 0) goto L_0x04a8
        L_0x047e:
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x049c
            if (r7 != 0) goto L_0x0492
            r3 = 2143289344(0x7fc00000, float:NaN)
            boolean r0 = java.lang.Float.isNaN(r3)
            if (r0 != 0) goto L_0x0492
            int r0 = (r3 > r18 ? 1 : (r3 == r18 ? 0 : -1))
            if (r0 > 0) goto L_0x0494
        L_0x0492:
            r3 = r18
        L_0x0494:
            X.W7v r0 = new X.W7v
            r0.<init>(r3)
            A05(r0, r5, r4, r1)
        L_0x049c:
            X.WJc r0 = new X.WJc
            r0.<init>(r2)
            X.Vu9 r2 = new X.Vu9
            r2.<init>(r0, r4, r1)
            goto L_0x03b5
        L_0x04a8:
            r3 = r18
            goto L_0x047e
        L_0x04ab:
            r16 = r27
            X.Uze r7 = X.C16684Uze.LINK
            goto L_0x03c2
        L_0x04b1:
            r2 = -1
            goto L_0x0379
        L_0x04b4:
            r1 = 0
        L_0x04b5:
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x001e
            int r0 = r5.size()
            int r0 = r0 - r1
            int r0 = r0 + -1
            java.lang.Object r0 = r5.get(r0)
            X.Vu9 r0 = (X.C18557Vu9) r0
            r0.A01(r6, r1)
            int r1 = r1 + 1
            goto L_0x04b5
        L_0x04ce:
            java.lang.String r0 = "FontSize should be a positive value. Current value: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3I.A03(android.content.Context, X.XCN):android.text.Spannable");
    }

    public static void A04(Layout.Alignment alignment, Spannable spannable, C245103cK r17, C245103cK r18, double d, float f, float f2, int i, int i2, int i3, boolean z) {
        double d2 = d;
        Spannable spannable2 = spannable;
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable2, A00);
        Layout.Alignment alignment2 = alignment;
        C245103cK r13 = r17;
        float f3 = f;
        int i4 = i2;
        int i5 = i3;
        boolean z2 = z;
        Layout A02 = A02(isBoring, alignment2, spannable2, r13, f3, i4, i5, z2);
        if (Double.isNaN(d2)) {
            d2 = (double) W2U.A01(4.0f);
        }
        int i6 = (int) d2;
        Class<ReactAbsoluteSizeSpan> cls = ReactAbsoluteSizeSpan.class;
        int i7 = i6;
        for (ReactAbsoluteSizeSpan size : (ReactAbsoluteSizeSpan[]) spannable2.getSpans(0, spannable2.length(), cls)) {
            i7 = Math.max(i7, size.getSize());
        }
        int i8 = i7;
        while (i8 > i6) {
            int i9 = i;
            if ((i9 != -1 && i != 0 && A02.getLineCount() > i9) || (r18 != C245103cK.UNDEFINED && ((float) A02.getHeight()) > f2)) {
                i8 -= Math.max(1, (int) W2U.A01(1.0f));
                float f4 = ((float) i8) / ((float) i7);
                ReactAbsoluteSizeSpan[] reactAbsoluteSizeSpanArr = (ReactAbsoluteSizeSpan[]) spannable2.getSpans(0, spannable2.length(), cls);
                int length = reactAbsoluteSizeSpanArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    C13990Tnq.A0s(spannable2, reactAbsoluteSizeSpanArr, f4, i10, i6);
                }
                A02 = A02(isBoring, alignment2, spannable2, r13, f3, i4, i5, z2);
            } else {
                return;
            }
        }
    }

    public static void A05(C20838X0n x0n, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C18557Vu9(x0n, i, i2));
    }
}
