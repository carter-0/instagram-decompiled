package X;

/* renamed from: X.M6m  reason: case insensitive filesystem */
public final class C65975M6m implements Runnable {
    public final /* synthetic */ MV5 A00;
    public final /* synthetic */ String A01;

    public C65975M6m(MV5 mv5, String str) {
        this.A00 = mv5;
        this.A01 = str;
    }

    public final void run() {
        MV5 mv5 = this.A00;
        if (mv5 != null) {
            mv5.onFinish();
            mv5.Doe(this.A01);
        }
    }
}
