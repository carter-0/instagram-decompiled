package X;

/* renamed from: X.GMh  reason: case insensitive filesystem */
public final class C52291GMh implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GD6 A01;
    public final /* synthetic */ C320876t6 A02;

    public C52291GMh(GD6 gd6, C320876t6 r2, int i) {
        this.A01 = gd6;
        this.A02 = r2;
        this.A00 = i;
    }

    public final void run() {
        GD6 gd6 = this.A01;
        gd6.A07.A07(gd6.A08, this.A02, this.A00);
    }
}
