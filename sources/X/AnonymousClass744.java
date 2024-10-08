package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerMediaFrameLayout;

/* renamed from: X.744  reason: invalid class name */
public final class AnonymousClass744 {
    public final CircularImageView A00;
    public final IgImageView A01;
    public final IgImageView A02;
    public final C252063oV A03;
    public final IgProgressImageView A04;
    public final IgProgressImageView A05;
    public final RoundedCornerMediaFrameLayout A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A01(new AnonymousClass9LB(this, 29));

    public AnonymousClass744(View view) {
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.media_container);
        0qQ.A07(requireViewById);
        RoundedCornerMediaFrameLayout roundedCornerMediaFrameLayout = (RoundedCornerMediaFrameLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.image);
        0qQ.A07(requireViewById2);
        IgProgressImageView igProgressImageView = (IgProgressImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.circular_image);
        0qQ.A07(requireViewById3);
        CircularImageView circularImageView = (CircularImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.squoval_image);
        0qQ.A07(requireViewById4);
        IgProgressImageView igProgressImageView2 = (IgProgressImageView) requireViewById4;
        IgImageView requireViewById5 = view.requireViewById(R.id.preview_icon);
        0qQ.A07(requireViewById5);
        IgImageView igImageView = requireViewById5;
        IgImageView requireViewById6 = view.requireViewById(R.id.header_icons);
        0qQ.A07(requireViewById6);
        IgImageView igImageView2 = requireViewById6;
        C252063oV A012 = 2b1.A01(view.findViewById(R.id.content_attribution_stub), false, false);
        0qQ.A0B(roundedCornerMediaFrameLayout, 1);
        0qQ.A0B(igProgressImageView, 2);
        0qQ.A0B(circularImageView, 3);
        0qQ.A0B(igProgressImageView2, 4);
        0qQ.A0B(igImageView, 5);
        0qQ.A0B(igImageView2, 6);
        this.A06 = roundedCornerMediaFrameLayout;
        this.A04 = igProgressImageView;
        this.A00 = circularImageView;
        this.A05 = igProgressImageView2;
        this.A02 = igImageView;
        this.A01 = igImageView2;
        this.A03 = A012;
    }
}
