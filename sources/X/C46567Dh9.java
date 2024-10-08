package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Dh9  reason: case insensitive filesystem */
public final class C46567Dh9 {
    public final View A00;
    public final View A01;
    public final ShimmerFrameLayout A02;
    public final CircularImageView A03;
    public final GradientSpinner A04;

    public C46567Dh9(View view) {
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.row_shimmer_container);
        0qQ.A07(requireViewById);
        this.A02 = (ShimmerFrameLayout) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.row_search_placeholder_avatar);
        0qQ.A07(requireViewById2);
        this.A03 = (CircularImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.reel_seen_state);
        0qQ.A07(requireViewById3);
        this.A04 = (GradientSpinner) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.row_search_placeholder_title);
        0qQ.A07(requireViewById4);
        this.A01 = requireViewById4;
        View requireViewById5 = view.requireViewById(R.id.row_search_placeholder_subtitle);
        0qQ.A07(requireViewById5);
        this.A00 = requireViewById5;
    }
}
