package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H75 extends C232222tE {
    public final C55477HiL A00;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        0qQ.A0B(r5, 1);
        C55477HiL hiL = this.A00;
        0qQ.A0B(hiL, 1);
        C56800ICx.A00(r5.itemView, 47, hiL);
    }

    public final Class modelClass() {
        return IOM.class;
    }

    public H75(C55477HiL hiL) {
        this.A00 = hiL;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.collaborative_collection_creation_row, false));
    }
}
