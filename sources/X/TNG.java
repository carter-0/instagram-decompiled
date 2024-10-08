package X;

import java.util.concurrent.Callable;

public final class TNG implements Callable {
    public final int A00;
    public final String A01;

    public TNG(String str, int i) {
        this.A00 = i;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        1QS A002;
        AnonymousClass1QT r1;
        String str;
        switch (this.A00) {
            case 0:
                return this.A01;
            case 1:
                String str2 = this.A01;
                1Pq A0S = Pxf.A0S();
                A0S.A01(AnonymousClass05K.A0N);
                A0S.A02(str2);
                A0S.A05 = false;
                A002 = A0S.A00();
                r1 = new AnonymousClass1QT();
                r1.A04 = 1CE.A08;
                r1.A03 = 1Fe.A02;
                r1.A07 = AnonymousClass05K.A01;
                str = "carrier_signal";
                break;
            default:
                String str3 = this.A01;
                1Pq A0S2 = Pxf.A0S();
                A0S2.A01(AnonymousClass05K.A0N);
                A0S2.A02(str3);
                A0S2.A05 = false;
                A002 = A0S2.A00();
                r1 = new AnonymousClass1QT();
                r1.A04 = 1CE.A08;
                r1.A03 = 1Fe.A02;
                r1.A07 = AnonymousClass05K.A01;
                str = "zbd_ping";
                break;
        }
        r1.A0A = str;
        return Pxf.A0R(A002, r1);
    }
}
