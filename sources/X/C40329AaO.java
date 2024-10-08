package X;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import java.util.List;

/* renamed from: X.AaO  reason: case insensitive filesystem */
public final class C40329AaO implements B3I {
    public final List A00 = AnonymousClass7TE.A1C();
    public final GestureDetector A01;
    public final ScaleGestureDetector A02;
    public final C40041AOx A03 = new C40041AOx(this);
    public final C363248jP A04;

    public C40329AaO(Context context) {
        0qQ.A0B(context, 1);
        Handler A0D = AnonymousClass7TF.A0D();
        this.A01 = new GestureDetector(context, this, A0D);
        this.A02 = new ScaleGestureDetector(context, this, A0D);
        this.A04 = new C363248jP(context, this);
    }

    public final boolean Dfz(C363248jP r2) {
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        for (AnonymousClass8KL Dgm : this.A00) {
            Dgm.Dgm(scaleGestureDetector.getScaleFactor());
        }
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        0qQ.A0B(scaleGestureDetector, 0);
        for (AnonymousClass8KL Dgs : this.A00) {
            Dgs.Dgs(scaleGestureDetector.getScaleFactor());
        }
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean Dfy(C363248jP r11) {
        for (AnonymousClass8KL Dfx : this.A00) {
            Dfx.Dfx((float) Math.toDegrees(Math.atan2((double) r11.A03, (double) r11.A02) - Math.atan2((double) r11.A01, (double) r11.A00)));
        }
        return true;
    }

    public final void DsY(MotionEvent motionEvent, View view) {
        this.A01.onTouchEvent(motionEvent);
        this.A02.onTouchEvent(motionEvent);
        this.A04.A00(motionEvent);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (AnonymousClass8KL DhG : this.A00) {
            DhG.DhG(-f, -f2);
        }
        return true;
    }
}
