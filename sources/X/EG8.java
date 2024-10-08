package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EG8 extends C232222tE {
    public final Context A00;
    public final G6V A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C47765EGc eGc = (C47765EGc) r8;
        String str = eGc.A01;
        int i = eGc.A00;
        boolean z = eGc.A02;
        C49163EqU.A00(this.A00, this.A01, (EyR) DbT.A0o(r9.itemView), str, i, z);
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.row_search_for_x);
        A0C.setTag(new EyR(A0C));
        return new C249703kE(A0C);
    }

    public final Class modelClass() {
        return C47765EGc.class;
    }

    public EG8(Context context, G6V g6v) {
        this.A00 = context;
        this.A01 = g6v;
    }
}
