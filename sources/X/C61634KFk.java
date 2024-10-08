package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

/* renamed from: X.KFk  reason: case insensitive filesystem */
public final class C61634KFk extends C232222tE {
    public int A00;
    public C61292K1d A01 = null;
    public final K8C A02;

    public C61634KFk(K8C k8c, int i) {
        this.A02 = k8c;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60640Jon(DbT.A0D(layoutInflater, viewGroup, R.layout.series_item_row_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        String A0d;
        C64766Lhi lhi = (C64766Lhi) r8;
        C60640Jon jon = (C60640Jon) r9;
        AnonymousClass7TG.A1N(lhi, jon);
        C63651L1n l1n = new C63651L1n(this);
        C61292K1d k1d = lhi.A00;
        TextView textView = jon.A02;
        Resources resources = textView.getResources();
        int size = k1d.A0A.size();
        boolean z = false;
        if (size == 0) {
            A0d = resources.getString(2131964075);
        } else {
            A0d = DbY.A0d(resources, size, R.plurals.igtv_series_episode);
        }
        0qQ.A0A(A0d);
        jon.A01.setText(k1d.A08);
        jon.A00.setText(k1d.A05);
        textView.setText(A0d);
        IgdsCheckBox igdsCheckBox = jon.A03;
        if (this.A00 == jon.getBindingAdapterPosition()) {
            z = true;
        }
        igdsCheckBox.setChecked(z);
        igdsCheckBox.jumpDrawablesToCurrentState();
        LYA.A01(jon.itemView, l1n, k1d, jon, 27);
    }

    public final Class modelClass() {
        return C64766Lhi.class;
    }
}
