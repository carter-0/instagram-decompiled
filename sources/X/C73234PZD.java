package X;

/* renamed from: X.PZD  reason: case insensitive filesystem */
public final class C73234PZD implements Runnable {
    public final /* synthetic */ O7O A00;
    public final /* synthetic */ String A01;

    public C73234PZD(O7O o7o, String str) {
        this.A00 = o7o;
        this.A01 = str;
    }

    public final void run() {
        O7O o7o = this.A00;
        String str = this.A01;
        C71874OsH osH = o7o.A00;
        osH.A04(str);
        C72918PPc pPc = osH.A02;
        pPc.A0H = true;
        pPc.A01 = new NPE(str);
    }
}
