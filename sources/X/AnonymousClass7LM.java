package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7LM  reason: invalid class name */
public final class AnonymousClass7LM implements C61370mm {
    public RecyclerView A00;
    public final 2Rw A01;

    public AnonymousClass7LM(2Rw r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final void Cxw() {
    }

    public final void D1N(int i, int i2) {
        A00(this, new C377349Lm(this, i, i2, 0));
    }

    public final void DC7() {
    }

    public final void DKr(int i, int i2) {
        A00(this, new C377349Lm(this, i, i2, 1));
    }

    public final void DSU(int i, int i2) {
        A00(this, new C377349Lm(this, i, i2, 2));
    }

    public final void Ddf(int i, int i2) {
        A00(this, new C377349Lm(this, i, i2, 3));
    }

    public static final void A00(AnonymousClass7LM r3, C62320sa r4) {
        RecyclerView recyclerView = r3.A00;
        if (recyclerView == null || !recyclerView.A1E() || !recyclerView.post(new C41170ApU(recyclerView, r3, r4))) {
            r4.invoke();
        }
    }
}
