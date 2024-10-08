package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Uer  reason: case insensitive filesystem */
public final class C15563Uer extends C231632rz {
    public final ReelDashboardFragment A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        C19471WaJ A01 = C265894Ws.A01((C255773uh) obj);
        A01.getClass();
        String str = A01.A02.A08;
        if (str == null) {
            str = "";
        }
        return str.hashCode();
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        C19471WaJ A01 = C265894Ws.A01((C255773uh) obj);
        A01.getClass();
        return A01.hashCode();
    }

    public C15563Uer(ReelDashboardFragment reelDashboardFragment) {
        this.A00 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1355909935);
        ((C17860VhD) DbT.A0o(view)).A00((C255773uh) obj);
        AnonymousClass0fD.A0A(-1396166930, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-133383659);
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.reel_dashboard_quiz_results_summary);
        A0C.setTag(new C17860VhD(A0C, this.A00));
        AnonymousClass0fD.A0A(-903478401, A03);
        return A0C;
    }

    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-662858189);
        if (view == null) {
            view = createView(i, viewGroup);
        }
        bindView(i, view, obj, obj2);
        AnonymousClass0fD.A0A(-899154788, A03);
        return view;
    }
}
