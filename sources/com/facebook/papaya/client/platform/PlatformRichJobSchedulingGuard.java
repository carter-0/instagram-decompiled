package com.facebook.papaya.client.platform;

import X.17k;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10406Rri;
import X.C11146SCb;
import X.C51968G9o;
import X.Pxh;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class PlatformRichJobSchedulingGuard {
    public JobScheduler A00;
    public ComponentName A01;
    public int A02 = 0;
    public final Map A03 = new ConcurrentHashMap();

    public final synchronized void A00() {
        this.A02++;
    }

    public final synchronized void A01() {
        ComponentName componentName;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            int i = this.A02;
            17k.A0F(AnonymousClass7TF.A1R(i));
            int i2 = i - 1;
            this.A02 = i2;
            if (i2 == 0) {
                JobScheduler jobScheduler = this.A00;
                if (jobScheduler != null) {
                    HashMap A1E = AnonymousClass7TE.A1E();
                    for (JobInfo next : jobScheduler.getAllPendingJobs()) {
                        Pxh.A1I(next, A1E, next.getId());
                    }
                    int i3 = 771751936;
                    while (true) {
                        Map map = this.A03;
                        if (map.containsKey(Integer.valueOf(i3))) {
                            C10406Rri rri = (C10406Rri) C51968G9o.A10(map, i3);
                            if (!(this.A00 == null || (componentName = this.A01) == null)) {
                                int i4 = rri.A01.A00;
                                JobInfo.Builder builder = new JobInfo.Builder(i4, componentName);
                                PersistableBundle persistableBundle = new PersistableBundle();
                                long j = rri.A00;
                                long max = Math.max(C11146SCb.A00, j);
                                boolean A1S = AnonymousClass7TF.A1S(2, i4 & 2);
                                builder.setRequiresCharging(A1S);
                                boolean A1S2 = AnonymousClass7TF.A1S(4, i4 & 4);
                                if (A1S2) {
                                    builder.setRequiredNetworkType(2);
                                } else {
                                    builder.setRequiredNetworkType(1);
                                }
                                boolean z = true;
                                if (1 == (i4 & 1)) {
                                    builder.setRequiresDeviceIdle(true);
                                } else {
                                    z = false;
                                }
                                builder.setExtras(persistableBundle);
                                builder.setMinimumLatency(max);
                                try {
                                    this.A00.schedule(builder.build());
                                    Class<C11146SCb> cls = C11146SCb.class;
                                    Integer valueOf = Integer.valueOf(i4);
                                    if (z) {
                                        str = "y";
                                    } else {
                                        str = "n";
                                    }
                                    if (A1S2) {
                                        str2 = "y";
                                    } else {
                                        str2 = "n";
                                    }
                                    if (A1S) {
                                        str3 = "y";
                                    } else {
                                        str3 = "n";
                                    }
                                    PlatformLog.A02(cls, String.format("Scheduled execution with job scheduler, id=0x%08X, idle=%s, WiFi=%s, external power=%s, delay=%d", new Object[]{valueOf, str, str2, str3, Long.valueOf(j)}), new Object[0]);
                                } catch (Exception e) {
                                    PlatformLog.A01(C11146SCb.class, e.toString(), new Object[0]);
                                }
                            }
                        } else if (this.A00 != null) {
                            Integer valueOf2 = Integer.valueOf(i3);
                            if (A1E.containsKey(valueOf2)) {
                                try {
                                    this.A00.cancel(i3);
                                    PlatformLog.A02(C11146SCb.class, String.format("Cancelled execution with job scheduler, id=0x%08X", new Object[]{valueOf2}), new Object[0]);
                                } catch (Exception e2) {
                                    PlatformLog.A01(C11146SCb.class, e2.toString(), new Object[0]);
                                }
                            }
                        }
                        i3++;
                        if (i3 >= 771752191) {
                            break;
                        }
                    }
                }
                this.A00 = null;
                this.A01 = null;
            }
        }
    }
}
