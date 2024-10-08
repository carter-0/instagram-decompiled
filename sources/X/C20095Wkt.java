package X;

import android.widget.AbsListView;

/* renamed from: X.Wkt  reason: case insensitive filesystem */
public final class C20095Wkt implements Runnable {
    public final /* synthetic */ AbsListView A00;

    public C20095Wkt(AbsListView absListView) {
        this.A00 = absListView;
    }

    public final void run() {
        AbsListView absListView = this.A00;
        absListView.smoothScrollBy(0, 0);
        absListView.setSelection(0);
    }
}
