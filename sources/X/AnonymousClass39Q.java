package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* renamed from: X.39Q  reason: invalid class name */
public final class AnonymousClass39Q {
    public final ComponentName A00;
    public final AnonymousClass38G A01;

    static {
        AnonymousClass389.A01("SystemJobInfoConverter");
    }

    public final JobInfo A00(AnonymousClass3DG r14, int i) {
        int i2;
        C255343ty r6 = r14.A0B;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", r14.A0M);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", r14.A0K);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", r14.A02());
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.A00).setRequiresCharging(r6.A05);
        boolean z = r6.A06;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z).setExtras(persistableBundle);
        Integer num = r6.A02;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 30 || num != AnonymousClass05K.A0j) {
            int intValue = num.intValue();
            if (intValue != 0) {
                i2 = 2;
                if (intValue != 1) {
                    if (intValue != 2) {
                        i2 = 4;
                        if (intValue == 3) {
                            i2 = 3;
                        } else if (intValue != 4) {
                            AnonymousClass389.A00();
                        }
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        } else {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
        boolean z2 = false;
        if (!z) {
            int i4 = 1;
            if (r14.A0F == AnonymousClass05K.A01) {
                i4 = 0;
            }
            extras.setBackoffCriteria(r14.A03, i4);
        }
        long max = Math.max(r14.A00() - System.currentTimeMillis(), 0);
        if (i3 <= 28 || max > 0) {
            extras.setMinimumLatency(max);
        } else if (!r14.A0J) {
            extras.setImportantWhileForeground(true);
        }
        Set<S47> set = r6.A03;
        if (!set.isEmpty()) {
            for (S47 s47 : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(s47.A00, s47.A01 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(r6.A01);
            extras.setTriggerContentMaxDelay(r6.A00);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(r6.A04);
        extras.setRequiresStorageNotLow(r6.A07);
        boolean z3 = false;
        if (r14.A02 > 0) {
            z3 = true;
        }
        if (max > 0) {
            z2 = true;
        }
        if (i3 >= 31 && r14.A0J && !z3 && !z2) {
            extras.setExpedited(true);
        }
        return extras.build();
    }

    public AnonymousClass39Q(Context context, AnonymousClass38G r5) {
        this.A01 = r5;
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
