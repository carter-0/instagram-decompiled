package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;

/* renamed from: X.AaP  reason: case insensitive filesystem */
public final class C40330AaP implements B3I {
    public final boolean Dfy(C363248jP r2) {
        A00("onRotate");
        return true;
    }

    public final boolean Dfz(C363248jP r2) {
        A00("onRotateBegin");
        return true;
    }

    public final void DsY(MotionEvent motionEvent, View view) {
        A00("onTouchEvent");
    }

    public final boolean onDown(MotionEvent motionEvent) {
        A00("onDown");
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        A00("onFling");
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        A00("onLongPress");
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        A00("onScale");
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        A00("onScaleBegin");
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        A00("onScaleEnd");
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        A00("onScroll");
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
        A00("onShowPress");
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        A00("onSingleTapUp");
        return true;
    }

    public static final void A00(String str) {
        0wj.A00("MEDIA_TRANSFORM_GESTURE_CONTROLLER", 817898841, false).ABQ("precapture function name", str);
    }
}
