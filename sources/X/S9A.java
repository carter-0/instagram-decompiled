package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;

public final class S9A {
    public static final void A00(boolean z, String str) {
        0qQ.A0B(str, 1);
        if (!z) {
            ReactSoftExceptionLogger.logSoftException("SoftAssertions", new RuntimeException(str));
        }
    }
}
