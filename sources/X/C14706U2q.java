package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.ui.widget.singlescrolllistview.SingleScrollTopLockingListView;

/* renamed from: X.U2q  reason: case insensitive filesystem */
public final class C14706U2q extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ SingleScrollTopLockingListView A00;

    public C14706U2q(SingleScrollTopLockingListView singleScrollTopLockingListView) {
        this.A00 = singleScrollTopLockingListView;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        throw new NullPointerException("getCurrentMediaHeaderPosition");
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float abs = Math.abs(f2);
        SingleScrollTopLockingListView singleScrollTopLockingListView = this.A00;
        if (abs <= singleScrollTopLockingListView.A02) {
            return false;
        }
        if (f2 < 0.0f) {
            singleScrollTopLockingListView.A00();
            throw AnonymousClass00P.createAndThrow();
        }
        throw new NullPointerException("getPreviousMediaId");
    }
}
