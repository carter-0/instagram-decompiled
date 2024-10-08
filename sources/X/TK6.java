package X;

public final class TK6 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C12139Snk A01;
    public final /* synthetic */ SBU A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public TK6(C12139Snk snk, SBU sbu, String str, byte[] bArr, long j) {
        this.A01 = snk;
        this.A03 = str;
        this.A04 = bArr;
        this.A00 = j;
        this.A02 = sbu;
    }

    public final void run() {
        AnonymousClass25T r3 = this.A01.A06;
        if (r3 != null) {
            r3.onMessageArrived(new C291065gS(this.A03, this.A04));
        }
    }
}
