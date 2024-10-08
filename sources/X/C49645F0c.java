package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;

/* renamed from: X.F0c  reason: case insensitive filesystem */
public final class C49645F0c {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;
    public final C71662eb A05;
    public final HashtagFollowButton A06;

    public C49645F0c(View view) {
        this.A00 = view;
        this.A03 = DbU.A0X(view, R.id.row_newsfeed_icon);
        this.A02 = DbU.A0G(view, R.id.row_newsfeed_text);
        this.A01 = DbU.A0F(view, R.id.row_newsfeed_info_icon);
        this.A04 = DbT.A0b(view, R.id.row_newsfeed_redirect_arrow);
        this.A05 = DbY.A0S(view, R.id.row_newsfeed_media_image_stub);
        this.A06 = (HashtagFollowButton) DbY.A0F(view, R.id.row_newsfeed_hashtag_follow_button_small);
    }
}
