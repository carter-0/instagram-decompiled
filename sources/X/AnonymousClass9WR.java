package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: X.9WR  reason: invalid class name */
public final class AnonymousClass9WR extends Drawable.ConstantState {
    public final Drawable.ConstantState A00;

    public final boolean canApplyTheme() {
        return this.A00.canApplyTheme();
    }

    public int getChangingConfigurations() {
        return this.A00.getChangingConfigurations();
    }

    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        AnonymousClass3NY r1 = new AnonymousClass3NY();
        r1.A00 = this.A00.newDrawable(resources, theme);
        return r1;
    }

    public AnonymousClass9WR(Drawable.ConstantState constantState) {
        this.A00 = constantState;
    }

    public final Drawable newDrawable(Resources resources) {
        AnonymousClass3NY r1 = new AnonymousClass3NY();
        r1.A00 = this.A00.newDrawable(resources);
        return r1;
    }

    public final Drawable newDrawable() {
        AnonymousClass3NY r1 = new AnonymousClass3NY();
        r1.A00 = this.A00.newDrawable();
        return r1;
    }
}
