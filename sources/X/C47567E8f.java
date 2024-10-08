package X;

import android.text.TextPaint;

/* renamed from: X.E8f  reason: case insensitive filesystem */
public abstract class C47567E8f extends C252983q1 {
    public final Integer A00;

    public C47567E8f(04x r2, Integer num, String str, int i) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = r2;
        this.A00 = Integer.valueOf(i);
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        Integer num = this.A00;
        if (num != null) {
            textPaint.setColor(num.intValue());
        }
        textPaint.setUnderlineText(false);
    }
}
