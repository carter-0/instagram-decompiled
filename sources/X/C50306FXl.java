package X;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.instagram.registrationpush.RegistrationPushAlarmReceiver;

/* renamed from: X.FXl  reason: case insensitive filesystem */
public final class C50306FXl implements C61110lV {
    public static C50306FXl A03;
    public final AlarmManager A00;
    public final NotificationManager A01;
    public final Context A02;

    public static synchronized C50306FXl A00(Context context) {
        C50306FXl fXl;
        synchronized (C50306FXl.class) {
            fXl = A03;
            if (fXl == null) {
                fXl = new C50306FXl(context.getApplicationContext());
                A03 = fXl;
            }
        }
        return fXl;
    }

    public final void A01() {
        0Sy r3 = new 0Sy();
        Context context = this.A02;
        Intent intent = new Intent(context, RegistrationPushAlarmReceiver.class);
        intent.setAction("RegistrationPush.PUSH_ACTION");
        r3.A0B(intent, context.getClassLoader());
        PendingIntent A022 = r3.A02(context, 0, 536870912);
        if (A022 != null) {
            this.A00.cancel(A022);
        }
        this.A01.cancel("registration", 64278);
    }

    public C50306FXl(Context context) {
        this.A02 = context;
        this.A00 = (AlarmManager) context.getSystemService("alarm");
        this.A01 = (NotificationManager) context.getSystemService("notification");
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-1551326841);
        A01();
        if (FGv.A05() || FGv.A06()) {
            14i.A06(this);
        } else {
            0Sy r5 = new 0Sy();
            Context context = this.A02;
            Intent intent = new Intent(context, RegistrationPushAlarmReceiver.class);
            intent.setAction("RegistrationPush.PUSH_ACTION");
            r5.A0B(intent, context.getClassLoader());
            PendingIntent A022 = r5.A02(context, 0, 134217728);
            this.A00.set(2, SystemClock.elapsedRealtime() + 1800000, A022);
        }
        AnonymousClass0fD.A0A(-2133824819, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-1020357735);
        A01();
        AnonymousClass0fD.A0A(-233288084, A032);
    }
}
