package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jc6  reason: case insensitive filesystem */
public final class C59942Jc6 extends C355538Qj {
    public final MS3 A00;

    public final boolean isItemViewSwipeEnabled() {
        return false;
    }

    public final boolean isLongPressDragEnabled() {
        return false;
    }

    public final boolean onMove(RecyclerView recyclerView, C249703kE r6, C249703kE r7) {
        AnonymousClass7TF.A1B(r6, 1, r7);
        if (r6.mItemViewType != r7.mItemViewType) {
            return false;
        }
        this.A00.DM9(r6.getBindingAdapterPosition(), r7.getBindingAdapterPosition());
        return true;
    }

    public final void onSwiped(C249703kE r1, int i) {
    }

    public final int getMovementFlags(RecyclerView recyclerView, C249703kE r4) {
        return C355538Qj.makeMovementFlags(15, 0);
    }

    public final void onSelectedChanged(C249703kE r3, int i) {
        if (r3 != null) {
            r3.itemView.setAlpha(0.8f);
            r3.itemView.setScaleX(1.1f);
            r3.itemView.setScaleY(1.1f);
        }
    }

    public C59942Jc6(MS3 ms3) {
        this.A00 = ms3;
    }

    public final void clearView(RecyclerView recyclerView, C249703kE r4) {
        AnonymousClass7TG.A1N(recyclerView, r4);
        r4.itemView.setAlpha(1.0f);
        r4.itemView.setScaleX(1.0f);
        r4.itemView.setScaleY(1.0f);
        super.clearView(recyclerView, r4);
    }
}
