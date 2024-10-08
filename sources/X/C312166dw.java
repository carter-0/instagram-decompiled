package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.6dw  reason: invalid class name and case insensitive filesystem */
public final class C312166dw {
    public static UserFlowLogger A00;

    public static final synchronized void A00() {
        synchronized (C312166dw.class) {
            if (!UserFlowJNIProvider.isInitialized()) {
                UserFlowLoggerImpl userFlowLoggerImpl = A00;
                if (userFlowLoggerImpl == null) {
                    QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
                    if (qPLInstance != null) {
                        userFlowLoggerImpl = new UserFlowLoggerImpl(qPLInstance, true, false);
                        A00 = userFlowLoggerImpl;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                UserFlowJNIProvider.setUserFlowLogger(userFlowLoggerImpl);
            }
        }
    }
}
