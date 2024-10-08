package X;

import android.view.View;

/* renamed from: X.Lyk  reason: case insensitive filesystem */
public final class C65730Lyk implements C315626kE {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public C65730Lyk(View view, float f) {
        this.A01 = view;
        this.A00 = f;
    }

    public final void Df0() {
        View view = this.A01;
        float f = this.A00;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setPivotX(0.0f);
        view.setPivotY(AnonymousClass7TE.A03(view));
    }
}
