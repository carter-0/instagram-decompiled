package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Wav  reason: case insensitive filesystem */
public final class C19509Wav implements AnonymousClass3N3 {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final CircularImageView A07;
    public final ReelBrandingBadgeView A08;
    public final GradientSpinner A09;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A07);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A07;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A07);
    }

    public final GradientSpinner Bkt() {
        return this.A09;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A07.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A07.setVisibility(0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public C19509Wav(View view) {
        this.A00 = view.requireViewById(R.id.location_page_header_container);
        this.A01 = view.requireViewById(R.id.reel);
        this.A09 = (GradientSpinner) view.requireViewById(R.id.reel_ring);
        ? A0X = DbU.A0X(view, R.id.profile_image);
        this.A07 = A0X;
        A0X.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A08 = (ReelBrandingBadgeView) view.requireViewById(R.id.branding_badge);
        this.A06 = DbU.A0G(view, R.id.category_name);
        this.A03 = DbU.A0G(view, R.id.dot_separator);
        this.A05 = DbU.A0G(view, R.id.distance);
        this.A04 = DbU.A0G(view, R.id.more_info);
        this.A02 = DbU.A0G(view, R.id.city);
    }
}
