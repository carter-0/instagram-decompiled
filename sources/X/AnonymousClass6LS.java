package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.6LS  reason: invalid class name */
public final class AnonymousClass6LS implements View.OnTouchListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C309746Zl A01;
    public final /* synthetic */ C307086Ot A02;

    public AnonymousClass6LS(C255773uh r1, C309746Zl r2, C307086Ot r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float[] fArr = new float[2];
        C307086Ot r0 = this.A02;
        ImageView A002 = r0.A00();
        0qQ.A0A(motionEvent);
        if (!C307406Pz.A02(motionEvent, A002, fArr, (int[]) r0.A08.getValue())) {
            return false;
        }
        this.A01.EGe(this.A00, fArr);
        return false;
    }
}
