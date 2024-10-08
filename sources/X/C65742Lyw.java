package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lyw  reason: case insensitive filesystem */
public final class C65742Lyw implements C273414mX {
    public final /* synthetic */ C65171Loa A00;
    public final /* synthetic */ C295095nZ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public final void Cyf() {
    }

    public C65742Lyw(C65171Loa loa, C295095nZ r2, String str, String str2) {
        this.A00 = loa;
        this.A01 = r2;
        this.A02 = str;
        this.A03 = str2;
    }

    public final void Cyc() {
        C65171Loa loa = this.A00;
        C60313JjG jjG = loa.A09.A0D.A02;
        C295095nZ r2 = this.A01;
        String str = this.A02;
        String str2 = this.A03;
        AnonymousClass4DH r0 = loa.A06;
        r0.requireActivity();
        Context requireContext = r0.requireContext();
        UserSession userSession = jjG.A01;
        C295105na.A02(userSession, "default_privacy_consent_bottomsheet_dismiss_click", r2.A02.toString(), str, str2, r2.A01.toString(), false, C363558jv.A00(userSession), r2.A05);
        AnonymousClass5w9 r02 = AnonymousClass5w8.A05;
        if (AnonymousClass5w9.A02(r2) && !AnonymousClass5w9.A00(userSession).A0B()) {
            if (JTT.A0S(userSession) != null) {
                r2.A00 = true;
                AnonymousClass5w9.A00(userSession).A0A(r2);
            }
            C60313JjG.A01(jjG);
            C60313JjG.A00(jjG);
            AnonymousClass5w9.A00(userSession).A07(requireContext, str2);
        }
    }
}
