package androidx.work.impl.foreground;

import X.AnonymousClass0fD;
import X.AnonymousClass0h3;
import X.AnonymousClass389;
import X.AnonymousClass7TF;
import X.Q4Y;
import X.TZm;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

public class SystemForegroundService extends AnonymousClass0h3 implements TZm {
    public static SystemForegroundService A04;
    public static final String A05 = AnonymousClass389.A01("SystemFgService");
    public NotificationManager A00;
    public Handler A01;
    public Q4Y A02;
    public boolean A03;

    private void A00() {
        this.A01 = AnonymousClass7TF.A0D();
        this.A00 = (NotificationManager) getApplicationContext().getSystemService("notification");
        Q4Y q4y = new Q4Y(getApplicationContext());
        this.A02 = q4y;
        if (q4y.A01 != null) {
            AnonymousClass389.A00();
            Log.e(Q4Y.A0A, "A callback already exists.");
            return;
        }
        q4y.A01 = this;
    }

    public final void onCreate() {
        int A042 = AnonymousClass0fD.A04(542854367);
        super.onCreate();
        A04 = this;
        A00();
        AnonymousClass0fD.A0B(-633789508, A042);
    }

    public final void onDestroy() {
        int A042 = AnonymousClass0fD.A04(-566810271);
        super.onDestroy();
        this.A02.A00();
        AnonymousClass0fD.A0B(1202368101, A042);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A042 = AnonymousClass0fD.A04(657847458);
        super.onStartCommand(intent, i, i2);
        if (this.A03) {
            AnonymousClass389.A00();
            this.A02.A00();
            A00();
            this.A03 = false;
        }
        if (intent != null) {
            this.A02.A01(intent);
        }
        AnonymousClass0fD.A0B(-2096868043, A042);
        return 3;
    }
}
