package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.9Xv  reason: invalid class name */
public final class AnonymousClass9Xv extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ InteractiveDrawableContainer A02;

    public AnonymousClass9Xv(InteractiveDrawableContainer interactiveDrawableContainer, float f, float f2) {
        this.A02 = interactiveDrawableContainer;
        this.A01 = f;
        this.A00 = f2;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null) {
            Outline outline2 = outline;
            if (outline != null) {
                InteractiveDrawableContainer interactiveDrawableContainer = this.A02;
                int left = interactiveDrawableContainer.getLeft();
                int top = interactiveDrawableContainer.getTop();
                float A022 = AnonymousClass7TE.A02(view);
                float f = this.A01;
                outline2.setRoundRect(left, top, (int) (A022 * f), (int) (AnonymousClass7TE.A03(view) * f), this.A00);
            }
        }
    }
}
