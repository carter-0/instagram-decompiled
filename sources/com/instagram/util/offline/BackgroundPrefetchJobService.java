package com.instagram.util.offline;

import X.00k;
import X.01V;
import X.09i;
import X.0Tu;
import X.0qQ;
import X.0wb;
import X.14i;
import X.182;
import X.1Au;
import X.1Av;
import X.C227462jM;
import X.C227502jR;
import X.C227512jS;
import X.C271004hk;
import X.C278694xN;
import X.C278704xO;
import X.C278714xP;
import X.C278724xQ;
import X.C278824xa;
import X.C60960kU;
import X.C63093KrM;
import X.S5L;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;

public class BackgroundPrefetchJobService extends JobService {
    public C278714xP A00;

    public final boolean onStopJob(JobParameters jobParameters) {
        UserSession userSession;
        Integer num;
        String str;
        C271004hk.A01(jobParameters, this, true);
        UserSession A05 = 09i.A0A.A05(this);
        if (A05 instanceof UserSession) {
            userSession = A05;
        } else {
            userSession = null;
        }
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        } else {
            num = null;
        }
        if (jobParameters != null && Build.VERSION.SDK_INT >= 31) {
            switch (jobParameters.getStopReason()) {
                case 0:
                    str = "STOP_REASON_UNDEFINED";
                    break;
                case 1:
                    str = "STOP_REASON_CANCELLED_BY_APP";
                    break;
                case 2:
                    str = "STOP_REASON_PREEMPT";
                    break;
                case 3:
                    str = "STOP_REASON_TIMEOUT";
                    break;
                case 4:
                    str = "STOP_REASON_DEVICE_STATE";
                    break;
                case 5:
                    str = "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW";
                    break;
                case 6:
                    str = "STOP_REASON_CONSTRAINT_CHARGING";
                    break;
                case 7:
                    str = "STOP_REASON_CONSTRAINT_CONNECTIVITY";
                    break;
                case 8:
                    str = "STOP_REASON_CONSTRAINT_DEVICE_IDLE";
                    break;
                case 9:
                    str = "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW";
                    break;
                case 10:
                    str = "STOP_REASON_QUOTA";
                    break;
                case 11:
                    str = "STOP_REASON_BACKGROUND_RESTRICTION";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    str = "STOP_REASON_APP_STANDBY";
                    break;
                case 13:
                    str = "STOP_REASON_USER";
                    break;
                case 14:
                    str = "STOP_REASON_SYSTEM_PROCESSING";
                    break;
                case 15:
                    str = "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = null;
        }
        if (userSession != null) {
            A01(userSession, this, num, str, 276371140);
        }
        0wb.A01.Ew0("BackgroundPrefetchJobService", "onStopJob");
        C278714xP r1 = this.A00;
        if (r1 == null) {
            return false;
        }
        r1.A02();
        if (!C278714xP.A01(r1)) {
            return false;
        }
        r1.A02.flowEndCancel(r1.A01, str);
        return false;
    }

    public static void A01(UserSession userSession, BackgroundPrefetchJobService backgroundPrefetchJobService, Integer num, String str, int i) {
        String str2;
        C278714xP r4 = new C278714xP(userSession, i);
        r4.A03();
        if (backgroundPrefetchJobService instanceof StoryBackgroundPrefetchJobService) {
            str2 = "StoryBackgroundPrefetchJobService";
        } else if (backgroundPrefetchJobService instanceof MainFeedBackgroundPrefetchJobService) {
            str2 = "MainFeedBackgroundPrefetchJobService";
        } else {
            str2 = "BackgroundPrefetchJobService";
        }
        r4.A05(str2, num);
        if (str != null && C278714xP.A01(r4)) {
            r4.A02.flowAnnotate(r4.A01, "reason", str);
        }
        if (C278714xP.A01(r4)) {
            r4.A02.flowEndSuccess(r4.A01);
        }
    }

