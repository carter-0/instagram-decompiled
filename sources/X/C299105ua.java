package X;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.5ua  reason: invalid class name and case insensitive filesystem */
public final class C299105ua extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C276544tV A01;

    public final void getOutline(View view, Outline outline) {
        0qQ.A0B(view, 0);
        0qQ.A0B(outline, 1);
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), this.A00);
        Drawable background = view.getBackground();
        if (background != null) {
            C276544tV r2 = this.A01;
            background.getOutline(outline);
            outline.setAlpha(r2.A02(65, 1.0f));
        }
    }

    public C299105ua(C276544tV r1, float f) {
        this.A00 = f;
        this.A01 = r1;
    }
}
