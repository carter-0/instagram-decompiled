package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;

/* renamed from: X.TBy  reason: case insensitive filesystem */
public final class C12884TBy implements Runnable {
    public final /* synthetic */ ServiceConnection A00;

    public C12884TBy(ServiceConnection serviceConnection) {
        this.A00 = serviceConnection;
    }

    public final void run() {
        this.A00.onServiceConnected(new ComponentName("", ""), new Binder());
    }
}
