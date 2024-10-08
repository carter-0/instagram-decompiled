package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uib  reason: case insensitive filesystem */
public final class C15792Uib extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final XC8 A03;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r7, C249703kE r8) {
        C15075UNs uNs = (C15075UNs) r7;
        UE5 ue5 = (UE5) r8;
        AnonymousClass7TG.A1N(uNs, ue5);
        C17096VHs.A00(this.A00, this.A01, this.A02, this.A03, uNs, ue5);
        0sP r1 = uNs.A01.A01;
        if (r1 != null) {
            View view = ue5.itemView;
            0qQ.A06(view);
            r1.invoke(view);
        }
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbW.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.product_feed_list_item_layout, false);
        Object A0U = C13988Tno.A0U(A09, new UE5(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.widget.productcard.ProductFeedItemViewBinder.Holder");
        return (C249703kE) A0U;
    }

    public final Class modelClass() {
        return C15075UNs.class;
    }

    public C15792Uib(Context context, AnonymousClass0iw r2, UserSession userSession, XC8 xc8) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = xc8;
    }
}
