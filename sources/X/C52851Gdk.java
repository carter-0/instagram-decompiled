package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdk  reason: case insensitive filesystem */
public final class C52851Gdk extends ViewOutlineProvider {
    public final /* synthetic */ View A00;

    public C52851Gdk(View view) {
        this.A00 = view;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setPath(I7E.A02(this.A00.getWidth()));
        }
    }
}
