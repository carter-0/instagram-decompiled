package X;

public final class RA3 extends 0ng {
    public final /* synthetic */ C45311CuF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RA3(C45311CuF cuF) {
        super(1411825408, 3, false, false);
        this.A00 = cuF;
    }

    public final void run() {
        String str = this.A00.A01;
        if (str == null) {
            str = "null";
        }
        0wb.A04(002.A0R("push_event_test_", str), "Fake push blocking event fired", 1);
    }
}
