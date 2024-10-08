package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: X.6nC  reason: invalid class name and case insensitive filesystem */
public class C317396nC implements C317956o7, GestureDetector.OnGestureListener, C317406nD {
    public boolean A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public final GestureDetector A05;
    public final 2cs A06;
    public final 2cs A07;
    public final 2cp A08;
    public final C273424mY A09;

    private void A00() {
        float f = (float) this.A06.A09.A00;
        float f2 = (float) this.A07.A09.A00;
        this.A09.DAS(this, f, f2, (float) Math.sqrt((double) ((f * f) + (f2 * f2))), this.A00);
    }

    public final void A02(C71392co r5, float f, float f2, float f3, float f4) {
        2cs r2 = this.A06;
        r2.A07((double) f3);
        r2.A09(r5);
        r2.A06 = true;
        r2.A06((double) f);
        2cs r22 = this.A07;
        r22.A07((double) f4);
        r22.A09(r5);
        r22.A06 = true;
        r22.A06((double) f2);
    }

    public final void Cxs(2cp r1) {
    }

    public boolean DsV(MotionEvent motionEvent) {
        this.A03 = true;
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        this.A05.onTouchEvent(obtain);
        obtain.recycle();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        boolean z = this.A00;
        this.A00 = false;
        float f = (float) this.A06.A09.A00;
        float f2 = (float) this.A07.A09.A00;
        if (!this.A04 && z) {
            this.A09.DAZ(this, f, f2, (float) Math.sqrt((double) ((f * f) + (f2 * f2))), this.A01, this.A02);
        }
        this.A09.DvA(this);
        return true;
    }

    public final void destroy() {
        this.A04 = true;
        this.A06.A00();
        this.A07.A00();
    }

    public final boolean onDown(MotionEvent motionEvent) {
        this.A01 = 0.0f;
        this.A02 = 0.0f;
        this.A03 = false;
        this.A00 = false;
        return this.A09.DAA(this, motionEvent.getRawX(), motionEvent.getRawY());
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = this.A00;
        if (z) {
            2cs r5 = this.A06;
            r5.A05(r5.A09.A00 - ((double) f));
            2cs r52 = this.A07;
            r52.A05(r52.A09.A00 - ((double) f2));
            return true;
        } else if (!this.A03) {
            this.A03 = true;
            return A04();
        } else if (this.A04 || motionEvent == null || motionEvent2 == null) {
            return z;
        } else {
            float rawX = motionEvent.getRawX() - motionEvent2.getRawX();
            float rawY = motionEvent.getRawY() - motionEvent2.getRawY();
            boolean z2 = false;
            if (motionEvent2.getPointerCount() > 1) {
                z2 = true;
            }
            float sqrt = (float) Math.sqrt((double) ((rawX * rawX) + (rawY * rawY)));
            boolean DAg = this.A09.DAg(this, rawX, rawY, sqrt, sqrt / ((float) (motionEvent2.getEventTime() - motionEvent.getEventTime())), z2);
            this.A00 = DAg;
            return DAg;
        }
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final void A01(float f, float f2) {
        this.A06.A05((double) f);
        this.A07.A05((double) f2);
        A00();
    }

    public boolean A03() {
        return this.A00;
    }

    public final boolean A04() {
        2cs r1 = this.A06;
        if (r1.A0C() && r1.A0E(0.0d)) {
            2cs r12 = this.A07;
            if (!r12.A0C() || !r12.A0E(0.0d)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Cuk(2cp r2) {
        if (!this.A04) {
            A00();
        }
    }

    public final void EHq(float f, float f2) {
        this.A06.A05((double) f);
        this.A07.A05((double) f2);
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.A01 = f;
        this.A02 = f2;
        if (this.A00 || A04()) {
            return true;
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (!this.A04) {
            return this.A09.DlG(this, motionEvent.getX(), motionEvent.getY());
        }
        return false;
    }

    public C317396nC(Context context, C273424mY r4) {
        this.A09 = r4;
        2cp A002 = C61340me.A00();
        this.A08 = A002;
        A002.A04.add(this);
        this.A06 = A002.A02();
        this.A07 = A002.A02();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        this.A05 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public boolean DL9(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(motionEvent.getRawX(), motionEvent.getRawY());
        boolean onTouchEvent = this.A05.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent;
    }
}
