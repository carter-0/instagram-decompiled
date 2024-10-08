package X;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jcf  reason: case insensitive filesystem */
public final class C59970Jcf extends Drawable.ConstantState {
    public final int A00;
    public final String A01;
    public final Typeface A02;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new C59989Jcy(this.A02, this.A01, this.A00);
    }

    public C59970Jcf(Typeface typeface, String str, int i) {
        this.A01 = str;
        this.A02 = typeface;
        this.A00 = i;
    }
}
