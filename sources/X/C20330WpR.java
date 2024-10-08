package X;

/* renamed from: X.WpR  reason: case insensitive filesystem */
public final class C20330WpR implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C17705Vca A01;
    public final /* synthetic */ C16403UuL A02;
    public final /* synthetic */ Integer A03;

    public C20330WpR(C17705Vca vca, C16403UuL uuL, Integer num, long j) {
        this.A02 = uuL;
        this.A01 = vca;
        this.A03 = num;
        this.A00 = j;
    }

    public final void run() {
        C16403UuL.A00(this.A01, this.A02, this.A03);
    }
}
