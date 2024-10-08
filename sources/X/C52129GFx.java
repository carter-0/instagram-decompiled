package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.GFx  reason: case insensitive filesystem */
public class C52129GFx extends GestureDetector.SimpleOnGestureListener implements ScaleGestureDetector.OnScaleGestureListener {
    public View A00 = null;
    public Integer A01 = AnonymousClass05K.A0C;
    public Runnable A02;
    public 0eP A03;
    public final C267324bN A04;
    public final JSx A05;
    public final JRC A06;
    public final Handler A07;
    public final Handler A08;
    public final GestureDetector A09;
    public final ScaleGestureDetector A0A;
    public final C14065TpD A0B;
    public final UserSession A0C;
    public final HnY A0D;

    public C52129GFx(Context context, C14065TpD tpD, C267324bN r7, JSx jSx, UserSession userSession, JRC jrc, HnY hnY) {
        0qQ.A0B(userSession, 2);
        0qQ.A0B(jrc, 3);
        0qQ.A0B(r7, 4);
        0qQ.A0B(jSx, 5);
        this.A0C = userSession;
        this.A06 = jrc;
        this.A04 = r7;
        this.A05 = jSx;
        this.A0D = hnY;
        this.A0B = tpD;
        Handler handler = new Handler(Looper.getMainLooper());
        this.A08 = handler;
        this.A07 = new Handler(Looper.getMainLooper());
        GestureDetector gestureDetector = new GestureDetector(context, new C226372gh(this), handler);
        this.A09 = gestureDetector;
        this.A0A = new ScaleGestureDetector(context, this, handler);
        gestureDetector.setIsLongpressEnabled(true);
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        Integer num;
        Integer num2;
        0qQ.A0B(motionEvent, 0);
        View view = this.A00;
        GQ0 gq0 = null;
        if (view != null) {
            num = Integer.valueOf(view.getWidth());
        } else {
            num = null;
        }
        View view2 = this.A00;
        if (view2 != null) {
            num2 = Integer.valueOf(view2.getHeight());
        } else {
            num2 = null;
        }
        if (!(num == null || num2 == null)) {
            gq0 = new GQ0(num.intValue(), num2.intValue(), motionEvent.getX(), motionEvent.getY());
        }
        JRC jrc = this.A06;
        C267324bN r1 = this.A04;
        jrc.D9x(r1, this.A05.BzC(r1), gq0);
        this.A01 = AnonymousClass05K.A01;
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public void onLongPress(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        Integer num = this.A01;
        if (num == AnonymousClass05K.A01) {
            this.A01 = AnonymousClass05K.A0C;
        } else if (num == AnonymousClass05K.A0C) {
            this.A01 = AnonymousClass05K.A00;
            JRC jrc = this.A06;
            C267324bN r3 = this.A04;
            jrc.DPD(r3, this.A05.BzC(r3), motionEvent.getX(), motionEvent.getY());
        }
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        this.A03 = AnonymousClass7TE.A1L(Float.valueOf(scaleGestureDetector.getFocusX()), Float.valueOf(scaleGestureDetector.getFocusY()));
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        JRC jrc = this.A06;
        C267324bN r3 = this.A04;
        jrc.Dl5(this.A00, r3, this.A05.BzC(r3), Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        if (2Sa.isEndToEndTestRun) {
            return onSingleTapConfirmed(motionEvent);
        }
        return false;
    }

    public static boolean A00(C70762Uy r2, C52129GFx gFx) {
        MotionEvent motionEvent = r2.A00;
        0qQ.A06(motionEvent);
        return gFx.A02(r2.A01, motionEvent);
    }

    public void A01(MotionEvent motionEvent) {
        JRC jrc = this.A06;
        C267324bN r3 = this.A04;
        jrc.DPE(r3, this.A05.BzC(r3), motionEvent.getX(), motionEvent.getY());
    }

    public final boolean A02(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        Runnable runnable;
        this.A00 = view;
        this.A02 = new C52322GNo(motionEvent, this);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.A07.removeCallbacksAndMessages((Object) null);
            if (this.A01 == AnonymousClass05K.A00 || this.A06.CX3()) {
                A01(motionEvent);
            }
            this.A01 = AnonymousClass05K.A0C;
        }
        if (motionEvent.getAction() == 0) {
            UserSession userSession = this.A0C;
            0Tu A0H = AnonymousClass7TF.A0H(userSession);
            if (182.A06(A0H, userSession, 36322959329733325L)) {
                JRC jrc = this.A06;
                C267324bN r3 = this.A04;
                if (jrc.CTC(r3, this.A05.BzC(r3), motionEvent.getX(), motionEvent.getY()) && (runnable = this.A02) != null) {
                    this.A07.postDelayed(runnable, 182.A01(A0H, userSession, 36604434306503735L));
                }
            }
        }
        if (motionEvent.getAction() == 2) {
            JRC jrc2 = this.A06;
            C267324bN r32 = this.A04;
            jrc2.CtQ(r32, this.A05.BzC(r32), motionEvent.getX(), motionEvent.getY());
        }
        boolean onTouchEvent = this.A09.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.A0A;
        if (scaleGestureDetector != null) {
            z = scaleGestureDetector.onTouchEvent(motionEvent);
        } else {
            z = false;
        }
        UserSession userSession2 = this.A0C;
        if (182.A06(AnonymousClass7TF.A0H(userSession2), userSession2, 36326597166446444L)) {
            C14065TpD tpD = this.A0B;
            if (tpD != null) {
                z2 = tpD.A00(motionEvent);
            }
            z2 = false;
        } else {
            HnY hnY = this.A0D;
            if (hnY != null) {
                z2 = hnY.A00.A01(motionEvent);
            }
            z2 = false;
        }
        if (onTouchEvent || z || z2) {
            return true;
        }
        return false;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        0eP r5 = this.A03;
        if (r5 != null) {
            JRC jrc = this.A06;
            C267324bN r3 = this.A04;
            jrc.DXH(r3, this.A05.BzC(r3), AnonymousClass7TE.A04(r5.A00), AnonymousClass7TE.A04(r5.A01));
        }
        this.A03 = null;
    }
}
