package X;

public final class M9F implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass9RG A02;

    public M9F(AnonymousClass9RG r1, int i, int i2) {
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void run() {
        AnonymousClass9RG r3 = this.A02;
        int i = r3.A01;
        int i2 = this.A01;
        if (i != i2 || r3.A00 != this.A00) {
            r3.A01 = i2;
            r3.A00 = this.A00;
        }
    }
}
