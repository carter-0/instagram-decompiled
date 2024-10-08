package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.AOp  reason: case insensitive filesystem */
public final class C40033AOp implements View.OnTouchListener {
    public final Set A00 = new LinkedHashSet();

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        for (View.OnTouchListener onTouch : this.A00) {
            if (onTouch.onTouch(view, motionEvent)) {
                z = true;
            }
        }
        return z;
    }
}
