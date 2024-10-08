package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.UDf  reason: case insensitive filesystem */
public final class C14877UDf extends C249703kE {
    public VXp A00;
    public final View A01;
    public final ImageView A02;
    public final ReboundViewPager A03;
    public final CirclePageIndicator A04;

    public C14877UDf(View view) {
        super(view);
        this.A01 = view;
        this.A03 = (ReboundViewPager) AnonymousClass7TF.A0F(view, R.id.view_pager);
        this.A04 = (CirclePageIndicator) AnonymousClass7TF.A0F(view, R.id.carousel_page_indicator);
        this.A02 = DbX.A0J(view, R.id.canvas_right);
    }
}
