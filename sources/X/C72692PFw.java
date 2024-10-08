package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.PFw  reason: case insensitive filesystem */
public final class C72692PFw implements JO9 {
    public final Fragment A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;

    public C72692PFw(Fragment fragment, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4DU r5) {
        0qQ.A0B(r3, 4);
        this.A02 = userSession;
        this.A00 = fragment;
        this.A03 = r5;
        this.A01 = r3;
    }

    public final void Czm(C2609247o r11) {
        int i;
        0qQ.A0B(r11, 0);
        C2609047m AsV = r11.AsV();
        if (AsV != null) {
            i = AsV.AdN();
        } else {
            i = 1;
        }
        1as r1 = 1as.A04;
        UserSession userSession = this.A02;
        r1.A03(this.A00.requireActivity(), this.A01, userSession, r11.C6E(), r11.BIn(), (String) null, C273654mx.A00(653), i);
    }
}
