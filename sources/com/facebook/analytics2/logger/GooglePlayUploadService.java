package com.facebook.analytics2.logger;

import X.002;
import X.0KC;
import X.0Sy;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C251463n9;
import X.C258093yS;
import X.C270404gg;
import X.C66580MXl;
import X.Pxe;
import X.Pxf;
import X.Q5Y;
import X.RV0;
import X.SSK;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.gcmcompat.Task;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class GooglePlayUploadService extends Q5Y {
    public static boolean A01;
    public static final long A02;
    public static final long A03;
    public static final AtomicInteger A04 = Pxf.A10();
    public C251463n9 A00;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A02 = timeUnit.toMillis(2);
        A03 = timeUnit.toMillis(5);
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(-1030730689);
        super.onCreate();
        this.A00 = C251463n9.A00(this);
        AnonymousClass0fD.A0B(56126258, A042);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Exception exc;
        int i3;
        int i4;
        int A042 = AnonymousClass0fD.A04(906668551);
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (action.startsWith("com.facebook.analytics2.logger.gms.TRY_SCHEDULE")) {
                    Bundle extras = intent.getExtras();
                    int i5 = extras.getInt("job_id", -1);
                    if (i5 != -1) {
                        Task task = (Task) extras.getParcelable("task");
                        if (task != null) {
                            int A05 = Pxe.A05(this, GoogleApiAvailability.A00);
                            if (A05 == 0) {
                                try {
                                    SSK.A01(this).A03(task);
                                } catch (IllegalArgumentException e) {
                                    RV0.A00(new ComponentName(this, task.A00), this, e);
                                }
                                A04.set(0);
                            } else if (A04.incrementAndGet() == 3) {
                                boolean z = GooglePlayServicesUtil.A00;
                                0KC.A0Q("GooglePlayUploadService", "Google Play Services became consistently unavailable after initial check: %s", new Object[]{ConnectionResult.A00(A05)});
                            } else {
                                boolean z2 = GooglePlayServicesUtil.A00;
                                0Sy r2 = new 0Sy();
                                Intent action2 = C66580MXl.A0A(this, GooglePlayUploadService.class).setAction(002.A0O("com.facebook.analytics2.logger.gms.TRY_SCHEDULE-", i5));
                                Bundle A0a = AnonymousClass7TE.A0a();
                                A0a.putInt("job_id", i5);
                                A0a.putParcelable("task", task);
                                action2.putExtras(A0a);
                                r2.A0B(action2, getClassLoader());
                                ((AlarmManager) getSystemService("alarm")).set(2, SystemClock.elapsedRealtime() + A03, r2.A03(this, 0, 134217728));
                            }
                            AnonymousClass0fD.A0B(-477882720, A042);
                            return 2;
                        }
                        exc = new Exception("Missing task");
                    } else {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Invalid job_id: ");
                        exc = new Exception(AnonymousClass7TF.A0i(extras.get("job_id"), A1A));
                    }
                } else {
                    if (action.startsWith("com.facebook")) {
                        i3 = this.A00.A02(intent, new C270404gg(this, i2));
                        i4 = 456369191;
                    } else {
                        i3 = super.onStartCommand(intent, i, i2);
                        i4 = -229868435;
                    }
                    AnonymousClass0fD.A0B(i4, A042);
                    return i3;
                }
            } catch (C258093yS e2) {
                0KC.A0P("GooglePlayUploadService", "Unexpected service start parameters: %s", Pxf.A1Z(e2));
                stopSelf(i2);
                AnonymousClass0fD.A0B(-758250566, A042);
                return 2;
            }
        } else {
            exc = new Exception("Received a null intent, did you ever return START_STICKY?");
            AnonymousClass0fD.A0B(-1634905976, A042);
        }
        throw exc;
    }
}
