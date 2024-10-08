package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.IDg  reason: case insensitive filesystem */
public final class C56809IDg implements View.OnTouchListener {
    public static final C56809IDg A00 = new C56809IDg();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return C51970G9q.A1T((motionEvent.getY() > 0.0f ? 1 : (motionEvent.getY() == 0.0f ? 0 : -1)));
    }
}
