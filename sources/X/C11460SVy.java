package X;

import android.os.IBinder;
import androidx.work.multiprocess.RemoteCallback;

/* renamed from: X.SVy  reason: case insensitive filesystem */
public final class C11460SVy implements IBinder.DeathRecipient {
    public final RemoteCallback A00;

    public final void binderDied() {
        this.A00.DEc("Binder died");
    }

    public C11460SVy(RemoteCallback remoteCallback) {
        this.A00 = remoteCallback;
    }
}
