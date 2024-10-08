package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class GBW extends GBR {
    public final JSx A00;
    public final C51987GAk A01;

    public final boolean A02() {
        return false;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.immersive_catch_up_completed_item_layout, false));
    }

    public final Class modelClass() {
        return C54576HJl.class;
    }

    public GBW(JSx jSx, C51987GAk gAk) {
        super(jSx, gAk);
        this.A01 = gAk;
        this.A00 = jSx;
    }
}
