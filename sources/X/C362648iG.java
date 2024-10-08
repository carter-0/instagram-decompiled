package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8iG  reason: invalid class name and case insensitive filesystem */
public final class C362648iG extends C249403jg {
    public final C252553pI A00;
    public final C362488hz A01;
    public final C362178hT A02;
    public final C62320sa A03;

    public C362648iG(C252553pI r1, C362488hz r2, C362178hT r3, C62320sa r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A032 = AnonymousClass0fD.A03(439153268);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        if (((AnonymousClass8XW) this.A02.A0R.getValue()).A02.A02 == -1) {
            if (this.A01.A00() - C240113Jq.A02(this.A00) < 10) {
                this.A03.invoke();
            }
        }
        AnonymousClass0fD.A0A(-655313297, A032);
    }
}
