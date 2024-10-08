package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.imageview.PulsingMultiImageView;

/* renamed from: X.FgE  reason: case insensitive filesystem */
public final class C50653FgE implements AnonymousClass70G {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final TextView A04;
    public final GradientSpinner A05;
    public final GradientSpinner A06;
    public final PulsingMultiImageView A07;
    public final PulsingMultiImageView A08;

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
        return this.A06;
    }

    public final void CLE() {
        this.A00.setVisibility(4);
    }

    public final void Eu3(AnonymousClass0iw r3) {
        this.A00.setVisibility(0);
    }

    public C50653FgE(View view) {
        this.A00 = view;
        this.A06 = (GradientSpinner) view.requireViewById(R.id.seen_state_circle_front);
        this.A05 = (GradientSpinner) view.requireViewById(R.id.seen_state_circle_back);
        this.A08 = (PulsingMultiImageView) view.requireViewById(R.id.tray_double_avatar_front);
        this.A07 = (PulsingMultiImageView) view.requireViewById(R.id.tray_double_avatar_back);
        View requireViewById = view.requireViewById(R.id.double_avatar_live_badge);
        this.A02 = requireViewById;
        requireViewById.getViewTreeObserver().addOnPreDrawListener(new C50120FPk(this, 2));
        this.A01 = view.requireViewById(R.id.badge_background);
        this.A03 = DbU.A0F(view, R.id.badge_icon);
        this.A04 = DbU.A0G(view, R.id.badge_label);
    }
}
