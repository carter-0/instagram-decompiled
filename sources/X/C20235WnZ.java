package X;

import android.widget.AbsListView;

/* renamed from: X.WnZ  reason: case insensitive filesystem */
public final class C20235WnZ implements Runnable {
    public final /* synthetic */ AbsListView A00;
    public final /* synthetic */ C249383je A01;

    public C20235WnZ(AbsListView absListView, C249383je r2) {
        this.A01 = r2;
        this.A00 = absListView;
    }

    public final void run() {
        C249383je r2 = this.A01;
        r2.onScrollStateChanged(this.A00, 0);
        r2.mScrollIdleDebouncer = null;
    }
}
