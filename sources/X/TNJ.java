package X;

import java.util.concurrent.Callable;

public final class TNJ implements Callable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ String A01;

    public TNJ(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1Fc r3 = new 1Fc();
        r3.A05("security_origin", this.A00);
        1Pq A0S = Pxf.A0S();
        A0S.A02(this.A01);
        A0S.A01(AnonymousClass05K.A01);
        A0S.A00 = r3.A00(true);
        A0S.A05 = true;
        1QS A002 = A0S.A00();
        AnonymousClass1QT A0E = JTQ.A0E();
        A0E.A03 = 1Fe.A02;
        A0E.A0A = "MetaCheckoutScript";
        return Pxf.A0R(A002, A0E);
    }
}
