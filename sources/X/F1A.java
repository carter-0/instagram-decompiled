package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.user.follow.FollowButton;

public final class F1A {
    public C49546Exh A00;
    public AnonymousClass6VJ A01;
    public String A02;
    public final View A03;
    public final ViewStub A04;
    public final FrameLayout A05;
    public final LinearLayout A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final IgSimpleImageView A0A;
    public final IgSimpleImageView A0B;
    public final IgSimpleImageView A0C;
    public final AnonymousClass3NM A0D;
    public final CircularImageView A0E;
    public final GradientSpinner A0F;
    public final FollowButton A0G;

    public F1A(View view) {
        0qQ.A0B(view, 1);
        this.A03 = view;
        FrameLayout frameLayout = (FrameLayout) AnonymousClass7TF.A0F(view, R.id.avatar_container);
        this.A05 = frameLayout;
        this.A0E = DbX.A0a(view, R.id.row_recommended_user_imageview);
        this.A0F = (GradientSpinner) AnonymousClass7TF.A0F(view, R.id.row_recommended_reel_ring);
        this.A06 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.row_recommended_user_info_container);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.row_recommended_user_username);
        this.A09 = A0R;
        this.A07 = AnonymousClass7TG.A0R(view, R.id.row_recommended_user_fullname);
        this.A08 = AnonymousClass7TG.A0R(view, R.id.row_recommended_social_context);
        this.A0A = DbX.A0Y(view, R.id.row_recommended_facepile);
        this.A0C = DbX.A0Y(view, R.id.row_recommended_overflow_menu);
        this.A0B = DbX.A0Y(view, R.id.row_recommended_hide_icon_button);
        this.A0G = (FollowButton) AnonymousClass7TF.A0F(view, R.id.row_recommended_user_follow_button);
        this.A04 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.row_recommended_internal_badge);
        A0R.getPaint().setFakeBoldText(true);
        AnonymousClass3NG r2 = new AnonymousClass3NG(frameLayout);
        r2.A07 = true;
        r2.A04 = new C47794EHf(this, 3);
        this.A0D = r2.A00();
    }
}
