package X;

/* renamed from: X.Pbd  reason: case insensitive filesystem */
public final class C73380Pbd implements Runnable {
    public final /* synthetic */ AnonymousClass7NT A00;
    public final /* synthetic */ AnonymousClass5FV A01;
    public final /* synthetic */ PB1 A02;
    public final /* synthetic */ C68076Mzh A03;
    public final /* synthetic */ NYH A04;

    public C73380Pbd(AnonymousClass7NT r1, AnonymousClass5FV r2, PB1 pb1, C68076Mzh mzh, NYH nyh) {
        this.A02 = pb1;
        this.A03 = mzh;
        this.A04 = nyh;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        PB1.A00(this.A00, this.A01, this.A02, this.A03, this.A04, (String) null);
    }
}
