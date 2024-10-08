package X;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Arrays;

/* renamed from: X.4hk  reason: invalid class name and case insensitive filesystem */
public abstract class C271004hk {
    public static final 02m A00 = 02m.A0p;

    public static final void A00(JobParameters jobParameters, JobService jobService) {
        Integer num = null;
        if (jobParameters != null) {
            jobParameters.getJobId();
        }
        String name = jobService.getClass().getName();
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        }
        int hashCode = Arrays.hashCode(new Object[]{name, num});
        02m r3 = A00;
        r3.markerStart(883764695, hashCode, false);
        r3.markerAnnotate(883764695, hashCode, "job_service", name);
        r3.markerAnnotate(883764695, hashCode, "is_app_bg_on_start", 14i.A08());
    }

    public static final void A01(JobParameters jobParameters, JobService jobService, boolean z) {
        String str;
        Integer num = null;
        if (jobParameters != null) {
            jobParameters.getJobId();
        }
        String name = jobService.getClass().getName();
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        }
        int hashCode = Arrays.hashCode(new Object[]{name, num});
        02m r3 = A00;
        if (r3.isMarkerOn(883764695, hashCode)) {
            if (Build.VERSION.SDK_INT >= 31 && jobParameters != null) {
                int stopReason = jobParameters.getStopReason();
                switch (stopReason) {
                    case 0:
                        str = "undefined";
                        break;
                    case 1:
                        str = "cancelled_by_app";
                        break;
                    case 2:
                        str = "preempt";
                        break;
                    case 3:
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
                        break;
                    case 4:
                        str = "device_idle";
                        break;
                    case 5:
                        str = "constraint_battery_not_low";
                        break;
                    case 6:
                        str = "constraint_charging";
                        break;
                    case 7:
                        str = "constraint_connectivity";
                        break;
                    case 8:
                        str = "constraint_device_idle";
                        break;
                    case 9:
                        str = "constraint_storage_not_low";
                        break;
                    case 10:
                        str = "quota";
                        break;
                    case 11:
                        str = "background_restriction";
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        str = "app_standby";
                        break;
                    case 13:
                        str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                        break;
                    case 14:
                        str = "system_processing";
                        break;
                    case 15:
                        str = "estimated_app_launch_time_changed";
                        break;
                    default:
                        str = 002.A0O("unknown:", stopReason);
                        break;
                }
                r3.markerAnnotate(883764695, hashCode, "stop_reason", str);
            }
            r3.markerAnnotate(883764695, hashCode, "is_app_bg_on_end", 14i.A08());
            r3.markerAnnotate(883764695, hashCode, "is_forced_stop", z);
            r3.markerEnd(883764695, hashCode, 467);
        }
    }
}
