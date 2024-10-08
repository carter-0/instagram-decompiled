package X;

/* renamed from: X.Mbg  reason: case insensitive filesystem */
public final class C66735Mbg implements Runnable {
    public final /* synthetic */ C66728MbZ A00;
    public final /* synthetic */ C67103MiN A01;
    public final /* synthetic */ Object A02;

    public C66735Mbg(C66728MbZ mbZ, C67103MiN miN, Object obj) {
        this.A00 = mbZ;
        this.A01 = miN;
        this.A02 = obj;
    }

    public final void run() {
        if (!this.A00.A00) {
            C67104MiO miO = this.A01.A04;
            Object obj = this.A02;
            0qQ.A0B(obj, 0);
            miO.A00.A0A.accept(obj);
        }
    }
}
