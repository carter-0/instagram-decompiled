package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.2hL  reason: invalid class name */
public final class AnonymousClass2hL extends ViewOutlineProvider {
    public final void getOutline(View view, Outline outline) {
        0qQ.A0B(view, 0);
        0qQ.A0B(outline, 1);
        outline.setOval(0, 0, view.getWidth(), view.getHeight());
    }
}
