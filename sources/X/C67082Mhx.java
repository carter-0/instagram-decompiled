package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Mhx  reason: case insensitive filesystem */
public final class C67082Mhx extends C232222tE {
    public final 2bv A00;
    public final C231942sf A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        NP2 np2 = (NP2) r4;
        C254103rw r52 = (C254103rw) r5;
        AnonymousClass7TG.A1N(np2, r52);
        this.A01.ADo(this.A00, np2.A00, r52);
    }

    public final Class modelClass() {
        return NP2.class;
    }

    public C67082Mhx(AnonymousClass0iw r2, 2bv r3) {
        this.A00 = r3;
        this.A01 = new C231942sf(r2);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C254103rw(this.A01.CrT(layoutInflater, viewGroup));
    }
}
