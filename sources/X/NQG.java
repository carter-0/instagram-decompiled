package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;

public final class NQG extends C232232tF {
    public static final NQG A00 = new Object();

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C68189N5e n5e = (C68189N5e) r3;
        C67982MyA myA = (C67982MyA) r4;
        AnonymousClass7TG.A1N(n5e, myA);
        myA.A00 = n5e;
        myA.A01.setText(n5e.A00);
        myA.A02.setVisibility(DbW.A01(n5e.A01 ? 1 : 0));
    }

    public final Class modelClass() {
        return C68189N5e.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        return new C67982MyA(layoutInflater, viewGroup);
    }
}
