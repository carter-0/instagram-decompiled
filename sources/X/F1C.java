package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.follow.FollowButton;

public final class F1C {
    public View A00;
    public ImageView A01;
    public FollowButton A02;
    public FollowButton A03;
    public FollowButton A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final ViewStub A08;
    public final ViewStub A09;
    public final ViewStub A0A;
    public final ViewStub A0B;
    public final ViewStub A0C;
    public final ImageView A0D;
    public final LinearLayout A0E;
    public final LinearLayout A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final TextView A0I;
    public final TextView A0J;
    public final C252063oV A0K;
    public final C252063oV A0L;
    public final C252063oV A0M;
    public final GradientSpinnerAvatarView A0N;

    public F1C(View view) {
        0qQ.A0B(view, 1);
        this.A06 = DbX.A0I(view, R.id.follow_list_container);
        this.A07 = DbX.A0I(view, R.id.follow_list_user_info_container);
        this.A0J = AnonymousClass7TG.A0R(view, R.id.follow_list_username);
        this.A0I = AnonymousClass7TG.A0R(view, R.id.follow_list_subtitle);
        this.A0F = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.follow_list_social_context_container);
        this.A0E = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.follow_list_content_container);
        this.A0H = AnonymousClass7TG.A0R(view, R.id.follow_list_social_context);
        this.A0D = DbX.A0J(view, R.id.follow_list_social_context_facepile);
        this.A08 = DbS.A0F(view, R.id.follow_list_large_follow_button_stub);
        this.A0N = DbX.A0j(view, R.id.follow_list_user_imageview);
        this.A0C = DbS.A0F(view, R.id.follow_more_button_stub);
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0F(view, R.id.follow_row_right_button_stub);
        this.A09 = viewStub;
        this.A0B = DbS.A0F(view, R.id.inverse_style_button_stub);
        this.A0G = AnonymousClass7TE.A0d(view, R.id.inverse_style_divider_bullet);
        this.A05 = AnonymousClass7TF.A0G(view, R.id.row_divider);
        this.A0M = DbU.A0Z(view, R.id.follow_list_user_badge_stub);
        this.A0K = DbU.A0Z(view, R.id.bio_in_follow_list_stub);
        this.A0L = DbU.A0Z(view, R.id.unseen_posts_stub);
        this.A0A = DbS.A0F(view, R.id.hide_button_stub);
        ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
        layoutParams.width = -2;
        viewStub.setLayoutParams(layoutParams);
    }
}
