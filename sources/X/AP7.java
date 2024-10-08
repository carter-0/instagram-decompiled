package X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public final class AP7 implements View.OnTouchListener {
    public final /* synthetic */ C255773uh A00;
    public final /* synthetic */ C309746Zl A01;
    public final /* synthetic */ C307086Ot A02;

    public AP7(C255773uh r1, C309746Zl r2, C307086Ot r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float[] fArr = new float[2];
        C307086Ot r0 = this.A02;
        TextView A012 = r0.A01();
        0qQ.A0A(motionEvent);
        if (!C307406Pz.A02(motionEvent, A012, fArr, (int[]) r0.A09.getValue())) {
            return false;
        }
        this.A01.EGe(this.A00, fArr);
        return false;
    }
}
