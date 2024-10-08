package X;

import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.google.common.collect.ImmutableList;
import java.util.Collections;

public final class S0E {
    public final /* synthetic */ STY A00;

    public S0E(STY sty) {
        this.A00 = sty;
    }

    public final void A00(C61066Jw4 jw4) {
        CardDetails cardDetails;
        String str;
        C61066Jw4 jw42 = jw4;
        if (jw42.A01) {
            CardDetails cardDetails2 = (CardDetails) jw42.A00;
            if (cardDetails2 != null) {
                STY sty = this.A00;
                sty.A0T.A00.A05.A01 = RUT.A00(cardDetails2);
                STY.A03(sty, cardDetails2);
            }
        } else if (jw42.A02 && (cardDetails = (CardDetails) jw42.A00) != null && (str = cardDetails.A08) != null) {
            STY.A04(this.A00, AnonymousClass7TE.A0u(), Collections.singletonList(new CardDetails((Address) null, (ImmutableList) null, (Boolean) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, str, (String) null, (String) null)));
        }
    }
}
