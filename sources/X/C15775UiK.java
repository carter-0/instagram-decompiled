package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.UiK  reason: case insensitive filesystem */
public final class C15775UiK extends C232222tE {
    public final C20924X4p A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        0qQ.A0B(r4, 1);
        WBC.A00(r4.itemView, 48, this);
    }

    public final Class modelClass() {
        return C15803Uim.class;
    }

    public C15775UiK(C20924X4p x4p, String str) {
        this.A01 = str;
        this.A00 = x4p;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        String str = this.A01;
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.publishing_add_product);
        TextView A0d = AnonymousClass7TE.A0d(A0C, R.id.label);
        if (A0d != null) {
            A0d.setText(str);
        }
        return new C249703kE(A0C);
    }
}
