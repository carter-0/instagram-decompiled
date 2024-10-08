package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.productimagecontainer.ProductImageContainer;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;
import java.util.Set;

public final class H7Q extends C232232tF {
    public final C55876Hox A00;

    public H7Q(Context context, AnonymousClass0iw r13, UserSession userSession, 2el r15, C55648Hl7 hl7, String str, String str2, Set set, int i, boolean z) {
        Set set2 = set;
        C51969G9p.A1N(userSession, 2, set2);
        this.A00 = new C55876Hox(context, r13, userSession, r15, hl7, str, str2, set2, i, z);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C53133Gj5(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_product_tab_item, false));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r13, C249703kE r14) {
        ImageInfo BGO;
        ExtendedImageUrl A02;
        IOV iov = (IOV) r13;
        C53133Gj5 gj5 = (C53133Gj5) r14;
        boolean A1Z = AnonymousClass7TG.A1Z(iov, gj5);
        C55876Hox hox = this.A00;
        TextView textView = gj5.A01;
        ProductDetailsProductItemDictIntf productDetailsProductItemDictIntf = iov.A00;
        textView.setText(productDetailsProductItemDictIntf.getName());
        boolean z = hox.A09;
        TextView textView2 = gj5.A02;
        if (z) {
            String fullPriceStripped = productDetailsProductItemDictIntf.getFullPriceStripped();
            if (fullPriceStripped == null) {
                fullPriceStripped = "";
            }
            textView2.setText(fullPriceStripped);
        } else {
            textView2.setVisibility(8);
        }
        ProductImageContainer BOr = productDetailsProductItemDictIntf.BOr();
        if (!(BOr == null || (BGO = BOr.BGO()) == null || (A02 = 1iI.A02(hox.A01, BGO, AnonymousClass05K.A0C)) == null)) {
            gj5.A03.setUrl(A02, hox.A02);
        }
        ? r2 = gj5.A03;
        ID0.A00(r2, gj5, iov, hox, 22);
        r2.setRadius(hox.A01.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding));
        UserSession userSession = hox.A03;
        if (182.A06(0Tu.A05, userSession, 36329075362905879L)) {
            r2.setOnLongClickListener(new IDG(hox, A1Z ? 1 : 0));
            gj5.A00.setOnLongClickListener(new IDG(hox, 2));
        }
        2el r4 = hox.A04;
        C2354830a A002 = AnonymousClass30Y.A00(iov, Integer.valueOf(gj5.getAbsoluteAdapterPosition()), iov.A01);
        AnonymousClass0iw r7 = hox.A02;
        0qQ.A0C(r7, C66579MXk.A00(2));
        A002.A00(new IPL(userSession, (AnonymousClass4DU) r7, hox.A07, hox.A08, gj5.getLayoutPosition(), hox.A00));
        C51967G9n.A0z(r2, A002, r4);
    }

    public final Class modelClass() {
        return IOV.class;
    }
}
