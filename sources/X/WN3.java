package X;

import java.util.List;

public final class WN3 implements X39 {
    public final X8L A00 = new WNB();

    public final List FMs(X8K x8k, X8K x8k2) {
        Object obj;
        String BwS = x8k.BwS();
        String BwS2 = x8k2.BwS();
        char A1S = DbW.A1S(1, BwS, BwS2);
        String A002 = C16817V6y.A00(BwS);
        String A003 = C16817V6y.A00(BwS2);
        if ((!0qQ.A0K(A002, "primary") || !0qQ.A0K(A003, "secondary")) && (!0qQ.A0K(A002, "secondary") || !0qQ.A0K(A003, "primary"))) {
            obj = this.A00;
        } else {
            String BwS3 = x8k.BwS();
            0qQ.A0B(BwS3, A1S);
            char[] cArr = new char[1];
            cArr[A1S] = ':';
            Object obj2 = 00l.A0Q(BwS3, cArr, A1S).get(1);
            String BwS4 = x8k2.BwS();
            0qQ.A0B(BwS4, A1S);
            char[] cArr2 = new char[1];
            cArr2[A1S] = ':';
            obj = new WNC(0qQ.A0K(obj2, 00l.A0Q(BwS4, cArr2, A1S).get(1)));
        }
        return AnonymousClass7TE.A1I(obj);
    }
}
