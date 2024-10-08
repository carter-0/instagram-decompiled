package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Tzw  reason: case insensitive filesystem */
public final class C14650Tzw extends ViewOutlineProvider {
    public final /* synthetic */ C276544tV A00;

    public C14650Tzw(C276544tV r1) {
        this.A00 = r1;
    }

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TG.A1N(view, outline);
        Drawable background = view.getBackground();
        if (background != null) {
            C276544tV r2 = this.A00;
            background.getOutline(outline);
            outline.setAlpha(r2.A02(65, 1.0f));
        }
    }
}
