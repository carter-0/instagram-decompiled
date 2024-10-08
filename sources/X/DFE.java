package X;

import com.instagram.realtimeclient.RealtimeConstants;

public final class DFE implements AnonymousClass2Kv {
    public final /* synthetic */ C74551Pwk A00;

    public DFE(C74551Pwk pwk) {
        this.A00 = pwk;
    }

    public final void invoke(AnonymousClass3JD r7) {
        C250663lr A0U;
        C250663lr optionalTreeField;
        boolean z = true;
        if (r7 == null || (A0U = C41845B3m.A0U(r7)) == null || (optionalTreeField = A0U.getOptionalTreeField(0, "xig_creator_ai_toggle_ai_auto_replies(request:$request)", C42678Bgb.class, -893779321)) == null || !optionalTreeField.getCoercedBooleanField(0, RealtimeConstants.SEND_SUCCESS)) {
            z = false;
        }
        C74551Pwk pwk = this.A00;
        if (z) {
            pwk.DTM((C270214gN) null, (String) null);
        } else {
            pwk.DTM(C270214gN.A0T, (String) null);
        }
    }
}
