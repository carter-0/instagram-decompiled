package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5up  reason: invalid class name and case insensitive filesystem */
public final class C299255up extends ViewOutlineProvider {
    public final /* synthetic */ C276544tV A00;

    public final void getOutline(View view, Outline outline) {
        float f;
        0qQ.A0B(view, 0);
        0qQ.A0B(outline, 1);
        Drawable background = view.getBackground();
        if (background != null) {
            background.getOutline(outline);
            f = this.A00.A02(65, 1.0f);
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            f = 0.0f;
        }
        outline.setAlpha(f);
    }

    public C299255up(C276544tV r1) {
        this.A00 = r1;
    }
}
