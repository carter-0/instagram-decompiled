package X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: X.7JL  reason: invalid class name */
public final class AnonymousClass7JL implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass7JI A00;

    public AnonymousClass7JL(AnonymousClass7JI r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            AnonymousClass7JI r2 = this.A00;
            if (!AnonymousClass7JI.A0C(r2, motionEvent.getRawX(), motionEvent.getRawY())) {
                r2.A0N.onClick(view);
                return true;
            }
        }
        return false;
    }
}
