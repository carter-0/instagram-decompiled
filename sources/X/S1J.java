package X;

import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.Map;

public final class S1J {
    public final UserFlowLogger A00;
    public final Map A01 = AnonymousClass7TE.A1H();

    public S1J(UserFlowLogger userFlowLogger) {
        0qQ.A0B(userFlowLogger, 1);
        this.A00 = userFlowLogger;
    }

    public final void A00(String str, String str2) {
        Number A14 = C51966G9m.A14(str, this.A01);
        if (A14 != null) {
            this.A00.flowMarkPoint(A14.longValue(), str2);
        }
    }
}
