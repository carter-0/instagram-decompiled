package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public final class A9T {
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Handler A03;
    public final C341687nM A04;
    public final LinkedList A05 = new LinkedList();
    public final AtomicInteger A06 = new AtomicInteger(0);

    public final synchronized ATP A00() {
        if (!this.A01) {
            this.A00++;
        } else {
            throw AnonymousClass7TE.A0z("Cannot generate callbacks after complete is called");
        }
        return new ATP(this, 1);
    }

    public final synchronized void A01() {
        this.A01 = true;
        if (this.A06.get() == this.A00) {
            C18097VlR.A01(this.A04, this.A03);
        }
    }

    public A9T(C341687nM r3, Handler handler) {
        this.A04 = r3;
        this.A03 = handler;
    }
}
