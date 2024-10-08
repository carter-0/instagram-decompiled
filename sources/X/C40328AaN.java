package X;

import android.graphics.drawable.Drawable;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.AaN  reason: case insensitive filesystem */
public final class C40328AaN implements AnonymousClass88P {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C40328AaN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void Dti(float f, float f2, float f3, float f4) {
        InteractiveDrawableContainer interactiveDrawableContainer;
        Object obj;
        switch (this.A00) {
            case 0:
            case 3:
                interactiveDrawableContainer = (InteractiveDrawableContainer) this.A01;
                obj = this.A02;
                break;
            case 1:
                interactiveDrawableContainer = ((C63874LAd) this.A02).A04;
                break;
            case 2:
                interactiveDrawableContainer = ((A77) this.A02).A02;
                break;
            default:
                interactiveDrawableContainer = (InteractiveDrawableContainer) this.A02;
                break;
        }
        obj = this.A01;
        Drawable drawable = (Drawable) obj;
        interactiveDrawableContainer.A0o(drawable, f);
        interactiveDrawableContainer.A0n(drawable, f2);
        interactiveDrawableContainer.A0p(drawable, f3, f4);
    }

    public C40328AaN(Drawable drawable, InteractiveDrawableContainer interactiveDrawableContainer, int i) {
        this.A00 = i;
        if (i != 0) {
            this.A02 = interactiveDrawableContainer;
            this.A01 = drawable;
        } else {
            this.A01 = interactiveDrawableContainer;
            this.A02 = drawable;
        }
    }
}
