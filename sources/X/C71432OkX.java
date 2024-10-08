package X;

import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OkX  reason: case insensitive filesystem */
public final class C71432OkX implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass7EQ A00;
    public final /* synthetic */ NYV A01;

    public C71432OkX(AnonymousClass7EQ r1, NYV nyv) {
        this.A00 = r1;
        this.A01 = nyv;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            C333107Xr r3 = this.A00.A00;
            if (!r3.CPk()) {
                NYV nyv = this.A01;
                long micros = TimeUnit.MILLISECONDS.toMicros(nyv.BSP());
                ((AnonymousClass7XX) r3).Eum(C66584MXp.A08(motionEvent), nyv, nyv.BOV(), micros, nyv.CXM(), true);
            }
        }
        view.performClick();
        return true;
    }
}
