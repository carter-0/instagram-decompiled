package X;

import java.util.List;

public final class KYX extends C54704HPj {
    public final String A00;
    public final List A01;

    public final C62575Ki8 A00() {
        C62575Ki8 ki8 = (C62575Ki8) 00k.A0J(this.A01);
        if (ki8 == null) {
            return C62575Ki8.A0V;
        }
        return ki8;
    }

    public KYX(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Unavailable(unavailableReasons=");
        A1A.append(this.A01);
        A1A.append(Pxd.A00(47));
        return C51975G9x.A0i(this.A00, A1A);
    }
}
