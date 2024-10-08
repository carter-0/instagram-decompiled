package X;

public final /* synthetic */ class THM implements Runnable {
    public final /* synthetic */ C365498nD A00;
    public final /* synthetic */ S26 A01;

    public /* synthetic */ THM(C365498nD r1, S26 s26) {
        this.A01 = s26;
        this.A00 = r1;
    }

    public final void run() {
        S26 s26 = this.A01;
        C365498nD r3 = this.A00;
        int decrementAndGet = s26.A02.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet == 0) {
                R2v r2v = (R2v) s26;
                synchronized (r2v) {
                    R2v.A04 = true;
                    r2v.A00.FPO();
                }
                s26.A01.set(false);
            }
            C12820T8p.A00.clear();
            C9996Rkq.A00.clear();
            r3.A01((Object) null);
            return;
        }
        throw Pxe.A0i();
    }
}
