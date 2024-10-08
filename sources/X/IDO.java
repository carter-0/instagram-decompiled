package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class IDO implements View.OnTouchListener {
    public final C57231ITs A00;
    public final /* synthetic */ UserSession A01;

    public IDO(UserSession userSession, C53326GmC gmC, C254173s3 r4) {
        this.A01 = userSession;
        this.A00 = (C57231ITs) ((0sP) gmC.A05.A00).invoke(r4);
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean A1Z = AnonymousClass7TG.A1Z(view, motionEvent);
        if (!182.A06(0Tu.A06, this.A01, 36321065249088569L) || view.getTouchDelegate() == null || !view.getTouchDelegate().onTouchEvent(motionEvent)) {
            return this.A00.DF8(motionEvent);
        }
        return A1Z;
    }
}
