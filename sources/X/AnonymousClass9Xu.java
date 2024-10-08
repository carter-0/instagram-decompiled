package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.9Xu  reason: invalid class name */
public final class AnonymousClass9Xu extends ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        int width = view.getWidth();
        float A03 = AnonymousClass7TE.A03(view);
        float f = this.A00;
        outline.setRoundRect(0, 0, width, (int) (A03 + f), f);
    }

    public AnonymousClass9Xu(float f) {
        this.A00 = f;
    }
}
