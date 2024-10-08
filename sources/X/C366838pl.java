package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.8pl  reason: invalid class name and case insensitive filesystem */
public final class C366838pl extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public final boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public final int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C366808pi r2 = new C366808pi();
        Drawable newDrawable = this.A00.newDrawable(resources, theme);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A02);
        return r2;
    }

    public C366838pl(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public final Drawable newDrawable(Resources resources) {
        C366808pi r2 = new C366808pi();
        Drawable newDrawable = this.A00.newDrawable(resources);
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A02);
        return r2;
    }

    public final Drawable newDrawable() {
        C366808pi r2 = new C366808pi();
        Drawable newDrawable = this.A00.newDrawable();
        r2.A00 = newDrawable;
        newDrawable.setCallback(r2.A02);
        return r2;
    }
}
