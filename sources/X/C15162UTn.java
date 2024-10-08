package X;

/* renamed from: X.UTn  reason: case insensitive filesystem */
public final class C15162UTn extends C232922uf {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C15162UTn(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void DmC(2cs r3) {
        if (this.A00 != 0) {
            ((UAW) this.A02).A03.remove(this.A01);
            return;
        }
        ((Runnable) this.A02).run();
        r3.A0B(this);
    }
}
