package X;

import android.widget.CheckBox;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

public final class QFJ extends C249703kE {
    public final CheckBox A00;
    public final ShimmerFrameLayout A01;
    public final /* synthetic */ C8000Qen A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFJ(ShimmerFrameLayout shimmerFrameLayout, C8000Qen qen) {
        super(shimmerFrameLayout);
        0qQ.A0B(shimmerFrameLayout, 2);
        this.A02 = qen;
        this.A01 = shimmerFrameLayout;
        this.A00 = (CheckBox) AnonymousClass7TF.A0F(shimmerFrameLayout, R.id.email_optin_toggle);
    }
}
