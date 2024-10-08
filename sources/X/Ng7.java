package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class Ng7 extends C15732Uhd {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.featured_product_permission_response, false);
        A09.setTag(new C67985MyD(A09));
        Object tag = A09.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.featuredproductpermission.FeaturedProductPermissionResponseViewBinder.Holder");
        return (C249703kE) tag;
    }

    public final /* bridge */ /* synthetic */ void A00(C232262tL r5, C249703kE r6) {
        C71970Otv otv = (C71970Otv) r5;
        C67985MyD myD = (C67985MyD) r6;
        AnonymousClass7TG.A1N(otv, myD);
        IgImageView igImageView = myD.A02;
        Context context = igImageView.getContext();
        C53380GnA gnA = otv.A00;
        DbU.A13(context, igImageView, gnA.A00);
        myD.A01.setText(gnA.A02);
        myD.A00.setText(gnA.A01);
    }

    public final Class modelClass() {
        return C71970Otv.class;
    }
}
