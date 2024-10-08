package X;

/* renamed from: X.AqQ  reason: case insensitive filesystem */
public final class C41228AqQ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C365248mm A02;
    public final /* synthetic */ C345557ti A03;
    public final /* synthetic */ A3N A04;

    public C41228AqQ(C365248mm r1, C345557ti r2, A3N a3n, int i, int i2) {
        this.A04 = a3n;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = r2;
        this.A02 = r1;
    }

    public final void run() {
        AJ3 aj3 = this.A04.A00;
        aj3.A03 = this.A01;
        aj3.A02 = this.A00;
        aj3.A0C = this.A03;
        C344587s6 r2 = new C344587s6(aj3.A0Q, 3);
        aj3.A08 = r2;
        C365248mm r0 = this.A02;
        if (r0 != null) {
            r0.ErU(r2, 1);
        }
        C345557ti r1 = aj3.A0C;
        r1.getClass();
        aj3.A0F = new AHA(r1);
        AJ3.A01(aj3);
    }
}
