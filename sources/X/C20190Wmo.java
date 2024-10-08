package X;

/* renamed from: X.Wmo  reason: case insensitive filesystem */
public final class C20190Wmo implements Runnable {
    public final /* synthetic */ C15274UZc A00;
    public final /* synthetic */ C315476jx A01;

    public C20190Wmo(C15274UZc uZc, C315476jx r2) {
        this.A00 = uZc;
        this.A01 = r2;
    }

    public final void run() {
        C15274UZc uZc = this.A00;
        AnonymousClass5Gt r1 = new AnonymousClass5Gt(uZc.requireActivity(), this.A01);
        U5O u5o = uZc.A0D;
        if (u5o == null) {
            0qQ.A0F("multiDestinationRadioButton");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.A03(u5o);
        r1.A0B = true;
        r1.A01();
        DbU.A1T(r1);
    }
}
