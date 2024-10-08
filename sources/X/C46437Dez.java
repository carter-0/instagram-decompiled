package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Dez  reason: case insensitive filesystem */
public final class C46437Dez extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C46437Dez(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1562320019);
        C48234EbF ebF = (C48234EbF) DbT.A0o(view);
        0qQ.A0B(ebF, 0);
        ebF.A01.setText((String) obj);
        AnonymousClass0fD.A0A(62889538, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-498597925);
        View A002 = C49162EqT.A00(LayoutInflater.from(this.A00), viewGroup);
        AnonymousClass0fD.A0A(1804700960, A03);
        return A002;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
