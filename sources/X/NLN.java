package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class NLN extends C231632rz {
    public final Context A00;

    public NLN(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1351461835);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.ui.menu.SimpleIgdsListCellItemViewBinder.Holder");
        C70347O2z.A00((OIM) obj, (C67931MxH) tag);
        AnonymousClass0fD.A0A(-1598330656, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -2119022373);
        Context context = this.A00;
        0qQ.A0B(context, 0);
        IgdsListCell A0d = C66581MXm.A0d(context);
        A0d.setTag(new C67931MxH(A0d));
        AnonymousClass0fD.A0A(-1570285780, A04);
        return A0d;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
