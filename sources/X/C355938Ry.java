package X;

import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.ui.widget.shutterbutton.ShutterButton;

/* renamed from: X.8Ry  reason: invalid class name and case insensitive filesystem */
public final class C355938Ry extends C283285Gy implements ScaleGestureDetector.OnScaleGestureListener {
    public boolean A00;
    public final /* synthetic */ C355898Ru A01;

    public final boolean onDown(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A00 = false;
        return super.onDown(motionEvent);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = true;
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = true;
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        if (this.A00) {
            return false;
        }
        C355898Ru r3 = this.A01;
        C352888Fl r2 = r3.A0K;
        ShutterButton shutterButton = r2.A1I;
        if (!shutterButton.A0i.A0A) {
            return false;
        }
        float f3 = r3.A00;
        float f4 = r3.A01;
        AnonymousClass8GT r5 = r2.A0o;
        if (!r2.A1M || r5 == null) {
            return true;
        }
        float zoomDragAvailableHeight = shutterButton.getZoomDragAvailableHeight();
        if (r5.A09.get() != AnonymousClass8GV.NORMAL) {
            return true;
        }
        CameraAREffect cameraAREffect = r5.A07.A05.A09;
        if ((cameraAREffect != null && cameraAREffect.A0Z.get("worldTracker") != null) || r5.A03.contains((int) f3, (int) f4)) {
            return true;
        }
        float A02 = C229632nm.A02(((f4 - motionEvent2.getY()) - ((float) r5.A05.getScaledTouchSlop())) / zoomDragAvailableHeight, -1.0f, 1.0f);
        float f5 = A02 * A02 * (3.0f - (2.0f * A02));
        int i = 1;
        if (A02 < 0.0f) {
            i = -1;
        }
        float f6 = f5 * ((float) i);
        if (f6 < 0.0f) {
            f6 = C229632nm.A02(r5.A01 + f6, 0.0f, 100.0f);
        }
        r5.DAk(f6);
        return true;
    }

    public C355938Ry(C355898Ru r1) {
        this.A01 = r1;
    }
}
