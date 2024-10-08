package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;

/* renamed from: X.Udn  reason: case insensitive filesystem */
public final class C15498Udn extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1790363174);
        AnonymousClass7TG.A1O(view, obj);
        VT0 vt0 = (VT0) obj;
        Object tag = view.getTag();
        if (tag != null) {
            UDS uds = (UDS) tag;
            uds.A01.setVisibility(DbW.A01(vt0.A01 ? 1 : 0));
            int i2 = 0;
            uds.A03.setVisibility(0);
            View view2 = uds.A02;
            if (!vt0.A00) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            uds.A00.setVisibility(0);
            ((ShimmerFrameLayout) view).A02();
            AnonymousClass0fD.A0A(1750878649, A03);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0A(-986810651, A03);
        throw A0y;
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1611084256);
        Context A0C = JTP.A0C(viewGroup, 1);
        View inflate = LayoutInflater.from(A0C).inflate(R.layout.shopping_loading_placeholder, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) AnonymousClass7TF.A0F(inflate, R.id.container);
        linearLayout.setOrientation(1);
        linearLayout.addView(LayoutInflater.from(A0C).inflate(R.layout.product_feed_metadata_loading_placeholder, linearLayout, false));
        inflate.setTag(new UDS(inflate));
        AnonymousClass0fD.A0A(534095151, A03);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
