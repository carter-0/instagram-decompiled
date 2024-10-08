package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;

/* renamed from: X.Ib0  reason: case insensitive filesystem */
public final class C57456Ib0 implements C59614JQi {
    public final View A00;
    public final View A01;
    public final View A02;
    public final IgTextView A03;
    public final IgImageView A04;
    public final SimpleVideoLayout A05;
    public final IgSimpleImageView A06;
    public final IgImageView A07;

    public final IgImageView BGD() {
        return this.A04;
    }

    public final SimpleVideoLayout CDv() {
        return this.A05;
    }

    public final void CLR() {
        this.A04.setVisibility(8);
    }

    public final void EuZ() {
        this.A04.setVisibility(0);
    }

    public C57456Ib0(View view) {
        this.A00 = view;
        this.A01 = AnonymousClass7TF.A0G(view, R.id.background_content_black_gradient);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.background_content_black_gradient_top);
        this.A03 = DbX.A0Z(view, R.id.dynamic_text_view);
        this.A07 = DbX.A0b(view, R.id.like_heart_view);
        this.A06 = DbX.A0Y(view, R.id.card_facepile);
        this.A04 = DbX.A0b(view, R.id.image_placeholder);
        this.A05 = (SimpleVideoLayout) AnonymousClass7TF.A0F(view, R.id.video_view);
    }
}
