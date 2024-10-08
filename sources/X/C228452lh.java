package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2lh  reason: invalid class name and case insensitive filesystem */
public final class C228452lh extends C249403jg {
    public boolean A00 = false;
    public final /* synthetic */ C228432lf A01;

    public C228452lh(C228432lf r2) {
        this.A01 = r2;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(-930971533);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A06();
        }
        AnonymousClass0fD.A0A(-740887047, A03);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(-1275803871);
        if (!(i == 0 && i2 == 0)) {
            this.A00 = true;
        }
        AnonymousClass0fD.A0A(1241226584, A03);
    }
}
