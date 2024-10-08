package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.9Xb  reason: invalid class name and case insensitive filesystem */
public final class C380209Xb extends CharacterStyle implements UpdateAppearance {
    public final int A00;

    public final void updateDrawState(TextPaint textPaint) {
        0qQ.A0B(textPaint, 0);
        textPaint.setColor(this.A00);
    }

    public C380209Xb(int i) {
        this.A00 = i;
    }
}
