package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4no  reason: invalid class name and case insensitive filesystem */
public final class C274164no implements View.OnTouchListener {
    public final C274204ns A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C274154nn A02;
    public final /* synthetic */ C262804Gb A03;
    public final /* synthetic */ AnonymousClass3W1 A04;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        0qQ.A0B(view, 0);
        0qQ.A0B(motionEvent, 1);
        if (!182.A06(0Tu.A06, this.A01, 36321065249088569L) || view.getTouchDelegate() == null || !view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return this.A00.DF8(motionEvent);
        }
        return true;
    }

    public C274164no(UserSession userSession, C274154nn r3, C262804Gb r4, AnonymousClass3W1 r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A01 = userSession;
        this.A00 = (C274204ns) ((0sL) r3.A04.A09).invoke(r4, r5);
    }
}
