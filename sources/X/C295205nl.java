package X;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.5nl  reason: invalid class name and case insensitive filesystem */
public final class C295205nl implements ValueAnimator.AnimatorUpdateListener {
    public static final C295215nm A04;
    public float A00;
    public ValueAnimator A01;
    public final Drawable A02;
    public final View A03;

    public final void A02(MotionEvent motionEvent) {
        C295215nm r3;
        Message message;
        long j;
        0qQ.A0B(motionEvent, 0);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                r3 = A04;
                if (r3.hasMessages(1, this)) {
                    r3.removeMessages(1, this);
                    A01(this);
                    message = Message.obtain(r3, 2, this);
                    j = 200;
                }
            } else if (actionMasked == 3) {
                C295215nm r1 = A04;
                if (r1.hasMessages(1, this)) {
                    r1.removeMessages(1, this);
                    return;
                }
            } else {
                return;
            }
            A00(this);
            return;
        }
        r3 = A04;
        r3.removeMessages(2, this);
        message = Message.obtain(r3, 1, this);
        j = 75;
        r3.sendMessageDelayed(message, j);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        0qQ.A0B(valueAnimator, 0);
        Object animatedValue = valueAnimator.getAnimatedValue();
        0qQ.A0C(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        this.A00 = ((Number) animatedValue).floatValue();
        View view = this.A03;
        if (view != null) {
            view.invalidate();
            return;
        }
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.invalidateSelf();
        }
    }

    public static final void A00(C295205nl r3) {
        ValueAnimator valueAnimator = r3.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f}).setDuration(400);
        duration.addUpdateListener(r3);
        duration.start();
        r3.A01 = duration;
    }

    public static final void A01(C295205nl r1) {
        ValueAnimator valueAnimator = r1.A01;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        r1.A00 = 1.0f;
        View view = r1.A03;
        if (view != null) {
            view.invalidate();
            return;
        }
        Drawable drawable = r1.A02;
        if (drawable != null) {
            drawable.invalidateSelf();
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.5nm, android.os.Handler] */
    static {
        Looper mainLooper = Looper.getMainLooper();
        0qQ.A07(mainLooper);
        A04 = new Handler(mainLooper);
    }

    public C295205nl(Drawable drawable) {
        this.A02 = drawable;
        this.A03 = null;
    }

    public C295205nl(View view) {
        this.A03 = view;
        this.A02 = null;
    }
}
