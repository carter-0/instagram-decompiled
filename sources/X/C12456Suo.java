package X;

import java.util.concurrent.Executor;

/* renamed from: X.Suo  reason: case insensitive filesystem */
public final class C12456Suo implements C13735Tg7 {
    public final C13735Tg7 A00;
    public final Executor A01;

    public final void Cwz(Throwable th) {
        this.A01.execute(new C12984TGr(this, th));
    }

    public final void Cx0(C10586Rug rug) {
        this.A01.execute(new C12985TGs(rug, this));
    }

    public C12456Suo(C13735Tg7 tg7, Executor executor) {
        this.A01 = executor;
        this.A00 = tg7;
    }
}
