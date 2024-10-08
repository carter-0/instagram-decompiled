package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.E9e  reason: case insensitive filesystem */
public final class C47592E9e extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47592E9e(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, -334485096);
        if (view.getTag() != null) {
            Object tag = view.getTag();
            0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.destination.productcollection.ProductCollectionHeaderShimmerBinderGroup.Holder");
            ((C46925Dnf) tag).A00.A02();
        }
        AnonymousClass0fD.A0A(-1982567602, A04);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 429283071);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        0qQ.A0C(inflate, Pxd.A00(4));
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate;
        LinearLayout linearLayout = (LinearLayout) AnonymousClass7TF.A0F(shimmerFrameLayout, R.id.container);
        linearLayout.setOrientation(0);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.product_collection_header_shimmer, linearLayout, false);
        int A09 = 0nA.A09(context);
        0qQ.A0A(inflate2);
        0nA.A0f(inflate2, A09);
        0nA.A0V(inflate2, (int) (((float) A09) * 0.75f));
        linearLayout.addView(inflate2);
        shimmerFrameLayout.setTag(new C46925Dnf(shimmerFrameLayout));
        AnonymousClass0fD.A0A(-1998547308, A04);
        return shimmerFrameLayout;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
