package X;

public final class M8A implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LPE A01;

    public M8A(LPE lpe, long j) {
        this.A01 = lpe;
        this.A00 = j;
    }

    public final void run() {
        MTC mtc = this.A01.A02;
        if (mtc != null) {
            mtc.DBF(this.A00);
        }
    }
}
