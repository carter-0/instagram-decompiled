package X;

public final class TKG implements Runnable {
    public final /* synthetic */ C13617Tdj A00;
    public final /* synthetic */ C11246SHg A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Throwable A04;

    public TKG(C13617Tdj tdj, C11246SHg sHg, Object obj, String str, Throwable th) {
        this.A01 = sHg;
        this.A00 = tdj;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = th;
    }

    public final void run() {
        this.A00.DfB(this.A02, this.A03, this.A04);
    }
}
