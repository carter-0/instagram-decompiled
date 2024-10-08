package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.7aQ  reason: invalid class name and case insensitive filesystem */
public final class C333957aQ implements C333967aR {
    public final /* synthetic */ Application A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;

    public final EC7 AM5(C267094ax r7, EWA ewa, User user) {
        0qQ.A0B(user, 0);
        0qQ.A0B(ewa, 1);
        UserSession userSession = this.A01;
        String str = ewa.A00;
        0qQ.A0B(str, 4);
        return new EC7(userSession, r7, user, str, false);
    }

    public C333957aQ(Application application, UserSession userSession, String str) {
        this.A00 = application;
        this.A01 = userSession;
        this.A02 = str;
    }
}
