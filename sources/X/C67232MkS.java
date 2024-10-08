package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.MkS  reason: case insensitive filesystem */
public final class C67232MkS extends C232222tE {
    public final AnonymousClass4DH A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final 2el A03 = 2el.A00();
    public final C2614849t A04;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        UserSession userSession = this.A02;
        AnonymousClass0iw r5 = this.A01;
        return new AnonymousClass4AG(layoutInflater, DbT.A0D(layoutInflater, viewGroup, R.layout.layout_cf_hub, false), this.A00, r5, userSession, this.A03, new C67333Mm9(), this.A04);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
        C66980MgE mgE = (C66980MgE) r1;
        AnonymousClass4AG r22 = (AnonymousClass4AG) r2;
        AnonymousClass7TG.A1N(mgE, r22);
        r22.A00(mgE);
    }

    public final Class modelClass() {
        return C66980MgE.class;
    }

    public C67232MkS(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, C2614849t r5) {
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r5;
    }
}
