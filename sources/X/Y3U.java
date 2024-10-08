package X;

public final class Y3U implements Runnable {
    public final /* synthetic */ L9Z A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ C62320sa A02;

    public Y3U(L9Z l9z, String str, C62320sa r3) {
        this.A00 = l9z;
        this.A01 = str;
        this.A02 = r3;
    }

    public final void run() {
        0sP r3 = this.A00.A02;
        if (r3 != null) {
            r3.invoke(new H91(this.A01, this.A02));
        }
    }
}
