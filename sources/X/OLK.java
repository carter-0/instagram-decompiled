package X;

import android.media.projection.MediaProjection;
import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public final class OLK {
    public final OB4 A00;
    public final OAB A01;
    public final AtomicBoolean A02 = new AtomicBoolean();
    public final 0sP A03;
    public final Executor A04;

    public final void A00(MediaProjection mediaProjection) {
        if (Build.VERSION.SDK_INT < 29) {
            throw AnonymousClass7TE.A0z("Minimum SDK version is 29");
        } else if (this.A02.compareAndSet(false, true)) {
            this.A04.execute(new C73172PY7(mediaProjection, this));
        }
    }

    public OLK(OB4 ob4, OAB oab, Executor executor, 0sP r5) {
        C51972G9s.A1B(executor, r5);
        this.A04 = executor;
        this.A01 = oab;
        this.A00 = ob4;
        this.A03 = r5;
    }
}
