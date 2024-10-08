package X;

public final class TFW implements Runnable {
    public final /* synthetic */ C7580QKv A00;
    public final /* synthetic */ QLA A01;

    public TFW(C7580QKv qKv, QLA qla) {
        this.A00 = qKv;
        this.A01 = qla;
    }

    public final void run() {
        QLA qla = this.A01;
        C10185Ro1 ro1 = qla.A0C;
        if (ro1 != null) {
            ro1.A00.AI4(3, qla.A05());
        }
    }
}
