package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.Ib1  reason: case insensitive filesystem */
public final class C57457Ib1 implements C59614JQi {
    public final View A00;
    public final TextView A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgView A04;
    public final CircularImageView A05;
    public final IgImageView A06;
    public final SimpleVideoLayout A07;
    public final FollowButton A08;

    public final IgImageView BGD() {
        return this.A06;
    }

    public final SimpleVideoLayout CDv() {
        return this.A07;
    }

    public final void CLR() {
        this.A06.setVisibility(8);
    }

    public final void EuZ() {
        this.A06.setVisibility(0);
    }

    public C57457Ib1(View view) {
        this.A00 = view;
        this.A05 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.card_avatar);
        this.A01 = DbW.A0B(view, R.id.card_username);
        this.A03 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.verified_badge);
        this.A08 = (FollowButton) AnonymousClass7TE.A0b(view, R.id.card_follow_button);
        this.A02 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.playback_indicator);
        this.A04 = (IgView) AnonymousClass7TE.A0b(view, R.id.gradient_background);
        this.A06 = AnonymousClass7TE.A0b(view, R.id.card_image);
        this.A07 = (SimpleVideoLayout) AnonymousClass7TE.A0b(view, R.id.card_video);
    }
}
