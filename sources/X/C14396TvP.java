package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.TvP  reason: case insensitive filesystem */
public abstract class C14396TvP {
    public static final int A00(ViewGroup viewGroup, C227762js r2, C231302rO r3, C238133Ar r4, int i) {
        AnonymousClass7TG.A1Q(r3, viewGroup);
        viewGroup.measure(0, 0);
        Context context = r4.getContext();
        0qQ.A07(context);
        int A00 = AnonymousClass3D4.A00(context) + viewGroup.getMeasuredHeight() + i;
        r2.A06(r3, r4, A00);
        return A00;
    }

    public static final void A01(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(JTP.A0C(recyclerView, 0), 0, false);
        linearLayoutManager.A0v(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        int A0C = AnonymousClass7TE.A0C(recyclerView.getResources());
        recyclerView.A11(new AnonymousClass3V7(A0C, A0C));
    }
}
