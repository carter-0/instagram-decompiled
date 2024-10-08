package X;

/* renamed from: X.63j  reason: invalid class name and case insensitive filesystem */
public final class C3024563j {
    public final C3024463i A00;

    public final C71087ObS A00(C74377Pts pts, String str) {
        0qQ.A0B(str, 0);
        new C71087ObS();
        C3024463i r4 = this.A00;
        C71087ObS obS = new C71087ObS();
        Integer Aey = pts.Aey();
        int intValue = Aey.intValue();
        if (intValue == 1) {
            str = "DEVICE_SCOPE_KEY_0";
        } else if (intValue != 0) {
            throw new RuntimeException();
        }
        C3024463i.A01(r4, Aey, str).A04(new C71526OmN(obS, pts, r4, str));
        return obS;
    }

    public final C71087ObS A01(C74377Pts pts, String str) {
        0qQ.A0B(str, 0);
        new C71087ObS();
        C3024463i r4 = this.A00;
        C71087ObS obS = new C71087ObS();
        Integer Aey = pts.Aey();
        int intValue = Aey.intValue();
        if (intValue == 1) {
            str = "DEVICE_SCOPE_KEY_0";
        } else if (intValue != 0) {
            throw new RuntimeException();
        }
        C3024463i.A01(r4, Aey, str).A04(new C71527OmO(obS, pts, r4, str));
        return obS;
    }

    public C3024563j(C3024463i r1) {
        this.A00 = r1;
    }
}
