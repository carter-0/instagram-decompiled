package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.54P  reason: invalid class name */
public final class AnonymousClass54P implements GestureDetector.OnGestureListener {
    public boolean A00;
    public float A01;
    public float A02;
    public float A03;
    public final Handler A04 = new Handler(Looper.getMainLooper());
    public final GestureDetector A05;
    public final C255913uv A06;
    public final Runnable A07 = new AnonymousClass54Q(this);
    public final float A08;
    public final C277204uf A09;

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A00) {
            float f3 = this.A01;
            float f4 = this.A02;
            float rawX = motionEvent2.getRawX() - f3;
            float rawY = motionEvent2.getRawY() - f4;
            if (((float) Math.sqrt((double) ((rawX * rawX) + (rawY * rawY)))) > this.A08) {
                this.A04.removeCallbacks(this.A07);
            }
        } else {
            if (this.A03 == -1.0f) {
                this.A03 = motionEvent2.getRawX();
            }
            float rawX2 = motionEvent2.getRawX();
            float f5 = rawX2 - this.A03;
            C255913uv r3 = this.A06;
            if (Math.abs(f5) > ((float) r3.getWidth()) / ((float) Math.min(r3.A05, r3.A06))) {
                this.A03 = rawX2;
                int i = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
                C277204uf r0 = this.A09;
                if (i > 0) {
                    r0.DUN();
                    return true;
                }
                r0.DZQ();
                return true;
            }
        }
        return true;
    }

    public AnonymousClass54P(C255913uv r4, C277204uf r5) {
        this.A06 = r4;
        this.A09 = r5;
        Context context = r4.getContext();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A08 = 0nA.A04(context, 5);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = motionEvent.getRawX();
        this.A02 = motionEvent.getRawY();
        this.A03 = -1.0f;
        Handler handler = this.A04;
        Runnable runnable = this.A07;
        handler.removeCallbacks(runnable);
        handler.postDelayed(runnable, 200);
        return true;
    }
}
