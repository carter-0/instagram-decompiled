package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.Okd  reason: case insensitive filesystem */
public final class C71438Okd implements View.OnTouchListener {
    public static final C71438Okd A00 = new C71438Okd();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return C51970G9q.A1T((motionEvent.getY() > 0.0f ? 1 : (motionEvent.getY() == 0.0f ? 0 : -1)));
    }
}
