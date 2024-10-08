package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Callable;

/* renamed from: X.6KI  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6KI implements Callable {
    public final /* synthetic */ C305916Kb A00;
    public final /* synthetic */ AnonymousClass6UW A01;

    public /* synthetic */ AnonymousClass6KI(C305916Kb r1, AnonymousClass6UW r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Object call() {
        AnonymousClass6UW r2 = this.A01;
        this.A00.AFC();
        RecyclerView recyclerView = r2.A03;
        if (recyclerView != null) {
            AnonymousClass3AS r0 = r2.A01;
            if (r0 != null) {
                recyclerView.setItemAnimator(r0);
            }
        } else {
            0wb.A03("TrayReelViewerInteractiveHideAnimationCoordinator#prepareBackingViewsForAnimation", "mTrayRecyclerView is null when predraw callable is triggered.");
        }
        return true;
    }
}
