package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.ApU  reason: case insensitive filesystem */
public final class C41170ApU implements Runnable {
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ AnonymousClass7LM A01;
    public final /* synthetic */ C62320sa A02;

    public C41170ApU(RecyclerView recyclerView, AnonymousClass7LM r2, C62320sa r3) {
        this.A00 = recyclerView;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void run() {
        if (this.A00.getContext() != null) {
            AnonymousClass7LM.A00(this.A01, this.A02);
        }
    }
}
