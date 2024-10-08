package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NLH extends C231632rz {
    public final C74428Pui A00;

    public final int getViewTypeCount() {
        return 1;
    }

    public NLH(C74428Pui pui) {
        this.A00 = pui;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-32464563);
        AnonymousClass7TG.A1U(view, obj, obj2);
        Object tag = view.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.SearchSectionTitleViewBinder.Holder");
        C61069Jw7 jw7 = (C61069Jw7) obj;
        C67445Mo0.A00(jw7, (C70327O2f) obj2, this.A00, (C67446Mo1) tag);
        AnonymousClass0fD.A0A(-283904570, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 1270327556);
        View A0A = DbU.A0A(DbV.A0D(viewGroup), viewGroup, R.layout.search_section, false);
        A0A.setTag(new C67446Mo1(A0A));
        AnonymousClass0fD.A0A(301140533, A04);
        return A0A;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
