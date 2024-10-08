package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.productfeed.MultiProductComponent;
import com.instagram.shopping.fragment.cart.ShoppingCartFragment;

/* renamed from: X.UiU  reason: case insensitive filesystem */
public final class C15785UiU extends C232222tE {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final ShoppingCartFragment A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        WSH wsh = (WSH) r11;
        C14890UDs uDs = (C14890UDs) r12;
        AnonymousClass7TF.A1H(wsh, uDs);
        Context A0S = AnonymousClass7TE.A0S(uDs.A04);
        UserSession userSession = this.A01;
        AnonymousClass0iw r3 = this.A00;
        ShoppingCartFragment shoppingCartFragment = this.A02;
        MultiProductComponent multiProductComponent = wsh.A00;
        C18696Vwu.A01(A0S, r3, userSession, multiProductComponent, new C17524VZd(multiProductComponent, 0), shoppingCartFragment, uDs, AnonymousClass05K.A0C);
    }

    public final Class modelClass() {
        return WSH.class;
    }

    public C15785UiU(AnonymousClass0iw r1, UserSession userSession, ShoppingCartFragment shoppingCartFragment) {
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = shoppingCartFragment;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Object tag = C18696Vwu.A00(Pxj.A0E(viewGroup), viewGroup, true).getTag();
        0qQ.A0C(tag, AnonymousClass000.A00(1639));
        return (C249703kE) tag;
    }
}
