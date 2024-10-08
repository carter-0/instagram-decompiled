package X;

import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.NrX  reason: case insensitive filesystem */
public abstract class C69748NrX {
    public static final NC6 A00() {
        if (NC6.A00 != null) {
            UserFlowLoggerImpl userFlowLoggerImpl = new UserFlowLoggerImpl(C51965G9l.A0l());
            NC6.A00 = userFlowLoggerImpl;
            return userFlowLoggerImpl;
        }
        0qQ.A0F("igUserFlowLoggerLoggedOut");
        throw AnonymousClass00P.createAndThrow();
    }
}
