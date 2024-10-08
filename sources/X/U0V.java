package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class U0V extends Drawable.ConstantState {
    public int A00;
    public Drawable A01;
    public boolean A02;
    public boolean A03;

    public final int getChangingConfigurations() {
        return this.A00;
    }

    public final Drawable newDrawable(Resources resources) {
        return new U1J(resources, this);
    }

    public final Drawable newDrawable() {
        return new U1J((Resources) null, this);
    }
}
