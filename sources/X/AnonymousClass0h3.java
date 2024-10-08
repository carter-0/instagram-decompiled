package X;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Deprecated;

/* renamed from: X.0h3  reason: invalid class name */
public abstract class AnonymousClass0h3 extends Service implements AnonymousClass07Z {
    public final C59951JcH A00 = new C59951JcH(this);

    public final AnonymousClass07V getLifecycle() {
        return this.A00.A01();
    }

    public IBinder onBind(Intent intent) {
        this.A00.A02();
        return null;
    }

    @Deprecated(message = "Deprecated in Java")
    public final void onStart(Intent intent, int i) {
        this.A00.A05();
        super.onStart(intent, i);
    }

    public void onCreate() {
        int A04 = AnonymousClass0fD.A04(786295562);
        this.A00.A03();
        super.onCreate();
        AnonymousClass0fD.A0B(619807071, A04);
    }

    public void onDestroy() {
        int A04 = AnonymousClass0fD.A04(1661363161);
        this.A00.A04();
        super.onDestroy();
        AnonymousClass0fD.A0B(-1692196149, A04);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        int A04 = AnonymousClass0fD.A04(-1616539017);
        if (intent != null) {
            0eG.A01.A01(this, intent);
        }
        int onStartCommand = super.onStartCommand(intent, i, i2);
        AnonymousClass0fD.A0B(2113204911, A04);
        return onStartCommand;
    }
}
