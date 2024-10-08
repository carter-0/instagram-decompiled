package X;

public final class TIA implements Runnable {
    public final /* synthetic */ R9M A00;
    public final /* synthetic */ C7322Q3y A01;
    public final /* synthetic */ 0sP A02;

    public TIA(R9M r9m, C7322Q3y q3y, 0sP r3) {
        this.A02 = r3;
        this.A01 = q3y;
        this.A00 = r9m;
    }

    public final void run() {
        0sP r4 = this.A02;
        C7322Q3y q3y = this.A01;
        R9M r9m = this.A00;
        r4.invoke(new C11017S5o(new C7305Q3h(0Yt.A0B(r9m.A02), 0Yt.A0B(r9m.A01)), q3y));
    }
}
