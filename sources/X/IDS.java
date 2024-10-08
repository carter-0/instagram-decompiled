package X;

import android.view.MotionEvent;
import android.view.View;

public final class IDS implements View.OnTouchListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C309666Zd A01;

    public IDS(C255773uh r1, C309666Zd r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        this.A01.DL6(this.A00, motionEvent.getRawX(), motionEvent.getRawY());
        return false;
    }
}
