package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* renamed from: X.9qX  reason: invalid class name and case insensitive filesystem */
public final class C389979qX extends C306386Ly {
    public boolean A00;
    public final Drawable A01;
    public final boolean A02;

    public final void draw(Canvas canvas) {
        Drawable drawable;
        0qQ.A0B(canvas, 0);
        super.draw(canvas);
        if (this.A00) {
            if (this.A02 && (drawable = this.A01) != null) {
                drawable.draw(canvas);
            }
            invalidateSelf();
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A01;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public C389979qX(Context context, Drawable drawable, int i, boolean z) {
        super(context, i);
        this.A01 = drawable;
        this.A02 = z;
    }
}
