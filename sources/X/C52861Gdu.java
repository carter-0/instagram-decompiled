package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdu  reason: case insensitive filesystem */
public final class C52861Gdu extends ViewOutlineProvider {
    public final int A00;
    public final int A01;

    public final void getOutline(View view, Outline outline) {
        AnonymousClass7TF.A1H(view, outline);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.A01);
    }

    public C52861Gdu(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }
}
