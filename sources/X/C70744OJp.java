package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.mailbox.core.mutation.MsysImageSender$sendSecureImageMessage$1;

/* renamed from: X.OJp  reason: case insensitive filesystem */
public final class C70744OJp {
    public final UserSession A00;

    public C70744OJp(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final C71823OrQ A00(AnonymousClass9HR r15, C352218Cl r16, Long l, String str, String str2) {
        0qQ.A0B(r15, 7);
        AnonymousClass19S A01 = AnonymousClass1HX.A01(20641710, 3);
        MsysImageSender$sendSecureImageMessage$1 msysImageSender$sendSecureImageMessage$1 = new MsysImageSender$sendSecureImageMessage$1(this, r15, r16, (Integer) null, l, (String) null, str, str2, (AnonymousClass4D7) null, false);
        19B r0 = 19B.A00;
        Integer num = AnonymousClass05K.A00;
        Pr4 pr4 = new Pr4(1Ep.A02(r0, A01));
        pr4.A0T(num, pr4, msysImageSender$sendSecureImageMessage$1);
        return pr4.A00;
    }
}
