package X;

import android.net.NetworkInfo;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.6AJ  reason: invalid class name */
public final class AnonymousClass6AJ implements AnonymousClass0qK {
    public static final AnonymousClass6AK A03 = new Object();
    public static volatile AnonymousClass6AJ A04;
    public final NetworkSession A00;
    public final AtomicBoolean A01 = new AtomicBoolean(false);
    public final AtomicBoolean A02 = new AtomicBoolean(false);

    public final void onConnectionChanged(NetworkInfo networkInfo) {
        boolean isConnected;
        if (networkInfo == null) {
            isConnected = false;
        } else {
            isConnected = networkInfo.isConnected();
        }
        synchronized (this) {
            AtomicBoolean atomicBoolean = this.A01;
            if (atomicBoolean.get() != isConnected) {
                atomicBoolean.set(isConnected);
                Execution.executeAsync(new AnonymousClass6AL(this, isConnected), (AccountSession) null, 1);
            }
        }
    }

    public AnonymousClass6AJ(NetworkSession networkSession) {
        this.A00 = networkSession;
    }
}
