package X;

/* renamed from: X.M6t  reason: case insensitive filesystem */
public final class C65982M6t implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ LEG A01;

    public C65982M6t(LEG leg, int i) {
        this.A01 = leg;
        this.A00 = i;
    }

    public final void run() {
        this.A01.A08.scrollTo(this.A00, 0);
    }
}
