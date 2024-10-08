package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Sij  reason: case insensitive filesystem */
public abstract class C11910Sij implements C13796ThF, C13532Tc4 {
    public final Drawable A00;

    public final /* bridge */ /* synthetic */ Object get() {
        Drawable drawable = this.A00;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }

    public final void initialize() {
        Bitmap bitmap;
        boolean z = this instanceof QHL;
        Drawable drawable = this.A00;
        if (!z) {
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
                bitmap.prepareToDraw();
            } else if (!(drawable instanceof Q6Z)) {
                return;
            }
        }
        bitmap = ((Q6Z) drawable).A09.A00.A03;
        bitmap.prepareToDraw();
    }

    public C11910Sij(Drawable drawable) {
        this.A00 = drawable;
    }
}
