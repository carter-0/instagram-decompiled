package androidx.work.multiprocess;

import X.AnonymousClass385;
import X.AnonymousClass389;
import X.AnonymousClass38M;
import X.C13091TKy;
import X.Pxe;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.concurrent.Executor;

public class RemoteWorkManagerClient {
    public final Context A00;
    public final AnonymousClass385 A01;
    public final Object A02;
    public final Executor A03;
    public final Handler A04;
    public final C13091TKy A05;

    static {
        AnonymousClass389.A01("RemoteWorkManagerClient");
    }

    public RemoteWorkManagerClient(Context context, AnonymousClass385 r3, long j) {
        this.A00 = context.getApplicationContext();
        this.A01 = r3;
        this.A03 = ((AnonymousClass38M) r3.A06).A01;
        this.A02 = Pxe.A0p();
        this.A05 = new C13091TKy(this);
        this.A04 = Handler.createAsync(Looper.getMainLooper());
    }

    public RemoteWorkManagerClient(Context context, AnonymousClass385 r4) {
        this(context, r4, StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
    }

    public RemoteWorkManagerClient() {
    }
}
