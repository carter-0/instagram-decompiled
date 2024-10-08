package com.facebook.papaya.client.platform;

import X.0dV;
import X.1Ks;
import X.1Lf;
import X.C10220Rob;
import X.C10406Rri;
import X.C11146SCb;
import X.C255183ti;
import X.Pxe;
import X.T0J;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Map;

public final class Platform {
    public static final Class TAG = Platform.class;

    public static void cancelExecution(Context context) {
        if (context == null) {
            PlatformLog.A01(Platform.class, "Fail to cancel the execution: context is null!", Pxe.A1b());
            return;
        }
        PlatformRichJobSchedulingGuard platformRichJobSchedulingGuard = C11146SCb.A01;
        platformRichJobSchedulingGuard.A00();
        synchronized (platformRichJobSchedulingGuard) {
            if (platformRichJobSchedulingGuard.A00 == null) {
                platformRichJobSchedulingGuard.A00 = (JobScheduler) context.getSystemService("jobscheduler");
            }
            platformRichJobSchedulingGuard.A03.clear();
        }
        C255183ti.A04(new T0J(platformRichJobSchedulingGuard, 2), 1Ks.A01, 1Lf.A01);
    }

    public static synchronized void onRunFinished() {
        Class<Platform> cls = Platform.class;
        synchronized (cls) {
            PlatformLog.A02(cls, "Finished Papaya execution", Pxe.A1b());
            C11146SCb.A01.A01();
        }
    }

    public static synchronized void onRunStarted() {
        Class<Platform> cls = Platform.class;
        synchronized (cls) {
            PlatformLog.A02(cls, "Performing Papaya execution", Pxe.A1b());
            C11146SCb.A01.A00();
        }
    }

    public static synchronized void onSchedulingFinished() {
        synchronized (Platform.class) {
            C11146SCb.A01.A01();
        }
    }

    public static synchronized void onSchedulingStarted() {
        synchronized (Platform.class) {
            C11146SCb.A01.A00();
        }
    }

    public static boolean scheduleExecution(Context context, ComponentName componentName, boolean z, boolean z2, boolean z3, long j) {
        if (context == null) {
            PlatformLog.A01(Platform.class, "Fail to schedule execution: context is null!", new Object[0]);
            return false;
        }
        PlatformRichJobSchedulingGuard platformRichJobSchedulingGuard = C11146SCb.A01;
        platformRichJobSchedulingGuard.A00();
        synchronized (platformRichJobSchedulingGuard) {
            if (platformRichJobSchedulingGuard.A00 == null) {
                platformRichJobSchedulingGuard.A00 = (JobScheduler) context.getSystemService("jobscheduler");
            }
            if (platformRichJobSchedulingGuard.A01 == null) {
                platformRichJobSchedulingGuard.A01 = componentName;
            }
            int i = 771751936;
            if (z) {
                i = 771751937;
            }
            int i2 = i & -5;
            if (z2) {
                i2 = i | 4;
            }
            int i3 = i2 & -3;
            if (z3) {
                i3 = i2 | 2;
            }
            C10220Rob rob = new C10220Rob(i3);
            Map map = platformRichJobSchedulingGuard.A03;
            Integer valueOf = Integer.valueOf(rob.A00);
            if (map.containsKey(valueOf)) {
                j = Math.min(j, ((C10406Rri) map.get(valueOf)).A00);
            }
            map.put(valueOf, new C10406Rri(rob, j));
        }
        C255183ti.A04(new T0J(platformRichJobSchedulingGuard, 2), 1Ks.A01, 1Lf.A01);
        return true;
    }

    static {
        0dV.A0C("papaya");
    }
}
