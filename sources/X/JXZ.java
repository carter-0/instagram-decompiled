package X;

public final class JXZ implements Runnable {
    public final /* synthetic */ 0sP A00;
    public final /* synthetic */ boolean A01;

    public JXZ(0sP r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        this.A00.invoke(Boolean.valueOf(this.A01));
    }
}
