package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7K0  reason: invalid class name */
public final class AnonymousClass7K0 implements C329677Ju {
    public final UserSession A00;
    public final C329327Il A01;
    public final C62320sa A02;
    public final AnonymousClass7JU A03;

    public final boolean Cnn(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(str, 4);
        if (!z4) {
            UserSession userSession = this.A00;
            if ((!AnonymousClass7OG.A00(userSession) || !(!C66778McO.A00(userSession).A04().isEmpty()) || !AnonymousClass4k9.A00(userSession).A08()) && z && !z2 && z3) {
                C66777McN A002 = C66778McO.A00(userSession);
                11Z.A06("This operation must be run on UI thread.");
                if (A002.A02(str) != null) {
                    this.A01.FLI(AnonymousClass7JT.QUICK_REPLY_HIGHLIGHTED, new C73933PmD(this, 14), true);
                    return false;
                }
            }
            if (this.A03 == AnonymousClass7JU.OVERFLOW) {
                this.A01.FLI(AnonymousClass7JT.QUICK_REPLY, AnonymousClass7OH.A00, false);
            } else if (!z || z2 || z3) {
                this.A01.FLI(AnonymousClass7JT.QUICK_REPLY, C46122DNb.A00, false);
                return false;
            } else {
                this.A01.FLI(AnonymousClass7JT.QUICK_REPLY, new C377089Km(this, 43), true);
                return true;
            }
        }
        return false;
    }

    public AnonymousClass7K0(UserSession userSession, AnonymousClass7JU r2, C329327Il r3, C62320sa r4) {
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r2;
    }
}
