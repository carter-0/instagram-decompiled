package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import X.0fR;
import X.AnonymousClass7TE;
import X.C10819Ryf;
import X.C11149SCe;
import X.C13062TJs;
import X.C271004hk;
import X.C9689Rf7;
import X.DbW;
import X.RE0;
import X.Sw4;
import X.TH1;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.facebook.location.platform.api.Location;

public class JobInfoSchedulerService extends JobService {
    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        return true;
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString(Location.EXTRAS);
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        Sw4.A01(getApplicationContext());
        byte[] bArr = null;
        if (string != null) {
            RE0 re0 = (RE0) C11149SCe.A00.get(i);
            if (re0 != null) {
                if (string2 != null) {
                    bArr = Base64.decode(string2, 0);
                }
                C10819Ryf ryf = Sw4.A00().A01;
                ryf.A08.execute(new C13062TJs(C9689Rf7.A00(re0, string, bArr), ryf, new TH1(jobParameters, this), i2));
                return true;
            }
            throw DbW.A0a("Unknown Priority for value ", i);
        }
        throw AnonymousClass7TE.A11("Null backendName");
    }
}
