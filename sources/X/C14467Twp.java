package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Twp  reason: case insensitive filesystem */
public final class C14467Twp {
    public final /* synthetic */ C14138TqY A00;

    public C14467Twp(C14138TqY tqY) {
        this.A00 = tqY;
    }

    public final void A00() {
        int i;
        C252553pI r1;
        C252553pI r0;
        C14138TqY tqY = this.A00;
        RecyclerView recyclerView = tqY.A0F().A00;
        if (recyclerView == null || (r0 = recyclerView.A0D) == null) {
            i = 0;
        } else {
            i = ((LinearLayoutManager) r0).A1c();
        }
        C14200Trf trf = tqY.A07;
        if (trf == null) {
            0qQ.A0F("dataSource");
            throw AnonymousClass00P.createAndThrow();
        }
        C14488TxA.A00(trf, tqY);
        RecyclerView recyclerView2 = tqY.A0F().A00;
        if (recyclerView2 != null && (r1 = recyclerView2.A0D) != null) {
            ((LinearLayoutManager) r1).A1p(i, 0);
        }
    }
}
