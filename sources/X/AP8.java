package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class AP8 implements View.OnTouchListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C250973mM A02;
    public final /* synthetic */ C309756Zm A03;

    public AP8(UserSession userSession, C255773uh r2, C250973mM r3, C309756Zm r4) {
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A03.DSM(this.A01, this.A02, motionEvent.getRawX(), motionEvent.getRawY());
        }
        return 182.A06(0Tu.A06, this.A00, 36320884861051827L);
    }
}
