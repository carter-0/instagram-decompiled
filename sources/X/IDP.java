package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

public final class IDP implements View.OnTouchListener {
    public final /* synthetic */ JV5 A00;
    public final /* synthetic */ C242813Wa A01;

    public IDP(JV5 jv5, C242813Wa r2) {
        this.A00 = jv5;
        this.A01 = r2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View.OnTouchListener Dsd;
        0qQ.A0B(motionEvent, 1);
        1Xj A002 = ((AnonymousClass3ZT) this.A00.A03).A00();
        User user = (User) 00k.A0J(A002.A3Q());
        if (AnonymousClass7TE.A1b(A002.A3Q()) && user != null && motionEvent.getAction() == 0 && (Dsd = this.A01.Dsd(A002, user.getId(), "")) != null) {
            Dsd.onTouch(view, motionEvent);
        }
        return false;
    }
}
