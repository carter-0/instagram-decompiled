package X;

import com.facebookpay.logging.LoggingContext;
import java.util.Map;

/* renamed from: X.Iwz  reason: case insensitive filesystem */
public final class C58752Iwz extends 0Yg implements 0sP {
    public final long A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58752Iwz(C21267XRm xRm, LoggingContext loggingContext, Map map, long j) {
        super(1);
        this.A03 = loggingContext;
        this.A00 = j;
        this.A01 = xRm;
        this.A02 = map;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        1Ln r6 = (1Ln) obj;
        0bb r4 = new 0bb();
        LoggingContext loggingContext = (LoggingContext) this.A03;
        C51971G9r.A1B(r4, loggingContext);
        0bb r2 = new 0bb();
        r2.A05("credential_id", Long.valueOf(this.A00));
        C51975G9x.A19(r2, this.A01);
        G9t.A1L(r4, loggingContext, "credential_container", AnonymousClass7TE.A1I(r2));
        r4.A06("view_name", "checkout");
        r6.A0N(r4, "event_payload");
        C51969G9p.A1G(r6, this.A02);
        return r6;
    }
}
