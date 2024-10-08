package X;

import android.os.Handler;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public final class A9U {
    public int A00 = 0;
    public boolean A01 = false;
    public boolean A02 = false;
    public final Handler A03;
    public final C341737nR A04;
    public final LinkedList A05 = new LinkedList();
    public final AtomicInteger A06 = new AtomicInteger(0);

    public final synchronized C40081AQl A00(Runnable runnable) {
        if (!this.A01) {
            this.A00++;
        } else {
            throw AnonymousClass7TE.A0z("Cannot generate callbacks after complete is called");
        }
        return new C40081AQl(0, runnable, this);
    }

    public final synchronized void A01() {
        this.A01 = true;
        if (this.A06.get() == this.A00) {
            C18091VlL.A00(this.A03, this.A04);
        }
    }

    public A9U(Handler handler, C341737nR r4) {
        this.A04 = r4;
        this.A03 = handler;
    }
}
