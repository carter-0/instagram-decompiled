package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.U4l  reason: case insensitive filesystem */
public final class C14722U4l extends FrameLayout implements C20935X5d {
    public final CollapsibleActionView A00;

    public final void onActionViewCollapsed() {
        this.A00.onActionViewCollapsed();
    }

    public final void onActionViewExpanded() {
        this.A00.onActionViewExpanded();
    }

    public C14722U4l(View view) {
        super(view.getContext());
        this.A00 = (CollapsibleActionView) view;
        addView(view);
    }
}
