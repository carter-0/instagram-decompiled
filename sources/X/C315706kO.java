package X;

import android.view.MotionEvent;
import com.instagram.reels.viewer.common.ReelViewGroup;

/* renamed from: X.6kO  reason: invalid class name and case insensitive filesystem */
public final class C315706kO implements C317516nO {
    public final /* synthetic */ ReelViewGroup A00;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        ReelViewGroup reelViewGroup = this.A00;
        AnonymousClass6YS r1 = reelViewGroup.A00;
        if (r1 != null) {
            r1.A00 = MotionEvent.obtain(motionEvent);
        }
        reelViewGroup.getOrchestratorListener().DA9(motionEvent.getX());
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        MotionEvent motionEvent3;
        0qQ.A0B(motionEvent2, 1);
        ReelViewGroup reelViewGroup = this.A00;
        AnonymousClass6YS r1 = reelViewGroup.A00;
        if (!(r1 == null || (motionEvent3 = r1.A00) == null)) {
            motionEvent3.recycle();
            r1.A00 = null;
        }
        return reelViewGroup.getSwipeController().onFling(motionEvent, motionEvent2, f, f2);
    }

    public final void onLongPress(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        0qQ.A0B(motionEvent, 0);
        ReelViewGroup reelViewGroup = this.A00;
        AnonymousClass6YS r1 = reelViewGroup.A00;
        if (!(r1 == null || (motionEvent2 = r1.A00) == null)) {
            motionEvent2.recycle();
            r1.A00 = null;
        }
        reelViewGroup.getOrchestratorListener().DP2(motionEvent.getX(), motionEvent.getY());
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00.getOrchestratorListener().Dqb(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public C315706kO(ReelViewGroup reelViewGroup) {
        this.A00 = reelViewGroup;
    }
}
