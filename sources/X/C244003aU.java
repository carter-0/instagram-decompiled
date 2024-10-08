package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3aU  reason: invalid class name and case insensitive filesystem */
public final class C244003aU {
    public final AnonymousClass3ZP A00;

    public final void A00(Context context, AnonymousClass3ZU r7) {
        AnonymousClass3ZP r1 = this.A00;
        1Xj r0 = r7.A02.A01;
        UserSession userSession = r1.A00;
        User A2A = r0.A2A(userSession);
        if (A2A != null) {
            String C9f = A2A.A03.C9f();
            if (C9f != null) {
                AnonymousClass3ZQ.A02(context, C8956RIv.FEED, userSession, A2A.getId(), C9f);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public C244003aU(AnonymousClass3ZP r1) {
        this.A00 = r1;
    }
}
