package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.Gd6  reason: case insensitive filesystem */
public final class C52814Gd6 extends CharacterStyle {
    public final /* synthetic */ int A00;

    public C52814Gd6(int i) {
        this.A00 = i;
    }

    public final void updateDrawState(TextPaint textPaint) {
        DbW.A0u(textPaint);
        textPaint.setFakeBoldText(true);
        textPaint.setColor(this.A00);
    }
}
