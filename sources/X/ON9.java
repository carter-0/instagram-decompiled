package X;

public final class ON9 {
    public final 0fA A00;

    public ON9(0fA r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final void A01(String str) {
        0qQ.A0B(str, 0);
        new OW1(this.A00, str, 659041254).A01();
    }

    public final void A00(String str) {
        0qQ.A0B(str, 0);
        OW1 ow1 = new OW1(this.A00, str, 659044095);
        ow1.A02("server_info_data", "");
        ow1.A01();
    }

    public final void A02(String str, Throwable th) {
        OW1 ow1 = new OW1(this.A00, str, 659044095);
        ow1.A00 = th;
        ow1.A01.ERJ(th);
        ow1.A02("server_info_data", "");
        ow1.A01();
    }
}
