package X;

import android.view.MotionEvent;
import android.view.View;

public final class IDJ implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass4K1 A00;

    public IDJ(AnonymousClass4K1 r1) {
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass7TF.A1H(view, motionEvent);
        if (motionEvent.getAction() == 0) {
            AnonymousClass3W1 r1 = this.A00.A03;
            if (false != r1.A26) {
                r1.A26 = false;
            }
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }
}
