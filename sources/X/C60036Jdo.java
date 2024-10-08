package X;

import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import java.util.Collection;
import java.util.Map;

/* renamed from: X.Jdo  reason: case insensitive filesystem */
public final class C60036Jdo extends TouchDelegate {
    public final Map A00 = AnonymousClass7TE.A1H();

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        0qQ.A0B(motionEvent, 0);
        Collection<TouchDelegate> values = this.A00.values();
        if (values == null || !values.isEmpty()) {
            for (TouchDelegate onTouchEvent : values) {
                if (onTouchEvent.onTouchEvent(motionEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C60036Jdo(View view) {
        super(AnonymousClass7TE.A0W(), view);
    }
}
