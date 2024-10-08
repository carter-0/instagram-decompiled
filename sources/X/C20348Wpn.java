package X;

/* renamed from: X.Wpn  reason: case insensitive filesystem */
public final class C20348Wpn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C17705Vca A01;
    public final /* synthetic */ C16403UuL A02;
    public final /* synthetic */ Integer A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C20348Wpn(C17705Vca vca, C16403UuL uuL, Integer num, String str, String str2, int i) {
        this.A02 = uuL;
        this.A01 = vca;
        this.A00 = i;
        this.A03 = num;
        this.A04 = str;
        this.A05 = str2;
    }

    public final void run() {
        C16403UuL uuL = this.A02;
        C16403UuL.A01(this.A01, uuL, this.A03, this.A04, this.A05, uuL.A01.getMarkerId(), this.A00);
    }
}
