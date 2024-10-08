package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Mg4  reason: case insensitive filesystem */
public final class C66971Mg4 extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C66971Mg4(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-803390157);
        ORK.A01((C67865Mw9) DbT.A0o(view), (FGF) obj);
        AnonymousClass0fD.A0A(-873327854, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1944685310);
        View view = ORK.A00(this.A00, viewGroup).itemView;
        AnonymousClass0fD.A0A(-1528732307, A03);
        return view;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
