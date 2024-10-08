package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.IZo  reason: case insensitive filesystem */
public final class C57383IZo implements C273414mX {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C273414mX A02;
    public final /* synthetic */ User A03;
    public final /* synthetic */ C62320sa A04;

    public final /* synthetic */ void Cyf() {
    }

    public C57383IZo(FragmentActivity fragmentActivity, UserSession userSession, C273414mX r3, User user, C62320sa r5) {
        this.A03 = user;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = r3;
        this.A04 = r5;
    }

    public final void Cyc() {
        User user = this.A03;
        if (user.A29()) {
            UserSession userSession = this.A01;
            C46447Df9.A03().A01(this.A00, userSession, this.A02, user, C273654mx.A00(85));
            return;
        }
        C62320sa r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
    }
}
