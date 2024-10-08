package X;

public final class Y3T implements Runnable {
    public final /* synthetic */ C8917RFk A00;
    public final /* synthetic */ L9Z A01;
    public final /* synthetic */ String A02;

    public Y3T(C8917RFk rFk, L9Z l9z, String str) {
        this.A01 = l9z;
        this.A02 = str;
        this.A00 = rFk;
    }

    public final void run() {
        L9Z l9z = this.A01;
        0sP r3 = l9z.A02;
        if (r3 != null) {
            r3.invoke(new KK5(this.A00, this.A02));
        }
        l9z.A02 = null;
    }
}
