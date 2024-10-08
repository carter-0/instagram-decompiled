package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

public final class UEJ extends C249703kE {
    public final View A00;
    public final IgSimpleImageView A01;
    public final IgTextView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final CircularImageView A08;
    public final IgSimpleImageView A09;

    public UEJ(View view) {
        super(view);
        this.A00 = view;
        this.A08 = DbX.A0a(view, R.id.row_search_upsell_imageview);
        this.A04 = DbX.A0Z(view, R.id.row_search_upsell_header);
        this.A06 = DbX.A0Z(view, R.id.row_search_upsell_title);
        this.A07 = DbX.A0Z(view, R.id.row_search_upsell_title_non_bold);
        this.A03 = DbX.A0Z(view, R.id.row_search_upsell_cta);
        this.A05 = DbX.A0Z(view, R.id.row_search_upsell_subtitle);
        this.A01 = DbX.A0Y(view, R.id.dismiss_button);
        this.A09 = DbX.A0Y(view, R.id.chevron);
        this.A02 = DbX.A0Z(view, R.id.button);
    }
}
