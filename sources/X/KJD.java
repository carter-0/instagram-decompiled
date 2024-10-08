package X;

public final class KJD extends 0ng {
    public final /* synthetic */ double A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ 1Ln A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KJD(1Ln r4, double d, int i, int i2, int i3, long j) {
        super(2015553371, 3, false, false);
        this.A05 = r4;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A00 = d;
    }

    public final void run() {
        1Ln r2 = this.A05;
        r2.A0Q("number_of_signals_to_write", DbS.A0j(this.A02));
        r2.A0Q("number_of_signals_write_success", DbS.A0j(this.A03));
        r2.A0Q("number_of_signals_in_cache", DbS.A0j(this.A01));
        r2.A0Q("cache_size_in_bytes", Long.valueOf(this.A04));
        r2.A0P("time_spent_in_ms", Double.valueOf(this.A00));
        r2.Cgf();
    }
}
