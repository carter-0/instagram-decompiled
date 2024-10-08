package X;

import com.instagram.common.session.UserSession;

public final class GG9 extends AnonymousClass0T0 {
    public final C238863Ds A00;
    public final C59543JNp A01;
    public final C267324bN A02;
    public final C52046GCs A03;
    public final Integer A04;
    public final boolean A05;
    public final boolean A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GG9) {
                GG9 gg9 = (GG9) obj;
                if (!0qQ.A0K(this.A02, gg9.A02) || !0qQ.A0K(this.A08, gg9.A08) || !0qQ.A0K(this.A07, gg9.A07) || this.A00 != gg9.A00 || !0qQ.A0K(this.A04, gg9.A04) || !0qQ.A0K(this.A01, gg9.A01) || this.A06 != gg9.A06 || this.A05 != gg9.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A08, AnonymousClass7TE.A0K(this.A02));
        return DbS.A06(this.A05, AnonymousClass7TF.A09(this.A06, (((((AnonymousClass7TF.A07(this.A07, A072) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public GG9(C238863Ds r2, C59543JNp jNp, C267324bN r4, UserSession userSession, AnonymousClass4DU r6, Integer num, boolean z, boolean z2) {
        this.A02 = r4;
        this.A08 = r6;
        this.A07 = userSession;
        this.A00 = r2;
        this.A04 = num;
        this.A01 = jNp;
        this.A06 = z;
        this.A05 = z2;
        this.A03 = new C52046GCs(userSession, r6);
    }
}
