package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.UAo  reason: case insensitive filesystem */
public final class C14814UAo extends C249403jg {
    public final /* synthetic */ VUP A00;

    public C14814UAo(VUP vup) {
        this.A00 = vup;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03 = AnonymousClass0fD.A03(-1729710386);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 2 || i == 1) {
            VUP vup = this.A00;
            RecyclerView recyclerView2 = vup.A00;
            recyclerView2.A16(this);
            recyclerView2.A0E = null;
            vup.A01.A07(recyclerView2);
        }
        AnonymousClass0fD.A0A(-148423340, A03);
    }
}
