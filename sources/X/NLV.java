package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;

public final class NLV extends C231632rz {
    public final UserSession A00;
    public final C273634mu A01;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLV(UserSession userSession, C273634mu r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1181240020);
        view.getTag().getClass();
        C273634mu r1 = this.A01;
        C67300Mla.A01(this.A00, r1, (C67301Mlb) view.getTag(), (C66890MeV) obj);
        AnonymousClass0fD.A0A(-782430793, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-139570275);
        View A002 = C67300Mla.A00(DbV.A0D(viewGroup), viewGroup, this.A00);
        AnonymousClass0fD.A0A(1361028152, A03);
        return A002;
    }
}
