package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class NLQ extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLQ(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(975300387);
        C49804F7q.A01((C50989Fmc) obj, (FAT) obj2, (C46894DnA) DbT.A0o(view));
        AnonymousClass0fD.A0A(270889923, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1801229914);
        View view = C49804F7q.A00(this.A00, viewGroup).itemView;
        AnonymousClass0fD.A0A(-1685952118, A03);
        return view;
    }
}
