package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;

public final class KFN extends C232222tE {
    public final K8C A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.series_create_row_layout, false);
        K8C k8c = this.A00;
        0qQ.A0B(k8c, 2);
        C249703kE r2 = new C249703kE(A0D);
        AnonymousClass7TE.A0d(A0D, R.id.new_series).setText(2131964099);
        ImageView A0G = DbS.A0G(A0D, R.id.series_create_button);
        A0G.setImageResource(R.drawable.plus_24);
        A0G.setColorFilter(AnonymousClass37O.A00(2Yu.A01(A0D.getContext())));
        LY6.A01(A0D, 32, k8c);
        return r2;
    }

    public final Class modelClass() {
        return KGE.class;
    }

    public KFN(K8C k8c) {
        this.A00 = k8c;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r1, C249703kE r2) {
    }
}
