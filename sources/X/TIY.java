package X;

public final class TIY implements Runnable {
    public final /* synthetic */ C39733A6z A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Runnable A02;

    public TIY(C39733A6z a6z, Object obj, Runnable runnable) {
        this.A00 = a6z;
        this.A01 = obj;
        this.A02 = runnable;
    }

    public final void run() {
        C39733A6z a6z = this.A00;
        Object obj = this.A01;
        synchronized (a6z) {
            a6z.A02.remove(obj);
        }
        this.A02.run();
    }
}
