package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLogger;

/* renamed from: X.VhM  reason: case insensitive filesystem */
public final class C17869VhM {
    public final long A00;
    public final UserFlowLogger A01;
    public final C66466MSu A02;
    public final C16580Uxa A03;

    public C17869VhM(UserFlowLogger userFlowLogger, C16580Uxa uxa, C66466MSu mSu, long j) {
        0qQ.A0B(mSu, 4);
        this.A00 = j;
        this.A01 = userFlowLogger;
        this.A03 = uxa;
        this.A02 = mSu;
    }

    public final void A00() {
        String str;
        UserFlowLogger userFlowLogger = this.A01;
        long j = this.A00;
        C16580Uxa uxa = this.A03;
        userFlowLogger.flowStart(j, new UserFlowConfig(uxa.toString(), true));
        if (1 - uxa.A00.intValue() != 0) {
            str = "BLOKS";
        } else {
            str = "NATIVE";
        }
        userFlowLogger.flowAnnotate(j, "framework_source", str);
    }
}
