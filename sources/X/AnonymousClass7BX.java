package X;

import android.graphics.RectF;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: X.7BX  reason: invalid class name */
public final class AnonymousClass7BX extends OvalShape {
    public final float A00;

    public AnonymousClass7BX(float f) {
        this.A00 = f;
    }

    public final void onResize(float f, float f2) {
        RectF rect = rect();
        float f3 = this.A00;
        rect.set(f3, f3, f - f3, f2 - f3);
    }
}
