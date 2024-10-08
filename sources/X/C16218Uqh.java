package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uqh  reason: case insensitive filesystem */
public final class C16218Uqh extends C15732Uhd {
    public final AnonymousClass0iw A00;
    public final C14819UAy A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.media_list_section, false);
        Object A0U = C13988Tno.A0U(A09, new UCD(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.media.MediaListSectionViewBinder.Holder");
        return (C249703kE) A0U;
    }

    public final Class modelClass() {
        return WSO.class;
    }

    public C16218Uqh(AnonymousClass0iw r1, C14819UAy uAy, UserSession userSession, C18020Vjw vjw) {
        super(vjw);
        this.A02 = userSession;
        this.A00 = r1;
        this.A01 = uAy;
    }
}
