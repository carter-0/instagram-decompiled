package X;

public final class PSL implements 1aV {
    public final /* synthetic */ 1a8 A00;
    public final /* synthetic */ Runnable A01;

    public PSL(1a8 r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        this.A00.A01();
        this.A01.run();
    }
}
