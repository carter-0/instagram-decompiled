package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.IWr  reason: case insensitive filesystem */
public final class C57308IWr implements AnonymousClass3N3 {
    public final RectF A00;
    public final View A01;
    public final GradientSpinner A02;

    public final boolean EtJ() {
        return false;
    }

    public final RectF AeG() {
        return this.A00;
    }

    public final View AeY() {
        return this.A01;
    }

    public final /* synthetic */ RectF AhX() {
        return this.A00;
    }

    public final GradientSpinner Bkt() {
        return this.A02;
    }

    public final void CLE() {
        this.A01.setVisibility(4);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        this.A01.setVisibility(0);
    }

    public C57308IWr(View view, GradientSpinner gradientSpinner) {
        AnonymousClass7TG.A1O(view, gradientSpinner);
        this.A01 = view;
        this.A02 = gradientSpinner;
        RectF rectF = 0nA.A01;
        RectF A0Y = AnonymousClass7TE.A0Y();
        0nA.A0L(A0Y, view);
        this.A00 = A0Y;
    }
}
