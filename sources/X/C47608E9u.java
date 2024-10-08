package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.E9u  reason: case insensitive filesystem */
public final class C47608E9u extends C231632rz {
    public final Context A00;
    public final E6U A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47608E9u(Context context, E6U e6u) {
        this.A00 = context;
        this.A01 = e6u;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1681916901);
        EtQ etQ = (EtQ) DbT.A0o(view);
        C49481EwM ewM = (C49481EwM) obj;
        E6U e6u = this.A01;
        AnonymousClass7TG.A1T(etQ, ewM, e6u);
        TextView textView = etQ.A00;
        textView.setText(ewM.A01);
        FPE.A01(textView, 24, ewM, e6u);
        AnonymousClass0fD.A0A(-622014360, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1365289419);
        View A09 = DbW.A09(DbT.A0B(this.A00), viewGroup, R.layout.row_city, false);
        A09.setTag(new EtQ(A09));
        AnonymousClass0fD.A0A(977374153, A03);
        return A09;
    }
}
