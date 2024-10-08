package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Tsh  reason: case insensitive filesystem */
public final class C14259Tsh extends C232222tE {
    public final 2bv A00;
    public final C231972si A01 = new Object();

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        NP3 np3 = (NP3) r4;
        C254083ru r52 = (C254083ru) r5;
        AnonymousClass7TG.A1N(np3, r52);
        this.A01.ADo(this.A00, np3.A00, r52);
    }

    public final Class modelClass() {
        return NP3.class;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.2si] */
    public C14259Tsh(2bv r2) {
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C254083ru(this.A01.CrT(layoutInflater, viewGroup));
    }
}
