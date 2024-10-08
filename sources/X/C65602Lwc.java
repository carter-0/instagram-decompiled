package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Lwc  reason: case insensitive filesystem */
public final class C65602Lwc implements AnonymousClass3N3 {
    public final View A00;
    public final IgImageView A01;
    public final GradientSpinner A02;

    public final boolean EtJ() {
        return true;
    }

    public final RectF AeG() {
        return 0nA.A0F(this.A01);
    }

    public final /* bridge */ /* synthetic */ View AeY() {
        return this.A01;
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A01);
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

    public C65602Lwc(View view, IgImageView igImageView, GradientSpinner gradientSpinner) {
        AnonymousClass7TG.A1Q(igImageView, gradientSpinner);
        this.A00 = view;
        this.A01 = igImageView;
        this.A02 = gradientSpinner;
    }
}
