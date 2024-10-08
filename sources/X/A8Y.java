package X;

import androidx.recyclerview.widget.RecyclerView;

public final class A8Y {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public A8Y(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final void A00(int i) {
        AnonymousClass7TI A01 = AnonymousClass9H7.A01(this.A00);
        RecyclerView recyclerView = A01.A04;
        if (recyclerView != null) {
            if (recyclerView.canScrollVertically(1)) {
                i = A01.A00;
            }
            A01.A00 = i;
            RecyclerView recyclerView2 = A01.A04;
            if (recyclerView2 != null) {
                int paddingBottom = recyclerView2.getPaddingBottom();
                RecyclerView recyclerView3 = A01.A04;
                if (recyclerView3 != null) {
                    C294975nL A002 = C294975nL.A00(recyclerView3);
                    A002.A0G();
                    C294975nL A0F = A002.A0F(true);
                    A0F.A06 = new C40639AgE(A01, paddingBottom);
                    A0F.A0H();
                    AnonymousClass7UO r1 = A01.A0j.A0H;
                    r1.A00 = A01.A00;
                    AnonymousClass7UO.A01(r1);
                    return;
                }
            }
        }
        0qQ.A0F("messageRecyclerView");
        throw AnonymousClass00P.createAndThrow();
    }
}
