package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.TIx  reason: case insensitive filesystem */
public final class C13041TIx implements Runnable {
    public final /* synthetic */ C365488nC A00;
    public final /* synthetic */ 1RO A01;
    public final /* synthetic */ List A02;

    public C13041TIx(C365488nC r1, 1RO r2, List list) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = list;
    }

    public final void run() {
        1RO r2 = this.A01;
        List list = this.A02;
        if (r2.A00 != null) {
            if (!r2.A06.getAndSet(true)) {
                try {
                    r2.A00.A04(new C12167SoI(r2));
                } catch (SecurityException e) {
                    0KC.A0G("FacebookVoltronDownloader", "Unable to register listener", e);
                } catch (Throwable th) {
                    0KC.A0F("FacebookVoltronDownloader", "Oxygen request failed", th);
                }
            }
            try {
                if (r2.A07) {
                    Context context = r2.A01;
                    1Uf A002 = AnonymousClass1UZ.A00(r2.A04.A00);
                    0qQ.A0B(context, 0);
                    0qQ.A0B(list, 1);
                    long A003 = C11293SKb.A00(0);
                    Long valueOf = Long.valueOf(A003);
                    long A004 = C11293SKb.A00(6);
                    Long valueOf2 = Long.valueOf(A004);
                    if (!list.isEmpty()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        1W3 AR0 = A002.A00("AppModules::ScheduledInstallRequestTimestamp").AR0();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AR0.A08(AnonymousClass7TE.A18(it), currentTimeMillis);
                        }
                        AR0.A03();
                        JobInfo.Builder persisted = new JobInfo.Builder(R.id.oxygen_scheduled_installer_job_id, new ComponentName(context, OxygenScheduledInstallerJobService.class)).setRequiredNetworkType(2).setRequiresDeviceIdle(true).setRequiresCharging(true).setPersisted(true);
                        if (valueOf != null) {
                            persisted.setMinimumLatency(A003);
                        }
                        if (valueOf2 != null) {
                            persisted.setOverrideDeadline(A004);
                        }
                        Object systemService = context.getSystemService("jobscheduler");
                        0qQ.A0C(systemService, AnonymousClass000.A00(3644));
                        ((JobScheduler) systemService).schedule(persisted.build());
                        return;
                    }
                    return;
                }
                r2.A00.A03(list);
            } catch (Throwable th2) {
                0KC.A0H("FacebookVoltronDownloader", "Oxygen install request failure on deferred install", th2);
            }
        }
    }
}
