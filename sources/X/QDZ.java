package X;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class QDZ extends C228962mc implements C13469Taw {
    public final Semaphore A00 = new Semaphore(0);
    public final Set A01;

    public final void A02() {
        this.A00.drainPermits();
        A09();
    }

    public final /* bridge */ /* synthetic */ Object A06() {
        int i = 0;
        for (AnonymousClass63S A0G : this.A01) {
            if (A0G.A0G(this)) {
                i++;
            }
        }
        try {
            this.A00.tryAcquire(i, 5, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException unused) {
            Pxe.A1F();
            return null;
        }
    }

    public QDZ(Context context, Set set) {
        super(context);
        this.A01 = set;
    }
}
