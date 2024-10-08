package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.Tv5  reason: case insensitive filesystem */
public final class C14376Tv5 extends C232222tE {
    public final C231972si A00 = new Object();

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C15947UlH ulH = (C15947UlH) r4;
        C254083ru r52 = (C254083ru) r5;
        AnonymousClass7TG.A1N(ulH, r52);
        this.A00.ADo(ulH.A00, ulH.A01, r52);
    }

    public final Class modelClass() {
        return C15947UlH.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C254083ru(this.A00.CrT(layoutInflater, viewGroup));
    }
}
