package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerLinearLayout;

/* renamed from: X.Vco  reason: case insensitive filesystem */
public final class C17719Vco {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final RecyclerView A08;
    public final IgFrameLayout A09;
    public final IgSimpleImageView A0A;
    public final IgImageView A0B;
    public final IgImageView A0C;
    public final RoundedCornerLinearLayout A0D;

    public C17719Vco(View view) {
        this.A03 = view;
        this.A00 = AnonymousClass7TE.A0b(view, R.id.upcoming_event_details_row);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.action_bar_shadow);
        this.A0D = (RoundedCornerLinearLayout) AnonymousClass7TE.A0b(view, R.id.details_row_event_thumbnail_layout);
        this.A0C = JTR.A0i(view, R.id.details_row_event_thumbnail);
        this.A09 = (IgFrameLayout) AnonymousClass7TE.A0b(view, R.id.details_row_event_type_layout);
        this.A0A = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.details_row_event_type_icon);
        this.A07 = DbW.A0B(view, R.id.details_row_event_type_label);
        this.A06 = DbW.A0B(view, R.id.details_row_event_title_text);
        this.A05 = DbW.A0B(view, R.id.details_row_event_subtitle_text);
        this.A0B = JTR.A0i(view, R.id.details_row_event_chevron_icon);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.upcoming_event_featured_products_view);
        this.A08 = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.upcoming_event_product_feed_recycler_view);
        this.A04 = DbW.A0B(view, R.id.upcoming_event_not_found_text_view);
    }
}
