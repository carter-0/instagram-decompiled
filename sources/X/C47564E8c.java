package X;

import android.text.TextPaint;

/* renamed from: X.E8c  reason: case insensitive filesystem */
public abstract class C47564E8c extends C252983q1 {
    public final Integer A00;

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

    public C47564E8c(04x r1, Integer num, Integer num2, String str) {
        this.A02 = str;
        this.A01 = num2;
        this.A00 = r1;
        this.A00 = num;
    }
}
