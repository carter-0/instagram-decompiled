package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.EzA  reason: case insensitive filesystem */
public final class C49591EzA {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass35F A02;
    public final Integer A03;

    public C49591EzA(Activity activity, UserSession userSession, Integer num) {
        AnonymousClass7TG.A1O(userSession, activity);
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = num;
        this.A02 = new AnonymousClass35F(userSession);
    }
}
