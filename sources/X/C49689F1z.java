package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F1z  reason: case insensitive filesystem */
public final class C49689F1z {
    public final RecyclerView A00;
    public final AnonymousClass2t9 A01;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.3B3, java.lang.Object] */
    public C49689F1z(View view, G7A g7a) {
        0qQ.A0B(view, 1);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.meta_ai_prompt_pills_rv);
        this.A00 = recyclerView;
        Context context = view.getContext();
        DbV.A1A(context, recyclerView);
        AnonymousClass2t9 A0U = DbU.A0U(AnonymousClass2t9.A00(context), new C47785EGw(g7a));
        this.A01 = A0U;
        recyclerView.setAdapter(A0U);
        if (recyclerView.A12.size() < 1) {
            recyclerView.A11(new Object());
        }
    }

    public final void A00(List list) {
        ViewModelListUpdate A0R = DbS.A0R();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0R.A00((UO1) it.next());
        }
        AnonymousClass2t9 r1 = this.A00.A0A;
        0qQ.A0C(r1, C66579MXk.A00(23));
        r1.A05(A0R);
    }
}
