package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Anv  reason: case insensitive filesystem */
public final class C41073Anv implements Runnable {
    public final /* synthetic */ 2Rw A00;
    public final /* synthetic */ RecyclerView A01;

    public C41073Anv(2Rw r1, RecyclerView recyclerView) {
        this.A01 = recyclerView;
        this.A00 = r1;
    }

    public final void run() {
        this.A01.setAdapter(this.A00);
    }
}
