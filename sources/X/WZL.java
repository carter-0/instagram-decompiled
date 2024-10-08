package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Iterator;

public final class WZL implements AnonymousClass2rX {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C17251VOd A02;
    public final C322206vQ A03;
    public final C15953UlV A04;
    public final Context A05;
    public final User A06;

    public WZL(Context context, UserSession userSession, AnonymousClass4DU r5, C17251VOd vOd, C322206vQ r7, AnonymousClass32Q r8, User user) {
        AnonymousClass7TF.A1E(userSession, 2, r8);
        this.A05 = context;
        this.A00 = userSession;
        this.A03 = r7;
        this.A06 = user;
        this.A01 = r5;
        this.A02 = vOd;
        this.A04 = new C15953UlV(1wY.A00(userSession), r8);
    }

    public final Iterator Eaa(C228382la r2) {
        throw AnonymousClass00P.createAndThrow();
    }
}
