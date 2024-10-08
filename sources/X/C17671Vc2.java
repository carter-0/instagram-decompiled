package X;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Vc2  reason: case insensitive filesystem */
public final class C17671Vc2 {
    public final LinearLayout A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final CircularImageView A05;
    public final HashtagFollowButton A06;
    public final ReelBrandingBadgeView A07;
    public final FollowButton A08;

    public C17671Vc2(View view) {
        this.A00 = (LinearLayout) view;
        this.A05 = DbU.A0X(view, R.id.row_recommended_user_imageview);
        this.A07 = (ReelBrandingBadgeView) view.requireViewById(R.id.branding_badge);
        this.A02 = DbU.A0G(view, R.id.row_recommended_user_username);
        this.A01 = DbU.A0G(view, R.id.row_recommended_user_fullname);
        this.A08 = (FollowButton) view.requireViewById(R.id.row_recommended_user_follow_button);
        this.A06 = (HashtagFollowButton) view.requireViewById(R.id.row_recommended_hashtag_follow_button);
        this.A03 = (IgSimpleImageView) view.requireViewById(R.id.row_recommended_hide_icon_button);
        this.A04 = (IgSimpleImageView) view.requireViewById(R.id.row_recommended_overflow_menu);
    }
}
