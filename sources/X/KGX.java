package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KGX extends C232232tF {
    public final Context A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60565Jna(DbU.A09(layoutInflater, viewGroup, R.layout.immersive_catch_up_completed_item_layout, false), this.A00);
    }

    public final Class modelClass() {
        return C64749LhR.class;
    }

    public KGX(Context context) {
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r2, C249703kE r3) {
        AnonymousClass7TG.A1N(r2, r3);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
    }
}
