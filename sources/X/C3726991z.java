package X;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* renamed from: X.91z  reason: invalid class name and case insensitive filesystem */
public final class C3726991z {
    public static C3726991z A01;
    public static final long A02 = TimeUnit.DAYS.toMillis(7);
    public final 0xa A00;

    public static final void A00(NotificationChannel notificationChannel, C3726991z r6) {
        String str;
        0xY AR4 = r6.A00.AR4();
        String id = notificationChannel.getId();
        String A0R = 002.A0R(id, "_IS_ENABLED");
        boolean z = false;
        if (notificationChannel.getImportance() != 0) {
            z = true;
        }
        AR4.E5T(A0R, z);
        AR4.E5Z(002.A0R(id, "_IMPORTANCE"), notificationChannel.getImportance());
        AR4.E5T(002.A0R(id, "_SHOULD_SHOW_LIGHT"), notificationChannel.shouldShowLights());
        AR4.E5T(002.A0R(id, "_SHOULD_VIBRATE"), notificationChannel.shouldVibrate());
        AR4.E5Z(002.A0R(id, "_LOCKSCREEN_VISIBILITY"), notificationChannel.getLockscreenVisibility());
        Uri sound = notificationChannel.getSound();
        if (sound != null) {
            str = sound.toString();
        } else {
            str = "";
        }
        0qQ.A0A(str);
        AR4.E5g(002.A0R(id, "_SOUND"), str);
        AR4.apply();
    }

    public C3726991z(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("NOTIFICATION_CHANNELS", 0);
        0qQ.A07(sharedPreferences);
        this.A00 = new 0tX(sharedPreferences, "NotificationChannelsPreferences");
    }

    public final void A01(boolean z) {
        if (0yU.A07(AnonymousClass0yP.A00(36316237707546775L))) {
            0nY.A00().ATE(new AnonymousClass9NP(this, z));
            return;
        }
        0xY AR4 = this.A00.AR4();
        AR4.E5T("NOTIFICATIONS_ARE_ENABLED", z);
        AR4.apply();
    }
}
