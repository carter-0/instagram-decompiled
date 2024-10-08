package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdo  reason: case insensitive filesystem */
public final class C52855Gdo extends ViewOutlineProvider {
    public final /* synthetic */ int A00;

    public C52855Gdo(int i) {
        this.A00 = i;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setPath(I7E.A02(this.A00));
        }
    }
}
