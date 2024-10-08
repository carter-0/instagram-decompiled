package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.ui.widget.recyclerview.MainFeedRecyclerView;

/* renamed from: X.AoM  reason: case insensitive filesystem */
public final class C41100AoM implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ C238663Ct A01;

    public C41100AoM(C238663Ct r1, double d) {
        this.A01 = r1;
        this.A00 = d;
    }

    public final void run() {
        C227812jx r1 = this.A01.A00;
        if (r1.mView != null) {
            RecyclerView recyclerView = r1.getRecyclerView();
            0qQ.A0C(recyclerView, "null cannot be cast to non-null type com.instagram.common.ui.widget.recyclerview.MainFeedRecyclerView");
            ((MainFeedRecyclerView) recyclerView).A00 = this.A00;
        }
    }
}
