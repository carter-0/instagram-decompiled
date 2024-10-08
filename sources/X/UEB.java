package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class UEB extends C249703kE {
    public final C17195VLz A00 = new C17195VLz();
    public final IgFrameLayout A01;
    public final IgFrameLayout A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgImageView A05;
    public final C252063oV A06;
    public final IgBouncyUfiButtonImageView A07;
    public final GradientSpinnerAvatarView A08;

    public UEB(View view) {
        super(view);
        this.A08 = (GradientSpinnerAvatarView) AnonymousClass7TF.A0F(view, R.id.avatar);
        this.A04 = DbX.A0Z(view, R.id.username);
        this.A03 = DbX.A0Z(view, R.id.timestamp);
        this.A05 = DbX.A0b(view, R.id.gift_badge);
        this.A07 = (IgBouncyUfiButtonImageView) AnonymousClass7TF.A0F(view, R.id.like_button);
        this.A01 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.like_button_click_area);
        this.A02 = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.more_button_click_area);
        this.A06 = 2b1.A00(view.requireViewById(R.id.internal_badge));
    }
}
