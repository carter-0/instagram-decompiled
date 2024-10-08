package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;

/* renamed from: X.MlP  reason: case insensitive filesystem */
public final class C67290MlP {
    public static final C15050ULg A00 = new C15050ULg("notification_rendering", "15", 4);
    public static final UserFlowLogger A01 = new UserFlowLoggerImpl(02m.A0p);
    public static final C67290MlP A02 = new Object();
    public static final C15050ULg A03 = new C15050ULg("notification_received", "0", 4);

    public static final boolean A00(AnonymousClass5HJ r4) {
        String str;
        String str2;
        String str3;
        if (!1AW.A06(0Tu.A05, 18308045423519934L) || (str = r4.A0x) == null || str.length() == 0 || (str2 = r4.A0g) == null || r4.A05() || 00l.A0d(str2, "ig_advanced_crypto_transport", false) || (((str3 = r4.A0g) != null && 00l.A0d(str3, "is_vanish_mode", false)) || r4.A1S)) {
            return false;
        }
        return true;
    }

    public final void A01(AnonymousClass5HJ r7, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        if (A00(r7)) {
            UserFlowLogger userFlowLogger = A01;
            long generateFlowId = userFlowLogger.generateFlowId(550451290, str.hashCode());
            UserFlowConfig userFlowConfig = new UserFlowConfig("notification_open_message", false);
            userFlowConfig.mTtlMs = 30000;
            userFlowLogger.flowStartIfNotOngoing(generateFlowId, userFlowConfig);
            C15050ULg uLg = A03;
            userFlowLogger.flowMarkPoint(generateFlowId, uLg.A01);
            userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "mtrid", r7.A0x);
            String str4 = r7.A1G;
            if (str4 == null) {
                str4 = r7.A1F;
            }
            userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "open_thread_id", str4);
            userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "c", uLg.A00);
            if (z3) {
                userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "feature_tags", "23");
            }
            userFlowLogger.flowAnnotate(generateFlowId, AnonymousClass000.A00(3824), str3);
            if (str2 != null) {
                userFlowLogger.flowAnnotate(generateFlowId, "push_infra_notif_id", str2);
            }
            userFlowLogger.flowAnnotate(generateFlowId, "is_bg_account", !z);
            userFlowLogger.flowAnnotate(generateFlowId, C273654mx.A00(3146), i);
            userFlowLogger.flowAnnotate(generateFlowId, "is_background", z2);
            userFlowLogger.flowAnnotate(generateFlowId, AnonymousClass000.A00(1622), str);
        }
    }
}
