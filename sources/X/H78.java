package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class H78 extends C232222tE {
    public final C62320sa A00;

    public H78(C62320sa r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        0qQ.A0B(r5, 1);
        C62320sa r2 = this.A00;
        0qQ.A0B(r2, 1);
        C56802ICz.A01(r5.itemView, 19, r2);
    }

    public final Class modelClass() {
        return C54407HBy.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_grid_camera_item, false);
        C249703kE r2 = new C249703kE(A0D);
        DbU.A12(A0D.getContext(), A0D, 2131952036);
        2eS.A01(A0D);
        return r2;
    }
}
