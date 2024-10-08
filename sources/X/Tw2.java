package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class Tw2 extends C232222tE {
    public final C20950X6d A00;

    public Tw2(C20950X6d x6d) {
        0qQ.A0B(x6d, 1);
        this.A00 = x6d;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C16191UqG uqG = (C16191UqG) r3;
        C14838UBs uBs = (C14838UBs) r4;
        AnonymousClass7TG.A1N(uqG, uBs);
        VBU.A00(uqG.A00, this.A00, uBs);
    }

    public final Class modelClass() {
        return C16191UqG.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.see_results_button, false);
        A0A.setTag(new C14838UBs(A0A));
        return new C14838UBs(A0A);
    }
}
