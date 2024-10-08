package X;

public final /* synthetic */ class TH5 implements Runnable {
    public final /* synthetic */ C13635Te1 A00;
    public final /* synthetic */ C10598Rus A01;

    public /* synthetic */ TH5(C13635Te1 te1, C10598Rus rus) {
        this.A01 = rus;
        this.A00 = te1;
    }

    public final void run() {
        C10598Rus rus = this.A01;
        C13635Te1 te1 = this.A00;
        Object obj = rus.A02;
        if (obj != null) {
            try {
                te1.Cs6(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }
}
