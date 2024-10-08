package X;

import android.view.MotionEvent;

/* renamed from: X.6km  reason: invalid class name and case insensitive filesystem */
public final class C315906km {
    public float A00 = 90.0f;
    public int A01 = 8;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public float A05;
    public float A06;
    public int A07;

    public final void A00(MotionEvent motionEvent) {
        int i;
        if ((!this.A04) && motionEvent.getAction() != 0) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setAction(0);
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.A07);
                    if (findPointerIndex >= 0 && findPointerIndex < motionEvent.getPointerCount()) {
                        float x = motionEvent.getX(findPointerIndex);
                        float y = motionEvent.getY(findPointerIndex);
                        float f = this.A05 - x;
                        float f2 = this.A06 - y;
                        boolean z = false;
                        if (Math.sqrt((double) ((f * f) + (f2 * f2))) > ((double) this.A01)) {
                            z = true;
                        }
                        double degrees = Math.toDegrees(Math.atan((double) Math.abs(f2 / f)));
                        if (!z) {
                            return;
                        }
                        if (degrees < ((double) (this.A00 / 2.0f))) {
                            this.A02 = true;
                            return;
                        } else {
                            this.A03 = true;
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (action != 3) {
                    if (action == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.A07) {
                            int i2 = 0;
                            if (actionIndex == 0) {
                                i2 = 1;
                            }
                            this.A05 = motionEvent.getX(i2);
                            this.A06 = motionEvent.getY(i2);
                            this.A07 = motionEvent.getPointerId(i2);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.A04 = false;
            i = -1;
        } else {
            this.A04 = true;
            this.A05 = motionEvent.getX();
            this.A06 = motionEvent.getY();
            i = motionEvent.getPointerId(0);
        }
        this.A07 = i;
        this.A02 = false;
        this.A03 = false;
    }
}
