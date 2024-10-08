package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.mainfeed.afi.ui.AfiSecondaryLinkButton;
import com.instagram.ui.widget.flowlayout.HorizontalFlowLayout;

/* renamed from: X.HoH  reason: case insensitive filesystem */
public final class C55834HoH {
    public final View A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final IgImageView A03;
    public final AfiSecondaryLinkButton A04;
    public final HorizontalFlowLayout A05;

    public C55834HoH(View view) {
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A02 = DbX.A0Z(view, R.id.afi_view_title);
        this.A01 = DbX.A0Z(view, R.id.afi_view_subtitle);
        this.A03 = DbX.A0b(view, R.id.afi_view_dismiss_button);
        this.A05 = (HorizontalFlowLayout) AnonymousClass7TF.A0F(view, R.id.afi_view_interests_pill_container);
        this.A04 = (AfiSecondaryLinkButton) AnonymousClass7TF.A0F(view, R.id.afi_view_expand_interests_button);
    }
}
