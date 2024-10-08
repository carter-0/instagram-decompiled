package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Map;

public final class TWO extends 0Yg implements 0sP {
    public final /* synthetic */ LoggingContext A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWO(LoggingContext loggingContext, String str, String str2, Map map, boolean z) {
        super(1);
        this.A00 = loggingContext;
        this.A02 = str;
        this.A04 = z;
        this.A01 = str2;
        this.A03 = map;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        1Ln r4 = (1Ln) obj;
        0bb r2 = new 0bb();
        C51971G9r.A1B(r2, this.A00);
        String str = this.A02;
        if (str == null) {
            str = "";
        }
        r2.A06("receiver_id", str);
        r2.A03("is_ecp_available", Boolean.valueOf(this.A04));
        Pxe.A1S(r2, "checkout_setup_mutation");
        String str2 = this.A01;
        if (str2 != null) {
            r2.A05("order_id", AnonymousClass7TE.A10(str2));
        }
        r4.A0N(r2, "event_payload");
        r4.A0x(this.A03);
        return r4;
    }
}
