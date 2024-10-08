package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3AP  reason: invalid class name */
public final class AnonymousClass3AP implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass3AP(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.A00;
        if (recyclerView.A0R && !recyclerView.isLayoutRequested()) {
            if (!recyclerView.A0T) {
                recyclerView.requestLayout();
            } else if (recyclerView.A0W) {
                recyclerView.A0X = true;
            } else {
                recyclerView.A0c();
            }
        }
    }
}
