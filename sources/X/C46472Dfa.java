package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.user.model.User;

/* renamed from: X.Dfa  reason: case insensitive filesystem */
public final class C46472Dfa implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass70J A00;
    public final /* synthetic */ User A01;

    public C46472Dfa(AnonymousClass70J r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AnonymousClass70J r1 = this.A00;
        C46443Df5 df5 = C46443Df5.FOLLOWERS;
        0qQ.A0A(motionEvent);
        return r1.A07(motionEvent, df5);
    }
}
