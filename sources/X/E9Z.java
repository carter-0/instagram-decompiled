package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E9Z extends C231632rz {
    public final E9A A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public E9Z(E9A e9a) {
        this.A00 = e9a;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1438633347);
        C49452Evt evt = (C49452Evt) DbT.A0o(view);
        ExP exP = (ExP) obj;
        E9A e9a = this.A00;
        evt.A01.setText(exP.A01);
        FPE.A01(evt.A00, 26, e9a, exP);
        AnonymousClass0fD.A0A(1760544426, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-692580878);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.row_service_partner);
        A0C.setTag(new C49452Evt(A0C));
        AnonymousClass0fD.A0A(2036491207, A03);
        return A0C;
    }
}
