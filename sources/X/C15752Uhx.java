package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.Uhx  reason: case insensitive filesystem */
public final class C15752Uhx extends C232222tE {
    public static int A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        UBU ubu = (UBU) r4;
        ShimmerFrameLayout shimmerFrameLayout = ubu.A01;
        if (!shimmerFrameLayout.A00) {
            shimmerFrameLayout.A06(true);
        }
        ubu.A00.setVisibility(0);
    }

    public final Class modelClass() {
        return C19261WRu.class;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.UBU] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.layout_location_list_item_shimmer);
        ? r1 = new C249703kE(A0C);
        r1.A01 = (ShimmerFrameLayout) A0C;
        r1.A00 = A0C.requireViewById(R.id.context_images);
        return r1;
    }
}
