package X;

import com.instagram.common.session.UserSession;

public final class OK8 {
    public final UserSession A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.1NU] */
    public final void A00(0sL r4, byte[] bArr) {
        1NY A0a = AnonymousClass7TG.A0a(this.A00);
        A0a.A0A("video_call/rtc_message/");
        A0a.A0J("rtc_message", bArr);
        A0a.A0P(new Object());
        A0a.A06 = 1CE.A0B;
        1OC A0M = A0a.A0M();
        A0M.A00 = new C68524NLv(r4);
        1ES.A06(A0M, 242, false);
    }

    public OK8(UserSession userSession) {
        this.A00 = userSession;
    }
}
