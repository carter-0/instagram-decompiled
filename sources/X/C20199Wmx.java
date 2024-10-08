package X;

import android.widget.Scroller;
import com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout;

/* renamed from: X.Wmx  reason: case insensitive filesystem */
public final class C20199Wmx implements Runnable {
    public final /* synthetic */ Scroller A00;
    public final /* synthetic */ RefreshableRecyclerViewLayout A01;

    public C20199Wmx(Scroller scroller, RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        this.A00 = scroller;
        this.A01 = refreshableRecyclerViewLayout;
    }

    public final void run() {
        Scroller scroller = this.A00;
        scroller.computeScrollOffset();
        RefreshableRecyclerViewLayout refreshableRecyclerViewLayout = this.A01;
        RefreshableRecyclerViewLayout.A06(refreshableRecyclerViewLayout);
        if (!scroller.isFinished()) {
            refreshableRecyclerViewLayout.postOnAnimation(this);
        }
        RefreshableRecyclerViewLayout.A05(refreshableRecyclerViewLayout);
    }
}
