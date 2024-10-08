package X;

import com.facebook.react.bridge.ReactSoftExceptionLogger;

public final class TQR extends RuntimeException {
    public static void A00(String str, String str2) {
        ReactSoftExceptionLogger.logSoftException(str2, new RuntimeException(str));
    }
}
