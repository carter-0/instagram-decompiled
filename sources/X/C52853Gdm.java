package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdm  reason: case insensitive filesystem */
public final class C52853Gdm extends ViewOutlineProvider {
    public final float A00;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public C52853Gdm(float f) {
        this.A00 = f;
    }
}
