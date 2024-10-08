package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;

/* renamed from: X.VbU  reason: case insensitive filesystem */
public final class C17638VbU {
    public IgSimpleImageView A00;
    public final ViewGroup A01;
    public final ViewStub A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final CircularImageView A05;
    public final ReelBrandingBadgeView A06;

    public C17638VbU(View view) {
        0qQ.A0B(view, 1);
        this.A05 = DbX.A0a(view, R.id.row_search_profile_image);
        this.A06 = (ReelBrandingBadgeView) AnonymousClass7TF.A0F(view, R.id.branding_badge);
        ViewGroup A0I = DbX.A0I(view, R.id.row_places_container);
        this.A01 = A0I;
        IgTextView A0Z = DbX.A0Z(view, R.id.row_place_title);
        this.A03 = A0Z;
        C13988Tno.A16(A0Z, true);
        this.A04 = DbT.A0a(view, R.id.row_place_subtitle);
        this.A02 = DbU.A0D(view, R.id.dismiss_button_stub);
        C13988Tno.A0q(view.getContext(), A0I, R.attr.backgroundDrawable);
    }
}
