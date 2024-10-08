package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7d3  reason: invalid class name and case insensitive filesystem */
public final class C335497d3 extends C249403jg {
    public final /* synthetic */ C334977cB A00;

    public C335497d3(C334977cB r1) {
        this.A00 = r1;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(-2002729372);
        0qQ.A0B(recyclerView, 0);
        super.onScrolled(recyclerView, i, i2);
        this.A00.A02.A00 = new AnonymousClass9I8(!recyclerView.canScrollVertically(-1), !recyclerView.canScrollVertically(1), 2);
        AnonymousClass0fD.A0A(-1382685897, A03);
    }
}
