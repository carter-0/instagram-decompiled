package X;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

/* renamed from: X.GJw  reason: case insensitive filesystem */
public final class C52231GJw implements C270674h7 {
    public C227232is A00;
    public final ClipsViewerConfig A01;
    public final UserSession A02;
    public final C228312lJ A03;
    public final GLR A04;
    public final GCH A05;
    public final boolean A06;

    public final void D3s() {
    }

    public final void D3t(C52228GJt gJt) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r8.A0G == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D3u(X.C52263GLe r8) {
        /*
            r7 = this;
            r4 = 0
            X.0qQ.A0B(r8, r4)
            com.instagram.common.session.UserSession r0 = r7.A02
            boolean r0 = X.1KU.A03(r0)
            if (r0 == 0) goto L_0x0010
            boolean r0 = r8.A0C
            if (r0 == 0) goto L_0x0077
        L_0x0010:
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x0019
            boolean r0 = r8.A0G
            r1 = 1
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            X.2is r5 = r7.A00
            if (r5 == 0) goto L_0x0077
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r5.A01
            if (r0 == 0) goto L_0x0025
            r0.setRefreshing(r4)
        L_0x0025:
            if (r1 == 0) goto L_0x0077
            X.GBE r0 = r5.A09
            if (r0 != 0) goto L_0x0035
            java.lang.String r6 = "clipsViewerFragmentViewModel"
        L_0x002d:
            X.0qQ.A0F(r6)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0035:
            X.HK9 r0 = r0.A0A
            if (r0 == 0) goto L_0x003b
            r0.A00 = r4
        L_0x003b:
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r5)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36323496200252611(0x810c0700042cc3, double:3.0344634877945106E-306)
            boolean r1 = X.182.A06(r3, r2, r0)
            java.lang.String r6 = "clipsViewerViewPager"
            X.GBj r0 = r5.A0N
            if (r1 == 0) goto L_0x0078
            if (r0 == 0) goto L_0x002d
            r0.A0H(r4)
        L_0x0055:
            com.instagram.common.session.UserSession r2 = X.C227232is.A01(r5)
            r0 = 36323496200121538(0x810c0700022cc2, double:3.0344634877116195E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x006d
            X.GCp r0 = r5.A0H
            if (r0 == 0) goto L_0x006d
            X.2js r0 = r0.A03
            r0.A02()
        L_0x006d:
            X.GBj r0 = r5.A0N
            if (r0 == 0) goto L_0x002d
            X.GBl r0 = r0.A04
            if (r0 == 0) goto L_0x0077
            r0.A01 = r4
        L_0x0077:
            return
        L_0x0078:
            if (r0 == 0) goto L_0x002d
            r0.A0I(r4, r4)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52231GJw.D3u(X.GLe):void");
    }

    public final void D3r(H3D h3d) {
        SwipeRefreshLayout swipeRefreshLayout;
        C227232is r0 = this.A00;
        if (r0 != null && (swipeRefreshLayout = r0.A01) != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
    }

    public C52231GJw(ClipsViewerConfig clipsViewerConfig, UserSession userSession, C228312lJ r3, GLR glr, GCH gch, boolean z) {
        this.A02 = userSession;
        this.A01 = clipsViewerConfig;
        this.A05 = gch;
        this.A04 = glr;
        this.A03 = r3;
        this.A06 = z;
    }
}
