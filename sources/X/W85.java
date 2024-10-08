package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;

public final class W85 implements GestureDetector.OnGestureListener {
    public static final int A05 = (ViewConfiguration.getTapTimeout() * 2);
    public MotionEvent A00;
    public boolean A01;
    public final VNE A02;
    public final C14685U1k A03;
    public final GestureDetector A04;

    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = true;
        MotionEvent motionEvent2 = this.A00;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.A00 = MotionEvent.obtain(motionEvent);
        C14685U1k u1k = this.A03;
        u1k.removeMessages(0);
        u1k.sendEmptyMessageAtTime(0, motionEvent.getDownTime() + ((long) A05));
        C15695Uh1 uh1 = this.A02.A00;
        uh1.A0A = AnonymousClass05K.A01;
        uh1.A02.setVisibility(4);
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final void A00(MotionEvent motionEvent) {
        this.A04.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            this.A03.removeMessages(0);
            if (!this.A01) {
                C15695Uh1 uh1 = this.A02.A00;
                if (uh1.A0A == AnonymousClass05K.A0C) {
                    C15695Uh1.A02(uh1);
                } else {
                    uh1.A08.DsV(motionEvent);
                }
            }
        } else if (actionMasked == 3) {
            this.A03.removeCallbacksAndMessages((Object) null);
            this.A01 = false;
            C15695Uh1 uh12 = this.A02.A00;
            uh12.A0A = AnonymousClass05K.A00;
            uh12.A0F.A04();
        }
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C15695Uh1 uh1 = this.A02.A00;
        if (uh1.A0A != AnonymousClass05K.A0N) {
            return false;
        }
        uh1.A08.onScroll(motionEvent, motionEvent2, f, f2);
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.os.Handler, X.U1k] */
    public W85(Context context, VNE vne) {
        this.A02 = vne;
        WeakReference weakReference = new WeakReference(this);
        ? handler = new Handler();
        handler.A00 = weakReference;
        this.A03 = handler;
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A04 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }
}
