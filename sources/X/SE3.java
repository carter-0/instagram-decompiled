package X;

import android.graphics.Typeface;

public final class SE3 {
    public final int A00;
    public final Typeface A01;

    public SE3(int i) {
        this.A01 = null;
        this.A00 = i;
    }

    public SE3(Typeface typeface) {
        this.A01 = typeface;
        this.A00 = 0;
    }
}
