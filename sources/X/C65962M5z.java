package X;

/* renamed from: X.M5z  reason: case insensitive filesystem */
public final class C65962M5z implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ 0sP A01;

    public C65962M5z(String str, 0sP r2) {
        this.A01 = r2;
        this.A00 = str;
    }

    public final void run() {
        0sP r1 = this.A01;
        if (r1 != null) {
            r1.invoke(this.A00);
        }
    }
}
