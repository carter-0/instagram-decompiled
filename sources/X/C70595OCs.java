package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;

/* renamed from: X.OCs  reason: case insensitive filesystem */
public final class C70595OCs {
    public final View A00;
    public final IgdsEmptyState A01;

    public C70595OCs(View view) {
        this.A00 = view.requireViewById(R.id.row_divider);
        this.A01 = (IgdsEmptyState) view.requireViewById(R.id.empty_state_headline_component);
    }
}
