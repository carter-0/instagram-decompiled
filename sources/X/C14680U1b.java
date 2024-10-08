package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;

/* renamed from: X.U1b  reason: case insensitive filesystem */
public final class C14680U1b extends InsetDrawable {
    public final /* synthetic */ W34 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14680U1b(Drawable drawable, W34 w34, int i, int i2, int i3, int i4) {
        super(drawable, i, i2, i3, i4);
        this.A00 = w34;
    }

    public final int getMinimumHeight() {
        return -1;
    }

    public final int getMinimumWidth() {
        return -1;
    }

    public final boolean getPadding(Rect rect) {
        return false;
    }
}
