package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KFD extends C232222tE {
    public final K8V A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(layoutInflater, 1);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A08 = DbU.A08(layoutInflater, R.layout.branded_content_selected_project_list_cell);
        0qQ.A07(A08);
        return new C60585Jnu(A08, this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64756LhY lhY = (C64756LhY) r5;
        C60585Jnu jnu = (C60585Jnu) r6;
        AnonymousClass7TG.A1N(lhY, jnu);
        C60996Jus jus = lhY.A00;
        View view = jnu.A00;
        DbU.A0G(view, R.id.brand_name).setText(jus.A02);
        DbU.A0G(view, R.id.project_name).setText(jus.A06);
        LY1.A00(view, 9, jnu);
    }

    public final Class modelClass() {
        return C64756LhY.class;
    }

    public KFD(K8V k8v) {
        this.A00 = k8v;
    }
}
