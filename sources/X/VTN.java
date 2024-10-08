package X;

import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;

public final class VTN {
    public RoundedCornerFrameLayout A00;
    public final ShimmerFrameLayout A01;

    public VTN(View view) {
        this.A00 = (RoundedCornerFrameLayout) AnonymousClass7TF.A0F(view, R.id.preview_container);
        this.A01 = (ShimmerFrameLayout) AnonymousClass7TF.A0F(view, R.id.card_shimmer_container);
    }
}
