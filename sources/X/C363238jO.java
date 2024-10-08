package X;

import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;

/* renamed from: X.8jO  reason: invalid class name and case insensitive filesystem */
public final class C363238jO extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ InteractiveDrawableContainer A00;

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        for (AnonymousClass88G DlE : this.A00.A0t) {
            DlE.DlE((Drawable) null, motionEvent.getX(), motionEvent.getY(), motionEvent.getX(), motionEvent.getY(), -1);
        }
        return true;
    }

    public C363238jO(InteractiveDrawableContainer interactiveDrawableContainer) {
        this.A00 = interactiveDrawableContainer;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return !this.A00.A0O;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        for (AnonymousClass88G DPH : this.A00.A0t) {
            DPH.DPH();
        }
    }
}
