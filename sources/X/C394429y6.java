package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9y6  reason: invalid class name and case insensitive filesystem */
public abstract class C394429y6 {
    public static final int A00(RecyclerView recyclerView) {
        2Rw r0 = recyclerView.A0A;
        if (r0 == null) {
            return 0;
        }
        int itemCount = r0.getItemCount();
        return AnonymousClass7TE.A05((float) (itemCount - 1), ((float) recyclerView.computeHorizontalScrollOffset()) / ((float) (recyclerView.computeHorizontalScrollRange() - recyclerView.computeHorizontalScrollExtent())));
    }
}
