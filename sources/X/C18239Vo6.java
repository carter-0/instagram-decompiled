package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Vo6  reason: case insensitive filesystem */
public abstract class C18239Vo6 {
    public static final void A00(RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager;
        int A1a;
        int A1b;
        C252553pI r1 = recyclerView.A0D;
        if ((r1 instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) r1) != null && (A1a = linearLayoutManager.A1a()) <= (A1b = linearLayoutManager.A1b())) {
            while (true) {
                C249703kE A0W = recyclerView.A0W(A1a);
                if (A0W != null) {
                    A0W.itemView.setSelected(false);
                }
                if (A1a != A1b) {
                    A1a++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void A01(RecyclerView recyclerView, int i) {
        recyclerView.A0p(i);
        C249703kE A0W = recyclerView.A0W(i - 1);
        if (A0W != null) {
            A0W.itemView.setSelected(false);
        }
        C249703kE A0W2 = recyclerView.A0W(i + 1);
        if (A0W2 != null) {
            A0W2.itemView.setSelected(false);
        }
        C249703kE A0W3 = recyclerView.A0W(i);
        if (A0W3 != null) {
            A0W3.itemView.setSelected(true);
        }
    }
}
