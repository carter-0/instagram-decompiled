package X;

/* renamed from: X.Va2  reason: case insensitive filesystem */
public final class C17549Va2 {
    public int A00;
    public C231402rc A01 = new UAY(this, 1);
    public final X0A A02;
    public final 2Rw A03;
    public final X0B A04;
    public final C59532JNe A05;

    public C17549Va2(X0A x0a, 2Rw r4, X0B x0b, X0D x0d) {
        this.A03 = r4;
        this.A02 = x0a;
        this.A05 = new WEY(this, (WEZ) x0d);
        this.A04 = x0b;
        this.A00 = r4.getItemCount();
        r4.registerAdapterDataObserver(this.A01);
    }
}
