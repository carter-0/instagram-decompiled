package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Dfs  reason: case insensitive filesystem */
public final class C46489Dfs extends C232222tE {
    public final 2bv A00;
    public final C231952sg A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        EGX egx = (EGX) r4;
        C254113rx r52 = (C254113rx) r5;
        AnonymousClass7TG.A1N(egx, r52);
        this.A01.ADo(this.A00, egx.A00, r52);
    }

    public final Class modelClass() {
        return EGX.class;
    }

    public C46489Dfs(UserSession userSession, 2bv r3) {
        this.A00 = r3;
        this.A01 = new C231952sg(userSession);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C254113rx(this.A01.CrT(layoutInflater, viewGroup));
    }
}
