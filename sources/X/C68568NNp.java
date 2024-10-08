package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.NNp  reason: case insensitive filesystem */
public final class C68568NNp extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        KGC kgc = (KGC) r3;
        C3254972u.A02(kgc.A00, (AnonymousClass730) r4, kgc.A01);
    }

    public final Class modelClass() {
        return KGC.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A01 = C3254972u.A01(layoutInflater, viewGroup);
        AnonymousClass730 r0 = new AnonymousClass730(A01);
        A01.setTag(r0);
        return r0;
    }
}
