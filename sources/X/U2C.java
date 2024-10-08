package X;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

public final class U2C extends CharacterStyle implements UpdateAppearance, C20838X0n {
    public final float A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        float f = this.A00;
        textPaint.setAlpha(AnonymousClass7TE.A06((float) Color.alpha(textPaint.getColor()), f));
        int i = textPaint.bgColor;
        if (i != 0) {
            textPaint.bgColor = Color.argb(AnonymousClass7TE.A06((float) Color.alpha(i), f), Color.red(textPaint.bgColor), Color.green(textPaint.bgColor), Color.blue(textPaint.bgColor));
        }
    }

    public U2C(float f) {
        this.A00 = f;
    }
}
