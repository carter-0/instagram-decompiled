package X;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import java.util.Locale;

/* renamed from: X.3q2  reason: invalid class name and case insensitive filesystem */
public abstract class C252993q2 {
    public static final CharSequence A00 = "…";

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00aa, code lost:
        if (r2 > r4) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ac, code lost:
        r4 = r4 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r2 > r4) goto L_0x00ac;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.CharSequence A01(X.0rN r7, java.lang.CharSequence r8, java.lang.CharSequence r9, java.lang.CharSequence r10, int r11, boolean r12) {
        /*
            r3 = 1
            if (r11 < r3) goto L_0x0025
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r8)
            r5.append(r9)
            int r0 = r7.A00
            if (r0 >= 0) goto L_0x0026
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "Negative text width %d passed into maybeTruncateText(). Will render empty string instead of \"%s\"."
            java.lang.String r0 = com.facebook.common.stringformat.StringFormatUtil.formatStrLocaleSafe(r0, r1, r5)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            java.lang.String r0 = "EllipsizeTextUtil"
            X.0wb.A07(r0, r1)
        L_0x0023:
            java.lang.String r9 = ""
        L_0x0025:
            return r9
        L_0x0026:
            android.text.StaticLayout r1 = r7.A00(r5)
            int r0 = r1.getLineCount()
            if (r0 <= r11) goto L_0x0025
            int r0 = r11 + -1
            int r4 = r1.getLineStart(r0)
            int r0 = r1.getLineEnd(r0)
            java.lang.String r2 = r5.substring(r4, r0)
            android.text.TextPaint r1 = r7.A04
            int r0 = r7.A00
            java.lang.StringBuilder r2 = A03(r1, r10, r2, r0)
            int r1 = r2.length()
            int r1 = r1 + r4
            int r0 = r8.length()
            if (r1 < r0) goto L_0x0023
            int r1 = r8.length()
            int r0 = r2.length()
            int r4 = r4 + r0
            java.lang.CharSequence r0 = r5.subSequence(r1, r4)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            r4 = 0
            if (r12 != 0) goto L_0x00ad
            int r0 = r8.length()
            java.lang.String r0 = r5.substring(r0)
            java.lang.String r8 = r9.toString()
            java.lang.String r6 = r0.toString()
            int r4 = r9.length()
            r1 = 64
            int r5 = r8.lastIndexOf(r1)
            r7 = -1
            if (r5 == r7) goto L_0x00ca
            java.util.regex.Pattern r0 = X.0mp.A03
            r2 = -1
            if (r6 == 0) goto L_0x00aa
            if (r5 < 0) goto L_0x00aa
            int r0 = r6.length()
            if (r5 >= r0) goto L_0x00aa
            char r0 = r6.charAt(r5)
            if (r0 != r1) goto L_0x00aa
            java.util.regex.Matcher r1 = X.0mp.A09(r6)
            boolean r0 = r1.find(r5)
            if (r0 == 0) goto L_0x00aa
            int r0 = r1.start()
            if (r5 != r0) goto L_0x00aa
            int r2 = r1.end(r3)
        L_0x00aa:
            if (r2 <= r4) goto L_0x00ca
        L_0x00ac:
            int r4 = r4 - r5
        L_0x00ad:
            int r0 = r9.length()
            int r0 = r0 - r4
            r9.setLength(r0)
            int r1 = r9.length()
        L_0x00b9:
            if (r1 <= 0) goto L_0x0100
            int r0 = r1 + -1
            char r0 = r9.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0100
            int r1 = r1 + -1
            goto L_0x00b9
        L_0x00ca:
            r1 = 35
            int r5 = r8.lastIndexOf(r1)
            if (r5 == r7) goto L_0x00fe
            r2 = -1
            if (r6 == 0) goto L_0x00fb
            if (r5 < 0) goto L_0x00fb
            int r0 = r6.length()
            if (r5 >= r0) goto L_0x00fb
            char r0 = r6.charAt(r5)
            if (r0 != r1) goto L_0x00fb
            java.util.regex.Pattern r0 = X.C253063q9.A01()
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find(r5)
            if (r0 == 0) goto L_0x00fb
            int r0 = r1.start()
            if (r0 != r5) goto L_0x00fb
            int r2 = r1.end(r3)
        L_0x00fb:
            if (r2 <= r4) goto L_0x00fe
            goto L_0x00ac
        L_0x00fe:
            r4 = 0
            goto L_0x00ad
        L_0x0100:
            r9.setLength(r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252993q2.A01(X.0rN, java.lang.CharSequence, java.lang.CharSequence, java.lang.CharSequence, int, boolean):java.lang.CharSequence");
    }

    public static SpannableStringBuilder A00(Spanned spanned, 0rN r14, CharSequence charSequence, int i) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A01(r14, "", spanned, charSequence, i, false).toString());
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (spanStart >= 0 && spanEnd > spanStart && spanStart < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(obj, spanStart, Math.min(spanEnd, spannableStringBuilder.length()), 33);
            }
        }
        if (spannableStringBuilder.length() < "".length() + spanned.length()) {
            spannableStringBuilder.append(charSequence);
        }
        return spannableStringBuilder;
    }

    public static String A02(0rN r9, CharSequence charSequence, CharSequence charSequence2, int i) {
        String charSequence3 = A01(r9, "", charSequence, charSequence2, i, false).toString();
        if (charSequence3.length() >= "".length() + charSequence.length()) {
            return charSequence3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(charSequence3);
        sb.append(charSequence2);
        return sb.toString();
    }

    public static StringBuilder A03(TextPaint textPaint, CharSequence charSequence, String str, int i) {
        int i2;
        StringBuilder sb = new StringBuilder(str);
        int length = sb.length();
        sb.append(charSequence);
        float measureText = textPaint.measureText(sb, 0, sb.length());
        boolean z = true;
        while (measureText > ((float) i)) {
            if (z) {
                i2 = Character.codePointCount(charSequence, 0, charSequence.length());
                int codePointCount = sb.codePointCount(0, length);
                if (i2 > codePointCount) {
                    0wb.A03("EllipsizeTextUtil.trimLineToFitSuffix#SuffixLongerThanContent", String.format(Locale.US, "Suffix longer than content: '%s', suffix: '%s', endOfLinePosition: %d trimCodePoints: %d", new Object[]{str, charSequence, Integer.valueOf(length), Integer.valueOf(i2)}));
                    i2 = codePointCount;
                }
            } else {
                i2 = 1;
            }
            try {
                length = sb.offsetByCodePoints(length, -i2);
                sb.setLength(length);
                sb.append(charSequence);
                measureText = textPaint.measureText(sb, 0, sb.length());
                z = false;
            } catch (IndexOutOfBoundsException unused) {
                0wb.A03("EllipsizeTextUtil.trimLineToFitSuffix#IndexOutOfBoundsException", String.format(Locale.US, "Attempted to trim line: '%s', suffix: '%s', endOfLinePosition: %d trimCodePoints: %d", new Object[]{str, charSequence, Integer.valueOf(length), Integer.valueOf(i2)}));
            }
        }
        sb.setLength(length);
        return sb;
    }
}
