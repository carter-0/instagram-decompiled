package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Fsn  reason: case insensitive filesystem */
public final class C51355Fsn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ EEP A01;

    public C51355Fsn(EEP eep, int i) {
        this.A01 = eep;
        this.A00 = i;
    }

    public final void run() {
        EEP eep = this.A01;
        RecyclerView recyclerView = eep.A05;
        if (eep.A0m.isAdded() && recyclerView != null) {
            0nA.A0X(recyclerView, this.A00);
        }
    }
}
