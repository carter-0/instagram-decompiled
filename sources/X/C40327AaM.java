package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.AaM  reason: case insensitive filesystem */
public final class C40327AaM implements AnonymousClass88P {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ InteractiveDrawableContainer A01;

    public C40327AaM(Drawable drawable, InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A01 = interactiveDrawableContainer;
        this.A00 = drawable;
    }

    public final void Dti(float f, float f2, float f3, float f4) {
        InteractiveDrawableContainer interactiveDrawableContainer = this.A01;
        Drawable drawable = this.A00;
        interactiveDrawableContainer.A0o(drawable, f);
        interactiveDrawableContainer.A0n(drawable, f2);
        interactiveDrawableContainer.A0p(drawable, f3, f4);
    }
}
