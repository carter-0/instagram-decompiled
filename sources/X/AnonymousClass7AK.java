package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.7AK  reason: invalid class name */
public class AnonymousClass7AK extends ClickableSpan {
    public final Integer A00;

    public void onClick(View view) {
    }

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
        textPaint.setFakeBoldText(true);
    }

    public AnonymousClass7AK(Integer num) {
        this.A00 = num;
    }

    public AnonymousClass7AK() {
        this((Integer) null);
    }
}
