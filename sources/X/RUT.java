package X;

import com.fbpay.w3c.CardDetails;

public abstract class RUT {
    public static final C7607QOp A00(CardDetails cardDetails) {
        return new C7607QOp(cardDetails.A07, cardDetails.A09, String.valueOf(cardDetails.A03), String.valueOf(cardDetails.A04), (String) null, 0);
    }
}
