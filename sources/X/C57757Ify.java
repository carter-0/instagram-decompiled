package X;

import android.widget.AbsListView;

/* renamed from: X.Ify  reason: case insensitive filesystem */
public final class C57757Ify implements Runnable {
    public final /* synthetic */ AbsListView A00;

    public C57757Ify(AbsListView absListView) {
        this.A00 = absListView;
    }

    public final void run() {
        this.A00.smoothScrollToPositionFromTop(5, 0);
    }
}
