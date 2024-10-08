package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.LAl  reason: case insensitive filesystem */
public final class C63882LAl {
    public final LinearLayout A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final CircularImageView A04;
    public final IgdsButton A05;
    public final IgdsButton A06;
    public final GradientSpinnerAvatarView A07;

    public C63882LAl(View view) {
        0qQ.A0B(view, 1);
        this.A00 = (LinearLayout) view;
        this.A04 = (CircularImageView) AnonymousClass7TF.A0F(view, R.id.reels_row_icon);
        this.A07 = DbX.A0j(view, R.id.reels_row_fb_profile_avatar);
        this.A03 = DbX.A0Z(view, R.id.reels_row_title);
        this.A02 = DbX.A0Z(view, R.id.reels_row_subtitle);
        this.A06 = JTR.A0n(view, R.id.reels_row_share_button);
        this.A01 = DbX.A0Z(view, R.id.reels_row_shared_button);
        this.A05 = JTR.A0n(view, R.id.reels_row_chevron);
    }
}
