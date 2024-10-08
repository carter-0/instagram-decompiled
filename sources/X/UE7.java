package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.hashtag.ui.HashtagFollowButton;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

public final class UE7 extends C249703kE {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final CircularImageView A04;
    public final VNM A05;
    public final HashtagFollowButton A06;
    public final ReelBrandingBadgeView A07;

    public UE7(View view, VNM vnm) {
        super(view);
        this.A05 = vnm;
        this.A00 = AnonymousClass7TF.A0G(view, R.id.suggested_entity_card_container);
        this.A04 = DbX.A0a(view, R.id.suggested_entity_card_image);
        this.A07 = (ReelBrandingBadgeView) AnonymousClass7TF.A0F(view, R.id.branding_badge);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.suggested_entity_card_name);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.suggested_entity_card_context);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.dismiss_button);
        this.A06 = (HashtagFollowButton) AnonymousClass7TF.A0F(view, R.id.suggested_hashtag_card_follow_button);
    }
}
