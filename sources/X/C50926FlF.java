package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.FlF  reason: case insensitive filesystem */
public final class C50926FlF implements 0Js {
    public final /* bridge */ /* synthetic */ void ATN(UserSession userSession, 0Jv r11, Object obj) {
        F0S f0s = (F0S) obj;
        String str = AnonymousClass1CT.A00(userSession).A04;
        f0s.getClass();
        0K1 r2 = new 0K1(f0s.A02, r11);
        AnonymousClass4DH r1 = f0s.A00;
        if (r1.isVisible()) {
            1OC A00 = C49107EpW.A00(r1.requireContext(), f0s.A01, f0s.A03, f0s.A04, f0s.A05, str);
            A00.A00 = r2;
            r1.schedule(A00);
            return;
        }
        0wb.A03("SecondaryAccountCreationNonLinkingOperation", "IgFragment in SecondaryAccountCreationNonLinkingOperation cannot be null!");
    }
}
