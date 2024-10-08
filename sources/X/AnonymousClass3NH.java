package X;

import android.graphics.Paint;
import android.view.View;

/* renamed from: X.3NH  reason: invalid class name */
public final class AnonymousClass3NH implements AnonymousClass3NI {
    public float A00;
    public float A01;
    public final View A02;

    public AnonymousClass3NH(View view) {
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A00 = view.getScaleX();
        this.A01 = view.getScaleY();
    }

    public final void Cyw(AnonymousClass3NM r6) {
        if (r6.A07.A03 == 1.0d) {
            View view = this.A02;
            this.A00 = view.getScaleX();
            this.A01 = view.getScaleY();
        }
        if (r6.A0B) {
            this.A02.setLayerType(2, (Paint) null);
        }
    }

    public final void Cyx(AnonymousClass3NM r4) {
        if (!r4.A00) {
            this.A02.setLayerType(r4.A05, (Paint) null);
        }
    }

    public final void Cyy(AnonymousClass3NM r4) {
        float f = (float) r4.A07.A09.A00;
        View view = this.A02;
        view.setScaleX(this.A00 * f);
        view.setScaleY(f * this.A01);
    }

    public final void Df1(AnonymousClass3NM r4) {
        this.A02.setLayerType(r4.A05, (Paint) null);
    }
}
