package X;

public final class JL0 extends AnonymousClass4DB implements Runnable {
    public final long A00;

    public final void run() {
        long j = this.A00;
        C241603Pv.A04(this.A00);
        A0Q(new AnonymousClass3EF(002.A0e(C273654mx.A00(513), " ms", j), this));
    }

    public JL0(AnonymousClass4D7 r2, long j) {
        super(r2, r2.getContext());
        this.A00 = j;
    }

    public final String A0G() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(super.A0G());
        A1A.append("(timeMillis=");
        A1A.append(this.A00);
        return AnonymousClass7TG.A0p(A1A);
    }
}
