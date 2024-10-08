package X;

import android.os.SystemClock;
import android.view.View;
import instagram.features.stories.fragment.ReelViewerFragment;

/* renamed from: X.M7w  reason: case insensitive filesystem */
public final class C66011M7w implements Runnable {
    public final /* synthetic */ C315496jz A00;
    public final /* synthetic */ Integer A01;

    public C66011M7w(C315496jz r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public final void run() {
        C315496jz r3 = this.A00;
        Integer num = this.A01;
        View view = r3.A09;
        if (view != null) {
            view.setVisibility(8);
            r3.A0F = AnonymousClass05K.A00;
            AnonymousClass6Z4 r2 = r3.A0E;
            if (r2 != null) {
                double elapsedRealtime = ((double) (SystemClock.elapsedRealtime() - r3.A06)) / 1000.0d;
                0qQ.A0A(r2);
                0qQ.A0B(num, 1);
                AnonymousClass6Z0 r22 = r2.A00;
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) r22.A0U;
                ((C313046fl) reelViewerFragment.mViewPager).A04.setDraggingEnabled(true);
                r22.DsB();
                C314966j8 r23 = r22.A05;
                if (r23 == null) {
                    0qQ.A0F("reelViewerNuxLogger");
                    throw AnonymousClass00P.createAndThrow();
                }
                C250973mM r1 = reelViewerFragment.A0a;
                if (r1 != null) {
                    r23.A00(r1, C305726Jh.A00(num), elapsedRealtime);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
