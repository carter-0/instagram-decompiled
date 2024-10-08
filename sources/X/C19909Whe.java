package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Whe  reason: case insensitive filesystem */
public final class C19909Whe implements Runnable {
    public final /* synthetic */ U7v A00;

    public C19909Whe(U7v u7v) {
        this.A00 = u7v;
    }

    public final void run() {
        RecyclerView recyclerView = this.A00.A02;
        recyclerView.focusableViewAvailable(recyclerView);
    }
}
