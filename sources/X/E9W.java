package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

public final class E9W extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C46926Dng dng;
        int A03 = AnonymousClass0fD.A03(-389241267);
        Object obj3 = null;
        if (view != null) {
            obj3 = view.getTag();
        }
        if ((obj3 instanceof C46926Dng) && (dng = (C46926Dng) obj3) != null) {
            dng.A00.A02();
        }
        AnonymousClass0fD.A0A(183163192, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        Context context;
        int A03 = AnonymousClass0fD.A03(-2101694311);
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View A0C = DbT.A0C(LayoutInflater.from(context), viewGroup, R.layout.product_collection_header_redesigned_shimmer);
        0qQ.A0C(A0C, Pxd.A00(4));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) A0C;
        shimmerFrameLayout.setTag(new C46926Dng(shimmerFrameLayout));
        AnonymousClass0fD.A0A(1382772811, A03);
        return shimmerFrameLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1H(r1);
    }
}
