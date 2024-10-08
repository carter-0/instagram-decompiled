package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: X.9b3  reason: invalid class name and case insensitive filesystem */
public final class C381029b3 extends C283285Gy {
    public String A00;
    public final GestureDetector A01;
    public final Context A02;
    public final Handler A03;
    public final A8A A04;
    public final AnonymousClass3LT A05;
    public final AnonymousClass0eK A06;

    public C381029b3(Context context, Handler handler, A8A a8a, AnonymousClass3LT r5, AnonymousClass0eK r6) {
        0qQ.A0B(r6, 4);
        this.A02 = context;
        this.A03 = handler;
        this.A04 = a8a;
        this.A06 = r6;
        this.A05 = r5;
        this.A01 = new GestureDetector(context, this, handler);
        Object obj = r6.get();
        0qQ.A07(obj);
        this.A00 = (String) obj;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z;
        C296495q9 r6;
        long j;
        0qQ.A0B(motionEvent2, 1);
        String str = this.A00;
        A8A a8a = this.A04;
        0qQ.A0B(a8a, 3);
        if (motionEvent == null || (!a8a.A0F && (str == null || !a8a.A0E.contains(str)))) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass3LT r4 = this.A05;
        if (Math.abs(f) > Math.abs(f2)) {
            if (f > 0.0f) {
                r6 = C296495q9.TOUCH_MOVED_RIGHT;
            } else {
                r6 = C296495q9.TOUCH_MOVED_LEFT;
            }
        } else if (f2 > 0.0f) {
            r6 = C296495q9.TOUCH_MOVED_DOWN;
        } else {
            r6 = C296495q9.TOUCH_MOVED_UP;
        }
        MotionEvent motionEvent3 = motionEvent2;
        if (a8a.A0G) {
            motionEvent3 = motionEvent;
        }
        if (motionEvent != null) {
            j = motionEvent2.getEventTime() - motionEvent.getDownTime();
        } else {
            j = 0;
        }
        boolean A012 = r4.A01(motionEvent3, r6, j, z);
        if (!a8a.A07) {
            return false;
        }
        return A012;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        this.A05.A01(motionEvent, C296495q9.LONG_TOUCHED, (long) ViewConfiguration.getLongPressTimeout(), true);
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        return this.A05.A01(motionEvent, C296495q9.TOUCH_UP, motionEvent.getEventTime() - motionEvent.getDownTime(), true);
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A00 = (String) this.A06.get();
        return false;
    }
}