    public final boolean A02() {
        UserSession A08;
        long longValue;
        int i;
        Long A01;
        if (this instanceof StoryBackgroundPrefetchJobService) {
            A08 = 09i.A0A.A08(this);
            Long l = 0L;
            if (14i.A08() && 182.A06(0Tu.A05, A08, 36316224821334130L)) {
                1Av A002 = 1Au.A00(A08);
                0qQ.A0B(A002, 1);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList A0U = 00k.A0U(C63093KrM.A00(A002));
                01V.A1C(A0U);
                Iterator it = A0U.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue2 = ((Number) it.next()).longValue();
                    if (longValue2 > currentTimeMillis / 1000) {
                        if (Long.valueOf(longValue2) != null) {
                            l = Long.valueOf((longValue2 * 1000) - System.currentTimeMillis());
                        }
                    }
                }
            }
            longValue = l.longValue();
            if (longValue <= 0) {
                return false;
            }
            i = R.id.story_background_prefetch_job_scheduler_id;
        } else if (!(this instanceof MainFeedBackgroundPrefetchJobService)) {
            return false;
        } else {
            A08 = 09i.A0A.A08(this);
            Long l2 = 0L;
            if (14i.A08() && 182.A06(0Tu.A05, A08, 36315309993757826L) && (A01 = new S5L(1Au.A00(A08)).A01()) != null) {
                l2 = Long.valueOf((A01.longValue() * 1000) - System.currentTimeMillis());
            }
            longValue = l2.longValue();
            if (longValue <= 0) {
                return false;
            }
            i = R.id.feed_background_prefetch_job_scheduler_id;
        }
        C227502jR r5 = new C227502jR(getClass(), i);
        r5.A05 = true;
        r5.A00 = 1;
        r5.A02 = longValue;
        C227462jM.A00(C60960kU.A00, A08).A03(C60960kU.A00, A08, new C227512jS(r5));
        return true;
    }

    public static void A00(Context context, UserSession userSession, C278704xO r13, BackgroundPrefetchJobService backgroundPrefetchJobService, Integer num) {
        String str;
        C278724xQ r1;
        Context context2;
        String str2;
        UserSession userSession2 = userSession;
        BackgroundPrefetchJobService backgroundPrefetchJobService2 = backgroundPrefetchJobService;
        Integer num2 = num;
        A01(userSession, backgroundPrefetchJobService, num, (String) null, 276369690);
        C278714xP r0 = new C278714xP(userSession, 276374592);
        backgroundPrefetchJobService.A00 = r0;
        r0.A03();
        Class<?> cls = backgroundPrefetchJobService.getClass();
        C278714xP r12 = backgroundPrefetchJobService.A00;
        boolean z = backgroundPrefetchJobService instanceof StoryBackgroundPrefetchJobService;
        if (z) {
            str = "StoryBackgroundPrefetchJobService";
        } else if (backgroundPrefetchJobService instanceof MainFeedBackgroundPrefetchJobService) {
            str = "MainFeedBackgroundPrefetchJobService";
        } else {
            str = "BackgroundPrefetchJobService";
        }
        r12.A05(str, num);
        C278714xP r02 = backgroundPrefetchJobService.A00;
        Class<C278724xQ> cls2 = C278724xQ.class;
        synchronized (cls2) {
            context2 = context;
            r1 = new C278724xQ(context, userSession, r02);
            userSession.A04(cls2, r1);
        }
        C278824xa r4 = new C278824xa(context2, userSession2, r13, backgroundPrefetchJobService2, cls, num2);
        if (backgroundPrefetchJobService instanceof MainFeedBackgroundPrefetchJobService) {
            str2 = "FEED";
        } else if (z) {
            str2 = "STORY";
        } else {
            str2 = "ALL";
        }
        r1.A02(r4, str2);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        UserSession userSession;
        Integer num;
        int i;
        C271004hk.A00(jobParameters, this);
        UserSession A05 = 09i.A0A.A05(this);
        if (A05 instanceof UserSession) {
            userSession = A05;
        } else {
            userSession = null;
        }
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        } else {
            num = null;
        }
        if (userSession == null) {
            return false;
        }
        C278694xN r2 = new C278694xN(jobParameters, this);
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        A00(getApplicationContext(), userSession, r2, this, Integer.valueOf(i));
        return true;
    }
}
