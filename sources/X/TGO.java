package X;

public final class TGO implements Runnable {
    public final /* synthetic */ C10843Rz3 A00;
    public final /* synthetic */ QCN A01;

    public TGO(C10843Rz3 rz3, QCN qcn) {
        this.A01 = qcn;
        this.A00 = rz3;
    }

    public final void run() {
        QCN qcn = this.A01;
        C7364Q8h q8h = qcn.A04;
        if (q8h == null) {
            0qQ.A0F("cameraViewWrapper");
            throw AnonymousClass00P.createAndThrow();
        }
        C10843Rz3 rz3 = this.A00;
        int i = rz3.A03;
        int i2 = rz3.A00;
        q8h.A02 = i;
        q8h.A01 = i2;
        q8h.A00 = rz3.A02;
        q8h.requestLayout();
        qcn.A09 = true;
    }
}
