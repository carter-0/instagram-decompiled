package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdj  reason: case insensitive filesystem */
public final class C52850Gdj extends ViewOutlineProvider {
    public final int A00;

    public C52850Gdj(int i) {
        this.A00 = i;
    }

    public final void getOutline(View view, Outline outline) {
        if (this.A00 != 0) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        } else if (view instanceof C52846Gdc) {
            ViewOutlineProvider viewOutlineProvider = C52846Gdc.A0A;
            Outline outline2 = ((C52846Gdc) view).A00;
            if (outline2 != null) {
                outline.set(outline2);
            }
        }
    }
}
