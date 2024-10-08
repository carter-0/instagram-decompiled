package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;

/* renamed from: X.UDy  reason: case insensitive filesystem */
public final class C14896UDy extends C249703kE {
    public final View A00;
    public final View A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TransitionCarouselImageView A05;

    public C14896UDy(View view) {
        super(view);
        this.A00 = view;
        this.A02 = (ImageView) AnonymousClass7TE.A0b(view, R.id.icon);
        this.A03 = (ImageView) AnonymousClass7TE.A0b(view, R.id.overlay_background);
        this.A04 = DbW.A0B(view, R.id.title_text);
        this.A05 = (TransitionCarouselImageView) AnonymousClass7TE.A0b(view, R.id.background_image);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.overlay);
    }
}
