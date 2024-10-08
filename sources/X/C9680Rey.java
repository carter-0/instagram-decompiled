package X;

import com.fbpay.w3c.CardDetails;

/* renamed from: X.Rey  reason: case insensitive filesystem */
public abstract class C9680Rey {
    public static final void A00(CardDetails cardDetails) {
        int intValue;
        int length;
        Integer num = cardDetails.A04;
        if (num == null || num.intValue() < 2000) {
            throw AnonymousClass7TE.A0w("expiryYear is not defined");
        }
        Integer num2 = cardDetails.A03;
        if (num2 == null || 1 > (intValue = num2.intValue()) || intValue >= 13) {
            throw AnonymousClass7TE.A0w("expiryMonth is not defined");
        }
        String str = cardDetails.A09;
        if (str == null || 3 > (length = DbV.A12(str).length()) || length >= 5) {
            throw AnonymousClass7TE.A0w("csc is not defined");
        }
        String str2 = cardDetails.A07;
        if (str2 == null || 00l.A0W(str2)) {
            throw AnonymousClass7TE.A0w("pan is not defined");
        }
    }
}
