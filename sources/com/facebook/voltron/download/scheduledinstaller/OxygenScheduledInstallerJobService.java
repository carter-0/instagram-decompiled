package com.facebook.voltron.download.scheduledinstaller;

import X.00k;
import X.0fR;
import X.0fy;
import X.0gH;
import X.0qQ;
import X.1Uf;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.C11293SKb;
import X.C12168SoJ;
import X.C12977TGk;
import X.C271004hk;
import X.C64791Ub;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class OxygenScheduledInstallerJobService extends JobService {
    public static final C11293SKb A05 = new Object();
    public HandlerThread A00;
    public 1Uf A01;
    public C12168SoJ A02;
    public ExecutorService A03;
    public ExecutorService A04;

    public final List A00(1Uf r7) {
        Set keySet = r7.A00("AppModules::ScheduledInstallRequestTimestamp").Aan().keySet();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : keySet) {
            String str = (String) next;
            if (0fy.A00(str) != -1 && !0gH.A01(this, str)) {
                A1C.add(next);
            }
        }
        return 00k.A0a(A1C);
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(-746841003);
        super.onCreate();
        this.A04 = Executors.newSingleThreadExecutor();
        this.A03 = Executors.newSingleThreadExecutor();
        this.A01 = new C64791Ub(this).A00();
        AnonymousClass0fD.A0B(-494773045, A042);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        C271004hk.A00(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        ExecutorService executorService = this.A04;
        if (executorService == null) {
            0qQ.A0F("executorService");
            throw AnonymousClass00P.createAndThrow();
        }
        executorService.execute(new C12977TGk(jobParameters, this));
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        0fR.A01(jobParameters, this);
        0qQ.A0B(jobParameters, 0);
        1Uf r0 = this.A01;
        if (r0 == null) {
            0qQ.A0F("lightSharedPreferencesFactory");
            throw AnonymousClass00P.createAndThrow();
        } else if (A00(r0).isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
