package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Udm  reason: case insensitive filesystem */
public final class C15497Udm extends C231632rz {
    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1761764950);
        AnonymousClass7TG.A1O(view, obj);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.common.SectionHeaderViewBinder.Holder");
        C18246VoD.A01((UDD) tag, (C15081UNy) obj);
        AnonymousClass0fD.A0A(-1403630312, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1437717568);
        View A00 = C18246VoD.A00(viewGroup);
        AnonymousClass0fD.A0A(1573026306, A04);
        return A00;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
