package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;

/* renamed from: X.65V  reason: invalid class name */
public final class AnonymousClass65V {
    public static final AnonymousClass9J6 A03 = new AnonymousClass9J6("message_delta_received_app_layer", "100", 10);
    public static final AnonymousClass9J6 A04 = new AnonymousClass9J6(CancelReason.MESSAGE_DROPPED, "101", 10);
    public static final AnonymousClass9J6 A05 = new AnonymousClass9J6("message_saved", "12", 10);
    public static final AnonymousClass9J6 A06 = new AnonymousClass9J6("notification_rendering", "15", 10);
    public static final AnonymousClass9J6 A07 = new AnonymousClass9J6("notification_synced", "14", 10);
    public static final AnonymousClass9J6 A08 = new AnonymousClass9J6("server_thread_fetch", "102", 10);
    public UserFlowLogger A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass65V(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        0Tu r2 = 0Tu.A05;
        this.A01 = 182.A06(r2, userSession, 36319458930728351L);
        this.A02 = 182.A06(r2, userSession, 36319458930859425L);
        if (!UserFlowJNIProvider.isInitialized()) {
            UserFlowJNIProvider.setUserFlowLogger(new UserFlowLoggerImpl(02m.A0p));
        }
        UserFlowLogger userFlowLogger = UserFlowJNIProvider.mUserFlowLogger;
        if (userFlowLogger != null) {
            this.A00 = userFlowLogger;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final Long A00(AnonymousClass65V r3, String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (r3.A00.isOngoingFlow(parseLong)) {
                return Long.valueOf(parseLong);
            }
            return null;
        } catch (NumberFormatException e) {
            e.getMessage();
            return null;
        }
    }
}
