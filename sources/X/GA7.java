package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class GA7 implements View.OnTouchListener {
    public final C253873rY A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3W1 A02;

    public GA7(UserSession userSession, C246613et r4, AnonymousClass4EA r5, AnonymousClass3W1 r6, int i) {
        this.A01 = userSession;
        this.A02 = r6;
        this.A00 = (C253873rY) r4.A0A.A0T.invoke(Integer.valueOf(i), r5);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1Z = AnonymousClass7TG.A1Z(view, motionEvent);
        if (182.A06(0Tu.A06, this.A01, 36321065249088569L) && view.getTouchDelegate() != null && view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return A1Z;
        }
        if (this.A02.CdP()) {
            return false;
        }
        return this.A00.DF8(motionEvent);
    }
}
