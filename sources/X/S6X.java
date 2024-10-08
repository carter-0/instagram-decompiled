package X;

import android.os.Handler;
import java.lang.ref.Reference;
import java.util.Map;

public final class S6X {
    public final Handler A00 = AnonymousClass7TF.A0D();
    public final Object A01 = Pxe.A0p();
    public final Map A02 = AnonymousClass7TE.A1H();
    public final Map A03 = AnonymousClass7TE.A1H();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final 0sP A05;

    public S6X() {
        C13387TXw tXw = C13387TXw.A00;
        0qQ.A0B(tXw, 1);
        this.A05 = tXw;
    }

    public final Object A00(Object obj) {
        Object obj2;
        synchronized (this.A01) {
            try {
                obj2 = this.A03.get(obj);
                if (obj2 == null) {
                    Reference reference = (Reference) this.A04.get(obj);
                    if (reference != null) {
                        obj2 = reference.get();
                    } else {
                        obj2 = null;
                    }
                }
                A02(obj);
            } catch (Throwable th) {
                A02(obj);
                throw th;
            }
        }
        return obj2;
    }

    public final void A01(long j, Object obj, Object obj2, boolean z) {
        synchronized (this.A01) {
            A02(obj);
            this.A03.put(obj, obj2);
            TJJ tjj = new TJJ(this, obj, z);
            this.A02.put(obj, tjj);
            this.A00.postDelayed(tjj, j);
        }
    }

    public final void A02(Object obj) {
        synchronized (this.A01) {
            this.A03.remove(obj);
            this.A04.remove(obj);
            Map map = this.A02;
            Runnable runnable = (Runnable) map.get(obj);
            if (runnable != null) {
                this.A00.removeCallbacks(runnable);
            }
            map.remove(obj);
        }
    }
}
