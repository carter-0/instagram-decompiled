package X;

/* renamed from: X.M5x  reason: case insensitive filesystem */
public final class C65960M5x implements Runnable {
    public final /* synthetic */ C15322UaU A00;
    public final /* synthetic */ String A01;

    public C65960M5x(C15322UaU uaU, String str) {
        this.A00 = uaU;
        this.A01 = str;
    }

    public final void run() {
        2MD A012 = 2MD.A01();
        C15322UaU uaU = this.A00;
        OIS A002 = OU0.A00(DbU.A0u(uaU.A0N));
        A002.A0G = "hec_appeal_notification_type";
        A002.A0H = this.A01;
        A002.A04 = C15322UaU.A00(uaU).A11;
        A002.A0I = false;
        JTT.A1O(A002, A012);
    }
}
