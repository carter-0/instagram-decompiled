package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectShareTargetLoggingInfo;

public final class N1H extends 0bb {
    public static N1H A00(DirectShareTarget directShareTarget, String str) {
        Double d;
        0bb r2 = new 0bb();
        r2.A06(TraceFieldType.RequestID, C71112Od3.A04(str));
        DirectShareTargetLoggingInfo directShareTargetLoggingInfo = directShareTarget.A08;
        if (!(directShareTargetLoggingInfo == null || (d = directShareTargetLoggingInfo.A01) == null)) {
            r2.A04("final_score", d);
        }
        return r2;
    }
}
