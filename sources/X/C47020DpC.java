package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.DpC  reason: case insensitive filesystem */
public final class C47020DpC extends C249703kE {
    public final View A00;
    public final ViewStub A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final GradientSpinnerAvatarView A06;

    public C47020DpC(View view) {
        super(view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_container);
        this.A04 = DbX.A0Z(view, R.id.row_title);
        this.A03 = DbX.A0Z(view, R.id.row_subtitle);
        this.A02 = DbX.A0Y(view, R.id.cta_icon);
        this.A01 = (ViewStub) AnonymousClass7TF.A0F(view, R.id.one_tap_button_view_stub);
        this.A05 = DbX.A0a(view, R.id.avatar_image_view);
        this.A06 = DbX.A0j(view, R.id.avatar_fb_profile_image_view);
    }
}
