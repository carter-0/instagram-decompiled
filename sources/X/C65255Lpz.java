package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.Lpz  reason: case insensitive filesystem */
public final class C65255Lpz implements MSF {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C65255Lpz(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void DZP() {
        if (this.A00 != 0) {
            C61942KSr.A04((C295095nZ) this.A01, (C61942KSr) this.A02);
            return;
        }
        C60313JjG jjG = ((C65171Loa) this.A02).A09.A0D.A02;
        C295095nZ r2 = (C295095nZ) this.A01;
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession = jjG.A01;
        if (JTT.A0S(userSession) != null) {
            r2.A00 = true;
            AnonymousClass5w9.A00(userSession).A0A(r2);
        }
        C60313JjG.A01(jjG);
        C60313JjG.A00(jjG);
    }
}
