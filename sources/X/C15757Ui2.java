package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Ui2  reason: case insensitive filesystem */
public final class C15757Ui2 extends C232222tE {
    public final W26 A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C14857UCl(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.product_feed_see_more_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        1Ln r5;
        AnonymousClass0Ac r1;
        String str;
        V1Y v1y;
        C15078UNv uNv = (C15078UNv) r8;
        C14857UCl uCl = (C14857UCl) r9;
        AnonymousClass7TG.A1N(uNv, uCl);
        IgTextView igTextView = uCl.A01;
        igTextView.setText(C56259HvT.A00(C66580MXl.A0B(igTextView), uNv.A00));
        WBC.A00(uCl.A00, 32, uNv);
        W26 w26 = this.A00;
        if (w26 != null) {
            String str2 = uNv.A01;
            0qQ.A0B(str2, 0);
            String str3 = w26.A02;
            if (0qQ.A0K(str3, "instagram_shopping_mini_shop_storefront")) {
                r5 = new 1Ln(AnonymousClass7TE.A0e(w26.A00, "commerce_storefront_impression"), 130);
                if (DbT.A1Y(r5)) {
                    r5.A0M(V1W.STOREFRONT, "referral_surface");
                    r5.A0R("shopping_session_id", w26.A03);
                    if (00l.A0d(str2, C66582MXn.A0w("WISH_LIST"), false)) {
                        v1y = V1Y.SAVED_ITEMS;
                    } else {
                        v1y = V1Y.CART_ITEM;
                    }
                    C13991Tnr.A0z(v1y, r5, "analytics_module");
                    r1 = V1Z.SEE_ALL_BUTTON;
                    str = "analytics_component";
                } else {
                    return;
                }
            } else if (0qQ.A0K(str3, "instagram_shopping_home")) {
                r5 = new 1Ln(AnonymousClass7TE.A0e(w26.A00, "commerce_tab_feed_impression"), 133);
                if (DbT.A1Y(r5)) {
                    C13991Tnr.A0z(V1Z.SEE_ALL_BUTTON, r5, "analytics_component");
                    r5.A0M(V1W.TAB_FEED, "referral_surface");
                    r5.A0R("shopping_session_id", w26.A03);
                    if (00l.A0d(str2, C66582MXn.A0w("WISH_LIST"), false)) {
                        r1 = V1Y.SAVED_ITEMS;
                    } else {
                        r1 = V1Y.CART_ITEM;
                    }
                    str = "analytics_module";
                } else {
                    return;
                }
            } else {
                return;
            }
            r5.A0M(r1, str);
            r5.A0R("navigation_chain", DbS.A0k());
            r5.Cgf();
        }
    }

    public final Class modelClass() {
        return C15078UNv.class;
    }

    public C15757Ui2(W26 w26) {
        this.A00 = w26;
    }
}
