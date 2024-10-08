package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class NLS extends C231632rz {
    public final Context A00;

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r2, Object obj, Object obj2) {
        r2.A7U(0);
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public NLS(Context context) {
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        int A03 = AnonymousClass0fD.A03(-1435793838);
        view.getTag().getClass();
        ((C69650NpY) view.getTag()).A00.setAdapter((2Rw) obj);
        AnonymousClass0fD.A0A(1445118952, A03);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.NpY] */
    public final View createView(int i, ViewGroup viewGroup) {
        int A03 = AnonymousClass0fD.A03(-854433616);
        Context context = this.A00;
        View inflate = LayoutInflater.from(context).inflate(R.layout.login_activity_map_row, viewGroup, false);
        RecyclerView A0I = DbT.A0I(inflate, R.id.login_activity_map_recycler_view);
        ? obj = new Object();
        obj.A00 = A0I;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView = obj.A00;
        recyclerView.setLayoutManager(linearLayoutManager);
        JTP.A1D(recyclerView, 0, DbY.A01(context));
        inflate.setTag(obj);
        AnonymousClass0fD.A0A(-1006679674, A03);
        return inflate;
    }
}
