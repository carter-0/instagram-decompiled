package X;

import android.view.View;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.Ii3  reason: case insensitive filesystem */
public final /* synthetic */ class C57886Ii3 implements Runnable {
    public final /* synthetic */ C250973mM A00;
    public final /* synthetic */ ReelViewerFragment A01;

    public /* synthetic */ C57886Ii3(C250973mM r1, ReelViewerFragment reelViewerFragment) {
        this.A01 = reelViewerFragment;
        this.A00 = r1;
    }

    public final void run() {
        ReelViewerFragment reelViewerFragment = this.A01;
        C250973mM r3 = this.A00;
        C255773uh Au5 = reelViewerFragment.Au5();
        if (Au5 != null) {
            reelViewerFragment.A3G.DRI((View) null, Au5, r3);
        }
    }
}
