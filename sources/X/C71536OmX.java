package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.OmX  reason: case insensitive filesystem */
public final class C71536OmX implements C74291PsJ {
    public final /* synthetic */ C69110Nep A00;

    public C71536OmX(C69110Nep nep) {
        this.A00 = nep;
    }

    public final void AP9() {
        C68294N9h n9h;
        C68294N9h n9h2;
        C69110Nep nep = this.A00;
        AnonymousClass0eM r3 = nep.A0S;
        if (((1Av) r3.getValue()).A01.getInt("rtc_floating_participant_tool_tip_shown_count", 0) < 1) {
            C68294N9h n9h3 = (C68294N9h) nep.A01;
            if (n9h3 != null) {
                n9h2 = C68294N9h.A00((C59721JVf) null, (N3V) null, n9h3, (List) null, (List) null, (Map) null, 98303, false, false, false, false, false, false, false, true, false);
            } else {
                n9h2 = null;
            }
            nep.A0J(n9h2);
            AnonymousClass7TG.A0g(((1Av) r3.getValue()).A01, "rtc_floating_participant_tool_tip_shown_count").apply();
            return;
        }
        nep.A0A.A05(POA.A00);
        C68294N9h n9h4 = (C68294N9h) nep.A01;
        if (n9h4 != null) {
            n9h = C68294N9h.A00((C59721JVf) null, (N3V) null, n9h4, (List) null, (List) null, (Map) null, 98303, false, false, false, false, false, false, false, false, false);
        } else {
            n9h = null;
        }
        nep.A0J(n9h);
    }
}
