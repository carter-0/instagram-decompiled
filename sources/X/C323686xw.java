package X;

import android.widget.AbsListView;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.6xw  reason: invalid class name and case insensitive filesystem */
public final class C323686xw implements AbsListView.OnScrollListener {
    public final /* synthetic */ RefreshableListView A00;

    public C323686xw(RefreshableListView refreshableListView) {
        this.A00 = refreshableListView;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        int A03 = AnonymousClass0fD.A03(1550168824);
        RefreshableListView refreshableListView = this.A00;
        AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
        if (onScrollListener != null) {
            onScrollListener.onScroll(absListView, i, i2, i3);
        }
        AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
        if (onScrollListener2 != null) {
            onScrollListener2.onScroll(absListView, i, i2, i3);
        }
        AnonymousClass0fD.A0A(-1189708650, A03);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0fD.A03(1045445497);
        RefreshableListView refreshableListView = this.A00;
        AbsListView.OnScrollListener onScrollListener = refreshableListView.A02;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(absListView, i);
        }
        AbsListView.OnScrollListener onScrollListener2 = refreshableListView.A01;
        if (onScrollListener2 != null) {
            onScrollListener2.onScrollStateChanged(absListView, i);
        }
        AnonymousClass0fD.A0A(-1141588085, A03);
    }
}
