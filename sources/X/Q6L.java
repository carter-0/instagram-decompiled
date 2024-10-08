package X;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Iterator;

public final class Q6L extends ContentObserver {
    public final /* synthetic */ C11251SHl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q6L(C11251SHl sHl) {
        super((Handler) null);
        this.A00 = sHl;
    }

    public final void onChange(boolean z) {
        C11251SHl sHl = this.A00;
        synchronized (sHl.A02) {
            sHl.A06 = null;
            SRH.A05.incrementAndGet();
        }
        synchronized (sHl) {
            Iterator it = sHl.A03.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("zza");
            }
        }
    }
}
