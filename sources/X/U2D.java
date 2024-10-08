package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class U2D extends CharacterStyle implements C20838X0n {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setShadowLayer(this.A02, this.A00, this.A01, this.A03);
    }

    public U2D(float f, float f2, float f3, int i) {
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = i;
    }
}
