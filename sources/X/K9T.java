package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class K9T extends C231632rz {
    public final Context A00;
    public final C60397Jkq A01;

    public final int getViewTypeCount() {
        return 1;
    }

    public K9T(Context context, C62320sa r4, 0sP r5) {
        this.A00 = context;
        this.A01 = new C60397Jkq(new C251383n1(context, (int) R.style.SearchHistoryPillDark), r4, r5);
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(1447171438);
        0qQ.A0B(obj, 2);
        C60397Jkq jkq = this.A01;
        jkq.A00 = JTQ.A0i(((C61080JwI) obj).A00);
        jkq.notifyDataSetChanged();
        AnonymousClass0fD.A0A(-2133799027, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        int A03 = AnonymousClass0fD.A03(-993869181);
        View inflate = LayoutInflater.from(this.A00).inflate(R.layout.layout_search_asset_keywords_history, viewGroup, false);
        if ((inflate instanceof RecyclerView) && (recyclerView = (RecyclerView) inflate) != null) {
            recyclerView.setAdapter(this.A01);
            DbV.A1A(recyclerView.getContext(), recyclerView);
        }
        0qQ.A07(inflate);
        AnonymousClass0fD.A0A(29152224, A03);
        return inflate;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
