package X;

import android.animation.Animator;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.U2p  reason: case insensitive filesystem */
public final class C14705U2p extends GestureDetector.SimpleOnGestureListener {
    public final C14720U4e A00;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14720U4e u4e = this.A00;
        if (u4e.getContext() == null) {
            return false;
        }
        float translationY = u4e.getTranslationY();
        if (f2 > 0.0f) {
            u4e.A03((int) Math.abs(((((float) u4e.getHeight()) - translationY) / f2) * 1000.0f));
        } else {
            u4e.A04((Animator.AnimatorListener) null, (int) Math.abs((translationY / (-f2)) * 1000.0f));
        }
        u4e.A08 = true;
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C14720U4e u4e = this.A00;
        if (u4e.getTranslationY() <= 0.0f && f2 > 0.0f) {
            return false;
        }
        u4e.A08 = false;
        return true;
    }

    public C14705U2p(C14720U4e u4e) {
        this.A00 = u4e;
    }
}
