package X;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Fkf  reason: case insensitive filesystem */
public final class C50900Fkf implements AnonymousClass3N3 {
    public View A00;
    public AnonymousClass6VJ A01;
    public C49525Ex5 A02;
    public String A03;
    public final ViewStub A04;
    public final FrameLayout A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final AnonymousClass3NM A0A;
    public final CircularImageView A0B;
    public final GradientSpinner A0C;
    public final FollowButton A0D;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A0B);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A0B;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A0B);
    }

    public final GradientSpinner Bkt() {
        return this.A0C;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A0B.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A0B.setVisibility(0);
    }

    public C50900Fkf(View view) {
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.featured_user_profile_picture_container);
        this.A05 = frameLayout;
        this.A0C = (GradientSpinner) view.requireViewById(R.id.featured_user_reel_ring);
        this.A0B = DbU.A0X(view, R.id.featured_user_profile_picture);
        this.A08 = DbU.A0G(view, R.id.featured_user_username);
        this.A06 = DbU.A0G(view, R.id.featured_user_fullname);
        this.A07 = DbU.A0G(view, R.id.featured_user_social_context);
        this.A0D = (FollowButton) view.requireViewById(R.id.featured_user_follow_button);
        this.A04 = DbU.A0D(view, R.id.featured_user_direct_message_stub);
        this.A09 = DbU.A0G(view, R.id.featured_user_view_profile_button);
        AnonymousClass3NG r2 = new AnonymousClass3NG(frameLayout);
        r2.A07 = true;
        r2.A04 = new C47794EHf(this, 6);
        this.A0A = r2.A00();
    }
}
