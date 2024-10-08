package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class Q6X extends Drawable.ConstantState {
    public final C11271SIi A00;

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable(Resources resources) {
        return new Q6Z(this);
    }

    public Q6X(C11271SIi sIi) {
        this.A00 = sIi;
    }

    public final Drawable newDrawable() {
        return new Q6Z(this);
    }
}
