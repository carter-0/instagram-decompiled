package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.Lyx  reason: case insensitive filesystem */
public final class C65743Lyx implements C273414mX {
    public final /* synthetic */ C295095nZ A00;
    public final /* synthetic */ IgdsSwitch A01;
    public final /* synthetic */ C60058JeZ A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void Cyf() {
    }

    public C65743Lyx(C295095nZ r1, IgdsSwitch igdsSwitch, C60058JeZ jeZ, String str, String str2) {
        this.A02 = jeZ;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = igdsSwitch;
    }

    public final void Cyc() {
        C60058JeZ jeZ = this.A02;
        UserSession userSession = jeZ.A0J;
        C295095nZ r1 = this.A00;
        String obj = r1.A02.toString();
        String str = this.A03;
        String str2 = this.A04;
        C295105na.A02(userSession, "default_privacy_consent_bottomsheet_dismiss_click", obj, str, str2, r1.A01.toString(), false, C363558jv.A00(userSession), r1.A05);
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        if (AnonymousClass5w9.A02(r1) && !AnonymousClass5w9.A00(userSession).A0B()) {
            C60058JeZ.A03(r1, this.A01, jeZ);
            AnonymousClass5w9.A00(userSession).A07(AnonymousClass7TE.A0S(jeZ), str2);
        }
    }
}
