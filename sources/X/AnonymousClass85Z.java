package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.85Z  reason: invalid class name */
public final class AnonymousClass85Z implements AnonymousClass0eK {
    public final /* synthetic */ AnonymousClass85X A00;

    public AnonymousClass85Z(AnonymousClass85X r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        AnonymousClass85X r1 = this.A00;
        Activity activity = r1.A0V.A05;
        0qQ.A07(activity);
        UserSession userSession = r1.A0R;
        return new C358238aa(activity, r1.A0Q, userSession, 1Au.A00(userSession));
    }
}
