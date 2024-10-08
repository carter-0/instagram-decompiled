package X;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;

/* renamed from: X.Sny  reason: case insensitive filesystem */
public abstract class C12150Sny implements C13771Tgk {
    public final Handler A00 = AnonymousClass7TF.A0D();

    public final boolean ADg(Context context, Intent intent, ServiceConnection serviceConnection) {
        0qQ.A0B(serviceConnection, 2);
        this.A00.postDelayed(new C12884TBy(serviceConnection), 500);
        return true;
    }

    public final void FIS(Context context, ServiceConnection serviceConnection) {
    }
}
