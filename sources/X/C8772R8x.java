package X;

import com.facebook.location.platform.api.Location;

@Deprecated
/* renamed from: X.R8x  reason: case insensitive filesystem */
public final class C8772R8x extends AnonymousClass1C8 {
    public SRB A00;

    public C8772R8x(SRB srb) {
        this.A00 = srb;
    }

    public final 2ZL A00(AnonymousClass1QX r6) {
        SRB.A00();
        2ZL A002 = RhX.A00(r6, this);
        int i = 0;
        while (true) {
            switch (A002.A02) {
                case 301:
                case 302:
                case 303:
                    int i2 = i + 1;
                    if (i >= 10) {
                        break;
                    } else {
                        1QS r2 = r6.A02;
                        1Fn A01 = A002.A01(Location.TAG);
                        if (A01 != null) {
                            AnonymousClass1QX r22 = new AnonymousClass1QX(C11410SSi.A01(A002.A00(), r2, A01), r6.A03);
                            r6.A01(new T6H(0, r22, this));
                            A002 = RhX.A00(r22, this);
                            i = i2;
                        } else {
                            throw JTO.A0u("Redirect required, but Location header missing from response");
                        }
                    }
            }
        }
        switch (A002.A02) {
            case 301:
            case 302:
            case 303:
                throw JTO.A0u(002.A0O("Reached redirect limit = ", 10));
            default:
                return A002;
        }
    }
}
