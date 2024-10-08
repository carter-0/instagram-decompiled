package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.Uiz  reason: case insensitive filesystem */
public final class C15816Uiz extends C232232tF {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        0qQ.A0B(r5, 1);
        EmptyStateView emptyStateView = (EmptyStateView) AnonymousClass7TF.A0F(r5.itemView, R.id.highlights_archive_empty_state_view);
        C320156rr r1 = C320156rr.EMPTY;
        emptyStateView.A0R(r1, R.drawable.empty_state_private);
        emptyStateView.A0T(r1, 2131963430);
        emptyStateView.A0S(r1, 2131963429);
        emptyStateView.A0H();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C249703kE(DbT.A0D(layoutInflater, viewGroup, R.layout.layout_highlights_archive_empty_state, false));
    }

    public final Class modelClass() {
        return C15800Uij.class;
    }
}
