package X;

public final class S40 {
    public final C58840Ae A00;

    public final void A00(2M7 r3, C7548QIr qIr, String str) {
        0Aj A0d = C51969G9p.A0d(this.A00, "user_click_target_atomic");
        if (A0d.isSampled()) {
            JTU.A0t(Pxg.A0P(r3, A0d, Py7.A00(), str), A0d, qIr);
            A0d.Cgf();
        }
    }

    public final void A01(2M7 r3, C7550QIt qIt, String str) {
        0Aj A0d = C51969G9p.A0d(this.A00, "client_load_view_success");
        if (A0d.isSampled()) {
            JTU.A0t(Pxg.A0P(r3, A0d, Py7.A00(), str), A0d, qIt);
            A0d.Cgf();
        }
    }

    public S40(C58840Ae r1) {
        this.A00 = r1;
    }
}
