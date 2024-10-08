package X;

import android.view.View;

/* renamed from: X.2fm  reason: invalid class name and case insensitive filesystem */
public final class C226162fm implements C226172fn {
    public final /* synthetic */ C226142fk A00;

    public final void DmF(Integer num, float f) {
        View view;
        float f2;
        0qQ.A0B(num, 1);
        double d = (double) f;
        if (d < 0.5d && num == AnonymousClass05K.A0N) {
            view = this.A00.A03;
            0qQ.A0A(view);
            f2 = 1.0f;
        } else if (d > 0.5d && num == AnonymousClass05K.A01) {
            view = this.A00.A03;
            0qQ.A0A(view);
            f2 = 0.0f;
        } else {
            return;
        }
        view.setAlpha(f2);
    }

    public C226162fm(C226142fk r1) {
        this.A00 = r1;
    }
}
