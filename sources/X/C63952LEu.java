package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.LEu  reason: case insensitive filesystem */
public final class C63952LEu {
    public RecyclerView A00;
    public final C60396Jkp A01;

    public final void A00(RecyclerView recyclerView) {
        Context context;
        this.A00 = recyclerView;
        C60396Jkp jkp = this.A01;
        recyclerView.setAdapter(jkp);
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != null) {
            context = recyclerView2.getContext();
        } else {
            context = null;
        }
        DbV.A1A(context, recyclerView);
        if (recyclerView.A12.size() == 0) {
            Context context2 = recyclerView.getContext();
            JTP.A1D(recyclerView, AnonymousClass7TG.A02(context2), DbY.A01(context2));
        }
        RecyclerView recyclerView3 = this.A00;
        if (recyclerView3 != null) {
            int i = 0;
            if (jkp.getItemCount() == 0) {
                i = 8;
            }
            recyclerView3.setVisibility(i);
        }
    }

    public final void A01(List list) {
        C60396Jkp jkp = this.A01;
        List list2 = jkp.A01;
        list2.clear();
        list2.addAll(list);
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            int i = 0;
            if (jkp.getItemCount() == 0) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
        jkp.notifyDataSetChanged();
    }

    public C63952LEu(MUI mui, boolean z) {
        this.A01 = new C60396Jkp(mui, z);
    }
}
