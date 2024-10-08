package X;

import android.app.usage.UsageStatsManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4xP  reason: invalid class name and case insensitive filesystem */
public final class C278714xP {
    public final int A00;
    public final long A01;
    public final 1QP A02;
    public final List A03 = new ArrayList();
    public final List A04 = new ArrayList();
    public final UserSession A05;

    public static final String A00(C278714xP r3) {
        UsageStatsManager usageStatsManager = (UsageStatsManager) r3.A05.A03.A06().getSystemService("usagestats");
        if (usageStatsManager == null) {
            return "UNKNOWN";
        }
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        if (appStandbyBucket == 10) {
            return "STANDBY_BUCKET_ACTIVE";
        }
        if (appStandbyBucket == 20) {
            return "STANDBY_BUCKET_WORKING_SET";
        }
        if (appStandbyBucket == 30) {
            return "STANDBY_BUCKET_FREQUENT";
        }
        if (appStandbyBucket != 40) {
            return appStandbyBucket == 45 ? "STANDBY_BUCKET_RESTRICTED" : "UNKNOWN";
        }
        return "STANDBY_BUCKET_RARE";
    }

    public static final boolean A01(C278714xP r3) {
        return 182.A06(0Tu.A05, r3.A05, 36318703016483216L);
    }

    public C278714xP(UserSession userSession, int i) {
        this.A05 = userSession;
        this.A00 = i;
        1QP A002 = AnonymousClass1QO.A00(userSession);
        this.A02 = A002;
        this.A01 = A002.generateNewFlowId(i);
    }

    public final void A02() {
        if (A01(this)) {
            synchronized (this) {
                1QP r6 = this.A02;
                List<AnonymousClass542> list = this.A03;
                for (AnonymousClass542 r0 : list) {
                    r6.flowAnnotate(this.A01, 002.A0R(r0.A00, "_completed"), true);
                }
                list.clear();
            }
        }
    }

    public final void A03() {
        String str;
        if (A01(this)) {
            1QP r4 = this.A02;
            long j = this.A01;
            switch (this.A00) {
                case 276369690:
                    str = "TASK_STARTED";
                    break;
                case 276371140:
                    str = "TASK_STOPPED";
                    break;
                case 276374386:
                    str = "TASK_SCHEDULED";
                    break;
                case 276376302:
                    str = "TASK_EXECUTED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            r4.flowStart(j, str, false);
        }
    }

    public final void A04(AnonymousClass542 r2) {
        if (A01(this)) {
            synchronized (this) {
                this.A04.add(r2);
            }
        }
    }

    public final void A05(String str, Integer num) {
        if (A01(this)) {
            1QP r4 = this.A02;
            long j = this.A01;
            r4.flowAnnotate(j, "job_class", str);
            r4.flowAnnotate(j, "standby_bucket", A00(this));
            r4.flowAnnotate(j, "is_backgrounded", 14i.A08());
            if (num != null) {
                r4.flowAnnotate(j, "job_id", num.intValue());
            }
        }
    }
}
