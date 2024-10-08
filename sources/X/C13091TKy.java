package X;

import androidx.work.multiprocess.RemoteWorkManagerClient;

/* renamed from: X.TKy  reason: case insensitive filesystem */
public final class C13091TKy implements Runnable {
    public final RemoteWorkManagerClient A00;

    static {
        AnonymousClass389.A01("SessionHandler");
    }

    public final void run() {
        synchronized (this.A00.A02) {
        }
    }

    public C13091TKy(RemoteWorkManagerClient remoteWorkManagerClient) {
        this.A00 = remoteWorkManagerClient;
    }
}
