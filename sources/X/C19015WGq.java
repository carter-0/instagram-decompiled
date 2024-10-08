package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.WGq  reason: case insensitive filesystem */
public final class C19015WGq implements C317516nO {
    public float A00;
    public float A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final GestureDetector A05;
    public final List A06 = new ArrayList();
    public final List A07 = new ArrayList();
    public final int A08;

    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A02 = false;
        this.A04 = false;
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        0qQ.A0B(motionEvent2, 1);
        int i = 0;
        if (motionEvent != null) {
            float rawY = motionEvent2.getRawY() - motionEvent.getRawY();
            if (this.A04) {
                this.A00 = rawY;
                for (X7j DAR : this.A06) {
                    DAR.DAR(this, rawY);
                }
                return true;
            } else if (this.A02) {
                if (!this.A03) {
                    float f3 = (float) this.A08;
                    float abs = Math.abs(rawY);
                    if (f3 < abs && rawY > 0.0f) {
                        i = 2;
                    } else if (f3 < abs && rawY < 0.0f) {
                        i = 1;
                    }
                    for (X7j x7j : this.A07) {
                        if (x7j.DAf(this, rawY, i)) {
                            this.A04 = true;
                            this.A06.add(x7j);
                        }
                    }
                }
                return this.A04;
            }
        }
        this.A02 = true;
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01 = f2;
        return this.A04;
    }

    public C19015WGq(Context context) {
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A08 = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }
}
