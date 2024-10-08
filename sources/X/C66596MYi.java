package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.concurrent.TimeUnit;

/* renamed from: X.MYi  reason: case insensitive filesystem */
public final class C66596MYi implements AnonymousClass69F {
    public static final UserFlowLogger A00 = AnonymousClass69G.A00;
    public static final C66596MYi A01 = new Object();

    public final boolean Clr(long j, String str) {
        UserFlowLogger userFlowLogger = A00;
        if (!userFlowLogger.isOngoingFlow(j)) {
            return false;
        }
        userFlowLogger.flowMarkPoint(j, str);
        return true;
    }

    public final void DUa(long j, int i, String str) {
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            A00(j, -1, str);
            userFlowLogger.flowEndCancel(j, CancelReason.SYSTEM_CANCELLED);
        }
    }

    public final void DUb(long j, Integer num) {
        0qQ.A0B(num, 1);
        if (A00.isOngoingFlow(j)) {
            A01(num, "DISPLAYED", j);
        }
    }

    public final void DUd(long j, int i, String str) {
        0qQ.A0B(str, 2);
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            A00(j, i, str);
            userFlowLogger.flowEndFail(j, String.valueOf(i), str);
        }
    }

    public final void DUf(long j, Integer num) {
        0qQ.A0B(num, 1);
        if (A00.isOngoingFlow(j)) {
            A01(num, "REVOKED", j);
        }
    }

    public final void DUh(long j, Integer num) {
        0qQ.A0B(num, 1);
        if (A00.isOngoingFlow(j)) {
            A01(num, "UPDATED", j);
        }
    }

    public final AnonymousClass69F EaN(long j, boolean z) {
        A00.flowAnnotate(j, "is_engine", true);
        return this;
    }

    public final AnonymousClass69F EeF(String str, long j) {
        0qQ.A0B(str, 1);
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotate(j, "notification_type", str);
        userFlowLogger.flowAnnotateWithCrucialData(j, "nt", str);
        return this;
    }

    public final AnonymousClass69F Ehq(String str, long j) {
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotateWithCrucialData(j, "rcpid", str);
        AnonymousClass0eM r0 = AnonymousClass09Z.A00;
        if (r0 != null && r0.CVQ()) {
            userFlowLogger.flowAnnotate(j, "is_fg_account", 08y.A00().A05(str));
        }
        return this;
    }

    public final long ExJ(Integer num) {
        String str;
        String str2;
        0qQ.A0B(num, 0);
        UserFlowLogger userFlowLogger = A00;
        long generateFlowId = userFlowLogger.generateFlowId(89141344, AnonymousClass0HM.A00().hashCode());
        long millis = TimeUnit.SECONDS.toMillis(60);
        UserFlowConfig userFlowConfig = new UserFlowConfig("ig_notification_journey", false);
        userFlowConfig.mTtlMs = millis;
        userFlowLogger.flowStart(generateFlowId, userFlowConfig);
        switch (num.intValue()) {
            case 0:
                str = "FBNS";
                break;
            case 1:
                str = "FCM";
                break;
            case 2:
                str = "ADM";
                break;
            case 3:
                str = "IRIS";
                break;
            default:
                str = "MEM";
                break;
        }
        userFlowLogger.flowAnnotateWithCrucialData(generateFlowId, "dc", str);
        userFlowLogger.flowAnnotate(generateFlowId, "app_startup_type", C64031Cc.A09.toString());
        if (14i.A08()) {
            C64331Jv r4 = C638918c.A01(C61170le.A00).A04;
            if (r4 == null || r4.A0O != 1CS.A03 || r4.A0E) {
                str2 = "BACKGROUNDED";
            } else {
                str2 = "BACKGROUND_STARTED";
            }
        } else {
            str2 = "FOREGROUNDED";
        }
        userFlowLogger.flowAnnotate(generateFlowId, "app_state", str2);
        return generateFlowId;
    }

    public static final void A00(long j, int i, String str) {
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotate(j, "reason_code", i);
        userFlowLogger.flowAnnotate(j, "reason_for_debug", str);
    }

    private final void A01(Integer num, String str, long j) {
        UserFlowLogger userFlowLogger = A00;
        userFlowLogger.flowAnnotate(j, "render_target", C370448wU.A00(num));
        userFlowLogger.flowAnnotate(j, "outcome", str);
        userFlowLogger.flowEndSuccess(j);
    }

    public final boolean CYV(long j) {
        return A00.isOngoingFlow(j);
    }

    public final void DUc(long j) {
        UserFlowLogger userFlowLogger = A00;
        if (userFlowLogger.isOngoingFlow(j)) {
            userFlowLogger.flowAnnotate(j, "outcome", "DROPPED");
            userFlowLogger.flowEndSuccess(j);
        }
    }

    public final AnonymousClass69F EOu(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "atrid", str);
        return this;
    }

    public final AnonymousClass69F ESg(String str, long j) {
        A00.flowAnnotate(j, "consistent_thread_fbid", str);
        return this;
    }

    public final AnonymousClass69F EaC(long j, boolean z) {
        A00.flowAnnotate(j, "is_e2ee", z);
        return this;
    }

    public final AnonymousClass69F Eac(String str, long j) {
        A00.flowAnnotate(j, "initiated_from", str);
        return this;
    }

    public final AnonymousClass69F EdP(long j, long j2) {
        A00.flowAnnotate(j, "message_timestamp_ms", j2);
        return this;
    }

    public final AnonymousClass69F EdQ(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "mtrid", str);
        return this;
    }

    public final AnonymousClass69F Eed(long j, boolean z) {
        A00.flowAnnotate(j, "only_alert_once", z);
        return this;
    }

    public final AnonymousClass69F Ef1(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "otid", str);
        return this;
    }

    public final AnonymousClass69F EhU(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "pinid", str);
        return this;
    }

    public final AnonymousClass69F EhV(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "pnid", str);
        return this;
    }

    public final AnonymousClass69F Ejt(String str, long j) {
        A00.flowAnnotateWithCrucialData(j, "sid", str);
        return this;
    }

    public final AnonymousClass69F EoY(String str, long j) {
        A00.flowAnnotate(j, "thread_subtype", str);
        return this;
    }

    public final AnonymousClass69F EoZ(long j, boolean z) {
        int i;
        UserFlowLogger userFlowLogger = A00;
        if (C51967G9n.A0l(z ? 1 : 0).intValue() != 0) {
            i = 2;
        } else {
            i = 1;
        }
        userFlowLogger.flowAnnotate(j, "thread_type", i);
        return this;
    }

    public final boolean DUg(Integer num, String str, int i, long j) {
        boolean A1Z = DbW.A1Z(str);
        if (!A00.isOngoingFlow(j)) {
            return false;
        }
        A00(j, i, str);
        A01(num, "SUPPRESSED", j);
        return A1Z;
    }
}
