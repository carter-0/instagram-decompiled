package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

/* renamed from: X.Dj5  reason: case insensitive filesystem */
public abstract class C46676Dj5 extends ClickableSpan {
    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setColor(textPaint.linkColor);
        textPaint.setUnderlineText(false);
    }
}
