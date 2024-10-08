package X;

import android.view.MotionEvent;
import android.view.View;

public final class IDV implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass4DU A00;
    public final /* synthetic */ C56153Htf A01;
    public final /* synthetic */ C53281GlT A02;

    public IDV(AnonymousClass4DU r1, C56153Htf htf, C53281GlT glT) {
        this.A01 = htf;
        this.A02 = glT;
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener A022;
        0qQ.A0B(motionEvent, 1);
        if (motionEvent.getAction() != 0 || (A022 = this.A01.A02(this.A00, this.A02)) == null) {
            return false;
        }
        return A022.onTouch(view, motionEvent);
    }
}
