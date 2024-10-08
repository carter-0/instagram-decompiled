package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uej  reason: case insensitive filesystem */
public final class C15555Uej extends C231632rz {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C19472WaK A002 = AnonymousClass6UJ.A00(((C255773uh) obj).A0b);
        A002.getClass();
        String str = A002.A00.A08;
        if (str == null) {
            str = "";
        }
        str.getClass();
        return str.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C19472WaK A002 = AnonymousClass6UJ.A00(((C255773uh) obj).A0b);
        A002.getClass();
        return A002.A01();
    }

    public C15555Uej(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1210543811);
        C17861VhE vhE = (C17861VhE) view.getTag();
        if (vhE != null) {
            UserSession userSession = this.A00;
            1Xj r0 = ((C255773uh) obj).A0b;
            r0.getClass();
            vhE.A00(userSession, r0);
        }
        AnonymousClass0fD.A0A(1526994427, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-917920862);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.reel_dashboard_slider_results_summary);
        A0C.setTag(new C17861VhE(A0C));
        AnonymousClass0fD.A0A(-1257965316, A03);
        return A0C;
    }
}
