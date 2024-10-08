package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.Vc6  reason: case insensitive filesystem */
public final class C17675Vc6 {
    public final ViewGroup A00;
    public final ViewGroup A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final IgImageView A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final ReelBrandingBadgeView A07;
    public final GradientSpinnerAvatarView A08;

    public C17675Vc6(ViewGroup viewGroup) {
        this.A00 = viewGroup;
        this.A04 = DbT.A0b(viewGroup, R.id.image_view);
        this.A08 = (GradientSpinnerAvatarView) viewGroup.requireViewById(R.id.avatar_image);
        this.A07 = (ReelBrandingBadgeView) viewGroup.requireViewById(R.id.reel_branding_badge);
        this.A03 = DbU.A0X(viewGroup, R.id.circular_image_drawable);
        this.A01 = DbU.A0C(viewGroup, R.id.title_container);
        this.A02 = Dba.A06(viewGroup);
        this.A06 = DbY.A0S(viewGroup, R.id.separate_subtitles_container);
        this.A05 = DbY.A0S(viewGroup, R.id.joint_subtitles_container);
    }
}
