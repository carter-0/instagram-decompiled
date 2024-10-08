package X;

/* renamed from: X.IjD  reason: case insensitive filesystem */
public final class C57958IjD implements Runnable {
    public final /* synthetic */ C369968vc A00;
    public final /* synthetic */ GO1 A01;
    public final /* synthetic */ C53151GjN A02;
    public final /* synthetic */ C53081GiF A03;

    public C57958IjD(C369968vc r1, GO1 go1, C53151GjN gjN, C53081GiF giF) {
        this.A02 = gjN;
        this.A00 = r1;
        this.A01 = go1;
        this.A03 = giF;
    }

    public final void run() {
        C53151GjN gjN = this.A02;
        if (0qQ.A0K(gjN.A00, this.A00)) {
            gjN.A01 = this.A01;
            C53081GiF.A02(gjN, this.A03);
        }
    }
}
