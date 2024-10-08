package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7VE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7VE implements C62320sa {
    public final /* synthetic */ AnonymousClass7VD A00;

    public /* synthetic */ AnonymousClass7VE(AnonymousClass7VD r1) {
        this.A00 = r1;
    }

    public final Object invoke() {
        C333597Zo r0;
        AnonymousClass7VD r1 = this.A00;
        Context requireContext = r1.A01.requireContext();
        UserSession userSession = r1.A02;
        if (r1.A06) {
            r0 = new PEQ(userSession);
        } else {
            0qQ.A0B(userSession, 0);
            r0 = new C333587Zn(userSession);
        }
        return new C66743Mbo(requireContext, r1.A03, userSession, r0);
    }
}
