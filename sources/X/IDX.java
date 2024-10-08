package X;

import android.view.MotionEvent;
import android.view.View;

public final class IDX implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C317286n1 A02;

    public IDX(AnonymousClass0iw r1, C255773uh r2, C317286n1 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            this.A02.DS2(AnonymousClass7TE.A0S(view), this.A00, this.A01, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return true;
    }
}
