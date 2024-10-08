package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.GWo  reason: case insensitive filesystem */
public final class C52537GWo {
    public final UserSession A00;

    public C52537GWo(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final void A00(Context context, 1Xj r24, AnonymousClass4DU r25) {
        C52212GJd gJd;
        Context context2 = context;
        1Xj r3 = r24;
        boolean A1U = AnonymousClass7TF.A1U(0, r3, context2);
        Activity activity = (Activity) context2;
        UserSession userSession = this.A00;
        AnonymousClass4DU r13 = r25;
        if (0qQ.A0K(r13.getModuleName(), "explore_popular")) {
            gJd = C52212GJd.A06;
        } else {
            gJd = C52212GJd.A09;
        }
        new C52031GCd(activity, userSession, r13, (C228232l0) null, new IZF(this, r3), gJd, (String) null).A0L(new C271794jb(userSession, r3), r3, new C55894HpF((String) null, (String) null, (String) null, false, A1U, A1U, false, false, A1U, false, false, false, false, false, false, false, false));
    }
}
