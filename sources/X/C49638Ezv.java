package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Ezv  reason: case insensitive filesystem */
public final class C49638Ezv {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public C49638Ezv(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A04 = DbX.A0b(view, R.id.profile_available_banner_item_left_icon);
        this.A03 = DbX.A0b(view, R.id.profile_featured_banner_item_banner_icon);
        this.A02 = DbX.A0Z(view, R.id.profile_header_banner_item_title);
        this.A01 = DbX.A0Z(view, R.id.profile_header_banner_item_subtitle);
    }
}
