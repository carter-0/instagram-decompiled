package X;

import android.os.Handler;
import android.os.Looper;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowJNIProvider;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.user.model.User;
import java.util.concurrent.TimeUnit;

/* renamed from: X.65T  reason: invalid class name */
public final class AnonymousClass65T {
    public static final AnonymousClass9J6 A08 = new AnonymousClass9J6("message_delta_received_app_layer", "100", 10);
    public static final AnonymousClass9J6 A09 = new AnonymousClass9J6(CancelReason.MESSAGE_DROPPED, "101", 10);
    public static final AnonymousClass9J6 A0A = new AnonymousClass9J6("message_saved", "12", 10);
    public static final AnonymousClass9J6 A0B = new AnonymousClass9J6("mi_notification_dequeue", "108", 10);
    public static final AnonymousClass9J6 A0C = new AnonymousClass9J6("mi_notification_enqueue", "107", 10);
    public static final AnonymousClass9J6 A0D = new AnonymousClass9J6("mi_notification_remove_queue", "110", 10);
    public static final AnonymousClass9J6 A0E = new AnonymousClass9J6("mi_notification_skip", "106", 10);
    public static final AnonymousClass9J6 A0F = new AnonymousClass9J6("mi_notification_sync_end", "111", 10);
    public static final AnonymousClass9J6 A0G = new AnonymousClass9J6("mi_notification_sync_start", "109", 10);
    public static final AnonymousClass9J6 A0H = new AnonymousClass9J6("badging", "17", 10);
    public static final AnonymousClass9J6 A0I = new AnonymousClass9J6("handle_push_notification_with_configs", "104", 10);
    public static final AnonymousClass9J6 A0J = new AnonymousClass9J6("handle_armadillo_push_operation", "103", 10);
    public static final AnonymousClass9J6 A0K = new AnonymousClass9J6("notification_operation_execution_scheduled", "105", 10);
    public static final AnonymousClass9J6 A0L = new AnonymousClass9J6("notification_received", "0", 10);
    public static final AnonymousClass9J6 A0M = new AnonymousClass9J6("notification_synced", "14", 10);
    public static final AnonymousClass9J6 A0N = new AnonymousClass9J6("offline_sync_retry", "112", 10);
    public static final AnonymousClass9J6 A0O = new AnonymousClass9J6("server_thread_fetch", "102", 10);
    public static final AnonymousClass9J6 A0P = new AnonymousClass9J6("notification_rendering", "15", 10);
    public int A00 = -1;
    public String A01;
    public 0sP A02 = AnonymousClass65U.A00;
    public boolean A03;
    public final long A04;
    public final UserFlowLogger A05;
    public final boolean A06;
    public final UserSession A07;

    public AnonymousClass65T(UserSession userSession) {
        long j;
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A06 = 182.A06(0Tu.A05, userSession, 36319454635761053L);
        if (!UserFlowJNIProvider.isInitialized()) {
            UserFlowJNIProvider.setUserFlowLogger(new UserFlowLoggerImpl(02m.A0p));
        }
        UserFlowLogger userFlowLogger = UserFlowJNIProvider.mUserFlowLogger;
        if (userFlowLogger != null) {
            this.A05 = userFlowLogger;
            User A002 = 0eE.A00(userSession).A00();
            int i = 0;
            if (A002.BST() != null) {
                Long BST = A002.BST();
                if (BST != null) {
                    j = BST.longValue();
                } else {
                    j = 0;
                }
                i = (int) j;
            } else {
                0KC.A0C("SecureMessageOverWAIGNotificationsE2ENotificationLevelLogger", "EIMU not available");
            }
            this.A04 = userFlowLogger.generateFlowId(98893825, i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A00(0sP r9) {
        int i = 0;
        long millis = TimeUnit.SECONDS.toMillis(182.A01(0Tu.A05, this.A07, 36600929612599362L));
        UserFlowLogger userFlowLogger = this.A05;
        long j = this.A04;
        UserFlowConfig userFlowConfig = new UserFlowConfig("notification_e2e_notification_level", false);
        userFlowConfig.mTtlMs = millis;
        if (!userFlowLogger.flowStartIfNotOngoing(j, userFlowConfig)) {
            i = this.A00 + 1;
        }
        this.A00 = i;
        this.A02 = r9;
        if (!this.A03) {
            this.A03 = true;
            new Handler(Looper.getMainLooper()).postDelayed(new C73102PWj(this), millis);
        }
    }

    public final void A01(boolean z, String str) {
        if (this.A03) {
            UserFlowLogger userFlowLogger = this.A05;
            long j = this.A04;
            AnonymousClass9J6 r4 = A0P;
            userFlowLogger.flowMarkPoint(j, r4.A01);
            if (this.A00 == 0 && !z) {
                userFlowLogger.flowAnnotate(j, "suppress_in_app_layer", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
                if (str != null) {
                    userFlowLogger.flowAnnotate(j, C66579MXk.A00(171), str);
                }
            }
            userFlowLogger.flowAnnotateWithCrucialData(j, "c", r4.A00);
        }
    }
}
