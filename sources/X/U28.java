package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class U28 extends CharacterStyle {
    public int A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setAlpha(this.A00);
    }

    public U28(int i) {
        int max = Math.max(i, 0);
        this.A00 = max;
        this.A00 = Math.min(max, 255);
    }
}
