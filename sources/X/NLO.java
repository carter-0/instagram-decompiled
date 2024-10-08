package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NLO extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLO(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-2000021832);
        C69656Npe npe = (C69656Npe) obj2;
        O30.A00(view, (C70661OFi) obj, npe.A00, npe.A02, npe.A01);
        AnonymousClass0fD.A0A(1290145742, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-303436369);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_large_button_item);
        A0C.setTag(new C67960Mxk(A0C));
        AnonymousClass0fD.A0A(-1479432520, A03);
        return A0C;
    }
}
