package X;

import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.AOn  reason: case insensitive filesystem */
public final class C40031AOn implements View.OnLayoutChangeListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C39868ACp A01;
    public final /* synthetic */ C255783ui A02;
    public final /* synthetic */ C249693kD A03;

    public C40031AOn(UserSession userSession, C39868ACp aCp, C255783ui r3, C249693kD r4) {
        this.A01 = aCp;
        this.A00 = userSession;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C39868ACp aCp = this.A01;
        UserSession userSession = this.A00;
        C249693kD r1 = this.A03;
        C255783ui r0 = this.A02;
        0qQ.A0A(view);
        C39868ACp.A00(view, userSession, aCp, r0, r1);
    }
}
