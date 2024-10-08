package X;

public final class TB7 implements Runnable {
    public final /* synthetic */ Object A00;

    public TB7(Object obj) {
        this.A00 = obj;
    }

    public final void run() {
        try {
            Object obj = this.A00;
            synchronized (obj) {
                obj.notify();
            }
        } catch (Exception unused) {
        }
    }
}
