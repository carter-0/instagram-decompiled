package X;

import android.animation.ValueAnimator;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.JpT  reason: case insensitive filesystem */
public final class C60682JpT extends C249703kE {
    public final ShimmerFrameLayout A00;

    public final void A00() {
        ShimmerFrameLayout shimmerFrameLayout = this.A00;
        ValueAnimator valueAnimator = shimmerFrameLayout.A02.A01;
        if (valueAnimator == null || !valueAnimator.isStarted()) {
            shimmerFrameLayout.A02();
        }
        this.itemView.setVisibility(0);
    }

    public C60682JpT(View view) {
        super(view);
        this.A00 = (ShimmerFrameLayout) view.requireViewById(R.id.loading_shimmer);
    }
}
