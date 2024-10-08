package X;

import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.quicklog.reliability.UserFlowConfig;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.6an  reason: invalid class name and case insensitive filesystem */
public final class C310316an {
    public Map A00 = 0Yt.A0E();
    public final 1QP A01;

    public final void A00(C16538Uwi uwi) {
        0qQ.A0B(uwi, 0);
        Number number = (Number) this.A00.get(uwi);
        if (number != null) {
            this.A01.flowEndSuccess(number.longValue());
        }
        this.A00 = 0Yt.A09(uwi, this.A00);
    }

    public final void A01(C16538Uwi uwi, String str) {
        0qQ.A0B(uwi, 0);
        Number number = (Number) this.A00.get(uwi);
        if (number != null) {
            long longValue = number.longValue();
            1QP r3 = this.A01;
            if (str == null) {
                str = "Null error message";
            }
            r3.flowEndFail(longValue, str, (String) null);
        }
        this.A00 = 0Yt.A09(uwi, this.A00);
    }

    public final void A02(C16538Uwi uwi, String str, String str2, String str3) {
        Number number;
        0qQ.A0B(uwi, 0);
        0qQ.A0B(str2, 2);
        if (this.A00.containsKey(uwi) && (number = (Number) this.A00.get(uwi)) != null) {
            this.A01.flowEndCancel(number.longValue(), CancelReason.USER_CANCELLED);
        }
        1QP r5 = this.A01;
        long generateNewFlowId = r5.generateNewFlowId(uwi.A00);
        this.A00 = 0Yt.A0C(this.A00, new 0eP(uwi, Long.valueOf(generateNewFlowId)));
        r5.flowStart(generateNewFlowId, new UserFlowConfig(str, false));
        r5.flowAnnotate(generateNewFlowId, "event_type", str2);
        r5.flowAnnotate(generateNewFlowId, "adgroup_id", str3);
    }

    public C310316an(UserSession userSession) {
        this.A01 = AnonymousClass1QO.A00(userSession);
    }
}
