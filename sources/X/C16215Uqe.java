package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uqe  reason: case insensitive filesystem */
public final class C16215Uqe extends C15732Uhd {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        View A09 = DbU.A09(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.cta_section, false);
        Object A0U = C13988Tno.A0U(A09, new UCA(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.cta.GenericCTASectionViewBinder.Holder");
        return (C249703kE) A0U;
    }

    public final Class modelClass() {
        return WSJ.class;
    }

    public C16215Uqe(UserSession userSession, C18020Vjw vjw) {
        super(vjw);
        this.A00 = userSession;
    }
}
