package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.3eL  reason: invalid class name and case insensitive filesystem */
public final class C246293eL {
    public final UserSession A00;

    public final AnonymousClass9IZ A00(Context context, 1Xj r20, 1Xj r21, AnonymousClass4DU r22, AnonymousClass3W1 r23) {
        1Xj r8 = r21;
        AnonymousClass2kQ A002 = C227942kP.A00(r22);
        if (r8.A0C.B5H() == null) {
            1Xj r1 = r20;
            if (r1.A0C.B5H() != null) {
                r8 = r1;
            }
        }
        UserSession userSession = this.A00;
        boolean A003 = C48905Em5.A00(A002, r8);
        AnonymousClass3W1 r11 = r23;
        return new AnonymousClass9IZ(new AnonymousClass9IV(29, (Object) new AnonymousClass9MR(40, r8, this, A002, r11), (Object) new AnonymousClass9MC(36, this, r11, r8)), C246393eW.A00.A00(context, userSession, r8, r8, A002, r11, AnonymousClass3VA.VIEW_SIMILAR), A003);
    }

    public C246293eL(UserSession userSession) {
        this.A00 = userSession;
    }
}
