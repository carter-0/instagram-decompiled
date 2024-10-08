package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdt  reason: case insensitive filesystem */
public final class C52860Gdt extends ViewOutlineProvider {
    public final float A00;
    public final int A01;

    public C52860Gdt(float f, int i) {
        this.A01 = i;
        this.A00 = f;
    }

    public final void getOutline(View view, Outline outline) {
        int i;
        Outline outline2 = outline;
        if (this.A01 != 0) {
            i = 0;
            AnonymousClass7TF.A1H(view, outline);
        } else if (view != null && outline != null) {
            i = 0;
        } else {
            return;
        }
        outline2.setRoundRect(i, i, view.getWidth(), view.getHeight(), this.A00);
    }
}
