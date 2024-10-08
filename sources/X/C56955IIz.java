package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.IIz  reason: case insensitive filesystem */
public final class C56955IIz implements AnonymousClass2WT {
    public final /* synthetic */ C244463bE A00;

    public C56955IIz(C244463bE r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object AB5(Context context) {
        0qQ.A0B(context, 0);
        EmptyStateView emptyStateView = new EmptyStateView(context);
        emptyStateView.setId(R.id.comment_empty_state_view);
        emptyStateView.A0M(AnonymousClass7TF.A03(C243803a8.A00(this.A00), R.attr.igds_color_elevated_background));
        return emptyStateView;
    }
}
