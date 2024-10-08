package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

public final class EAP extends C231632rz {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final ReelDashboardFragment A02;

    public final int getViewTypeCount() {
        return 1;
    }

    public EAP(AnonymousClass0iw r1, UserSession userSession, ReelDashboardFragment reelDashboardFragment) {
        AnonymousClass7TG.A1U(r1, userSession, reelDashboardFragment);
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-900766233);
        AnonymousClass7TG.A1O(view, obj);
        ((RecyclerView) view).setAdapter(new C46830Dm6(this.A00, this.A01, (C255773uh) obj, this.A02));
        AnonymousClass0fD.A0A(-208278546, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, -1279879149);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_dashboard_prompt_replies, viewGroup, false);
        0qQ.A0C(inflate, C273654mx.A00(4));
        RecyclerView recyclerView = (RecyclerView) inflate;
        DbV.A1A(context, recyclerView);
        AnonymousClass0fD.A0A(-1094609322, A04);
        return recyclerView;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
