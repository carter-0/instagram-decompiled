package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.AgF  reason: case insensitive filesystem */
public final class C40640AgF implements C315616kD {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass7TI A01;

    public C40640AgF(AnonymousClass7TI r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public final void DaF(C294975nL r5, float f) {
        AnonymousClass7TI r3 = this.A01;
        RecyclerView recyclerView = r3.A04;
        if (recyclerView == null) {
            0qQ.A0F("messageRecyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        float f2 = (float) this.A00;
        0nA.A0X(recyclerView, (int) (f2 + ((((float) r3.A00) - f2) * f)));
    }
}
