package X;

import java.util.List;
import java.util.concurrent.RunnableFuture;

/* renamed from: X.Txu  reason: case insensitive filesystem */
public final class C14534Txu implements Runnable {
    public final int A00;
    public final C14543Ty3 A01;
    public final List A02;
    public final boolean A03;

    public static void A00(AnonymousClass6SI r2) {
        RunnableFuture runnableFuture;
        RunnableFuture runnableFuture2;
        synchronized (r2) {
            runnableFuture = r2.A00;
        }
        if (runnableFuture == null || !runnableFuture.isCancelled()) {
            synchronized (r2) {
                runnableFuture2 = r2.A00;
            }
            if (runnableFuture2 != null && !runnableFuture2.isDone() && r2.A02.get() == -1) {
                r2.A00();
            }
        }
    }

    public final void run() {
        if (this.A03) {
            List list = this.A02;
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0 && !this.A01.A00.get()) {
                    A00(((C14538Txy) list.get(size)).A00);
                } else {
                    return;
                }
            }
        } else {
            int i = 0;
            while (true) {
                List list2 = this.A02;
                if (i < list2.size() && !this.A01.A00.get()) {
                    A00(((C14538Txy) list2.get(i)).A00);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public C14534Txu(C14543Ty3 ty3, List list, int i, boolean z) {
        this.A00 = i;
        this.A02 = list;
        this.A01 = ty3;
        this.A03 = z;
    }
}
