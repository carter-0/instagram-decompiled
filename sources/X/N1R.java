package X;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

public final class N1R extends C283285Gy {
    public final int A00;
    public final Object A01;

    public N1R(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                0qQ.A0B(motionEvent, 0);
                C14813UAk uAk = (C14813UAk) this.A01;
                List list = uAk.A0L;
                ArrayList<C15038UKr> A1C = AnonymousClass7TE.A1C();
                for (Object next : list) {
                    if (((C15038UKr) next).A0A.A01 != null) {
                        A1C.add(next);
                    }
                }
                for (C15038UKr uKr : A1C) {
                    if (uKr.A09.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        RectF rectF = uKr.A08;
                        float x = motionEvent.getX();
                        if (rectF != null && x <= rectF.right + (uAk.A07 * 3.0f)) {
                            C14813UAk.A00(uKr.A08, uAk);
                            return false;
                        }
                    }
                }
                return false;
            case 2:
                ValueAnimator valueAnimator = ((NR1) this.A01).A08;
                if (!valueAnimator.isRunning()) {
                    return true;
                }
                valueAnimator.pause();
                return true;
            case 3:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C72966PQy pQy;
        MotionEvent motionEvent3 = motionEvent;
        MotionEvent motionEvent4 = motionEvent2;
        float f3 = f;
        float f4 = f2;
        switch (this.A00) {
            case 0:
                C72970PRd pRd = (C72970PRd) this.A01;
                pRd.A04 = false;
                C72970PRd.A03(pRd);
                C70484O8j o8j = pRd.A0C;
                if (pRd.A01 == -1) {
                    return true;
                }
                o8j.A00.A0C.A00();
                return true;
            case 1:
                C14813UAk.A00((RectF) null, (C14813UAk) this.A01);
                return false;
            case 2:
                0qQ.A0B(motionEvent2, 1);
                pQy = ((NR1) this.A01).A0A;
                break;
            case 3:
                0qQ.A0B(motionEvent2, 1);
                pQy = ((C70579OCb) this.A01).A01;
                break;
            default:
                return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        if (motionEvent == null) {
            return false;
        }
        return pQy.A00.A01(motionEvent3, motionEvent4, pQy, f3, f4, false);
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (1 - this.A00 != 0) {
            return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
        C14813UAk.A00((RectF) null, (C14813UAk) this.A01);
        return false;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.A00) {
            case 1:
                C14813UAk.A00((RectF) null, (C14813UAk) this.A01);
                return true;
            case 2:
                NR1.A00((NR1) this.A01);
                return true;
            case 3:
                return false;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
