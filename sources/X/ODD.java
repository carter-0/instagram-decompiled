package X;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

public final class ODD {
    public final Handler A00;
    public final C70911ORg A01;
    public final AtomicReference A02 = new AtomicReference();

    public ODD(Looper looper, C70911ORg oRg) {
        this.A00 = new Handler(looper);
        this.A01 = oRg;
    }
}
