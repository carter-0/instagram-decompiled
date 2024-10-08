package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class PAJ implements C74405PuL {
    public final FragmentActivity A00;
    public final C376519Ih A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final C333517Zg A04;
    public final C332907Wx A05;

    public final boolean isEnabled() {
        AnonymousClass7S7 C6l = this.A04.C6l();
        if (!C6l.C6Q().A16 || !AnonymousClass48O.A01(C66580MXl.A05(C6l))) {
            return false;
        }
        return true;
    }

    public PAJ(FragmentActivity fragmentActivity, C376519Ih r2, AnonymousClass0iw r3, UserSession userSession, C333517Zg r5, C332907Wx r6) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A04 = r5;
        this.A01 = r2;
        this.A05 = r6;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (X.AnonymousClass9HV.A00(r8).A00(X.C300965yF.A01(r1), 24) == false) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r10 = this;
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r8 = r10.A03
            X.7Zg r9 = r10.A04
            X.9Ih r6 = r10.A01
            boolean r0 = X.C48848ElA.A00(r6, r8, r9)
            if (r0 == 0) goto L_0x0069
            androidx.fragment.app.FragmentActivity r5 = r10.A00
            X.0iw r7 = r10.A02
            X.PAG r4 = new X.PAG
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0019:
            X.PuK r4 = (X.C74404PuK) r4
            X.C70036NwE.A00(r4, r3)
            X.7S7 r4 = r9.C6l()
            java.lang.String r0 = r8.A06
            boolean r0 = r4.COR(r0)
            if (r0 != 0) goto L_0x0050
            X.3t3 r1 = r4.CBU()
            if (r1 == 0) goto L_0x0046
            X.3t0 r0 = X.C300965yF.A02(r1)
            if (r0 == 0) goto L_0x0046
            X.3t0 r2 = X.C300965yF.A01(r1)
            X.9HW r1 = X.AnonymousClass9HV.A00(r8)
            r0 = 24
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0050
        L_0x0046:
            X.7Wx r1 = r10.A05
            X.PAF r0 = new X.PAF
            r0.<init>(r8, r9, r1)
            X.C70036NwE.A00(r0, r3)
        L_0x0050:
            androidx.fragment.app.FragmentActivity r1 = r10.A00
            X.Na3 r0 = new X.Na3
            r0.<init>(r1, r8, r9)
            X.C70036NwE.A00(r0, r3)
            X.7Wx r2 = r10.A05
            int r1 = X.C66580MXl.A05(r4)
            X.PAE r0 = new X.PAE
            r0.<init>(r9, r2, r1)
            X.C70036NwE.A00(r0, r3)
            return r3
        L_0x0069:
            X.PAD r4 = new X.PAD
            r4.<init>(r9)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAJ.getItems():java.util.List");
    }
}
