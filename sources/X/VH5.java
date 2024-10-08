package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;

public abstract class VH5 {
    public static final CharSequence A00(Layout layout, SpannableStringBuilder spannableStringBuilder, 0rN r14, CharSequence charSequence, int i) {
        int i2;
        boolean A1U = AnonymousClass7TF.A1U(0, charSequence, spannableStringBuilder);
        if (r14.A00 <= 0) {
            return "";
        }
        int lineStart = layout.getLineStart(i - (A1U ? 1 : 0));
        TextPaint textPaint = r14.A04;
        char[] charArray = charSequence.toString().toCharArray();
        0qQ.A07(charArray);
        StringBuilder sb = new StringBuilder(charSequence.subSequence(lineStart, Math.min(textPaint.breakText(charArray, lineStart, charSequence.length() - lineStart, (float) r14.A00, (float[]) null) + lineStart, charSequence.length())));
        textPaint.setFakeBoldText(A1U);
        float lineWidth = r14.A00(spannableStringBuilder).getLineWidth(0);
        int length = sb.length();
        boolean z = true;
        for (float measureText = textPaint.measureText(sb, 0, sb.length()); measureText + lineWidth > ((float) r14.A00); measureText = textPaint.measureText(sb, 0, sb.length())) {
            if (z) {
                i2 = Character.codePointCount(spannableStringBuilder, 0, spannableStringBuilder.length());
                int codePointCount = sb.codePointCount(0, length);
                if (i2 > codePointCount) {
                    i2 = codePointCount;
                }
                z = false;
            } else {
                i2 = 1;
            }
            length = sb.offsetByCodePoints(length, -i2);
            sb.setLength(length);
        }
        sb.setLength(length);
        textPaint.setFakeBoldText(false);
        CharSequence subSequence = charSequence.subSequence(0, lineStart + sb.length());
        int length2 = subSequence.length();
        while (length2 > 0 && C13988Tno.A1Z(subSequence, length2 - 1)) {
            length2--;
        }
        return subSequence.subSequence(0, length2);
    }
}
