package X;

/* renamed from: X.If9  reason: case insensitive filesystem */
public final class C57706If9 implements Runnable {
    public final /* synthetic */ C55962HqT A00;

    public C57706If9(C55962HqT hqT) {
        this.A00 = hqT;
    }

    public final void run() {
        C55962HqT hqT = this.A00;
        hqT.A03.invoke();
        hqT.A01.postDelayed(this, 200);
    }
}
