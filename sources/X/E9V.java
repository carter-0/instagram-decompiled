package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class E9V extends C231632rz {
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1750186259);
        ((C49365EuT) DbT.A0o(view)).A00.setText((String) obj);
        AnonymousClass0fD.A0A(965504939, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1886265662);
        ViewGroup viewGroup2 = (ViewGroup) DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.multiple_account_recovery_header);
        viewGroup2.setTag(new C49365EuT(viewGroup2));
        AnonymousClass0fD.A0A(-1618731636, A03);
        return viewGroup2;
    }
}
