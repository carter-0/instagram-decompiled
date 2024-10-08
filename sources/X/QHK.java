package X;

import android.graphics.drawable.Drawable;

public final class QHK extends C11910Sij {
    public final void recycle() {
    }

    public final Class Bne() {
        return this.A00.getClass();
    }

    public final int getSize() {
        Drawable drawable = this.A00;
        return Math.max(1, drawable.getIntrinsicWidth() * drawable.getIntrinsicHeight() * 4);
    }
}
