package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4y6  reason: invalid class name and case insensitive filesystem */
public final class C279114y6 implements View.OnTouchListener {
    public final C279154yA A00;
    public final /* synthetic */ UserSession A01;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        if (!182.A06(0Tu.A06, this.A01, 36321065249088569L) || view.getTouchDelegate() == null || !view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return this.A00.DF8(motionEvent);
        }
        return true;
    }

    public C279114y6(UserSession userSession, C279104y5 r3, C279064y1 r4) {
        this.A01 = userSession;
        this.A00 = (C279154yA) ((0sP) r3.A03.A09).invoke(r4);
    }
}
