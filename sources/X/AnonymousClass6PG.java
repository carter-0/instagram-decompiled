package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.6PG  reason: invalid class name */
public final class AnonymousClass6PG implements C2365734g {
    public final /* synthetic */ AnonymousClass6PF A00;

    public AnonymousClass6PG(AnonymousClass6PF r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PF r1 = this.A00;
        RoundedCornerConstraintLayout roundedCornerConstraintLayout = (RoundedCornerConstraintLayout) view.requireViewById(R.id.sponsored_reel_bottom_banner_container);
        0qQ.A0B(roundedCornerConstraintLayout, 0);
        r1.A04 = roundedCornerConstraintLayout;
        RoundedCornerImageView roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.sponsored_reel_bottom_banner_image);
        0qQ.A0B(roundedCornerImageView, 0);
        r1.A03 = roundedCornerImageView;
        IgTextView requireViewById = view.requireViewById(R.id.sponsored_reel_bottom_banner_primary_text);
        0qQ.A0B(requireViewById, 0);
        r1.A01 = requireViewById;
        IgTextView requireViewById2 = view.requireViewById(R.id.sponsored_reel_bottom_banner_secondary_text);
        0qQ.A0B(requireViewById2, 0);
        r1.A02 = requireViewById2;
        IgTextView requireViewById3 = view.requireViewById(R.id.sponsored_reel_bottom_banner_cta);
        0qQ.A0B(requireViewById3, 0);
        r1.A00 = requireViewById3;
    }
}
