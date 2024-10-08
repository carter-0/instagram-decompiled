package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mhy  reason: case insensitive filesystem */
public final class C67083Mhy extends C232222tE {
    public final 2bv A00;
    public final C231922sd A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        NP4 np4 = (NP4) r4;
        C254123ry r52 = (C254123ry) r5;
        AnonymousClass7TG.A1N(np4, r52);
        this.A01.ADo(this.A00, np4.A00, r52);
    }

    public final Class modelClass() {
        return NP4.class;
    }

    public C67083Mhy(AnonymousClass0iw r2, UserSession userSession, 2bv r4) {
        this.A00 = r4;
        this.A01 = new C231922sd(r2, userSession);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C254123ry(this.A01.CrT(layoutInflater, viewGroup));
    }
}
