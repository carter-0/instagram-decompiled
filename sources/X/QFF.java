package X;

import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.widget.otc.AnonCheckoutToggleButton;
import com.instagram.android.R;

public final class QFF extends C249703kE {
    public final ShimmerFrameLayout A00;
    public final AnonCheckoutToggleButton A01;
    public final /* synthetic */ C8006Qet A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFF(ShimmerFrameLayout shimmerFrameLayout, C8006Qet qet) {
        super(shimmerFrameLayout);
        0qQ.A0B(shimmerFrameLayout, 2);
        this.A02 = qet;
        this.A00 = shimmerFrameLayout;
        this.A01 = (AnonCheckoutToggleButton) AnonymousClass7TF.A0F(shimmerFrameLayout, R.id.anon_checkout_toggle);
    }
}
