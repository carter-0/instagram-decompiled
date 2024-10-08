package X;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class OKV {
    public CompletableFuture A00;
    public final Set A01 = DbS.A0y();

    public final synchronized void A00(String str) {
        synchronized (this) {
            0qQ.A0B(str, 0);
            Set set = this.A01;
            set.remove(str);
            if (set.isEmpty()) {
                CompletableFuture completableFuture = this.A00;
                if (completableFuture != null) {
                    completableFuture.complete(C60340gF.A00);
                    this.A00 = null;
                }
            }
        }
    }
}
