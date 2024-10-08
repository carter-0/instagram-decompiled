package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class EAC extends C231632rz {
    public final Context A00;
    public final G6V A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public EAC(Context context, G6V g6v) {
        this.A00 = context;
        this.A01 = g6v;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-2000654670);
        TwD twD = (TwD) obj;
        String str = twD.A01;
        int i2 = twD.A00;
        boolean z = ((C17962Viv) obj2).A00;
        C49163EqU.A00(this.A00, this.A01, (EyR) DbT.A0o(view), str, i2, z);
        AnonymousClass0fD.A0A(709039759, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1448929568);
        View A0C = DbT.A0C(LayoutInflater.from(this.A00), viewGroup, R.layout.row_search_for_x);
        A0C.setTag(new EyR(A0C));
        AnonymousClass0fD.A0A(-1238985266, A03);
        return A0C;
    }
}
