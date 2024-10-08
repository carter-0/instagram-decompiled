package X;

import android.view.View;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.PZx  reason: case insensitive filesystem */
public final class C73279PZx implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ HorizontalStaggeredLayoutManager A01;
    public final /* synthetic */ boolean A02;

    public C73279PZx(View view, HorizontalStaggeredLayoutManager horizontalStaggeredLayoutManager, boolean z) {
        this.A01 = horizontalStaggeredLayoutManager;
        this.A00 = view;
        this.A02 = z;
    }

    public final void run() {
        ConcurrentMap concurrentMap = this.A01.A0A;
        View view = this.A00;
        if (concurrentMap.containsKey(view)) {
            concurrentMap.remove(view);
        }
        view.setVisibility(DbW.A01(this.A02 ? 1 : 0));
    }
}
