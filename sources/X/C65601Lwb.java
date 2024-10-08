package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Lwb  reason: case insensitive filesystem */
public final class C65601Lwb implements AnonymousClass3N3 {
    public final IgImageView A00;
    public final GradientSpinner A01;

    public final boolean EtJ() {
        return true;
    }

    public final RectF AeG() {
        return 0nA.A0F(this.A00);
    }

    public final View AeY() {
        return this.A00;
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A00);
    }

    public final GradientSpinner Bkt() {
        return this.A01;
    }

    public final void CLE() {
        this.A00.setVisibility(4);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        this.A00.setVisibility(0);
    }

    public C65601Lwb(IgImageView igImageView, GradientSpinner gradientSpinner) {
        this.A00 = igImageView;
        this.A01 = gradientSpinner;
    }
}
