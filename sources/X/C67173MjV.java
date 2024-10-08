package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.MjV  reason: case insensitive filesystem */
public final class C67173MjV extends C232222tE {
    public final UserSession A00;
    public final C273634mu A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C273634mu r1 = this.A01;
        UserSession userSession = this.A00;
        C67300Mla.A01(userSession, r1, (C67301Mlb) r4, (C66890MeV) r3);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C67301Mlb(C67300Mla.A00(layoutInflater, viewGroup, this.A00));
    }

    public final Class modelClass() {
        return C66890MeV.class;
    }

    public C67173MjV(UserSession userSession, C273634mu r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }
}
