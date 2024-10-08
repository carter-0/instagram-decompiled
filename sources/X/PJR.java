package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

public final class PJR implements AnonymousClass3N3 {
    public View A00;
    public IgTextView A01;
    public IgImageView A02;
    public final ViewGroup A03;
    public final ViewGroup A04;
    public final FrameLayout A05;
    public final IgTextView A06;
    public final CircularImageView A07;
    public final C252063oV A08;
    public final C252063oV A09;
    public final C252063oV A0A;
    public final GradientSpinner A0B;

    public PJR(ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        this.A04 = viewGroup;
        this.A03 = DbU.A0C(viewGroup, R.id.avatar_search_user_container);
        DbU.A0D(viewGroup, R.id.row_search_avatar_with_ring_stub).inflate();
        this.A07 = DbU.A0X(viewGroup, R.id.row_search_avatar_in_ring);
        this.A0B = (GradientSpinner) viewGroup.requireViewById(R.id.reel_seen_state);
        this.A05 = (FrameLayout) viewGroup.requireViewById(R.id.row_search_avatar_with_ring);
        IgTextView A0a = DbT.A0a(viewGroup, R.id.row_search_user_username);
        this.A06 = A0a;
        A0a.getPaint().setFakeBoldText(true);
        this.A08 = DbU.A0Z(viewGroup, R.id.live_badge_stub);
        this.A09 = DbU.A0Z(viewGroup, R.id.pulse_emitter_stub);
        this.A0A = DbU.A0Z(viewGroup, R.id.pulsing_image_view_stub);
    }

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
        return this.A0B;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A07.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A07.setVisibility(0);
    }
}
