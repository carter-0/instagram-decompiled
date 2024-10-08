package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.8La  reason: invalid class name and case insensitive filesystem */
public final class C354198La extends ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;

    public C354198La(int i, float f) {
        this.A01 = i;
        this.A00 = f;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null) {
            Outline outline2 = outline;
            if (outline != null) {
                outline2.setRoundRect(0, this.A01, view.getWidth(), view.getHeight(), this.A00);
            }
        }
    }
}
