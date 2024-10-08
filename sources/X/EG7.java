package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EG7 extends C232222tE {
    public final AnonymousClass0iw A00;
    public final G82 A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C46922Dnc(DbT.A0D(layoutInflater, viewGroup, R.layout.selectable_user_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        FY5 fy5 = (FY5) r9;
        C46922Dnc dnc = (C46922Dnc) r10;
        AnonymousClass7TF.A1H(fy5, dnc);
        C46974DoS doS = dnc.A00;
        F06 f06 = fy5.A00;
        G82 g82 = this.A01;
        AnonymousClass0iw r1 = this.A00;
        AnonymousClass7TF.A1B(doS, 0, g82);
        0qQ.A0B(r1, 4);
        F8B.A01((Context) null, r1, g82, doS, f06, false, false, false);
    }

    public final Class modelClass() {
        return FY5.class;
    }

    public EG7(AnonymousClass0iw r1, G82 g82) {
        this.A01 = g82;
        this.A00 = r1;
    }
}
