package X;

public final class THP implements Runnable {
    public final /* synthetic */ C12745T5f A00;
    public final /* synthetic */ C11002S4w A01;

    public THP(C12745T5f t5f, C11002S4w s4w) {
        this.A00 = t5f;
        this.A01 = s4w;
    }

    public final void run() {
        C12745T5f t5f = this.A00;
        if (!t5f.A00) {
            t5f.A00 = true;
            this.A01.A00();
        }
    }
}
