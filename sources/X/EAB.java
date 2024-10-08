package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class EAB extends C231632rz {
    public final Context A00;
    public final G6T A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAB(Context context, G6T g6t) {
        this.A00 = context;
        this.A01 = g6t;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-533945074);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleHeaderRowViewBinder.Holder");
        FCV.A01((C46448DfA) obj, this.A01, (C46896DnC) tag, (G6U) null);
        AnonymousClass0fD.A0A(1457643768, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-1604563871);
        0qQ.A0B(viewGroup, 1);
        View view = FCV.A00(this.A00, viewGroup, true).itemView;
        0qQ.A07(view);
        AnonymousClass0fD.A0A(-1097465207, A03);
        return view;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
