package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.accessibility.AccessibleTextView;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

public final class LB8 {
    public final View A00;
    public final ConstraintLayout A01;
    public final RecyclerView A02;
    public final ShimmerFrameLayout A03;
    public final AccessibleTextView A04;
    public final AccessibleTextView A05;
    public final ReboundViewPager A06;
    public final IgdsButton A07;
    public final IgBouncyUfiButtonImageView A08;
    public final CirclePageIndicator A09;

    public LB8(View view) {
        this.A00 = view;
        this.A06 = (ReboundViewPager) AnonymousClass7TE.A0b(view, R.id.product_image_container);
        this.A09 = (CirclePageIndicator) AnonymousClass7TE.A0b(view, R.id.carousel_page_indicator);
        this.A04 = (AccessibleTextView) AnonymousClass7TE.A0b(view, R.id.product_name_label);
        this.A05 = (AccessibleTextView) AnonymousClass7TE.A0b(view, R.id.product_price_label);
        this.A08 = (IgBouncyUfiButtonImageView) AnonymousClass7TE.A0b(view, R.id.product_save_button);
        this.A02 = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.variants_recycler_view);
        this.A03 = (ShimmerFrameLayout) AnonymousClass7TE.A0b(view, R.id.variants_shimmer_layout);
        this.A01 = (ConstraintLayout) AnonymousClass7TE.A0b(view, R.id.loaded_content);
        this.A07 = (IgdsButton) AnonymousClass7TE.A0b(view, R.id.view_on_site_button);
    }
}
