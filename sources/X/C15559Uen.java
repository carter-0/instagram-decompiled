package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import instagram.features.stories.dashboard.fragment.ReelDashboardFragment;

/* renamed from: X.Uen  reason: case insensitive filesystem */
public final class C15559Uen extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final ReelDashboardFragment A02;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final int getIdentifier(int i, Object obj, Object obj2) {
        return ((VWE) obj).A01.A0j.hashCode();
    }

    public C15559Uen(Context context, AnonymousClass0iw r2, ReelDashboardFragment reelDashboardFragment) {
        this.A00 = context;
        this.A01 = r2;
        this.A02 = reelDashboardFragment;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(991768525);
        view.getTag().getClass();
        17k.A0E(view.getTag() instanceof C17252VOf);
        Context context = this.A00;
        AnonymousClass2t9 A0U = DbU.A0U(AnonymousClass2t9.A00(context), new C15783UiS(context, this.A01, this.A02));
        ((C17252VOf) view.getTag()).A00.setAdapter(A0U);
        ViewModelListUpdate viewModelListUpdate = new ViewModelListUpdate();
        VWE vwe = (VWE) obj;
        for (DTP wsx : vwe.A02) {
            viewModelListUpdate.A00(new WSX(wsx, vwe.A01, vwe.A00));
        }
        A0U.A05(viewModelListUpdate);
        AnonymousClass0fD.A0A(1279754142, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(1375800958);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_reaction_count_list, viewGroup, false);
        RecyclerView A0F = DbZ.A0F(inflate, R.id.reel_reaction_count_list_recyclerview);
        A0F.A11(new C60455Jln(DbY.A01(context), 6));
        A0F.A0S = true;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        linearLayoutManager.A0v(true);
        A0F.setLayoutManager(linearLayoutManager);
        inflate.setTag(new C17252VOf(inflate));
        AnonymousClass0fD.A0A(1199571805, A03);
        return inflate;
    }

    public final int getViewModelHash(int i, Object obj, Object obj2) {
        return obj.hashCode();
    }
}
