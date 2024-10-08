package X;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.Map;

/* renamed from: X.6Om  reason: invalid class name and case insensitive filesystem */
public final class C307016Om extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public PointF A00;
    public View A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C307786Rm A05;
    public final C276544tV A06;
    public final C276544tV A07;
    public final Map A08 = new 01r(2);

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        int i;
        if (motionEvent == null || motionEvent2 == null) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        boolean z = false;
        if (Math.abs(y) > Math.abs(x)) {
            z = true;
        }
        if (z) {
            i = 42;
            if (y > 0.0f) {
                i = 38;
            }
        } else {
            i = 40;
            if (x > 0.0f) {
                i = 41;
            }
        }
        C277014uI A012 = A01(i);
        if (A012 == null) {
            return false;
        }
        C276544tV r4 = this.A07;
        C308276Tl r1 = new C308276Tl();
        r1.A03(this.A06, 0);
        C307786Rm r3 = this.A05;
        r1.A03(r3, 1);
        C307886Rw.A03(r3, r4, new AnonymousClass6Tm(r1.A00), A012);
        return true;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        this.A02 = true;
        C277014uI A012 = A01(35);
        C277014uI A013 = A01(61);
        if (A012 != null) {
            C276544tV r3 = this.A07;
            C308276Tl r1 = new C308276Tl();
            r1.A01(this.A06);
            C307786Rm r2 = this.A05;
            r1.A03(r2, 1);
            C307886Rw.A03(r2, r3, new AnonymousClass6Tm(r1.A00), A012);
        }
        if (this.A01 != null && A013 != null) {
            C276544tV r4 = this.A07;
            C308276Tl r6 = new C308276Tl();
            r6.A01(this.A06);
            C307786Rm r32 = this.A05;
            r6.A03(r32, 1);
            r6.A03(r4, 2);
            r6.A03("detected", 3);
            r6.A03(Float.valueOf(motionEvent.getX() - this.A01.getX()), 4);
            r6.A03(Float.valueOf(motionEvent.getY() - this.A01.getY()), 5);
            C307886Rw.A03(r32, r4, new AnonymousClass6Tm(r6.A00), A013);
        }
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.A00 = null;
    }

    private boolean A00(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        C277014uI A012 = A01(43);
        C277014uI A013 = A01(54);
        C277014uI A014 = A01(62);
        if (A012 != null) {
            C276544tV r4 = this.A07;
            C308276Tl r1 = new C308276Tl();
            r1.A03(this.A06, 0);
            C307786Rm r2 = this.A05;
            r1.A03(r2, 1);
            C307886Rw.A03(r2, r4, new AnonymousClass6Tm(r1.A00), A012);
            z = true;
        } else {
            z = false;
        }
        if (A013 != null) {
            C276544tV r7 = this.A07;
            C308276Tl r10 = new C308276Tl();
            r10.A03(this.A06, 0);
            C307786Rm r42 = this.A05;
            r10.A03(r42, 1);
            r10.A03(Float.valueOf(motionEvent.getX() - this.A01.getX()), 2);
            r10.A03(Float.valueOf(motionEvent.getY() - this.A01.getY()), 3);
            C307886Rw.A03(r42, r7, new AnonymousClass6Tm(r10.A00), A013);
            z = true;
        }
        if (A014 == null) {
            return z;
        }
        C276544tV r43 = this.A07;
        C308276Tl r72 = new C308276Tl();
        r72.A03(this.A06, 0);
        C307786Rm r3 = this.A05;
        r72.A03(r3, 1);
        r72.A03(r43, 2);
        r72.A03(Float.valueOf(motionEvent.getX() - this.A01.getX()), 3);
        r72.A03(Float.valueOf(motionEvent.getY() - this.A01.getY()), 4);
        C307886Rw.A03(r3, r43, new AnonymousClass6Tm(r72.A00), A014);
        return true;
    }

    public final C277014uI A01(int i) {
        Map map = this.A08;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (C277014uI) map.get(valueOf);
        }
        C277014uI A0A = this.A07.A0A(i);
        map.put(valueOf, A0A);
        return A0A;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        if (this.A01 == null) {
            return false;
        }
        C277014uI A012 = A01(36);
        C277014uI A013 = A01(45);
        C277014uI A014 = A01(65);
        PointF A002 = C18396Vqw.A00(new PointF(motionEvent.getX(), motionEvent.getY()), this.A01);
        if (A012 != null) {
            C276544tV r4 = this.A07;
            C308276Tl r1 = new C308276Tl();
            r1.A03(this.A06, 0);
            C307786Rm r3 = this.A05;
            r1.A03(r3, 1);
            C307886Rw.A03(r3, r4, new AnonymousClass6Tm(r1.A00), A012);
            z = true;
        } else {
            z = false;
        }
        if (A013 != null) {
            C276544tV r42 = this.A07;
            C308276Tl r11 = new C308276Tl();
            r11.A03(this.A06, 0);
            C307786Rm r32 = this.A05;
            r11.A03(r32, 1);
            r11.A03(Float.valueOf((A002.x * 100.0f) / ((float) this.A01.getWidth())), 2);
            r11.A03(Float.valueOf((A002.y * 100.0f) / ((float) this.A01.getHeight())), 3);
            C307886Rw.A03(r32, r42, new AnonymousClass6Tm(r11.A00), A013);
            z = true;
        }
        if (A014 == null) {
            return z;
        }
        C276544tV r43 = this.A07;
        C308276Tl r33 = new C308276Tl();
        r33.A03(this.A06, 0);
        C307786Rm r2 = this.A05;
        r33.A03(r2, 1);
        r33.A03(r43, 2);
        r33.A03(Float.valueOf(A002.x), 3);
        r33.A03(Float.valueOf(A002.y), 4);
        C307886Rw.A03(r2, r43, new AnonymousClass6Tm(r33.A00), A014);
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (this.A01 == null) {
            return false;
        }
        C277014uI A012 = A01(49);
        if (A012 != null) {
            PointF A002 = C18396Vqw.A00(new PointF(motionEvent.getX(), motionEvent.getY()), this.A01);
            C276544tV r4 = this.A07;
            C308276Tl r7 = new C308276Tl();
            r7.A03(this.A06, 0);
            C307786Rm r3 = this.A05;
            r7.A03(r3, 1);
            r7.A03(Float.valueOf((A002.x * 100.0f) / ((float) this.A01.getWidth())), 2);
            r7.A03(Float.valueOf((A002.y * 100.0f) / ((float) this.A01.getHeight())), 3);
            C307886Rw.A03(r3, r4, new AnonymousClass6Tm(r7.A00), A012);
        }
        return true;
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C277014uI A012;
        if (this.A00 == null || this.A01 == null || (A012 = A01(44)) == null) {
            return false;
        }
        C276544tV r5 = this.A07;
        C308276Tl r7 = new C308276Tl();
        r7.A03(this.A06, 0);
        C307786Rm r4 = this.A05;
        r7.A03(r4, 1);
        r7.A03(Float.valueOf(scaleGestureDetector.getScaleFactor()), 2);
        r7.A03(Float.valueOf((this.A00.x * 100.0f) / ((float) this.A01.getWidth())), 3);
        r7.A03(Float.valueOf((this.A00.y * 100.0f) / ((float) this.A01.getHeight())), 4);
        C307886Rw.A03(r4, r5, new AnonymousClass6Tm(r7.A00), A012);
        return true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C277014uI A012;
        if (!(this.A01 == null || (A012 = A01(48)) == null)) {
            C276544tV r6 = this.A07;
            C308276Tl r7 = new C308276Tl();
            r7.A03(this.A06, 0);
            C307786Rm r5 = this.A05;
            r7.A03(r5, 1);
            r7.A03(Float.valueOf((f * 100.0f) / ((float) this.A01.getWidth())), 2);
            r7.A03(Float.valueOf((f2 * 100.0f) / ((float) this.A01.getHeight())), 3);
            Object A002 = C299275ur.A00(C307896Rx.A01(r5, A012, r6.A09), new AnonymousClass6Tm(r7.A00), A012);
            if (!(A002 instanceof Boolean)) {
                1Kn.A02("BloksFoaExtensionsGestureListener", "onScroll return value should return boolean (true if handled)");
            } else {
                boolean booleanValue = ((Boolean) A002).booleanValue();
                if (booleanValue) {
                    this.A04 = true;
                }
                this.A03 = true;
                return booleanValue;
            }
        }
        return false;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if ((A01(36) != null || A01(45) != null || A01(65) != null) && A00(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        if (A01(36) == null && A01(45) == null && A01(65) == null && A00(motionEvent)) {
            return true;
        }
        return false;
    }

    public C307016Om(C307786Rm r3, C276544tV r4, C276544tV r5) {
        this.A05 = r3;
        this.A07 = r4;
        this.A06 = r5;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        if (this.A01 == null) {
            return true;
        }
        this.A00 = C18396Vqw.A00(new PointF(focusX, focusY), this.A01);
        return true;
    }
}
