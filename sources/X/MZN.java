package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

public abstract class MZN {
    public static MZN A01;
    public long A00 = 0;

    /* JADX WARNING: type inference failed for: r0v4, types: [X.MZN, X.NA0] */
    public static MZN A00(UserFlowLogger userFlowLogger) {
        MZN mzn;
        MZN mzn2 = A01;
        MZN mzn3 = mzn2;
        if (mzn2 == null) {
            if (userFlowLogger != null) {
                ? mzn4 = new MZN();
                mzn4.A00 = userFlowLogger;
                mzn = mzn4;
            } else {
                mzn = new MZN();
            }
            A01 = mzn;
            mzn3 = mzn;
        }
        return mzn3;
    }

    public final void A01() {
        if (this instanceof NA0) {
            NA0 na0 = (NA0) this;
            na0.A00.flowEndSuccess(na0.A00);
            na0.A00 = 0;
        }
    }

    public final void A02() {
        if (this instanceof NA0) {
            NA0 na0 = (NA0) this;
            if (na0.A00 == 0) {
                UserFlowLogger userFlowLogger = na0.A00;
                long generateNewFlowId = userFlowLogger.generateNewFlowId(132191320);
                na0.A00 = generateNewFlowId;
                userFlowLogger.flowStartIfNotOngoing(generateNewFlowId, new UserFlowConfig("msys_bootstrap_pre_logger", false));
            }
        }
    }

    public final void A03(String str) {
        if (!(this instanceof NA1)) {
            NA0 na0 = (NA0) this;
            na0.A00.flowEndFail(na0.A00, str, (String) null);
            na0.A00 = 0;
        }
    }
}
