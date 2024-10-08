package com.facebook.common.jobscheduler.compat;

import X.002;
import X.0KC;
import X.0Sy;
import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C278864xe;
import X.C41845B3m;
import X.C66580MXl;
import X.DbV;
import X.Pxe;
import X.Q5Y;
import X.RJR;
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

public abstract class GcmTaskServiceCompat extends Q5Y {
    public static GoogleApiAvailability A00 = GoogleApiAvailability.A00;
    public static final long A01;
    public static final long A02;

    public abstract C278864xe A00();

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A02 = timeUnit.toMillis(5);
        A01 = timeUnit.toMillis(2);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Throwable th;
        int i3;
        int i4;
        int i5;
        int A04 = AnonymousClass0fD.A04(2000333845);
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (action == null) {
                    i3 = 852979966;
                } else if (action.startsWith("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-")) {
                    Bundle extras = intent.getExtras();
                    if (extras.getString("job_tag", (String) null) != null) {
                        Task task = (Task) extras.getParcelable("task");
                        if (task != null) {
                            int i6 = extras.getInt("num_failures", -1);
                            if (i6 > 0) {
                                int A05 = Pxe.A05(this, A00);
                                if (A05 == 0) {
                                    try {
                                        SSK.A01(this).A03(task);
                                    } catch (IllegalArgumentException e) {
                                        RV0.A00(new ComponentName(this, task.A00), this, e);
                                    }
                                } else if (i6 >= 3) {
                                    String str = task.A01;
                                    boolean z = GooglePlayServicesUtil.A00;
                                    0KC.A0Q("GcmTaskServiceCompat", "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", new Object[]{str, ConnectionResult.A00(A05)});
                                } else {
                                    boolean z2 = GooglePlayServicesUtil.A00;
                                    int i7 = i6 + 1;
                                    try {
                                        String str2 = task.A01;
                                        Intent intent2 = C66580MXl.A0A(this, Class.forName(task.A00)).setAction(002.A0R("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str2)).setPackage(getPackageName());
                                        Bundle A0C = DbV.A0C("job_tag", str2);
                                        A0C.putParcelable("task", task);
                                        A0C.putInt("num_failures", i7);
                                        intent2.putExtras(A0C);
                                        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                                        0Sy r6 = new 0Sy();
                                        r6.A0A(intent2);
                                        r6.A08();
                                        alarmManager.set(2, SystemClock.elapsedRealtime() + A02, r6.A03(this, 0, 134217728));
                                    } catch (ClassNotFoundException e2) {
                                        th = C41845B3m.A0j(e2);
                                    }
                                }
                                i3 = 1283764449;
                            } else {
                                th = new Exception(002.A0O("invalid num_failures: ", i6));
                            }
                        } else {
                            th = new Exception("Missing task");
                        }
                    } else {
                        StringBuilder A1A = AnonymousClass7TE.A1A();
                        A1A.append("Invalid job_tag: ");
                        th = new Exception(AnonymousClass7TF.A0i(extras.get("job_tag"), A1A));
                    }
                } else {
                    if (action.startsWith("com.google")) {
                        i4 = super.onStartCommand(intent, i, i2);
                        i5 = 609333806;
                    } else {
                        A00();
                        i4 = 2;
                        i5 = -1133190647;
                    }
                    AnonymousClass0fD.A0B(i5, A04);
                    return i4;
                }
                AnonymousClass0fD.A0B(i3, A04);
                return 2;
            } catch (RJR e3) {
                0KC.A0F("GcmTaskServiceCompat", "Unexpected service start parameters", e3);
                AnonymousClass0fD.A0B(-647072025, A04);
                return 2;
            }
        } else {
            th = new Exception("Received a null intent, did you ever return START_STICKY?");
            AnonymousClass0fD.A0B(-1344329694, A04);
        }
        throw th;
    }
}
