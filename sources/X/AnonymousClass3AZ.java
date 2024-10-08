package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.3AZ  reason: invalid class name */
public final class AnonymousClass3AZ implements Runnable {
    public final /* synthetic */ RecyclerView A00;

    public AnonymousClass3AZ(RecyclerView recyclerView) {
        this.A00 = recyclerView;
    }

    public final void run() {
        RecyclerView recyclerView = this.A00;
        AnonymousClass3AS r0 = recyclerView.A0C;
        if (r0 != null) {
            r0.A0J();
        }
        recyclerView.A0Y = false;
    }
}
