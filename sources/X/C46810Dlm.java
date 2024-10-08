package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Dlm  reason: case insensitive filesystem */
public final class C46810Dlm extends LinearLayoutManager {
    public final /* synthetic */ E2Z A00;

    public final void A1S(AnonymousClass3AW r7) {
        String str;
        0qQ.A0B(r7, 0);
        super.A1S(r7);
        int A1a = A1a();
        E2Z e2z = this.A00;
        E92 e92 = e2z.A02;
        if (e92 == null) {
            str = "adapter";
        } else if (e92.getCount() > 0 && A1a != -1) {
            RecyclerView recyclerView = e2z.A00;
            if (recyclerView == null) {
                str = "recyclerView";
            } else {
                View childAt = recyclerView.getChildAt(A1a);
                if (childAt != null) {
                    AnonymousClass0eM r1 = e2z.A05;
                    if (!DbX.A0h(r1).A01.getBoolean("reorder_links_tooltip", false)) {
                        DbX.A1V(DbX.A0h(r1).A01, "reorder_links_tooltip", true);
                        childAt.postDelayed(new C51400FtW(childAt, e2z), 500);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46810Dlm(Context context, E2Z e2z) {
        super(context, 1, false);
        this.A00 = e2z;
    }
}
