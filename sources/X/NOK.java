package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NOK extends C232222tE {
    public final AnonymousClass0xx A00;
    public final UserSession A01;

    public NOK(AnonymousClass0xx r2, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        UserSession userSession = this.A01;
        0qQ.A0B(userSession, 0);
        boolean A012 = C70867OPg.A01(userSession);
        int i = R.layout.card_gallery_card_base_legacy_layout;
        if (A012) {
            i = R.layout.card_gallery_card_base_layout;
        }
        return new C68045MzC(DbT.A0D(layoutInflater, viewGroup, i, false), this.A00, userSession, C70343O2v.A00(viewGroup));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
        C68192N5h n5h = (C68192N5h) r1;
        C68045MzC mzC = (C68045MzC) r2;
        AnonymousClass7TG.A1N(n5h, mzC);
        mzC.A00(n5h);
    }

    public final Class modelClass() {
        return C68192N5h.class;
    }
}
