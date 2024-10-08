package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdl  reason: case insensitive filesystem */
public final class C52852Gdl extends ViewOutlineProvider {
    public final float A00;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }

    public C52852Gdl(float f) {
        this.A00 = f;
    }
}
