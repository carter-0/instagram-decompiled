package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;

/* renamed from: X.85k  reason: invalid class name and case insensitive filesystem */
public final class C3506185k implements View.OnTouchListener {
    public final /* synthetic */ GestureDetector A00;
    public final /* synthetic */ ReboundHorizontalScrollView A01;

    public C3506185k(GestureDetector gestureDetector, ReboundHorizontalScrollView reboundHorizontalScrollView) {
        this.A01 = reboundHorizontalScrollView;
        this.A00 = gestureDetector;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        for (C301525zS D1n : this.A01.A0J) {
            0qQ.A0A(view);
            0qQ.A0A(motionEvent);
            D1n.D1n(motionEvent, view);
        }
        return this.A00.onTouchEvent(motionEvent);
    }
}
