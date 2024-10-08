package X;

import com.instagram.api.schemas.XFBTargetingAutomationAdvantageAudienceStatus;

public final class WYM implements C358618bC {
    public final /* synthetic */ C306146Ky A00;

    public WYM(C306146Ky r1) {
        this.A00 = r1;
    }

    public final boolean onToggle(boolean z) {
        XFBTargetingAutomationAdvantageAudienceStatus xFBTargetingAutomationAdvantageAudienceStatus;
        C306146Ky r2 = this.A00;
        C306146Ky.A00(r2).A0M(C306146Ky.A01(r2).A08(), z);
        U92 A01 = C306146Ky.A01(r2);
        if (z) {
            xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.ON;
        } else {
            xFBTargetingAutomationAdvantageAudienceStatus = XFBTargetingAutomationAdvantageAudienceStatus.OFF;
        }
        A01.A0C(xFBTargetingAutomationAdvantageAudienceStatus);
        return true;
    }
}
