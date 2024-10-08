package X;

import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.follow.chaining.FollowChainingButton;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Waw  reason: case insensitive filesystem */
public final class C19510Waw implements AnonymousClass3N3 {
    public String A00 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
    public final ColorDrawable A01;
    public final View A02;
    public final View A03;
    public final FrameLayout A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final FollowChainingButton A09;
    public final HashtagFollowButton A0A;
    public final ReelBrandingBadgeView A0B;
    public final GradientSpinner A0C;
    public final TextView A0D;
    public final C71662eb A0E;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A06);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A06;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A06);
    }

    public final GradientSpinner Bkt() {
        return this.A0C;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A06.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A06.setVisibility(0);
    }

    public C19510Waw(View view) {
        View requireViewById = view.requireViewById(R.id.hashtag_feed_header_container);
        this.A02 = requireViewById;
        this.A03 = view.requireViewById(R.id.reel);
        this.A0C = (GradientSpinner) view.requireViewById(R.id.reel_ring);
        IgImageView A0X = DbU.A0X(view, R.id.profile_image);
        this.A06 = A0X;
        A0X.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0B = (ReelBrandingBadgeView) view.requireViewById(R.id.branding_badge);
        this.A05 = DbU.A0G(view, R.id.hashtag_media_count);
        this.A0A = (HashtagFollowButton) view.requireViewById(R.id.follow_button);
        this.A0D = DbU.A0G(view, R.id.hashtag_header_subtitle);
        this.A09 = (FollowChainingButton) view.requireViewById(R.id.follow_chaining_button);
        this.A04 = (FrameLayout) view.requireViewById(R.id.follow_chaining_container);
        ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass7TF.A03(requireViewById.getContext(), R.attr.backgroundColorSecondary));
        this.A01 = colorDrawable;
        A0X.setPlaceHolderColor(colorDrawable);
        this.A07 = DbY.A0S(view, R.id.hashtag_page_banner_stub);
        this.A0E = DbY.A0S(view, R.id.hashtag_support_button);
        this.A08 = DbY.A0S(view, R.id.hashtag_recency_filter);
    }
}
