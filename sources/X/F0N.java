package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class F0N {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgImageView A02;
    public final IgImageView A03;
    public final IgImageView A04;
    public final View A05;

    public F0N(View view) {
        0qQ.A0B(view, 1);
        this.A05 = view;
        this.A04 = DbX.A0b(view, R.id.profile_featured_banner_item_order_icon);
        this.A03 = DbX.A0b(view, R.id.profile_featured_banner_item_banner_icon);
        this.A01 = DbX.A0Z(view, R.id.profile_header_banner_item_title);
        this.A00 = DbX.A0Z(view, R.id.profile_header_banner_item_subtitle);
        this.A02 = DbX.A0b(view, R.id.profile_featured_banner_item_remove_icon);
    }
}
