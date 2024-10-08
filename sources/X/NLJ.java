package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

public final class NLJ extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLJ(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1415062563);
        C67871MwF mwF = (C67871MwF) view.getTag();
        if (mwF != null) {
            ORI.A01((FAT) obj2, (PR7) obj, mwF);
        }
        AnonymousClass0fD.A0A(858347414, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-742120879);
        C67871MwF A002 = ORI.A00(this.A00, viewGroup);
        A002.itemView.setTag(A002);
        View view = A002.itemView;
        AnonymousClass0fD.A0A(1995511646, A03);
        return view;
    }
}
