package X;

public final class M65 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C64908Lk8 A01;

    public M65(C64908Lk8 lk8, int i) {
        this.A01 = lk8;
        this.A00 = i;
    }

    public final void run() {
        C64908Lk8 lk8 = this.A01;
        U9d u9d = lk8.A03;
        u9d.A00 = this.A00;
        C252553pI r0 = lk8.A04.A0D;
        if (r0 != null) {
            r0.A0t(u9d);
        }
    }
}
