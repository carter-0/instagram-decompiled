package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.util.List;

/* renamed from: X.9UB  reason: invalid class name */
public final class AnonymousClass9UB implements AnonymousClass0lh {
    public AnonymousClass34S A00;
    public final List A01 = AnonymousClass7TE.A1C();
    public final UserSession A02;

    public static void A00(AnonymousClass9UB r5) {
        AnonymousClass3Q2 A03;
        AnonymousClass34S r0 = r5.A00;
        if (r0 != null) {
            Object obj = r0.A00;
            obj.getClass();
            for (String A032 : ((IngestSessionShim) obj).A00) {
                UserSession userSession = r5.A02;
                AnonymousClass3Q2 A033 = 28K.A00(userSession).A03(A032);
                1ua A002 = 1ua.A00(C60960kU.A00, userSession);
                if (A033 != null) {
                    if (!(A033.A2f == null || (A03 = 28K.A00(userSession).A03(A033.A2f)) == null)) {
                        A002.A0A(A03);
                    }
                    A002.A0A(A033);
                }
            }
            r5.A01.clear();
        }
    }

    public AnonymousClass9UB(UserSession userSession) {
        this.A02 = userSession;
    }

    public final void onSessionWillEnd() {
        A00(this);
    }
}
