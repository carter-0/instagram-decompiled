package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.EAm  reason: case insensitive filesystem */
public final class C47626EAm extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47626EAm(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1835155107);
        C49802F7o.A01((FAZ) obj, (C46887Dn3) DbT.A0o(view));
        AnonymousClass0fD.A0A(1734544695, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1084346466);
        View view = C49802F7o.A00(this.A00, viewGroup).itemView;
        AnonymousClass0fD.A0A(-201218866, A03);
        return view;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
