package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class NLP extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLP(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-2006204423);
        C49803F7p.A01((C49862FAc) obj, (FAT) obj2, (C46889Dn5) DbT.A0o(view));
        AnonymousClass0fD.A0A(428585953, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1396262938);
        View view = C49803F7p.A00(this.A00, viewGroup).itemView;
        AnonymousClass0fD.A0A(-1991710368, A03);
        return view;
    }
}
