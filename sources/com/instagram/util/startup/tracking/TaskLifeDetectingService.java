package com.instagram.util.startup.tracking;

import X.02m;
import X.0eG;
import X.0qQ;
import X.0s0;
import X.0tS;
import X.18g;
import X.1Eo;
import X.AnonymousClass0YZ;
import X.AnonymousClass0fD;
import X.AnonymousClass1Ju;
import X.AnonymousClass1KE;
import X.AnonymousClass4D7;
import X.C262224Cq;
import X.C279024xx;
import X.C305926Kc;
import X.C61170le;
import X.C638918c;
import X.C64031Cc;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.instagram.perf.userflowpattern.AppRestartLogger$onAppTaskRemoved$1;

public final class TaskLifeDetectingService extends Service {
    public static boolean A01;
    public static boolean A02;
    public boolean A00;

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onTaskRemoved(Intent intent) {
        if (this.A00) {
            18g A012 = C638918c.A01(C61170le.A00);
            C64031Cc.A03();
            if (A012.A05 != null) {
                A012.A0Q(A012.A02, "APP_TERMINATED", "killed_by_task_removal");
                A012.A0L(A012.A02, 18g.A0Q, (Long) null);
            }
            AnonymousClass1Ju r0 = A012.A06;
            if (r0 != null) {
                AnonymousClass1Ju.A00(r0);
            }
            boolean z = AnonymousClass1KE.A07;
            long now = AwakeTimeSinceBootClock.INSTANCE.now();
            long currentTimeMillis = System.currentTimeMillis();
            if (AnonymousClass1KE.A01()) {
                1Eo.A05(AnonymousClass1KE.A0A.AOJ(1291882252, 3), new AppRestartLogger$onAppTaskRemoved$1((AnonymousClass4D7) null, now, currentTimeMillis), (C262224Cq) AnonymousClass1KE.A0D.getValue());
            } else {
                0tS A013 = 0tS.A4E.A01(this);
                0s0 r2 = A013.A20;
                AnonymousClass0YZ[] r3 = 0tS.A4G;
                r2.Epx(A013, Long.valueOf(now), r3[68]);
                A013.A21.Epx(A013, Long.valueOf(currentTimeMillis), r3[69]);
            }
            C279024xx r4 = AnonymousClass1KE.A05;
            if (r4 != null && r4.A03) {
                02m r32 = r4.A08;
                r32.markerPoint(817897470, "app_terminated");
                r32.markerAnnotate(817897470, "app_terminated_on_same_module", 0qQ.A0K(r4.A0B, r4.A01));
                r4.A09.run();
            }
            AnonymousClass1KE.A08 = true;
            if (!A01) {
                stopSelf();
            }
        }
    }

    public final void onDestroy() {
        int A04 = AnonymousClass0fD.A04(927670871);
        super.onDestroy();
        C305926Kc.A00(this);
        if (!AnonymousClass1KE.A07 || AnonymousClass1KE.A08) {
            AnonymousClass1KE.A09 = true;
        } else {
            Context applicationContext = getApplicationContext();
            try {
                applicationContext.startService(new Intent(applicationContext, getClass()));
            } catch (Exception unused) {
            }
        }
        AnonymousClass0fD.A0B(834886698, A04);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(374556871);
        if (intent != null) {
            0eG.A01.A01(this, intent);
        }
        int i3 = 1;
        this.A00 = true;
        AnonymousClass1KE.A09 = false;
        AnonymousClass1KE.A06 = getClass();
        if (!A02) {
            i3 = 2;
        }
        AnonymousClass0fD.A0B(420134160, A04);
        return i3;
    }
}
