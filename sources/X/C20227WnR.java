package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.WnR  reason: case insensitive filesystem */
public final class C20227WnR implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C15339Uap A01;

    public C20227WnR(C15339Uap uap, int i) {
        this.A01 = uap;
        this.A00 = i;
    }

    public final void run() {
        C252553pI r1;
        C15339Uap uap = this.A01;
        AnonymousClass0eM r2 = uap.A04;
        ((AnonymousClass52T) r2.getValue()).A00 = this.A00;
        RecyclerView recyclerView = uap.A00;
        if (recyclerView != null && (r1 = recyclerView.A0D) != null) {
            r1.A0t((AnonymousClass52T) r2.getValue());
        }
    }
}
