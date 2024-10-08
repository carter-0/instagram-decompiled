package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.E9i  reason: case insensitive filesystem */
public final class C47596E9i extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47596E9i(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-244916462);
        C49801F7n.A01((C67293MlS) obj, (C46885Dn1) DbT.A0o(view));
        AnonymousClass0fD.A0A(1892271918, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1515959592);
        View view = C49801F7n.A00(this.A00, viewGroup).itemView;
        AnonymousClass0fD.A0A(-2131962832, A03);
        return view;
    }
}
