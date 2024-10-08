package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.SbO  reason: case insensitive filesystem */
public final class C11501SbO implements View.OnTouchListener {
    public final GestureDetector A00;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 1);
        this.A00.onTouchEvent(motionEvent);
        return false;
    }

    public C11501SbO(AnonymousClass37F r4) {
        this.A00 = new GestureDetector(AnonymousClass37F.A02(r4).getContext(), new C60032Jdi(r4, 6));
    }
}
