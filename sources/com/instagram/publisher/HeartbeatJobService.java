package com.instagram.publisher;

import X.08y;
import X.0Dh;
import X.0fR;
import X.0qQ;
import X.C271004hk;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

public final class HeartbeatJobService extends JobService {
    public static final long A00 = TimeUnit.MINUTES.toMillis(15);

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        return false;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        String str;
        C271004hk.A00(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        PersistableBundle extras = jobParameters.getExtras();
        if (extras != null) {
            str = extras.getString("IgSessionManager.SESSION_TOKEN_KEY");
        } else {
            str = null;
        }
        UserSession userSession = 08y.A00().A05.A00;
        if (userSession == null || !0Dh.A00(str, userSession.A05)) {
            return false;
        }
        jobFinished(jobParameters, false);
        return true;
    }
}
