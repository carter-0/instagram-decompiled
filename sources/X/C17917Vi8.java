package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import com.instagram.android.R;

/* renamed from: X.Vi8  reason: case insensitive filesystem */
public final class C17917Vi8 {
    public boolean A00;
    public boolean A01;
    public final int A02 = 2SP.A01.A03();
    public final int A03;
    public final NotificationManager A04;
    public final Context A05;
    public final AnonymousClass0eM A06;
    public final NotificationChannel A07;

    public C17917Vi8(Context context, int i) {
        NotificationManager notificationManager;
        this.A05 = context;
        this.A03 = i;
        NotificationChannel notificationChannel = new NotificationChannel(AnonymousClass000.A00(3967), "sg_streaming_channel_name", 4);
        notificationChannel.setLockscreenVisibility(1);
        this.A07 = notificationChannel;
        Object systemService = context.getSystemService("notification");
        NotificationManager notificationManager2 = null;
        if ((systemService instanceof NotificationManager) && (notificationManager = (NotificationManager) systemService) != null) {
            notificationManager.createNotificationChannel(notificationChannel);
            notificationManager2 = notificationManager;
        }
        this.A04 = notificationManager2;
        this.A06 = AnonymousClass0eN.A01(new C73912Pln(this, 34));
    }

    public final void A00(boolean z) {
        NotificationManager notificationManager;
        if (this.A00 && z && this.A01 && (notificationManager = this.A04) != null) {
            int i = this.A02;
            AnonymousClass9Y4 r2 = new AnonymousClass9Y4(this.A05, this.A03);
            AnonymousClass9Y4.A02(r2);
            r2.A0B(r2.A00.getString(R.string.f0nameremoved));
            notificationManager.notify(i, r2.A03());
        }
    }
}
