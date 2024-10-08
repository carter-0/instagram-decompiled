package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GLY implements C229372nH {
    public final ClipsViewerConfig A00;
    public final UserSession A01;
    public final GD6 A02;
    public final GCH A03;
    public final C52012GBj A04;

    public final void D3p(C267324bN r1, Integer num, int i) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r11.BU8() != true) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3q(X.C276114sa r11, java.util.List r12, boolean r13, boolean r14) {
        /*
            r10 = this;
            r7 = 0
            r4 = r12
            X.0qQ.A0B(r12, r7)
            if (r14 == 0) goto L_0x004d
            r6 = 1
            r5 = r13
            if (r13 == 0) goto L_0x0024
            X.GBj r2 = r10.A04
            int r1 = r2.A06()
            X.GD6 r3 = r10.A02
            if (r11 == 0) goto L_0x001c
            boolean r0 = r11.BU8()
            r8 = 1
            if (r0 == r6) goto L_0x001d
        L_0x001c:
            r8 = 0
        L_0x001d:
            r9 = r6
            r3.A0C(r4, r5, r6, r7, r8, r9)
            r2.A0H(r1)
        L_0x0024:
            com.instagram.clips.intf.ClipsViewerConfig r1 = r10.A00
            boolean r0 = r1.A1t
            if (r0 != 0) goto L_0x004d
            com.instagram.clips.intf.ClipsViewerSource r4 = r1.A0J
            com.instagram.common.session.UserSession r3 = r10.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325918562661757(0x810e3b0011357d, double:3.035995399536125E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0042
            boolean r0 = X.C51969G9p.A1W(r2, r3)
            if (r0 != 0) goto L_0x0042
            r6 = 0
        L_0x0042:
            boolean r0 = X.C52273GLp.A07(r4, r6)
            if (r0 == 0) goto L_0x004d
            X.GCH r0 = r10.A03
            r0.A02(r11)
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLY.D3q(X.4sa, java.util.List, boolean, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r7.BU8() != true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3v(X.C276114sa r7, java.util.List r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            if (r9 == 0) goto L_0x0051
            X.GBj r4 = r6.A04
            int r3 = r4.A06()
            X.GD6 r2 = r6.A02
            r5 = 1
            if (r7 == 0) goto L_0x0018
            boolean r0 = r7.BU8()
            r1 = 1
            if (r0 == r5) goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            X.GBg r0 = r2.A0A
            r0.A0W(r8)
            if (r1 == 0) goto L_0x0025
            X.0sn r0 = X.0sn.A00
            r2.A0B(r0, r5)
        L_0x0025:
            r4.A0H(r3)
            com.instagram.clips.intf.ClipsViewerConfig r1 = r6.A00
            boolean r0 = r1.A1t
            if (r0 != 0) goto L_0x0051
            com.instagram.clips.intf.ClipsViewerSource r4 = r1.A0J
            com.instagram.common.session.UserSession r3 = r6.A01
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325918562661757(0x810e3b0011357d, double:3.035995399536125E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0046
            boolean r0 = X.C51969G9p.A1W(r2, r3)
            if (r0 != 0) goto L_0x0046
            r5 = 0
        L_0x0046:
            boolean r0 = X.C52273GLp.A07(r4, r5)
            if (r0 == 0) goto L_0x0051
            X.GCH r0 = r6.A03
            r0.A02(r7)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GLY.D3v(X.4sa, java.util.List, boolean, boolean):void");
    }

    public GLY(ClipsViewerConfig clipsViewerConfig, UserSession userSession, GD6 gd6, GCH gch, C52012GBj gBj) {
        AnonymousClass7TG.A1O(userSession, clipsViewerConfig);
        0qQ.A0B(gch, 5);
        this.A01 = userSession;
        this.A00 = clipsViewerConfig;
        this.A04 = gBj;
        this.A02 = gd6;
        this.A03 = gch;
    }
}
