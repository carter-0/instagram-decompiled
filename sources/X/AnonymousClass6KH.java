package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6KH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6KH implements Runnable {
    public final /* synthetic */ C305916Kb A00;
    public final /* synthetic */ AnonymousClass6UW A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ AnonymousClass6KH(C305916Kb r1, AnonymousClass6UW r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass6UW r2 = this.A01;
        boolean z = this.A02;
        C305916Kb r0 = this.A00;
        if (z) {
            r0.AFC();
            RecyclerView recyclerView = r2.A03;
            if (recyclerView != null) {
                AnonymousClass3AS r02 = r2.A01;
                if (r02 != null) {
                    recyclerView.setItemAnimator(r02);
                    return;
                }
                return;
            }
            0wb.A03("TrayReelViewerInteractiveHideAnimationCoordinator#prepareBackingViewsForAnimation", "mTrayRecyclerView is null when timeout callable is triggered.");
        }
    }
}
