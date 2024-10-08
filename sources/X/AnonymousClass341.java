package X;

import android.view.ViewGroup;
import android.widget.ListView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.341  reason: invalid class name */
public final class AnonymousClass341 implements AnonymousClass342 {
    public final AnonymousClass4DV A00;

    public final void FND(AnonymousClass345 r4, AnonymousClass343 r5) {
        C238133Ar scrollingViewProxy = this.A00.getScrollingViewProxy();
        ViewGroup CEd = scrollingViewProxy.CEd();
        if (scrollingViewProxy.CWN()) {
            ListView listView = (ListView) CEd;
            boolean z = false;
            if (listView.getHeaderViewsCount() == 0) {
                z = true;
            }
            17k.A0G(z, "VisibleItemTracker's ListPositionTracked isn't implemented to support list with headerView. If we decided to use headerView, please adjust the framework for it.");
            for (int firstVisiblePosition = listView.getFirstVisiblePosition(); firstVisiblePosition <= listView.getLastVisiblePosition(); firstVisiblePosition++) {
                r5.A02(r4, firstVisiblePosition);
            }
            return;
        }
        C252553pI r0 = ((RecyclerView) CEd).A0D;
        r0.getClass();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r0;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        if (A1a != -1 && A1b != -1) {
            while (A1a <= A1b) {
                r5.A02(r4, A1a);
                A1a++;
            }
        }
    }

    public AnonymousClass341(AnonymousClass4DV r1) {
        this.A00 = r1;
    }
}
