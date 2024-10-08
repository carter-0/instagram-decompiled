package X;

/* renamed from: X.Aot  reason: case insensitive filesystem */
public final /* synthetic */ class C41133Aot implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C41133Aot(AnonymousClass8BA r1, Runnable runnable, String str) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = runnable;
    }

    public final void run() {
        AnonymousClass8BA r0 = this.A00;
        String str = this.A02;
        Runnable runnable = this.A01;
        r0.A1Q.A02(str);
        runnable.run();
    }
}
