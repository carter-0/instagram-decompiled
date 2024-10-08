package X;

import android.view.MotionEvent;
import android.view.View;

public final class IDQ implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C317286n1 A01;

    public IDQ(AnonymousClass0iw r1, C317286n1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A01.D4u(AnonymousClass7TE.A0S(view), this.A00, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }
}
