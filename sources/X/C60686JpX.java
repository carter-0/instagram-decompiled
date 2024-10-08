package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.JpX  reason: case insensitive filesystem */
public abstract class C60686JpX extends C249703kE {
    public C60974JuW A00;
    public final View A01;
    public final ShimmerFrameLayout A02;

    public void A00(boolean z) {
        ShimmerFrameLayout shimmerFrameLayout = this.A02;
        if (z) {
            shimmerFrameLayout.A06(true);
        } else {
            shimmerFrameLayout.A05();
        }
        this.A01.setVisibility(DbW.A01(z ? 1 : 0));
    }

    public C60686JpX(View view) {
        super(view);
        this.A02 = (ShimmerFrameLayout) AnonymousClass7TF.A0F(view, R.id.loading_shimmer_view);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.shimmer_background_view);
        this.itemView.setTag(this);
    }
}
