package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* renamed from: X.2ty  reason: invalid class name and case insensitive filesystem */
public final class C232582ty extends C231632rz {
    public final void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        0qQ.A0B(r2, 0);
        r2.A7U(0);
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(239059447, AnonymousClass0fD.A03(692928043));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1932935839);
        0qQ.A0B(viewGroup, 1);
        Context context = viewGroup.getContext();
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
        view.setBackgroundColor(context.getColor(2Yu.A0C(context)));
        AnonymousClass0fD.A0A(-849975192, A03);
        return view;
    }
}
