package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public final class PAL implements C74405PuL {
    public final FragmentActivity A00;
    public final C376519Ih A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final C333517Zg A05;
    public final C332907Wx A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean isEnabled() {
        AnonymousClass7S7 C6l = this.A05.C6l();
        if (!C6l.CUO() || C6l.C6Q().A16) {
            return false;
        }
        return true;
    }

    public PAL(FragmentActivity fragmentActivity, C376519Ih r2, AnonymousClass0iw r3, UserSession userSession, Capabilities capabilities, C333517Zg r6, C332907Wx r7, boolean z, boolean z2) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A04 = capabilities;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A08 = z;
        this.A02 = r3;
        this.A07 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (r14.A07 == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005c, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36317298562372571L) != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006c, code lost:
        X.C70036NwE.A00(new X.PAH(r14.A00, r14.A02, r10, r14.A04, r12), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0028, code lost:
        if (X.182.A06(X.0Tu.A05, r10, 36324578531750053L) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0041, code lost:
        if (r5 == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
        X.C70036NwE.A00(new X.PAF(r10, r12, r14.A06), r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r14 = this;
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r10 = r14.A03
            X.7Zg r12 = r14.A05
            X.9Ih r8 = r14.A01
            boolean r5 = X.C48848ElA.A00(r8, r10, r12)
            if (r5 == 0) goto L_0x002a
            androidx.fragment.app.FragmentActivity r7 = r14.A00
            X.0iw r9 = r14.A02
            X.PAG r6 = new X.PAG
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            X.C70036NwE.A00(r6, r3)
            X.0Tu r4 = X.0Tu.A05
            r0 = 36324578531750053(0x810d03000030a5, double:3.035147958591692E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 == 0) goto L_0x0043
        L_0x002a:
            X.OdH r0 = new X.OdH
            r0.<init>(r8, r10, r12)
            X.Dri r0 = r0.A03()
            com.instagram.direct.capabilities.Capabilities r11 = r14.A04
            boolean r13 = r14.A08
            boolean r1 = X.FFK.A02(r10, r11, r0, r13)
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x005f
            if (r1 != 0) goto L_0x005f
        L_0x0041:
            if (r5 != 0) goto L_0x004d
        L_0x0043:
            X.7Wx r1 = r14.A06
            X.PAF r0 = new X.PAF
            r0.<init>(r10, r12, r1)
            X.C70036NwE.A00(r0, r3)
        L_0x004d:
            boolean r0 = r14.A07
            if (r0 == 0) goto L_0x006c
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317298562372571(0x810664000313db, double:3.0305440766432886E-306)
            boolean r0 = X.182.A06(r4, r10, r0)
            if (r0 != 0) goto L_0x006c
            return r3
        L_0x005f:
            androidx.fragment.app.FragmentActivity r7 = r14.A00
            X.0iw r9 = r14.A02
            X.FbE r6 = new X.FbE
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.C70036NwE.A00(r6, r3)
            goto L_0x0041
        L_0x006c:
            androidx.fragment.app.FragmentActivity r8 = r14.A00
            com.instagram.direct.capabilities.Capabilities r11 = r14.A04
            X.0iw r9 = r14.A02
            X.PAH r7 = new X.PAH
            r7.<init>(r8, r9, r10, r11, r12)
            X.C70036NwE.A00(r7, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAL.getItems():java.util.List");
    }
}
