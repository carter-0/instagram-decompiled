package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.E9m  reason: case insensitive filesystem */
public final class C47600E9m extends C231632rz {
    public final Context A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public C47600E9m(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A04 = DbX.A04(view, 1655120038);
        C46892Dn8 dn8 = (C46892Dn8) view.getTag();
        if (dn8 != null) {
            dn8.A00.setVisibility(8);
            throw AnonymousClass7TE.A11(C66579MXk.A00(856));
        } else {
            AnonymousClass0fD.A0A(-1932112815, A04);
        }
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1409949549);
        View view = C49160EqR.A00(this.A00, viewGroup).itemView;
        0qQ.A07(view);
        AnonymousClass0fD.A0A(-1226573545, A04);
        return view;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
