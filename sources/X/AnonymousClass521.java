package X;

/* renamed from: X.521  reason: invalid class name */
public final class AnonymousClass521 implements C256223vQ {
    public final /* synthetic */ AnonymousClass520 A00;
    public final /* synthetic */ 1xQ A01;

    public AnonymousClass521(AnonymousClass520 r1, 1xQ r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void Dxo() {
        this.A01.A04.remove(this);
    }

    public final void Dxp(boolean z) {
        1xQ r2 = this.A01;
        r2.A04.remove(this);
        1xQ.A00(this.A00, r2, false);
    }

    public final void Dxq(boolean z) {
        1xQ r1 = this.A01;
        r1.A04.remove(this);
        1xQ.A00(this.A00, r1, z);
    }
}
