package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;

public abstract class OQS {
    public static final PDF A00(UserSession userSession, CommonMediaTransport commonMediaTransport, C2609947v r5, C74551Pwk pwk) {
        AnonymousClass7TG.A1U(pwk, commonMediaTransport, r5);
        AnonymousClass3Q2 A03 = 28K.A00(userSession).A03(r5.A07);
        if (A03 != null) {
            String A02 = r5.A02();
            if (A02 != null) {
                return new PDF(userSession, pwk, A03, AnonymousClass7TF.A0w(A02, commonMediaTransport));
            }
            throw C66582MXn.A0k(r5, "No local path for voice media ", AnonymousClass7TE.A1A());
        }
        throw DbW.A0c("Cannot find pending media for key ", r5.A07);
    }

    public static final PDF A01(UserSession userSession, CommonMediaTransport commonMediaTransport, C74551Pwk pwk, C300925yB r6) {
        AnonymousClass7TG.A1O(pwk, commonMediaTransport);
        AnonymousClass3Q2 A0g = C66582MXn.A0g(userSession, r6);
        if (A0g != null) {
            return new PDF(userSession, pwk, A0g, AnonymousClass7TF.A0w(r6.A02(), commonMediaTransport));
        }
        throw DbW.A0c("Cannot find pending media for key ", r6.A06);
    }
}
