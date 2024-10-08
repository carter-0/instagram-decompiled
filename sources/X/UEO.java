package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.touch.TouchOverlayView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;

public final class UEO extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final TouchOverlayView A06;
    public final IgImageView A07;
    public final TransitionCarouselImageView A08;
    public final ClickableTextContainer A09;
    public final ThumbnailView A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEO(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A07 = JTR.A0i(view, R.id.single_image);
        this.A0A = (ThumbnailView) AnonymousClass7TE.A0b(view, R.id.thumbnail);
        this.A08 = (TransitionCarouselImageView) AnonymousClass7TE.A0b(view, R.id.slideshow);
        this.A06 = (TouchOverlayView) AnonymousClass7TE.A0b(view, R.id.touch_overlay);
        this.A09 = (ClickableTextContainer) AnonymousClass7TE.A0b(view, R.id.text_container);
        TextView A0B = DbW.A0B(view, R.id.primary_text);
        this.A04 = A0B;
        TextView A0B2 = DbW.A0B(view, R.id.secondary_text);
        this.A05 = A0B2;
        this.A03 = DbW.A0B(view, R.id.overlay_text);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.overlay_gradient);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.empty_state);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.media_container);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        0mq.A03(A0B, dimensionPixelSize);
        0mq.A03(A0B2, dimensionPixelSize);
    }
}
