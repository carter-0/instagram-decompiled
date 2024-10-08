package X;

import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.Wks  reason: case insensitive filesystem */
public final class C20094Wks implements Runnable {
    public final /* synthetic */ RefreshableListView A00;

    public C20094Wks(RefreshableListView refreshableListView) {
        this.A00 = refreshableListView;
    }

    public final void run() {
        RefreshableListView refreshableListView = this.A00;
        if (refreshableListView.A05 == C323676xv.REFRESHING) {
            RefreshableListView.A04(refreshableListView);
        }
        refreshableListView.A06 = null;
    }
}
