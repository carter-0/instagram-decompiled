package X;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.479  reason: invalid class name */
public final class AnonymousClass479 extends TouchDelegate {
    public static final Rect A01 = new Rect();
    public final List A00 = new ArrayList();

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        Iterator it = this.A00.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                motionEvent.setLocation(x, y);
                if (((TouchDelegate) it.next()).onTouchEvent(motionEvent) || z) {
                    z = true;
                }
            }
        }
    }

    public AnonymousClass479(View view) {
        super(A01, view);
    }
}
