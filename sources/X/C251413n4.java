package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.ConditionVariable;
import android.os.PersistableBundle;
import com.facebook.analytics2.logger.legacy.uploader.LollipopUploadService;
import com.facebook.common.build.BuildConstants;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.3n4  reason: invalid class name and case insensitive filesystem */
public final class C251413n4 extends 1v1 {
    public ComponentName A00;
    public final JobScheduler A01;
    public final Context A02;
    public final ConcurrentLinkedQueue A03 = new ConcurrentLinkedQueue();

    public final long A01(int i) {
        JobScheduler jobScheduler = this.A01;
        if (jobScheduler != null) {
            try {
                List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
                if (allPendingJobs != null) {
                    for (JobInfo next : allPendingJobs) {
                        if (next.getId() == i) {
                            String className = next.getService().getClassName();
                            String className2 = this.A00.getClassName();
                            if (className.equals(className2)) {
                                return next.getMinLatencyMillis();
                            }
                            0KC.A0P("LollipopUploadScheduler", "Job scheduled with wrong component. Expected %s, but got %s Cancelling.", new Object[]{className2, className});
                            jobScheduler.cancel(i);
                            return Long.MAX_VALUE;
                        }
                    }
                }
            } catch (NullPointerException e) {
                0KC.A0K("LollipopUploadScheduler", "Scheduler binder is null. Skipping scheduling.", e);
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void A02(1uw r8, String str, int i, long j, long j2) {
        ComponentName componentName;
        JobScheduler jobScheduler = this.A01;
        if (jobScheduler != null && (componentName = this.A00) != null) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", str);
            persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
            JobInfo.Builder overrideDeadline = new JobInfo.Builder(i, componentName).setMinimumLatency(j).setOverrideDeadline(j2);
            persistableBundle.putString("uploader_class", r8.A0B);
            persistableBundle.putString("flexible_sampling_updater", r8.A08);
            persistableBundle.putString("privacy_policy", r8.A07);
            persistableBundle.putString("thread_handler_factory", r8.A09);
            persistableBundle.putString("upload_job_instrumentation", r8.A0A);
            persistableBundle.putString("priority_dir", r8.A02.getAbsolutePath());
            persistableBundle.putInt("network_priority", r8.A03.intValue());
            persistableBundle.putString("marauder_tier", r8.A06);
            persistableBundle.putInt("multi_batch_payload_size", r8.A01);
            persistableBundle.putInt("non_sticky_handling", r8.A0C ? 1 : 0);
            persistableBundle.putInt("use_fifo_uploads", r8.A0D ? 1 : 0);
            persistableBundle.putString("batch_payload_iterator_factory", r8.A04);
            persistableBundle.putString("acs_provider", r8.A00);
            persistableBundle.putString("ffdb_provider", r8.A05);
            JobInfo build = overrideDeadline.setExtras(persistableBundle).setRequiredNetworkType(1).setPersisted(false).build();
            ConditionVariable conditionVariable = AnonymousClass0eV.A00;
            if (build != null) {
                try {
                    jobScheduler.schedule(build);
                    return;
                } catch (IllegalArgumentException e) {
                    PackageManager packageManager = this.A02.getPackageManager();
                    int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                    if (!(componentEnabledSetting == 1 || componentEnabledSetting == 2 || componentEnabledSetting == 3 || componentEnabledSetting == 4)) {
                        packageManager.getServiceInfo(componentName, 512).isEnabled();
                    }
                } catch (NullPointerException e2) {
                    0KC.A0I("LollipopUploadScheduler", "Nullpointer exception encountered while scheduling job", e2);
                    return;
                } catch (Throwable th) {
                    0KC.A0F("LollipopUploadScheduler", "Error getting serviceInfo from PackageManager", th);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        0KC.A0M("LollipopUploadScheduler", "The Service is disabled, cannot schedule job for %s", e, new Object[]{componentName});
    }

    public C251413n4(Context context) {
        this.A02 = context;
        this.A01 = (JobScheduler) context.getSystemService("jobscheduler");
        ConditionVariable conditionVariable = AnonymousClass0eV.A00;
        this.A00 = new ComponentName(context, LollipopUploadService.class);
    }
}
