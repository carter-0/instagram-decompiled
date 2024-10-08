package X;

import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.facebook.smartcapture.ui.PhotoRequirementsView;

/* renamed from: X.9Xn  reason: invalid class name and case insensitive filesystem */
public final class C380319Xn extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;

    public C380319Xn(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onContextClick(MotionEvent motionEvent) {
        if (2 - this.A00 != 0) {
            return super.onContextClick(motionEvent);
        }
        return true;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        switch (this.A00) {
            case 0:
                A3B a3b = ((C380729Zh) this.A01).A06;
                if (a3b == null) {
                    return false;
                }
                motionEvent.getX();
                motionEvent.getY();
                C345707tx r1 = a3b.A00;
                if (!r1.A0O) {
                    return false;
                }
                r1.EzJ();
                return true;
            case 2:
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
            case 2:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        if (2 - this.A00 != 0) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        0qQ.A0B(motionEvent2, 1);
        float y = motionEvent2.getY();
        if (motionEvent != null) {
            f3 = motionEvent.getY();
        } else {
            f3 = 0.0f;
        }
        float f4 = y - f3;
        if (Math.abs(f4) <= 100.0f || Math.abs(f2) <= 100.0f) {
            return false;
        }
        if (f4 <= 0.0f) {
            return true;
        }
        PhotoRequirementsView photoRequirementsView = (PhotoRequirementsView) this.A01;
        Q9N q9n = photoRequirementsView.A01;
        if (q9n != null) {
            q9n.A00();
            photoRequirementsView.A01 = null;
        }
        photoRequirementsView.A02 = false;
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (this.A00 != 0) {
            return true;
        }
        A3A a3a = ((C380729Zh) this.A01).A05;
        if (a3a == null) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C345707tx r6 = a3a.A00;
        C342687p0 A0A = r6.A0A();
        if (A0A == null) {
            return false;
        }
        float[] fArr = {(float) x, (float) y};
        C340607lX r2 = r6.A0e;
        r2.Clf(fArr);
        if (!r6.A0R) {
            return true;
        }
        if (!AnonymousClass7TG.A1V(C342687p0.A0V, A0A) && !AnonymousClass7TG.A1V(C342687p0.A0W, A0A)) {
            return true;
        }
        r2.AW6((int) fArr[0], (int) fArr[1]);
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                C380369Xs r6 = (C380369Xs) this.A01;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!r6.A0F) {
                    return true;
                }
                C340607lX r5 = r6.A0U;
                if (!r5.isConnected()) {
                    return true;
                }
                float[] fArr = {x, y};
                if (!r5.Clf(fArr)) {
                    Log.e("CameraPreviewView", "mapViewPointToDriverPoint called before initialiseViewToDriverMatrix");
                    return true;
                }
                int i = (int) fArr[0];
                int i2 = (int) fArr[1];
                if (r6.A0I) {
                    r5.EwE(new C382569du(r6, 1), i, i2);
                }
                if (!r6.A0H) {
                    return true;
                }
                r5.AW6(i, i2);
                return true;
            case 2:
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
