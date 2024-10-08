package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AcZ  reason: case insensitive filesystem */
public final class C40464AcZ implements C333137Xu {
    public final UserSession A00;
    public final 0sP A01;

    public final void EBH(String str, String str2) {
        Object invoke;
        if (str != null && str2 != null && (invoke = this.A01.invoke(str)) != null) {
            AnonymousClass7OQ.A03(this.A00, str2, AnonymousClass7TE.A1I(invoke));
        }
    }

    public C40464AcZ(0sP r1, UserSession userSession) {
        this.A00 = userSession;
        this.A01 = r1;
    }
}
