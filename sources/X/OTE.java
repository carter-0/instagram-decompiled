package X;

import android.graphics.drawable.Drawable;

public final class OTE {
    public final int A00;
    public final Drawable A01;

    public OTE(int i) {
        this.A00 = i;
        this.A01 = null;
    }

    public OTE(Drawable drawable) {
        this.A00 = 0;
        this.A01 = drawable;
    }
}
