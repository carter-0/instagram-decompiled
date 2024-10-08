package X;

import android.content.Context;
import android.os.Handler;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SHT {
    public static final Executor A04 = Executors.newSingleThreadExecutor();
    public final Handler A00;
    public final C10935S1o A01;
    public final C10778Rxy A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public SHT(Context context, C13575Td0 td0) {
        AnonymousClass3RA A002 = AnonymousClass3RA.A00(context);
        this.A01 = new C10935S1o(new C10227Ron(td0), "725056107548211|0e20c3123a90c76c02c901b7415ff67f", new SHM(context, A002, "MQTT", (Map) null).A01());
        this.A00 = new Q7r(context.getMainLooper(), this, 0);
        this.A02 = new C10778Rxy(A002.A01, A002.A00);
    }

    public final void A00(S6G s6g) {
        A04.execute(new TGD(s6g, this));
    }
}
