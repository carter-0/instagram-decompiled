package X;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public final class AP6 implements View.OnTouchListener {
    public int A00 = -1;
    public MotionEvent A01;
    public final /* synthetic */ AGr A02;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        0qQ.A0B(motionEvent, 1);
        AGr aGr = this.A02;
        View view2 = aGr.A02;
        if (view2.getVisibility() == 0) {
            return view2.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            motionEvent2 = null;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    MotionEvent motionEvent3 = this.A01;
                    if (motionEvent3 != null) {
                        if (this.A00 < 0) {
                            this.A00 = ViewConfiguration.get(view2.getContext()).getScaledTouchSlop();
                        }
                        float x = motionEvent3.getX() - motionEvent.getX();
                        float y = motionEvent3.getY() - motionEvent.getY();
                        if (Math.sqrt((double) ((x * x) + (y * y))) >= ((double) this.A00)) {
                            view2.dispatchTouchEvent(this.A01);
                            this.A01 = null;
                        }
                        return true;
                    }
                }
            } else if (this.A01 != null) {
                2cs r3 = aGr.A06.A01;
                r3.A06 = true;
                r3.A06(0.8999999761581421d);
                r3.A08(1.0d, false);
            }
            view2.dispatchTouchEvent(motionEvent);
            return true;
        }
        motionEvent2 = MotionEvent.obtainNoHistory(motionEvent);
        this.A01 = motionEvent2;
        return true;
    }

    public AP6(AGr aGr) {
        this.A02 = aGr;
    }
}
