package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.model.shopping.productfeed.ProductFeedItem;
import java.util.List;

/* renamed from: X.UiZ  reason: case insensitive filesystem */
public final class C15790UiZ extends C232222tE {
    public final AnonymousClass0iw A00;
    public final C14819UAy A01;
    public final UserSession A02;
    public final XCA A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r18, C249703kE r19) {
        WS0 ws0 = (WS0) r18;
        UBV ubv = (UBV) r19;
        boolean A1Z = AnonymousClass7TG.A1Z(ws0, ubv);
        this.A01.A00(ubv.A00, "CartEnabledProductCollectionItemDefinition");
        UserSession userSession = this.A02;
        MultiProductComponent multiProductComponent = ws0.A00;
        XCA xca = this.A03;
        AnonymousClass0iw r2 = this.A00;
        C51973G9u.A0r(A1Z ? 1 : 0, userSession, xca, r2);
        Context A07 = DbS.A07(ubv);
        UDD udd = ubv.A01;
        String str = multiProductComponent.A07;
        if (str == null) {
            str = "";
        }
        C18246VoD.A01(udd, new C15081UNy((View.OnClickListener) null, Integer.valueOf(2Yu.A0H(A07, R.attr.backgroundColorSecondary)), (Integer) null, 0mp.A06("%s_%s_%s:", new Object[]{str, null, null}), str, (String) null, (String) null));
        RecyclerView recyclerView = ubv.A00;
        UAA uaa = recyclerView.A0A;
        if (uaa == null) {
            uaa = new UAA(r2, userSession, xca);
            recyclerView.setAdapter(uaa);
        }
        List A1J = C51966G9m.A1J(multiProductComponent.A03.A03);
        List list = uaa.A02;
        list.clear();
        list.addAll(A1J);
        U9N u9n = uaa.A01;
        List list2 = u9n.A00;
        list2.clear();
        list2.addAll(list);
        C232332tX.A00(u9n).A03(uaa);
        List list3 = u9n.A01;
        list3.clear();
        list3.addAll(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            uaa.A00.AAj((ProductFeedItem) list.get(i), new C17372VSz(0, i));
        }
    }

    public final Class modelClass() {
        return WS0.class;
    }

    public C15790UiZ(AnonymousClass0iw r1, C14819UAy uAy, UserSession userSession, XCA xca) {
        this.A02 = userSession;
        this.A03 = xca;
        this.A00 = r1;
        this.A01 = uAy;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.3kE, java.lang.Object, X.UBV] */
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.product_collection_section, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        layoutParams.height = -2;
        inflate.setLayoutParams(layoutParams);
        ? r4 = new C249703kE(inflate);
        r4.A01 = new UDD(AnonymousClass7TE.A0b(inflate, R.id.section_header_container));
        r4.A00 = JTR.A0c(inflate, R.id.recycler_view);
        Context context = inflate.getContext();
        r4.A00.setLayoutManager(new LinearLayoutManager(context, 0, false));
        JTP.A1D(r4.A00, context.getResources().getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), AnonymousClass7TF.A02(context, R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        C13988Tno.A0q(context, inflate, R.attr.backgroundColorSecondary);
        AnonymousClass3AQ r1 = new AnonymousClass3AQ();
        r1.A00 = false;
        r4.A00.setItemAnimator(r1);
        Object A0U = C13988Tno.A0U(inflate, r4);
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.adapter.cart.productcollection.CartEnabledProductCollectionViewBinder.Holder");
        return (C249703kE) A0U;
    }
}
