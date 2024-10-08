package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

public final class LSm {
    public final UserSession A00;
    public final MessageIdentifier A01;
    public final String A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C73657PhW(this, 30));
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(new C73657PhW(this, 31));

    public LSm(UserSession userSession, MessageIdentifier messageIdentifier, String str) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = messageIdentifier;
    }

    public static AnonymousClass2Ep A00(LSm lSm) {
        return (AnonymousClass2Ep) lSm.A03.getValue();
    }

    public static String A01(LSm lSm, C242243Te r2, 2Eq r3) {
        return C329997La.A00(r2, lSm.A00.A06, r3.C6a());
    }

    public static 0eP A02(LSm lSm) {
        return new 0eP("message_client_context_id", lSm.A01.A00());
    }

    public static 0eP A03(LSm lSm, C242243Te r2, 2Eq r3) {
        return new 0eP("user_type", C329997La.A00(r2, lSm.A00.A06, r3.C6a()));
    }
}
