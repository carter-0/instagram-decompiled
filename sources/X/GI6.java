package X;

public final class GI6 implements Runnable {
    public final /* synthetic */ C293435kj A00;
    public final /* synthetic */ AnonymousClass3W1 A01;

    public GI6(C293435kj r1, AnonymousClass3W1 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3W1 r2 = this.A01;
        if (!r2.A1l) {
            if (true != r2.A2B) {
                r2.A2B = true;
                AnonymousClass3W1.A00(r2, 33);
            }
            r2.A1L = "delay";
            this.A00.A00.remove(C51969G9p.A0q(r2));
        }
    }
}
