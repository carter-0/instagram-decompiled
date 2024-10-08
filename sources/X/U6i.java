package X;

import android.text.TextPaint;

public final class U6i extends C18930WDi {
    public final TextPaint A00;
    public final CharSequence A01;

    public final int A00(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 0);
    }

    public final int A01(int i) {
        TextPaint textPaint = this.A00;
        CharSequence charSequence = this.A01;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, i, 2);
    }

    public U6i(CharSequence charSequence, TextPaint textPaint) {
        this.A01 = charSequence;
        this.A00 = textPaint;
    }
}
