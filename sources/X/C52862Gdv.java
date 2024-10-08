package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.Gdv  reason: case insensitive filesystem */
public final class C52862Gdv extends ViewOutlineProvider {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;

    public C52862Gdv(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null) {
            Outline outline2 = outline;
            if (outline != null) {
                int i = this.A01;
                int i2 = this.A00;
                outline2.setRoundRect(i, i2, view.getWidth() - i, view.getHeight() - i2, (float) i2);
            }
        }
    }
}
