package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class E98 extends 2Ru {
    public final C47618EAe A00;
    public final User A01;
    public final C46457DfL A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E98(Context context, AnonymousClass07i r13, C2355930l r14, AnonymousClass0iw r15, UserSession userSession, C51028FnK fnK, G6T g6t, C243853aD r19, User user, String str, boolean z) {
        super(false);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 10);
        this.A01 = user;
        C47618EAe eAe = new C47618EAe(r13, r14, r15, userSession2, fnK, r19, str, z);
        this.A00 = eAe;
        C46457DfL dfL = new C46457DfL(context, g6t);
        this.A02 = dfL;
        init(new C231642s0[]{eAe, dfL});
    }
}
