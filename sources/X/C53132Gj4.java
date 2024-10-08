package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.Gj4  reason: case insensitive filesystem */
public final class C53132Gj4 extends C249703kE {
    public final ShimmerFrameLayout A00;
    public final RoundedCornerConstraintLayout A01;
    public final View A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53132Gj4(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A01 = (RoundedCornerConstraintLayout) AnonymousClass7TF.A0F(view, R.id.clips_item_loadstate_placeholder_container);
        this.A00 = (ShimmerFrameLayout) AnonymousClass7TF.A0F(view, R.id.clips_item_loadstate_placeholder_shimmer_view);
    }
}
