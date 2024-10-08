package X;

import android.view.View;
import android.view.ViewGroup;

public final class E9R extends C231632rz {
    public G6X A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return AnonymousClass972.MUTABLE_FLAG_MASK;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        AnonymousClass0fD.A0A(1318481406, AnonymousClass0fD.A03(1273585218));
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(670328445);
        View rowView = this.A00.getRowView();
        AnonymousClass0fD.A0A(1921137213, A03);
        return rowView;
    }
}
