package X;

import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;

/* renamed from: X.Ruh  reason: case insensitive filesystem */
public final class C10587Ruh {
    public CharacterStyle A00;
    public final int A01;
    public final int A02;

    public C10587Ruh(Integer num, int i, int i2) {
        ForegroundColorSpan foregroundColorSpan;
        this.A01 = i;
        this.A02 = i2;
        if (num != null) {
            foregroundColorSpan = new ForegroundColorSpan(num.intValue());
        } else {
            foregroundColorSpan = null;
        }
        this.A00 = foregroundColorSpan;
    }
}
