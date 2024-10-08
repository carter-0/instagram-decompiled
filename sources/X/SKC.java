package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.concurrent.Callable;

public abstract class SKC {
    static {
        AnonymousClass389.A01("Alarms");
    }

    public static void A01(Context context, C255373u1 r4, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent A0A = C66580MXl.A0A(context, SystemAlarmService.class);
        A0A.setAction("ACTION_DELAY_MET");
        Sg5.A00(A0A, r4);
        PendingIntent service = PendingIntent.getService(context, i, A0A, 603979776);
        if (service != null && alarmManager != null) {
            AnonymousClass389.A00();
            alarmManager.cancel(service);
        }
    }

    public static void A00(Context context, WorkDatabase workDatabase, C255373u1 r7, long j) {
        int A0M;
        AnonymousClass392 A02 = workDatabase.A02();
        C255383u2 C3e = A02.C3e(r7);
        if (C3e != null) {
            A0M = C3e.A01;
            A01(context, r7, A0M);
        } else {
            C255353tz r3 = new C255353tz(workDatabase);
            Object runInTransaction = r3.A00.runInTransaction((Callable) new TNH(r3, 2));
            0qQ.A07(runInTransaction);
            A0M = AnonymousClass7TE.A0M(runInTransaction);
            A02.CNX(new C255383u2(r7.A01, r7.A00, A0M));
        }
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent A0A = C66580MXl.A0A(context, SystemAlarmService.class);
        A0A.setAction("ACTION_DELAY_MET");
        Sg5.A00(A0A, r7);
        PendingIntent service = PendingIntent.getService(context, A0M, A0A, 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
