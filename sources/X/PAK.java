package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

public final class PAK implements C74405PuL {
    public final FragmentActivity A00;
    public final C376519Ih A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final C333517Zg A05;
    public final C332907Wx A06;

    public final boolean isEnabled() {
        AnonymousClass7S7 C6l = this.A05.C6l();
        if (!C6l.C6Q().A16 || C66580MXl.A05(C6l) != 29) {
            return false;
        }
        return true;
    }

    public PAK(FragmentActivity fragmentActivity, C376519Ih r2, AnonymousClass0iw r3, UserSession userSession, Capabilities capabilities, C333517Zg r6, C332907Wx r7) {
        this.A03 = userSession;
        this.A00 = fragmentActivity;
        this.A05 = r6;
        this.A06 = r7;
        this.A04 = capabilities;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r11 = this;
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            com.instagram.common.session.UserSession r9 = r11.A03
            X.7Zg r10 = r11.A05
            X.9Ih r7 = r11.A01
            boolean r0 = X.C48848ElA.A00(r7, r9, r10)
            if (r0 == 0) goto L_0x004d
            androidx.fragment.app.FragmentActivity r6 = r11.A00
            X.0iw r8 = r11.A02
            X.PAG r5 = new X.PAG
            r5.<init>(r6, r7, r8, r9, r10)
        L_0x0019:
            X.PuK r5 = (X.C74404PuK) r5
            X.C70036NwE.A00(r5, r3)
        L_0x001e:
            androidx.fragment.app.FragmentActivity r5 = r11.A00
            X.Na2 r0 = new X.Na2
            r0.<init>(r5, r9, r10)
            X.C70036NwE.A00(r0, r3)
            boolean r0 = X.C70034NwC.A00(r9, r10)
            if (r0 == 0) goto L_0x003f
            com.instagram.direct.capabilities.Capabilities r8 = r11.A04
            X.0iw r6 = r11.A02
            X.FbD r4 = new X.FbD
            r7 = r9
            r9 = r10
            r4.<init>(r5, r6, r7, r8, r9)
        L_0x0039:
            X.PuK r4 = (X.C74404PuK) r4
            X.C70036NwE.A00(r4, r3)
            return r3
        L_0x003f:
            X.7Wx r1 = r11.A06
            X.7SD r0 = X.C66581MXm.A0Z(r10)
            int r0 = r0.A08
            X.PAE r4 = new X.PAE
            r4.<init>(r10, r1, r0)
            goto L_0x0039
        L_0x004d:
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342158877553004149(0x2081051700130e75, double:4.06208258245137E-152)
            boolean r0 = X.182.A06(r2, r9, r0)
            if (r0 == 0) goto L_0x001e
            X.PAD r5 = new X.PAD
            r5.<init>(r10)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PAK.getItems():java.util.List");
    }
}
