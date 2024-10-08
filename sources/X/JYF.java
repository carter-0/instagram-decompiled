package X;

public final class JYF implements Runnable {
    public final /* synthetic */ JYD A00;
    public final /* synthetic */ C62320sa A01;

    public JYF(JYD jyd, C62320sa r2) {
        this.A00 = jyd;
        this.A01 = r2;
    }

    public final void run() {
        JYD jyd = this.A00;
        JYD.A0G(jyd, true);
        jyd.A03 = true;
        this.A01.invoke();
    }
}
